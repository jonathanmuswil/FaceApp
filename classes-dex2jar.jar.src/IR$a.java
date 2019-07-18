import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class IR$a
  extends AbstractSet<Map.Entry<K, V>>
{
  IR$a(IR paramIR) {}
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof Map.Entry)) && (this.a.a((Map.Entry)paramObject) != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator<Map.Entry<K, V>> iterator()
  {
    return new HR(this);
  }
  
  public boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = this.a.a((Map.Entry)paramObject);
    if (paramObject == null) {
      return false;
    }
    this.a.a((IR.d)paramObject, true);
    return true;
  }
  
  public int size()
  {
    return this.a.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/IR$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */