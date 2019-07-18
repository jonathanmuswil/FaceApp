package android.support.v4.widget;

import Bd;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.d;
import android.support.v4.view.l;
import android.support.v4.view.o;
import android.support.v4.view.q;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;
import zd;

public class NestedScrollView
  extends FrameLayout
  implements o, l, u
{
  private static final a a = new a();
  private static final int[] b = { 16843130 };
  private float A;
  private b B;
  private long c;
  private final Rect d = new Rect();
  private OverScroller e;
  private EdgeEffect f;
  private EdgeEffect g;
  private int h;
  private boolean i = true;
  private boolean j = false;
  private View k = null;
  private boolean l = false;
  private VelocityTracker m;
  private boolean n;
  private boolean o = true;
  private int p;
  private int q;
  private int r;
  private int s = -1;
  private final int[] t = new int[2];
  private final int[] u = new int[2];
  private int v;
  private int w;
  private c x;
  private final q y;
  private final android.support.v4.view.n z;
  
  public NestedScrollView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    e();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b, paramInt, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    this.y = new q(this);
    this.z = new android.support.v4.view.n(this);
    setNestedScrollingEnabled(true);
    y.a(this, a);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 < paramInt3) && (paramInt1 >= 0))
    {
      if (paramInt2 + paramInt1 > paramInt3) {
        return paramInt3 - paramInt2;
      }
      return paramInt1;
    }
    return 0;
  }
  
  private View a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    int i1 = localArrayList.size();
    Object localObject1 = null;
    int i2 = 0;
    int i6;
    for (int i3 = 0; i2 < i1; i3 = i6)
    {
      View localView = (View)localArrayList.get(i2);
      int i4 = localView.getTop();
      int i5 = localView.getBottom();
      Object localObject2 = localObject1;
      i6 = i3;
      if (paramInt1 < i5)
      {
        localObject2 = localObject1;
        i6 = i3;
        if (i4 < paramInt2)
        {
          int i7;
          if ((paramInt1 < i4) && (i5 < paramInt2)) {
            i7 = 1;
          } else {
            i7 = 0;
          }
          if (localObject1 == null)
          {
            localObject2 = localView;
            i6 = i7;
          }
          else
          {
            if (((paramBoolean) && (i4 < ((View)localObject1).getTop())) || ((!paramBoolean) && (i5 > ((View)localObject1).getBottom()))) {
              i5 = 1;
            } else {
              i5 = 0;
            }
            if (i3 != 0)
            {
              localObject2 = localObject1;
              i6 = i3;
              if (i7 == 0) {
                break label232;
              }
              localObject2 = localObject1;
              i6 = i3;
              if (i5 == 0) {
                break label232;
              }
            }
            else
            {
              if (i7 != 0)
              {
                localObject2 = localView;
                i6 = 1;
                break label232;
              }
              localObject2 = localObject1;
              i6 = i3;
              if (i5 == 0) {
                break label232;
              }
            }
            localObject2 = localView;
            i6 = i3;
          }
        }
      }
      label232:
      i2++;
      localObject1 = localObject2;
    }
    return (View)localObject1;
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
      this.h = ((int)paramMotionEvent.getY(i1));
      this.s = paramMotionEvent.getPointerId(i1);
      paramMotionEvent = this.m;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  private boolean a()
  {
    int i1 = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i1 > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      bool2 = bool1;
      if (localView.getHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private boolean a(Rect paramRect, boolean paramBoolean)
  {
    int i1 = a(paramRect);
    boolean bool;
    if (i1 != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      if (paramBoolean) {
        scrollBy(0, i1);
      } else {
        a(0, i1);
      }
    }
    return bool;
  }
  
  private boolean a(View paramView)
  {
    return a(paramView, 0, getHeight()) ^ true;
  }
  
  private boolean a(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.d);
    offsetDescendantRectToMyCoords(paramView, this.d);
    boolean bool;
    if ((this.d.bottom + paramInt1 >= getScrollY()) && (this.d.top - paramInt1 <= getScrollY() + paramInt2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    boolean bool = true;
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    if ((!(paramView1 instanceof ViewGroup)) || (!a((View)paramView1, paramView2))) {
      bool = false;
    }
    return bool;
  }
  
  private void b()
  {
    this.l = false;
    g();
    a(0);
    EdgeEffect localEdgeEffect = this.f;
    if (localEdgeEffect != null)
    {
      localEdgeEffect.onRelease();
      this.g.onRelease();
    }
  }
  
  private void b(View paramView)
  {
    paramView.getDrawingRect(this.d);
    offsetDescendantRectToMyCoords(paramView, this.d);
    int i1 = a(this.d);
    if (i1 != 0) {
      scrollBy(0, i1);
    }
  }
  
  private boolean b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = getHeight();
    int i2 = getScrollY();
    i1 += i2;
    boolean bool1 = false;
    boolean bool2;
    if (paramInt1 == 33) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    View localView = a(bool2, paramInt2, paramInt3);
    Object localObject = localView;
    if (localView == null) {
      localObject = this;
    }
    if ((paramInt2 >= i2) && (paramInt3 <= i1))
    {
      bool2 = bool1;
    }
    else
    {
      if (bool2) {
        paramInt2 -= i2;
      } else {
        paramInt2 = paramInt3 - i1;
      }
      g(paramInt2);
      bool2 = true;
    }
    if (localObject != findFocus()) {
      ((View)localObject).requestFocus(paramInt1);
    }
    return bool2;
  }
  
  private void c()
  {
    if (getOverScrollMode() != 2)
    {
      if (this.f == null)
      {
        Context localContext = getContext();
        this.f = new EdgeEffect(localContext);
        this.g = new EdgeEffect(localContext);
      }
    }
    else
    {
      this.f = null;
      this.g = null;
    }
  }
  
  private void d()
  {
    VelocityTracker localVelocityTracker = this.m;
    if (localVelocityTracker == null) {
      this.m = VelocityTracker.obtain();
    } else {
      localVelocityTracker.clear();
    }
  }
  
  private boolean d(int paramInt1, int paramInt2)
  {
    int i1 = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i1 > 0)
    {
      i1 = getScrollY();
      View localView = getChildAt(0);
      bool2 = bool1;
      if (paramInt2 >= localView.getTop() - i1)
      {
        bool2 = bool1;
        if (paramInt2 < localView.getBottom() - i1)
        {
          bool2 = bool1;
          if (paramInt1 >= localView.getLeft())
          {
            bool2 = bool1;
            if (paramInt1 < localView.getRight()) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  private void e()
  {
    this.e = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.p = localViewConfiguration.getScaledTouchSlop();
    this.q = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.r = localViewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void f()
  {
    if (this.m == null) {
      this.m = VelocityTracker.obtain();
    }
  }
  
  private void g()
  {
    VelocityTracker localVelocityTracker = this.m;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      this.m = null;
    }
  }
  
  private void g(int paramInt)
  {
    if (paramInt != 0) {
      if (this.o) {
        a(0, paramInt);
      } else {
        scrollBy(0, paramInt);
      }
    }
  }
  
  private float getVerticalScrollFactorCompat()
  {
    if (this.A == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        this.A = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
    }
    return this.A;
  }
  
  private void h(int paramInt)
  {
    int i1 = getScrollY();
    boolean bool;
    if (((i1 <= 0) && (paramInt <= 0)) || ((i1 >= getScrollRange()) && (paramInt >= 0))) {
      bool = false;
    } else {
      bool = true;
    }
    float f1 = paramInt;
    if (!dispatchNestedPreFling(0.0F, f1))
    {
      dispatchNestedFling(0.0F, f1, bool);
      c(paramInt);
    }
  }
  
  protected int a(Rect paramRect)
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i1 == 0) {
      return 0;
    }
    int i3 = getHeight();
    i1 = getScrollY();
    int i4 = i1 + i3;
    int i5 = getVerticalFadingEdgeLength();
    int i6 = i1;
    if (paramRect.top > 0) {
      i6 = i1 + i5;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    if (paramRect.bottom < localView.getHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin) {
      i5 = i4 - i5;
    } else {
      i5 = i4;
    }
    if ((paramRect.bottom > i5) && (paramRect.top > i6))
    {
      if (paramRect.height() > i3) {
        i1 = paramRect.top - i6;
      } else {
        i1 = paramRect.bottom - i5;
      }
      i1 = Math.min(i1 + 0, localView.getBottom() + localLayoutParams.bottomMargin - i4);
    }
    else
    {
      i1 = i2;
      if (paramRect.top < i6)
      {
        i1 = i2;
        if (paramRect.bottom < i5)
        {
          if (paramRect.height() > i3) {
            i1 = 0 - (i5 - paramRect.bottom);
          } else {
            i1 = 0 - (i6 - paramRect.top);
          }
          i1 = Math.max(i1, -getScrollY());
        }
      }
    }
    return i1;
  }
  
  public void a(int paramInt)
  {
    this.z.c(paramInt);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - this.c > 250L)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i1 = localView.getHeight();
      int i2 = localLayoutParams.topMargin;
      int i3 = localLayoutParams.bottomMargin;
      int i4 = getHeight();
      int i5 = getPaddingTop();
      int i6 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, i1 + i2 + i3 - (i4 - i5 - i6))));
      this.w = getScrollY();
      this.e.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1);
      y.E(this);
    }
    else
    {
      if (!this.e.isFinished()) {
        this.e.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
    this.c = AnimationUtils.currentAnimationTimeMillis();
  }
  
  public void a(View paramView, int paramInt)
  {
    this.y.a(paramView, paramInt);
    a(paramInt);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramInt1 = getScrollY();
    scrollBy(0, paramInt4);
    paramInt1 = getScrollY() - paramInt1;
    a(0, paramInt1, 0, paramInt4 - paramInt1, null, paramInt5);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    a(paramInt1, paramInt2, paramArrayOfInt, null, paramInt3);
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    int i1 = getOverScrollMode();
    int i2 = computeHorizontalScrollRange();
    int i3 = computeHorizontalScrollExtent();
    boolean bool1 = false;
    if (i2 > i3) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if ((i1 != 0) && ((i1 != 1) || (i3 == 0))) {
      i3 = 0;
    } else {
      i3 = 1;
    }
    if ((i1 != 0) && ((i1 != 1) || (i2 == 0))) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    paramInt3 += paramInt1;
    if (i3 == 0) {
      paramInt1 = 0;
    } else {
      paramInt1 = paramInt7;
    }
    paramInt4 += paramInt2;
    if (i2 == 0) {
      paramInt2 = 0;
    } else {
      paramInt2 = paramInt8;
    }
    paramInt7 = -paramInt1;
    paramInt1 += paramInt5;
    paramInt5 = -paramInt2;
    paramInt6 = paramInt2 + paramInt6;
    if (paramInt3 > paramInt1) {}
    for (;;)
    {
      paramBoolean = true;
      paramInt2 = paramInt1;
      break label198;
      if (paramInt3 >= paramInt7) {
        break;
      }
      paramInt1 = paramInt7;
    }
    paramInt2 = paramInt3;
    paramBoolean = false;
    label198:
    if (paramInt4 > paramInt6) {}
    for (paramInt1 = paramInt6;; paramInt1 = paramInt5)
    {
      bool2 = true;
      break label233;
      if (paramInt4 >= paramInt5) {
        break;
      }
    }
    boolean bool2 = false;
    paramInt1 = paramInt4;
    label233:
    if ((bool2) && (!e(1))) {
      this.e.springBack(paramInt2, paramInt1, 0, 0, 0, getScrollRange());
    }
    onOverScrolled(paramInt2, paramInt1, paramBoolean, bool2);
    if (!paramBoolean)
    {
      paramBoolean = bool1;
      if (!bool2) {}
    }
    else
    {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return this.z.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  public boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    return this.z.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public boolean a(KeyEvent paramKeyEvent)
  {
    this.d.setEmpty();
    boolean bool1 = a();
    boolean bool2 = false;
    boolean bool3 = false;
    int i1 = 130;
    if (!bool1)
    {
      bool1 = bool3;
      if (isFocused())
      {
        bool1 = bool3;
        if (paramKeyEvent.getKeyCode() != 4)
        {
          View localView = findFocus();
          paramKeyEvent = localView;
          if (localView == this) {
            paramKeyEvent = null;
          }
          paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
          bool1 = bool3;
          if (paramKeyEvent != null)
          {
            bool1 = bool3;
            if (paramKeyEvent != this)
            {
              bool1 = bool3;
              if (paramKeyEvent.requestFocus(130)) {
                bool1 = true;
              }
            }
          }
        }
      }
      return bool1;
    }
    bool1 = bool2;
    if (paramKeyEvent.getAction() == 0)
    {
      int i2 = paramKeyEvent.getKeyCode();
      if (i2 != 19)
      {
        if (i2 != 20)
        {
          if (i2 != 62)
          {
            bool1 = bool2;
          }
          else
          {
            if (paramKeyEvent.isShiftPressed()) {
              i1 = 33;
            }
            f(i1);
            bool1 = bool2;
          }
        }
        else if (!paramKeyEvent.isAltPressed()) {
          bool1 = b(130);
        } else {
          bool1 = d(130);
        }
      }
      else if (!paramKeyEvent.isAltPressed()) {
        bool1 = b(33);
      } else {
        bool1 = d(33);
      }
    }
    return bool1;
  }
  
  public boolean a(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void addView(View paramView)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    a(paramInt1 - getScrollX(), paramInt2 - getScrollY());
  }
  
  public void b(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    this.y.a(paramView1, paramView2, paramInt1, paramInt2);
    c(2, paramInt2);
  }
  
  public boolean b(int paramInt)
  {
    Object localObject1 = findFocus();
    Object localObject2 = localObject1;
    if (localObject1 == this) {
      localObject2 = null;
    }
    localObject1 = FocusFinder.getInstance().findNextFocus(this, (View)localObject2, paramInt);
    int i1 = getMaxScrollAmount();
    if ((localObject1 != null) && (a((View)localObject1, i1, getHeight())))
    {
      ((View)localObject1).getDrawingRect(this.d);
      offsetDescendantRectToMyCoords((View)localObject1, this.d);
      g(a(this.d));
      ((View)localObject1).requestFocus(paramInt);
    }
    else
    {
      int i2;
      if ((paramInt == 33) && (getScrollY() < i1))
      {
        i2 = getScrollY();
      }
      else
      {
        i2 = i1;
        if (paramInt == 130)
        {
          i2 = i1;
          if (getChildCount() > 0)
          {
            View localView = getChildAt(0);
            localObject1 = (FrameLayout.LayoutParams)localView.getLayoutParams();
            i2 = Math.min(localView.getBottom() + ((FrameLayout.LayoutParams)localObject1).bottomMargin - (getScrollY() + getHeight() - getPaddingBottom()), i1);
          }
        }
      }
      if (i2 == 0) {
        return false;
      }
      if (paramInt != 130) {
        i2 = -i2;
      }
      g(i2);
    }
    if ((localObject2 != null) && (((View)localObject2).isFocused()) && (a((View)localObject2)))
    {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    }
    return true;
  }
  
  public void c(int paramInt)
  {
    if (getChildCount() > 0)
    {
      c(2, 1);
      this.e.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
      this.w = getScrollY();
      y.E(this);
    }
  }
  
  public boolean c(int paramInt1, int paramInt2)
  {
    return this.z.a(paramInt1, paramInt2);
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    if (this.e.computeScrollOffset())
    {
      this.e.getCurrX();
      int i1 = this.e.getCurrY();
      int i2 = i1 - this.w;
      int i3 = i2;
      if (a(0, i2, this.u, null, 1)) {
        i3 = i2 - this.u[1];
      }
      if (i3 != 0)
      {
        i2 = getScrollRange();
        int i4 = getScrollY();
        a(0, i3, getScrollX(), i4, 0, i2, 0, 0, false);
        int i5 = getScrollY() - i4;
        if (!a(0, i5, 0, i3 - i5, null, 1))
        {
          i3 = getOverScrollMode();
          if ((i3 != 0) && ((i3 != 1) || (i2 <= 0))) {
            i3 = 0;
          } else {
            i3 = 1;
          }
          if (i3 != 0)
          {
            c();
            if ((i1 <= 0) && (i4 > 0)) {
              this.f.onAbsorb((int)this.e.getCurrVelocity());
            } else if ((i1 >= i2) && (i4 < i2)) {
              this.g.onAbsorb((int)this.e.getCurrVelocity());
            }
          }
        }
      }
      this.w = i1;
      y.E(this);
    }
    else
    {
      if (e(1)) {
        a(1);
      }
      this.w = 0;
    }
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange()
  {
    int i1 = getChildCount();
    int i2 = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i1 == 0) {
      return i2;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    i1 = localView.getBottom() + localLayoutParams.bottomMargin;
    int i3 = getScrollY();
    int i4 = Math.max(0, i1 - i2);
    if (i3 < 0)
    {
      i2 = i1 - i3;
    }
    else
    {
      i2 = i1;
      if (i3 > i4) {
        i2 = i1 + (i3 - i4);
      }
    }
    return i2;
  }
  
  public boolean d(int paramInt)
  {
    int i1;
    if (paramInt == 130) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2 = getHeight();
    Object localObject = this.d;
    ((Rect)localObject).top = 0;
    ((Rect)localObject).bottom = i2;
    if (i1 != 0)
    {
      i1 = getChildCount();
      if (i1 > 0)
      {
        View localView = getChildAt(i1 - 1);
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        this.d.bottom = (localView.getBottom() + ((FrameLayout.LayoutParams)localObject).bottomMargin + getPaddingBottom());
        localObject = this.d;
        ((Rect)localObject).top = (((Rect)localObject).bottom - i2);
      }
    }
    localObject = this.d;
    return b(paramInt, ((Rect)localObject).top, ((Rect)localObject).bottom);
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
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.z.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.z.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.f != null)
    {
      int i1 = getScrollY();
      boolean bool = this.f.isFinished();
      int i2 = 0;
      int i3;
      int i4;
      int i5;
      int i6;
      int i7;
      int i8;
      int i9;
      if (!bool)
      {
        i3 = paramCanvas.save();
        i4 = getWidth();
        i5 = getHeight();
        i6 = Math.min(0, i1);
        if ((Build.VERSION.SDK_INT >= 21) && (!getClipToPadding()))
        {
          i7 = 0;
        }
        else
        {
          i4 -= getPaddingLeft() + getPaddingRight();
          i7 = getPaddingLeft() + 0;
        }
        i8 = i5;
        i9 = i6;
        if (Build.VERSION.SDK_INT >= 21)
        {
          i8 = i5;
          i9 = i6;
          if (getClipToPadding())
          {
            i8 = i5 - (getPaddingTop() + getPaddingBottom());
            i9 = i6 + getPaddingTop();
          }
        }
        paramCanvas.translate(i7, i9);
        this.f.setSize(i4, i8);
        if (this.f.draw(paramCanvas)) {
          y.E(this);
        }
        paramCanvas.restoreToCount(i3);
      }
      if (!this.g.isFinished())
      {
        i3 = paramCanvas.save();
        i9 = getWidth();
        i5 = getHeight();
        i6 = Math.max(getScrollRange(), i1) + i5;
        if (Build.VERSION.SDK_INT >= 21)
        {
          i7 = i2;
          i4 = i9;
          if (!getClipToPadding()) {}
        }
        else
        {
          i4 = i9 - (getPaddingLeft() + getPaddingRight());
          i7 = 0 + getPaddingLeft();
        }
        i8 = i6;
        i9 = i5;
        if (Build.VERSION.SDK_INT >= 21)
        {
          i8 = i6;
          i9 = i5;
          if (getClipToPadding())
          {
            i9 = i5 - (getPaddingTop() + getPaddingBottom());
            i8 = i6 - getPaddingBottom();
          }
        }
        paramCanvas.translate(i7 - i4, i8);
        paramCanvas.rotate(180.0F, i4, 0.0F);
        this.g.setSize(i4, i9);
        if (this.g.draw(paramCanvas)) {
          y.E(this);
        }
        paramCanvas.restoreToCount(i3);
      }
    }
  }
  
  public boolean e(int paramInt)
  {
    return this.z.a(paramInt);
  }
  
  public boolean f(int paramInt)
  {
    if (paramInt == 130) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2 = getHeight();
    if (i1 != 0)
    {
      this.d.top = (getScrollY() + i2);
      i1 = getChildCount();
      if (i1 > 0)
      {
        localObject = getChildAt(i1 - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        i1 = ((View)localObject).getBottom() + localLayoutParams.bottomMargin + getPaddingBottom();
        localObject = this.d;
        if (((Rect)localObject).top + i2 > i1) {
          ((Rect)localObject).top = (i1 - i2);
        }
      }
    }
    else
    {
      this.d.top = (getScrollY() - i2);
      localObject = this.d;
      if (((Rect)localObject).top < 0) {
        ((Rect)localObject).top = 0;
      }
    }
    Object localObject = this.d;
    int i1 = ((Rect)localObject).top;
    ((Rect)localObject).bottom = (i2 + i1);
    return b(paramInt, i1, ((Rect)localObject).bottom);
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getHeight();
    int i3 = getPaddingBottom();
    i3 = localView.getBottom() + localLayoutParams.bottomMargin - getScrollY() - (i2 - i3);
    if (i3 < i1) {
      return i3 / i1;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes()
  {
    return this.y.a();
  }
  
  int getScrollRange()
  {
    int i1 = getChildCount();
    int i2 = 0;
    if (i1 > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      i2 = Math.max(0, localView.getHeight() + localLayoutParams.topMargin + localLayoutParams.bottomMargin - (getHeight() - getPaddingTop() - getPaddingBottom()));
    }
    return i2;
  }
  
  protected float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i1 = getVerticalFadingEdgeLength();
    int i2 = getScrollY();
    if (i2 < i1) {
      return i2 / i1;
    }
    return 1.0F;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return e(0);
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.z.b();
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin, 0));
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.j = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (((paramMotionEvent.getSource() & 0x2) != 0) && (paramMotionEvent.getAction() == 8) && (!this.l))
    {
      float f1 = paramMotionEvent.getAxisValue(9);
      if (f1 != 0.0F)
      {
        int i1 = (int)(f1 * getVerticalScrollFactorCompat());
        int i2 = getScrollRange();
        int i3 = getScrollY();
        int i4 = i3 - i1;
        if (i4 < 0)
        {
          i1 = 0;
        }
        else
        {
          i1 = i4;
          if (i4 > i2) {
            i1 = i2;
          }
        }
        if (i1 != i3)
        {
          super.scrollTo(getScrollX(), i1);
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 2) && (this.l)) {
      return true;
    }
    i1 &= 0xFF;
    if (i1 != 0)
    {
      if (i1 != 1) {
        if (i1 != 2)
        {
          if (i1 != 3)
          {
            if (i1 != 6) {
              break label343;
            }
            a(paramMotionEvent);
            break label343;
          }
        }
        else
        {
          int i2 = this.s;
          if (i2 == -1) {
            break label343;
          }
          i1 = paramMotionEvent.findPointerIndex(i2);
          if (i1 == -1)
          {
            paramMotionEvent = new StringBuilder();
            paramMotionEvent.append("Invalid pointerId=");
            paramMotionEvent.append(i2);
            paramMotionEvent.append(" in onInterceptTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
            break label343;
          }
          i1 = (int)paramMotionEvent.getY(i1);
          if ((Math.abs(i1 - this.h) <= this.p) || ((0x2 & getNestedScrollAxes()) != 0)) {
            break label343;
          }
          this.l = true;
          this.h = i1;
          f();
          this.m.addMovement(paramMotionEvent);
          this.v = 0;
          paramMotionEvent = getParent();
          if (paramMotionEvent == null) {
            break label343;
          }
          paramMotionEvent.requestDisallowInterceptTouchEvent(true);
          break label343;
        }
      }
      this.l = false;
      this.s = -1;
      g();
      if (this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
        y.E(this);
      }
      a(0);
    }
    else
    {
      i1 = (int)paramMotionEvent.getY();
      if (!d((int)paramMotionEvent.getX(), i1))
      {
        this.l = false;
        g();
      }
      else
      {
        this.h = i1;
        this.s = paramMotionEvent.getPointerId(0);
        d();
        this.m.addMovement(paramMotionEvent);
        this.e.computeScrollOffset();
        this.l = (this.e.isFinished() ^ true);
        c(2, 0);
      }
    }
    label343:
    return this.l;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = 0;
    this.i = false;
    Object localObject = this.k;
    if ((localObject != null) && (a((View)localObject, this))) {
      b(this.k);
    }
    this.k = null;
    if (!this.j)
    {
      if (this.x != null)
      {
        scrollTo(getScrollX(), this.x.a);
        this.x = null;
      }
      if (getChildCount() > 0)
      {
        View localView = getChildAt(0);
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        paramInt1 = localView.getMeasuredHeight() + ((FrameLayout.LayoutParams)localObject).topMargin + ((FrameLayout.LayoutParams)localObject).bottomMargin;
      }
      int i1 = getPaddingTop();
      int i2 = getPaddingBottom();
      paramInt3 = getScrollY();
      paramInt1 = a(paramInt3, paramInt4 - paramInt2 - i1 - i2, paramInt1);
      if (paramInt1 != paramInt3) {
        scrollTo(getScrollX(), paramInt1);
      }
    }
    scrollTo(getScrollX(), getScrollY());
    this.j = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.n) {
      return;
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      return;
    }
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i1 = localView.getMeasuredHeight();
      paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - localLayoutParams.topMargin - localLayoutParams.bottomMargin;
      if (i1 < paramInt2) {
        localView.measure(FrameLayout.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      h((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    a(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    b(paramView1, paramView2, paramInt, 0);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i1;
    if (paramInt == 2)
    {
      i1 = 130;
    }
    else
    {
      i1 = paramInt;
      if (paramInt == 1) {
        i1 = 33;
      }
    }
    View localView;
    if (paramRect == null) {
      localView = FocusFinder.getInstance().findNextFocus(this, null, i1);
    } else {
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i1);
    }
    if (localView == null) {
      return false;
    }
    if (a(localView)) {
      return false;
    }
    return localView.requestFocus(i1, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof c))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (c)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.x = paramParcelable;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    c localc = new c(super.onSaveInstanceState());
    localc.a = getScrollY();
    return localc;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    b localb = this.B;
    if (localb != null) {
      localb.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView != null) && (this != localView) && (a(localView, 0, paramInt4)))
    {
      localView.getDrawingRect(this.d);
      offsetDescendantRectToMyCoords(localView, this.d);
      g(a(this.d));
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return a(paramView1, paramView2, paramInt, 0);
  }
  
  public void onStopNestedScroll(View paramView)
  {
    a(paramView, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    f();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      this.v = 0;
    }
    localMotionEvent.offsetLocation(0.0F, this.v);
    ViewParent localViewParent;
    if (i1 != 0)
    {
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
                this.h = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(this.s)));
              }
            }
            else
            {
              i1 = paramMotionEvent.getActionIndex();
              this.h = ((int)paramMotionEvent.getY(i1));
              this.s = paramMotionEvent.getPointerId(i1);
            }
          }
          else
          {
            if ((this.l) && (getChildCount() > 0) && (this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {
              y.E(this);
            }
            this.s = -1;
            b();
          }
        }
        else
        {
          int i2 = paramMotionEvent.findPointerIndex(this.s);
          if (i2 == -1)
          {
            paramMotionEvent = new StringBuilder();
            paramMotionEvent.append("Invalid pointerId=");
            paramMotionEvent.append(this.s);
            paramMotionEvent.append(" in onTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
          }
          else
          {
            int i3 = (int)paramMotionEvent.getY(i2);
            i1 = this.h - i3;
            int i4 = i1;
            if (a(0, i1, this.u, this.t, 0))
            {
              i4 = i1 - this.u[1];
              localMotionEvent.offsetLocation(0.0F, this.t[1]);
              this.v += this.t[1];
            }
            i1 = i4;
            if (!this.l)
            {
              i1 = i4;
              if (Math.abs(i4) > this.p)
              {
                localViewParent = getParent();
                if (localViewParent != null) {
                  localViewParent.requestDisallowInterceptTouchEvent(true);
                }
                this.l = true;
                if (i4 > 0) {
                  i1 = i4 - this.p;
                } else {
                  i1 = i4 + this.p;
                }
              }
            }
            if (this.l)
            {
              this.h = (i3 - this.t[1]);
              int i5 = getScrollY();
              i3 = getScrollRange();
              i4 = getOverScrollMode();
              if ((i4 != 0) && ((i4 != 1) || (i3 <= 0))) {
                i4 = 0;
              } else {
                i4 = 1;
              }
              if ((a(0, i1, 0, getScrollY(), 0, i3, 0, 0, true)) && (!e(0))) {
                this.m.clear();
              }
              int i6 = getScrollY() - i5;
              if (a(0, i6, 0, i1 - i6, this.t, 0))
              {
                i1 = this.h;
                paramMotionEvent = this.t;
                this.h = (i1 - paramMotionEvent[1]);
                localMotionEvent.offsetLocation(0.0F, paramMotionEvent[1]);
                this.v += this.t[1];
              }
              else if (i4 != 0)
              {
                c();
                i4 = i5 + i1;
                if (i4 < 0)
                {
                  n.a(this.f, i1 / getHeight(), paramMotionEvent.getX(i2) / getWidth());
                  if (!this.g.isFinished()) {
                    this.g.onRelease();
                  }
                }
                else if (i4 > i3)
                {
                  n.a(this.g, i1 / getHeight(), 1.0F - paramMotionEvent.getX(i2) / getWidth());
                  if (!this.f.isFinished()) {
                    this.f.onRelease();
                  }
                }
                paramMotionEvent = this.f;
                if ((paramMotionEvent != null) && ((!paramMotionEvent.isFinished()) || (!this.g.isFinished()))) {
                  y.E(this);
                }
              }
            }
          }
        }
      }
      else
      {
        paramMotionEvent = this.m;
        paramMotionEvent.computeCurrentVelocity(1000, this.r);
        i1 = (int)paramMotionEvent.getYVelocity(this.s);
        if (Math.abs(i1) > this.q) {
          h(-i1);
        } else if (this.e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
          y.E(this);
        }
        this.s = -1;
        b();
      }
    }
    else
    {
      if (getChildCount() == 0) {
        return false;
      }
      boolean bool = this.e.isFinished() ^ true;
      this.l = bool;
      if (bool)
      {
        localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
      }
      if (!this.e.isFinished()) {
        this.e.abortAnimation();
      }
      this.h = ((int)paramMotionEvent.getY());
      this.s = paramMotionEvent.getPointerId(0);
      c(2, 0);
    }
    paramMotionEvent = this.m;
    if (paramMotionEvent != null) {
      paramMotionEvent.addMovement(localMotionEvent);
    }
    localMotionEvent.recycle();
    return true;
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.i) {
      b(paramView2);
    } else {
      this.k = paramView2;
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return a(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      g();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    this.i = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i1 = getWidth();
      int i2 = getPaddingLeft();
      int i3 = getPaddingRight();
      int i4 = localView.getWidth();
      int i5 = localLayoutParams.leftMargin;
      int i6 = localLayoutParams.rightMargin;
      int i7 = getHeight();
      int i8 = getPaddingTop();
      int i9 = getPaddingBottom();
      int i10 = localView.getHeight();
      int i11 = localLayoutParams.topMargin;
      int i12 = localLayoutParams.bottomMargin;
      paramInt1 = a(paramInt1, i1 - i2 - i3, i4 + i5 + i6);
      paramInt2 = a(paramInt2, i7 - i8 - i9, i10 + i11 + i12);
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY())) {
        super.scrollTo(paramInt1, paramInt2);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != this.n)
    {
      this.n = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.z.a(paramBoolean);
  }
  
  public void setOnScrollChangeListener(b paramb)
  {
    this.B = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.o = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return c(paramInt, 0);
  }
  
  public void stopNestedScroll()
  {
    a(0);
  }
  
  static class a
    extends d
  {
    public void a(View paramView, zd paramzd)
    {
      super.a(paramView, paramzd);
      paramView = (NestedScrollView)paramView;
      paramzd.a(ScrollView.class.getName());
      if (paramView.isEnabled())
      {
        int i = paramView.getScrollRange();
        if (i > 0)
        {
          paramzd.k(true);
          if (paramView.getScrollY() > 0) {
            paramzd.a(8192);
          }
          if (paramView.getScrollY() < i) {
            paramzd.a(4096);
          }
        }
      }
    }
    
    public boolean a(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.a(paramView, paramInt, paramBundle)) {
        return true;
      }
      paramView = (NestedScrollView)paramView;
      if (!paramView.isEnabled()) {
        return false;
      }
      if (paramInt != 4096)
      {
        if (paramInt != 8192) {
          return false;
        }
        i = paramView.getHeight();
        j = paramView.getPaddingBottom();
        paramInt = paramView.getPaddingTop();
        paramInt = Math.max(paramView.getScrollY() - (i - j - paramInt), 0);
        if (paramInt != paramView.getScrollY())
        {
          paramView.b(0, paramInt);
          return true;
        }
        return false;
      }
      paramInt = paramView.getHeight();
      int i = paramView.getPaddingBottom();
      int j = paramView.getPaddingTop();
      paramInt = Math.min(paramView.getScrollY() + (paramInt - i - j), paramView.getScrollRange());
      if (paramInt != paramView.getScrollY())
      {
        paramView.b(0, paramInt);
        return true;
      }
      return false;
    }
    
    public void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.b(paramView, paramAccessibilityEvent);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      boolean bool;
      if (paramView.getScrollRange() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramAccessibilityEvent.setScrollable(bool);
      paramAccessibilityEvent.setScrollX(paramView.getScrollX());
      paramAccessibilityEvent.setScrollY(paramView.getScrollY());
      Bd.a(paramAccessibilityEvent, paramView.getScrollX());
      Bd.b(paramAccessibilityEvent, paramView.getScrollRange());
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
  
  static class c
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<c> CREATOR = new r();
    public int a;
    
    c(Parcel paramParcel)
    {
      super();
      this.a = paramParcel.readInt();
    }
    
    c(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("HorizontalScrollView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" scrollPosition=");
      localStringBuilder.append(this.a);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */