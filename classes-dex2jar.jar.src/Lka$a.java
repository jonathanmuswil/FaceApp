import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class lka$a
{
  public final lka a(gZ paramgZ)
  {
    oXa.b(paramgZ, "data");
    String str1 = paramgZ.l();
    oXa.a(str1, "data.id");
    String str2 = paramgZ.o();
    oXa.a(str2, "data.title");
    boolean bool = paramgZ.m();
    Object localObject1;
    if (paramgZ.q())
    {
      localObject1 = VOa.e;
      localObject2 = paramgZ.n();
      oXa.a(localObject2, "data.preview");
      localObject2 = ((daa)localObject2).m();
      oXa.a(localObject2, "data.preview.gender");
      localObject1 = ((VOa.a)localObject1).a((OZ)localObject2);
    }
    else
    {
      localObject1 = VOa.a;
    }
    Object localObject2 = paramgZ.p();
    oXa.a(localObject2, "it");
    if (!(((Collection)localObject2).isEmpty() ^ true)) {
      localObject2 = null;
    }
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
      localObject4 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject2 = (gZ.b)((Iterator)localObject4).next();
        oXa.a(localObject2, "it");
        ((Collection)localObject3).add(((gZ.b)localObject2).k());
      }
      localObject2 = localObject3;
    }
    else
    {
      localObject2 = null;
    }
    Object localObject4 = paramgZ.k();
    oXa.a(localObject4, "data.iconUrl");
    if (paramgZ.q())
    {
      localObject3 = paramgZ.n();
      oXa.a(localObject3, "data.preview");
      localObject3 = ((daa)localObject3).l();
    }
    else
    {
      localObject3 = null;
    }
    if (paramgZ.q())
    {
      paramgZ = paramgZ.n();
      oXa.a(paramgZ, "data.preview");
      paramgZ = paramgZ.n();
      oXa.a(paramgZ, "data.preview.second");
      paramgZ = EPa.b(paramgZ);
    }
    else
    {
      paramgZ = null;
    }
    return new lka(str1, str2, bool, (VOa)localObject1, (List)localObject2, (String)localObject4, (String)localObject3, paramgZ);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */