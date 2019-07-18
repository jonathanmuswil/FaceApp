import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class dB$b
  extends AbstractSet<Map.Entry<String, Object>>
{
  private final aB a;
  
  dB$b(dB paramdB)
  {
    this.a = ((aB)new YA(paramdB, paramdB.b.b()).entrySet());
  }
  
  public final void clear()
  {
    this.b.a.clear();
    this.a.clear();
  }
  
  public final Iterator<Map.Entry<String, Object>> iterator()
  {
    return new dB.a(this.b, this.a);
  }
  
  public final int size()
  {
    return this.b.a.size() + this.a.size();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dB$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */