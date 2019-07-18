import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class tja<T, R>
  implements DRa<T, R>
{
  public static final tja a = new tja();
  
  public final List<Wja> a(Cfa paramCfa)
  {
    oXa.b(paramCfa, "res");
    Object localObject = paramCfa.getResults();
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.add(new Wja((Afa)((Iterator)localObject).next(), paramCfa.getQuery_id()));
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */