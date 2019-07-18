package android.support.design.widget;

import Gc;
import W;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.N;
import android.support.v4.view.m;
import android.support.v4.view.y;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import ea;
import ga;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import pd;

@CoordinatorLayout.c(Behavior.class)
public class AppBarLayout
  extends LinearLayout
{
  private int a = -1;
  private int b = -1;
  private int c = -1;
  private boolean d;
  private int e = 0;
  private N f;
  private List<a> g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private int[] l;
  
  public AppBarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(1);
    if (Build.VERSION.SDK_INT >= 21)
    {
      fa.a(this);
      fa.a(this, paramAttributeSet, 0, ea.Widget_Design_AppBarLayout);
    }
    paramContext = android.support.design.internal.c.a(paramContext, paramAttributeSet, fa.AppBarLayout, 0, ea.Widget_Design_AppBarLayout, new int[0]);
    y.a(this, paramContext.getDrawable(fa.AppBarLayout_android_background));
    if (paramContext.hasValue(fa.AppBarLayout_expanded)) {
      a(paramContext.getBoolean(fa.AppBarLayout_expanded, false), false, false);
    }
    if ((Build.VERSION.SDK_INT >= 21) && (paramContext.hasValue(fa.AppBarLayout_elevation))) {
      fa.a(this, paramContext.getDimensionPixelSize(fa.AppBarLayout_elevation, 0));
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      if (paramContext.hasValue(fa.AppBarLayout_android_keyboardNavigationCluster)) {
        setKeyboardNavigationCluster(paramContext.getBoolean(fa.AppBarLayout_android_keyboardNavigationCluster, false));
      }
      if (paramContext.hasValue(fa.AppBarLayout_android_touchscreenBlocksFocus)) {
        setTouchscreenBlocksFocus(paramContext.getBoolean(fa.AppBarLayout_android_touchscreenBlocksFocus, false));
      }
    }
    this.k = paramContext.getBoolean(fa.AppBarLayout_liftOnScroll, false);
    paramContext.recycle();
    y.a(this, new a(this));
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int m;
    if (paramBoolean1) {
      m = 1;
    } else {
      m = 2;
    }
    int n = 0;
    int i1;
    if (paramBoolean2) {
      i1 = 4;
    } else {
      i1 = 0;
    }
    if (paramBoolean3) {
      n = 8;
    }
    this.e = (m | i1 | n);
    requestLayout();
  }
  
  private boolean b(boolean paramBoolean)
  {
    if (this.i != paramBoolean)
    {
      this.i = paramBoolean;
      refreshDrawableState();
      return true;
    }
    return false;
  }
  
  private boolean e()
  {
    int m = getChildCount();
    for (int n = 0; n < m; n++) {
      if (((b)getChildAt(n).getLayoutParams()).c()) {
        return true;
      }
    }
    return false;
  }
  
  private void f()
  {
    this.a = -1;
    this.b = -1;
    this.c = -1;
  }
  
  N a(N paramN)
  {
    N localN;
    if (y.i(this)) {
      localN = paramN;
    } else {
      localN = null;
    }
    if (!pd.a(this.f, localN))
    {
      this.f = localN;
      f();
    }
    return paramN;
  }
  
  void a(int paramInt)
  {
    Object localObject = this.g;
    if (localObject != null)
    {
      int m = 0;
      int n = ((List)localObject).size();
      while (m < n)
      {
        localObject = (a)this.g.get(m);
        if (localObject != null) {
          ((a)localObject).a(this, paramInt);
        }
        m++;
      }
    }
  }
  
  public void a(a parama)
  {
    if (this.g == null) {
      this.g = new ArrayList();
    }
    if ((parama != null) && (!this.g.contains(parama))) {
      this.g.add(parama);
    }
  }
  
  public void a(c paramc)
  {
    a(paramc);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramBoolean1, paramBoolean2, true);
  }
  
  boolean a()
  {
    return this.d;
  }
  
  boolean a(boolean paramBoolean)
  {
    if (this.j != paramBoolean)
    {
      this.j = paramBoolean;
      refreshDrawableState();
      return true;
    }
    return false;
  }
  
  public void b(a parama)
  {
    List localList = this.g;
    if ((localList != null) && (parama != null)) {
      localList.remove(parama);
    }
  }
  
  public void b(c paramc)
  {
    b(paramc);
  }
  
  boolean b()
  {
    boolean bool;
    if (getTotalScrollRange() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean c()
  {
    return this.k;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof b;
  }
  
  void d()
  {
    this.e = 0;
  }
  
  protected b generateDefaultLayoutParams()
  {
    return new b(-1, -2);
  }
  
  public b generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new b(getContext(), paramAttributeSet);
  }
  
  protected b generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((Build.VERSION.SDK_INT >= 19) && ((paramLayoutParams instanceof LinearLayout.LayoutParams))) {
      return new b((LinearLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new b(paramLayoutParams);
  }
  
  int getDownNestedPreScrollRange()
  {
    int m = this.b;
    if (m != -1) {
      return m;
    }
    int n = getChildCount() - 1;
    for (int i1 = 0; n >= 0; i1 = m)
    {
      View localView = getChildAt(n);
      b localb = (b)localView.getLayoutParams();
      int i2 = localView.getMeasuredHeight();
      m = localb.a;
      if ((m & 0x5) == 5)
      {
        i1 += localb.topMargin + localb.bottomMargin;
        if ((m & 0x8) != 0)
        {
          m = i1 + y.m(localView);
        }
        else
        {
          if ((m & 0x2) != 0) {
            m = y.m(localView);
          } else {
            m = getTopInset();
          }
          m = i1 + (i2 - m);
        }
      }
      else
      {
        m = i1;
        if (i1 > 0) {
          break;
        }
      }
      n--;
    }
    m = Math.max(0, i1);
    this.b = m;
    return m;
  }
  
  int getDownNestedScrollRange()
  {
    int m = this.c;
    if (m != -1) {
      return m;
    }
    int n = getChildCount();
    int i1 = 0;
    m = 0;
    int i2;
    for (;;)
    {
      i2 = m;
      if (i1 >= n) {
        break;
      }
      View localView = getChildAt(i1);
      b localb = (b)localView.getLayoutParams();
      int i3 = localView.getMeasuredHeight();
      int i4 = localb.topMargin;
      int i5 = localb.bottomMargin;
      int i6 = localb.a;
      i2 = m;
      if ((i6 & 0x1) == 0) {
        break;
      }
      m += i3 + (i4 + i5);
      if ((i6 & 0x2) != 0)
      {
        i2 = m - (y.m(localView) + getTopInset());
        break;
      }
      i1++;
    }
    m = Math.max(0, i2);
    this.c = m;
    return m;
  }
  
  public final int getMinimumHeightForVisibleOverlappingContent()
  {
    int m = getTopInset();
    int n = y.m(this);
    if (n != 0) {}
    do
    {
      return n * 2 + m;
      n = getChildCount();
      if (n >= 1) {
        n = y.m(getChildAt(n - 1));
      } else {
        n = 0;
      }
    } while (n != 0);
    return getHeight() / 3;
  }
  
  int getPendingAction()
  {
    return this.e;
  }
  
  @Deprecated
  public float getTargetElevation()
  {
    return 0.0F;
  }
  
  final int getTopInset()
  {
    N localN = this.f;
    int m;
    if (localN != null) {
      m = localN.e();
    } else {
      m = 0;
    }
    return m;
  }
  
  public final int getTotalScrollRange()
  {
    int m = this.a;
    if (m != -1) {
      return m;
    }
    int n = getChildCount();
    int i1 = 0;
    m = 0;
    int i2;
    for (;;)
    {
      i2 = m;
      if (i1 >= n) {
        break;
      }
      View localView = getChildAt(i1);
      b localb = (b)localView.getLayoutParams();
      int i3 = localView.getMeasuredHeight();
      int i4 = localb.a;
      i2 = m;
      if ((i4 & 0x1) == 0) {
        break;
      }
      m += i3 + localb.topMargin + localb.bottomMargin;
      if ((i4 & 0x2) != 0)
      {
        i2 = m - y.m(localView);
        break;
      }
      i1++;
    }
    m = Math.max(0, i2 - getTopInset());
    this.a = m;
    return m;
  }
  
  int getUpNestedPreScrollRange()
  {
    return getTotalScrollRange();
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    if (this.l == null) {
      this.l = new int[4];
    }
    int[] arrayOfInt1 = this.l;
    int[] arrayOfInt2 = super.onCreateDrawableState(paramInt + arrayOfInt1.length);
    if (this.i) {
      paramInt = W.state_liftable;
    } else {
      paramInt = -W.state_liftable;
    }
    arrayOfInt1[0] = paramInt;
    if ((this.i) && (this.j)) {
      paramInt = W.state_lifted;
    } else {
      paramInt = -W.state_lifted;
    }
    arrayOfInt1[1] = paramInt;
    if (this.i) {
      paramInt = W.state_collapsible;
    } else {
      paramInt = -W.state_collapsible;
    }
    arrayOfInt1[2] = paramInt;
    if ((this.i) && (this.j)) {
      paramInt = W.state_collapsed;
    } else {
      paramInt = -W.state_collapsed;
    }
    arrayOfInt1[3] = paramInt;
    return LinearLayout.mergeDrawableStates(arrayOfInt2, arrayOfInt1);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    f();
    paramBoolean = false;
    this.d = false;
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      if (((b)getChildAt(paramInt1).getLayoutParams()).b() != null)
      {
        this.d = true;
        break;
      }
    }
    if (!this.h)
    {
      if ((this.k) || (e())) {
        paramBoolean = true;
      }
      b(paramBoolean);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    f();
  }
  
  public void setExpanded(boolean paramBoolean)
  {
    a(paramBoolean, y.B(this));
  }
  
  public void setLiftOnScroll(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (paramInt == 1)
    {
      super.setOrientation(paramInt);
      return;
    }
    throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
  }
  
  @Deprecated
  public void setTargetElevation(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      fa.a(this, paramFloat);
    }
  }
  
  protected static class BaseBehavior<T extends AppBarLayout>
    extends G<T>
  {
    private int k;
    private int l;
    private ValueAnimator m;
    private int n = -1;
    private boolean o;
    private float p;
    private WeakReference<View> q;
    private a r;
    
    public BaseBehavior() {}
    
    public BaseBehavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    private static View a(AppBarLayout paramAppBarLayout, int paramInt)
    {
      int i = Math.abs(paramInt);
      int j = paramAppBarLayout.getChildCount();
      for (paramInt = 0; paramInt < j; paramInt++)
      {
        View localView = paramAppBarLayout.getChildAt(paramInt);
        if ((i >= localView.getTop()) && (i <= localView.getBottom())) {
          return localView;
        }
      }
      return null;
    }
    
    private View a(CoordinatorLayout paramCoordinatorLayout)
    {
      int i = paramCoordinatorLayout.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = paramCoordinatorLayout.getChildAt(j);
        if ((localView instanceof m)) {
          return localView;
        }
      }
      return null;
    }
    
    private void a(int paramInt1, T paramT, View paramView, int paramInt2)
    {
      if (paramInt2 == 1)
      {
        paramInt2 = c();
        if (((paramInt1 < 0) && (paramInt2 == 0)) || ((paramInt1 > 0) && (paramInt2 == -paramT.getDownNestedScrollRange()))) {
          y.f(paramView, 1);
        }
      }
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, T paramT, int paramInt, float paramFloat)
    {
      int i = Math.abs(c() - paramInt);
      paramFloat = Math.abs(paramFloat);
      if (paramFloat > 0.0F) {
        i = Math.round(i / paramFloat * 1000.0F) * 3;
      } else {
        i = (int)((i / paramT.getHeight() + 1.0F) * 150.0F);
      }
      a(paramCoordinatorLayout, paramT, paramInt, i);
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, T paramT, int paramInt1, int paramInt2)
    {
      int i = c();
      if (i == paramInt1)
      {
        paramCoordinatorLayout = this.m;
        if ((paramCoordinatorLayout != null) && (paramCoordinatorLayout.isRunning())) {
          this.m.cancel();
        }
        return;
      }
      ValueAnimator localValueAnimator = this.m;
      if (localValueAnimator == null)
      {
        this.m = new ValueAnimator();
        this.m.setInterpolator(ga.e);
        this.m.addUpdateListener(new b(this, paramCoordinatorLayout, paramT));
      }
      else
      {
        localValueAnimator.cancel();
      }
      this.m.setDuration(Math.min(paramInt2, 600));
      this.m.setIntValues(new int[] { i, paramInt1 });
      this.m.start();
    }
    
    private void a(CoordinatorLayout paramCoordinatorLayout, T paramT, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      View localView = a(paramT, paramInt1);
      if (localView != null)
      {
        int i = ((AppBarLayout.b)localView.getLayoutParams()).a();
        if ((i & 0x1) != 0)
        {
          int j = y.m(localView);
          if ((paramInt2 > 0) && ((i & 0xC) != 0))
          {
            if (-paramInt1 < localView.getBottom() - j - paramT.getTopInset()) {}
          }
          else {
            while (((i & 0x2) != 0) && (-paramInt1 >= localView.getBottom() - j - paramT.getTopInset()))
            {
              bool1 = true;
              break;
            }
          }
        }
        boolean bool1 = false;
        boolean bool2 = bool1;
        if (paramT.c())
        {
          localView = a(paramCoordinatorLayout);
          bool2 = bool1;
          if (localView != null) {
            if (localView.getScrollY() > 0) {
              bool2 = true;
            } else {
              bool2 = false;
            }
          }
        }
        bool2 = paramT.a(bool2);
        if ((Build.VERSION.SDK_INT >= 11) && ((paramBoolean) || ((bool2) && (c(paramCoordinatorLayout, paramT))))) {
          paramT.jumpDrawablesToCurrentState();
        }
      }
    }
    
    private static boolean a(int paramInt1, int paramInt2)
    {
      boolean bool;
      if ((paramInt1 & paramInt2) == paramInt2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private boolean a(CoordinatorLayout paramCoordinatorLayout, T paramT, View paramView)
    {
      boolean bool;
      if ((paramT.b()) && (paramCoordinatorLayout.getHeight() - paramView.getHeight() <= paramT.getHeight())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    private int b(T paramT, int paramInt)
    {
      int i = paramT.getChildCount();
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramT.getChildAt(j);
        int i1 = ((View)localObject).getTop();
        int i2 = ((View)localObject).getBottom();
        localObject = (AppBarLayout.b)((View)localObject).getLayoutParams();
        int i3 = i1;
        int i4 = i2;
        if (a(((AppBarLayout.b)localObject).a(), 32))
        {
          i3 = i1 - ((LinearLayout.LayoutParams)localObject).topMargin;
          i4 = i2 + ((LinearLayout.LayoutParams)localObject).bottomMargin;
        }
        i2 = -paramInt;
        if ((i3 <= i2) && (i4 >= i2)) {
          return j;
        }
      }
      return -1;
    }
    
    private int c(T paramT, int paramInt)
    {
      int i = Math.abs(paramInt);
      int j = paramT.getChildCount();
      int i1 = 0;
      for (int i2 = 0; i2 < j; i2++)
      {
        View localView = paramT.getChildAt(i2);
        AppBarLayout.b localb = (AppBarLayout.b)localView.getLayoutParams();
        Interpolator localInterpolator = localb.b();
        if ((i >= localView.getTop()) && (i <= localView.getBottom()))
        {
          if (localInterpolator == null) {
            break;
          }
          j = localb.a();
          i2 = i1;
          if ((j & 0x1) != 0)
          {
            i1 = 0 + (localView.getHeight() + localb.topMargin + localb.bottomMargin);
            i2 = i1;
            if ((j & 0x2) != 0) {
              i2 = i1 - y.m(localView);
            }
          }
          i1 = i2;
          if (y.i(localView)) {
            i1 = i2 - paramT.getTopInset();
          }
          if (i1 <= 0) {
            break;
          }
          i2 = localView.getTop();
          float f = i1;
          i2 = Math.round(f * localInterpolator.getInterpolation((i - i2) / f));
          return Integer.signum(paramInt) * (localView.getTop() + i2);
        }
      }
      return paramInt;
    }
    
    private boolean c(CoordinatorLayout paramCoordinatorLayout, T paramT)
    {
      paramCoordinatorLayout = paramCoordinatorLayout.c(paramT);
      int i = paramCoordinatorLayout.size();
      boolean bool = false;
      for (int j = 0; j < i; j++)
      {
        paramT = ((CoordinatorLayout.e)((View)paramCoordinatorLayout.get(j)).getLayoutParams()).d();
        if ((paramT instanceof AppBarLayout.ScrollingViewBehavior))
        {
          if (((AppBarLayout.ScrollingViewBehavior)paramT).c() != 0) {
            bool = true;
          }
          return bool;
        }
      }
      return false;
    }
    
    private void d(CoordinatorLayout paramCoordinatorLayout, T paramT)
    {
      int i = c();
      int j = b(paramT, i);
      if (j >= 0)
      {
        View localView = paramT.getChildAt(j);
        AppBarLayout.b localb = (AppBarLayout.b)localView.getLayoutParams();
        int i1 = localb.a();
        if ((i1 & 0x11) == 17)
        {
          int i2 = -localView.getTop();
          int i3 = -localView.getBottom();
          int i4 = i3;
          if (j == paramT.getChildCount() - 1) {
            i4 = i3 + paramT.getTopInset();
          }
          if (a(i1, 2))
          {
            i3 = i4 + y.m(localView);
            j = i2;
          }
          else
          {
            j = i2;
            i3 = i4;
            if (a(i1, 5))
            {
              i3 = y.m(localView) + i4;
              if (i < i3)
              {
                j = i3;
                i3 = i4;
              }
              else
              {
                j = i2;
              }
            }
          }
          i2 = j;
          i4 = i3;
          if (a(i1, 32))
          {
            i2 = j + localb.topMargin;
            i4 = i3 - localb.bottomMargin;
          }
          i3 = i2;
          if (i < (i4 + i2) / 2) {
            i3 = i4;
          }
          a(paramCoordinatorLayout, paramT, Gc.a(i3, -paramT.getTotalScrollRange(), 0), 0.0F);
        }
      }
    }
    
    int a(CoordinatorLayout paramCoordinatorLayout, T paramT, int paramInt1, int paramInt2, int paramInt3)
    {
      int i = c();
      int j = 0;
      if ((paramInt2 != 0) && (i >= paramInt2) && (i <= paramInt3))
      {
        paramInt2 = Gc.a(paramInt1, paramInt2, paramInt3);
        paramInt1 = j;
        if (i != paramInt2)
        {
          if (paramT.a()) {
            paramInt1 = c(paramT, paramInt2);
          } else {
            paramInt1 = paramInt2;
          }
          boolean bool = a(paramInt1);
          paramInt3 = i - paramInt2;
          this.k = (paramInt2 - paramInt1);
          if ((!bool) && (paramT.a())) {
            paramCoordinatorLayout.a(paramT);
          }
          paramT.a(b());
          if (paramInt2 < i) {
            paramInt1 = -1;
          } else {
            paramInt1 = 1;
          }
          a(paramCoordinatorLayout, paramT, paramInt2, paramInt1, false);
          paramInt1 = paramInt3;
        }
      }
      else
      {
        this.k = 0;
        paramInt1 = j;
      }
      return paramInt1;
    }
    
    void a(CoordinatorLayout paramCoordinatorLayout, T paramT)
    {
      d(paramCoordinatorLayout, paramT);
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, T paramT, Parcelable paramParcelable)
    {
      if ((paramParcelable instanceof b))
      {
        paramParcelable = (b)paramParcelable;
        super.a(paramCoordinatorLayout, paramT, paramParcelable.l());
        this.n = paramParcelable.c;
        this.p = paramParcelable.d;
        this.o = paramParcelable.e;
      }
      else
      {
        super.a(paramCoordinatorLayout, paramT, paramParcelable);
        this.n = -1;
      }
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, T paramT, View paramView, int paramInt)
    {
      if ((this.l == 0) || (paramInt == 1)) {
        d(paramCoordinatorLayout, paramT);
      }
      this.q = new WeakReference(paramView);
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, T paramT, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      if (paramInt4 < 0)
      {
        a(paramCoordinatorLayout, paramT, paramInt4, -paramT.getDownNestedScrollRange(), 0);
        a(paramInt4, paramT, paramView, paramInt5);
      }
      if (paramT.c())
      {
        boolean bool;
        if (paramView.getScrollY() > 0) {
          bool = true;
        } else {
          bool = false;
        }
        paramT.a(bool);
      }
    }
    
    public void a(CoordinatorLayout paramCoordinatorLayout, T paramT, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
    {
      if (paramInt2 != 0)
      {
        int i;
        if (paramInt2 < 0)
        {
          i = -paramT.getTotalScrollRange();
          int j = paramT.getDownNestedPreScrollRange();
          paramInt1 = i;
          i = j + i;
        }
        else
        {
          paramInt1 = -paramT.getUpNestedPreScrollRange();
          i = 0;
        }
        if (paramInt1 != i)
        {
          paramArrayOfInt[1] = a(paramCoordinatorLayout, paramT, paramInt2, paramInt1, i);
          a(paramInt2, paramT, paramView, paramInt3);
        }
      }
    }
    
    boolean a(T paramT)
    {
      a locala = this.r;
      if (locala != null) {
        return locala.a(paramT);
      }
      paramT = this.q;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (paramT != null)
      {
        paramT = (View)paramT.get();
        if ((paramT != null) && (paramT.isShown()) && (!paramT.canScrollVertically(-1))) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, T paramT, int paramInt)
    {
      boolean bool = super.a(paramCoordinatorLayout, paramT, paramInt);
      int i = paramT.getPendingAction();
      paramInt = this.n;
      if ((paramInt >= 0) && ((i & 0x8) == 0))
      {
        View localView = paramT.getChildAt(paramInt);
        i = -localView.getBottom();
        if (this.o) {
          paramInt = y.m(localView) + paramT.getTopInset();
        } else {
          paramInt = Math.round(localView.getHeight() * this.p);
        }
        c(paramCoordinatorLayout, paramT, i + paramInt);
      }
      else if (i != 0)
      {
        if ((i & 0x4) != 0) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if ((i & 0x2) != 0)
        {
          i = -paramT.getUpNestedPreScrollRange();
          if (paramInt != 0) {
            a(paramCoordinatorLayout, paramT, i, 0.0F);
          } else {
            c(paramCoordinatorLayout, paramT, i);
          }
        }
        else if ((i & 0x1) != 0)
        {
          if (paramInt != 0) {
            a(paramCoordinatorLayout, paramT, 0, 0.0F);
          } else {
            c(paramCoordinatorLayout, paramT, 0);
          }
        }
      }
      paramT.d();
      this.n = -1;
      a(Gc.a(b(), -paramT.getTotalScrollRange(), 0));
      a(paramCoordinatorLayout, paramT, b(), 0, true);
      paramT.a(b());
      return bool;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, T paramT, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (((CoordinatorLayout.e)paramT.getLayoutParams()).height == -2)
      {
        paramCoordinatorLayout.a(paramT, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(0, 0), paramInt4);
        return true;
      }
      return super.a(paramCoordinatorLayout, paramT, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, T paramT, View paramView1, View paramView2, int paramInt1, int paramInt2)
    {
      boolean bool;
      if (((paramInt1 & 0x2) != 0) && ((paramT.c()) || (a(paramCoordinatorLayout, paramT, paramView1)))) {
        bool = true;
      } else {
        bool = false;
      }
      if (bool)
      {
        paramCoordinatorLayout = this.m;
        if (paramCoordinatorLayout != null) {
          paramCoordinatorLayout.cancel();
        }
      }
      this.q = null;
      this.l = paramInt2;
      return bool;
    }
    
    int b(T paramT)
    {
      return -paramT.getDownNestedScrollRange();
    }
    
    public Parcelable b(CoordinatorLayout paramCoordinatorLayout, T paramT)
    {
      Object localObject = super.d(paramCoordinatorLayout, paramT);
      int i = b();
      int j = paramT.getChildCount();
      boolean bool = false;
      for (int i1 = 0; i1 < j; i1++)
      {
        paramCoordinatorLayout = paramT.getChildAt(i1);
        int i2 = paramCoordinatorLayout.getBottom() + i;
        if ((paramCoordinatorLayout.getTop() + i <= 0) && (i2 >= 0))
        {
          localObject = new b((Parcelable)localObject);
          ((b)localObject).c = i1;
          if (i2 == y.m(paramCoordinatorLayout) + paramT.getTopInset()) {
            bool = true;
          }
          ((b)localObject).e = bool;
          ((b)localObject).d = (i2 / paramCoordinatorLayout.getHeight());
          return (Parcelable)localObject;
        }
      }
      return (Parcelable)localObject;
    }
    
    int c()
    {
      return b() + this.k;
    }
    
    int c(T paramT)
    {
      return paramT.getTotalScrollRange();
    }
    
    public static abstract class a<T extends AppBarLayout>
    {
      public abstract boolean a(T paramT);
    }
    
    protected static class b
      extends android.support.v4.view.c
    {
      public static final Parcelable.Creator<b> CREATOR = new c();
      int c;
      float d;
      boolean e;
      
      public b(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        super(paramClassLoader);
        this.c = paramParcel.readInt();
        this.d = paramParcel.readFloat();
        boolean bool;
        if (paramParcel.readByte() != 0) {
          bool = true;
        } else {
          bool = false;
        }
        this.e = bool;
      }
      
      public b(Parcelable paramParcelable)
      {
        super();
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        super.writeToParcel(paramParcel, paramInt);
        paramParcel.writeInt(this.c);
        paramParcel.writeFloat(this.d);
        paramParcel.writeByte((byte)this.e);
      }
    }
  }
  
  public static class Behavior
    extends AppBarLayout.BaseBehavior<AppBarLayout>
  {
    public Behavior() {}
    
    public Behavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
  }
  
  public static class ScrollingViewBehavior
    extends H
  {
    public ScrollingViewBehavior() {}
    
    public ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, fa.ScrollingViewBehavior_Layout);
      b(paramContext.getDimensionPixelSize(fa.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
      paramContext.recycle();
    }
    
    private static int a(AppBarLayout paramAppBarLayout)
    {
      paramAppBarLayout = ((CoordinatorLayout.e)paramAppBarLayout.getLayoutParams()).d();
      if ((paramAppBarLayout instanceof AppBarLayout.BaseBehavior)) {
        return ((AppBarLayout.BaseBehavior)paramAppBarLayout).c();
      }
      return 0;
    }
    
    private void a(View paramView1, View paramView2)
    {
      Object localObject = ((CoordinatorLayout.e)paramView2.getLayoutParams()).d();
      if ((localObject instanceof AppBarLayout.BaseBehavior))
      {
        localObject = (AppBarLayout.BaseBehavior)localObject;
        y.b(paramView1, paramView2.getBottom() - paramView1.getTop() + AppBarLayout.BaseBehavior.a((AppBarLayout.BaseBehavior)localObject) + d() - a(paramView2));
      }
    }
    
    private void b(View paramView1, View paramView2)
    {
      if ((paramView2 instanceof AppBarLayout))
      {
        paramView2 = (AppBarLayout)paramView2;
        if (paramView2.c())
        {
          boolean bool;
          if (paramView1.getScrollY() > 0) {
            bool = true;
          } else {
            bool = false;
          }
          paramView2.a(bool);
        }
      }
    }
    
    AppBarLayout a(List<View> paramList)
    {
      int i = paramList.size();
      for (int j = 0; j < i; j++)
      {
        View localView = (View)paramList.get(j);
        if ((localView instanceof AppBarLayout)) {
          return (AppBarLayout)localView;
        }
      }
      return null;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
    {
      AppBarLayout localAppBarLayout = a(paramCoordinatorLayout.b(paramView));
      if (localAppBarLayout != null)
      {
        paramRect.offset(paramView.getLeft(), paramView.getTop());
        paramView = this.d;
        paramView.set(0, 0, paramCoordinatorLayout.getWidth(), paramCoordinatorLayout.getHeight());
        if (!paramView.contains(paramRect))
        {
          localAppBarLayout.a(false, paramBoolean ^ true);
          return true;
        }
      }
      return false;
    }
    
    public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      return paramView2 instanceof AppBarLayout;
    }
    
    float b(View paramView)
    {
      if ((paramView instanceof AppBarLayout))
      {
        paramView = (AppBarLayout)paramView;
        int i = paramView.getTotalScrollRange();
        int j = paramView.getDownNestedPreScrollRange();
        int k = a(paramView);
        if ((j != 0) && (i + k <= j)) {
          return 0.0F;
        }
        i -= j;
        if (i != 0) {
          return k / i + 1.0F;
        }
      }
      return 0.0F;
    }
    
    public boolean b(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
    {
      a(paramView1, paramView2);
      b(paramView1, paramView2);
      return false;
    }
    
    int c(View paramView)
    {
      if ((paramView instanceof AppBarLayout)) {
        return ((AppBarLayout)paramView).getTotalScrollRange();
      }
      return super.c(paramView);
    }
  }
  
  public static abstract interface a<T extends AppBarLayout>
  {
    public abstract void a(T paramT, int paramInt);
  }
  
  public static class b
    extends LinearLayout.LayoutParams
  {
    int a = 1;
    Interpolator b;
    
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, fa.AppBarLayout_Layout);
      this.a = paramAttributeSet.getInt(fa.AppBarLayout_Layout_layout_scrollFlags, 0);
      if (paramAttributeSet.hasValue(fa.AppBarLayout_Layout_layout_scrollInterpolator)) {
        this.b = AnimationUtils.loadInterpolator(paramContext, paramAttributeSet.getResourceId(fa.AppBarLayout_Layout_layout_scrollInterpolator, 0));
      }
      paramAttributeSet.recycle();
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public b(LinearLayout.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public int a()
    {
      return this.a;
    }
    
    public Interpolator b()
    {
      return this.b;
    }
    
    boolean c()
    {
      int i = this.a;
      boolean bool = true;
      if (((i & 0x1) != 1) || ((i & 0xA) == 0)) {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface c
    extends AppBarLayout.a<AppBarLayout>
  {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */