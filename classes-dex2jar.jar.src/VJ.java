import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class vj
  implements xj<Drawable>
{
  private final int a;
  private final boolean b;
  
  public vj(int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramBoolean;
  }
  
  public boolean a(Drawable paramDrawable, xj.a parama)
  {
    Drawable localDrawable = parama.a();
    Object localObject = localDrawable;
    if (localDrawable == null) {
      localObject = new ColorDrawable(0);
    }
    paramDrawable = new TransitionDrawable(new Drawable[] { localObject, paramDrawable });
    paramDrawable.setCrossFadeEnabled(this.b);
    paramDrawable.startTransition(this.a);
    parama.d(paramDrawable);
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */