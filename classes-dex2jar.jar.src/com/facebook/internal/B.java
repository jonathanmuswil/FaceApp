package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.FacebookSdk;
import com.facebook.p;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public class b
{
  private static final String a = "com.facebook.internal.b";
  private static b b;
  private String c;
  private String d;
  private String e;
  private boolean f;
  private long g;
  
  /* Error */
  public static b a(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 37	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   3: invokestatic 40	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   6: if_acmpne +12 -> 18
    //   9: getstatic 42	com/facebook/internal/b:a	Ljava/lang/String;
    //   12: ldc 44
    //   14: invokestatic 49	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   17: pop
    //   18: getstatic 51	com/facebook/internal/b:b	Lcom/facebook/internal/b;
    //   21: ifnull +26 -> 47
    //   24: invokestatic 57	java/lang/System:currentTimeMillis	()J
    //   27: lstore_1
    //   28: getstatic 51	com/facebook/internal/b:b	Lcom/facebook/internal/b;
    //   31: astore_3
    //   32: lload_1
    //   33: aload_3
    //   34: getfield 59	com/facebook/internal/b:g	J
    //   37: lsub
    //   38: ldc2_w 60
    //   41: lcmp
    //   42: ifge +5 -> 47
    //   45: aload_3
    //   46: areturn
    //   47: aload_0
    //   48: invokestatic 63	com/facebook/internal/b:b	(Landroid/content/Context;)Lcom/facebook/internal/b;
    //   51: astore 4
    //   53: aconst_null
    //   54: astore 5
    //   56: aload_0
    //   57: invokevirtual 69	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   60: ldc 71
    //   62: iconst_0
    //   63: invokevirtual 77	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   66: ifnull +12 -> 78
    //   69: ldc 79
    //   71: invokestatic 85	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   74: astore_3
    //   75: goto +27 -> 102
    //   78: aload_0
    //   79: invokevirtual 69	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   82: ldc 87
    //   84: iconst_0
    //   85: invokevirtual 77	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   88: ifnull +12 -> 100
    //   91: ldc 89
    //   93: invokestatic 85	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   96: astore_3
    //   97: goto -22 -> 75
    //   100: aconst_null
    //   101: astore_3
    //   102: aload_0
    //   103: invokestatic 92	com/facebook/internal/b:e	(Landroid/content/Context;)Ljava/lang/String;
    //   106: astore 6
    //   108: aload 6
    //   110: ifnull +10 -> 120
    //   113: aload 4
    //   115: aload 6
    //   117: putfield 94	com/facebook/internal/b:e	Ljava/lang/String;
    //   120: aload_3
    //   121: ifnonnull +12 -> 133
    //   124: aload 4
    //   126: invokestatic 97	com/facebook/internal/b:a	(Lcom/facebook/internal/b;)Lcom/facebook/internal/b;
    //   129: pop
    //   130: aload 4
    //   132: areturn
    //   133: aload_0
    //   134: invokevirtual 101	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   137: aload_3
    //   138: iconst_3
    //   139: anewarray 103	java/lang/String
    //   142: dup
    //   143: iconst_0
    //   144: ldc 105
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: ldc 107
    //   151: aastore
    //   152: dup
    //   153: iconst_2
    //   154: ldc 109
    //   156: aastore
    //   157: aconst_null
    //   158: aconst_null
    //   159: aconst_null
    //   160: invokevirtual 115	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   163: astore_0
    //   164: aload_0
    //   165: ifnull +124 -> 289
    //   168: aload_0
    //   169: invokeinterface 121 1 0
    //   174: ifne +6 -> 180
    //   177: goto +112 -> 289
    //   180: aload_0
    //   181: ldc 105
    //   183: invokeinterface 125 2 0
    //   188: istore 7
    //   190: aload_0
    //   191: ldc 107
    //   193: invokeinterface 125 2 0
    //   198: istore 8
    //   200: aload_0
    //   201: ldc 109
    //   203: invokeinterface 125 2 0
    //   208: istore 9
    //   210: aload 4
    //   212: aload_0
    //   213: iload 7
    //   215: invokeinterface 129 2 0
    //   220: putfield 131	com/facebook/internal/b:c	Ljava/lang/String;
    //   223: iload 8
    //   225: ifle +45 -> 270
    //   228: iload 9
    //   230: ifle +40 -> 270
    //   233: aload 4
    //   235: invokevirtual 134	com/facebook/internal/b:a	()Ljava/lang/String;
    //   238: ifnonnull +32 -> 270
    //   241: aload 4
    //   243: aload_0
    //   244: iload 8
    //   246: invokeinterface 129 2 0
    //   251: putfield 136	com/facebook/internal/b:d	Ljava/lang/String;
    //   254: aload 4
    //   256: aload_0
    //   257: iload 9
    //   259: invokeinterface 129 2 0
    //   264: invokestatic 142	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   267: putfield 144	com/facebook/internal/b:f	Z
    //   270: aload_0
    //   271: ifnull +9 -> 280
    //   274: aload_0
    //   275: invokeinterface 147 1 0
    //   280: aload 4
    //   282: invokestatic 97	com/facebook/internal/b:a	(Lcom/facebook/internal/b;)Lcom/facebook/internal/b;
    //   285: pop
    //   286: aload 4
    //   288: areturn
    //   289: aload 4
    //   291: invokestatic 97	com/facebook/internal/b:a	(Lcom/facebook/internal/b;)Lcom/facebook/internal/b;
    //   294: pop
    //   295: aload_0
    //   296: ifnull +9 -> 305
    //   299: aload_0
    //   300: invokeinterface 147 1 0
    //   305: aload 4
    //   307: areturn
    //   308: astore_3
    //   309: goto +73 -> 382
    //   312: astore_3
    //   313: goto +13 -> 326
    //   316: astore_3
    //   317: aload 5
    //   319: astore_0
    //   320: goto +62 -> 382
    //   323: astore_3
    //   324: aconst_null
    //   325: astore_0
    //   326: getstatic 42	com/facebook/internal/b:a	Ljava/lang/String;
    //   329: astore 5
    //   331: new 149	java/lang/StringBuilder
    //   334: astore 4
    //   336: aload 4
    //   338: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   341: aload 4
    //   343: ldc -104
    //   345: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: aload 4
    //   351: aload_3
    //   352: invokevirtual 159	java/lang/Exception:toString	()Ljava/lang/String;
    //   355: invokevirtual 156	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   358: pop
    //   359: aload 5
    //   361: aload 4
    //   363: invokevirtual 160	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: invokestatic 165	com/facebook/internal/S:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   369: aload_0
    //   370: ifnull +9 -> 379
    //   373: aload_0
    //   374: invokeinterface 147 1 0
    //   379: aconst_null
    //   380: areturn
    //   381: astore_3
    //   382: aload_0
    //   383: ifnull +9 -> 392
    //   386: aload_0
    //   387: invokeinterface 147 1 0
    //   392: aload_3
    //   393: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	394	0	paramContext	Context
    //   27	6	1	l	long
    //   31	107	3	localObject1	Object
    //   308	1	3	localObject2	Object
    //   312	1	3	localException1	Exception
    //   316	1	3	localObject3	Object
    //   323	29	3	localException2	Exception
    //   381	12	3	localObject4	Object
    //   51	311	4	localObject5	Object
    //   54	306	5	str1	String
    //   106	10	6	str2	String
    //   188	26	7	i	int
    //   198	47	8	j	int
    //   208	50	9	k	int
    // Exception table:
    //   from	to	target	type
    //   168	177	308	finally
    //   180	223	308	finally
    //   233	270	308	finally
    //   289	295	308	finally
    //   168	177	312	java/lang/Exception
    //   180	223	312	java/lang/Exception
    //   233	270	312	java/lang/Exception
    //   289	295	312	java/lang/Exception
    //   56	75	316	finally
    //   78	97	316	finally
    //   102	108	316	finally
    //   113	120	316	finally
    //   124	130	316	finally
    //   133	164	316	finally
    //   56	75	323	java/lang/Exception
    //   78	97	323	java/lang/Exception
    //   102	108	323	java/lang/Exception
    //   113	120	323	java/lang/Exception
    //   124	130	323	java/lang/Exception
    //   133	164	323	java/lang/Exception
    //   326	369	381	finally
  }
  
  private static b a(b paramb)
  {
    paramb.g = System.currentTimeMillis();
    b = paramb;
    return paramb;
  }
  
  private static b b(Context paramContext)
  {
    b localb = c(paramContext);
    Object localObject = localb;
    if (localb == null)
    {
      paramContext = d(paramContext);
      localObject = paramContext;
      if (paramContext == null) {
        localObject = new b();
      }
    }
    return (b)localObject;
  }
  
  private static b c(Context paramContext)
  {
    try
    {
      if (Looper.myLooper() != Looper.getMainLooper())
      {
        Object localObject1 = S.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
        if (localObject1 == null) {
          return null;
        }
        localObject1 = S.a(null, (Method)localObject1, new Object[] { paramContext });
        if (((localObject1 instanceof Integer)) && (((Integer)localObject1).intValue() == 0))
        {
          localObject1 = S.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class });
          if (localObject1 == null) {
            return null;
          }
          Object localObject2 = S.a(null, (Method)localObject1, new Object[] { paramContext });
          if (localObject2 == null) {
            return null;
          }
          Method localMethod = S.a(localObject2.getClass(), "getId", new Class[0]);
          localObject1 = S.a(localObject2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
          if ((localMethod != null) && (localObject1 != null))
          {
            paramContext = new com/facebook/internal/b;
            paramContext.<init>();
            paramContext.d = ((String)S.a(localObject2, localMethod, new Object[0]));
            paramContext.f = ((Boolean)S.a(localObject2, (Method)localObject1, new Object[0])).booleanValue();
            return paramContext;
          }
        }
        return null;
      }
      paramContext = new com/facebook/p;
      paramContext.<init>("getAndroidId cannot be called on the main thread.");
      throw paramContext;
    }
    catch (Exception paramContext)
    {
      S.a("android_id", paramContext);
    }
    return null;
  }
  
  public static b d()
  {
    return b;
  }
  
  /* Error */
  private static b d(Context paramContext)
  {
    // Byte code:
    //   0: new 11	com/facebook/internal/b$b
    //   3: dup
    //   4: aconst_null
    //   5: invokespecial 222	com/facebook/internal/b$b:<init>	(Lcom/facebook/internal/a;)V
    //   8: astore_1
    //   9: new 224	android/content/Intent
    //   12: dup
    //   13: ldc -30
    //   15: invokespecial 227	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   18: astore_2
    //   19: aload_2
    //   20: ldc -27
    //   22: invokevirtual 233	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   25: pop
    //   26: aload_0
    //   27: aload_2
    //   28: aload_1
    //   29: iconst_1
    //   30: invokevirtual 237	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   33: ifeq +72 -> 105
    //   36: new 8	com/facebook/internal/b$a
    //   39: astore_2
    //   40: aload_2
    //   41: aload_1
    //   42: invokevirtual 240	com/facebook/internal/b$b:a	()Landroid/os/IBinder;
    //   45: invokespecial 243	com/facebook/internal/b$a:<init>	(Landroid/os/IBinder;)V
    //   48: new 2	com/facebook/internal/b
    //   51: astore_3
    //   52: aload_3
    //   53: invokespecial 170	com/facebook/internal/b:<init>	()V
    //   56: aload_3
    //   57: aload_2
    //   58: invokevirtual 244	com/facebook/internal/b$a:a	()Ljava/lang/String;
    //   61: putfield 136	com/facebook/internal/b:d	Ljava/lang/String;
    //   64: aload_3
    //   65: aload_2
    //   66: invokevirtual 246	com/facebook/internal/b$a:b	()Z
    //   69: putfield 144	com/facebook/internal/b:f	Z
    //   72: aload_0
    //   73: aload_1
    //   74: invokevirtual 250	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   77: aload_3
    //   78: areturn
    //   79: astore_2
    //   80: goto +18 -> 98
    //   83: astore_2
    //   84: ldc -41
    //   86: aload_2
    //   87: invokestatic 218	com/facebook/internal/S:a	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   90: aload_0
    //   91: aload_1
    //   92: invokevirtual 250	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   95: goto +10 -> 105
    //   98: aload_0
    //   99: aload_1
    //   100: invokevirtual 250	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   103: aload_2
    //   104: athrow
    //   105: aconst_null
    //   106: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	paramContext	Context
    //   8	92	1	localb	b
    //   18	48	2	localObject1	Object
    //   79	1	2	localObject2	Object
    //   83	21	2	localException	Exception
    //   51	27	3	localb1	b
    // Exception table:
    //   from	to	target	type
    //   36	72	79	finally
    //   84	90	79	finally
    //   36	72	83	java/lang/Exception
  }
  
  private static String e(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null) {
      return localPackageManager.getInstallerPackageName(paramContext.getPackageName());
    }
    return null;
  }
  
  public String a()
  {
    if ((FacebookSdk.isInitialized()) && (FacebookSdk.c())) {
      return this.d;
    }
    return null;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  private static final class a
    implements IInterface
  {
    private IBinder a;
    
    a(IBinder paramIBinder)
    {
      this.a = paramIBinder;
    }
    
    public String a()
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        this.a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public IBinder asBinder()
    {
      return this.a;
    }
    
    public boolean b()
      throws RemoteException
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        boolean bool = true;
        localParcel1.writeInt(1);
        this.a.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i == 0) {
          bool = false;
        }
        return bool;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  private static final class b
    implements ServiceConnection
  {
    private AtomicBoolean a = new AtomicBoolean(false);
    private final BlockingQueue<IBinder> b = new LinkedBlockingDeque();
    
    public IBinder a()
      throws InterruptedException
    {
      if (!this.a.compareAndSet(true, true)) {
        return (IBinder)this.b.take();
      }
      throw new IllegalStateException("Binder already consumed");
    }
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      if (paramIBinder != null) {}
      try
      {
        this.b.put(paramIBinder);
        return;
      }
      catch (InterruptedException paramComponentName)
      {
        for (;;) {}
      }
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName) {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */