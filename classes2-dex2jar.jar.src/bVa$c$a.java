import java.util.concurrent.PriorityBlockingQueue;

final class bVa$c$a
  implements Runnable
{
  final bVa.b a;
  
  bVa$c$a(bVa.c paramc, bVa.b paramb)
  {
    this.a = paramb;
  }
  
  public void run()
  {
    bVa.b localb = this.a;
    localb.d = true;
    this.b.a.remove(localb);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bVa$c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */