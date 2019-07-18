import java.util.Iterator;
import java.util.Map.Entry;

final class QA$b
  implements Iterator<Map.Entry<K, V>>
{
  private boolean a;
  private int b;
  
  QA$b(QA paramQA) {}
  
  public final boolean hasNext()
  {
    return this.b < this.c.a;
  }
  
  public final void remove()
  {
    int i = this.b - 1;
    if ((!this.a) && (i >= 0))
    {
      this.c.a(i);
      this.b -= 1;
      this.a = true;
      return;
    }
    throw new IllegalArgumentException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/QA$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */