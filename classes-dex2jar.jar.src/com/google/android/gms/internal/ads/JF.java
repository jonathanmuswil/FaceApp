package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@yh
public final class jf
{
  public static List<String> a(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    paramString = paramJSONObject.optJSONArray(paramString);
    if (paramString != null)
    {
      paramJSONObject = new ArrayList(paramString.length());
      for (int i = 0; i < paramString.length(); i++) {
        paramJSONObject.add(paramString.getString(i));
      }
      return Collections.unmodifiableList(paramJSONObject);
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */