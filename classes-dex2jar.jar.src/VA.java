import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class va
  extends FrameLayout
  implements ya
{
  private final wa a;
  
  public void a()
  {
    this.a.a();
    throw null;
  }
  
  public void b()
  {
    this.a.b();
    throw null;
  }
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas)
  {
    wa localwa = this.a;
    if (localwa == null)
    {
      super.draw(paramCanvas);
      return;
    }
    localwa.a(paramCanvas);
    throw null;
  }
  
  public Drawable getCircularRevealOverlayDrawable()
  {
    this.a.c();
    throw null;
  }
  
  public int getCircularRevealScrimColor()
  {
    this.a.d();
    throw null;
  }
  
  public ya.d getRevealInfo()
  {
    this.a.e();
    throw null;
  }
  
  public boolean isOpaque()
  {
    wa localwa = this.a;
    if (localwa == null) {
      return super.isOpaque();
    }
    localwa.f();
    throw null;
  }
  
  public void setCircularRevealOverlayDrawable(Drawable paramDrawable)
  {
    this.a.a(paramDrawable);
    throw null;
  }
  
  public void setCircularRevealScrimColor(int paramInt)
  {
    this.a.a(paramInt);
    throw null;
  }
  
  public void setRevealInfo(ya.d paramd)
  {
    this.a.a(paramd);
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */