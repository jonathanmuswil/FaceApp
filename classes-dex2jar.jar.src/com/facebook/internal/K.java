package com.facebook.internal;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class k
{
  private static final Map<Class<?>, a> a = new HashMap();
  
  static
  {
    a.put(Boolean.class, new d());
    a.put(Integer.class, new e());
    a.put(Long.class, new f());
    a.put(Double.class, new g());
    a.put(String.class, new h());
    a.put(String[].class, new i());
    a.put(JSONArray.class, new j());
  }
  
  public static Bundle a(JSONObject paramJSONObject)
    throws JSONException
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if ((localObject != null) && (localObject != JSONObject.NULL)) {
        if ((localObject instanceof JSONObject))
        {
          localBundle.putBundle(str, a((JSONObject)localObject));
        }
        else
        {
          a locala = (a)a.get(localObject.getClass());
          if (locala != null)
          {
            locala.a(localBundle, str, localObject);
          }
          else
          {
            paramJSONObject = new StringBuilder();
            paramJSONObject.append("Unsupported type: ");
            paramJSONObject.append(localObject.getClass());
            throw new IllegalArgumentException(paramJSONObject.toString());
          }
        }
      }
    }
    return localBundle;
  }
  
  public static abstract interface a
  {
    public abstract void a(Bundle paramBundle, String paramString, Object paramObject)
      throws JSONException;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */