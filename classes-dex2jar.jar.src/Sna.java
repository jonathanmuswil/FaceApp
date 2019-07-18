import java.util.Iterator;
import java.util.List;

final class sna<T, R>
  implements DRa<T, aRa<? extends R>>
{
  public static final sna a = new sna();
  
  public final XQa<Yea> a(List<Yea> paramList)
  {
    oXa.b(paramList, "albums");
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = localIterator.next();
      if (oXa.a(((Yea)paramList).getType(), "profile")) {
        break label49;
      }
    }
    paramList = null;
    label49:
    paramList = (Yea)paramList;
    if (paramList != null)
    {
      paramList = XQa.a(paramList);
      if (paramList != null) {}
    }
    else
    {
      paramList = XQa.a(new IllegalStateException("can't find Facebook album with avatars"));
    }
    return paramList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */