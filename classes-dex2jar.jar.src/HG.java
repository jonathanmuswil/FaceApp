import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class hg<K extends mg, V>
{
  private final hg.a<K, V> a = new hg.a();
  private final Map<K, hg.a<K, V>> b = new HashMap();
  
  private void a(hg.a<K, V> parama)
  {
    c(parama);
    hg.a locala = this.a;
    parama.d = locala;
    parama.c = locala.c;
    d(parama);
  }
  
  private void b(hg.a<K, V> parama)
  {
    c(parama);
    hg.a locala = this.a;
    parama.d = locala.d;
    parama.c = locala;
    d(parama);
  }
  
  private static <K, V> void c(hg.a<K, V> parama)
  {
    hg.a locala = parama.d;
    locala.c = parama.c;
    parama.c.d = locala;
  }
  
  private static <K, V> void d(hg.a<K, V> parama)
  {
    parama.c.d = parama;
    parama.d.c = parama;
  }
  
  public V a()
  {
    for (hg.a locala = this.a.d; !locala.equals(this.a); locala = locala.d)
    {
      Object localObject = locala.a();
      if (localObject != null) {
        return (V)localObject;
      }
      c(locala);
      this.b.remove(locala.a);
      ((mg)locala.a).a();
    }
    return null;
  }
  
  public V a(K paramK)
  {
    hg.a locala = (hg.a)this.b.get(paramK);
    if (locala == null)
    {
      locala = new hg.a(paramK);
      this.b.put(paramK, locala);
      paramK = locala;
    }
    else
    {
      paramK.a();
      paramK = locala;
    }
    a(paramK);
    return (V)paramK.a();
  }
  
  public void a(K paramK, V paramV)
  {
    hg.a locala = (hg.a)this.b.get(paramK);
    if (locala == null)
    {
      locala = new hg.a(paramK);
      b(locala);
      this.b.put(paramK, locala);
      paramK = locala;
    }
    else
    {
      paramK.a();
      paramK = locala;
    }
    paramK.a(paramV);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("GroupedLinkedMap( ");
    hg.a locala = this.a.c;
    int i = 0;
    while (!locala.equals(this.a))
    {
      i = 1;
      localStringBuilder.append('{');
      localStringBuilder.append(locala.a);
      localStringBuilder.append(':');
      localStringBuilder.append(locala.b());
      localStringBuilder.append("}, ");
      locala = locala.c;
    }
    if (i != 0) {
      localStringBuilder.delete(localStringBuilder.length() - 2, localStringBuilder.length());
    }
    localStringBuilder.append(" )");
    return localStringBuilder.toString();
  }
  
  private static class a<K, V>
  {
    final K a;
    private List<V> b;
    a<K, V> c = this;
    a<K, V> d = this;
    
    a()
    {
      this(null);
    }
    
    a(K paramK)
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */