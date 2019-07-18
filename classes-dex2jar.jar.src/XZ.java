import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public final class xz<K, V>
{
  private Object[] a;
  private int b;
  private boolean c;
  
  public xz()
  {
    this(4);
  }
  
  xz(int paramInt)
  {
    this.a = new Object[paramInt * 2];
    this.b = 0;
    this.c = false;
  }
  
  private final void a(int paramInt)
  {
    paramInt <<= 1;
    Object[] arrayOfObject = this.a;
    if (paramInt > arrayOfObject.length)
    {
      this.a = Arrays.copyOf(arrayOfObject, rz.a(arrayOfObject.length, paramInt));
      this.c = false;
    }
  }
  
  public final wz<K, V> a()
  {
    this.c = true;
    return Az.a(this.b, this.a);
  }
  
  public final xz<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      a(this.b + ((Collection)paramIterable).size());
    }
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramIterable.next();
      a(localEntry.getKey(), localEntry.getValue());
    }
    return this;
  }
  
  public final xz<K, V> a(K paramK, V paramV)
  {
    a(this.b + 1);
    nz.a(paramK, paramV);
    Object[] arrayOfObject = this.a;
    int i = this.b;
    arrayOfObject[(i * 2)] = paramK;
    arrayOfObject[(i * 2 + 1)] = paramV;
    this.b = (i + 1);
    return this;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */