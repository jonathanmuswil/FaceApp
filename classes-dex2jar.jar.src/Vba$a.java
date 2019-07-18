import java.util.concurrent.Executor;

class Vba$a<Result>
  implements Executor
{
  private final Executor a;
  private final Vba b;
  
  public Vba$a(Executor paramExecutor, Vba paramVba)
  {
    this.a = paramExecutor;
    this.b = paramVba;
  }
  
  public void execute(Runnable paramRunnable)
  {
    this.a.execute(new Uba(this, paramRunnable, null));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Vba$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */