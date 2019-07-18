import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

final class od$d
  implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
{
  int a;
  int b;
  boolean c = false;
  
  od$d(od paramod)
  {
    this.a = (paramod.c() - 1);
    this.b = -1;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this.c)
    {
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      bool1 = bool2;
      if (jd.a(((Map.Entry)paramObject).getKey(), this.d.a(this.b, 0)))
      {
        bool1 = bool2;
        if (jd.a(((Map.Entry)paramObject).getValue(), this.d.a(this.b, 1))) {
          bool1 = true;
        }
      }
      return bool1;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public K getKey()
  {
    if (this.c) {
      return (K)this.d.a(this.b, 0);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public V getValue()
  {
    if (this.c) {
      return (V)this.d.a(this.b, 1);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public boolean hasNext()
  {
    boolean bool;
    if (this.b < this.a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    if (this.c)
    {
      Object localObject1 = this.d;
      int i = this.b;
      int j = 0;
      Object localObject2 = ((od)localObject1).a(i, 0);
      localObject1 = this.d.a(this.b, 1);
      if (localObject2 == null) {
        i = 0;
      } else {
        i = localObject2.hashCode();
      }
      if (localObject1 != null) {
        j = localObject1.hashCode();
      }
      return i ^ j;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public Map.Entry<K, V> next()
  {
    if (hasNext())
    {
      this.b += 1;
      this.c = true;
      return this;
    }
    throw new NoSuchElementException();
  }
  
  public void remove()
  {
    if (this.c)
    {
      this.d.a(this.b);
      this.b -= 1;
      this.a -= 1;
      this.c = false;
      return;
    }
    throw new IllegalStateException();
  }
  
  public V setValue(V paramV)
  {
    if (this.c) {
      return (V)this.d.a(this.b, paramV);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append("=");
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/od$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */