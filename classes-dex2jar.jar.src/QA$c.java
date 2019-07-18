import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class QA$c
  extends AbstractSet<Map.Entry<K, V>>
{
  QA$c(QA paramQA) {}
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new QA.b(this.a);
  }
  
  public final int size()
  {
    return this.a.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/QA$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */