import android.util.Log;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;

final class tj$a$a
  implements ViewTreeObserver.OnPreDrawListener
{
  private final WeakReference<tj.a> a;
  
  tj$a$a(tj.a parama)
  {
    this.a = new WeakReference(parama);
  }
  
  public boolean onPreDraw()
  {
    if (Log.isLoggable("ViewTarget", 2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("OnGlobalLayoutListener called attachStateListener=");
      ((StringBuilder)localObject).append(this);
      Log.v("ViewTarget", ((StringBuilder)localObject).toString());
    }
    Object localObject = (tj.a)this.a.get();
    if (localObject != null) {
      ((tj.a)localObject).a();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tj$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */