import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class bna<T, R>
  implements DRa<T, R>
{
  public static final bna a = new bna();
  
  public final List<hka> a(WVa<bfa, aZ> paramWVa)
  {
    oXa.b(paramWVa, "<name for destructuring parameter 0>");
    bfa localbfa = (bfa)paramWVa.a();
    paramWVa = (aZ)paramWVa.b();
    oXa.a(paramWVa, "demoResponse");
    Object localObject = paramWVa.k();
    oXa.a(localObject, "demoResponse.imagesList");
    paramWVa = new ArrayList(mWa.a((Iterable)localObject, 10));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ZY localZY = (ZY)((Iterator)localObject).next();
      hka.a locala = hka.a;
      oXa.a(localZY, "it");
      oXa.a(localbfa, "host");
      paramWVa.add(locala.a(localZY, localbfa));
    }
    return paramWVa;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */