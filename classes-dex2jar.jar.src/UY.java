import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class uy<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  private final int a;
  private List<By> b;
  private Map<K, V> c;
  private boolean d;
  private volatile Dy e;
  private Map<K, V> f;
  private volatile xy g;
  
  private uy(int paramInt)
  {
    this.a = paramInt;
    this.b = Collections.emptyList();
    this.c = Collections.emptyMap();
    this.f = Collections.emptyMap();
  }
  
  private final int a(K paramK)
  {
    int i = this.b.size() - 1;
    if (i >= 0)
    {
      j = paramK.compareTo((Comparable)((By)this.b.get(i)).getKey());
      if (j > 0) {
        return -(i + 2);
      }
      if (j == 0) {
        return i;
      }
    }
    int j = 0;
    while (j <= i)
    {
      int k = (j + i) / 2;
      int m = paramK.compareTo((Comparable)((By)this.b.get(k)).getKey());
      if (m < 0) {
        i = k - 1;
      } else if (m > 0) {
        j = k + 1;
      } else {
        return k;
      }
    }
    return -(j + 1);
  }
  
  static <FieldDescriptorType extends nx<FieldDescriptorType>> uy<FieldDescriptorType, Object> a(int paramInt)
  {
    return new vy(paramInt);
  }
  
  private final V c(int paramInt)
  {
    f();
    Object localObject = ((By)this.b.remove(paramInt)).getValue();
    if (!this.c.isEmpty())
    {
      Iterator localIterator = g().entrySet().iterator();
      this.b.add(new By(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return (V)localObject;
  }
  
  private final void f()
  {
    if (!this.d) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  private final SortedMap<K, V> g()
  {
    f();
    if ((this.c.isEmpty()) && (!(this.c instanceof TreeMap)))
    {
      this.c = new TreeMap();
      this.f = ((TreeMap)this.c).descendingMap();
    }
    return (SortedMap)this.c;
  }
  
  public final V a(K paramK, V paramV)
  {
    f();
    int i = a(paramK);
    if (i >= 0) {
      return (V)((By)this.b.get(i)).setValue(paramV);
    }
    f();
    if ((this.b.isEmpty()) && (!(this.b instanceof ArrayList))) {
      this.b = new ArrayList(this.a);
    }
    i = -(i + 1);
    if (i >= this.a) {
      return (V)g().put(paramK, paramV);
    }
    int j = this.b.size();
    int k = this.a;
    if (j == k)
    {
      By localBy = (By)this.b.remove(k - 1);
      g().put((Comparable)localBy.getKey(), localBy.getValue());
    }
    this.b.add(i, new By(this, paramK, paramV));
    return null;
  }
  
  public final boolean a()
  {
    return this.d;
  }
  
  public final Map.Entry<K, V> b(int paramInt)
  {
    return (Map.Entry)this.b.get(paramInt);
  }
  
  public void b()
  {
    if (!this.d)
    {
      Map localMap;
      if (this.c.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.c);
      }
      this.c = localMap;
      if (this.f.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(this.f);
      }
      this.f = localMap;
      this.d = true;
    }
  }
  
  public final int c()
  {
    return this.b.size();
  }
  
  public void clear()
  {
    f();
    if (!this.b.isEmpty()) {
      this.b.clear();
    }
    if (!this.c.isEmpty()) {
      this.c.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    return (a((Comparable)paramObject) >= 0) || (this.c.containsKey(paramObject));
  }
  
  public final Iterable<Map.Entry<K, V>> d()
  {
    if (this.c.isEmpty()) {
      return yy.a();
    }
    return this.c.entrySet();
  }
  
  final Set<Map.Entry<K, V>> e()
  {
    if (this.g == null) {
      this.g = new xy(this, null);
    }
    return this.g;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    if (this.e == null) {
      this.e = new Dy(this, null);
    }
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof uy)) {
      return super.equals(paramObject);
    }
    paramObject = (uy)paramObject;
    int i = size();
    if (i != ((uy)paramObject).size()) {
      return false;
    }
    int j = c();
    if (j != ((uy)paramObject).c()) {
      return entrySet().equals(((uy)paramObject).entrySet());
    }
    for (int k = 0; k < j; k++) {
      if (!b(k).equals(((uy)paramObject).b(k))) {
        return false;
      }
    }
    if (j != i) {
      return this.c.equals(((uy)paramObject).c);
    }
    return true;
  }
  
  public V get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = a((Comparable)paramObject);
    if (i >= 0) {
      return (V)((By)this.b.get(i)).getValue();
    }
    return (V)this.c.get(paramObject);
  }
  
  public int hashCode()
  {
    int i = c();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((By)this.b.get(j)).hashCode();
      j++;
    }
    j = k;
    if (this.c.size() > 0) {
      j = k + this.c.hashCode();
    }
    return j;
  }
  
  public V remove(Object paramObject)
  {
    f();
    paramObject = (Comparable)paramObject;
    int i = a((Comparable)paramObject);
    if (i >= 0) {
      return (V)c(i);
    }
    if (this.c.isEmpty()) {
      return null;
    }
    return (V)this.c.remove(paramObject);
  }
  
  public int size()
  {
    return this.b.size() + this.c.size();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */