package com.google.android.gms.internal.ads;

import Hq;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.k;
import gd;
import org.json.JSONObject;

public final class nt
  implements Xu, sv
{
  private final Context a;
  private final sp b;
  private final dL c;
  private final Yl d;
  private Hq e;
  private boolean f;
  
  public nt(Context paramContext, sp paramsp, dL paramdL, Yl paramYl)
  {
    this.a = paramContext;
    this.b = paramsp;
    this.c = paramdL;
    this.d = paramYl;
  }
  
  private final void a()
  {
    try
    {
      boolean bool = this.c.J;
      if (!bool) {
        return;
      }
      Object localObject1 = this.b;
      if (localObject1 == null) {
        return;
      }
      bool = k.r().b(this.a);
      if (!bool) {
        return;
      }
      int i = this.d.b;
      int j = this.d.c;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(23);
      ((StringBuilder)localObject1).append(i);
      ((StringBuilder)localObject1).append(".");
      ((StringBuilder)localObject1).append(j);
      String str = ((StringBuilder)localObject1).toString();
      if (this.c.L.optInt("media_type", -1) == 0) {
        localObject1 = null;
      } else {
        localObject1 = "javascript";
      }
      this.e = k.r().a(str, this.b.getWebView(), "", "javascript", (String)localObject1);
      localObject1 = this.b.getView();
      if ((this.e != null) && (localObject1 != null))
      {
        k.r().a(this.e, (View)localObject1);
        this.b.a(this.e);
        k.r().a(this.e);
        this.f = true;
      }
      return;
    }
    finally {}
  }
  
  public final void h()
  {
    try
    {
      boolean bool = this.f;
      if (bool) {
        return;
      }
      a();
      return;
    }
    finally {}
  }
  
  public final void k()
  {
    try
    {
      if (!this.f) {
        a();
      }
      if ((this.c.J) && (this.e != null) && (this.b != null))
      {
        sp localsp = this.b;
        gd localgd = new gd;
        localgd.<init>();
        localsp.a("onSdkImpression", localgd);
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */