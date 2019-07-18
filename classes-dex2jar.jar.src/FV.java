import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class fv
{
  static int a(Set<?> paramSet)
  {
    Iterator localIterator = paramSet.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      paramSet = localIterator.next();
      int j;
      if (paramSet != null) {
        j = paramSet.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
  
  static boolean a(Set<?> paramSet, Object paramObject)
  {
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool = paramSet.containsAll((Collection)paramObject);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException|ClassCastException paramSet)
    {
      for (;;) {}
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */