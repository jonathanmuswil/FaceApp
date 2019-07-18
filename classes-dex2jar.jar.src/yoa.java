import java.util.ArrayList;
import java.util.Iterator;

final class yoa
  extends pXa
  implements bXa<Integer>
{
  yoa(Boa paramBoa, ArrayList paramArrayList)
  {
    super(0);
  }
  
  public final int b()
  {
    eoa localeoa = eoa.j;
    Iterator localIterator = this.b.a.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      eoa.d locald = (eoa.d)localIterator.next();
      Object localObject = eoa.a(localeoa, locald.b());
      if (localObject != null)
      {
        localObject = eoa.a(localeoa, ((Zma.a.a)localObject).a());
        if (localObject != null)
        {
          if (((Boolean)localObject).booleanValue()) {
            this.c.add(locald.b());
          }
          i++;
        }
      }
      else
      {
        throw new IllegalStateException("Required value was null.");
      }
    }
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yoa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */