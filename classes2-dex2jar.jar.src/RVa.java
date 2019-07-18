import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class rva<T, R>
  implements DRa<T, R>
{
  public static final rva a = new rva();
  
  public final List<String> a(List<Bfa> paramList)
  {
    oXa.b(paramList, "it");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((Bfa)paramList.next()).getQuery());
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */