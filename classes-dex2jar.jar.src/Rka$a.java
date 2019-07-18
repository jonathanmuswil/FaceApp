import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class rka$a
{
  public final rka a(laa paramlaa)
  {
    oXa.b(paramlaa, "data");
    Object localObject1 = paramlaa.k();
    oXa.a(localObject1, "data.childrenList");
    ArrayList localArrayList = new ArrayList();
    Object localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (maa)((Iterator)localObject2).next();
      oXa.a(localObject1, "it");
      localObject3 = ((maa)localObject1).o();
      if (localObject3 != null)
      {
        int i = qka.a[localObject3.ordinal()];
        if (i == 1) {
          break label224;
        }
        if (i == 2) {
          break label198;
        }
        if (i == 3) {
          break label172;
        }
        if (i == 4) {
          break label146;
        }
        if (i == 5) {}
      }
      else
      {
        localObject1 = null;
        break label247;
      }
      localObject3 = jka.a;
      localObject1 = ((maa)localObject1).k();
      oXa.a(localObject1, "it.adjustment");
      localObject1 = ((jka.a)localObject3).a((RY)localObject1);
      break label247;
      label146:
      localObject3 = Gka.a;
      localObject1 = ((maa)localObject1).p();
      oXa.a(localObject1, "it.overlayImage");
      localObject1 = ((Gka.a)localObject3).a((baa)localObject1);
      break label247;
      label172:
      localObject3 = kka.a;
      localObject1 = ((maa)localObject1).l();
      oXa.a(localObject1, "it.backgroundImage");
      localObject1 = ((kka.a)localObject3).a((VY)localObject1);
      break label247;
      label198:
      localObject3 = Kka.a;
      localObject1 = ((maa)localObject1).n();
      oXa.a(localObject1, "it.faceGraphic");
      localObject1 = ((Kka.a)localObject3).a((uZ)localObject1);
      break label247;
      label224:
      localObject3 = tka.a;
      localObject1 = ((maa)localObject1).m();
      oXa.a(localObject1, "it.effect");
      localObject1 = ((tka.a)localObject3).a((oaa)localObject1);
      label247:
      if (localObject1 != null) {
        localArrayList.add(localObject1);
      }
    }
    localObject2 = paramlaa.n();
    oXa.a(localObject2, "data.id");
    localObject1 = paramlaa.q();
    oXa.a(localObject1, "data.title");
    localObject1 = EPa.b((String)localObject1);
    if (localObject1 == null) {
      localObject1 = "";
    }
    Object localObject3 = paramlaa.p();
    oXa.a(localObject3, "data.resetTitle");
    localObject3 = EPa.b((String)localObject3);
    String str = paramlaa.m();
    oXa.a(str, "data.iconUrl");
    str = EPa.b(str);
    paramlaa = paramlaa.o();
    oXa.a(paramlaa, "data.resetIconUrl");
    return new rka((String)localObject2, (String)localObject1, (String)localObject3, localArrayList, str, EPa.b(paramlaa));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */