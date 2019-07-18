import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class IR$c<T>
  implements Iterator<T>
{
  IR.d<K, V> a;
  IR.d<K, V> b;
  int c;
  
  IR$c(IR paramIR)
  {
    paramIR = this.d;
    this.a = paramIR.f.d;
    this.b = null;
    this.c = paramIR.e;
  }
  
  final IR.d<K, V> a()
  {
    IR.d locald = this.a;
    IR localIR = this.d;
    if (locald != localIR.f)
    {
      if (localIR.e == this.c)
      {
        this.a = locald.d;
        this.b = locald;
        return locald;
      }
      throw new ConcurrentModificationException();
    }
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (this.a != this.d.f) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void remove()
  {
    IR.d locald = this.b;
    if (locald != null)
    {
      this.d.a(locald, true);
      this.b = null;
      this.c = this.d.e;
      return;
    }
    throw new IllegalStateException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/IR$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */