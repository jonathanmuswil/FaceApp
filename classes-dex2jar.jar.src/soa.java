import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class soa<T1, T2, T3, T4, R>
  implements CRa<Object, List<? extends eoa.d>, List<? extends eoa.d>, List<? extends eoa.d>, List<eoa.d>>
{
  public static final soa a = new soa();
  
  public final ArrayList<eoa.d> a(Object paramObject, List<eoa.d> paramList1, List<eoa.d> paramList2, List<eoa.d> paramList3)
  {
    oXa.b(paramObject, "<anonymous parameter 0>");
    oXa.b(paramList1, "galleryImages");
    oXa.b(paramList2, "facebookImages");
    oXa.b(paramList3, "demoImages");
    paramObject = new ArrayList(paramList1.size() + paramList2.size() + paramList3.size());
    ((ArrayList)paramObject).addAll(paramList3);
    ((ArrayList)paramObject).addAll(paramList2);
    ((ArrayList)paramObject).addAll(paramList1);
    return (ArrayList<eoa.d>)paramObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/soa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */