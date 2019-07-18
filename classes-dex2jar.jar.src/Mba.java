import android.os.Process;

public abstract class mba
  implements Runnable
{
  protected abstract void a();
  
  public final void run()
  {
    Process.setThreadPriority(10);
    a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */