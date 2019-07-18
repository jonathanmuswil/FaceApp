import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class oka$a
{
  public final oka a(kZ paramkZ)
  {
    oXa.b(paramkZ, "data");
    Object localObject1 = paramkZ.l();
    oXa.a(localObject1, "data.childrenList");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject2 = localIterator.next();
      localObject1 = null;
      if (i >= 0)
      {
        localObject2 = (kZ.b)localObject2;
        oXa.a(localObject2, "child");
        kZ.b.b localb = ((kZ.b)localObject2).l();
        if (localb != null)
        {
          int j = nka.a[localb.ordinal()];
          if (j != 1)
          {
            if (j == 2)
            {
              localObject1 = rka.a;
              localObject2 = ((kZ.b)localObject2).m();
              oXa.a(localObject2, "child.tool");
              localObject1 = ((rka.a)localObject1).a((laa)localObject2);
            }
          }
          else
          {
            localObject1 = mka.a;
            localObject2 = ((kZ.b)localObject2).k();
            oXa.a(localObject2, "child.filtersGroup");
            localObject1 = ((mka.a)localObject1).a(i, (iZ)localObject2);
          }
        }
        if (localObject1 != null) {
          localArrayList.add(localObject1);
        }
        i++;
      }
      else
      {
        mWa.c();
        throw null;
      }
    }
    return new oka(paramkZ.k(), localArrayList);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */