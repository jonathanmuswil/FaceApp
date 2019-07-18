import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class ioa<T, R>
  implements DRa<T, R>
{
  public static final ioa a = new ioa();
  
  public final List<eoa.c> a(List<Tja> paramList)
  {
    oXa.b(paramList, "images");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new eoa.c((Tja)paramList.next(), eoa.b.c));
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ioa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */