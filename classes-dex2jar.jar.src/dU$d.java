import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class dU$d
  extends AbstractSet<Map.Entry<K, V>>
{
  private dU$d(dU paramdU) {}
  
  public boolean a(Map.Entry<K, V> paramEntry)
  {
    if (!contains(paramEntry))
    {
      this.a.a((Comparable)paramEntry.getKey(), paramEntry.getValue());
      return true;
    }
    return false;
  }
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    Object localObject = (Map.Entry)paramObject;
    paramObject = this.a.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool;
    if ((paramObject != localObject) && ((paramObject == null) || (!paramObject.equals(localObject)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new dU.c(this.a, null);
  }
  
  public boolean remove(Object paramObject)
  {
    paramObject = (Map.Entry)paramObject;
    if (contains(paramObject))
    {
      this.a.remove(((Map.Entry)paramObject).getKey());
      return true;
    }
    return false;
  }
  
  public int size()
  {
    return this.a.size();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dU$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */