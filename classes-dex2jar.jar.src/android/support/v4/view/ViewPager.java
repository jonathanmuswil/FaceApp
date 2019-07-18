package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import zd;

public class ViewPager
  extends ViewGroup
{
  static final int[] a = { 16842931 };
  private static final Comparator<b> b = new B();
  private static final Interpolator c = new C();
  private static final j d = new j();
  private boolean A;
  private int B = 1;
  private boolean C;
  private boolean D;
  private int E;
  private int F;
  private int G;
  private float H;
  private float I;
  private float J;
  private float K;
  private int L = -1;
  private VelocityTracker M;
  private int N;
  private int O;
  private int P;
  private int Q;
  private boolean R;
  private EdgeEffect S;
  private EdgeEffect T;
  private boolean U = true;
  private boolean V = false;
  private boolean W;
  private int aa;
  private List<f> ba;
  private f ca;
  private f da;
  private int e;
  private List<e> ea;
  private final ArrayList<b> f = new ArrayList();
  private g fa;
  private final b g = new b();
  private int ga;
  private final Rect h = new Rect();
  private int ha;
  s i;
  private ArrayList<View> ia;
  int j;
  private final Runnable ja = new D(this);
  private int k = -1;
  private int ka = 0;
  private Parcelable l = null;
  private ClassLoader m = null;
  private Scroller n;
  private boolean o;
  private h p;
  private int q;
  private Drawable r;
  private int s;
  private int t;
  private float u = -3.4028235E38F;
  private float v = Float.MAX_VALUE;
  private int w;
  private int x;
  private boolean y;
  private boolean z;
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  private int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.P) && (Math.abs(paramInt2) > this.N))
    {
      if (paramInt2 <= 0) {
        paramInt1++;
      }
    }
    else
    {
      float f1;
      if (paramInt1 >= this.j) {
        f1 = 0.4F;
      } else {
        f1 = 0.6F;
      }
      paramInt1 += (int)(paramFloat + f1);
    }
    paramInt2 = paramInt1;
    if (this.f.size() > 0)
    {
      b localb = (b)this.f.get(0);
      Object localObject = this.f;
      localObject = (b)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
      paramInt2 = Math.max(localb.b, Math.min(paramInt1, ((b)localObject).b));
    }
    return paramInt2;
  }
  
  private Rect a(Rect paramRect, View paramView)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = new Rect();
    }
    if (paramView == null)
    {
      localRect.set(0, 0, 0, 0);
      return localRect;
    }
    localRect.left = paramView.getLeft();
    localRect.right = paramView.getRight();
    localRect.top = paramView.getTop();
    localRect.bottom = paramView.getBottom();
    for (paramRect = paramView.getParent(); ((paramRect instanceof ViewGroup)) && (paramRect != this); paramRect = paramRect.getParent())
    {
      paramRect = (ViewGroup)paramRect;
      localRect.left += paramRect.getLeft();
      localRect.right += paramRect.getRight();
      localRect.top += paramRect.getTop();
      localRect.bottom += paramRect.getBottom();
    }
    return localRect;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.f.isEmpty()))
    {
      if (!this.n.isFinished())
      {
        this.n.setFinalX(getCurrentItem() * getClientWidth());
      }
      else
      {
        int i1 = getPaddingLeft();
        int i2 = getPaddingRight();
        int i3 = getPaddingLeft();
        int i4 = getPaddingRight();
        scrollTo((int)(getScrollX() / (paramInt2 - i3 - i4 + paramInt4) * (paramInt1 - i1 - i2 + paramInt3)), getScrollY());
      }
    }
    else
    {
      b localb = b(this.j);
      float f1;
      if (localb != null) {
        f1 = Math.min(localb.e, this.v);
      } else {
        f1 = 0.0F;
      }
      paramInt1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        a(false);
        scrollTo(paramInt1, getScrollY());
      }
    }
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    b localb = b(paramInt1);
    int i1;
    if (localb != null) {
      i1 = (int)(getClientWidth() * Math.max(this.u, Math.min(localb.e, this.v)));
    } else {
      i1 = 0;
    }
    if (paramBoolean1)
    {
      a(i1, 0, paramInt2);
      if (paramBoolean2) {
        d(paramInt1);
      }
    }
    else
    {
      if (paramBoolean2) {
        d(paramInt1);
      }
      a(false);
      scrollTo(i1, 0);
      f(i1);
    }
  }
  
  private void a(b paramb1, int paramInt, b paramb2)
  {
    int i1 = this.i.a();
    int i2 = getClientWidth();
    float f1;
    if (i2 > 0) {
      f1 = this.q / i2;
    } else {
      f1 = 0.0F;
    }
    float f3;
    if (paramb2 != null)
    {
      i2 = paramb2.b;
      i3 = paramb1.b;
      if (i2 < i3)
      {
        f2 = paramb2.e + paramb2.d + f1;
        i2++;
        i3 = 0;
        while ((i2 <= paramb1.b) && (i3 < this.f.size()))
        {
          for (paramb2 = (b)this.f.get(i3);; paramb2 = (b)this.f.get(i3))
          {
            i4 = i2;
            f3 = f2;
            if (i2 <= paramb2.b) {
              break;
            }
            i4 = i2;
            f3 = f2;
            if (i3 >= this.f.size() - 1) {
              break;
            }
            i3++;
          }
          while (i4 < paramb2.b)
          {
            f3 += this.i.b(i4) + f1;
            i4++;
          }
          paramb2.e = f3;
          f2 = f3 + (paramb2.d + f1);
          i2 = i4 + 1;
        }
      }
      if (i2 > i3)
      {
        i3 = this.f.size() - 1;
        f2 = paramb2.e;
        i2--;
        while ((i2 >= paramb1.b) && (i3 >= 0))
        {
          for (paramb2 = (b)this.f.get(i3);; paramb2 = (b)this.f.get(i3))
          {
            i4 = i2;
            f3 = f2;
            if (i2 >= paramb2.b) {
              break;
            }
            i4 = i2;
            f3 = f2;
            if (i3 <= 0) {
              break;
            }
            i3--;
          }
          while (i4 > paramb2.b)
          {
            f3 -= this.i.b(i4) + f1;
            i4--;
          }
          f2 = f3 - (paramb2.d + f1);
          paramb2.e = f2;
          i2 = i4 - 1;
        }
      }
    }
    int i4 = this.f.size();
    float f2 = paramb1.e;
    int i3 = paramb1.b;
    i2 = i3 - 1;
    if (i3 == 0) {
      f3 = f2;
    } else {
      f3 = -3.4028235E38F;
    }
    this.u = f3;
    i3 = paramb1.b;
    i1--;
    if (i3 == i1) {
      f3 = paramb1.e + paramb1.d - 1.0F;
    } else {
      f3 = Float.MAX_VALUE;
    }
    this.v = f3;
    i3 = paramInt - 1;
    while (i3 >= 0)
    {
      paramb2 = (b)this.f.get(i3);
      int i5;
      for (;;)
      {
        i5 = paramb2.b;
        if (i2 <= i5) {
          break;
        }
        f2 -= this.i.b(i2) + f1;
        i2--;
      }
      f2 -= paramb2.d + f1;
      paramb2.e = f2;
      if (i5 == 0) {
        this.u = f2;
      }
      i3--;
      i2--;
    }
    f2 = paramb1.e + paramb1.d + f1;
    i3 = paramb1.b + 1;
    i2 = paramInt + 1;
    for (paramInt = i3; i2 < i4; paramInt++)
    {
      paramb1 = (b)this.f.get(i2);
      for (;;)
      {
        i3 = paramb1.b;
        if (paramInt >= i3) {
          break;
        }
        f2 += this.i.b(paramInt) + f1;
        paramInt++;
      }
      if (i3 == i1) {
        this.v = (paramb1.d + f2 - 1.0F);
      }
      paramb1.e = f2;
      f2 += paramb1.d + f1;
      i2++;
    }
    this.V = false;
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i1) == this.L)
    {
      if (i1 == 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      this.H = paramMotionEvent.getX(i1);
      this.L = paramMotionEvent.getPointerId(i1);
      paramMotionEvent = this.M;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (this.ka == 2) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      setScrollingCacheEnabled(false);
      if ((this.n.isFinished() ^ true))
      {
        this.n.abortAnimation();
        int i2 = getScrollX();
        i3 = getScrollY();
        int i4 = this.n.getCurrX();
        i5 = this.n.getCurrY();
        if ((i2 != i4) || (i3 != i5))
        {
          scrollTo(i4, i5);
          if (i4 != i2) {
            f(i4);
          }
        }
      }
    }
    this.A = false;
    int i3 = 0;
    int i5 = i1;
    for (int i1 = i3; i1 < this.f.size(); i1++)
    {
      b localb = (b)this.f.get(i1);
      if (localb.c)
      {
        localb.c = false;
        i5 = 1;
      }
    }
    if (i5 != 0) {
      if (paramBoolean) {
        y.a(this, this.ja);
      } else {
        this.ja.run();
      }
    }
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if (((paramFloat1 < this.F) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.F) && (paramFloat2 < 0.0F))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void b(int paramInt1, float paramFloat, int paramInt2)
  {
    Object localObject = this.ca;
    if (localObject != null) {
      ((f)localObject).a(paramInt1, paramFloat, paramInt2);
    }
    localObject = this.ba;
    if (localObject != null)
    {
      int i1 = 0;
      int i2 = ((List)localObject).size();
      while (i1 < i2)
      {
        localObject = (f)this.ba.get(i1);
        if (localObject != null) {
          ((f)localObject).a(paramInt1, paramFloat, paramInt2);
        }
        i1++;
      }
    }
    localObject = this.da;
    if (localObject != null) {
      ((f)localObject).a(paramInt1, paramFloat, paramInt2);
    }
  }
  
  private void b(boolean paramBoolean)
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3;
      if (paramBoolean) {
        i3 = this.ga;
      } else {
        i3 = 0;
      }
      getChildAt(i2).setLayerType(i3, null);
    }
  }
  
  private boolean b(float paramFloat)
  {
    float f1 = this.H;
    this.H = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    float f3 = getClientWidth();
    paramFloat = this.u * f3;
    f1 = this.v * f3;
    Object localObject1 = this.f;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    localObject1 = (b)((ArrayList)localObject1).get(0);
    Object localObject2 = this.f;
    localObject2 = (b)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
    if (((b)localObject1).b != 0)
    {
      paramFloat = ((b)localObject1).e * f3;
      i1 = 0;
    }
    else
    {
      i1 = 1;
    }
    int i2;
    if (((b)localObject2).b != this.i.a() - 1)
    {
      f1 = ((b)localObject2).e * f3;
      i2 = 0;
    }
    else
    {
      i2 = 1;
    }
    if (f2 < paramFloat)
    {
      if (i1 != 0)
      {
        this.S.onPull(Math.abs(paramFloat - f2) / f3);
        bool3 = true;
      }
    }
    else
    {
      bool3 = bool2;
      paramFloat = f2;
      if (f2 > f1)
      {
        bool3 = bool1;
        if (i2 != 0)
        {
          this.T.onPull(Math.abs(f2 - f1) / f3);
          bool3 = true;
        }
        paramFloat = f1;
      }
    }
    f1 = this.H;
    int i1 = (int)paramFloat;
    this.H = (f1 + (paramFloat - i1));
    scrollTo(i1, getScrollY());
    f(i1);
    return bool3;
  }
  
  private void c(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private static boolean c(View paramView)
  {
    boolean bool;
    if (paramView.getClass().getAnnotation(a.class) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void d(int paramInt)
  {
    Object localObject = this.ca;
    if (localObject != null) {
      ((f)localObject).b(paramInt);
    }
    localObject = this.ba;
    if (localObject != null)
    {
      int i1 = 0;
      int i2 = ((List)localObject).size();
      while (i1 < i2)
      {
        localObject = (f)this.ba.get(i1);
        if (localObject != null) {
          ((f)localObject).b(paramInt);
        }
        i1++;
      }
    }
    localObject = this.da;
    if (localObject != null) {
      ((f)localObject).b(paramInt);
    }
  }
  
  private void e(int paramInt)
  {
    Object localObject = this.ca;
    if (localObject != null) {
      ((f)localObject).a(paramInt);
    }
    localObject = this.ba;
    if (localObject != null)
    {
      int i1 = 0;
      int i2 = ((List)localObject).size();
      while (i1 < i2)
      {
        localObject = (f)this.ba.get(i1);
        if (localObject != null) {
          ((f)localObject).a(paramInt);
        }
        i1++;
      }
    }
    localObject = this.da;
    if (localObject != null) {
      ((f)localObject).a(paramInt);
    }
  }
  
  private void f()
  {
    this.C = false;
    this.D = false;
    VelocityTracker localVelocityTracker = this.M;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      this.M = null;
    }
  }
  
  private boolean f(int paramInt)
  {
    if (this.f.size() == 0)
    {
      if (this.U) {
        return false;
      }
      this.W = false;
      a(0, 0.0F, 0);
      if (this.W) {
        return false;
      }
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    b localb = g();
    int i1 = getClientWidth();
    int i2 = this.q;
    float f1 = i2;
    float f2 = i1;
    f1 /= f2;
    int i3 = localb.b;
    f2 = (paramInt / f2 - localb.e) / (localb.d + f1);
    paramInt = (int)((i1 + i2) * f2);
    this.W = false;
    a(i3, f2, paramInt);
    if (this.W) {
      return true;
    }
    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
  }
  
  private b g()
  {
    int i1 = getClientWidth();
    float f1;
    if (i1 > 0) {
      f1 = getScrollX() / i1;
    } else {
      f1 = 0.0F;
    }
    float f2;
    if (i1 > 0) {
      f2 = this.q / i1;
    } else {
      f2 = 0.0F;
    }
    Object localObject = null;
    i1 = 0;
    int i2 = 1;
    int i3 = -1;
    float f3 = 0.0F;
    float f4 = 0.0F;
    while (i1 < this.f.size())
    {
      b localb1 = (b)this.f.get(i1);
      int i4 = i1;
      b localb2 = localb1;
      if (i2 == 0)
      {
        int i5 = localb1.b;
        i3++;
        i4 = i1;
        localb2 = localb1;
        if (i5 != i3)
        {
          localb2 = this.g;
          localb2.e = (f3 + f4 + f2);
          localb2.b = i3;
          localb2.d = this.i.b(localb2.b);
          i4 = i1 - 1;
        }
      }
      f3 = localb2.e;
      f4 = localb2.d;
      if ((i2 == 0) && (f1 < f3)) {
        return (b)localObject;
      }
      if ((f1 >= f4 + f3 + f2) && (i4 != this.f.size() - 1))
      {
        i3 = localb2.b;
        f4 = localb2.d;
        i1 = i4 + 1;
        i2 = 0;
        localObject = localb2;
      }
      else
      {
        return localb2;
      }
    }
    return (b)localObject;
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void h()
  {
    int i2;
    for (int i1 = 0; i1 < getChildCount(); i1 = i2 + 1)
    {
      i2 = i1;
      if (!((c)getChildAt(i1).getLayoutParams()).a)
      {
        removeViewAt(i1);
        i2 = i1 - 1;
      }
    }
  }
  
  private boolean i()
  {
    this.L = -1;
    f();
    this.S.onRelease();
    this.T.onRelease();
    boolean bool;
    if ((!this.S.isFinished()) && (!this.T.isFinished())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void j()
  {
    if (this.ha != 0)
    {
      Object localObject = this.ia;
      if (localObject == null) {
        this.ia = new ArrayList();
      } else {
        ((ArrayList)localObject).clear();
      }
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        localObject = getChildAt(i2);
        this.ia.add(localObject);
      }
      Collections.sort(this.ia, d);
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.z != paramBoolean) {
      this.z = paramBoolean;
    }
  }
  
  float a(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  b a(int paramInt1, int paramInt2)
  {
    b localb = new b();
    localb.b = paramInt1;
    localb.a = this.i.a(this, paramInt1);
    localb.d = this.i.b(paramInt1);
    if ((paramInt2 >= 0) && (paramInt2 < this.f.size())) {
      this.f.add(paramInt2, localb);
    } else {
      this.f.add(localb);
    }
    return localb;
  }
  
  b a(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break label34;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        break;
      }
      paramView = (View)localViewParent;
    }
    return null;
    label34:
    return b(paramView);
  }
  
  void a()
  {
    int i1 = this.i.a();
    this.e = i1;
    if ((this.f.size() < this.B * 2 + 1) && (this.f.size() < i1)) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3 = this.j;
    int i4 = i2;
    int i2 = i3;
    int i5 = 0;
    i3 = 0;
    Object localObject;
    while (i5 < this.f.size())
    {
      localObject = (b)this.f.get(i5);
      int i6 = this.i.a(((b)localObject).a);
      int i7;
      int i8;
      int i9;
      if (i6 == -1)
      {
        i7 = i5;
        i8 = i3;
        i9 = i2;
      }
      else
      {
        if (i6 == -2)
        {
          this.f.remove(i5);
          i7 = i5 - 1;
          i8 = i3;
          if (i3 == 0)
          {
            this.i.b(this);
            i8 = 1;
          }
          this.i.a(this, ((b)localObject).b, ((b)localObject).a);
          i4 = this.j;
          i5 = i7;
          i3 = i8;
          if (i4 == ((b)localObject).b)
          {
            i2 = Math.max(0, Math.min(i4, i1 - 1));
            i3 = i8;
            i5 = i7;
          }
        }
        for (;;)
        {
          i4 = 1;
          i7 = i5;
          i8 = i3;
          i9 = i2;
          break;
          int i10 = ((b)localObject).b;
          i7 = i5;
          i8 = i3;
          i9 = i2;
          if (i10 == i6) {
            break;
          }
          if (i10 == this.j) {
            i2 = i6;
          }
          ((b)localObject).b = i6;
        }
      }
      i5 = i7 + 1;
      i3 = i8;
      i2 = i9;
    }
    if (i3 != 0) {
      this.i.a(this);
    }
    Collections.sort(this.f, b);
    if (i4 != 0)
    {
      i5 = getChildCount();
      for (i3 = 0; i3 < i5; i3++)
      {
        localObject = (c)getChildAt(i3).getLayoutParams();
        if (!((c)localObject).a) {
          ((c)localObject).c = 0.0F;
        }
      }
      a(i2, false, true);
      requestLayout();
    }
  }
  
  protected void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i1 = this.aa;
    int i2 = 0;
    Object localObject;
    if (i1 > 0)
    {
      int i3 = getScrollX();
      i1 = getPaddingLeft();
      int i4 = getPaddingRight();
      int i5 = getWidth();
      int i6 = getChildCount();
      for (int i7 = 0; i7 < i6; i7++)
      {
        View localView = getChildAt(i7);
        localObject = (c)localView.getLayoutParams();
        if (((c)localObject).a)
        {
          int i8 = ((c)localObject).b & 0x7;
          if (i8 != 1)
          {
            int i9;
            if (i8 != 3)
            {
              if (i8 != 5)
              {
                i9 = i1;
                i8 = i1;
                i1 = i9;
              }
              else
              {
                i8 = i5 - i4 - localView.getMeasuredWidth();
                i4 += localView.getMeasuredWidth();
              }
            }
            else
            {
              i9 = localView.getWidth() + i1;
              i8 = i1;
              i1 = i9;
            }
          }
          else
          {
            i8 = Math.max((i5 - localView.getMeasuredWidth()) / 2, i1);
          }
          i8 = i8 + i3 - localView.getLeft();
          if (i8 != 0) {
            localView.offsetLeftAndRight(i8);
          }
        }
      }
    }
    b(paramInt1, paramFloat, paramInt2);
    if (this.fa != null)
    {
      i1 = getScrollX();
      paramInt2 = getChildCount();
      for (paramInt1 = i2; paramInt1 < paramInt2; paramInt1++)
      {
        localObject = getChildAt(paramInt1);
        if (!((c)((View)localObject).getLayoutParams()).a)
        {
          paramFloat = (((View)localObject).getLeft() - i1) / getClientWidth();
          this.fa.a((View)localObject, paramFloat);
        }
      }
    }
    this.W = true;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    Scroller localScroller = this.n;
    int i1;
    if ((localScroller != null) && (!localScroller.isFinished())) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (i1 != 0)
    {
      if (this.o) {
        i1 = this.n.getCurrX();
      } else {
        i1 = this.n.getStartX();
      }
      this.n.abortAnimation();
      setScrollingCacheEnabled(false);
    }
    else
    {
      i1 = getScrollX();
    }
    int i2 = getScrollY();
    int i3 = paramInt1 - i1;
    paramInt2 -= i2;
    if ((i3 == 0) && (paramInt2 == 0))
    {
      a(false);
      e();
      setScrollState(0);
      return;
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    int i4 = getClientWidth();
    paramInt1 = i4 / 2;
    float f1 = Math.abs(i3);
    float f2 = i4;
    float f3 = Math.min(1.0F, f1 * 1.0F / f2);
    f1 = paramInt1;
    f3 = a(f3);
    paramInt1 = Math.abs(paramInt3);
    if (paramInt1 > 0)
    {
      paramInt1 = Math.round(Math.abs((f1 + f3 * f1) / paramInt1) * 1000.0F) * 4;
    }
    else
    {
      f1 = this.i.b(this.j);
      paramInt1 = (int)((Math.abs(i3) / (f2 * f1 + this.q) + 1.0F) * 100.0F);
    }
    paramInt1 = Math.min(paramInt1, 600);
    this.o = false;
    this.n.startScroll(i1, i2, i3, paramInt2, paramInt1);
    y.E(this);
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.A = false;
    a(paramInt, paramBoolean, false);
  }
  
  void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    s locals = this.i;
    if ((locals != null) && (locals.a() > 0))
    {
      if ((!paramBoolean2) && (this.j == paramInt1) && (this.f.size() != 0))
      {
        setScrollingCacheEnabled(false);
        return;
      }
      paramBoolean2 = true;
      int i1;
      if (paramInt1 < 0)
      {
        i1 = 0;
      }
      else
      {
        i1 = paramInt1;
        if (paramInt1 >= this.i.a()) {
          i1 = this.i.a() - 1;
        }
      }
      int i2 = this.B;
      paramInt1 = this.j;
      if ((i1 > paramInt1 + i2) || (i1 < paramInt1 - i2)) {
        for (paramInt1 = 0; paramInt1 < this.f.size(); paramInt1++) {
          ((b)this.f.get(paramInt1)).c = true;
        }
      }
      if (this.j == i1) {
        paramBoolean2 = false;
      }
      if (this.U)
      {
        this.j = i1;
        if (paramBoolean2) {
          d(i1);
        }
        requestLayout();
      }
      else
      {
        c(i1);
        a(i1, paramBoolean1, paramInt2, paramBoolean2);
      }
      return;
    }
    setScrollingCacheEnabled(false);
  }
  
  public void a(e parame)
  {
    if (this.ea == null) {
      this.ea = new ArrayList();
    }
    this.ea.add(parame);
  }
  
  public void a(f paramf)
  {
    if (this.ba == null) {
      this.ba = new ArrayList();
    }
    this.ba.add(paramf);
  }
  
  public boolean a(int paramInt)
  {
    View localView1 = findFocus();
    boolean bool = false;
    View localView2 = null;
    Object localObject;
    int i1;
    if (localView1 == this)
    {
      localObject = localView2;
    }
    else
    {
      if (localView1 != null)
      {
        for (localObject = localView1.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent()) {
          if (localObject == this)
          {
            i1 = 1;
            break label67;
          }
        }
        i1 = 0;
        label67:
        if (i1 == 0)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localView1.getClass().getSimpleName());
          for (localObject = localView1.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent())
          {
            localStringBuilder.append(" => ");
            localStringBuilder.append(localObject.getClass().getSimpleName());
          }
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("arrowScroll tried to find focus based on non-child current focused view ");
          ((StringBuilder)localObject).append(localStringBuilder.toString());
          Log.e("ViewPager", ((StringBuilder)localObject).toString());
          localObject = localView2;
          break label194;
        }
      }
      localObject = localView1;
    }
    label194:
    localView2 = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
    int i2;
    if ((localView2 != null) && (localView2 != localObject)) {
      if (paramInt == 17)
      {
        i2 = a(this.h, localView2).left;
        i1 = a(this.h, (View)localObject).left;
        if ((localObject != null) && (i2 >= i1)) {
          bool = c();
        } else {
          bool = localView2.requestFocus();
        }
      }
    }
    for (;;)
    {
      break;
      if (paramInt == 66)
      {
        i1 = a(this.h, localView2).left;
        i2 = a(this.h, (View)localObject).left;
        if ((localObject != null) && (i1 <= i2))
        {
          bool = d();
        }
        else
        {
          bool = localView2.requestFocus();
          continue;
          if ((paramInt != 17) && (paramInt != 1))
          {
            if ((paramInt == 66) || (paramInt == 2)) {
              bool = d();
            }
          }
          else {
            bool = c();
          }
        }
      }
    }
    if (bool) {
      playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
    }
    return bool;
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      int i1 = paramKeyEvent.getKeyCode();
      if (i1 != 21)
      {
        if (i1 != 22)
        {
          if (i1 == 61)
          {
            if (paramKeyEvent.hasNoModifiers()) {
              return a(2);
            }
            if (paramKeyEvent.hasModifiers(1)) {
              return a(1);
            }
          }
        }
        else
        {
          if (paramKeyEvent.hasModifiers(2)) {
            return d();
          }
          return a(66);
        }
      }
      else
      {
        if (paramKeyEvent.hasModifiers(2)) {
          return c();
        }
        return a(17);
      }
    }
    boolean bool = false;
    return bool;
  }
  
  protected boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    boolean bool2 = true;
    if (bool1)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i1 = paramView.getScrollX();
      int i2 = paramView.getScrollY();
      for (int i3 = localViewGroup.getChildCount() - 1; i3 >= 0; i3--)
      {
        View localView = localViewGroup.getChildAt(i3);
        int i4 = paramInt2 + i1;
        if ((i4 >= localView.getLeft()) && (i4 < localView.getRight()))
        {
          int i5 = paramInt3 + i2;
          if ((i5 >= localView.getTop()) && (i5 < localView.getBottom()) && (a(localView, true, paramInt1, i4 - localView.getLeft(), i5 - localView.getTop()))) {
            return true;
          }
        }
      }
    }
    if ((paramBoolean) && (paramView.canScrollHorizontally(-paramInt1))) {
      paramBoolean = bool2;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i1 = paramArrayList.size();
    int i2 = getDescendantFocusability();
    if (i2 != 393216) {
      for (int i3 = 0; i3 < getChildCount(); i3++)
      {
        View localView = getChildAt(i3);
        if (localView.getVisibility() == 0)
        {
          b localb = b(localView);
          if ((localb != null) && (localb.b == this.j)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if ((i2 != 262144) || (i1 == paramArrayList.size()))
    {
      if (!isFocusable()) {
        return;
      }
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) {
        return;
      }
      if (paramArrayList != null) {
        paramArrayList.add(this);
      }
    }
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i1 = 0; i1 < getChildCount(); i1++)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        b localb = b(localView);
        if ((localb != null) && (localb.b == this.j)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    ViewGroup.LayoutParams localLayoutParams = paramLayoutParams;
    if (!checkLayoutParams(paramLayoutParams)) {
      localLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    paramLayoutParams = (c)localLayoutParams;
    paramLayoutParams.a |= c(paramView);
    if (this.y)
    {
      if ((paramLayoutParams != null) && (paramLayoutParams.a)) {
        throw new IllegalStateException("Cannot add pager decor view during layout");
      }
      paramLayoutParams.d = true;
      addViewInLayout(paramView, paramInt, localLayoutParams);
    }
    else
    {
      super.addView(paramView, paramInt, localLayoutParams);
    }
  }
  
  b b(int paramInt)
  {
    for (int i1 = 0; i1 < this.f.size(); i1++)
    {
      b localb = (b)this.f.get(i1);
      if (localb.b == paramInt) {
        return localb;
      }
    }
    return null;
  }
  
  b b(View paramView)
  {
    for (int i1 = 0; i1 < this.f.size(); i1++)
    {
      b localb = (b)this.f.get(i1);
      if (this.i.a(paramView, localb.a)) {
        return localb;
      }
    }
    return null;
  }
  
  void b()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.n = new Scroller(localContext, c);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f1 = localContext.getResources().getDisplayMetrics().density;
    this.G = localViewConfiguration.getScaledPagingTouchSlop();
    this.N = ((int)(400.0F * f1));
    this.O = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.S = new EdgeEffect(localContext);
    this.T = new EdgeEffect(localContext);
    this.P = ((int)(25.0F * f1));
    this.Q = ((int)(2.0F * f1));
    this.E = ((int)(f1 * 16.0F));
    y.a(this, new d());
    if (y.j(this) == 0) {
      y.d(this, 1);
    }
    y.a(this, new E(this));
  }
  
  public void b(e parame)
  {
    List localList = this.ea;
    if (localList != null) {
      localList.remove(parame);
    }
  }
  
  public void b(f paramf)
  {
    List localList = this.ba;
    if (localList != null) {
      localList.remove(paramf);
    }
  }
  
  void c(int paramInt)
  {
    int i1 = this.j;
    if (i1 != paramInt)
    {
      localObject1 = b(i1);
      this.j = paramInt;
    }
    else
    {
      localObject1 = null;
    }
    if (this.i == null)
    {
      j();
      return;
    }
    if (this.A)
    {
      j();
      return;
    }
    if (getWindowToken() == null) {
      return;
    }
    this.i.b(this);
    paramInt = this.B;
    int i2 = Math.max(0, this.j - paramInt);
    int i3 = this.i.a();
    int i4 = Math.min(i3 - 1, this.j + paramInt);
    Object localObject2;
    if (i3 == this.e)
    {
      int i5;
      for (paramInt = 0; paramInt < this.f.size(); paramInt++)
      {
        localObject2 = (b)this.f.get(paramInt);
        i1 = ((b)localObject2).b;
        i5 = this.j;
        if (i1 >= i5)
        {
          if (i1 != i5) {
            break;
          }
          break label178;
        }
      }
      localObject2 = null;
      label178:
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = localObject2;
        if (i3 > 0) {
          localObject3 = a(this.j, paramInt);
        }
      }
      if (localObject3 != null)
      {
        i1 = paramInt - 1;
        if (i1 >= 0) {
          localObject2 = (b)this.f.get(i1);
        } else {
          localObject2 = null;
        }
        int i6 = getClientWidth();
        float f1;
        if (i6 <= 0) {
          f1 = 0.0F;
        } else {
          f1 = 2.0F - ((b)localObject3).d + getPaddingLeft() / i6;
        }
        int i7 = this.j - 1;
        float f2 = 0.0F;
        float f3;
        int i8;
        Object localObject4;
        while (i7 >= 0)
        {
          if ((f2 >= f1) && (i7 < i2))
          {
            if (localObject2 == null) {
              break;
            }
            f3 = f2;
            i8 = paramInt;
            localObject4 = localObject2;
            i5 = i1;
            if (i7 != ((b)localObject2).b) {
              break label559;
            }
            f3 = f2;
            i8 = paramInt;
            localObject4 = localObject2;
            i5 = i1;
            if (((b)localObject2).c) {
              break label559;
            }
            this.f.remove(i1);
            this.i.a(this, i7, ((b)localObject2).a);
            i1--;
            paramInt--;
            f3 = f2;
            i5 = paramInt;
            i8 = i1;
            if (i1 >= 0)
            {
              localObject2 = (b)this.f.get(i1);
              f3 = f2;
              break label549;
            }
          }
          else if ((localObject2 != null) && (i7 == ((b)localObject2).b))
          {
            f2 += ((b)localObject2).d;
            i1--;
            f3 = f2;
            i5 = paramInt;
            i8 = i1;
            if (i1 >= 0)
            {
              localObject2 = (b)this.f.get(i1);
              f3 = f2;
              break label549;
            }
          }
          else
          {
            f2 += a(i7, i1 + 1).d;
            paramInt++;
            f3 = f2;
            i5 = paramInt;
            i8 = i1;
            if (i1 >= 0)
            {
              localObject2 = (b)this.f.get(i1);
              f3 = f2;
              break label549;
            }
          }
          localObject2 = null;
          i1 = i8;
          paramInt = i5;
          label549:
          i5 = i1;
          localObject4 = localObject2;
          i8 = paramInt;
          label559:
          i7--;
          f2 = f3;
          paramInt = i8;
          localObject2 = localObject4;
          i1 = i5;
        }
        f2 = ((b)localObject3).d;
        i5 = paramInt + 1;
        if (f2 < 2.0F)
        {
          if (i5 < this.f.size()) {
            localObject2 = (b)this.f.get(i5);
          } else {
            localObject2 = null;
          }
          if (i6 <= 0) {
            f1 = 0.0F;
          } else {
            f1 = getPaddingRight() / i6 + 2.0F;
          }
          i1 = this.j;
          localObject4 = localObject2;
          for (;;)
          {
            i8 = i1 + 1;
            if (i8 >= i3) {
              break;
            }
            if ((f2 >= f1) && (i8 > i4))
            {
              if (localObject4 == null) {
                break;
              }
              f3 = f2;
              i1 = i5;
              localObject2 = localObject4;
              if (i8 != ((b)localObject4).b) {
                break label946;
              }
              f3 = f2;
              i1 = i5;
              localObject2 = localObject4;
              if (((b)localObject4).c) {
                break label946;
              }
              this.f.remove(i5);
              this.i.a(this, i8, ((b)localObject4).a);
              f3 = f2;
              i1 = i5;
              if (i5 < this.f.size())
              {
                localObject2 = (b)this.f.get(i5);
                f3 = f2;
                i1 = i5;
                break label946;
              }
            }
            do
            {
              do
              {
                localObject2 = null;
                break label946;
                if ((localObject4 == null) || (i8 != ((b)localObject4).b)) {
                  break;
                }
                f2 += ((b)localObject4).d;
                i5++;
                f3 = f2;
                i1 = i5;
              } while (i5 >= this.f.size());
              localObject2 = (b)this.f.get(i5);
              f3 = f2;
              i1 = i5;
              break;
              localObject2 = a(i8, i5);
              i5++;
              f2 += ((b)localObject2).d;
              f3 = f2;
              i1 = i5;
            } while (i5 >= this.f.size());
            localObject2 = (b)this.f.get(i5);
            i1 = i5;
            f3 = f2;
            label946:
            f2 = f3;
            i5 = i1;
            localObject4 = localObject2;
            i1 = i8;
          }
        }
        a((b)localObject3, paramInt, (b)localObject1);
        this.i.b(this, this.j, ((b)localObject3).a);
      }
      this.i.a(this);
      i1 = getChildCount();
      for (paramInt = 0; paramInt < i1; paramInt++)
      {
        localObject1 = getChildAt(paramInt);
        localObject2 = (c)((View)localObject1).getLayoutParams();
        ((c)localObject2).f = paramInt;
        if ((!((c)localObject2).a) && (((c)localObject2).c == 0.0F))
        {
          localObject1 = b((View)localObject1);
          if (localObject1 != null)
          {
            ((c)localObject2).c = ((b)localObject1).d;
            ((c)localObject2).e = ((b)localObject1).b;
          }
        }
      }
      j();
      if (hasFocus())
      {
        localObject2 = findFocus();
        if (localObject2 != null) {
          localObject2 = a((View)localObject2);
        } else {
          localObject2 = null;
        }
        if ((localObject2 == null) || (((b)localObject2).b != this.j)) {
          for (paramInt = 0; paramInt < getChildCount(); paramInt++)
          {
            localObject1 = getChildAt(paramInt);
            localObject2 = b((View)localObject1);
            if ((localObject2 != null) && (((b)localObject2).b == this.j) && (((View)localObject1).requestFocus(2))) {
              break;
            }
          }
        }
      }
      return;
    }
    String str;
    try
    {
      localObject2 = getResources().getResourceName(getId());
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      str = Integer.toHexString(getId());
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
    ((StringBuilder)localObject1).append(this.e);
    ((StringBuilder)localObject1).append(", found: ");
    ((StringBuilder)localObject1).append(i3);
    ((StringBuilder)localObject1).append(" Pager id: ");
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(" Pager class: ");
    ((StringBuilder)localObject1).append(getClass());
    ((StringBuilder)localObject1).append(" Problematic adapter: ");
    ((StringBuilder)localObject1).append(this.i.getClass());
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  boolean c()
  {
    int i1 = this.j;
    if (i1 > 0)
    {
      a(i1 - 1, true);
      return true;
    }
    return false;
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    s locals = this.i;
    boolean bool1 = false;
    boolean bool2 = false;
    if (locals == null) {
      return false;
    }
    int i1 = getClientWidth();
    int i2 = getScrollX();
    if (paramInt < 0)
    {
      if (i2 > (int)(i1 * this.u)) {
        bool2 = true;
      }
      return bool2;
    }
    bool2 = bool1;
    if (paramInt > 0)
    {
      bool2 = bool1;
      if (i2 < (int)(i1 * this.v)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof c)) && (super.checkLayoutParams(paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void computeScroll()
  {
    this.o = true;
    if ((!this.n.isFinished()) && (this.n.computeScrollOffset()))
    {
      int i1 = getScrollX();
      int i2 = getScrollY();
      int i3 = this.n.getCurrX();
      int i4 = this.n.getCurrY();
      if ((i1 != i3) || (i2 != i4))
      {
        scrollTo(i3, i4);
        if (!f(i3))
        {
          this.n.abortAnimation();
          scrollTo(0, i4);
        }
      }
      y.E(this);
      return;
    }
    a(true);
  }
  
  boolean d()
  {
    s locals = this.i;
    if ((locals != null) && (this.j < locals.a() - 1))
    {
      a(this.j + 1, true);
      return true;
    }
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!super.dispatchKeyEvent(paramKeyEvent)) && (!a(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 4096) {
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    }
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if (localView.getVisibility() == 0)
      {
        b localb = b(localView);
        if ((localb != null) && (localb.b == this.j) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i1 = getOverScrollMode();
    int i2 = 0;
    int i3 = 0;
    if (i1 != 0) {
      if (i1 == 1)
      {
        s locals = this.i;
        if ((locals != null) && (locals.a() > 1)) {}
      }
      else
      {
        this.S.finish();
        this.T.finish();
        break label256;
      }
    }
    int i4;
    if (!this.S.isFinished())
    {
      i2 = paramCanvas.save();
      i3 = getHeight() - getPaddingTop() - getPaddingBottom();
      i1 = getWidth();
      paramCanvas.rotate(270.0F);
      paramCanvas.translate(-i3 + getPaddingTop(), this.u * i1);
      this.S.setSize(i3, i1);
      i4 = false | this.S.draw(paramCanvas);
      paramCanvas.restoreToCount(i2);
    }
    i2 = i4;
    boolean bool;
    if (!this.T.isFinished())
    {
      i1 = paramCanvas.save();
      int i5 = getWidth();
      int i6 = getHeight();
      i2 = getPaddingTop();
      int i7 = getPaddingBottom();
      paramCanvas.rotate(90.0F);
      paramCanvas.translate(-getPaddingTop(), -(this.v + 1.0F) * i5);
      this.T.setSize(i6 - i2 - i7, i5);
      bool = i4 | this.T.draw(paramCanvas);
      paramCanvas.restoreToCount(i1);
    }
    label256:
    if (bool) {
      y.E(this);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.r;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  void e()
  {
    c(this.j);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new c();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new c(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  public s getAdapter()
  {
    return this.i;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    if (this.ha == 2) {
      i1 = paramInt1 - 1 - paramInt2;
    }
    return ((c)((View)this.ia.get(i1)).getLayoutParams()).f;
  }
  
  public int getCurrentItem()
  {
    return this.j;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.B;
  }
  
  public int getPageMargin()
  {
    return this.q;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.U = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.ja);
    Scroller localScroller = this.n;
    if ((localScroller != null) && (!localScroller.isFinished())) {
      this.n.abortAnimation();
    }
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.q > 0) && (this.r != null) && (this.f.size() > 0) && (this.i != null))
    {
      int i1 = getScrollX();
      int i2 = getWidth();
      float f1 = this.q;
      float f2 = i2;
      float f3 = f1 / f2;
      Object localObject = this.f;
      int i3 = 0;
      localObject = (b)((ArrayList)localObject).get(0);
      f1 = ((b)localObject).e;
      int i4 = this.f.size();
      int i5 = ((b)localObject).b;
      int i6 = ((b)this.f.get(i4 - 1)).b;
      while (i5 < i6)
      {
        while ((i5 > ((b)localObject).b) && (i3 < i4))
        {
          localObject = this.f;
          i3++;
          localObject = (b)((ArrayList)localObject).get(i3);
        }
        float f4;
        float f5;
        if (i5 == ((b)localObject).b)
        {
          f1 = ((b)localObject).e;
          f4 = ((b)localObject).d;
          f5 = (f1 + f4) * f2;
          f1 = f1 + f4 + f3;
        }
        else
        {
          f4 = this.i.b(i5);
          f5 = (f1 + f4) * f2;
          f1 += f4 + f3;
        }
        if (this.q + f5 > i1)
        {
          this.r.setBounds(Math.round(f5), this.s, Math.round(this.q + f5), this.t);
          this.r.draw(paramCanvas);
        }
        if (f5 > i1 + i2) {
          break;
        }
        i5++;
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction() & 0xFF;
    if ((i1 != 3) && (i1 != 1))
    {
      if (i1 != 0)
      {
        if (this.C) {
          return true;
        }
        if (this.D) {
          return false;
        }
      }
      float f2;
      if (i1 != 0)
      {
        if (i1 != 2)
        {
          if (i1 == 6) {
            a(paramMotionEvent);
          }
        }
        else
        {
          i1 = this.L;
          if (i1 != -1)
          {
            i1 = paramMotionEvent.findPointerIndex(i1);
            float f1 = paramMotionEvent.getX(i1);
            f2 = f1 - this.H;
            float f3 = Math.abs(f2);
            float f4 = paramMotionEvent.getY(i1);
            float f5 = Math.abs(f4 - this.K);
            boolean bool = f2 < 0.0F;
            if ((bool) && (!a(this.H, f2)) && (a(this, false, (int)f2, (int)f1, (int)f4)))
            {
              this.H = f1;
              this.I = f4;
              this.D = true;
              return false;
            }
            if ((f3 > this.G) && (f3 * 0.5F > f5))
            {
              this.C = true;
              c(true);
              setScrollState(1);
              if (bool) {
                f2 = this.J + this.G;
              } else {
                f2 = this.J - this.G;
              }
              this.H = f2;
              this.I = f4;
              setScrollingCacheEnabled(true);
            }
            else if (f5 > this.G)
            {
              this.D = true;
            }
            if ((this.C) && (b(f1))) {
              y.E(this);
            }
          }
        }
      }
      else
      {
        f2 = paramMotionEvent.getX();
        this.J = f2;
        this.H = f2;
        f2 = paramMotionEvent.getY();
        this.K = f2;
        this.I = f2;
        this.L = paramMotionEvent.getPointerId(0);
        this.D = false;
        this.o = true;
        this.n.computeScrollOffset();
        if ((this.ka == 2) && (Math.abs(this.n.getFinalX() - this.n.getCurrX()) > this.Q))
        {
          this.n.abortAnimation();
          this.A = false;
          e();
          this.C = true;
          c(true);
          setScrollState(1);
        }
        else
        {
          a(false);
          this.C = false;
        }
      }
      if (this.M == null) {
        this.M = VelocityTracker.obtain();
      }
      this.M.addMovement(paramMotionEvent);
      return this.C;
    }
    i();
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i2 = paramInt3 - paramInt1;
    int i3 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    int i4 = getPaddingRight();
    paramInt4 = getPaddingBottom();
    int i5 = getScrollX();
    int i6 = 0;
    int i7 = 0;
    View localView;
    int i8;
    c localc;
    while (i7 < i1)
    {
      localView = getChildAt(i7);
      i8 = paramInt2;
      int i9 = i4;
      int i10 = paramInt1;
      int i11 = paramInt4;
      paramInt3 = i6;
      if (localView.getVisibility() != 8)
      {
        localc = (c)localView.getLayoutParams();
        i8 = paramInt2;
        i9 = i4;
        i10 = paramInt1;
        i11 = paramInt4;
        paramInt3 = i6;
        if (localc.a)
        {
          i8 = localc.b;
          paramInt3 = i8 & 0x7;
          i11 = i8 & 0x70;
          if (paramInt3 != 1)
          {
            if (paramInt3 != 3)
            {
              if (paramInt3 != 5)
              {
                paramInt3 = paramInt2;
                i8 = paramInt2;
              }
              else
              {
                paramInt3 = i2 - i4 - localView.getMeasuredWidth();
                i4 += localView.getMeasuredWidth();
                i8 = paramInt2;
              }
            }
            else
            {
              i8 = localView.getMeasuredWidth();
              paramInt3 = paramInt2;
              i8 += paramInt2;
            }
          }
          else
          {
            paramInt3 = Math.max((i2 - localView.getMeasuredWidth()) / 2, paramInt2);
            i8 = paramInt2;
          }
          if (i11 != 16)
          {
            if (i11 != 48)
            {
              if (i11 != 80)
              {
                paramInt2 = paramInt1;
              }
              else
              {
                paramInt2 = i3 - paramInt4 - localView.getMeasuredHeight();
                paramInt4 += localView.getMeasuredHeight();
              }
            }
            else
            {
              i11 = localView.getMeasuredHeight();
              paramInt2 = paramInt1;
              paramInt1 = i11 + paramInt1;
            }
          }
          else {
            paramInt2 = Math.max((i3 - localView.getMeasuredHeight()) / 2, paramInt1);
          }
          paramInt3 += i5;
          localView.layout(paramInt3, paramInt2, localView.getMeasuredWidth() + paramInt3, paramInt2 + localView.getMeasuredHeight());
          paramInt3 = i6 + 1;
          i11 = paramInt4;
          i10 = paramInt1;
          i9 = i4;
        }
      }
      i7++;
      paramInt2 = i8;
      i4 = i9;
      paramInt1 = i10;
      paramInt4 = i11;
      i6 = paramInt3;
    }
    for (paramInt3 = 0; paramInt3 < i1; paramInt3++)
    {
      localView = getChildAt(paramInt3);
      if (localView.getVisibility() != 8)
      {
        localc = (c)localView.getLayoutParams();
        if (!localc.a)
        {
          b localb = b(localView);
          if (localb != null)
          {
            float f1 = i2 - paramInt2 - i4;
            i8 = (int)(localb.e * f1) + paramInt2;
            if (localc.d)
            {
              localc.d = false;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(f1 * localc.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i3 - paramInt1 - paramInt4, 1073741824));
            }
            localView.layout(i8, paramInt1, localView.getMeasuredWidth() + i8, localView.getMeasuredHeight() + paramInt1);
          }
        }
      }
    }
    this.s = paramInt1;
    this.t = (i3 - paramInt4);
    this.aa = i6;
    if (this.U) {
      a(this.j, false, 0, false);
    }
    this.U = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    setMeasuredDimension(ViewGroup.getDefaultSize(0, paramInt1), ViewGroup.getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.F = Math.min(paramInt1 / 10, this.E);
    int i2 = getPaddingLeft();
    int i3 = getPaddingRight();
    int i4 = getMeasuredHeight();
    int i5 = getPaddingTop();
    paramInt2 = getPaddingBottom();
    int i6 = getChildCount();
    paramInt2 = i4 - i5 - paramInt2;
    paramInt1 = paramInt1 - i2 - i3;
    i4 = 0;
    View localView;
    c localc;
    for (;;)
    {
      int i7 = 1;
      int i8 = 1073741824;
      if (i4 >= i6) {
        break;
      }
      localView = getChildAt(i4);
      i2 = paramInt2;
      i3 = paramInt1;
      if (localView.getVisibility() != 8)
      {
        localc = (c)localView.getLayoutParams();
        i2 = paramInt2;
        i3 = paramInt1;
        if (localc != null)
        {
          i2 = paramInt2;
          i3 = paramInt1;
          if (localc.a)
          {
            i3 = localc.b;
            i2 = i3 & 0x7;
            i3 &= 0x70;
            int i9;
            if ((i3 != 48) && (i3 != 80)) {
              i9 = 0;
            } else {
              i9 = 1;
            }
            i5 = i7;
            if (i2 != 3) {
              if (i2 == 5) {
                i5 = i7;
              } else {
                i5 = 0;
              }
            }
            i2 = Integer.MIN_VALUE;
            if (i9 != 0)
            {
              i3 = 1073741824;
            }
            else
            {
              i3 = i2;
              if (i5 != 0)
              {
                i7 = 1073741824;
                i3 = i2;
                i2 = i7;
                break label285;
              }
            }
            i2 = Integer.MIN_VALUE;
            label285:
            i7 = localc.width;
            int i10;
            if (i7 != -2)
            {
              if (i7 != -1) {
                i3 = i7;
              } else {
                i3 = paramInt1;
              }
              i10 = 1073741824;
              i7 = i3;
            }
            else
            {
              i7 = paramInt1;
              i10 = i3;
            }
            i3 = localc.height;
            if (i3 != -2)
            {
              if (i3 != -1) {
                i2 = i3;
              } else {
                i2 = paramInt2;
              }
            }
            else
            {
              i3 = paramInt2;
              i8 = i2;
              i2 = i3;
            }
            localView.measure(View.MeasureSpec.makeMeasureSpec(i7, i10), View.MeasureSpec.makeMeasureSpec(i2, i8));
            if (i9 != 0)
            {
              i2 = paramInt2 - localView.getMeasuredHeight();
              i3 = paramInt1;
            }
            else
            {
              i2 = paramInt2;
              i3 = paramInt1;
              if (i5 != 0)
              {
                i3 = paramInt1 - localView.getMeasuredWidth();
                i2 = paramInt2;
              }
            }
          }
        }
      }
      i4++;
      paramInt2 = i2;
      paramInt1 = i3;
    }
    this.w = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    this.x = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
    this.y = true;
    e();
    this.y = false;
    i2 = getChildCount();
    for (paramInt2 = i1; paramInt2 < i2; paramInt2++)
    {
      localView = getChildAt(paramInt2);
      if (localView.getVisibility() != 8)
      {
        localc = (c)localView.getLayoutParams();
        if ((localc == null) || (!localc.a)) {
          localView.measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * localc.c), 1073741824), this.x);
        }
      }
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1 = getChildCount();
    int i2 = -1;
    int i3;
    if ((paramInt & 0x2) != 0)
    {
      i2 = i1;
      i1 = 0;
      i3 = 1;
    }
    else
    {
      i1--;
      i3 = -1;
    }
    while (i1 != i2)
    {
      View localView = getChildAt(i1);
      if (localView.getVisibility() == 0)
      {
        b localb = b(localView);
        if ((localb != null) && (localb.b == this.j) && (localView.requestFocus(paramInt, paramRect))) {
          return true;
        }
      }
      i1 += i3;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof i))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    i locali = (i)paramParcelable;
    super.onRestoreInstanceState(locali.l());
    paramParcelable = this.i;
    if (paramParcelable != null)
    {
      paramParcelable.a(locali.d, locali.e);
      a(locali.c, false, true);
    }
    else
    {
      this.k = locali.c;
      this.l = locali.d;
      this.m = locali.e;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    i locali = new i(super.onSaveInstanceState());
    locali.c = this.j;
    s locals = this.i;
    if (locals != null) {
      locali.d = locals.c();
    }
    return locali;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      paramInt2 = this.q;
      a(paramInt1, paramInt3, paramInt2, paramInt2);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.R) {
      return true;
    }
    int i1 = paramMotionEvent.getAction();
    boolean bool = false;
    if ((i1 == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    Object localObject = this.i;
    if ((localObject != null) && (((s)localObject).a() != 0))
    {
      if (this.M == null) {
        this.M = VelocityTracker.obtain();
      }
      this.M.addMovement(paramMotionEvent);
      i1 = paramMotionEvent.getAction() & 0xFF;
      float f1;
      if (i1 != 0)
      {
        float f3;
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 5)
              {
                if (i1 == 6)
                {
                  a(paramMotionEvent);
                  this.H = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.L));
                }
              }
              else
              {
                i1 = paramMotionEvent.getActionIndex();
                this.H = paramMotionEvent.getX(i1);
                this.L = paramMotionEvent.getPointerId(i1);
              }
            }
            else if (this.C)
            {
              a(this.j, true, 0, false);
              bool = i();
            }
          }
          else
          {
            if (!this.C)
            {
              i1 = paramMotionEvent.findPointerIndex(this.L);
              if (i1 == -1)
              {
                bool = i();
                break label601;
              }
              f1 = paramMotionEvent.getX(i1);
              float f2 = Math.abs(f1 - this.H);
              f3 = paramMotionEvent.getY(i1);
              float f4 = Math.abs(f3 - this.I);
              if ((f2 > this.G) && (f2 > f4))
              {
                this.C = true;
                c(true);
                f4 = this.J;
                if (f1 - f4 > 0.0F) {
                  f1 = f4 + this.G;
                } else {
                  f1 = f4 - this.G;
                }
                this.H = f1;
                this.I = f3;
                setScrollState(1);
                setScrollingCacheEnabled(true);
                localObject = getParent();
                if (localObject != null) {
                  ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
                }
              }
            }
            if (this.C) {
              bool = false | b(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.L)));
            }
          }
        }
        else if (this.C)
        {
          localObject = this.M;
          ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.O);
          int i2 = (int)((VelocityTracker)localObject).getXVelocity(this.L);
          this.A = true;
          int i3 = getClientWidth();
          i1 = getScrollX();
          localObject = g();
          f3 = this.q;
          f1 = i3;
          f3 /= f1;
          a(a(((b)localObject).b, (i1 / f1 - ((b)localObject).e) / (((b)localObject).d + f3), i2, (int)(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(this.L)) - this.J)), true, true, i2);
          bool = i();
        }
      }
      else
      {
        this.n.abortAnimation();
        this.A = false;
        e();
        f1 = paramMotionEvent.getX();
        this.J = f1;
        this.H = f1;
        f1 = paramMotionEvent.getY();
        this.K = f1;
        this.I = f1;
        this.L = paramMotionEvent.getPointerId(0);
      }
      label601:
      if (bool) {
        y.E(this);
      }
      return true;
    }
    return false;
  }
  
  public void removeView(View paramView)
  {
    if (this.y) {
      removeViewInLayout(paramView);
    } else {
      super.removeView(paramView);
    }
  }
  
  public void setAdapter(s params)
  {
    Object localObject = this.i;
    int i1 = 0;
    int i2;
    if (localObject != null)
    {
      ((s)localObject).b(null);
      this.i.b(this);
      for (i2 = 0; i2 < this.f.size(); i2++)
      {
        localObject = (b)this.f.get(i2);
        this.i.a(this, ((b)localObject).b, ((b)localObject).a);
      }
      this.i.a(this);
      this.f.clear();
      h();
      this.j = 0;
      scrollTo(0, 0);
    }
    localObject = this.i;
    this.i = params;
    this.e = 0;
    if (this.i != null)
    {
      if (this.p == null) {
        this.p = new h();
      }
      this.i.b(this.p);
      this.A = false;
      boolean bool = this.U;
      this.U = true;
      this.e = this.i.a();
      if (this.k >= 0)
      {
        this.i.a(this.l, this.m);
        a(this.k, false, true);
        this.k = -1;
        this.l = null;
        this.m = null;
      }
      else if (!bool)
      {
        e();
      }
      else
      {
        requestLayout();
      }
    }
    List localList = this.ea;
    if ((localList != null) && (!localList.isEmpty()))
    {
      int i3 = this.ea.size();
      for (i2 = i1; i2 < i3; i2++) {
        ((e)this.ea.get(i2)).a(this, (s)localObject, params);
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.A = false;
    a(paramInt, this.U ^ true, false);
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 1)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Requested offscreen page limit ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" too small; defaulting to ");
      localStringBuilder.append(1);
      Log.w("ViewPager", localStringBuilder.toString());
      i1 = 1;
    }
    if (i1 != this.B)
    {
      this.B = i1;
      e();
    }
  }
  
  @Deprecated
  public void setOnPageChangeListener(f paramf)
  {
    this.ca = paramf;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i1 = this.q;
    this.q = paramInt;
    int i2 = getWidth();
    a(i2, i2, paramInt, i1);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(android.support.v4.content.c.c(getContext(), paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.r = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    boolean bool;
    if (paramDrawable == null) {
      bool = true;
    } else {
      bool = false;
    }
    setWillNotDraw(bool);
    invalidate();
  }
  
  void setScrollState(int paramInt)
  {
    if (this.ka == paramInt) {
      return;
    }
    this.ka = paramInt;
    if (this.fa != null)
    {
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      b(bool);
    }
    e(paramInt);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != this.r)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface a {}
  
  static class b
  {
    Object a;
    int b;
    boolean c;
    float d;
    float e;
  }
  
  public static class c
    extends ViewGroup.LayoutParams
  {
    public boolean a;
    public int b;
    float c = 0.0F;
    boolean d;
    int e;
    int f;
    
    public c()
    {
      super(-1);
    }
    
    public c(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.a);
      this.b = paramContext.getInteger(0, 48);
      paramContext.recycle();
    }
  }
  
  class d
    extends d
  {
    d() {}
    
    private boolean b()
    {
      s locals = ViewPager.this.i;
      boolean bool = true;
      if ((locals == null) || (locals.a() <= 1)) {
        bool = false;
      }
      return bool;
    }
    
    public void a(View paramView, zd paramzd)
    {
      super.a(paramView, paramzd);
      paramzd.a(ViewPager.class.getName());
      paramzd.k(b());
      if (ViewPager.this.canScrollHorizontally(1)) {
        paramzd.a(4096);
      }
      if (ViewPager.this.canScrollHorizontally(-1)) {
        paramzd.a(8192);
      }
    }
    
    public boolean a(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.a(paramView, paramInt, paramBundle)) {
        return true;
      }
      if (paramInt != 4096)
      {
        if (paramInt != 8192) {
          return false;
        }
        if (ViewPager.this.canScrollHorizontally(-1))
        {
          paramView = ViewPager.this;
          paramView.setCurrentItem(paramView.j - 1);
          return true;
        }
        return false;
      }
      if (ViewPager.this.canScrollHorizontally(1))
      {
        paramView = ViewPager.this;
        paramView.setCurrentItem(paramView.j + 1);
        return true;
      }
      return false;
    }
    
    public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.b(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ViewPager.class.getName());
      paramAccessibilityEvent.setScrollable(b());
      if (paramAccessibilityEvent.getEventType() == 4096)
      {
        paramView = ViewPager.this.i;
        if (paramView != null)
        {
          paramAccessibilityEvent.setItemCount(paramView.a());
          paramAccessibilityEvent.setFromIndex(ViewPager.this.j);
          paramAccessibilityEvent.setToIndex(ViewPager.this.j);
        }
      }
    }
  }
  
  public static abstract interface e
  {
    public abstract void a(ViewPager paramViewPager, s params1, s params2);
  }
  
  public static abstract interface f
  {
    public abstract void a(int paramInt);
    
    public abstract void a(int paramInt1, float paramFloat, int paramInt2);
    
    public abstract void b(int paramInt);
  }
  
  public static abstract interface g
  {
    public abstract void a(View paramView, float paramFloat);
  }
  
  private class h
    extends DataSetObserver
  {
    h() {}
    
    public void onChanged()
    {
      ViewPager.this.a();
    }
    
    public void onInvalidated()
    {
      ViewPager.this.a();
    }
  }
  
  public static class i
    extends c
  {
    public static final Parcelable.Creator<i> CREATOR = new F();
    int c;
    Parcelable d;
    ClassLoader e;
    
    i(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = i.class.getClassLoader();
      }
      this.c = paramParcel.readInt();
      this.d = paramParcel.readParcelable(localClassLoader);
      this.e = localClassLoader;
    }
    
    public i(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("FragmentPager.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" position=");
      localStringBuilder.append(this.c);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.c);
      paramParcel.writeParcelable(this.d, paramInt);
    }
  }
  
  static class j
    implements Comparator<View>
  {
    public int a(View paramView1, View paramView2)
    {
      paramView1 = (ViewPager.c)paramView1.getLayoutParams();
      paramView2 = (ViewPager.c)paramView2.getLayoutParams();
      boolean bool = paramView1.a;
      if (bool != paramView2.a)
      {
        int i;
        if (bool) {
          i = 1;
        } else {
          i = -1;
        }
        return i;
      }
      return paramView1.e - paramView2.e;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/ViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */