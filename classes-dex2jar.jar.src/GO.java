import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class go
{
  private static final String a = "go";
  private static final HashMap<String, Method> b = new HashMap();
  private static final HashMap<String, Class<?>> c = new HashMap();
  private static final String d = FacebookSdk.d().getPackageName();
  private static final SharedPreferences e = FacebookSdk.d().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
  private static final SharedPreferences f = FacebookSdk.d().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
  private static final SharedPreferences g = FacebookSdk.d().getSharedPreferences("com.facebook.internal.PURCHASE_SUBS", 0);
  
  private static Class<?> a(Context paramContext, String paramString)
  {
    Object localObject = (Class)c.get(paramString);
    if (localObject != null) {
      return (Class<?>)localObject;
    }
    try
    {
      paramContext = paramContext.getClassLoader().loadClass(paramString);
      localObject = paramContext;
      c.put(paramString, paramContext);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramContext = a;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(" is not available, please add ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" to the project.");
      Log.e(paramContext, localStringBuilder.toString(), localClassNotFoundException);
      paramContext = (Context)localObject;
    }
    return paramContext;
  }
  
  public static Object a(Context paramContext, IBinder paramIBinder)
  {
    return a(paramContext, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[] { paramIBinder });
  }
  
  private static Object a(Context paramContext, String paramString1, String paramString2, Object paramObject, Object[] paramArrayOfObject)
  {
    paramString1 = a(paramContext, paramString1);
    if (paramString1 == null) {
      return null;
    }
    paramString2 = a(paramString1, paramString2);
    if (paramString2 == null) {
      return null;
    }
    paramContext = (Context)paramObject;
    if (paramObject != null) {
      paramContext = paramString1.cast(paramObject);
    }
    try
    {
      paramContext = paramString2.invoke(paramContext, paramArrayOfObject);
      return paramContext;
    }
    catch (InvocationTargetException paramObject)
    {
      paramContext = a;
      paramArrayOfObject = new StringBuilder();
      paramArrayOfObject.append("Invocation target exception in ");
      paramArrayOfObject.append(paramString1.getName());
      paramArrayOfObject.append(".");
      paramArrayOfObject.append(paramString2.getName());
      Log.e(paramContext, paramArrayOfObject.toString(), (Throwable)paramObject);
    }
    catch (IllegalAccessException paramArrayOfObject)
    {
      paramObject = a;
      paramContext = new StringBuilder();
      paramContext.append("Illegal access to method ");
      paramContext.append(paramString1.getName());
      paramContext.append(".");
      paramContext.append(paramString2.getName());
      Log.e((String)paramObject, paramContext.toString(), paramArrayOfObject);
    }
    return null;
  }
  
  private static Method a(Class<?> paramClass, String paramString)
  {
    Object localObject1 = (Method)b.get(paramString);
    if (localObject1 != null) {
      return (Method)localObject1;
    }
    Object localObject2 = null;
    int i = -1;
    Object localObject3 = localObject1;
    try
    {
      switch (paramString.hashCode())
      {
      default: 
        break;
      case -573310373: 
        localObject3 = localObject1;
        if (paramString.equals("getSkuDetails")) {
          i = 1;
        }
        break;
      case -594356707: 
        localObject3 = localObject1;
        if (paramString.equals("getPurchaseHistory")) {
          i = 4;
        }
        break;
      case -1123215065: 
        localObject3 = localObject1;
        if (paramString.equals("asInterface")) {
          i = 0;
        }
        break;
      case -1450694211: 
        localObject3 = localObject1;
        if (paramString.equals("isBillingSupported")) {
          i = 2;
        }
        break;
      case -1801122596: 
        localObject3 = localObject1;
        if (paramString.equals("getPurchases")) {
          i = 3;
        }
        break;
      }
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 4)
              {
                localObject3 = localObject1;
                localObject2 = new Class[5];
                localObject3 = localObject1;
                localObject2[0] = Integer.TYPE;
                localObject2[1] = String.class;
                localObject2[2] = String.class;
                localObject2[3] = String.class;
                localObject2[4] = Bundle.class;
              }
            }
            else
            {
              localObject3 = localObject1;
              localObject2 = new Class[4];
              localObject3 = localObject1;
              localObject2[0] = Integer.TYPE;
              localObject2[1] = String.class;
              localObject2[2] = String.class;
              localObject2[3] = String.class;
            }
          }
          else
          {
            localObject3 = localObject1;
            localObject2 = new Class[3];
            localObject3 = localObject1;
            localObject2[0] = Integer.TYPE;
            localObject2[1] = String.class;
            localObject2[2] = String.class;
          }
        }
        else
        {
          localObject3 = localObject1;
          localObject2 = new Class[4];
          localObject3 = localObject1;
          localObject2[0] = Integer.TYPE;
          localObject2[1] = String.class;
          localObject2[2] = String.class;
          localObject2[3] = Bundle.class;
        }
      }
      else
      {
        localObject3 = localObject1;
        localObject2 = new Class[1];
        localObject2[0] = IBinder.class;
      }
      localObject3 = localObject1;
      localObject2 = paramClass.getDeclaredMethod(paramString, (Class[])localObject2);
      localObject3 = localObject2;
      b.put(paramString, localObject2);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      localObject1 = a;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(paramClass.getName());
      ((StringBuilder)localObject2).append(".");
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(" method not found");
      Log.e((String)localObject1, ((StringBuilder)localObject2).toString(), localNoSuchMethodException);
      localObject2 = localObject3;
    }
    return (Method)localObject2;
  }
  
  public static ArrayList<String> a(Context paramContext, Object paramObject)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramObject == null) {
      return localArrayList;
    }
    Class localClass = a(paramContext, "com.android.vending.billing.IInAppBillingService");
    if (localClass == null) {
      return localArrayList;
    }
    if (a(localClass, "getPurchaseHistory") == null) {
      return localArrayList;
    }
    return a(a(paramContext, paramObject, "inapp"));
  }
  
  private static ArrayList<String> a(Context paramContext, Object paramObject, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (c(paramContext, paramObject, paramString).booleanValue())
    {
      Object localObject1 = Boolean.valueOf(false);
      Object localObject2 = null;
      int i = 0;
      for (;;)
      {
        Object localObject3 = a(paramContext, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", paramObject, new Object[] { Integer.valueOf(6), d, paramString, localObject2, new Bundle() });
        if (localObject3 != null)
        {
          long l = System.currentTimeMillis() / 1000L;
          localObject2 = (Bundle)localObject3;
          if (((Bundle)localObject2).getInt("RESPONSE_CODE") == 0)
          {
            Iterator localIterator = ((Bundle)localObject2).getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
            for (;;)
            {
              localObject3 = localObject1;
              if (!localIterator.hasNext()) {
                break;
              }
              localObject3 = (String)localIterator.next();
              try
              {
                JSONObject localJSONObject = new org/json/JSONObject;
                localJSONObject.<init>((String)localObject3);
                if (l - localJSONObject.getLong("purchaseTime") / 1000L > 1200L)
                {
                  localObject3 = Boolean.valueOf(true);
                  break;
                }
                localArrayList.add(localObject3);
                i++;
              }
              catch (JSONException localJSONException)
              {
                Log.e(a, "parsing purchase failure: ", localJSONException);
              }
            }
            localObject1 = ((Bundle)localObject2).getString("INAPP_CONTINUATION_TOKEN");
            break label245;
          }
        }
        localObject2 = null;
        Object localObject4 = localObject1;
        localObject1 = localObject2;
        label245:
        if ((i >= 30) || (localObject1 == null) || (((Boolean)localObject4).booleanValue())) {
          break;
        }
        localObject2 = localObject1;
        localObject1 = localObject4;
      }
    }
    return localArrayList;
  }
  
  private static ArrayList<String> a(ArrayList<String> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    SharedPreferences.Editor localEditor = f.edit();
    long l1 = System.currentTimeMillis() / 1000L;
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str1 = (String)paramArrayList.next();
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str1);
        String str2 = ((JSONObject)localObject).getString("productId");
        long l2 = ((JSONObject)localObject).getLong("purchaseTime");
        localObject = ((JSONObject)localObject).getString("purchaseToken");
        if ((l1 - l2 / 1000L <= 43200L) && (!f.getString(str2, "").equals(localObject)))
        {
          localEditor.putString(str2, (String)localObject);
          localArrayList.add(str1);
        }
      }
      catch (JSONException localJSONException)
      {
        Log.e(a, "parsing purchase failure: ", localJSONException);
      }
    }
    localEditor.apply();
    return localArrayList;
  }
  
  public static Map<String, String> a(Context paramContext, ArrayList<String> paramArrayList, Object paramObject, boolean paramBoolean)
  {
    Map localMap = b(paramArrayList);
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      if (!localMap.containsKey(str)) {
        localArrayList.add(str);
      }
    }
    localMap.putAll(b(paramContext, localArrayList, paramObject, paramBoolean));
    return localMap;
  }
  
  private static mo a(String paramString)
  {
    Object localObject = null;
    try
    {
      long l = System.currentTimeMillis() / 1000L;
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>(paramString);
      String str1 = localJSONObject1.getString("productId");
      String str2 = g.getString(str1, "");
      JSONObject localJSONObject2;
      if (str2.isEmpty())
      {
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
      }
      else
      {
        localJSONObject2 = new JSONObject(str2);
      }
      if (!localJSONObject2.optString("purchaseToken").equals(localJSONObject1.get("purchaseToken")))
      {
        if (l - localJSONObject1.getLong("purchaseTime") / 1000L < 43200L) {
          paramString = mo.a;
        } else {
          paramString = mo.b;
        }
        localObject = paramString;
      }
      paramString = (String)localObject;
      if (localObject == null)
      {
        paramString = (String)localObject;
        if (!str2.isEmpty())
        {
          boolean bool1 = localJSONObject2.getBoolean("autoRenewing");
          boolean bool2 = localJSONObject1.getBoolean("autoRenewing");
          if ((!bool2) && (bool1))
          {
            paramString = mo.d;
          }
          else
          {
            paramString = (String)localObject;
            if (!bool1)
            {
              paramString = (String)localObject;
              if (bool2) {
                paramString = mo.e;
              }
            }
          }
        }
      }
      localObject = paramString;
      if (paramString == null)
      {
        localObject = paramString;
        if (!str2.isEmpty()) {
          if (l - localJSONObject2.getLong("LAST_LOGGED_TIME_SEC") > 86400L) {
            localObject = mo.b;
          } else {
            localObject = mo.f;
          }
        }
      }
      if (localObject != mo.f)
      {
        localJSONObject1.put("LAST_LOGGED_TIME_SEC", l);
        g.edit().putString(str1, localJSONObject1.toString()).apply();
      }
      return (mo)localObject;
    }
    catch (JSONException paramString)
    {
      Log.e(a, "parsing purchase failure: ", paramString);
    }
    return mo.g;
  }
  
  public static void a()
  {
    long l1 = System.currentTimeMillis() / 1000L;
    long l2 = e.getLong("LAST_CLEARED_TIME", 0L);
    if (l2 == 0L) {
      e.edit().putLong("LAST_CLEARED_TIME", l1).apply();
    } else if (l1 - l2 > 604800L) {
      e.edit().clear().putLong("LAST_CLEARED_TIME", l1).apply();
    }
  }
  
  private static void a(Map<String, String> paramMap)
  {
    long l = System.currentTimeMillis() / 1000L;
    SharedPreferences.Editor localEditor = e.edit();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramMap = (String)localEntry.getKey();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(l);
      localStringBuilder.append(";");
      localStringBuilder.append((String)localEntry.getValue());
      localEditor.putString(paramMap, localStringBuilder.toString());
    }
    localEditor.apply();
  }
  
  public static ArrayList<String> b(Context paramContext, Object paramObject)
  {
    return a(b(paramContext, paramObject, "inapp"));
  }
  
  private static ArrayList<String> b(Context paramContext, Object paramObject, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramObject == null) {
      return localArrayList;
    }
    if (c(paramContext, paramObject, paramString).booleanValue())
    {
      Object localObject1 = null;
      int i = 0;
      Object localObject2;
      label138:
      do
      {
        localObject2 = a(paramContext, "com.android.vending.billing.IInAppBillingService", "getPurchases", paramObject, new Object[] { Integer.valueOf(3), d, paramString, localObject1 });
        if (localObject2 != null)
        {
          localObject2 = (Bundle)localObject2;
          if (((Bundle)localObject2).getInt("RESPONSE_CODE") == 0)
          {
            localObject1 = ((Bundle)localObject2).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            if (localObject1 == null) {
              break;
            }
            i += ((ArrayList)localObject1).size();
            localArrayList.addAll((Collection)localObject1);
            localObject2 = ((Bundle)localObject2).getString("INAPP_CONTINUATION_TOKEN");
            break label138;
          }
        }
        localObject2 = null;
        if (i >= 30) {
          break;
        }
        localObject1 = localObject2;
      } while (localObject2 != null);
    }
    return localArrayList;
  }
  
  private static Map<String, String> b(Context paramContext, ArrayList<String> paramArrayList, Object paramObject, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    if ((paramObject != null) && (!paramArrayList.isEmpty()))
    {
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("ITEM_ID_LIST", paramArrayList);
      int i = 0;
      String str1 = d;
      String str2;
      if (paramBoolean) {
        str2 = "subs";
      } else {
        str2 = "inapp";
      }
      paramContext = a(paramContext, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", paramObject, new Object[] { Integer.valueOf(3), str1, str2, localBundle });
      if (paramContext != null)
      {
        paramContext = (Bundle)paramContext;
        if (paramContext.getInt("RESPONSE_CODE") == 0)
        {
          paramContext = paramContext.getStringArrayList("DETAILS_LIST");
          if ((paramContext != null) && (paramArrayList.size() == paramContext.size())) {
            while (i < paramArrayList.size())
            {
              localHashMap.put(paramArrayList.get(i), paramContext.get(i));
              i++;
            }
          }
          a(localHashMap);
        }
      }
    }
    return localHashMap;
  }
  
  private static Map<String, String> b(ArrayList<String> paramArrayList)
  {
    HashMap localHashMap = new HashMap();
    long l = System.currentTimeMillis() / 1000L;
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramArrayList = (String)localIterator.next();
      Object localObject = e.getString(paramArrayList, null);
      if (localObject != null)
      {
        localObject = ((String)localObject).split(";", 2);
        if (l - Long.parseLong(localObject[0]) < 43200L) {
          localHashMap.put(paramArrayList, localObject[1]);
        }
      }
    }
    return localHashMap;
  }
  
  private static Boolean c(Context paramContext, Object paramObject, String paramString)
  {
    boolean bool1 = false;
    if (paramObject == null) {
      return Boolean.valueOf(false);
    }
    paramContext = a(paramContext, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", paramObject, new Object[] { Integer.valueOf(3), d, paramString });
    boolean bool2 = bool1;
    if (paramContext != null)
    {
      bool2 = bool1;
      if (((Integer)paramContext).intValue() == 0) {
        bool2 = true;
      }
    }
    return Boolean.valueOf(bool2);
  }
  
  public static Map<String, mo> c(Context paramContext, Object paramObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = b(paramContext, paramObject, "subs").iterator();
    while (localIterator.hasNext())
    {
      paramObject = (String)localIterator.next();
      paramContext = a((String)paramObject);
      if ((paramContext != mo.f) && (paramContext != mo.g)) {
        localHashMap.put(paramObject, paramContext);
      }
    }
    return localHashMap;
  }
  
  public static ArrayList<String> d(Context paramContext, Object paramObject)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = g.getAll();
    if (((Map)localObject1).isEmpty()) {
      return localArrayList;
    }
    paramObject = b(paramContext, paramObject, "subs");
    paramContext = new HashSet();
    paramObject = ((ArrayList)paramObject).iterator();
    while (((Iterator)paramObject).hasNext())
    {
      String str = (String)((Iterator)paramObject).next();
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        paramContext.add(localJSONObject.getString("productId"));
      }
      catch (JSONException localJSONException)
      {
        Log.e(a, "Error parsing purchase json", localJSONException);
      }
    }
    paramObject = new HashSet();
    Object localObject2 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Map.Entry)((Iterator)localObject2).next()).getKey();
      if (!paramContext.contains(localObject1)) {
        ((Set)paramObject).add(localObject1);
      }
    }
    paramContext = g.edit();
    localObject1 = ((Set)paramObject).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramObject = (String)((Iterator)localObject1).next();
      localObject2 = g.getString((String)paramObject, "");
      paramContext.remove((String)paramObject);
      if (!((String)localObject2).isEmpty()) {
        localArrayList.add(g.getString((String)paramObject, ""));
      }
    }
    paramContext.apply();
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */