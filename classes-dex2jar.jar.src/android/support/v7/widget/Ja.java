package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.y;
import android.view.MotionEvent;
import android.view.ViewGroup;

class ja
  extends RecyclerView.h
  implements RecyclerView.m
{
  private static final int[] a = { 16842919 };
  private static final int[] b = new int[0];
  private final int[] A = new int[2];
  final ValueAnimator B = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
  int C = 0;
  private final Runnable D = new ha(this);
  private final RecyclerView.n E = new ia(this);
  private final int c;
  private final int d;
  final StateListDrawable e;
  final Drawable f;
  private final int g;
  private final int h;
  private final StateListDrawable i;
  private final Drawable j;
  private final int k;
  private final int l;
  int m;
  int n;
  float o;
  int p;
  int q;
  float r;
  private int s = 0;
  private int t = 0;
  private RecyclerView u;
  private boolean v = false;
  private boolean w = false;
  private int x = 0;
  private int y = 0;
  private final int[] z = new int[2];
  
  ja(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.e = paramStateListDrawable1;
    this.f = paramDrawable1;
    this.i = paramStateListDrawable2;
    this.j = paramDrawable2;
    this.g = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    this.h = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    this.k = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    this.l = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    this.c = paramInt2;
    this.d = paramInt3;
    this.e.setAlpha(255);
    this.f.setAlpha(255);
    this.B.addListener(new a());
    this.B.addUpdateListener(new b());
    a(paramRecyclerView);
  }
  
  private int a(float paramFloat1, float paramFloat2, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramArrayOfInt[1] - paramArrayOfInt[0];
    if (i1 == 0) {
      return 0;
    }
    paramFloat1 = (paramFloat2 - paramFloat1) / i1;
    paramInt1 -= paramInt3;
    paramInt3 = (int)(paramFloat1 * paramInt1);
    paramInt2 += paramInt3;
    if ((paramInt2 < paramInt1) && (paramInt2 >= 0)) {
      return paramInt3;
    }
    return 0;
  }
  
  private void a(float paramFloat)
  {
    int[] arrayOfInt = e();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(this.q - paramFloat) < 2.0F) {
      return;
    }
    int i1 = a(this.r, paramFloat, arrayOfInt, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
    if (i1 != 0) {
      this.u.scrollBy(i1, 0);
    }
    this.r = paramFloat;
  }
  
  private void a(Canvas paramCanvas)
  {
    int i1 = this.t;
    int i2 = this.k;
    int i3 = i1 - i2;
    int i4 = this.q;
    i1 = this.p;
    i4 -= i1 / 2;
    this.i.setBounds(0, 0, i1, i2);
    this.j.setBounds(0, 0, this.s, this.l);
    paramCanvas.translate(0.0F, i3);
    this.j.draw(paramCanvas);
    paramCanvas.translate(i4, 0.0F);
    this.i.draw(paramCanvas);
    paramCanvas.translate(-i4, -i3);
  }
  
  private void b(float paramFloat)
  {
    int[] arrayOfInt = f();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(this.n - paramFloat) < 2.0F) {
      return;
    }
    int i1 = a(this.o, paramFloat, arrayOfInt, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
    if (i1 != 0) {
      this.u.scrollBy(0, i1);
    }
    this.o = paramFloat;
  }
  
  private void b(Canvas paramCanvas)
  {
    int i1 = this.s;
    int i2 = this.g;
    int i3 = i1 - i2;
    int i4 = this.n;
    i1 = this.m;
    i4 -= i1 / 2;
    this.e.setBounds(0, 0, i2, i1);
    this.f.setBounds(0, 0, this.h, this.t);
    if (g())
    {
      this.f.draw(paramCanvas);
      paramCanvas.translate(this.g, i4);
      paramCanvas.scale(-1.0F, 1.0F);
      this.e.draw(paramCanvas);
      paramCanvas.scale(1.0F, 1.0F);
      paramCanvas.translate(-this.g, -i4);
    }
    else
    {
      paramCanvas.translate(i3, 0.0F);
      this.f.draw(paramCanvas);
      paramCanvas.translate(0.0F, i4);
      this.e.draw(paramCanvas);
      paramCanvas.translate(-i3, -i4);
    }
  }
  
  private void c()
  {
    this.u.removeCallbacks(this.D);
  }
  
  private void c(int paramInt)
  {
    c();
    this.u.postDelayed(this.D, paramInt);
  }
  
  private void d()
  {
    this.u.b(this);
    this.u.b(this);
    this.u.b(this.E);
    c();
  }
  
  private int[] e()
  {
    int[] arrayOfInt = this.A;
    int i1 = this.d;
    arrayOfInt[0] = i1;
    arrayOfInt[1] = (this.s - i1);
    return arrayOfInt;
  }
  
  private int[] f()
  {
    int[] arrayOfInt = this.z;
    int i1 = this.d;
    arrayOfInt[0] = i1;
    arrayOfInt[1] = (this.t - i1);
    return arrayOfInt;
  }
  
  private boolean g()
  {
    int i1 = y.l(this.u);
    boolean bool = true;
    if (i1 != 1) {
      bool = false;
    }
    return bool;
  }
  
  private void h()
  {
    this.u.a(this);
    this.u.a(this);
    this.u.a(this.E);
  }
  
  void a()
  {
    this.u.invalidate();
  }
  
  void a(int paramInt)
  {
    int i1 = this.C;
    if (i1 != 1)
    {
      if (i1 != 2) {
        return;
      }
    }
    else {
      this.B.cancel();
    }
    this.C = 3;
    ValueAnimator localValueAnimator = this.B;
    localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 0.0F });
    this.B.setDuration(paramInt);
    this.B.start();
  }
  
  void a(int paramInt1, int paramInt2)
  {
    int i1 = this.u.computeVerticalScrollRange();
    int i2 = this.t;
    boolean bool;
    if ((i1 - i2 > 0) && (i2 >= this.c)) {
      bool = true;
    } else {
      bool = false;
    }
    this.v = bool;
    int i3 = this.u.computeHorizontalScrollRange();
    int i4 = this.s;
    if ((i3 - i4 > 0) && (i4 >= this.c)) {
      bool = true;
    } else {
      bool = false;
    }
    this.w = bool;
    if ((!this.v) && (!this.w))
    {
      if (this.x != 0) {
        b(0);
      }
      return;
    }
    float f1;
    float f2;
    if (this.v)
    {
      f1 = paramInt2;
      f2 = i2;
      this.n = ((int)(f2 * (f1 + f2 / 2.0F) / i1));
      this.m = Math.min(i2, i2 * i2 / i1);
    }
    if (this.w)
    {
      f1 = paramInt1;
      f2 = i4;
      this.q = ((int)(f2 * (f1 + f2 / 2.0F) / i3));
      this.p = Math.min(i4, i4 * i4 / i3);
    }
    paramInt1 = this.x;
    if ((paramInt1 == 0) || (paramInt1 == 1)) {
      b(1);
    }
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    RecyclerView localRecyclerView = this.u;
    if (localRecyclerView == paramRecyclerView) {
      return;
    }
    if (localRecyclerView != null) {
      d();
    }
    this.u = paramRecyclerView;
    if (this.u != null) {
      h();
    }
  }
  
  public void a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    if (this.x == 0) {
      return;
    }
    if (paramMotionEvent.getAction() == 0)
    {
      boolean bool1 = b(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((bool1) || (bool2))
      {
        if (bool2)
        {
          this.y = 1;
          this.r = ((int)paramMotionEvent.getX());
        }
        else if (bool1)
        {
          this.y = 2;
          this.o = ((int)paramMotionEvent.getY());
        }
        b(2);
      }
    }
    else if ((paramMotionEvent.getAction() == 1) && (this.x == 2))
    {
      this.o = 0.0F;
      this.r = 0.0F;
      b(1);
      this.y = 0;
    }
    else if ((paramMotionEvent.getAction() == 2) && (this.x == 2))
    {
      b();
      if (this.y == 1) {
        a(paramMotionEvent.getX());
      }
      if (this.y == 2) {
        b(paramMotionEvent.getY());
      }
    }
  }
  
  public void a(boolean paramBoolean) {}
  
  boolean a(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 >= this.t - this.k)
    {
      int i1 = this.q;
      int i2 = this.p;
      if ((paramFloat1 >= i1 - i2 / 2) && (paramFloat1 <= i1 + i2 / 2))
      {
        bool = true;
        break label59;
      }
    }
    boolean bool = false;
    label59:
    return bool;
  }
  
  public void b()
  {
    int i1 = this.C;
    if (i1 != 0)
    {
      if (i1 == 3) {
        this.B.cancel();
      }
    }
    else
    {
      this.C = 1;
      ValueAnimator localValueAnimator = this.B;
      localValueAnimator.setFloatValues(new float[] { ((Float)localValueAnimator.getAnimatedValue()).floatValue(), 1.0F });
      this.B.setDuration(500L);
      this.B.setStartDelay(0L);
      this.B.start();
    }
  }
  
  void b(int paramInt)
  {
    if ((paramInt == 2) && (this.x != 2))
    {
      this.e.setState(a);
      c();
    }
    if (paramInt == 0) {
      a();
    } else {
      b();
    }
    if ((this.x == 2) && (paramInt != 2))
    {
      this.e.setState(b);
      c(1200);
    }
    else if (paramInt == 1)
    {
      c(1500);
    }
    this.x = paramInt;
  }
  
  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.u paramu)
  {
    if ((this.s == this.u.getWidth()) && (this.t == this.u.getHeight()))
    {
      if (this.C != 0)
      {
        if (this.v) {
          b(paramCanvas);
        }
        if (this.w) {
          a(paramCanvas);
        }
      }
      return;
    }
    this.s = this.u.getWidth();
    this.t = this.u.getHeight();
    b(0);
  }
  
  boolean b(float paramFloat1, float paramFloat2)
  {
    if (g() ? paramFloat1 <= this.g / 2 : paramFloat1 >= this.s - this.g)
    {
      int i1 = this.n;
      int i2 = this.m;
      if ((paramFloat2 >= i1 - i2 / 2) && (paramFloat2 <= i1 + i2 / 2))
      {
        bool = true;
        break label81;
      }
    }
    boolean bool = false;
    label81:
    return bool;
  }
  
  public boolean b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    int i1 = this.x;
    boolean bool1 = false;
    if (i1 == 1)
    {
      boolean bool2 = b(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool3 = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      bool4 = bool1;
      if (paramMotionEvent.getAction() != 0) {
        break label129;
      }
      if (!bool2)
      {
        bool4 = bool1;
        if (!bool3) {
          break label129;
        }
      }
      if (bool3)
      {
        this.y = 1;
        this.r = ((int)paramMotionEvent.getX());
      }
      else if (bool2)
      {
        this.y = 2;
        this.o = ((int)paramMotionEvent.getY());
      }
      b(2);
    }
    else
    {
      bool4 = bool1;
      if (i1 != 2) {
        break label129;
      }
    }
    boolean bool4 = true;
    label129:
    return bool4;
  }
  
  private class a
    extends AnimatorListenerAdapter
  {
    private boolean a = false;
    
    a() {}
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      if (this.a)
      {
        this.a = false;
        return;
      }
      if (((Float)ja.this.B.getAnimatedValue()).floatValue() == 0.0F)
      {
        paramAnimator = ja.this;
        paramAnimator.C = 0;
        paramAnimator.b(0);
      }
      else
      {
        paramAnimator = ja.this;
        paramAnimator.C = 2;
        paramAnimator.a();
      }
    }
  }
  
  private class b
    implements ValueAnimator.AnimatorUpdateListener
  {
    b() {}
    
    public void onAnimationUpdate(ValueAnimator paramValueAnimator)
    {
      int i = (int)(((Float)paramValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
      ja.this.e.setAlpha(i);
      ja.this.f.setAlpha(i);
      ja.this.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */