import java.util.Iterator;
import java.util.NoSuchElementException;

final class od$a<T>
  implements Iterator<T>
{
  final int a;
  int b;
  int c;
  boolean d = false;
  
  od$a(od paramod, int paramInt)
  {
    this.a = paramInt;
    this.b = paramod.c();
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (this.c < this.b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public T next()
  {
    if (hasNext())
    {
      Object localObject = this.e.a(this.c, this.a);
      this.c += 1;
      this.d = true;
      return (T)localObject;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    if (this.d)
    {
      this.c -= 1;
      this.b -= 1;
      this.d = false;
      this.e.a(this.c);
      return;
    }
    throw new IllegalStateException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/od$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */