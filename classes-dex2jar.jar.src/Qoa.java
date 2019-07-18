import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class qoa<T, R>
  implements DRa<T, R>
{
  public static final qoa a = new qoa();
  
  public final List<Tja> a(List<hka> paramList)
  {
    oXa.b(paramList, "demoImages");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new Tja((hka)paramList.next()));
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */