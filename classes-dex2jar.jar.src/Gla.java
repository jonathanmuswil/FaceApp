import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import io.faceapp.ui.misc.c;
import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.a;
import io.faceapp.ui.misc.c.a.b;
import io.faceapp.ui.misc.c.a.c;
import io.faceapp.ui.misc.c.a.d;
import io.faceapp.ui.misc.c.a.e;
import io.faceapp.ui.misc.c.a.f;
import io.faceapp.ui.misc.c.a.g;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.c.a.i;
import io.faceapp.ui.misc.c.a.j;
import io.faceapp.ui.misc.c.a.k;
import io.faceapp.ui.misc.c.a.l;
import io.faceapp.ui.misc.c.a.m;
import io.faceapp.ui.misc.c.a.n;
import io.faceapp.ui.misc.c.a.o;
import io.faceapp.ui.misc.c.a.p;
import io.faceapp.ui.misc.c.a.q;

public class gla<V extends sla>
  implements rla<V>, OOa
{
  private static final cXa<Object, cWa> a = fla.b;
  private static final cXa<Throwable, cWa> b = ela.b;
  private static final bXa<cWa> c = dla.b;
  @Deprecated
  public static final gla.a d = new gla.a(null);
  private final String e;
  private final FVa<gla.b> f;
  private V g;
  
  public gla()
  {
    FVa localFVa = FVa.t();
    oXa.a(localFVa, "BehaviorSubject.create()");
    this.f = localFVa;
  }
  
  public jRa a()
  {
    return this.h.a();
  }
  
  protected final <T> kRa a(JQa<T> paramJQa, cXa<? super Throwable, cWa> paramcXa, bXa<cWa> parambXa, cXa<? super T, cWa> paramcXa1)
  {
    oXa.b(paramJQa, "$this$bindSubscribe");
    oXa.b(paramcXa, "onError");
    oXa.b(parambXa, "onComplete");
    oXa.b(paramcXa1, "onSuccess");
    paramJQa = paramJQa.a(new kla(paramcXa1), new kla(paramcXa), new jla(parambXa));
    oXa.a(paramJQa, "subscribe(onSuccess, onError, onComplete)");
    a(paramJQa);
    return paramJQa;
  }
  
  protected final <T> kRa a(QQa<T> paramQQa, cXa<? super Throwable, cWa> paramcXa, bXa<cWa> parambXa, cXa<? super T, cWa> paramcXa1)
  {
    oXa.b(paramQQa, "$this$bindSubscribe");
    oXa.b(paramcXa, "onError");
    oXa.b(parambXa, "onComplete");
    oXa.b(paramcXa1, "onNext");
    paramQQa = paramQQa.a(new kla(paramcXa1), new kla(paramcXa), new jla(parambXa));
    oXa.a(paramQQa, "subscribe(onNext, onError, onComplete)");
    a(paramQQa);
    return paramQQa;
  }
  
  protected final <T> kRa a(XQa<T> paramXQa, cXa<? super Throwable, cWa> paramcXa, cXa<? super T, cWa> paramcXa1)
  {
    oXa.b(paramXQa, "$this$bindSubscribe");
    oXa.b(paramcXa, "onError");
    oXa.b(paramcXa1, "onSuccess");
    paramXQa = paramXQa.a(new kla(paramcXa1), new kla(paramcXa));
    oXa.a(paramXQa, "subscribe(onSuccess, onError)");
    a(paramXQa);
    return paramXQa;
  }
  
  public kRa a(kRa paramkRa)
  {
    oXa.b(paramkRa, "$this$bind");
    this.h.a(paramkRa);
    return paramkRa;
  }
  
  protected final kRa a(xQa paramxQa, cXa<? super Throwable, cWa> paramcXa, bXa<cWa> parambXa)
  {
    oXa.b(paramxQa, "$this$bindSubscribe");
    oXa.b(paramcXa, "onError");
    oXa.b(parambXa, "onComplete");
    paramxQa = paramxQa.a(new jla(parambXa), new kla(paramcXa));
    oXa.a(paramxQa, "subscribe(onComplete, onError)");
    a(paramxQa);
    return paramxQa;
  }
  
  public void a(jRa paramjRa)
  {
    oXa.b(paramjRa, "<set-?>");
    this.h.a(paramjRa);
  }
  
  public final void a(Throwable paramThrowable, Rfa.f[] paramArrayOff, bXa<cWa> parambXa, boolean paramBoolean, Object paramObject)
  {
    oXa.b(paramThrowable, "error");
    oXa.b(paramArrayOff, "handledServerErrors");
    Object localObject1 = this.g;
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof c)) {
      localObject2 = null;
    }
    localObject1 = (c)localObject2;
    if (localObject1 != null)
    {
      localObject2 = (Rfa)paramThrowable;
      ePa.a.a((Rfa)localObject2, b());
      if (paramBoolean)
      {
        if (oXa.a(paramThrowable, Rfa.b.c)) {
          localObject2 = c.a.h.a;
        }
        for (;;)
        {
          break;
          if ((paramThrowable instanceof Rfa.d)) {
            localObject2 = c.a.m.a;
          } else if (gWa.a(paramArrayOff, paramThrowable)) {
            localObject2 = d.a((Rfa.f)paramThrowable);
          } else {
            localObject2 = c.a.q.a;
          }
        }
        ((c)localObject1).a((c.a)localObject2, paramObject);
        if ((oXa.a(localObject2, c.a.h.a)) && (parambXa != null))
        {
          localObject2 = FaceApplication.d.c().a(ila.a).h();
          oXa.a(localObject2, "FaceApplication.networkC…ter { it }.firstOrError()");
          b(this, (XQa)localObject2, null, new hla(this, paramThrowable, paramBoolean, paramArrayOff, paramObject, parambXa), 1, null);
        }
      }
    }
  }
  
  public void a(V paramV)
  {
    oXa.b(paramV, "view");
    if (oXa.a(paramV, this.g))
    {
      e();
      this.f.a(gla.b.b);
      this.g = null;
    }
  }
  
  public String b()
  {
    return this.e;
  }
  
  protected final <T> kRa b(JQa<T> paramJQa, cXa<? super Throwable, cWa> paramcXa, bXa<cWa> parambXa, cXa<? super T, cWa> paramcXa1)
  {
    oXa.b(paramJQa, "$this$bindSubscribeMainThread");
    oXa.b(paramcXa, "onError");
    oXa.b(parambXa, "onComplete");
    oXa.b(paramcXa1, "onSuccess");
    paramJQa = paramJQa.a(gRa.a());
    oXa.a(paramJQa, "observeOn(AndroidSchedulers.mainThread())");
    return a(paramJQa, paramcXa, parambXa, paramcXa1);
  }
  
  protected final <T> kRa b(QQa<T> paramQQa, cXa<? super Throwable, cWa> paramcXa, bXa<cWa> parambXa, cXa<? super T, cWa> paramcXa1)
  {
    oXa.b(paramQQa, "$this$bindSubscribeMainThread");
    oXa.b(paramcXa, "onError");
    oXa.b(parambXa, "onComplete");
    oXa.b(paramcXa1, "onNext");
    paramQQa = paramQQa.a(gRa.a());
    oXa.a(paramQQa, "observeOn(AndroidSchedulers.mainThread())");
    return a(paramQQa, paramcXa, parambXa, paramcXa1);
  }
  
  protected final <T> kRa b(XQa<T> paramXQa, cXa<? super Throwable, cWa> paramcXa, cXa<? super T, cWa> paramcXa1)
  {
    oXa.b(paramXQa, "$this$bindSubscribeMainThread");
    oXa.b(paramcXa, "onError");
    oXa.b(paramcXa1, "onSuccess");
    paramXQa = paramXQa.a(gRa.a());
    oXa.a(paramXQa, "observeOn(AndroidSchedulers.mainThread())");
    return a(paramXQa, paramcXa, paramcXa1);
  }
  
  public void b(V paramV)
  {
    oXa.b(paramV, "view");
    sla localsla = this.g;
    if (localsla != null) {
      a(localsla);
    }
    this.g = paramV;
    this.f.a(gla.b.a);
  }
  
  public final V c()
  {
    return this.g;
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((this.f.v()) && ((gla.b)this.f.u() == gla.b.a)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void e()
  {
    this.h.b();
  }
  
  private static final class a
  {
    public final c.a a(Rfa.f paramf)
    {
      oXa.b(paramf, "error");
      if (oXa.a(paramf, Rfa.f.b.e))
      {
        paramf = c.a.b.a;
      }
      else if (oXa.a(paramf, Rfa.f.c.e))
      {
        paramf = c.a.c.a;
      }
      else if (oXa.a(paramf, Rfa.f.d.e))
      {
        paramf = c.a.d.a;
      }
      else if (oXa.a(paramf, Rfa.f.e.e))
      {
        paramf = c.a.e.a;
      }
      else if (oXa.a(paramf, Rfa.f.h.e))
      {
        paramf = c.a.i.a;
      }
      else if (oXa.a(paramf, Rfa.f.i.e))
      {
        paramf = c.a.j.a;
      }
      else if (oXa.a(paramf, Rfa.f.j.e))
      {
        paramf = c.a.k.a;
      }
      else if (oXa.a(paramf, Rfa.f.l.e))
      {
        paramf = c.a.n.a;
      }
      else if (oXa.a(paramf, Rfa.f.a.e))
      {
        paramf = c.a.a.a;
      }
      else if (oXa.a(paramf, Rfa.f.m.e))
      {
        paramf = c.a.o.a;
      }
      else if (oXa.a(paramf, Rfa.f.n.e))
      {
        paramf = c.a.p.a;
      }
      else if (oXa.a(paramf, Rfa.f.k.e))
      {
        paramf = c.a.l.a;
      }
      else if (oXa.a(paramf, Rfa.f.f.e))
      {
        paramf = c.a.f.a;
      }
      else
      {
        if (!oXa.a(paramf, Rfa.f.g.e)) {
          break label243;
        }
        paramf = c.a.g.a;
      }
      return paramf;
      label243:
      throw new UVa();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("ATTACH", 0);
      a = localb1;
      b localb2 = new b("DETACH", 1);
      b = localb2;
      c = new b[] { localb1, localb2 };
    }
    
    private b() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */