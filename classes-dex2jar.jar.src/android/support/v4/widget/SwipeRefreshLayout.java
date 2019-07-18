package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v4.view.p;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;

public class SwipeRefreshLayout
  extends ViewGroup
  implements p, m
{
  private static final String a = "SwipeRefreshLayout";
  private static final int[] b = { 16842766 };
  protected int A;
  int B;
  int C;
  f D;
  private Animation E;
  private Animation F;
  private Animation G;
  private Animation H;
  private Animation I;
  boolean J;
  private int K;
  boolean L;
  private a M;
  private Animation.AnimationListener N = new u(this);
  private final Animation O = new z(this);
  private final Animation P = new A(this);
  private View c;
  b d;
  boolean e = false;
  private int f;
  private float g = -1.0F;
  private float h;
  private final android.support.v4.view.q i;
  private final n j;
  private final int[] k = new int[2];
  private final int[] l = new int[2];
  private boolean m;
  private int n;
  int o;
  private float p;
  private float q;
  private boolean r;
  private int s = -1;
  boolean t;
  private boolean u;
  private final DecelerateInterpolator v;
  c w;
  private int x = -1;
  protected int y;
  float z;
  
  public SwipeRefreshLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeRefreshLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.f = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.n = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.v = new DecelerateInterpolator(2.0F);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.K = ((int)(localDisplayMetrics.density * 40.0F));
    c();
    setChildrenDrawingOrderEnabled(true);
    this.B = ((int)(localDisplayMetrics.density * 64.0F));
    this.g = this.B;
    this.i = new android.support.v4.view.q(this);
    this.j = new n(this);
    setNestedScrollingEnabled(true);
    int i1 = -this.K;
    this.o = i1;
    this.A = i1;
    a(1.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
  }
  
  private Animation a(int paramInt1, int paramInt2)
  {
    x localx = new x(this, paramInt1, paramInt2);
    localx.setDuration(300L);
    this.w.a(null);
    this.w.clearAnimation();
    this.w.startAnimation(localx);
    return localx;
  }
  
  private void a(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.y = paramInt;
    this.O.reset();
    this.O.setDuration(200L);
    this.O.setInterpolator(this.v);
    if (paramAnimationListener != null) {
      this.w.a(paramAnimationListener);
    }
    this.w.clearAnimation();
    this.w.startAnimation(this.O);
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i1) == this.s)
    {
      if (i1 == 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      this.s = paramMotionEvent.getPointerId(i1);
    }
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.e != paramBoolean1)
    {
      this.J = paramBoolean2;
      d();
      this.e = paramBoolean1;
      if (this.e) {
        a(this.o, this.N);
      } else {
        a(this.N);
      }
    }
  }
  
  private boolean a(Animation paramAnimation)
  {
    boolean bool;
    if ((paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void b(float paramFloat)
  {
    if (paramFloat > this.g)
    {
      a(true, true);
    }
    else
    {
      this.e = false;
      this.D.a(0.0F, 0.0F);
      y localy = null;
      if (!this.t) {
        localy = new y(this);
      }
      b(this.o, localy);
      this.D.a(false);
    }
  }
  
  private void b(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    if (this.t)
    {
      c(paramInt, paramAnimationListener);
    }
    else
    {
      this.y = paramInt;
      this.P.reset();
      this.P.setDuration(200L);
      this.P.setInterpolator(this.v);
      if (paramAnimationListener != null) {
        this.w.a(paramAnimationListener);
      }
      this.w.clearAnimation();
      this.w.startAnimation(this.P);
    }
  }
  
  private void b(Animation.AnimationListener paramAnimationListener)
  {
    this.w.setVisibility(0);
    this.D.setAlpha(255);
    this.E = new v(this);
    this.E.setDuration(this.n);
    if (paramAnimationListener != null) {
      this.w.a(paramAnimationListener);
    }
    this.w.clearAnimation();
    this.w.startAnimation(this.E);
  }
  
  private void c()
  {
    this.w = new c(getContext(), -328966);
    this.D = new f(getContext());
    this.D.a(1);
    this.w.setImageDrawable(this.D);
    this.w.setVisibility(8);
    addView(this.w);
  }
  
  private void c(float paramFloat)
  {
    this.D.a(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / this.g));
    float f2 = (float)Math.max(f1 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f3 = Math.abs(paramFloat);
    float f4 = this.g;
    int i1 = this.C;
    if (i1 > 0) {}
    float f5;
    for (;;)
    {
      f5 = i1;
      break;
      if (this.L) {
        i1 = this.B - this.A;
      } else {
        i1 = this.B;
      }
    }
    double d1 = Math.max(0.0F, Math.min(f3 - f4, f5 * 2.0F) / f5) / 4.0F;
    f3 = (float)(d1 - Math.pow(d1, 2.0D)) * 2.0F;
    i1 = this.A;
    int i2 = (int)(f5 * f1 + f5 * f3 * 2.0F);
    if (this.w.getVisibility() != 0) {
      this.w.setVisibility(0);
    }
    if (!this.t)
    {
      this.w.setScaleX(1.0F);
      this.w.setScaleY(1.0F);
    }
    if (this.t) {
      setAnimationProgress(Math.min(1.0F, paramFloat / this.g));
    }
    if (paramFloat < this.g)
    {
      if ((this.D.getAlpha() > 76) && (!a(this.G))) {
        f();
      }
    }
    else if ((this.D.getAlpha() < 255) && (!a(this.H))) {
      e();
    }
    this.D.a(0.0F, Math.min(0.8F, f2 * 0.8F));
    this.D.a(Math.min(1.0F, f2));
    this.D.b((f2 * 0.4F - 0.25F + f3 * 2.0F) * 0.5F);
    setTargetOffsetTopAndBottom(i1 + i2 - this.o);
  }
  
  private void c(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    this.y = paramInt;
    this.z = this.w.getScaleX();
    this.I = new B(this);
    this.I.setDuration(150L);
    if (paramAnimationListener != null) {
      this.w.a(paramAnimationListener);
    }
    this.w.clearAnimation();
    this.w.startAnimation(this.I);
  }
  
  private void d()
  {
    if (this.c == null) {
      for (int i1 = 0; i1 < getChildCount(); i1++)
      {
        View localView = getChildAt(i1);
        if (!localView.equals(this.w))
        {
          this.c = localView;
          break;
        }
      }
    }
  }
  
  private void d(float paramFloat)
  {
    float f1 = this.q;
    int i1 = this.f;
    if ((paramFloat - f1 > i1) && (!this.r))
    {
      this.p = (f1 + i1);
      this.r = true;
      this.D.setAlpha(76);
    }
  }
  
  private void e()
  {
    this.H = a(this.D.getAlpha(), 255);
  }
  
  private void f()
  {
    this.G = a(this.D.getAlpha(), 76);
  }
  
  private void setColorViewAlpha(int paramInt)
  {
    this.w.getBackground().setAlpha(paramInt);
    this.D.setAlpha(paramInt);
  }
  
  void a(float paramFloat)
  {
    int i1 = this.y;
    setTargetOffsetTopAndBottom(i1 + (int)((this.A - i1) * paramFloat) - this.w.getTop());
  }
  
  void a(Animation.AnimationListener paramAnimationListener)
  {
    this.F = new w(this);
    this.F.setDuration(150L);
    this.w.a(paramAnimationListener);
    this.w.clearAnimation();
    this.w.startAnimation(this.F);
  }
  
  public boolean a()
  {
    Object localObject = this.M;
    if (localObject != null) {
      return ((a)localObject).a(this, this.c);
    }
    localObject = this.c;
    if ((localObject instanceof ListView)) {
      return q.a((ListView)localObject, -1);
    }
    return ((View)localObject).canScrollVertically(-1);
  }
  
  void b()
  {
    this.w.clearAnimation();
    this.D.stop();
    this.w.setVisibility(8);
    setColorViewAlpha(255);
    if (this.t) {
      setAnimationProgress(0.0F);
    } else {
      setTargetOffsetTopAndBottom(this.A - this.o);
    }
    this.o = this.w.getTop();
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.j.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.j.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.j.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.j.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i1 = this.x;
    if (i1 < 0) {
      return paramInt2;
    }
    if (paramInt2 == paramInt1 - 1) {
      return i1;
    }
    paramInt1 = paramInt2;
    if (paramInt2 >= i1) {
      paramInt1 = paramInt2 + 1;
    }
    return paramInt1;
  }
  
  public int getNestedScrollAxes()
  {
    return this.i.a();
  }
  
  public int getProgressCircleDiameter()
  {
    return this.K;
  }
  
  public int getProgressViewEndOffset()
  {
    return this.B;
  }
  
  public int getProgressViewStartOffset()
  {
    return this.A;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.j.a();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.j.b();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    b();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    d();
    int i1 = paramMotionEvent.getActionMasked();
    if ((this.u) && (i1 == 0)) {
      this.u = false;
    }
    if ((isEnabled()) && (!this.u) && (!a()) && (!this.e) && (!this.m))
    {
      if (i1 != 0)
      {
        if (i1 != 1) {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 6) {
                break label212;
              }
              a(paramMotionEvent);
              break label212;
            }
          }
          else
          {
            i1 = this.s;
            if (i1 == -1)
            {
              Log.e(a, "Got ACTION_MOVE event but don't have an active pointer id.");
              return false;
            }
            i1 = paramMotionEvent.findPointerIndex(i1);
            if (i1 < 0) {
              return false;
            }
            d(paramMotionEvent.getY(i1));
            break label212;
          }
        }
        this.r = false;
        this.s = -1;
      }
      else
      {
        setTargetOffsetTopAndBottom(this.A - this.w.getTop());
        this.s = paramMotionEvent.getPointerId(0);
        this.r = false;
        i1 = paramMotionEvent.findPointerIndex(this.s);
        if (i1 < 0) {
          return false;
        }
        this.q = paramMotionEvent.getY(i1);
      }
      label212:
      return this.r;
    }
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getMeasuredWidth();
    paramInt1 = getMeasuredHeight();
    if (getChildCount() == 0) {
      return;
    }
    if (this.c == null) {
      d();
    }
    Object localObject = this.c;
    if (localObject == null) {
      return;
    }
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    ((View)localObject).layout(paramInt3, paramInt4, paramInt2 - getPaddingLeft() - getPaddingRight() + paramInt3, paramInt1 - getPaddingTop() - getPaddingBottom() + paramInt4);
    paramInt3 = this.w.getMeasuredWidth();
    paramInt1 = this.w.getMeasuredHeight();
    localObject = this.w;
    paramInt2 /= 2;
    paramInt3 /= 2;
    paramInt4 = this.o;
    ((ImageView)localObject).layout(paramInt2 - paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c == null) {
      d();
    }
    View localView = this.c;
    if (localView == null) {
      return;
    }
    localView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
    this.w.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
    this.x = -1;
    for (paramInt1 = 0; paramInt1 < getChildCount(); paramInt1++) {
      if (getChildAt(paramInt1) == this.w)
      {
        this.x = paramInt1;
        break;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramInt2 > 0)
    {
      float f1 = this.h;
      if (f1 > 0.0F)
      {
        float f2 = paramInt2;
        if (f2 > f1)
        {
          paramArrayOfInt[1] = (paramInt2 - (int)f1);
          this.h = 0.0F;
        }
        else
        {
          this.h = (f1 - f2);
          paramArrayOfInt[1] = paramInt2;
        }
        c(this.h);
      }
    }
    if ((this.L) && (paramInt2 > 0) && (this.h == 0.0F) && (Math.abs(paramInt2 - paramArrayOfInt[1]) > 0)) {
      this.w.setVisibility(8);
    }
    paramView = this.k;
    if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], paramView, null))
    {
      paramArrayOfInt[0] += paramView[0];
      paramArrayOfInt[1] += paramView[1];
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.l);
    paramInt1 = paramInt4 + this.l[1];
    if ((paramInt1 < 0) && (!a()))
    {
      this.h += Math.abs(paramInt1);
      c(this.h);
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.i.a(paramView1, paramView2, paramInt);
    startNestedScroll(paramInt & 0x2);
    this.h = 0.0F;
    this.m = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    boolean bool;
    if ((isEnabled()) && (!this.u) && (!this.e) && ((paramInt & 0x2) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.i.a(paramView);
    this.m = false;
    float f1 = this.h;
    if (f1 > 0.0F)
    {
      b(f1);
      this.h = 0.0F;
    }
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if ((this.u) && (i1 == 0)) {
      this.u = false;
    }
    if ((isEnabled()) && (!this.u) && (!a()) && (!this.e) && (!this.m))
    {
      if (i1 != 0)
      {
        float f1;
        if (i1 != 1)
        {
          if (i1 != 2)
          {
            if (i1 != 3)
            {
              if (i1 != 5)
              {
                if (i1 == 6) {
                  a(paramMotionEvent);
                }
              }
              else
              {
                i1 = paramMotionEvent.getActionIndex();
                if (i1 < 0)
                {
                  Log.e(a, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                  return false;
                }
                this.s = paramMotionEvent.getPointerId(i1);
              }
            }
            else {
              return false;
            }
          }
          else
          {
            i1 = paramMotionEvent.findPointerIndex(this.s);
            if (i1 < 0)
            {
              Log.e(a, "Got ACTION_MOVE event but have an invalid active pointer id.");
              return false;
            }
            f1 = paramMotionEvent.getY(i1);
            d(f1);
            if (this.r)
            {
              f1 = (f1 - this.p) * 0.5F;
              if (f1 > 0.0F) {
                c(f1);
              } else {
                return false;
              }
            }
          }
        }
        else
        {
          i1 = paramMotionEvent.findPointerIndex(this.s);
          if (i1 < 0)
          {
            Log.e(a, "Got ACTION_UP event but don't have an active pointer id.");
            return false;
          }
          if (this.r)
          {
            float f2 = paramMotionEvent.getY(i1);
            f1 = this.p;
            this.r = false;
            b((f2 - f1) * 0.5F);
          }
          this.s = -1;
          return false;
        }
      }
      else
      {
        this.s = paramMotionEvent.getPointerId(0);
        this.r = false;
      }
      return true;
    }
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT >= 21) || (!(this.c instanceof AbsListView)))
    {
      View localView = this.c;
      if ((localView == null) || (android.support.v4.view.y.C(localView))) {
        super.requestDisallowInterceptTouchEvent(paramBoolean);
      }
    }
  }
  
  void setAnimationProgress(float paramFloat)
  {
    this.w.setScaleX(paramFloat);
    this.w.setScaleY(paramFloat);
  }
  
  @Deprecated
  public void setColorScheme(int... paramVarArgs)
  {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    d();
    this.D.a(paramVarArgs);
  }
  
  public void setColorSchemeResources(int... paramVarArgs)
  {
    Context localContext = getContext();
    int[] arrayOfInt = new int[paramVarArgs.length];
    for (int i1 = 0; i1 < paramVarArgs.length; i1++) {
      arrayOfInt[i1] = android.support.v4.content.c.a(localContext, paramVarArgs[i1]);
    }
    setColorSchemeColors(arrayOfInt);
  }
  
  public void setDistanceToTriggerSync(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (!paramBoolean) {
      b();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.j.a(paramBoolean);
  }
  
  public void setOnChildScrollUpCallback(a parama)
  {
    this.M = parama;
  }
  
  public void setOnRefreshListener(b paramb)
  {
    this.d = paramb;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(int paramInt)
  {
    this.w.setBackgroundColor(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(int paramInt)
  {
    setProgressBackgroundColorSchemeColor(android.support.v4.content.c.a(getContext(), paramInt));
  }
  
  public void setRefreshing(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != paramBoolean))
    {
      this.e = paramBoolean;
      int i1;
      if (!this.L) {
        i1 = this.B + this.A;
      } else {
        i1 = this.B;
      }
      setTargetOffsetTopAndBottom(i1 - this.o);
      this.J = false;
      b(this.N);
    }
    else
    {
      a(paramBoolean, false);
    }
  }
  
  public void setSize(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      return;
    }
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    if (paramInt == 0) {
      this.K = ((int)(localDisplayMetrics.density * 56.0F));
    } else {
      this.K = ((int)(localDisplayMetrics.density * 40.0F));
    }
    this.w.setImageDrawable(null);
    this.D.a(paramInt);
    this.w.setImageDrawable(this.D);
  }
  
  public void setSlingshotDistance(int paramInt)
  {
    this.C = paramInt;
  }
  
  void setTargetOffsetTopAndBottom(int paramInt)
  {
    this.w.bringToFront();
    android.support.v4.view.y.b(this.w, paramInt);
    this.o = this.w.getTop();
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.j.b(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.j.c();
  }
  
  public static abstract interface a
  {
    public abstract boolean a(SwipeRefreshLayout paramSwipeRefreshLayout, View paramView);
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/SwipeRefreshLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */