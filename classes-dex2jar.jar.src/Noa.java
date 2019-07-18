import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class noa<T, R>
  implements DRa<T, R>
{
  public static final noa a = new noa();
  
  public final List<eoa.d> a(List<Vja> paramList)
  {
    oXa.b(paramList, "images");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new eoa.d(new eoa.c((Vja)paramList.next(), eoa.b.a), 0L, null, 6, null));
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/noa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */