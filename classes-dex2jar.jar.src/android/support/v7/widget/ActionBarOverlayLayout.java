package android.support.v7.widget;

import Gd;
import Ld;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.y;
import android.support.v7.view.menu.v.a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.FrameLayout;
import android.widget.OverScroller;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements U, p
{
  static final int[] a = { Gd.actionBarSize, 16842841 };
  private final Runnable A = new f(this);
  private final q B;
  private int b;
  private int c = 0;
  private ContentFrameLayout d;
  ActionBarContainer e;
  private V f;
  private Drawable g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  boolean l;
  private int m;
  private int n;
  private final Rect o = new Rect();
  private final Rect p = new Rect();
  private final Rect q = new Rect();
  private final Rect r = new Rect();
  private final Rect s = new Rect();
  private final Rect t = new Rect();
  private final Rect u = new Rect();
  private a v;
  private OverScroller w;
  ViewPropertyAnimator x;
  final AnimatorListenerAdapter y = new d(this);
  private final Runnable z = new e(this);
  
  public ActionBarOverlayLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
    this.B = new q(this);
  }
  
  private V a(View paramView)
  {
    if ((paramView instanceof V)) {
      return (V)paramView;
    }
    if ((paramView instanceof Toolbar)) {
      return ((Toolbar)paramView).getWrapper();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Can't make a decor toolbar out of ");
    localStringBuilder.append(paramView.getClass().getSimpleName());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private void a(Context paramContext)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(a);
    boolean bool1 = false;
    this.b = localTypedArray.getDimensionPixelSize(0, 0);
    this.g = localTypedArray.getDrawable(1);
    if (this.g == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    setWillNotDraw(bool2);
    localTypedArray.recycle();
    boolean bool2 = bool1;
    if (paramContext.getApplicationInfo().targetSdkVersion < 19) {
      bool2 = true;
    }
    this.h = bool2;
    this.w = new OverScroller(paramContext);
  }
  
  private boolean a(float paramFloat1, float paramFloat2)
  {
    this.w.fling(0, 0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    boolean bool;
    if (this.w.getFinalY() > this.e.getHeight()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean a(View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    paramView = (b)paramView.getLayoutParams();
    int i1;
    int i2;
    if (paramBoolean1)
    {
      i1 = paramView.leftMargin;
      i2 = paramRect.left;
      if (i1 != i2)
      {
        paramView.leftMargin = i2;
        bool = true;
        break label46;
      }
    }
    boolean bool = false;
    label46:
    paramBoolean1 = bool;
    if (paramBoolean2)
    {
      i2 = paramView.topMargin;
      i1 = paramRect.top;
      paramBoolean1 = bool;
      if (i2 != i1)
      {
        paramView.topMargin = i1;
        paramBoolean1 = true;
      }
    }
    paramBoolean2 = paramBoolean1;
    if (paramBoolean4)
    {
      i1 = paramView.rightMargin;
      i2 = paramRect.right;
      paramBoolean2 = paramBoolean1;
      if (i1 != i2)
      {
        paramView.rightMargin = i2;
        paramBoolean2 = true;
      }
    }
    paramBoolean1 = paramBoolean2;
    if (paramBoolean3)
    {
      i1 = paramView.bottomMargin;
      i2 = paramRect.bottom;
      paramBoolean1 = paramBoolean2;
      if (i1 != i2)
      {
        paramView.bottomMargin = i2;
        paramBoolean1 = true;
      }
    }
    return paramBoolean1;
  }
  
  private void k()
  {
    h();
    this.A.run();
  }
  
  private void l()
  {
    h();
    postDelayed(this.A, 600L);
  }
  
  private void m()
  {
    h();
    postDelayed(this.z, 600L);
  }
  
  private void n()
  {
    h();
    this.z.run();
  }
  
  public void a(int paramInt)
  {
    j();
    if (paramInt != 2)
    {
      if (paramInt != 5)
      {
        if (paramInt == 109) {
          setOverlayMode(true);
        }
      }
      else {
        this.f.m();
      }
    }
    else {
      this.f.l();
    }
  }
  
  public void a(Menu paramMenu, v.a parama)
  {
    j();
    this.f.a(paramMenu, parama);
  }
  
  public boolean a()
  {
    j();
    return this.f.a();
  }
  
  public void b()
  {
    j();
    this.f.b();
  }
  
  public boolean c()
  {
    j();
    return this.f.c();
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof b;
  }
  
  public boolean d()
  {
    j();
    return this.f.d();
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.g != null) && (!this.h))
    {
      int i1;
      if (this.e.getVisibility() == 0) {
        i1 = (int)(this.e.getBottom() + this.e.getTranslationY() + 0.5F);
      } else {
        i1 = 0;
      }
      this.g.setBounds(0, i1, getWidth(), this.g.getIntrinsicHeight() + i1);
      this.g.draw(paramCanvas);
    }
  }
  
  public boolean e()
  {
    j();
    return this.f.e();
  }
  
  public boolean f()
  {
    j();
    return this.f.f();
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    j();
    y.u(this);
    boolean bool = a(this.e, paramRect, true, true, false, true);
    this.r.set(paramRect);
    Fb.a(this, this.r, this.o);
    if (!this.s.equals(this.r))
    {
      this.s.set(this.r);
      bool = true;
    }
    if (!this.p.equals(this.o))
    {
      this.p.set(this.o);
      bool = true;
    }
    if (bool) {
      requestLayout();
    }
    return true;
  }
  
  public void g()
  {
    j();
    this.f.g();
  }
  
  protected b generateDefaultLayoutParams()
  {
    return new b(-1, -1);
  }
  
  public b generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new b(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new b(paramLayoutParams);
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = this.e;
    int i1;
    if (localActionBarContainer != null) {
      i1 = -(int)localActionBarContainer.getTranslationY();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public int getNestedScrollAxes()
  {
    return this.B.a();
  }
  
  public CharSequence getTitle()
  {
    j();
    return this.f.getTitle();
  }
  
  void h()
  {
    removeCallbacks(this.z);
    removeCallbacks(this.A);
    ViewPropertyAnimator localViewPropertyAnimator = this.x;
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
  }
  
  public boolean i()
  {
    return this.i;
  }
  
  void j()
  {
    if (this.d == null)
    {
      this.d = ((ContentFrameLayout)findViewById(Ld.action_bar_activity_content));
      this.e = ((ActionBarContainer)findViewById(Ld.action_bar_container));
      this.f = a(findViewById(Ld.action_bar));
    }
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a(getContext());
    y.F(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    h();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        b localb = (b)localView.getLayoutParams();
        int i1 = localView.getMeasuredWidth();
        int i2 = localView.getMeasuredHeight();
        int i3 = localb.leftMargin + paramInt3;
        int i4 = localb.topMargin + paramInt4;
        localView.layout(i3, i4, i1 + i3, i2 + i4);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    j();
    measureChildWithMargins(this.e, paramInt1, 0, paramInt2, 0);
    Object localObject = (b)this.e.getLayoutParams();
    int i1 = Math.max(0, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)localObject).leftMargin + ((ViewGroup.MarginLayoutParams)localObject).rightMargin);
    int i2 = Math.max(0, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)localObject).topMargin + ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
    int i3 = View.combineMeasuredStates(0, this.e.getMeasuredState());
    if ((y.u(this) & 0x100) != 0) {
      i4 = 1;
    } else {
      i4 = 0;
    }
    if (i4 != 0)
    {
      i5 = this.b;
      i6 = i5;
      if (this.j)
      {
        i6 = i5;
        if (this.e.getTabContainer() != null) {
          i6 = i5 + this.b;
        }
      }
    }
    else if (this.e.getVisibility() != 8)
    {
      i6 = this.e.getMeasuredHeight();
    }
    else
    {
      i6 = 0;
    }
    this.q.set(this.o);
    this.t.set(this.r);
    if ((!this.i) && (i4 == 0))
    {
      localObject = this.q;
      ((Rect)localObject).top += i6;
      ((Rect)localObject).bottom += 0;
    }
    else
    {
      localObject = this.t;
      ((Rect)localObject).top += i6;
      ((Rect)localObject).bottom += 0;
    }
    a(this.d, this.q, true, true, true, true);
    if (!this.u.equals(this.t))
    {
      this.u.set(this.t);
      this.d.a(this.t);
    }
    measureChildWithMargins(this.d, paramInt1, 0, paramInt2, 0);
    localObject = (b)this.d.getLayoutParams();
    int i6 = Math.max(i1, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)localObject).leftMargin + ((ViewGroup.MarginLayoutParams)localObject).rightMargin);
    i2 = Math.max(i2, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)localObject).topMargin + ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
    int i5 = View.combineMeasuredStates(i3, this.d.getMeasuredState());
    i3 = getPaddingLeft();
    int i4 = getPaddingRight();
    i2 = Math.max(i2 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i6 + (i3 + i4), getSuggestedMinimumWidth()), paramInt1, i5), View.resolveSizeAndState(i2, paramInt2, i5 << 16));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((this.k) && (paramBoolean))
    {
      if (a(paramFloat1, paramFloat2)) {
        k();
      } else {
        n();
      }
      this.l = true;
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.m += paramInt2;
    setActionBarHideOffset(this.m);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.B.a(paramView1, paramView2, paramInt);
    this.m = getActionBarHideOffset();
    h();
    paramView1 = this.v;
    if (paramView1 != null) {
      paramView1.d();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) != 0) && (this.e.getVisibility() == 0)) {
      return this.k;
    }
    return false;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((this.k) && (!this.l)) {
      if (this.m <= this.e.getHeight()) {
        m();
      } else {
        l();
      }
    }
    paramView = this.v;
    if (paramView != null) {
      paramView.b();
    }
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    j();
    int i1 = this.n;
    this.n = paramInt;
    int i2 = 0;
    int i3;
    if ((paramInt & 0x4) == 0) {
      i3 = 1;
    } else {
      i3 = 0;
    }
    if ((paramInt & 0x100) != 0) {
      i2 = 1;
    }
    a locala = this.v;
    if (locala != null)
    {
      locala.a(i2 ^ 0x1);
      if ((i3 == 0) && (i2 != 0)) {
        this.v.c();
      } else {
        this.v.a();
      }
    }
    if ((((i1 ^ paramInt) & 0x100) != 0) && (this.v != null)) {
      y.F(this);
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.c = paramInt;
    a locala = this.v;
    if (locala != null) {
      locala.onWindowVisibilityChanged(paramInt);
    }
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    h();
    paramInt = Math.max(0, Math.min(paramInt, this.e.getHeight()));
    this.e.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(a parama)
  {
    this.v = parama;
    if (getWindowToken() != null)
    {
      this.v.onWindowVisibilityChanged(this.c);
      int i1 = this.n;
      if (i1 != 0)
      {
        onWindowSystemUiVisibilityChanged(i1);
        y.F(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    this.j = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.k)
    {
      this.k = paramBoolean;
      if (!paramBoolean)
      {
        h();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    j();
    this.f.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    j();
    this.f.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    j();
    this.f.b(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    this.i = paramBoolean;
    if ((paramBoolean) && (getContext().getApplicationInfo().targetSdkVersion < 19)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    this.h = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    j();
    this.f.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    j();
    this.f.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void a(boolean paramBoolean);
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
    
    public abstract void onWindowVisibilityChanged(int paramInt);
  }
  
  public static class b
    extends ViewGroup.MarginLayoutParams
  {
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */