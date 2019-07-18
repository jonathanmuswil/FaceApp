package com.facebook.appevents;

import Wn;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.L;
import com.facebook.internal.H;
import com.facebook.internal.S;
import com.facebook.p;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

class f
  implements Serializable
{
  private static final HashSet<String> a = new HashSet();
  private final JSONObject b;
  private final boolean c;
  private final String d;
  private final String e;
  
  public f(String paramString1, String paramString2, Double paramDouble, Bundle paramBundle, boolean paramBoolean, UUID paramUUID)
    throws JSONException, p
  {
    this.b = a(paramString1, paramString2, paramDouble, paramBundle, paramBoolean, paramUUID);
    this.c = paramBoolean;
    this.d = paramString2;
    this.e = e();
  }
  
  private f(String paramString1, boolean paramBoolean, String paramString2)
    throws JSONException
  {
    this.b = new JSONObject(paramString1);
    this.c = paramBoolean;
    this.d = this.b.optString("_eventName");
    this.e = paramString2;
  }
  
  private static String a(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      paramString = paramString.getBytes("UTF-8");
      localMessageDigest.update(paramString, 0, paramString.length);
      paramString = Wn.a(localMessageDigest.digest());
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      S.a("Failed to generate checksum: ", paramString);
      return "1";
    }
    catch (NoSuchAlgorithmException paramString)
    {
      S.a("Failed to generate checksum: ", paramString);
    }
    return "0";
  }
  
  private static JSONObject a(String paramString1, String paramString2, Double paramDouble, Bundle paramBundle, boolean paramBoolean, UUID paramUUID)
    throws p, JSONException
  {
    b(paramString2);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("_eventName", paramString2);
    localJSONObject.put("_eventName_md5", a(paramString2));
    localJSONObject.put("_logTime", System.currentTimeMillis() / 1000L);
    localJSONObject.put("_ui", paramString1);
    if (paramUUID != null) {
      localJSONObject.put("_session_id", paramUUID);
    }
    if (paramDouble != null) {
      localJSONObject.put("_valueToSum", paramDouble.doubleValue());
    }
    if (paramBoolean) {
      localJSONObject.put("_implicitlyLogged", "1");
    }
    if (paramBundle != null)
    {
      paramDouble = paramBundle.keySet().iterator();
      while (paramDouble.hasNext())
      {
        paramString1 = (String)paramDouble.next();
        b(paramString1);
        paramString2 = paramBundle.get(paramString1);
        if ((!(paramString2 instanceof String)) && (!(paramString2 instanceof Number))) {
          throw new p(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] { paramString2, paramString1 }));
        }
        localJSONObject.put(paramString1, paramString2.toString());
      }
    }
    if (!paramBoolean) {
      H.a(L.e, "AppEvents", "Created app event '%s'", new Object[] { localJSONObject.toString() });
    }
    return localJSONObject;
  }
  
  private static void b(String paramString)
    throws p
  {
    if ((paramString != null) && (paramString.length() != 0) && (paramString.length() <= 40)) {
      synchronized (a)
      {
        boolean bool = a.contains(paramString);
        if (!bool)
        {
          if (paramString.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (a)
            {
              a.add(paramString);
            }
          }
          throw new p(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] { paramString }));
        }
        return;
      }
    }
    ??? = paramString;
    if (paramString == null) {
      ??? = "<None Provided>";
    }
    throw new p(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] { ???, Integer.valueOf(40) }));
  }
  
  private String e()
  {
    if (Build.VERSION.SDK_INT > 19) {
      return a(this.b.toString());
    }
    Object localObject1 = new ArrayList();
    Object localObject2 = this.b.keys();
    while (((Iterator)localObject2).hasNext()) {
      ((ArrayList)localObject1).add(((Iterator)localObject2).next());
    }
    Collections.sort((List)localObject1);
    localObject2 = new StringBuilder();
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (String)localIterator.next();
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" = ");
      ((StringBuilder)localObject2).append(this.b.optString((String)localObject1));
      ((StringBuilder)localObject2).append('\n');
    }
    return a(((StringBuilder)localObject2).toString());
  }
  
  private Object writeReplace()
  {
    return new b(this.b.toString(), this.c, this.e, null);
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public JSONObject b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    if (this.e == null) {
      return true;
    }
    return e().equals(this.e);
  }
  
  public String toString()
  {
    return String.format("\"%s\", implicit: %b, json: %s", new Object[] { this.b.optString("_eventName"), Boolean.valueOf(this.c), this.b.toString() });
  }
  
  static class a
    implements Serializable
  {
    private final String a;
    private final boolean b;
    
    private Object readResolve()
      throws JSONException
    {
      return new f(this.a, this.b, null, null);
    }
  }
  
  static class b
    implements Serializable
  {
    private final String a;
    private final boolean b;
    private final String c;
    
    private b(String paramString1, boolean paramBoolean, String paramString2)
    {
      this.a = paramString1;
      this.b = paramBoolean;
      this.c = paramString2;
    }
    
    private Object readResolve()
      throws JSONException
    {
      return new f(this.a, this.b, this.c, null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/appevents/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */