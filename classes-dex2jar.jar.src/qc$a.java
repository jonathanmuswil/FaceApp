import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class qc$a
{
  public abstract void a(int paramInt);
  
  public final void a(int paramInt, Handler paramHandler)
  {
    Handler localHandler = paramHandler;
    if (paramHandler == null) {
      localHandler = new Handler(Looper.getMainLooper());
    }
    localHandler.post(new pc(this, paramInt));
  }
  
  public abstract void a(Typeface paramTypeface);
  
  public final void a(Typeface paramTypeface, Handler paramHandler)
  {
    Handler localHandler = paramHandler;
    if (paramHandler == null) {
      localHandler = new Handler(Looper.getMainLooper());
    }
    localHandler.post(new oc(this, paramTypeface));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qc$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */