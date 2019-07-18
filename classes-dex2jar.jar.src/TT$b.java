import java.util.Iterator;
import java.util.Map.Entry;

class TT$b<K>
  implements Iterator<Map.Entry<K, Object>>
{
  private Iterator<Map.Entry<K, Object>> a;
  
  public TT$b(Iterator<Map.Entry<K, Object>> paramIterator)
  {
    this.a = paramIterator;
  }
  
  public boolean hasNext()
  {
    return this.a.hasNext();
  }
  
  public Map.Entry<K, Object> next()
  {
    Map.Entry localEntry = (Map.Entry)this.a.next();
    if ((localEntry.getValue() instanceof TT)) {
      return new TT.a(localEntry, null);
    }
    return localEntry;
  }
  
  public void remove()
  {
    this.a.remove();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/TT$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */