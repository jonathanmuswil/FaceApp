package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class nc
  implements Ic<Object>
{
  private final oc a;
  
  public nc(oc paramoc)
  {
    this.a = paramoc;
  }
  
  private static Bundle a(JSONObject paramJSONObject)
    throws JSONException
  {
    if (paramJSONObject == null) {
      return null;
    }
    Iterator localIterator = paramJSONObject.keys();
    Bundle localBundle = new Bundle();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.get(str);
      if (localObject1 != null) {
        if ((localObject1 instanceof Boolean))
        {
          localBundle.putBoolean(str, ((Boolean)localObject1).booleanValue());
        }
        else if ((localObject1 instanceof Double))
        {
          localBundle.putDouble(str, ((Double)localObject1).doubleValue());
        }
        else if ((localObject1 instanceof Integer))
        {
          localBundle.putInt(str, ((Integer)localObject1).intValue());
        }
        else if ((localObject1 instanceof Long))
        {
          localBundle.putLong(str, ((Long)localObject1).longValue());
        }
        else if ((localObject1 instanceof String))
        {
          localBundle.putString(str, (String)localObject1);
        }
        else if ((localObject1 instanceof JSONArray))
        {
          JSONArray localJSONArray = (JSONArray)localObject1;
          if ((localJSONArray != null) && (localJSONArray.length() != 0))
          {
            int i = localJSONArray.length();
            int j = 0;
            int k = 0;
            int m = 0;
            int n = 0;
            localObject1 = null;
            for (int i1 = 0; (localObject1 == null) && (i1 < i); i1++) {
              if (!localJSONArray.isNull(i1)) {
                localObject1 = localJSONArray.get(i1);
              } else {
                localObject1 = null;
              }
            }
            if (localObject1 == null)
            {
              localObject1 = String.valueOf(str);
              if (((String)localObject1).length() != 0) {
                localObject1 = "Expected JSONArray with at least 1 non-null element for key:".concat((String)localObject1);
              } else {
                localObject1 = new String("Expected JSONArray with at least 1 non-null element for key:");
              }
              Tl.d((String)localObject1);
            }
            else
            {
              Object localObject2;
              if ((localObject1 instanceof JSONObject))
              {
                localObject2 = new Bundle[i];
                for (i1 = n; i1 < i; i1++)
                {
                  if (!localJSONArray.isNull(i1)) {
                    localObject1 = a(localJSONArray.optJSONObject(i1));
                  } else {
                    localObject1 = null;
                  }
                  localObject2[i1] = localObject1;
                }
                localBundle.putParcelableArray(str, (Parcelable[])localObject2);
              }
              else if ((localObject1 instanceof Number))
              {
                localObject1 = new double[localJSONArray.length()];
                for (i1 = j; i1 < i; i1++) {
                  localObject1[i1] = localJSONArray.optDouble(i1);
                }
                localBundle.putDoubleArray(str, (double[])localObject1);
              }
              else if ((localObject1 instanceof CharSequence))
              {
                localObject2 = new String[i];
                for (i1 = k; i1 < i; i1++)
                {
                  if (!localJSONArray.isNull(i1)) {
                    localObject1 = localJSONArray.optString(i1);
                  } else {
                    localObject1 = null;
                  }
                  localObject2[i1] = localObject1;
                }
                localBundle.putStringArray(str, (String[])localObject2);
              }
              else if ((localObject1 instanceof Boolean))
              {
                localObject1 = new boolean[i];
                for (i1 = m; i1 < i; i1++) {
                  localObject1[i1] = localJSONArray.optBoolean(i1);
                }
                localBundle.putBooleanArray(str, (boolean[])localObject1);
              }
              else
              {
                Tl.d(String.format("JSONArray with unsupported type %s for key:%s", new Object[] { localObject1.getClass().getCanonicalName(), str }));
              }
            }
          }
        }
        else if ((localObject1 instanceof JSONObject))
        {
          localBundle.putBundle(str, a((JSONObject)localObject1));
        }
        else
        {
          localObject1 = String.valueOf(str);
          if (((String)localObject1).length() != 0) {
            localObject1 = "Unsupported type for key:".concat((String)localObject1);
          } else {
            localObject1 = new String("Unsupported type for key:");
          }
          Tl.d((String)localObject1);
        }
      }
    }
    return localBundle;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap)
  {
    if (this.a == null) {
      return;
    }
    Object localObject1 = (String)paramMap.get("name");
    paramObject = localObject1;
    if (localObject1 == null)
    {
      Tl.c("Ad metadata with no name parameter.");
      paramObject = "";
    }
    boolean bool = paramMap.containsKey("info");
    Object localObject2 = null;
    localObject1 = localObject2;
    if (bool) {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>((String)paramMap.get("info"));
        localObject1 = a((JSONObject)localObject1);
      }
      catch (JSONException paramMap)
      {
        Tl.b("Failed to convert ad metadata to JSON.", paramMap);
        localObject1 = localObject2;
      }
    }
    if (localObject1 == null)
    {
      Tl.b("Failed to convert ad metadata to Bundle.");
      return;
    }
    this.a.a((String)paramObject, (Bundle)localObject1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */