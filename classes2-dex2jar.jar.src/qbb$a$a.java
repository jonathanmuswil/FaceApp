import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

class qbb$a$a
  implements Executor
{
  private final Handler a = new Handler(Looper.getMainLooper());
  
  public void execute(Runnable paramRunnable)
  {
    this.a.post(paramRunnable);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qbb$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */