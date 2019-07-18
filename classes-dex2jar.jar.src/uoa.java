import java.util.Iterator;
import java.util.List;

final class uoa<T, R>
  implements DRa<T, R>
{
  public static final uoa a = new uoa();
  
  public final List<eoa.d> a(List<eoa.d> paramList)
  {
    oXa.b(paramList, "images");
    long l = System.currentTimeMillis() * 'Ϩ';
    mWa.d(paramList);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      eoa.d locald = (eoa.d)localIterator.next();
      Zma.a.a locala = eoa.a(eoa.j, locald.b());
      if (locala != null)
      {
        locald.a(locala.b());
        locald.a(eoa.a(eoa.j, locala.a()));
      }
      else
      {
        locald.a(l);
        l += 1L;
        eoa.a(eoa.j, locald.b(), new Zma.a.a(locald.a(), null, 2, null));
      }
    }
    eoa.f(eoa.j);
    if (paramList.size() > 1) {
      mWa.a(paramList, new toa());
    }
    return paramList;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */