import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

final class hRa$a
  extends WQa.c
{
  private final Handler a;
  private final boolean b;
  private volatile boolean c;
  
  hRa$a(Handler paramHandler, boolean paramBoolean)
  {
    this.a = paramHandler;
    this.b = paramBoolean;
  }
  
  @SuppressLint({"NewApi"})
  public kRa a(Runnable paramRunnable, long paramLong, TimeUnit paramTimeUnit)
  {
    if (paramRunnable != null)
    {
      if (paramTimeUnit != null)
      {
        if (this.c) {
          return lRa.a();
        }
        paramRunnable = zVa.a(paramRunnable);
        hRa.b localb = new hRa.b(this.a, paramRunnable);
        paramRunnable = Message.obtain(this.a, localb);
        paramRunnable.obj = this;
        if (this.b) {
          paramRunnable.setAsynchronous(true);
        }
        this.a.sendMessageDelayed(paramRunnable, paramTimeUnit.toMillis(paramLong));
        if (this.c)
        {
          this.a.removeCallbacks(localb);
          return lRa.a();
        }
        return localb;
      }
      throw new NullPointerException("unit == null");
    }
    throw new NullPointerException("run == null");
  }
  
  public boolean h()
  {
    return this.c;
  }
  
  public void i()
  {
    this.c = true;
    this.a.removeCallbacksAndMessages(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hRa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */