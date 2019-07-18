import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class dya
  extends pXa
  implements cXa<WVa<? extends Boolean, ? extends Bundle>, cWa>
{
  dya(Qxa paramQxa)
  {
    super(1);
  }
  
  public final void a(WVa<Boolean, Bundle> paramWVa)
  {
    Object localObject1 = (Boolean)paramWVa.a();
    paramWVa = (Bundle)paramWVa.b();
    Object localObject2 = this.b;
    oXa.a(localObject1, "isPro");
    localObject1 = Qxa.a((Qxa)localObject2, ((Boolean)localObject1).booleanValue());
    localObject2 = new HashSet();
    Object localObject3 = ((fya.a)localObject1).b().m();
    Object localObject4 = new ArrayList();
    Object localObject5 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject5).hasNext())
    {
      localObject3 = ((Iterator)localObject5).next();
      if ((localObject3 instanceof mka)) {
        ((Collection)localObject4).add(localObject3);
      }
    }
    localObject3 = ((Iterable)localObject4).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (mka)((Iterator)localObject3).next();
      oXa.a(paramWVa, "config");
      if (oya.d(paramWVa).containsKey(((mka)localObject4).c())) {
        ((HashSet)localObject2).add(((mka)localObject4).c());
      }
    }
    localObject3 = ((fya.a)localObject1).b().m();
    localObject4 = new ArrayList();
    localObject3 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject5 = ((Iterator)localObject3).next();
      if ((localObject5 instanceof rka)) {
        ((Collection)localObject4).add(localObject5);
      }
    }
    localObject3 = ((Iterable)localObject4).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (rka)((Iterator)localObject3).next();
      localObject5 = ((rka)localObject4).c();
      int i = ((String)localObject5).hashCode();
      boolean bool = true;
      switch (i)
      {
      default: 
        break;
      case 1615078484: 
        if (((String)localObject5).equals("effect-tool"))
        {
          oXa.a(paramWVa, "config");
          if (oya.j(oya.c(paramWVa)).length() <= 0) {
            break;
          }
        }
        break;
      case 1266959063: 
        if (((String)localObject5).equals("background-tool"))
        {
          oXa.a(paramWVa, "config");
          if (oya.e(oya.a(paramWVa)).length() <= 0) {
            break;
          }
        }
        break;
      case 1247799989: 
        if (((String)localObject5).equals("crop-tool"))
        {
          oXa.a(paramWVa, "config");
          if (oya.h(oya.v(paramWVa)) == null) {
            break;
          }
        }
        break;
      case 809064011: 
        if (((String)localObject5).equals("vignette-tool"))
        {
          localObject5 = this.b;
          oXa.a(paramWVa, "config");
          bool = Qxa.a((Qxa)localObject5, paramWVa, new pya[] { pya.o.i });
        }
        break;
      case 239761653: 
        if (((String)localObject5).equals("overlay-tool"))
        {
          oXa.a(paramWVa, "config");
          if (oya.n(oya.t(paramWVa)).length() <= 0) {
            break;
          }
        }
        break;
      case -127031528: 
        if (((String)localObject5).equals("tattoo-tool"))
        {
          oXa.a(paramWVa, "config");
          if (oya.p(oya.u(paramWVa)).length() <= 0) {
            break;
          }
        }
        break;
      case -362331553: 
        if (((String)localObject5).equals("adjustments-tool"))
        {
          localObject5 = this.b;
          oXa.a(paramWVa, "config");
          bool = Qxa.a((Qxa)localObject5, paramWVa, new pya[] { pya.c.i, pya.b.i, pya.n.i, pya.l.i, pya.i.i, pya.k.i });
        }
        break;
      case -1019709123: 
        if (((String)localObject5).equals("lens_blur-tool"))
        {
          localObject5 = this.b;
          oXa.a(paramWVa, "config");
          bool = Qxa.a((Qxa)localObject5, paramWVa, new pya[] { pya.h.i });
        }
        break;
      }
      bool = false;
      if (bool) {
        ((HashSet)localObject2).add(((rka)localObject4).c());
      }
    }
    Qxa.a(this.b, (fya.a)localObject1);
    paramWVa = (fya)this.b.c();
    if (paramWVa != null) {
      paramWVa.a((fya.a)localObject1, (Set)localObject2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */