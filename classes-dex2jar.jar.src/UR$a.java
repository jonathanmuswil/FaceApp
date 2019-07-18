import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

final class UR$a<E>
  extends eR<Collection<E>>
{
  private final eR<E> a;
  private final KR<? extends Collection<E>> b;
  
  public UR$a(MQ paramMQ, Type paramType, eR<E> parameR, KR<? extends Collection<E>> paramKR)
  {
    this.a = new nS(paramMQ, parameR, paramType);
    this.b = paramKR;
  }
  
  public Collection<E> a(cT paramcT)
    throws IOException
  {
    if (paramcT.A() == dT.i)
    {
      paramcT.y();
      return null;
    }
    Collection localCollection = (Collection)this.b.a();
    paramcT.a();
    while (paramcT.g()) {
      localCollection.add(this.a.a(paramcT));
    }
    paramcT.d();
    return localCollection;
  }
  
  public void a(eT parameT, Collection<E> paramCollection)
    throws IOException
  {
    if (paramCollection == null)
    {
      parameT.g();
      return;
    }
    parameT.a();
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      Object localObject = paramCollection.next();
      this.a.a(parameT, localObject);
    }
    parameT.c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/UR$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */