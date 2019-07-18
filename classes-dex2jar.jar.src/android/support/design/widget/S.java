package android.support.design.widget;

import Gc;
import Pd;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.view.f;
import android.support.v4.view.y;
import android.support.v7.widget.pb;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import cd;
import dd;
import ga;

public final class s
{
  private static final boolean a;
  private static final Paint b;
  private boolean A;
  private Bitmap B;
  private Paint C;
  private float D;
  private float E;
  private float F;
  private float G;
  private int[] H;
  private boolean I;
  private final TextPaint J;
  private final TextPaint K;
  private TimeInterpolator L;
  private TimeInterpolator M;
  private float N;
  private float O;
  private float P;
  private int Q;
  private float R;
  private float S;
  private float T;
  private int U;
  private final View c;
  private boolean d;
  private float e;
  private final Rect f;
  private final Rect g;
  private final RectF h;
  private int i = 16;
  private int j = 16;
  private float k = 15.0F;
  private float l = 15.0F;
  private ColorStateList m;
  private ColorStateList n;
  private float o;
  private float p;
  private float q;
  private float r;
  private float s;
  private float t;
  private Typeface u;
  private Typeface v;
  private Typeface w;
  private CharSequence x;
  private CharSequence y;
  private boolean z;
  
  static
  {
    boolean bool;
    if (Build.VERSION.SDK_INT < 18) {
      bool = true;
    } else {
      bool = false;
    }
    a = bool;
    b = null;
    Paint localPaint = b;
    if (localPaint != null)
    {
      localPaint.setAntiAlias(true);
      b.setColor(-65281);
    }
  }
  
  public s(View paramView)
  {
    this.c = paramView;
    this.J = new TextPaint(129);
    this.K = new TextPaint(this.J);
    this.g = new Rect();
    this.f = new Rect();
    this.h = new RectF();
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, TimeInterpolator paramTimeInterpolator)
  {
    float f1 = paramFloat3;
    if (paramTimeInterpolator != null) {
      f1 = paramTimeInterpolator.getInterpolation(paramFloat3);
    }
    return ga.a(paramFloat1, paramFloat2, f1);
  }
  
  private static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1);
    float f3 = Color.alpha(paramInt2);
    float f4 = Color.red(paramInt1);
    float f5 = Color.red(paramInt2);
    float f6 = Color.green(paramInt1);
    float f7 = Color.green(paramInt2);
    float f8 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f2 * f1 + f3 * paramFloat), (int)(f4 * f1 + f5 * paramFloat), (int)(f6 * f1 + f7 * paramFloat), (int)(f8 * f1 + f9 * paramFloat));
  }
  
  private void a(TextPaint paramTextPaint)
  {
    paramTextPaint.setTextSize(this.l);
    paramTextPaint.setTypeface(this.u);
  }
  
  private static boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if (Math.abs(paramFloat1 - paramFloat2) < 0.001F) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool;
    if ((paramRect.left == paramInt1) && (paramRect.top == paramInt2) && (paramRect.right == paramInt3) && (paramRect.bottom == paramInt4)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean b(CharSequence paramCharSequence)
  {
    int i1 = y.l(this.c);
    int i2 = 1;
    if (i1 != 1) {
      i2 = 0;
    }
    cd localcd;
    if (i2 != 0) {
      localcd = dd.d;
    } else {
      localcd = dd.c;
    }
    return localcd.isRtl(paramCharSequence, 0, paramCharSequence.length());
  }
  
  private void c(float paramFloat)
  {
    e(paramFloat);
    this.s = a(this.q, this.r, paramFloat, this.L);
    this.t = a(this.o, this.p, paramFloat, this.L);
    f(a(this.k, this.l, paramFloat, this.M));
    if (this.n != this.m) {
      this.J.setColor(a(r(), f(), paramFloat));
    } else {
      this.J.setColor(f());
    }
    this.J.setShadowLayer(a(this.R, this.N, paramFloat, null), a(this.S, this.O, paramFloat, null), a(this.T, this.P, paramFloat, null), a(this.U, this.Q, paramFloat));
    y.E(this.c);
  }
  
  private void d(float paramFloat)
  {
    if (this.x == null) {
      return;
    }
    float f1 = this.g.width();
    float f2 = this.f.width();
    boolean bool1 = a(paramFloat, this.l);
    boolean bool2 = true;
    float f3;
    Object localObject;
    Typeface localTypeface;
    int i1;
    if (bool1)
    {
      f3 = this.l;
      this.F = 1.0F;
      localObject = this.w;
      localTypeface = this.u;
      if (localObject != localTypeface)
      {
        this.w = localTypeface;
        i1 = 1;
      }
      else
      {
        i1 = 0;
      }
      paramFloat = f1;
    }
    else
    {
      f3 = this.k;
      localTypeface = this.w;
      localObject = this.v;
      if (localTypeface != localObject)
      {
        this.w = ((Typeface)localObject);
        i1 = 1;
      }
      else
      {
        i1 = 0;
      }
      if (a(paramFloat, this.k)) {
        this.F = 1.0F;
      } else {
        this.F = (paramFloat / this.k);
      }
      paramFloat = this.l / this.k;
      if (f2 * paramFloat > f1) {
        paramFloat = Math.min(f1 / paramFloat, f2);
      } else {
        paramFloat = f2;
      }
    }
    int i2 = i1;
    if (paramFloat > 0.0F)
    {
      if ((this.G == f3) && (!this.I) && (i1 == 0)) {
        i1 = 0;
      } else {
        i1 = 1;
      }
      this.G = f3;
      this.I = false;
      i2 = i1;
    }
    if ((this.y == null) || (i2 != 0))
    {
      this.J.setTextSize(this.G);
      this.J.setTypeface(this.w);
      localObject = this.J;
      if (this.F == 1.0F) {
        bool2 = false;
      }
      ((TextPaint)localObject).setLinearText(bool2);
      localObject = TextUtils.ellipsize(this.x, this.J, paramFloat, TextUtils.TruncateAt.END);
      if (!TextUtils.equals((CharSequence)localObject, this.y))
      {
        this.y = ((CharSequence)localObject);
        this.z = b(this.y);
      }
    }
  }
  
  private Typeface e(int paramInt)
  {
    TypedArray localTypedArray = this.c.getContext().obtainStyledAttributes(paramInt, new int[] { 16843692 });
    try
    {
      Object localObject1 = localTypedArray.getString(0);
      if (localObject1 != null)
      {
        localObject1 = Typeface.create((String)localObject1, 0);
        return (Typeface)localObject1;
      }
      return null;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  private void e(float paramFloat)
  {
    this.h.left = a(this.f.left, this.g.left, paramFloat, this.L);
    this.h.top = a(this.o, this.p, paramFloat, this.L);
    this.h.right = a(this.f.right, this.g.right, paramFloat, this.L);
    this.h.bottom = a(this.f.bottom, this.g.bottom, paramFloat, this.L);
  }
  
  private void f(float paramFloat)
  {
    d(paramFloat);
    boolean bool;
    if ((a) && (this.F != 1.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    this.A = bool;
    if (this.A) {
      q();
    }
    y.E(this.c);
  }
  
  private void n()
  {
    float f1 = this.G;
    d(this.l);
    CharSequence localCharSequence = this.y;
    float f2 = 0.0F;
    if (localCharSequence != null) {
      f3 = this.J.measureText(localCharSequence, 0, localCharSequence.length());
    } else {
      f3 = 0.0F;
    }
    int i1 = f.a(this.j, this.z);
    int i2 = i1 & 0x70;
    float f4;
    if (i2 != 48)
    {
      if (i2 != 80)
      {
        f4 = (this.J.descent() - this.J.ascent()) / 2.0F;
        float f5 = this.J.descent();
        this.p = (this.g.centerY() + (f4 - f5));
      }
      else
      {
        this.p = this.g.bottom;
      }
    }
    else {
      this.p = (this.g.top - this.J.ascent());
    }
    i2 = i1 & 0x800007;
    if (i2 != 1)
    {
      if (i2 != 5) {
        this.r = this.g.left;
      } else {
        this.r = (this.g.right - f3);
      }
    }
    else {
      this.r = (this.g.centerX() - f3 / 2.0F);
    }
    d(this.k);
    localCharSequence = this.y;
    float f3 = f2;
    if (localCharSequence != null) {
      f3 = this.J.measureText(localCharSequence, 0, localCharSequence.length());
    }
    i2 = f.a(this.i, this.z);
    i1 = i2 & 0x70;
    if (i1 != 48)
    {
      if (i1 != 80)
      {
        f2 = (this.J.descent() - this.J.ascent()) / 2.0F;
        f4 = this.J.descent();
        this.o = (this.f.centerY() + (f2 - f4));
      }
      else
      {
        this.o = this.f.bottom;
      }
    }
    else {
      this.o = (this.f.top - this.J.ascent());
    }
    i2 &= 0x800007;
    if (i2 != 1)
    {
      if (i2 != 5) {
        this.q = this.f.left;
      } else {
        this.q = (this.f.right - f3);
      }
    }
    else {
      this.q = (this.f.centerX() - f3 / 2.0F);
    }
    p();
    f(f1);
  }
  
  private void o()
  {
    c(this.e);
  }
  
  private void p()
  {
    Bitmap localBitmap = this.B;
    if (localBitmap != null)
    {
      localBitmap.recycle();
      this.B = null;
    }
  }
  
  private void q()
  {
    if ((this.B == null) && (!this.f.isEmpty()) && (!TextUtils.isEmpty(this.y)))
    {
      c(0.0F);
      this.D = this.J.ascent();
      this.E = this.J.descent();
      Object localObject1 = this.J;
      Object localObject2 = this.y;
      int i1 = Math.round(((TextPaint)localObject1).measureText((CharSequence)localObject2, 0, ((CharSequence)localObject2).length()));
      int i2 = Math.round(this.E - this.D);
      if ((i1 > 0) && (i2 > 0))
      {
        this.B = Bitmap.createBitmap(i1, i2, Bitmap.Config.ARGB_8888);
        localObject2 = new Canvas(this.B);
        localObject1 = this.y;
        ((Canvas)localObject2).drawText((CharSequence)localObject1, 0, ((CharSequence)localObject1).length(), 0.0F, i2 - this.J.descent(), this.J);
        if (this.C == null) {
          this.C = new Paint(3);
        }
      }
    }
  }
  
  private int r()
  {
    int[] arrayOfInt = this.H;
    if (arrayOfInt != null) {
      return this.m.getColorForState(arrayOfInt, 0);
    }
    return this.m.getDefaultColor();
  }
  
  public float a()
  {
    if (this.x == null) {
      return 0.0F;
    }
    a(this.K);
    TextPaint localTextPaint = this.K;
    CharSequence localCharSequence = this.x;
    return localTextPaint.measureText(localCharSequence, 0, localCharSequence.length());
  }
  
  public void a(float paramFloat)
  {
    if (this.k != paramFloat)
    {
      this.k = paramFloat;
      m();
    }
  }
  
  public void a(int paramInt)
  {
    pb localpb = pb.a(this.c.getContext(), paramInt, Pd.TextAppearance);
    if (localpb.g(Pd.TextAppearance_android_textColor)) {
      this.n = localpb.a(Pd.TextAppearance_android_textColor);
    }
    if (localpb.g(Pd.TextAppearance_android_textSize)) {
      this.l = localpb.c(Pd.TextAppearance_android_textSize, (int)this.l);
    }
    this.Q = localpb.d(Pd.TextAppearance_android_shadowColor, 0);
    this.O = localpb.b(Pd.TextAppearance_android_shadowDx, 0.0F);
    this.P = localpb.b(Pd.TextAppearance_android_shadowDy, 0.0F);
    this.N = localpb.b(Pd.TextAppearance_android_shadowRadius, 0.0F);
    localpb.a();
    if (Build.VERSION.SDK_INT >= 16) {
      this.u = e(paramInt);
    }
    m();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.g, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.g.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.I = true;
      l();
    }
  }
  
  public void a(TimeInterpolator paramTimeInterpolator)
  {
    this.L = paramTimeInterpolator;
    m();
  }
  
  public void a(ColorStateList paramColorStateList)
  {
    if (this.n != paramColorStateList)
    {
      this.n = paramColorStateList;
      m();
    }
  }
  
  public void a(Canvas paramCanvas)
  {
    int i1 = paramCanvas.save();
    if ((this.y != null) && (this.d))
    {
      float f1 = this.s;
      float f2 = this.t;
      int i2;
      if ((this.A) && (this.B != null)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (i2 != 0)
      {
        f3 = this.D * this.F;
        f4 = this.E;
      }
      else
      {
        f3 = this.J.ascent() * this.F;
        this.J.descent();
        f4 = this.F;
      }
      float f4 = f2;
      if (i2 != 0) {
        f4 = f2 + f3;
      }
      float f3 = this.F;
      if (f3 != 1.0F) {
        paramCanvas.scale(f3, f3, f1, f4);
      }
      if (i2 != 0)
      {
        paramCanvas.drawBitmap(this.B, f1, f4, this.C);
      }
      else
      {
        CharSequence localCharSequence = this.y;
        paramCanvas.drawText(localCharSequence, 0, localCharSequence.length(), f1, f4, this.J);
      }
    }
    paramCanvas.restoreToCount(i1);
  }
  
  public void a(RectF paramRectF)
  {
    boolean bool = b(this.x);
    float f1;
    if (!bool) {
      f1 = this.g.left;
    } else {
      f1 = this.g.right - a();
    }
    paramRectF.left = f1;
    Rect localRect = this.g;
    paramRectF.top = localRect.top;
    if (!bool) {
      f1 = paramRectF.left + a();
    } else {
      f1 = localRect.right;
    }
    paramRectF.right = f1;
    paramRectF.bottom = (this.g.top + d());
  }
  
  public void a(Typeface paramTypeface)
  {
    if (this.u != paramTypeface)
    {
      this.u = paramTypeface;
      m();
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    if ((paramCharSequence == null) || (!paramCharSequence.equals(this.x)))
    {
      this.x = paramCharSequence;
      this.y = null;
      p();
      m();
    }
  }
  
  public final boolean a(int[] paramArrayOfInt)
  {
    this.H = paramArrayOfInt;
    if (k())
    {
      m();
      return true;
    }
    return false;
  }
  
  public ColorStateList b()
  {
    return this.n;
  }
  
  public void b(float paramFloat)
  {
    paramFloat = Gc.a(paramFloat, 0.0F, 1.0F);
    if (paramFloat != this.e)
    {
      this.e = paramFloat;
      o();
    }
  }
  
  public void b(int paramInt)
  {
    if (this.j != paramInt)
    {
      this.j = paramInt;
      m();
    }
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!a(this.f, paramInt1, paramInt2, paramInt3, paramInt4))
    {
      this.f.set(paramInt1, paramInt2, paramInt3, paramInt4);
      this.I = true;
      l();
    }
  }
  
  public void b(TimeInterpolator paramTimeInterpolator)
  {
    this.M = paramTimeInterpolator;
    m();
  }
  
  public void b(ColorStateList paramColorStateList)
  {
    if (this.m != paramColorStateList)
    {
      this.m = paramColorStateList;
      m();
    }
  }
  
  public void b(Typeface paramTypeface)
  {
    if (this.v != paramTypeface)
    {
      this.v = paramTypeface;
      m();
    }
  }
  
  public int c()
  {
    return this.j;
  }
  
  public void c(int paramInt)
  {
    pb localpb = pb.a(this.c.getContext(), paramInt, Pd.TextAppearance);
    if (localpb.g(Pd.TextAppearance_android_textColor)) {
      this.m = localpb.a(Pd.TextAppearance_android_textColor);
    }
    if (localpb.g(Pd.TextAppearance_android_textSize)) {
      this.k = localpb.c(Pd.TextAppearance_android_textSize, (int)this.k);
    }
    this.U = localpb.d(Pd.TextAppearance_android_shadowColor, 0);
    this.S = localpb.b(Pd.TextAppearance_android_shadowDx, 0.0F);
    this.T = localpb.b(Pd.TextAppearance_android_shadowDy, 0.0F);
    this.R = localpb.b(Pd.TextAppearance_android_shadowRadius, 0.0F);
    localpb.a();
    if (Build.VERSION.SDK_INT >= 16) {
      this.v = e(paramInt);
    }
    m();
  }
  
  public void c(Typeface paramTypeface)
  {
    this.v = paramTypeface;
    this.u = paramTypeface;
    m();
  }
  
  public float d()
  {
    a(this.K);
    return -this.K.ascent();
  }
  
  public void d(int paramInt)
  {
    if (this.i != paramInt)
    {
      this.i = paramInt;
      m();
    }
  }
  
  public Typeface e()
  {
    Typeface localTypeface = this.u;
    if (localTypeface == null) {
      localTypeface = Typeface.DEFAULT;
    }
    return localTypeface;
  }
  
  public int f()
  {
    int[] arrayOfInt = this.H;
    if (arrayOfInt != null) {
      return this.n.getColorForState(arrayOfInt, 0);
    }
    return this.n.getDefaultColor();
  }
  
  public int g()
  {
    return this.i;
  }
  
  public Typeface h()
  {
    Typeface localTypeface = this.v;
    if (localTypeface == null) {
      localTypeface = Typeface.DEFAULT;
    }
    return localTypeface;
  }
  
  public float i()
  {
    return this.e;
  }
  
  public CharSequence j()
  {
    return this.x;
  }
  
  public final boolean k()
  {
    ColorStateList localColorStateList = this.n;
    if ((localColorStateList == null) || (!localColorStateList.isStateful()))
    {
      localColorStateList = this.m;
      if ((localColorStateList == null) || (!localColorStateList.isStateful())) {}
    }
    else
    {
      return true;
    }
    boolean bool = false;
    return bool;
  }
  
  void l()
  {
    boolean bool;
    if ((this.g.width() > 0) && (this.g.height() > 0) && (this.f.width() > 0) && (this.f.height() > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    this.d = bool;
  }
  
  public void m()
  {
    if ((this.c.getHeight() > 0) && (this.c.getWidth() > 0))
    {
      n();
      o();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */