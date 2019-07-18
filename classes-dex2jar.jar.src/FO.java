import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class fo
{
  private static final String a = "fo";
  private static final AtomicBoolean b = new AtomicBoolean(false);
  private static Boolean c = null;
  private static Boolean d = null;
  private static ServiceConnection e;
  private static Application.ActivityLifecycleCallbacks f;
  private static Intent g;
  private static Object h;
  
  private static void b(Context paramContext, ArrayList<String> paramArrayList)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        localObject = ((JSONObject)localObject).getString("productId");
        localHashMap.put(localObject, str);
        localArrayList.add(localObject);
      }
      catch (JSONException localJSONException)
      {
        Log.e(a, "Error parsing in-app purchase data.", localJSONException);
      }
    }
    paramArrayList = go.a(paramContext, localArrayList, h, false).entrySet().iterator();
    while (paramArrayList.hasNext())
    {
      paramContext = (Map.Entry)paramArrayList.next();
      _n.a((String)localHashMap.get(paramContext.getKey()), (String)paramContext.getValue());
    }
  }
  
  private static void b(Context paramContext, Map<String, mo> paramMap)
  {
    if (paramMap.isEmpty()) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Object localObject1 = new ArrayList();
    Object localObject2 = paramMap.keySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str1 = (String)((Iterator)localObject2).next();
      try
      {
        Object localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>(str1);
        localObject3 = ((JSONObject)localObject3).getString("productId");
        ((ArrayList)localObject1).add(localObject3);
        localHashMap.put(localObject3, str1);
      }
      catch (JSONException localJSONException)
      {
        Log.e(a, "Error parsing in-app purchase data.", localJSONException);
      }
    }
    paramContext = go.a(paramContext, (ArrayList)localObject1, h, true);
    localObject1 = paramContext.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      String str2 = (String)((Iterator)localObject1).next();
      localObject2 = (String)localHashMap.get(str2);
      str2 = (String)paramContext.get(str2);
      _n.a((mo)paramMap.get(localObject2), (String)localObject2, str2);
    }
  }
  
  public static void c()
  {
    
    if (!c.booleanValue()) {
      return;
    }
    if (_n.a()) {
      e();
    }
  }
  
  private static void d()
  {
    if (c != null) {
      return;
    }
    try
    {
      Class.forName("com.android.vending.billing.IInAppBillingService$a");
      c = Boolean.valueOf(true);
      try
      {
        Class.forName("com.android.billingclient.api.ProxyBillingActivity");
        d = Boolean.valueOf(true);
      }
      catch (ClassNotFoundException localClassNotFoundException1)
      {
        d = Boolean.valueOf(false);
      }
      go.a();
      g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
      e = new bo();
      f = new eo();
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      c = Boolean.valueOf(false);
    }
  }
  
  private static void e()
  {
    if (!b.compareAndSet(false, true)) {
      return;
    }
    Context localContext = FacebookSdk.d();
    if ((localContext instanceof Application))
    {
      ((Application)localContext).registerActivityLifecycleCallbacks(f);
      localContext.bindService(g, e, 1);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */