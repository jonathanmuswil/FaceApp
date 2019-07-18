import java.util.ArrayDeque;
import java.util.Queue;

class rg$b
{
  private final Queue<rg.a> a = new ArrayDeque();
  
  rg.a a()
  {
    synchronized (this.a)
    {
      rg.a locala = (rg.a)this.a.poll();
      ??? = locala;
      if (locala == null) {
        ??? = new rg.a();
      }
      return (rg.a)???;
    }
  }
  
  void a(rg.a parama)
  {
    synchronized (this.a)
    {
      if (this.a.size() < 10) {
        this.a.offer(parama);
      }
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/rg$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */