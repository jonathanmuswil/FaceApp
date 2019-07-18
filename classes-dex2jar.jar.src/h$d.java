import java.util.Iterator;
import java.util.Map.Entry;

class h$d
  implements Iterator<Map.Entry<K, V>>, h.f<K, V>
{
  private h.c<K, V> a;
  private boolean b = true;
  
  private h$d(h paramh) {}
  
  public void a(h.c<K, V> paramc)
  {
    h.c localc = this.a;
    if (paramc == localc)
    {
      this.a = localc.d;
      boolean bool;
      if (this.a == null) {
        bool = true;
      } else {
        bool = false;
      }
      this.b = bool;
    }
  }
  
  public boolean hasNext()
  {
    boolean bool1 = this.b;
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if (h.a(this.c) == null) {
        bool3 = false;
      }
      return bool3;
    }
    h.c localc = this.a;
    if ((localc != null) && (localc.c != null)) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public Map.Entry<K, V> next()
  {
    if (this.b)
    {
      this.b = false;
      this.a = h.a(this.c);
    }
    else
    {
      h.c localc = this.a;
      if (localc != null) {
        localc = localc.c;
      } else {
        localc = null;
      }
      this.a = localc;
    }
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/h$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */