package com.facebook;

import java.util.Collection;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

class g
  implements H.a
{
  g(h paramh, b paramb, b.a parama, AtomicBoolean paramAtomicBoolean, h.a parama1, Set paramSet1, Set paramSet2) {}
  
  public void a(H paramH)
  {
    try
    {
      if ((h.d().c() != null) && (h.d().c().v() == this.a.v()))
      {
        if ((!this.c.get()) && (this.d.a == null) && (this.d.b == 0))
        {
          if (this.b != null)
          {
            paramH = this.b;
            localObject1 = new com/facebook/p;
            ((p)localObject1).<init>("Failed to refresh access token");
            paramH.a((p)localObject1);
          }
          h.a(this.g).set(false);
          paramH = this.b;
          return;
        }
        if (this.d.a != null) {
          paramH = this.d.a;
        } else {
          paramH = this.a.u();
        }
        String str1 = this.a.m();
        String str2 = this.a.v();
        if (this.c.get()) {
          localObject1 = this.e;
        } else {
          localObject1 = this.a.s();
        }
        if (this.c.get()) {
          localObject2 = this.f;
        } else {
          localObject2 = this.a.p();
        }
        i locali = this.a.t();
        Date localDate1;
        if (this.d.b != 0)
        {
          localDate1 = new java/util/Date;
          localDate1.<init>(this.d.b * 1000L);
        }
        else
        {
          localDate1 = this.a.q();
        }
        Date localDate2 = new java/util/Date;
        localDate2.<init>();
        Date localDate3;
        if (this.d.c != null)
        {
          localDate3 = new java/util/Date;
          localDate3.<init>(1000L * this.d.c.longValue());
        }
        else
        {
          localDate3 = this.a.o();
        }
        localObject1 = new b(paramH, str1, str2, (Collection)localObject1, (Collection)localObject2, locali, localDate1, localDate2, localDate3);
        try
        {
          h.d().a((b)localObject1);
          h.a(this.g).set(false);
          paramH = this.b;
          if (paramH != null) {
            paramH.a((b)localObject1);
          }
          return;
        }
        finally
        {
          break label427;
        }
      }
      if (this.b != null)
      {
        localObject1 = this.b;
        paramH = new com/facebook/p;
        paramH.<init>("No current access token to refresh");
        ((b.a)localObject1).a(paramH);
      }
      h.a(this.g).set(false);
      paramH = this.b;
      return;
    }
    finally
    {
      Object localObject1 = null;
      label427:
      h.a(this.g).set(false);
      Object localObject2 = this.b;
      if ((localObject2 != null) && (localObject1 != null)) {
        ((b.a)localObject2).a((b)localObject1);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */