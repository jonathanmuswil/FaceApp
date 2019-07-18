import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class joa<T1, T2, R>
  implements wRa<List<? extends eoa.c>, List<? extends eoa.c>, List<? extends eoa.c>>
{
  public static final joa a = new joa();
  
  public final ArrayList<eoa.c> a(List<eoa.c> paramList1, List<eoa.c> paramList2)
  {
    oXa.b(paramList1, "facebookImages");
    oXa.b(paramList2, "demoImages");
    ArrayList localArrayList = new ArrayList(paramList1.size() + paramList2.size());
    localArrayList.addAll(paramList2);
    localArrayList.addAll(paramList1);
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/joa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */