import java.util.ArrayList;
import java.util.List;

class hg$a<K, V>
{
  final K a;
  private List<V> b;
  a<K, V> c = this;
  a<K, V> d = this;
  
  hg$a()
  {
    this(null);
  }
  
  hg$a(K paramK)
  {
    this.a = paramK;
  }
  
  public V a()
  {
    int i = b();
    Object localObject;
    if (i > 0) {
      localObject = this.b.remove(i - 1);
    } else {
      localObject = null;
    }
    return (V)localObject;
  }
  
  public void a(V paramV)
  {
    if (this.b == null) {
      this.b = new ArrayList();
    }
    this.b.add(paramV);
  }
  
  public int b()
  {
    List localList = this.b;
    int i;
    if (localList != null) {
      i = localList.size();
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hg$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */