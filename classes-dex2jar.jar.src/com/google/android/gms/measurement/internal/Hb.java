package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class hb
  implements Runnable
{
  hb(gb paramgb, boolean paramBoolean, fb paramfb1, fb paramfb2) {}
  
  public final void run()
  {
    boolean bool = this.d.g().c(this.d.p().B());
    int i = 0;
    int k;
    if (bool)
    {
      if ((this.a) && (this.d.c != null)) {
        j = 1;
      } else {
        j = 0;
      }
      k = j;
      if (j != 0)
      {
        localObject1 = this.d;
        gb.a((gb)localObject1, ((gb)localObject1).c, true);
        k = j;
      }
    }
    else
    {
      if (this.a)
      {
        localObject2 = this.d;
        localObject1 = ((gb)localObject2).c;
        if (localObject1 != null) {
          gb.a((gb)localObject2, (fb)localObject1, true);
        }
      }
      k = 0;
    }
    Object localObject2 = this.b;
    long l;
    if (localObject2 != null)
    {
      l = ((fb)localObject2).c;
      localObject1 = this.c;
      if ((l == ((fb)localObject1).c) && (hc.d(((fb)localObject2).b, ((fb)localObject1).b)))
      {
        j = i;
        if (hc.d(this.b.a, this.c.a)) {
          break label192;
        }
      }
    }
    int j = 1;
    label192:
    if (j != 0)
    {
      localObject1 = new Bundle();
      gb.a(this.c, (Bundle)localObject1, true);
      localObject2 = this.b;
      if (localObject2 != null)
      {
        localObject2 = ((fb)localObject2).a;
        if (localObject2 != null) {
          ((Bundle)localObject1).putString("_pn", (String)localObject2);
        }
        ((Bundle)localObject1).putString("_pc", this.b.b);
        ((Bundle)localObject1).putLong("_pi", this.b.c);
      }
      if ((this.d.g().c(this.d.p().B())) && (k != 0))
      {
        l = this.d.t().C();
        if (l > 0L) {
          this.d.e().a((Bundle)localObject1, l);
        }
      }
      this.d.o().c("auto", "_vs", (Bundle)localObject1);
    }
    Object localObject1 = this.d;
    ((gb)localObject1).c = this.c;
    ((gb)localObject1).q().a(this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */