import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class Ua$g
  extends Drawable.ConstantState
{
  int a;
  Ua.f b;
  ColorStateList c = null;
  PorterDuff.Mode d = Ua.b;
  boolean e;
  Bitmap f;
  ColorStateList g;
  PorterDuff.Mode h;
  int i;
  boolean j;
  boolean k;
  Paint l;
  
  public Ua$g()
  {
    this.b = new Ua.f();
  }
  
  public Ua$g(g paramg)
  {
    if (paramg != null)
    {
      this.a = paramg.a;
      this.b = new Ua.f(paramg.b);
      Paint localPaint = paramg.b.f;
      if (localPaint != null) {
        this.b.f = new Paint(localPaint);
      }
      localPaint = paramg.b.e;
      if (localPaint != null) {
        this.b.e = new Paint(localPaint);
      }
      this.c = paramg.c;
      this.d = paramg.d;
      this.e = paramg.e;
    }
  }
  
  public Paint a(ColorFilter paramColorFilter)
  {
    if ((!b()) && (paramColorFilter == null)) {
      return null;
    }
    if (this.l == null)
    {
      this.l = new Paint();
      this.l.setFilterBitmap(true);
    }
    this.l.setAlpha(this.b.getRootAlpha());
    this.l.setColorFilter(paramColorFilter);
    return this.l;
  }
  
  public void a(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
  {
    paramColorFilter = a(paramColorFilter);
    paramCanvas.drawBitmap(this.f, null, paramRect, paramColorFilter);
  }
  
  public boolean a()
  {
    return (!this.k) && (this.g == this.c) && (this.h == this.d) && (this.j == this.e) && (this.i == this.b.getRootAlpha());
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.f.getWidth()) && (paramInt2 == this.f.getHeight());
  }
  
  public boolean a(int[] paramArrayOfInt)
  {
    boolean bool = this.b.a(paramArrayOfInt);
    this.k |= bool;
    return bool;
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    if ((this.f == null) || (!a(paramInt1, paramInt2)))
    {
      this.f = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      this.k = true;
    }
  }
  
  public boolean b()
  {
    boolean bool;
    if (this.b.getRootAlpha() < 255) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.f.eraseColor(0);
    Canvas localCanvas = new Canvas(this.f);
    this.b.a(localCanvas, paramInt1, paramInt2, null);
  }
  
  public boolean c()
  {
    return this.b.a();
  }
  
  public void d()
  {
    this.g = this.c;
    this.h = this.d;
    this.i = this.b.getRootAlpha();
    this.j = this.e;
    this.k = false;
  }
  
  public int getChangingConfigurations()
  {
    return this.a;
  }
  
  public Drawable newDrawable()
  {
    return new Ua(this);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return new Ua(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ua$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */