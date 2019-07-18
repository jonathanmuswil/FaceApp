package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

final class bf
  implements Qc
{
  private final Hm a;
  
  public bf(_e param_e, Hm paramHm)
  {
    this.a = paramHm;
  }
  
  public final void a(JSONObject paramJSONObject)
  {
    try
    {
      this.a.b(_e.a(this.b).a(paramJSONObject));
      return;
    }
    catch (JSONException paramJSONObject)
    {
      this.a.b(paramJSONObject);
      return;
    }
    catch (IllegalStateException paramJSONObject)
    {
      for (;;) {}
    }
  }
  
  public final void b(String paramString)
  {
    if (paramString == null) {}
    try
    {
      paramString = this.a;
      localEe = new com/google/android/gms/internal/ads/Ee;
      localEe.<init>();
      paramString.a(localEe);
      return;
    }
    catch (IllegalStateException paramString)
    {
      Ee localEe;
      Hm localHm;
      for (;;) {}
    }
    localHm = this.a;
    localEe = new com/google/android/gms/internal/ads/Ee;
    localEe.<init>(paramString);
    localHm.a(localEe);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */