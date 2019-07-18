import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.List;

public class hi
  extends Drawable
  implements li.b, Animatable, La
{
  private final hi.a a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e = true;
  private int f;
  private int g = -1;
  private boolean h;
  private Paint i;
  private Rect j;
  private List<La.a> k;
  
  public hi(Context paramContext, Re paramRe, m<Bitmap> paramm, int paramInt1, int paramInt2, Bitmap paramBitmap)
  {
    this(new hi.a(new li(Ae.a(paramContext), paramRe, paramInt1, paramInt2, paramm, paramBitmap)));
  }
  
  hi(hi.a parama)
  {
    Nj.a(parama);
    this.a = ((hi.a)parama);
  }
  
  private Drawable.Callback h()
  {
    for (Drawable.Callback localCallback = getCallback(); (localCallback instanceof Drawable); localCallback = ((Drawable)localCallback).getCallback()) {}
    return localCallback;
  }
  
  private Rect i()
  {
    if (this.j == null) {
      this.j = new Rect();
    }
    return this.j;
  }
  
  private Paint j()
  {
    if (this.i == null) {
      this.i = new Paint(2);
    }
    return this.i;
  }
  
  private void k()
  {
    List localList = this.k;
    if (localList != null)
    {
      int m = 0;
      int n = localList.size();
      while (m < n)
      {
        ((La.a)this.k.get(m)).a(this);
        m++;
      }
    }
  }
  
  private void l()
  {
    this.f = 0;
  }
  
  private void m()
  {
    Nj.a(this.d ^ true, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    if (this.a.a.f() == 1)
    {
      invalidateSelf();
    }
    else if (!this.b)
    {
      this.b = true;
      this.a.a.a(this);
      invalidateSelf();
    }
  }
  
  private void n()
  {
    this.b = false;
    this.a.a.b(this);
  }
  
  public void a()
  {
    if (h() == null)
    {
      stop();
      invalidateSelf();
      return;
    }
    invalidateSelf();
    if (e() == d() - 1) {
      this.f += 1;
    }
    int m = this.g;
    if ((m != -1) && (this.f >= m))
    {
      k();
      stop();
    }
  }
  
  public void a(m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this.a.a.a(paramm, paramBitmap);
  }
  
  public ByteBuffer b()
  {
    return this.a.a.b();
  }
  
  public Bitmap c()
  {
    return this.a.a.e();
  }
  
  public int d()
  {
    return this.a.a.f();
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.d) {
      return;
    }
    if (this.h)
    {
      Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), i());
      this.h = false;
    }
    paramCanvas.drawBitmap(this.a.a.c(), null, i(), j());
  }
  
  public int e()
  {
    return this.a.a.d();
  }
  
  public int f()
  {
    return this.a.a.h();
  }
  
  public void g()
  {
    this.d = true;
    this.a.a.a();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return this.a;
  }
  
  public int getIntrinsicHeight()
  {
    return this.a.a.g();
  }
  
  public int getIntrinsicWidth()
  {
    return this.a.a.i();
  }
  
  public int getOpacity()
  {
    return -2;
  }
  
  public boolean isRunning()
  {
    return this.b;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    this.h = true;
  }
  
  public void setAlpha(int paramInt)
  {
    j().setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    j().setColorFilter(paramColorFilter);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Nj.a(this.d ^ true, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    this.e = paramBoolean1;
    if (!paramBoolean1) {
      n();
    } else if (this.c) {
      m();
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    this.c = true;
    l();
    if (this.e) {
      m();
    }
  }
  
  public void stop()
  {
    this.c = false;
    n();
  }
  
  static final class a
    extends Drawable.ConstantState
  {
    final li a;
    
    a(li paramli)
    {
      this.a = paramli;
    }
    
    public int getChangingConfigurations()
    {
      return 0;
    }
    
    public Drawable newDrawable()
    {
      return new hi(this);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return newDrawable();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */