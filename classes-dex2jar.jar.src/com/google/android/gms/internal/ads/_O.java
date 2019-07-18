package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;

@yh
@TargetApi(16)
public final class _o
  extends dp
{
  private final String h = null;
  
  public _o(wn paramwn, String paramString)
  {
    super(paramwn);
  }
  
  protected final int c()
  {
    return 0;
  }
  
  protected final RV c(String paramString)
  {
    Object localObject1 = new YW(this.a, this.b);
    Object localObject2 = ra.vd;
    if (((Boolean)Kea.e().a((ga)localObject2)).booleanValue()) {
      localObject1 = new Zn(this.a, (UW)localObject1, new ap(this));
    }
    if ("video/webm".equals(this.h)) {
      localObject2 = new LW();
    } else {
      localObject2 = new zW();
    }
    paramString = Uri.parse(paramString);
    ga localga = ra.D;
    return new kW(paramString, (UW)localObject1, (hW)localObject2, 2, ((Integer)Kea.e().a(localga)).intValue());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */