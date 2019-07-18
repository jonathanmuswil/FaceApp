import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class dU$c
  implements Iterator<Map.Entry<K, V>>
{
  private int a = -1;
  private boolean b;
  private Iterator<Map.Entry<K, V>> c;
  
  private dU$c(dU paramdU) {}
  
  private Iterator<Map.Entry<K, V>> a()
  {
    if (this.c == null) {
      this.c = dU.c(this.d).entrySet().iterator();
    }
    return this.c;
  }
  
  public boolean hasNext()
  {
    int i = this.a;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i + 1 >= dU.b(this.d).size()) {
      if (a().hasNext()) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public Map.Entry<K, V> next()
  {
    this.b = true;
    int i = this.a + 1;
    this.a = i;
    if (i < dU.b(this.d).size()) {
      return (Map.Entry)dU.b(this.d).get(this.a);
    }
    return (Map.Entry)a().next();
  }
  
  public void remove()
  {
    if (this.b)
    {
      this.b = false;
      dU.a(this.d);
      if (this.a < dU.b(this.d).size())
      {
        dU localdU = this.d;
        int i = this.a;
        this.a = (i - 1);
        dU.a(localdU, i);
      }
      else
      {
        a().remove();
      }
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dU$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */