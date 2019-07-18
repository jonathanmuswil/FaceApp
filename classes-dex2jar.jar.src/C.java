import java.util.concurrent.Executor;

public class c
  extends e
{
  private static volatile c a;
  private static final Executor b = new a();
  private static final Executor c = new b();
  private e d = this.e;
  private e e = new d();
  
  public static c b()
  {
    if (a != null) {
      return a;
    }
    try
    {
      if (a == null)
      {
        c localc = new c;
        localc.<init>();
        a = localc;
      }
      return a;
    }
    finally {}
  }
  
  public void a(Runnable paramRunnable)
  {
    this.d.a(paramRunnable);
  }
  
  public boolean a()
  {
    return this.d.a();
  }
  
  public void b(Runnable paramRunnable)
  {
    this.d.b(paramRunnable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */