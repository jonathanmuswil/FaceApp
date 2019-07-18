import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class yla
  implements Hm.a<List<? extends Bfa>>
{
  public String a(List<Bfa> paramList)
  {
    oXa.b(paramList, "value");
    return mWa.a(paramList, "\n\n", null, null, 0, null, xla.b, 30, null);
  }
  
  public List<Bfa> a(String paramString)
  {
    oXa.b(paramString, "serialized");
    int i;
    if (paramString.length() == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramString = mWa.a();
    }
    else
    {
      Object localObject = zYa.a(paramString, new String[] { "\n\n" }, false, 0, 6, null);
      paramString = new ArrayList(mWa.a((Iterable)localObject, 10));
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        paramString.add(Bfa.Companion.deserialize((String)localObject));
      }
      paramString = mWa.j(paramString);
    }
    return paramString;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */