import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class pP$a
  implements Executor
{
  private final Handler a = new Handler(Looper.getMainLooper());
  
  public final void execute(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pP$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */