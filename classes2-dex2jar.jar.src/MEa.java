import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class mEa<T, R>
  implements DRa<T, R>
{
  public static final mEa a = new mEa();
  
  public final QQa<List<AEa.c>> a(List<fEa.b> paramList)
  {
    oXa.b(paramList, "parts");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((fEa.b)paramList.next()).e());
    }
    return QQa.a(localArrayList, lEa.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */