import java.util.AbstractSet;
import java.util.Iterator;

final class IR$b
  extends AbstractSet<K>
{
  IR$b(IR paramIR) {}
  
  public void clear()
  {
    this.a.clear();
  }
  
  public boolean contains(Object paramObject)
  {
    return this.a.containsKey(paramObject);
  }
  
  public Iterator<K> iterator()
  {
    return new JR(this);
  }
  
  public boolean remove(Object paramObject)
  {
    boolean bool;
    if (this.a.b(paramObject) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int size()
  {
    return this.a.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/IR$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */