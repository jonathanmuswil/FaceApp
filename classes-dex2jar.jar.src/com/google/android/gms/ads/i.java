package com.google.android.gms.ads;

import Gp;
import Jp;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.D;
import com.google.android.gms.internal.ads.kea;

public final class i
{
  private final D a;
  
  public i(Context paramContext)
  {
    this.a = new D(paramContext);
    t.a(paramContext, "Context cannot be null");
  }
  
  public final Bundle a()
  {
    return this.a.a();
  }
  
  public final void a(Gp paramGp)
  {
    this.a.a(paramGp);
  }
  
  public final void a(Jp paramJp)
  {
    this.a.a(paramJp);
  }
  
  public final void a(b paramb)
  {
    this.a.a(paramb);
    if ((paramb != null) && ((paramb instanceof kea)))
    {
      this.a.a((kea)paramb);
      return;
    }
    if (paramb == null) {
      this.a.a(null);
    }
  }
  
  public final void a(d paramd)
  {
    this.a.a(paramd.a());
  }
  
  public final void a(String paramString)
  {
    this.a.a(paramString);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public final void b()
  {
    this.a.b();
  }
  
  public final void b(boolean paramBoolean)
  {
    this.a.b(true);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */