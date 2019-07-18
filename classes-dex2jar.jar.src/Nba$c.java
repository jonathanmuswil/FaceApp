import java.util.LinkedList;
import java.util.concurrent.Executor;

class Nba$c
  implements Executor
{
  final LinkedList<Runnable> a = new LinkedList();
  Runnable b;
  
  protected void a()
  {
    try
    {
      Runnable localRunnable = (Runnable)this.a.poll();
      this.b = localRunnable;
      if (localRunnable != null) {
        Nba.f.execute(this.b);
      }
      return;
    }
    finally {}
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      LinkedList localLinkedList = this.a;
      Oba localOba = new Oba;
      localOba.<init>(this, paramRunnable);
      localLinkedList.offer(localOba);
      if (this.b == null) {
        a();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Nba$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */