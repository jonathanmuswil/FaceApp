import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class moa<T, R>
  implements DRa<T, R>
{
  public static final moa a = new moa();
  
  public final List<Vja> a(List<Bna.a> paramList)
  {
    oXa.b(paramList, "galleryImages");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (Bna.a)localIterator.next();
      localArrayList.add(new Vja(paramList.c(), paramList.b()));
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/moa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */