package android.support.design.widget;

import Gc;
import Od;
import aa;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.N;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import fa;
import ga;
import pd;

public class CollapsingToolbarLayout
  extends FrameLayout
{
  private boolean a = true;
  private int b;
  private Toolbar c;
  private View d;
  private View e;
  private int f;
  private int g;
  private int h;
  private int i;
  private final Rect j = new Rect();
  final s k = new s(this);
  private boolean l;
  private boolean m;
  private Drawable n;
  Drawable o;
  private int p;
  private boolean q;
  private ValueAnimator r;
  private long s;
  private int t = -1;
  private AppBarLayout.c u;
  int v;
  N w;
  
  public CollapsingToolbarLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.k.b(ga.e);
    paramContext = android.support.design.internal.c.a(paramContext, paramAttributeSet, fa.CollapsingToolbarLayout, paramInt, ea.Widget_Design_CollapsingToolbar, new int[0]);
    this.k.d(paramContext.getInt(fa.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
    this.k.b(paramContext.getInt(fa.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
    paramInt = paramContext.getDimensionPixelSize(fa.CollapsingToolbarLayout_expandedTitleMargin, 0);
    this.i = paramInt;
    this.h = paramInt;
    this.g = paramInt;
    this.f = paramInt;
    if (paramContext.hasValue(fa.CollapsingToolbarLayout_expandedTitleMarginStart)) {
      this.f = paramContext.getDimensionPixelSize(fa.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
    }
    if (paramContext.hasValue(fa.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
      this.h = paramContext.getDimensionPixelSize(fa.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
    }
    if (paramContext.hasValue(fa.CollapsingToolbarLayout_expandedTitleMarginTop)) {
      this.g = paramContext.getDimensionPixelSize(fa.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
    }
    if (paramContext.hasValue(fa.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
      this.i = paramContext.getDimensionPixelSize(fa.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
    }
    this.l = paramContext.getBoolean(fa.CollapsingToolbarLayout_titleEnabled, true);
    setTitle(paramContext.getText(fa.CollapsingToolbarLayout_title));
    this.k.c(ea.TextAppearance_Design_CollapsingToolbar_Expanded);
    this.k.a(Od.TextAppearance_AppCompat_Widget_ActionBar_Title);
    if (paramContext.hasValue(fa.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
      this.k.c(paramContext.getResourceId(fa.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
    }
    if (paramContext.hasValue(fa.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
      this.k.a(paramContext.getResourceId(fa.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
    }
    this.t = paramContext.getDimensionPixelSize(fa.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
    this.s = paramContext.getInt(fa.CollapsingToolbarLayout_scrimAnimationDuration, 600);
    setContentScrim(paramContext.getDrawable(fa.CollapsingToolbarLayout_contentScrim));
    setStatusBarScrim(paramContext.getDrawable(fa.CollapsingToolbarLayout_statusBarScrim));
    this.b = paramContext.getResourceId(fa.CollapsingToolbarLayout_toolbarId, -1);
    paramContext.recycle();
    setWillNotDraw(false);
    android.support.v4.view.y.a(this, new t(this));
  }
  
  private void a(int paramInt)
  {
    b();
    Object localObject = this.r;
    if (localObject == null)
    {
      this.r = new ValueAnimator();
      this.r.setDuration(this.s);
      ValueAnimator localValueAnimator = this.r;
      if (paramInt > this.p) {
        localObject = ga.c;
      } else {
        localObject = ga.d;
      }
      localValueAnimator.setInterpolator((TimeInterpolator)localObject);
      this.r.addUpdateListener(new u(this));
    }
    else if (((ValueAnimator)localObject).isRunning())
    {
      this.r.cancel();
    }
    this.r.setIntValues(new int[] { this.p, paramInt });
    this.r.start();
  }
  
  static ea b(View paramView)
  {
    ea localea1 = (ea)paramView.getTag(aa.view_offset_helper);
    ea localea2 = localea1;
    if (localea1 == null)
    {
      localea2 = new ea(paramView);
      paramView.setTag(aa.view_offset_helper, localea2);
    }
    return localea2;
  }
  
  private void b()
  {
    if (!this.a) {
      return;
    }
    Object localObject1 = null;
    this.c = null;
    this.d = null;
    int i1 = this.b;
    Object localObject2;
    if (i1 != -1)
    {
      this.c = ((Toolbar)findViewById(i1));
      localObject2 = this.c;
      if (localObject2 != null) {
        this.d = c((View)localObject2);
      }
    }
    if (this.c == null)
    {
      int i2 = getChildCount();
      for (i1 = 0;; i1++)
      {
        localObject2 = localObject1;
        if (i1 >= i2) {
          break;
        }
        localObject2 = getChildAt(i1);
        if ((localObject2 instanceof Toolbar))
        {
          localObject2 = (Toolbar)localObject2;
          break;
        }
      }
      this.c = ((Toolbar)localObject2);
    }
    d();
    this.a = false;
  }
  
  private View c(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    View localView = paramView;
    for (paramView = localViewParent; (paramView != this) && (paramView != null); paramView = paramView.getParent()) {
      if ((paramView instanceof View)) {
        localView = (View)paramView;
      }
    }
    return localView;
  }
  
  private void c()
  {
    setContentDescription(getTitle());
  }
  
  private static int d(View paramView)
  {
    Object localObject = paramView.getLayoutParams();
    if ((localObject instanceof ViewGroup.MarginLayoutParams))
    {
      localObject = (ViewGroup.MarginLayoutParams)localObject;
      return paramView.getHeight() + ((ViewGroup.MarginLayoutParams)localObject).topMargin + ((ViewGroup.MarginLayoutParams)localObject).bottomMargin;
    }
    return paramView.getHeight();
  }
  
  private void d()
  {
    if (!this.l)
    {
      Object localObject = this.e;
      if (localObject != null)
      {
        localObject = ((View)localObject).getParent();
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(this.e);
        }
      }
    }
    if ((this.l) && (this.c != null))
    {
      if (this.e == null) {
        this.e = new View(getContext());
      }
      if (this.e.getParent() == null) {
        this.c.addView(this.e, -1, -1);
      }
    }
  }
  
  private boolean e(View paramView)
  {
    View localView = this.d;
    boolean bool = true;
    if ((localView != null) && (localView != this) ? paramView != localView : paramView != this.c) {
      bool = false;
    }
    return bool;
  }
  
  final int a(View paramView)
  {
    ea localea = b(paramView);
    a locala = (a)paramView.getLayoutParams();
    return getHeight() - localea.a() - paramView.getHeight() - locala.bottomMargin;
  }
  
  N a(N paramN)
  {
    N localN;
    if (android.support.v4.view.y.i(this)) {
      localN = paramN;
    } else {
      localN = null;
    }
    if (!pd.a(this.w, localN))
    {
      this.w = localN;
      requestLayout();
    }
    return paramN.a();
  }
  
  final void a()
  {
    if ((this.n != null) || (this.o != null))
    {
      boolean bool;
      if (getHeight() + this.v < getScrimVisibleHeightTrigger()) {
        bool = true;
      } else {
        bool = false;
      }
      setScrimsShown(bool);
    }
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.q != paramBoolean1)
    {
      int i1 = 255;
      if (paramBoolean2)
      {
        if (!paramBoolean1) {
          i1 = 0;
        }
        a(i1);
      }
      else
      {
        if (!paramBoolean1) {
          i1 = 0;
        }
        setScrimAlpha(i1);
      }
      this.q = paramBoolean1;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof a;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    b();
    Object localObject;
    if (this.c == null)
    {
      localObject = this.n;
      if ((localObject != null) && (this.p > 0))
      {
        ((Drawable)localObject).mutate().setAlpha(this.p);
        this.n.draw(paramCanvas);
      }
    }
    if ((this.l) && (this.m)) {
      this.k.a(paramCanvas);
    }
    if ((this.o != null) && (this.p > 0))
    {
      localObject = this.w;
      int i1;
      if (localObject != null) {
        i1 = ((N)localObject).e();
      } else {
        i1 = 0;
      }
      if (i1 > 0)
      {
        this.o.setBounds(0, -this.v, getWidth(), i1 - this.v);
        this.o.mutate().setAlpha(this.p);
        this.o.draw(paramCanvas);
      }
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    Drawable localDrawable = this.n;
    boolean bool1 = true;
    int i1;
    if ((localDrawable != null) && (this.p > 0) && (e(paramView)))
    {
      this.n.mutate().setAlpha(this.p);
      this.n.draw(paramCanvas);
      i1 = 1;
    }
    else
    {
      i1 = 0;
    }
    boolean bool2 = bool1;
    if (!super.drawChild(paramCanvas, paramView, paramLong)) {
      if (i1 != 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Object localObject = this.o;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((Drawable)localObject).isStateful()) {
        bool2 = false | ((Drawable)localObject).setState(arrayOfInt);
      }
    }
    localObject = this.n;
    bool1 = bool2;
    if (localObject != null)
    {
      bool1 = bool2;
      if (((Drawable)localObject).isStateful()) {
        bool1 = bool2 | ((Drawable)localObject).setState(arrayOfInt);
      }
    }
    localObject = this.k;
    bool2 = bool1;
    if (localObject != null) {
      bool2 = bool1 | ((s)localObject).a(arrayOfInt);
    }
    if (bool2) {
      invalidate();
    }
  }
  
  protected a generateDefaultLayoutParams()
  {
    return new a(-1, -1);
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new a(getContext(), paramAttributeSet);
  }
  
  protected FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new a(paramLayoutParams);
  }
  
  public int getCollapsedTitleGravity()
  {
    return this.k.c();
  }
  
  public Typeface getCollapsedTitleTypeface()
  {
    return this.k.e();
  }
  
  public Drawable getContentScrim()
  {
    return this.n;
  }
  
  public int getExpandedTitleGravity()
  {
    return this.k.g();
  }
  
  public int getExpandedTitleMarginBottom()
  {
    return this.i;
  }
  
  public int getExpandedTitleMarginEnd()
  {
    return this.h;
  }
  
  public int getExpandedTitleMarginStart()
  {
    return this.f;
  }
  
  public int getExpandedTitleMarginTop()
  {
    return this.g;
  }
  
  public Typeface getExpandedTitleTypeface()
  {
    return this.k.h();
  }
  
  int getScrimAlpha()
  {
    return this.p;
  }
  
  public long getScrimAnimationDuration()
  {
    return this.s;
  }
  
  public int getScrimVisibleHeightTrigger()
  {
    int i1 = this.t;
    if (i1 >= 0) {
      return i1;
    }
    N localN = this.w;
    if (localN != null) {
      i1 = localN.e();
    } else {
      i1 = 0;
    }
    int i2 = android.support.v4.view.y.m(this);
    if (i2 > 0) {
      return Math.min(i2 * 2 + i1, getHeight());
    }
    return getHeight() / 3;
  }
  
  public Drawable getStatusBarScrim()
  {
    return this.o;
  }
  
  public CharSequence getTitle()
  {
    CharSequence localCharSequence;
    if (this.l) {
      localCharSequence = this.k.j();
    } else {
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if ((localViewParent instanceof AppBarLayout))
    {
      android.support.v4.view.y.a(this, android.support.v4.view.y.i((View)localViewParent));
      if (this.u == null) {
        this.u = new b();
      }
      ((AppBarLayout)localViewParent).a(this.u);
      android.support.v4.view.y.F(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    ViewParent localViewParent = getParent();
    AppBarLayout.c localc = this.u;
    if ((localc != null) && ((localViewParent instanceof AppBarLayout))) {
      ((AppBarLayout)localViewParent).b(localc);
    }
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = this.w;
    int i1 = 0;
    int i2;
    int i3;
    int i4;
    if (localObject != null)
    {
      i2 = ((N)localObject).e();
      i3 = getChildCount();
      for (i4 = 0; i4 < i3; i4++)
      {
        localObject = getChildAt(i4);
        if ((!android.support.v4.view.y.i((View)localObject)) && (((View)localObject).getTop() < i2)) {
          android.support.v4.view.y.b((View)localObject, i2);
        }
      }
    }
    if (this.l)
    {
      localObject = this.e;
      if (localObject != null)
      {
        paramBoolean = android.support.v4.view.y.A((View)localObject);
        i4 = 1;
        if ((paramBoolean) && (this.e.getVisibility() == 0)) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        this.m = paramBoolean;
        if (this.m)
        {
          if (android.support.v4.view.y.l(this) != 1) {
            i4 = 0;
          }
          localObject = this.d;
          if (localObject == null) {
            localObject = this.c;
          }
          int i5 = a((View)localObject);
          y.a(this, this.e, this.j);
          localObject = this.k;
          int i6 = this.j.left;
          if (i4 != 0) {
            i2 = this.c.getTitleMarginEnd();
          } else {
            i2 = this.c.getTitleMarginStart();
          }
          int i7 = this.j.top;
          int i8 = this.c.getTitleMarginTop();
          int i9 = this.j.right;
          if (i4 != 0) {
            i3 = this.c.getTitleMarginStart();
          } else {
            i3 = this.c.getTitleMarginEnd();
          }
          ((s)localObject).a(i6 + i2, i7 + i5 + i8, i9 + i3, this.j.bottom + i5 - this.c.getTitleMarginBottom());
          localObject = this.k;
          if (i4 != 0) {
            i2 = this.h;
          } else {
            i2 = this.f;
          }
          i3 = this.j.top;
          i5 = this.g;
          if (i4 != 0) {
            i4 = this.f;
          } else {
            i4 = this.h;
          }
          ((s)localObject).b(i2, i3 + i5, paramInt3 - paramInt1 - i4, paramInt4 - paramInt2 - this.i);
          this.k.m();
        }
      }
    }
    paramInt2 = getChildCount();
    for (paramInt1 = i1; paramInt1 < paramInt2; paramInt1++) {
      b(getChildAt(paramInt1)).c();
    }
    if (this.c != null)
    {
      if ((this.l) && (TextUtils.isEmpty(this.k.j()))) {
        setTitle(this.c.getTitle());
      }
      localObject = this.d;
      if ((localObject != null) && (localObject != this)) {
        setMinimumHeight(d((View)localObject));
      } else {
        setMinimumHeight(d(this.c));
      }
    }
    a();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    b();
    super.onMeasure(paramInt1, paramInt2);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    N localN = this.w;
    if (localN != null) {
      paramInt2 = localN.e();
    } else {
      paramInt2 = 0;
    }
    if ((i1 == 0) && (paramInt2 > 0)) {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + paramInt2, 1073741824));
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable = this.n;
    if (localDrawable != null) {
      localDrawable.setBounds(0, 0, paramInt1, paramInt2);
    }
  }
  
  public void setCollapsedTitleGravity(int paramInt)
  {
    this.k.b(paramInt);
  }
  
  public void setCollapsedTitleTextAppearance(int paramInt)
  {
    this.k.a(paramInt);
  }
  
  public void setCollapsedTitleTextColor(int paramInt)
  {
    setCollapsedTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setCollapsedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.k.a(paramColorStateList);
  }
  
  public void setCollapsedTitleTypeface(Typeface paramTypeface)
  {
    this.k.a(paramTypeface);
  }
  
  public void setContentScrim(Drawable paramDrawable)
  {
    Drawable localDrawable1 = this.n;
    if (localDrawable1 != paramDrawable)
    {
      Drawable localDrawable2 = null;
      if (localDrawable1 != null) {
        localDrawable1.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable2 = paramDrawable.mutate();
      }
      this.n = localDrawable2;
      paramDrawable = this.n;
      if (paramDrawable != null)
      {
        paramDrawable.setBounds(0, 0, getWidth(), getHeight());
        this.n.setCallback(this);
        this.n.setAlpha(this.p);
      }
      android.support.v4.view.y.E(this);
    }
  }
  
  public void setContentScrimColor(int paramInt)
  {
    setContentScrim(new ColorDrawable(paramInt));
  }
  
  public void setContentScrimResource(int paramInt)
  {
    setContentScrim(android.support.v4.content.c.c(getContext(), paramInt));
  }
  
  public void setExpandedTitleColor(int paramInt)
  {
    setExpandedTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setExpandedTitleGravity(int paramInt)
  {
    this.k.d(paramInt);
  }
  
  public void setExpandedTitleMarginBottom(int paramInt)
  {
    this.i = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginEnd(int paramInt)
  {
    this.h = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginStart(int paramInt)
  {
    this.f = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginTop(int paramInt)
  {
    this.g = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleTextAppearance(int paramInt)
  {
    this.k.c(paramInt);
  }
  
  public void setExpandedTitleTextColor(ColorStateList paramColorStateList)
  {
    this.k.b(paramColorStateList);
  }
  
  public void setExpandedTitleTypeface(Typeface paramTypeface)
  {
    this.k.b(paramTypeface);
  }
  
  void setScrimAlpha(int paramInt)
  {
    if (paramInt != this.p)
    {
      if (this.n != null)
      {
        Toolbar localToolbar = this.c;
        if (localToolbar != null) {
          android.support.v4.view.y.E(localToolbar);
        }
      }
      this.p = paramInt;
      android.support.v4.view.y.E(this);
    }
  }
  
  public void setScrimAnimationDuration(long paramLong)
  {
    this.s = paramLong;
  }
  
  public void setScrimVisibleHeightTrigger(int paramInt)
  {
    if (this.t != paramInt)
    {
      this.t = paramInt;
      a();
    }
  }
  
  public void setScrimsShown(boolean paramBoolean)
  {
    boolean bool;
    if ((android.support.v4.view.y.B(this)) && (!isInEditMode())) {
      bool = true;
    } else {
      bool = false;
    }
    a(paramBoolean, bool);
  }
  
  public void setStatusBarScrim(Drawable paramDrawable)
  {
    Drawable localDrawable1 = this.o;
    if (localDrawable1 != paramDrawable)
    {
      Drawable localDrawable2 = null;
      if (localDrawable1 != null) {
        localDrawable1.setCallback(null);
      }
      if (paramDrawable != null) {
        localDrawable2 = paramDrawable.mutate();
      }
      this.o = localDrawable2;
      paramDrawable = this.o;
      if (paramDrawable != null)
      {
        if (paramDrawable.isStateful()) {
          this.o.setState(getDrawableState());
        }
        a.a(this.o, android.support.v4.view.y.l(this));
        paramDrawable = this.o;
        boolean bool;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        }
        paramDrawable.setVisible(bool, false);
        this.o.setCallback(this);
        this.o.setAlpha(this.p);
      }
      android.support.v4.view.y.E(this);
    }
  }
  
  public void setStatusBarScrimColor(int paramInt)
  {
    setStatusBarScrim(new ColorDrawable(paramInt));
  }
  
  public void setStatusBarScrimResource(int paramInt)
  {
    setStatusBarScrim(android.support.v4.content.c.c(getContext(), paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.k.a(paramCharSequence);
    c();
  }
  
  public void setTitleEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.l)
    {
      this.l = paramBoolean;
      c();
      d();
      requestLayout();
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    boolean bool;
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    }
    Drawable localDrawable = this.o;
    if ((localDrawable != null) && (localDrawable.isVisible() != bool)) {
      this.o.setVisible(bool, false);
    }
    localDrawable = this.n;
    if ((localDrawable != null) && (localDrawable.isVisible() != bool)) {
      this.n.setVisible(bool, false);
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != this.n) && (paramDrawable != this.o)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static class a
    extends FrameLayout.LayoutParams
  {
    int a = 0;
    float b = 0.5F;
    
    public a(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public a(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, fa.CollapsingToolbarLayout_Layout);
      this.a = paramContext.getInt(fa.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
      a(paramContext.getFloat(fa.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
      paramContext.recycle();
    }
    
    public a(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public void a(float paramFloat)
    {
      this.b = paramFloat;
    }
  }
  
  private class b
    implements AppBarLayout.c
  {
    b() {}
    
    public void a(AppBarLayout paramAppBarLayout, int paramInt)
    {
      paramAppBarLayout = CollapsingToolbarLayout.this;
      paramAppBarLayout.v = paramInt;
      paramAppBarLayout = paramAppBarLayout.w;
      int i;
      if (paramAppBarLayout != null) {
        i = paramAppBarLayout.e();
      } else {
        i = 0;
      }
      int j = CollapsingToolbarLayout.this.getChildCount();
      for (int k = 0; k < j; k++)
      {
        View localView = CollapsingToolbarLayout.this.getChildAt(k);
        paramAppBarLayout = (CollapsingToolbarLayout.a)localView.getLayoutParams();
        ea localea = CollapsingToolbarLayout.b(localView);
        int m = paramAppBarLayout.a;
        if (m != 1)
        {
          if (m == 2) {
            localea.b(Math.round(-paramInt * paramAppBarLayout.b));
          }
        }
        else {
          localea.b(Gc.a(-paramInt, 0, CollapsingToolbarLayout.this.a(localView)));
        }
      }
      CollapsingToolbarLayout.this.a();
      paramAppBarLayout = CollapsingToolbarLayout.this;
      if ((paramAppBarLayout.o != null) && (i > 0)) {
        android.support.v4.view.y.E(paramAppBarLayout);
      }
      k = CollapsingToolbarLayout.this.getHeight();
      j = android.support.v4.view.y.m(CollapsingToolbarLayout.this);
      CollapsingToolbarLayout.this.k.b(Math.abs(paramInt) / (k - j - i));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/CollapsingToolbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */