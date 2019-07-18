package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class bs
{
  private final String a;
  private final Ue b;
  private gs c;
  private final Ic<Object> d = new cs(this);
  private final Ic<Object> e = new ds(this);
  
  public bs(String paramString, Ue paramUe)
  {
    this.a = paramString;
    this.b = paramUe;
  }
  
  private final boolean a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return false;
    }
    paramMap = (String)paramMap.get("hashCode");
    return (!TextUtils.isEmpty(paramMap)) && (paramMap.equals(this.a));
  }
  
  public final void a()
  {
    this.b.b("/updateActiveView", this.d);
    this.b.b("/untrackActiveViewUnit", this.e);
  }
  
  public final void a(gs paramgs)
  {
    this.b.a("/updateActiveView", this.d);
    this.b.a("/untrackActiveViewUnit", this.e);
    this.c = paramgs;
  }
  
  public final void a(sp paramsp)
  {
    paramsp.b("/updateActiveView", this.d);
    paramsp.b("/untrackActiveViewUnit", this.e);
  }
  
  public final void b(sp paramsp)
  {
    paramsp.a("/updateActiveView", this.d);
    paramsp.a("/untrackActiveViewUnit", this.e);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */