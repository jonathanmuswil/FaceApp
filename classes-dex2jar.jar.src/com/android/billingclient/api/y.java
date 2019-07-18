package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import ve;

class y
  extends g
{
  private int a = 0;
  private final String b;
  private final Handler c = new Handler(Looper.getMainLooper());
  private final e d;
  private final Context e;
  private final int f;
  private final int g;
  private IInAppBillingService h;
  private a i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private final boolean o;
  private ExecutorService p;
  private final ResultReceiver q = new o(this, this.c);
  
  y(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean, H paramH)
  {
    this(paramContext, paramInt1, paramInt2, paramBoolean, paramH, "2.0.1");
  }
  
  private y(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean, H paramH, String paramString)
  {
    this.e = paramContext.getApplicationContext();
    this.f = paramInt1;
    this.g = paramInt2;
    this.o = paramBoolean;
    this.d = new e(this.e, paramH);
    this.b = paramString;
  }
  
  private D a(D paramD)
  {
    this.d.b().a(paramD, null);
    return paramD;
  }
  
  private <T> Future<T> a(Callable<T> paramCallable, long paramLong, Runnable paramRunnable)
  {
    paramLong = (paramLong * 0.95D);
    if (this.p == null) {
      this.p = Executors.newFixedThreadPool(ve.a);
    }
    try
    {
      paramCallable = this.p.submit(paramCallable);
      this.c.postDelayed(new p(this, paramCallable, paramRunnable), paramLong);
      return paramCallable;
    }
    catch (Exception paramCallable)
    {
      paramRunnable = new StringBuilder();
      paramRunnable.append("Async task throws exception ");
      paramRunnable.append(paramCallable);
      ve.b("BillingClient", paramRunnable.toString());
    }
    return null;
  }
  
  private void a(Runnable paramRunnable)
  {
    if (Thread.interrupted()) {
      return;
    }
    this.c.post(paramRunnable);
  }
  
  private Bundle c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("vr", true);
    return localBundle;
  }
  
  private D c(String paramString)
  {
    paramString = a(new q(this, paramString), 5000L, null);
    try
    {
      if (((Integer)paramString.get(5000L, TimeUnit.MILLISECONDS)).intValue() == 0) {
        paramString = E.o;
      } else {
        paramString = E.h;
      }
      return paramString;
    }
    catch (Exception paramString)
    {
      ve.b("BillingClient", "Exception while checking if billing is supported; try to reconnect");
    }
    return E.p;
  }
  
  private D d()
  {
    int i1 = this.a;
    D localD;
    if ((i1 != 0) && (i1 != 3)) {
      localD = E.k;
    } else {
      localD = E.p;
    }
    return localD;
  }
  
  private F.a d(String paramString)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Querying owned items, item type: ");
    ((StringBuilder)localObject1).append(paramString);
    ve.a("BillingClient", ((StringBuilder)localObject1).toString());
    ArrayList localArrayList1 = new ArrayList();
    Bundle localBundle = ve.b(this.n, this.o, this.b);
    localObject1 = null;
    try
    {
      Object localObject3;
      do
      {
        if (this.n) {
          localObject1 = this.h.b(9, this.e.getPackageName(), paramString, (String)localObject1, localBundle);
        } else {
          localObject1 = this.h.a(3, this.e.getPackageName(), paramString, (String)localObject1);
        }
        localObject3 = G.a((Bundle)localObject1, "BillingClient", "getPurchase()");
        if (localObject3 != E.o) {
          return new F.a((D)localObject3, null);
        }
        localObject3 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList localArrayList2 = ((Bundle)localObject1).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList localArrayList3 = ((Bundle)localObject1).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        int i1 = 0;
        while (i1 < localArrayList2.size())
        {
          String str1 = (String)localArrayList2.get(i1);
          String str2 = (String)localArrayList3.get(i1);
          String str3 = (String)((ArrayList)localObject3).get(i1);
          Object localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("Sku is owned: ");
          ((StringBuilder)localObject4).append(str3);
          ve.a("BillingClient", ((StringBuilder)localObject4).toString());
          try
          {
            localObject4 = new F(str1, str2);
            if (TextUtils.isEmpty(((F)localObject4).d())) {
              ve.b("BillingClient", "BUG: empty/null token!");
            }
            localArrayList1.add(localObject4);
            i1++;
          }
          catch (JSONException localJSONException)
          {
            paramString = new StringBuilder();
            paramString.append("Got an exception trying to decode the purchase: ");
            paramString.append(localJSONException);
            ve.b("BillingClient", paramString.toString());
            return new F.a(E.k, null);
          }
        }
        localObject3 = localJSONException.getString("INAPP_CONTINUATION_TOKEN");
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Continuation token: ");
        ((StringBuilder)localObject2).append((String)localObject3);
        ve.a("BillingClient", ((StringBuilder)localObject2).toString());
        localObject2 = localObject3;
      } while (!TextUtils.isEmpty((CharSequence)localObject3));
      return new F.a(E.o, localArrayList1);
    }
    catch (Exception localException)
    {
      paramString = new StringBuilder();
      paramString.append("Got exception trying to get purchases: ");
      paramString.append(localException);
      paramString.append("; try to reconnect");
      ve.b("BillingClient", paramString.toString());
    }
    return new F.a(E.p, null);
  }
  
  public D a(Activity paramActivity, B paramB)
  {
    if (!b())
    {
      paramActivity = E.p;
      a(paramActivity);
      return paramActivity;
    }
    String str1 = paramB.g();
    String str2 = paramB.e();
    Object localObject1 = paramB.f();
    int i1 = 1;
    int i2;
    if ((localObject1 != null) && (((I)localObject1).f())) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (str2 == null)
    {
      ve.b("BillingClient", "Please fix the input params. SKU can't be null.");
      paramActivity = E.m;
      a(paramActivity);
      return paramActivity;
    }
    if (str1 == null)
    {
      ve.b("BillingClient", "Please fix the input params. SkuType can't be null.");
      paramActivity = E.n;
      a(paramActivity);
      return paramActivity;
    }
    if ((str1.equals("subs")) && (!this.j))
    {
      ve.b("BillingClient", "Current client doesn't support subscriptions.");
      paramActivity = E.r;
      a(paramActivity);
      return paramActivity;
    }
    if (paramB.c() == null) {
      i1 = 0;
    }
    if ((i1 != 0) && (!this.k))
    {
      ve.b("BillingClient", "Current client doesn't support subscriptions update.");
      paramActivity = E.s;
      a(paramActivity);
      return paramActivity;
    }
    if ((paramB.i()) && (!this.l))
    {
      ve.b("BillingClient", "Current client doesn't support extra params for buy intent.");
      paramActivity = E.g;
      a(paramActivity);
      return paramActivity;
    }
    if ((i2 != 0) && (!this.l))
    {
      ve.b("BillingClient", "Current client doesn't support extra params for buy intent.");
      paramActivity = E.g;
      a(paramActivity);
      return paramActivity;
    }
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Constructing buy intent for ");
    ((StringBuilder)localObject2).append(str2);
    ((StringBuilder)localObject2).append(", item type: ");
    ((StringBuilder)localObject2).append(str1);
    ve.a("BillingClient", ((StringBuilder)localObject2).toString());
    if (this.l)
    {
      localObject2 = ve.a(paramB, this.n, this.o, this.b);
      if (!((I)localObject1).d().isEmpty()) {
        ((Bundle)localObject2).putString("skuDetailsToken", ((I)localObject1).d());
      }
      if (i2 != 0)
      {
        ((Bundle)localObject2).putString("rewardToken", ((I)localObject1).g());
        i2 = this.f;
        if (i2 != 0) {
          ((Bundle)localObject2).putInt("childDirected", i2);
        }
        i2 = this.g;
        if (i2 != 0) {
          ((Bundle)localObject2).putInt("underAgeOfConsent", i2);
        }
      }
      if (this.n) {
        i2 = 9;
      } else if (paramB.h()) {
        i2 = 7;
      } else {
        i2 = 6;
      }
      paramB = a(new r(this, i2, str2, str1, (Bundle)localObject2), 5000L, null);
    }
    else if (i1 != 0)
    {
      paramB = a(new s(this, paramB, str2), 5000L, null);
    }
    else
    {
      paramB = a(new t(this, str2, str1), 5000L, null);
    }
    try
    {
      localObject1 = (Bundle)paramB.get(5000L, TimeUnit.MILLISECONDS);
      i2 = ve.b((Bundle)localObject1, "BillingClient");
      paramB = ve.a((Bundle)localObject1, "BillingClient");
      if (i2 != 0)
      {
        paramActivity = new java/lang/StringBuilder;
        paramActivity.<init>();
        paramActivity.append("Unable to buy item, Error response code: ");
        paramActivity.append(i2);
        ve.b("BillingClient", paramActivity.toString());
        paramActivity = D.c();
        paramActivity.a(i2);
        paramActivity.a(paramB);
        paramActivity = paramActivity.a();
        a(paramActivity);
        return paramActivity;
      }
      paramB = new android/content/Intent;
      paramB.<init>(paramActivity, ProxyBillingActivity.class);
      paramB.putExtra("result_receiver", this.q);
      paramB.putExtra("BUY_INTENT", (PendingIntent)((Bundle)localObject1).getParcelable("BUY_INTENT"));
      paramActivity.startActivity(paramB);
      return E.o;
    }
    catch (Exception paramActivity)
    {
      paramActivity = new StringBuilder();
      paramActivity.append("Exception while launching billing flow: ; for sku: ");
      paramActivity.append(str2);
      paramActivity.append("; try to reconnect");
      ve.b("BillingClient", paramActivity.toString());
      paramActivity = E.p;
      a(paramActivity);
      return paramActivity;
    }
    catch (TimeoutException|CancellationException paramActivity)
    {
      paramActivity = new StringBuilder();
      paramActivity.append("Time out while launching billing flow: ; for sku: ");
      paramActivity.append(str2);
      paramActivity.append("; try to reconnect");
      ve.b("BillingClient", paramActivity.toString());
      paramActivity = E.q;
      a(paramActivity);
    }
    return paramActivity;
  }
  
  public D a(String paramString)
  {
    if (!b()) {
      return E.p;
    }
    int i1 = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 1987365622: 
      if (paramString.equals("subscriptions")) {
        i1 = 0;
      }
      break;
    case 1219490065: 
      if (paramString.equals("subscriptionsOnVr")) {
        i1 = 3;
      }
      break;
    case 292218239: 
      if (paramString.equals("inAppItemsOnVr")) {
        i1 = 2;
      }
      break;
    case 207616302: 
      if (paramString.equals("priceChangeConfirmation")) {
        i1 = 4;
      }
      break;
    case -422092961: 
      if (paramString.equals("subscriptionsUpdate")) {
        i1 = 1;
      }
      break;
    }
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 4)
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unsupported feature: ");
              localStringBuilder.append(paramString);
              ve.b("BillingClient", localStringBuilder.toString());
              return E.t;
            }
            if (this.m) {
              paramString = E.o;
            } else {
              paramString = E.h;
            }
            return paramString;
          }
          return c("subs");
        }
        return c("inapp");
      }
      if (this.k) {
        paramString = E.o;
      } else {
        paramString = E.h;
      }
      return paramString;
    }
    if (this.j) {
      paramString = E.o;
    } else {
      paramString = E.h;
    }
    return paramString;
  }
  
  I.a a(String paramString, List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = paramList.size();
    int i2 = 0;
    while (i2 < i1)
    {
      int i3 = i2 + 20;
      int i4;
      if (i3 > i1) {
        i4 = i1;
      } else {
        i4 = i3;
      }
      Object localObject1 = new ArrayList(paramList.subList(i2, i4));
      Object localObject2 = new Bundle();
      ((Bundle)localObject2).putStringArrayList("ITEM_ID_LIST", (ArrayList)localObject1);
      ((Bundle)localObject2).putString("playBillingLibraryVersion", this.b);
      try
      {
        if (this.n) {
          localObject2 = this.h.a(9, this.e.getPackageName(), paramString, (Bundle)localObject2, ve.a(this.n, this.o, this.b));
        } else {
          localObject2 = this.h.getSkuDetails(3, this.e.getPackageName(), paramString, (Bundle)localObject2);
        }
        if (localObject2 == null)
        {
          ve.b("BillingClient", "querySkuDetailsAsync got null sku details list");
          return new I.a(4, "Null sku details list", null);
        }
        if (!((Bundle)localObject2).containsKey("DETAILS_LIST"))
        {
          i3 = ve.b((Bundle)localObject2, "BillingClient");
          paramList = ve.a((Bundle)localObject2, "BillingClient");
          if (i3 != 0)
          {
            paramString = new StringBuilder();
            paramString.append("getSkuDetails() failed. Response code: ");
            paramString.append(i3);
            ve.b("BillingClient", paramString.toString());
            return new I.a(i3, paramList, localArrayList);
          }
          ve.b("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
          return new I.a(6, paramList, localArrayList);
        }
        localObject2 = ((Bundle)localObject2).getStringArrayList("DETAILS_LIST");
        if (localObject2 == null)
        {
          ve.b("BillingClient", "querySkuDetailsAsync got null response list");
          return new I.a(4, "querySkuDetailsAsync got null response list", null);
        }
        i2 = 0;
        while (i2 < ((ArrayList)localObject2).size())
        {
          localObject1 = (String)((ArrayList)localObject2).get(i2);
          try
          {
            localObject1 = new I((String)localObject1);
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Got sku details: ");
            localStringBuilder.append(localObject1);
            ve.a("BillingClient", localStringBuilder.toString());
            localArrayList.add(localObject1);
            i2++;
          }
          catch (JSONException paramString)
          {
            ve.b("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
            return new I.a(6, "Error trying to decode SkuDetails.", null);
          }
        }
        i2 = i3;
      }
      catch (Exception paramString)
      {
        paramList = new StringBuilder();
        paramList.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
        paramList.append(paramString);
        ve.b("BillingClient", paramList.toString());
        return new I.a(-1, "Service connection is disconnected.", null);
      }
    }
    return new I.a(0, "", localArrayList);
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 119	com/android/billingclient/api/y:d	Lcom/android/billingclient/api/e;
    //   4: invokevirtual 600	com/android/billingclient/api/e:a	()V
    //   7: aload_0
    //   8: getfield 602	com/android/billingclient/api/y:i	Lcom/android/billingclient/api/y$a;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 602	com/android/billingclient/api/y:i	Lcom/android/billingclient/api/y$a;
    //   18: invokevirtual 603	com/android/billingclient/api/y$a:a	()V
    //   21: aload_0
    //   22: getfield 602	com/android/billingclient/api/y:i	Lcom/android/billingclient/api/y$a;
    //   25: ifnull +34 -> 59
    //   28: aload_0
    //   29: getfield 139	com/android/billingclient/api/y:h	Lcom/android/vending/billing/IInAppBillingService;
    //   32: ifnull +27 -> 59
    //   35: ldc -71
    //   37: ldc_w 605
    //   40: invokestatic 274	ve:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: aload_0
    //   44: getfield 106	com/android/billingclient/api/y:e	Landroid/content/Context;
    //   47: aload_0
    //   48: getfield 602	com/android/billingclient/api/y:i	Lcom/android/billingclient/api/y$a;
    //   51: invokevirtual 609	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   54: aload_0
    //   55: aconst_null
    //   56: putfield 602	com/android/billingclient/api/y:i	Lcom/android/billingclient/api/y$a;
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 139	com/android/billingclient/api/y:h	Lcom/android/vending/billing/IInAppBillingService;
    //   64: aload_0
    //   65: getfield 149	com/android/billingclient/api/y:p	Ljava/util/concurrent/ExecutorService;
    //   68: ifnull +18 -> 86
    //   71: aload_0
    //   72: getfield 149	com/android/billingclient/api/y:p	Ljava/util/concurrent/ExecutorService;
    //   75: invokeinterface 613 1 0
    //   80: pop
    //   81: aload_0
    //   82: aconst_null
    //   83: putfield 149	com/android/billingclient/api/y:p	Ljava/util/concurrent/ExecutorService;
    //   86: aload_0
    //   87: iconst_3
    //   88: putfield 80	com/android/billingclient/api/y:a	I
    //   91: goto +42 -> 133
    //   94: astore_1
    //   95: goto +39 -> 134
    //   98: astore_1
    //   99: new 173	java/lang/StringBuilder
    //   102: astore_2
    //   103: aload_2
    //   104: invokespecial 174	java/lang/StringBuilder:<init>	()V
    //   107: aload_2
    //   108: ldc_w 615
    //   111: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: pop
    //   115: aload_2
    //   116: aload_1
    //   117: invokevirtual 183	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: ldc -71
    //   123: aload_2
    //   124: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokestatic 192	ve:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: goto -44 -> 86
    //   133: return
    //   134: aload_0
    //   135: iconst_3
    //   136: putfield 80	com/android/billingclient/api/y:a	I
    //   139: aload_1
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	y
    //   94	1	1	localObject	Object
    //   98	42	1	localException	Exception
    //   102	22	2	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	21	94	finally
    //   21	59	94	finally
    //   59	86	94	finally
    //   99	130	94	finally
    //   0	21	98	java/lang/Exception
    //   21	59	98	java/lang/Exception
    //   59	86	98	java/lang/Exception
  }
  
  public void a(K paramK, L paramL)
  {
    if (!b())
    {
      paramL.a(E.p, null);
      return;
    }
    String str = paramK.a();
    paramK = paramK.b();
    if (TextUtils.isEmpty(str))
    {
      ve.b("BillingClient", "Please fix the input params. SKU type can't be empty.");
      paramL.a(E.f, null);
      return;
    }
    if (paramK == null)
    {
      ve.b("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
      paramL.a(E.e, null);
      return;
    }
    if (a(new i(this, str, paramK, paramL), 30000L, new j(this, paramL)) == null) {
      paramL.a(d(), null);
    }
  }
  
  public void a(b paramb, c paramc)
  {
    if (!b())
    {
      paramc.a(E.p);
      return;
    }
    if (TextUtils.isEmpty(paramb.b()))
    {
      ve.b("BillingClient", "Please provide a valid purchase token.");
      paramc.a(E.j);
      return;
    }
    if (!this.n)
    {
      paramc.a(E.b);
      return;
    }
    if (a(new m(this, paramb, paramc), 30000L, new n(this, paramc)) == null) {
      paramc.a(d());
    }
  }
  
  public void a(z paramz)
  {
    if (b())
    {
      ve.a("BillingClient", "Service connection is valid. No need to re-initialize.");
      paramz.a(E.o);
      return;
    }
    int i1 = this.a;
    if (i1 == 1)
    {
      ve.b("BillingClient", "Client is already in the process of connecting to billing service.");
      paramz.a(E.d);
      return;
    }
    if (i1 == 3)
    {
      ve.b("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
      paramz.a(E.p);
      return;
    }
    this.a = 1;
    this.d.c();
    ve.a("BillingClient", "Starting in-app billing setup.");
    this.i = new a(paramz, null);
    Intent localIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    localIntent.setPackage("com.android.vending");
    Object localObject1 = this.e.getPackageManager().queryIntentServices(localIntent, 0);
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      Object localObject2 = (ResolveInfo)((List)localObject1).get(0);
      localObject1 = ((ResolveInfo)localObject2).serviceInfo;
      if (localObject1 != null)
      {
        localObject1 = ((ServiceInfo)localObject1).packageName;
        localObject2 = ((ResolveInfo)localObject2).serviceInfo.name;
        if (("com.android.vending".equals(localObject1)) && (localObject2 != null))
        {
          localObject1 = new ComponentName((String)localObject1, (String)localObject2);
          localIntent = new Intent(localIntent);
          localIntent.setComponent((ComponentName)localObject1);
          localIntent.putExtra("playBillingLibraryVersion", this.b);
          if (this.e.bindService(localIntent, this.i, 1))
          {
            ve.a("BillingClient", "Service was bonded successfully.");
            return;
          }
          ve.b("BillingClient", "Connection to Billing service is blocked.");
        }
        else
        {
          ve.b("BillingClient", "The device doesn't have valid Play Store.");
        }
      }
    }
    this.a = 0;
    ve.a("BillingClient", "Billing service unavailable on device.");
    paramz.a(E.c);
  }
  
  public F.a b(String paramString)
  {
    if (!b()) {
      return new F.a(E.p, null);
    }
    if (TextUtils.isEmpty(paramString))
    {
      ve.b("BillingClient", "Please provide a valid SKU type.");
      return new F.a(E.f, null);
    }
    paramString = a(new u(this, paramString), 5000L, null);
    try
    {
      paramString = (F.a)paramString.get(5000L, TimeUnit.MILLISECONDS);
      return paramString;
    }
    catch (Exception paramString)
    {
      return new F.a(E.k, null);
    }
    catch (TimeoutException|CancellationException paramString) {}
    return new F.a(E.q, null);
  }
  
  public boolean b()
  {
    boolean bool;
    if ((this.a == 2) && (this.h != null) && (this.i != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private final class a
    implements ServiceConnection
  {
    private final Object a = new Object();
    private boolean b = false;
    private z c;
    
    private a(z paramz)
    {
      this.c = paramz;
    }
    
    private void a(D paramD)
    {
      y.a(y.this, new v(this, paramD));
    }
    
    void a()
    {
      synchronized (this.a)
      {
        this.c = null;
        this.b = true;
        return;
      }
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      ve.a("BillingClient", "Billing service connected.");
      y.a(y.this, IInAppBillingService.a.a(paramIBinder));
      if (y.a(y.this, new w(this), 30000L, new x(this)) == null) {
        a(y.e(y.this));
      }
    }
    
    public void onServiceDisconnected(ComponentName arg1)
    {
      ve.b("BillingClient", "Billing service disconnected.");
      y.a(y.this, null);
      y.a(y.this, 0);
      synchronized (this.a)
      {
        if (this.c != null) {
          this.c.a();
        }
        return;
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */