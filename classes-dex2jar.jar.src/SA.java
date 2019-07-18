import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.internal.d;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.y;
import android.widget.Button;

class sa
{
  private static final boolean a;
  private final qa b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private PorterDuff.Mode i;
  private ColorStateList j;
  private ColorStateList k;
  private ColorStateList l;
  private final Paint m = new Paint(1);
  private final Rect n = new Rect();
  private final RectF o = new RectF();
  private GradientDrawable p;
  private Drawable q;
  private GradientDrawable r;
  private Drawable s;
  private GradientDrawable t;
  private GradientDrawable u;
  private GradientDrawable v;
  private boolean w = false;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    a = bool;
  }
  
  public sa(qa paramqa)
  {
    this.b = paramqa;
  }
  
  private InsetDrawable a(Drawable paramDrawable)
  {
    return new InsetDrawable(paramDrawable, this.c, this.e, this.d, this.f);
  }
  
  private Drawable i()
  {
    this.p = new GradientDrawable();
    this.p.setCornerRadius(this.g + 1.0E-5F);
    this.p.setColor(-1);
    this.q = a.i(this.p);
    a.a(this.q, this.j);
    PorterDuff.Mode localMode = this.i;
    if (localMode != null) {
      a.a(this.q, localMode);
    }
    this.r = new GradientDrawable();
    this.r.setCornerRadius(this.g + 1.0E-5F);
    this.r.setColor(-1);
    this.s = a.i(this.r);
    a.a(this.s, this.l);
    return a(new LayerDrawable(new Drawable[] { this.q, this.s }));
  }
  
  @TargetApi(21)
  private Drawable j()
  {
    this.t = new GradientDrawable();
    this.t.setCornerRadius(this.g + 1.0E-5F);
    this.t.setColor(-1);
    n();
    this.u = new GradientDrawable();
    this.u.setCornerRadius(this.g + 1.0E-5F);
    this.u.setColor(0);
    this.u.setStroke(this.h, this.k);
    InsetDrawable localInsetDrawable = a(new LayerDrawable(new Drawable[] { this.t, this.u }));
    this.v = new GradientDrawable();
    this.v.setCornerRadius(this.g + 1.0E-5F);
    this.v.setColor(-1);
    return new ra(Ea.a(this.l), localInsetDrawable, this.v);
  }
  
  private GradientDrawable k()
  {
    if ((a) && (this.b.getBackground() != null)) {
      return (GradientDrawable)((LayerDrawable)((InsetDrawable)((RippleDrawable)this.b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }
    return null;
  }
  
  private GradientDrawable l()
  {
    if ((a) && (this.b.getBackground() != null)) {
      return (GradientDrawable)((LayerDrawable)((InsetDrawable)((RippleDrawable)this.b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }
    return null;
  }
  
  private void m()
  {
    if ((a) && (this.u != null)) {
      this.b.setInternalBackground(j());
    } else if (!a) {
      this.b.invalidate();
    }
  }
  
  private void n()
  {
    Object localObject = this.t;
    if (localObject != null)
    {
      a.a((Drawable)localObject, this.j);
      localObject = this.i;
      if (localObject != null) {
        a.a(this.t, (PorterDuff.Mode)localObject);
      }
    }
  }
  
  int a()
  {
    return this.g;
  }
  
  void a(int paramInt)
  {
    GradientDrawable localGradientDrawable;
    if (a)
    {
      localGradientDrawable = this.t;
      if (localGradientDrawable != null)
      {
        localGradientDrawable.setColor(paramInt);
        return;
      }
    }
    if (!a)
    {
      localGradientDrawable = this.p;
      if (localGradientDrawable != null) {
        localGradientDrawable.setColor(paramInt);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    GradientDrawable localGradientDrawable = this.v;
    if (localGradientDrawable != null) {
      localGradientDrawable.setBounds(this.c, this.e, paramInt2 - this.d, paramInt1 - this.f);
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (this.l != paramColorStateList)
    {
      this.l = paramColorStateList;
      if ((a) && ((this.b.getBackground() instanceof RippleDrawable)))
      {
        ((RippleDrawable)this.b.getBackground()).setColor(paramColorStateList);
      }
      else if (!a)
      {
        Drawable localDrawable = this.s;
        if (localDrawable != null) {
          a.a(localDrawable, paramColorStateList);
        }
      }
    }
  }
  
  public void a(TypedArray paramTypedArray)
  {
    int i1 = fa.MaterialButton_android_insetLeft;
    int i2 = 0;
    this.c = paramTypedArray.getDimensionPixelOffset(i1, 0);
    this.d = paramTypedArray.getDimensionPixelOffset(fa.MaterialButton_android_insetRight, 0);
    this.e = paramTypedArray.getDimensionPixelOffset(fa.MaterialButton_android_insetTop, 0);
    this.f = paramTypedArray.getDimensionPixelOffset(fa.MaterialButton_android_insetBottom, 0);
    this.g = paramTypedArray.getDimensionPixelSize(fa.MaterialButton_cornerRadius, 0);
    this.h = paramTypedArray.getDimensionPixelSize(fa.MaterialButton_strokeWidth, 0);
    this.i = d.a(paramTypedArray.getInt(fa.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
    this.j = Da.a(this.b.getContext(), paramTypedArray, fa.MaterialButton_backgroundTint);
    this.k = Da.a(this.b.getContext(), paramTypedArray, fa.MaterialButton_strokeColor);
    this.l = Da.a(this.b.getContext(), paramTypedArray, fa.MaterialButton_rippleColor);
    this.m.setStyle(Paint.Style.STROKE);
    this.m.setStrokeWidth(this.h);
    paramTypedArray = this.m;
    Object localObject = this.k;
    if (localObject != null) {
      i2 = ((ColorStateList)localObject).getColorForState(this.b.getDrawableState(), 0);
    }
    paramTypedArray.setColor(i2);
    i1 = y.p(this.b);
    i2 = this.b.getPaddingTop();
    int i3 = y.o(this.b);
    int i4 = this.b.getPaddingBottom();
    localObject = this.b;
    if (a) {
      paramTypedArray = j();
    } else {
      paramTypedArray = i();
    }
    ((qa)localObject).setInternalBackground(paramTypedArray);
    y.a(this.b, i1 + this.c, i2 + this.e, i3 + this.d, i4 + this.f);
  }
  
  void a(Canvas paramCanvas)
  {
    if ((paramCanvas != null) && (this.k != null) && (this.h > 0))
    {
      this.n.set(this.b.getBackground().getBounds());
      RectF localRectF = this.o;
      Rect localRect = this.n;
      float f1 = localRect.left;
      int i1 = this.h;
      localRectF.set(f1 + i1 / 2.0F + this.c, localRect.top + i1 / 2.0F + this.e, localRect.right - i1 / 2.0F - this.d, localRect.bottom - i1 / 2.0F - this.f);
      f1 = this.g - this.h / 2.0F;
      paramCanvas.drawRoundRect(this.o, f1, f1, this.m);
    }
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    if (this.i != paramMode)
    {
      this.i = paramMode;
      if (a)
      {
        n();
      }
      else
      {
        paramMode = this.q;
        if (paramMode != null)
        {
          PorterDuff.Mode localMode = this.i;
          if (localMode != null) {
            a.a(paramMode, localMode);
          }
        }
      }
    }
  }
  
  ColorStateList b()
  {
    return this.l;
  }
  
  void b(int paramInt)
  {
    if (this.g != paramInt)
    {
      this.g = paramInt;
      GradientDrawable localGradientDrawable;
      float f1;
      if ((a) && (this.t != null) && (this.u != null) && (this.v != null))
      {
        if (Build.VERSION.SDK_INT == 21)
        {
          localGradientDrawable = k();
          f1 = paramInt + 1.0E-5F;
          localGradientDrawable.setCornerRadius(f1);
          l().setCornerRadius(f1);
        }
        localGradientDrawable = this.t;
        f1 = paramInt + 1.0E-5F;
        localGradientDrawable.setCornerRadius(f1);
        this.u.setCornerRadius(f1);
        this.v.setCornerRadius(f1);
      }
      else if (!a)
      {
        localGradientDrawable = this.p;
        if ((localGradientDrawable != null) && (this.r != null))
        {
          f1 = paramInt + 1.0E-5F;
          localGradientDrawable.setCornerRadius(f1);
          this.r.setCornerRadius(f1);
          this.b.invalidate();
        }
      }
    }
  }
  
  void b(ColorStateList paramColorStateList)
  {
    if (this.k != paramColorStateList)
    {
      this.k = paramColorStateList;
      Paint localPaint = this.m;
      int i1 = 0;
      if (paramColorStateList != null) {
        i1 = paramColorStateList.getColorForState(this.b.getDrawableState(), 0);
      }
      localPaint.setColor(i1);
      m();
    }
  }
  
  ColorStateList c()
  {
    return this.k;
  }
  
  void c(int paramInt)
  {
    if (this.h != paramInt)
    {
      this.h = paramInt;
      this.m.setStrokeWidth(paramInt);
      m();
    }
  }
  
  void c(ColorStateList paramColorStateList)
  {
    if (this.j != paramColorStateList)
    {
      this.j = paramColorStateList;
      if (a)
      {
        n();
      }
      else
      {
        paramColorStateList = this.q;
        if (paramColorStateList != null) {
          a.a(paramColorStateList, this.j);
        }
      }
    }
  }
  
  int d()
  {
    return this.h;
  }
  
  ColorStateList e()
  {
    return this.j;
  }
  
  PorterDuff.Mode f()
  {
    return this.i;
  }
  
  boolean g()
  {
    return this.w;
  }
  
  void h()
  {
    this.w = true;
    this.b.setSupportBackgroundTintList(this.j);
    this.b.setSupportBackgroundTintMode(this.i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */