package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.mediation.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rp.b;

@yh
public final class fg
  extends Ef
{
  private final y a;
  
  public fg(y paramy)
  {
    this.a = paramy;
  }
  
  public final void A()
  {
    this.a.p();
  }
  
  public final gb E()
  {
    rp.b localb = this.a.g();
    if (localb != null) {
      return new Ua(localb.a(), localb.d(), localb.c(), localb.e(), localb.b());
    }
    return null;
  }
  
  public final String F()
  {
    return this.a.k();
  }
  
  public final double J()
  {
    if (this.a.l() != null) {
      return this.a.l().doubleValue();
    }
    return -1.0D;
  }
  
  public final String N()
  {
    return this.a.b();
  }
  
  public final String O()
  {
    return this.a.m();
  }
  
  public final boolean U()
  {
    return this.a.j();
  }
  
  public final float Va()
  {
    return 0.0F;
  }
  
  public final void a(Hq paramHq)
  {
    this.a.b((View)Iq.J(paramHq));
  }
  
  public final void a(Hq paramHq1, Hq paramHq2, Hq paramHq3)
  {
    paramHq2 = (HashMap)Iq.J(paramHq2);
    paramHq3 = (HashMap)Iq.J(paramHq3);
    this.a.a((View)Iq.J(paramHq1), paramHq2, paramHq3);
  }
  
  public final Hq aa()
  {
    View localView = this.a.q();
    if (localView == null) {
      return null;
    }
    return Iq.a(localView);
  }
  
  public final void b(Hq paramHq)
  {
    this.a.a((View)Iq.J(paramHq));
  }
  
  public final Hq da()
  {
    View localView = this.a.a();
    if (localView == null) {
      return null;
    }
    return Iq.a(localView);
  }
  
  public final boolean ga()
  {
    return this.a.i();
  }
  
  public final Bundle getExtras()
  {
    return this.a.e();
  }
  
  public final q getVideoController()
  {
    if (this.a.n() != null) {
      return this.a.n().a();
    }
    return null;
  }
  
  public final Ya t()
  {
    return null;
  }
  
  public final String u()
  {
    return this.a.f();
  }
  
  public final String v()
  {
    return this.a.d();
  }
  
  public final String x()
  {
    return this.a.c();
  }
  
  public final Hq y()
  {
    Object localObject = this.a.r();
    if (localObject == null) {
      return null;
    }
    return Iq.a(localObject);
  }
  
  public final List z()
  {
    Object localObject = this.a.h();
    ArrayList localArrayList = new ArrayList();
    if (localObject != null)
    {
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (rp.b)localIterator.next();
        localArrayList.add(new Ua(((rp.b)localObject).a(), ((rp.b)localObject).d(), ((rp.b)localObject).c(), ((rp.b)localObject).e(), ((rp.b)localObject).b()));
      }
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */