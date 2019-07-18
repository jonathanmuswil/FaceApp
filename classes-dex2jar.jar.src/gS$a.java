import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class gS$a<T>
  extends eR<T>
{
  private final KR<T> a;
  private final Map<String, gS.b> b;
  
  gS$a(KR<T> paramKR, Map<String, gS.b> paramMap)
  {
    this.a = paramKR;
    this.b = paramMap;
  }
  
  public T a(cT paramcT)
    throws IOException
  {
    if (paramcT.A() == dT.i)
    {
      paramcT.y();
      return null;
    }
    Object localObject1 = this.a.a();
    try
    {
      paramcT.b();
      while (paramcT.g())
      {
        Object localObject2 = paramcT.x();
        localObject2 = (gS.b)this.b.get(localObject2);
        if ((localObject2 != null) && (((gS.b)localObject2).c)) {
          ((gS.b)localObject2).a(paramcT, localObject1);
        } else {
          paramcT.B();
        }
      }
      paramcT.e();
      return (T)localObject1;
    }
    catch (IllegalAccessException paramcT)
    {
      throw new AssertionError(paramcT);
    }
    catch (IllegalStateException paramcT)
    {
      throw new _Q(paramcT);
    }
  }
  
  public void a(eT parameT, T paramT)
    throws IOException
  {
    if (paramT == null)
    {
      parameT.g();
      return;
    }
    parameT.b();
    try
    {
      Iterator localIterator = this.b.values().iterator();
      while (localIterator.hasNext())
      {
        gS.b localb = (gS.b)localIterator.next();
        if (localb.a(paramT))
        {
          parameT.b(localb.a);
          localb.a(parameT, paramT);
        }
      }
      parameT.d();
      return;
    }
    catch (IllegalAccessException parameT)
    {
      throw new AssertionError(parameT);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gS$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */