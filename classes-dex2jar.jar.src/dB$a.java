import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class dB$a
  implements Iterator<Map.Entry<String, Object>>
{
  private boolean a;
  private final Iterator<Map.Entry<String, Object>> b;
  private final Iterator<Map.Entry<String, Object>> c;
  
  dB$a(dB paramdB, aB paramaB)
  {
    this.b = ((_A)paramaB.iterator());
    this.c = paramdB.a.entrySet().iterator();
  }
  
  public final boolean hasNext()
  {
    return (this.b.hasNext()) || (this.c.hasNext());
  }
  
  public final void remove()
  {
    if (this.a) {
      this.c.remove();
    }
    this.b.remove();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dB$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */