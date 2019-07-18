package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.k;
import org.json.JSONObject;

@yh
public final class ji
  implements Xh
{
  private Fe<JSONObject, JSONObject> a;
  private Fe<JSONObject, JSONObject> b;
  
  public ji(Context paramContext)
  {
    Object localObject = k.p().a(paramContext, Yl.y());
    Je localJe = Ke.b;
    this.a = ((Ne)localObject).a("google.afma.request.getAdDictionary", localJe, localJe);
    paramContext = k.p().a(paramContext, Yl.y());
    localObject = Ke.b;
    this.b = paramContext.a("google.afma.sdkConstants.getSdkConstants", (Ie)localObject, (He)localObject);
  }
  
  public final Fe<JSONObject, JSONObject> a()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */