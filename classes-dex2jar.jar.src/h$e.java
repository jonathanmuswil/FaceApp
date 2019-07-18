import java.util.Iterator;
import java.util.Map.Entry;

abstract class h$e<K, V>
  implements Iterator<Map.Entry<K, V>>, h.f<K, V>
{
  h.c<K, V> a;
  h.c<K, V> b;
  
  h$e(h.c<K, V> paramc1, h.c<K, V> paramc2)
  {
    this.a = paramc2;
    this.b = paramc1;
  }
  
  private h.c<K, V> a()
  {
    h.c localc1 = this.b;
    h.c localc2 = this.a;
    if ((localc1 != localc2) && (localc2 != null)) {
      return c(localc1);
    }
    return null;
  }
  
  public void a(h.c<K, V> paramc)
  {
    if ((this.a == paramc) && (paramc == this.b))
    {
      this.b = null;
      this.a = null;
    }
    h.c localc = this.a;
    if (localc == paramc) {
      this.a = b(localc);
    }
    if (this.b == paramc) {
      this.b = a();
    }
  }
  
  abstract h.c<K, V> b(h.c<K, V> paramc);
  
  abstract h.c<K, V> c(h.c<K, V> paramc);
  
  public boolean hasNext()
  {
    boolean bool;
    if (this.b != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Map.Entry<K, V> next()
  {
    h.c localc = this.b;
    this.b = a();
    return localc;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/h$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */