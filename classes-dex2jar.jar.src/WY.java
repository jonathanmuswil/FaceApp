import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class wy
  implements Iterator<Map.Entry<K, V>>
{
  private int a = uy.b(this.c).size();
  private Iterator<Map.Entry<K, V>> b;
  
  private wy(uy paramuy) {}
  
  private final Iterator<Map.Entry<K, V>> a()
  {
    if (this.b == null) {
      this.b = uy.d(this.c).entrySet().iterator();
    }
    return this.b;
  }
  
  public final boolean hasNext()
  {
    int i = this.a;
    return ((i > 0) && (i <= uy.b(this.c).size())) || (a().hasNext());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */