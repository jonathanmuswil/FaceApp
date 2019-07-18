package android.support.design.widget;

import Da;
import Ea;
import Pd;
import Vd;
import Y;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.internal.c;
import android.support.design.internal.d;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.a;
import android.support.v4.view.ViewPager.e;
import android.support.v4.view.ViewPager.f;
import android.support.v4.view.i;
import android.support.v4.view.s;
import android.support.v4.view.t;
import android.support.v4.view.y;
import android.support.v4.widget.C;
import android.support.v7.app.a.c;
import android.support.v7.widget.xb;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import ca;
import ea;
import fa;
import ga;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import qd;
import rd;
import sd;

@ViewPager.a
public class TabLayout
  extends HorizontalScrollView
{
  private static final qd<f> a = new sd(16);
  int A;
  boolean B;
  boolean C;
  boolean D;
  private b E;
  private final ArrayList<b> F = new ArrayList();
  private b G;
  private ValueAnimator H;
  ViewPager I;
  private s J;
  private DataSetObserver K;
  private g L;
  private a M;
  private boolean N;
  private final qd<h> O = new rd(12);
  private final ArrayList<f> b = new ArrayList();
  private f c;
  private final RectF d = new RectF();
  private final e e;
  int f;
  int g;
  int h;
  int i;
  int j;
  ColorStateList k;
  ColorStateList l;
  ColorStateList m;
  Drawable n;
  PorterDuff.Mode o;
  float p;
  float q;
  final int r;
  int s = Integer.MAX_VALUE;
  private final int t;
  private final int u;
  private final int v;
  private int w;
  int x;
  int y;
  int z;
  
  public TabLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, W.tabStyle);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setHorizontalScrollBarEnabled(false);
    this.e = new e(paramContext);
    super.addView(this.e, 0, new FrameLayout.LayoutParams(-2, -1));
    TypedArray localTypedArray = c.a(paramContext, paramAttributeSet, fa.TabLayout, paramInt, ea.Widget_Design_TabLayout, new int[] { fa.TabLayout_tabTextAppearance });
    this.e.b(localTypedArray.getDimensionPixelSize(fa.TabLayout_tabIndicatorHeight, -1));
    this.e.a(localTypedArray.getColor(fa.TabLayout_tabIndicatorColor, 0));
    setSelectedTabIndicator(Da.b(paramContext, localTypedArray, fa.TabLayout_tabIndicator));
    setSelectedTabIndicatorGravity(localTypedArray.getInt(fa.TabLayout_tabIndicatorGravity, 0));
    setTabIndicatorFullWidth(localTypedArray.getBoolean(fa.TabLayout_tabIndicatorFullWidth, true));
    paramInt = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabPadding, 0);
    this.i = paramInt;
    this.h = paramInt;
    this.g = paramInt;
    this.f = paramInt;
    this.f = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabPaddingStart, this.f);
    this.g = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabPaddingTop, this.g);
    this.h = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabPaddingEnd, this.h);
    this.i = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabPaddingBottom, this.i);
    this.j = localTypedArray.getResourceId(fa.TabLayout_tabTextAppearance, ea.TextAppearance_Design_Tab);
    paramAttributeSet = paramContext.obtainStyledAttributes(this.j, Pd.TextAppearance);
    try
    {
      this.p = paramAttributeSet.getDimensionPixelSize(Pd.TextAppearance_android_textSize, 0);
      this.k = Da.a(paramContext, paramAttributeSet, Pd.TextAppearance_android_textColor);
      paramAttributeSet.recycle();
      if (localTypedArray.hasValue(fa.TabLayout_tabTextColor)) {
        this.k = Da.a(paramContext, localTypedArray, fa.TabLayout_tabTextColor);
      }
      if (localTypedArray.hasValue(fa.TabLayout_tabSelectedTextColor))
      {
        paramInt = localTypedArray.getColor(fa.TabLayout_tabSelectedTextColor, 0);
        this.k = a(this.k.getDefaultColor(), paramInt);
      }
      this.l = Da.a(paramContext, localTypedArray, fa.TabLayout_tabIconTint);
      this.o = d.a(localTypedArray.getInt(fa.TabLayout_tabIconTintMode, -1), null);
      this.m = Da.a(paramContext, localTypedArray, fa.TabLayout_tabRippleColor);
      this.y = localTypedArray.getInt(fa.TabLayout_tabIndicatorAnimationDuration, 300);
      this.t = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabMinWidth, -1);
      this.u = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabMaxWidth, -1);
      this.r = localTypedArray.getResourceId(fa.TabLayout_tabBackground, 0);
      this.w = localTypedArray.getDimensionPixelSize(fa.TabLayout_tabContentStart, 0);
      this.A = localTypedArray.getInt(fa.TabLayout_tabMode, 1);
      this.x = localTypedArray.getInt(fa.TabLayout_tabGravity, 0);
      this.B = localTypedArray.getBoolean(fa.TabLayout_tabInlineLabel, false);
      this.D = localTypedArray.getBoolean(fa.TabLayout_tabUnboundedRipple, false);
      localTypedArray.recycle();
      paramContext = getResources();
      this.q = paramContext.getDimensionPixelSize(Y.design_tab_text_size_2line);
      this.v = paramContext.getDimensionPixelSize(Y.design_tab_scrollable_min_width);
      e();
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  private int a(int paramInt, float paramFloat)
  {
    int i1 = this.A;
    int i2 = 0;
    if (i1 == 0)
    {
      View localView1 = this.e.getChildAt(paramInt);
      paramInt++;
      View localView2;
      if (paramInt < this.e.getChildCount()) {
        localView2 = this.e.getChildAt(paramInt);
      } else {
        localView2 = null;
      }
      if (localView1 != null) {
        paramInt = localView1.getWidth();
      } else {
        paramInt = 0;
      }
      if (localView2 != null) {
        i2 = localView2.getWidth();
      }
      i1 = localView1.getLeft() + paramInt / 2 - getWidth() / 2;
      paramInt = (int)((paramInt + i2) * 0.5F * paramFloat);
      if (y.l(this) == 0) {
        paramInt = i1 + paramInt;
      } else {
        paramInt = i1 - paramInt;
      }
      return paramInt;
    }
    return 0;
  }
  
  private static ColorStateList a(int paramInt1, int paramInt2)
  {
    return new ColorStateList(new int[][] { HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET }, new int[] { paramInt2, paramInt1 });
  }
  
  private void a(T paramT)
  {
    f localf = b();
    Object localObject = paramT.a;
    if (localObject != null) {
      localf.b((CharSequence)localObject);
    }
    localObject = paramT.b;
    if (localObject != null) {
      localf.a((Drawable)localObject);
    }
    int i1 = paramT.c;
    if (i1 != 0) {
      localf.a(i1);
    }
    if (!TextUtils.isEmpty(paramT.getContentDescription())) {
      localf.a(paramT.getContentDescription());
    }
    a(localf);
  }
  
  private void a(f paramf, int paramInt)
  {
    paramf.b(paramInt);
    this.b.add(paramInt, paramf);
    int i1 = this.b.size();
    for (;;)
    {
      paramInt++;
      if (paramInt >= i1) {
        break;
      }
      ((f)this.b.get(paramInt)).b(paramInt);
    }
  }
  
  private void a(ViewPager paramViewPager, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = this.I;
    if (localObject != null)
    {
      g localg = this.L;
      if (localg != null) {
        ((ViewPager)localObject).b(localg);
      }
      localObject = this.M;
      if (localObject != null) {
        this.I.b((ViewPager.e)localObject);
      }
    }
    localObject = this.G;
    if (localObject != null)
    {
      b((b)localObject);
      this.G = null;
    }
    if (paramViewPager != null)
    {
      this.I = paramViewPager;
      if (this.L == null) {
        this.L = new g(this);
      }
      this.L.a();
      paramViewPager.a(this.L);
      this.G = new i(paramViewPager);
      a(this.G);
      localObject = paramViewPager.getAdapter();
      if (localObject != null) {
        a((s)localObject, paramBoolean1);
      }
      if (this.M == null) {
        this.M = new a();
      }
      this.M.a(paramBoolean1);
      paramViewPager.a(this.M);
      a(paramViewPager.getCurrentItem(), 0.0F, true);
    }
    else
    {
      this.I = null;
      a(null, false);
    }
    this.N = paramBoolean2;
  }
  
  private void a(View paramView)
  {
    if ((paramView instanceof T))
    {
      a((T)paramView);
      return;
    }
    throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
  }
  
  private void a(LinearLayout.LayoutParams paramLayoutParams)
  {
    if ((this.A == 1) && (this.x == 0))
    {
      paramLayoutParams.width = 0;
      paramLayoutParams.weight = 1.0F;
    }
    else
    {
      paramLayoutParams.width = -2;
      paramLayoutParams.weight = 0.0F;
    }
  }
  
  private void c(int paramInt)
  {
    if (paramInt == -1) {
      return;
    }
    if ((getWindowToken() != null) && (y.B(this)) && (!this.e.a()))
    {
      int i1 = getScrollX();
      int i2 = a(paramInt, 0.0F);
      if (i1 != i2)
      {
        g();
        this.H.setIntValues(new int[] { i1, i2 });
        this.H.start();
      }
      this.e.a(paramInt, this.y);
      return;
    }
    a(paramInt, 0.0F, true);
  }
  
  private void d(int paramInt)
  {
    h localh = (h)this.e.getChildAt(paramInt);
    this.e.removeViewAt(paramInt);
    if (localh != null)
    {
      localh.a();
      this.O.a(localh);
    }
    requestLayout();
  }
  
  private void d(f paramf)
  {
    h localh = paramf.h;
    this.e.addView(localh, paramf.c(), f());
  }
  
  private h e(f paramf)
  {
    Object localObject1 = this.O;
    if (localObject1 != null) {
      localObject1 = (h)((qd)localObject1).a();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new h(getContext());
    }
    ((h)localObject2).a(paramf);
    ((LinearLayout)localObject2).setFocusable(true);
    ((LinearLayout)localObject2).setMinimumWidth(getTabMinWidth());
    if (TextUtils.isEmpty(f.a(paramf))) {
      ((LinearLayout)localObject2).setContentDescription(f.b(paramf));
    } else {
      ((LinearLayout)localObject2).setContentDescription(f.a(paramf));
    }
    return (h)localObject2;
  }
  
  private void e()
  {
    if (this.A == 0) {
      i1 = Math.max(0, this.w - this.f);
    } else {
      i1 = 0;
    }
    y.a(this.e, i1, 0, 0, 0);
    int i1 = this.A;
    if (i1 != 0)
    {
      if (i1 == 1) {
        this.e.setGravity(1);
      }
    }
    else {
      this.e.setGravity(8388611);
    }
    a(true);
  }
  
  private LinearLayout.LayoutParams f()
  {
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -1);
    a(localLayoutParams);
    return localLayoutParams;
  }
  
  private void f(f paramf)
  {
    for (int i1 = this.F.size() - 1; i1 >= 0; i1--) {
      ((b)this.F.get(i1)).a(paramf);
    }
  }
  
  private void g()
  {
    if (this.H == null)
    {
      this.H = new ValueAnimator();
      this.H.setInterpolator(ga.b);
      this.H.setDuration(this.y);
      this.H.addUpdateListener(new U(this));
    }
  }
  
  private void g(f paramf)
  {
    for (int i1 = this.F.size() - 1; i1 >= 0; i1--) {
      ((b)this.F.get(i1)).c(paramf);
    }
  }
  
  private int getDefaultHeight()
  {
    int i1 = this.b.size();
    int i2 = 0;
    int i4;
    for (int i3 = 0;; i3++)
    {
      i4 = i2;
      if (i3 >= i1) {
        break;
      }
      f localf = (f)this.b.get(i3);
      if ((localf != null) && (localf.b() != null) && (!TextUtils.isEmpty(localf.d())))
      {
        i4 = 1;
        break;
      }
    }
    if ((i4 != 0) && (!this.B)) {
      i3 = 72;
    } else {
      i3 = 48;
    }
    return i3;
  }
  
  private int getTabMinWidth()
  {
    int i1 = this.t;
    if (i1 != -1) {
      return i1;
    }
    if (this.A == 0) {
      i1 = this.v;
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  private int getTabScrollRange()
  {
    return Math.max(0, this.e.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
  }
  
  private void h()
  {
    int i1 = this.b.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((f)this.b.get(i2)).h();
    }
  }
  
  private void h(f paramf)
  {
    for (int i1 = this.F.size() - 1; i1 >= 0; i1--) {
      ((b)this.F.get(i1)).b(paramf);
    }
  }
  
  private void setSelectedTabView(int paramInt)
  {
    int i1 = this.e.getChildCount();
    if (paramInt < i1) {
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = this.e.getChildAt(i2);
        boolean bool1 = true;
        boolean bool2;
        if (i2 == paramInt) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        localView.setSelected(bool2);
        if (i2 == paramInt) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        localView.setActivated(bool2);
      }
    }
  }
  
  int a(int paramInt)
  {
    return Math.round(getResources().getDisplayMetrics().density * paramInt);
  }
  
  protected f a()
  {
    f localf1 = (f)a.a();
    f localf2 = localf1;
    if (localf1 == null) {
      localf2 = new f();
    }
    return localf2;
  }
  
  public void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    a(paramInt, paramFloat, paramBoolean, true);
  }
  
  void a(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = Math.round(paramInt + paramFloat);
    if ((i1 >= 0) && (i1 < this.e.getChildCount()))
    {
      if (paramBoolean2) {
        this.e.a(paramInt, paramFloat);
      }
      ValueAnimator localValueAnimator = this.H;
      if ((localValueAnimator != null) && (localValueAnimator.isRunning())) {
        this.H.cancel();
      }
      scrollTo(a(paramInt, paramFloat), 0);
      if (paramBoolean1) {
        setSelectedTabView(i1);
      }
    }
  }
  
  public void a(b paramb)
  {
    if (!this.F.contains(paramb)) {
      this.F.add(paramb);
    }
  }
  
  public void a(f paramf)
  {
    a(paramf, this.b.isEmpty());
  }
  
  public void a(f paramf, int paramInt, boolean paramBoolean)
  {
    if (paramf.g == this)
    {
      a(paramf, paramInt);
      d(paramf);
      if (paramBoolean) {
        paramf.g();
      }
      return;
    }
    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
  }
  
  public void a(f paramf, boolean paramBoolean)
  {
    a(paramf, this.b.size(), paramBoolean);
  }
  
  public void a(ViewPager paramViewPager, boolean paramBoolean)
  {
    a(paramViewPager, paramBoolean, false);
  }
  
  void a(s params, boolean paramBoolean)
  {
    s locals = this.J;
    if (locals != null)
    {
      DataSetObserver localDataSetObserver = this.K;
      if (localDataSetObserver != null) {
        locals.c(localDataSetObserver);
      }
    }
    this.J = params;
    if ((paramBoolean) && (params != null))
    {
      if (this.K == null) {
        this.K = new d();
      }
      params.a(this.K);
    }
    c();
  }
  
  void a(boolean paramBoolean)
  {
    for (int i1 = 0; i1 < this.e.getChildCount(); i1++)
    {
      View localView = this.e.getChildAt(i1);
      localView.setMinimumWidth(getTabMinWidth());
      a((LinearLayout.LayoutParams)localView.getLayoutParams());
      if (paramBoolean) {
        localView.requestLayout();
      }
    }
  }
  
  public void addView(View paramView)
  {
    a(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    a(paramView);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    a(paramView);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    a(paramView);
  }
  
  public f b()
  {
    f localf = a();
    localf.g = this;
    localf.h = e(localf);
    return localf;
  }
  
  public f b(int paramInt)
  {
    f localf;
    if ((paramInt >= 0) && (paramInt < getTabCount())) {
      localf = (f)this.b.get(paramInt);
    } else {
      localf = null;
    }
    return localf;
  }
  
  public void b(b paramb)
  {
    this.F.remove(paramb);
  }
  
  void b(f paramf, boolean paramBoolean)
  {
    f localf = this.c;
    if (localf == paramf)
    {
      if (localf != null)
      {
        f(paramf);
        c(paramf.c());
      }
    }
    else
    {
      int i1;
      if (paramf != null) {
        i1 = paramf.c();
      } else {
        i1 = -1;
      }
      if (paramBoolean)
      {
        if (((localf == null) || (localf.c() == -1)) && (i1 != -1)) {
          a(i1, 0.0F, true);
        } else {
          c(i1);
        }
        if (i1 != -1) {
          setSelectedTabView(i1);
        }
      }
      this.c = paramf;
      if (localf != null) {
        h(localf);
      }
      if (paramf != null) {
        g(paramf);
      }
    }
  }
  
  protected boolean b(f paramf)
  {
    return a.a(paramf);
  }
  
  void c()
  {
    d();
    Object localObject = this.J;
    if (localObject != null)
    {
      int i1 = ((s)localObject).a();
      for (int i2 = 0; i2 < i1; i2++)
      {
        localObject = b();
        ((f)localObject).b(this.J.a(i2));
        a((f)localObject, false);
      }
      localObject = this.I;
      if ((localObject != null) && (i1 > 0))
      {
        i2 = ((ViewPager)localObject).getCurrentItem();
        if ((i2 != getSelectedTabPosition()) && (i2 < getTabCount())) {
          c(b(i2));
        }
      }
    }
  }
  
  void c(f paramf)
  {
    b(paramf, true);
  }
  
  public void d()
  {
    for (int i1 = this.e.getChildCount() - 1; i1 >= 0; i1--) {
      d(i1);
    }
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      localIterator.remove();
      localf.f();
      b(localf);
    }
    this.c = null;
  }
  
  public FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return generateDefaultLayoutParams();
  }
  
  public int getSelectedTabPosition()
  {
    f localf = this.c;
    int i1;
    if (localf != null) {
      i1 = localf.c();
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public int getTabCount()
  {
    return this.b.size();
  }
  
  public int getTabGravity()
  {
    return this.x;
  }
  
  public ColorStateList getTabIconTint()
  {
    return this.l;
  }
  
  public int getTabIndicatorGravity()
  {
    return this.z;
  }
  
  int getTabMaxWidth()
  {
    return this.s;
  }
  
  public int getTabMode()
  {
    return this.A;
  }
  
  public ColorStateList getTabRippleColor()
  {
    return this.m;
  }
  
  public Drawable getTabSelectedIndicator()
  {
    return this.n;
  }
  
  public ColorStateList getTabTextColors()
  {
    return this.k;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.I == null)
    {
      ViewParent localViewParent = getParent();
      if ((localViewParent instanceof ViewPager)) {
        a((ViewPager)localViewParent, true, true);
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.N)
    {
      setupWithViewPager(null);
      this.N = false;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    for (int i1 = 0; i1 < this.e.getChildCount(); i1++)
    {
      View localView = this.e.getChildAt(i1);
      if ((localView instanceof h)) {
        h.a((h)localView, paramCanvas);
      }
    }
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = a(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
    int i2 = View.MeasureSpec.getMode(paramInt2);
    if (i2 != Integer.MIN_VALUE)
    {
      if (i2 == 0) {
        paramInt2 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);
      }
    }
    else {
      paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.min(i1, View.MeasureSpec.getSize(paramInt2)), 1073741824);
    }
    i2 = View.MeasureSpec.getSize(paramInt1);
    if (View.MeasureSpec.getMode(paramInt1) != 0)
    {
      i1 = this.u;
      if (i1 <= 0) {
        i1 = i2 - a(56);
      }
      this.s = i1;
    }
    super.onMeasure(paramInt1, paramInt2);
    if (getChildCount() == 1)
    {
      paramInt1 = 0;
      View localView = getChildAt(0);
      i1 = this.A;
      if (i1 != 0)
      {
        if ((i1 != 1) || (localView.getMeasuredWidth() == getMeasuredWidth())) {}
      }
      else {
        while (localView.getMeasuredWidth() < getMeasuredWidth())
        {
          paramInt1 = 1;
          break;
        }
      }
      if (paramInt1 != 0)
      {
        paramInt1 = HorizontalScrollView.getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom(), localView.getLayoutParams().height);
        localView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), paramInt1);
      }
    }
  }
  
  public void setInlineLabel(boolean paramBoolean)
  {
    if (this.B != paramBoolean)
    {
      this.B = paramBoolean;
      for (int i1 = 0; i1 < this.e.getChildCount(); i1++)
      {
        View localView = this.e.getChildAt(i1);
        if ((localView instanceof h)) {
          ((h)localView).c();
        }
      }
      e();
    }
  }
  
  public void setInlineLabelResource(int paramInt)
  {
    setInlineLabel(getResources().getBoolean(paramInt));
  }
  
  @Deprecated
  public void setOnTabSelectedListener(b paramb)
  {
    b localb = this.E;
    if (localb != null) {
      b(localb);
    }
    this.E = paramb;
    if (paramb != null) {
      a(paramb);
    }
  }
  
  void setScrollAnimatorListener(Animator.AnimatorListener paramAnimatorListener)
  {
    g();
    this.H.addListener(paramAnimatorListener);
  }
  
  public void setSelectedTabIndicator(int paramInt)
  {
    if (paramInt != 0) {
      setSelectedTabIndicator(Vd.b(getContext(), paramInt));
    } else {
      setSelectedTabIndicator(null);
    }
  }
  
  public void setSelectedTabIndicator(Drawable paramDrawable)
  {
    if (this.n != paramDrawable)
    {
      this.n = paramDrawable;
      y.E(this.e);
    }
  }
  
  public void setSelectedTabIndicatorColor(int paramInt)
  {
    this.e.a(paramInt);
  }
  
  public void setSelectedTabIndicatorGravity(int paramInt)
  {
    if (this.z != paramInt)
    {
      this.z = paramInt;
      y.E(this.e);
    }
  }
  
  @Deprecated
  public void setSelectedTabIndicatorHeight(int paramInt)
  {
    this.e.b(paramInt);
  }
  
  public void setTabGravity(int paramInt)
  {
    if (this.x != paramInt)
    {
      this.x = paramInt;
      e();
    }
  }
  
  public void setTabIconTint(ColorStateList paramColorStateList)
  {
    if (this.l != paramColorStateList)
    {
      this.l = paramColorStateList;
      h();
    }
  }
  
  public void setTabIconTintResource(int paramInt)
  {
    setTabIconTint(Vd.a(getContext(), paramInt));
  }
  
  public void setTabIndicatorFullWidth(boolean paramBoolean)
  {
    this.C = paramBoolean;
    y.E(this.e);
  }
  
  public void setTabMode(int paramInt)
  {
    if (paramInt != this.A)
    {
      this.A = paramInt;
      e();
    }
  }
  
  public void setTabRippleColor(ColorStateList paramColorStateList)
  {
    if (this.m != paramColorStateList)
    {
      this.m = paramColorStateList;
      for (int i1 = 0; i1 < this.e.getChildCount(); i1++)
      {
        paramColorStateList = this.e.getChildAt(i1);
        if ((paramColorStateList instanceof h)) {
          h.a((h)paramColorStateList, getContext());
        }
      }
    }
  }
  
  public void setTabRippleColorResource(int paramInt)
  {
    setTabRippleColor(Vd.a(getContext(), paramInt));
  }
  
  public void setTabTextColors(ColorStateList paramColorStateList)
  {
    if (this.k != paramColorStateList)
    {
      this.k = paramColorStateList;
      h();
    }
  }
  
  @Deprecated
  public void setTabsFromPagerAdapter(s params)
  {
    a(params, false);
  }
  
  public void setUnboundedRipple(boolean paramBoolean)
  {
    if (this.D != paramBoolean)
    {
      this.D = paramBoolean;
      for (int i1 = 0; i1 < this.e.getChildCount(); i1++)
      {
        View localView = this.e.getChildAt(i1);
        if ((localView instanceof h)) {
          h.a((h)localView, getContext());
        }
      }
    }
  }
  
  public void setUnboundedRippleResource(int paramInt)
  {
    setUnboundedRipple(getResources().getBoolean(paramInt));
  }
  
  public void setupWithViewPager(ViewPager paramViewPager)
  {
    a(paramViewPager, true);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    boolean bool;
    if (getTabScrollRange() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private class a
    implements ViewPager.e
  {
    private boolean a;
    
    a() {}
    
    public void a(ViewPager paramViewPager, s params1, s params2)
    {
      params1 = TabLayout.this;
      if (params1.I == paramViewPager) {
        params1.a(params2, this.a);
      }
    }
    
    void a(boolean paramBoolean)
    {
      this.a = paramBoolean;
    }
  }
  
  public static abstract interface b<T extends TabLayout.f>
  {
    public abstract void a(T paramT);
    
    public abstract void b(T paramT);
    
    public abstract void c(T paramT);
  }
  
  public static abstract interface c
    extends TabLayout.b<TabLayout.f>
  {}
  
  private class d
    extends DataSetObserver
  {
    d() {}
    
    public void onChanged()
    {
      TabLayout.this.c();
    }
    
    public void onInvalidated()
    {
      TabLayout.this.c();
    }
  }
  
  private class e
    extends LinearLayout
  {
    private int a;
    private final Paint b;
    private final GradientDrawable c;
    int d = -1;
    float e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private ValueAnimator i;
    
    e(Context paramContext)
    {
      super();
      setWillNotDraw(false);
      this.b = new Paint();
      this.c = new GradientDrawable();
    }
    
    private void a(TabLayout.h paramh, RectF paramRectF)
    {
      int k = TabLayout.h.a(paramh);
      int m = k;
      if (k < TabLayout.this.a(24)) {
        m = TabLayout.this.a(24);
      }
      k = (paramh.getLeft() + paramh.getRight()) / 2;
      m /= 2;
      paramRectF.set(k - m, 0.0F, k + m, 0.0F);
    }
    
    private void b()
    {
      View localView = getChildAt(this.d);
      int k;
      int m;
      if ((localView != null) && (localView.getWidth() > 0))
      {
        k = localView.getLeft();
        m = localView.getRight();
        TabLayout localTabLayout = TabLayout.this;
        int n = k;
        int i1 = m;
        if (!localTabLayout.C)
        {
          n = k;
          i1 = m;
          if ((localView instanceof TabLayout.h))
          {
            a((TabLayout.h)localView, TabLayout.a(localTabLayout));
            n = (int)TabLayout.a(TabLayout.this).left;
            i1 = (int)TabLayout.a(TabLayout.this).right;
          }
        }
        k = n;
        m = i1;
        if (this.e > 0.0F)
        {
          k = n;
          m = i1;
          if (this.d < getChildCount() - 1)
          {
            localView = getChildAt(this.d + 1);
            int i2 = localView.getLeft();
            int i3 = localView.getRight();
            localTabLayout = TabLayout.this;
            m = i2;
            k = i3;
            if (!localTabLayout.C)
            {
              m = i2;
              k = i3;
              if ((localView instanceof TabLayout.h))
              {
                a((TabLayout.h)localView, TabLayout.a(localTabLayout));
                m = (int)TabLayout.a(TabLayout.this).left;
                k = (int)TabLayout.a(TabLayout.this).right;
              }
            }
            float f1 = this.e;
            n = (int)(m * f1 + (1.0F - f1) * n);
            m = (int)(k * f1 + (1.0F - f1) * i1);
            k = n;
          }
        }
      }
      else
      {
        k = -1;
        m = -1;
      }
      b(k, m);
    }
    
    void a(int paramInt)
    {
      if (this.b.getColor() != paramInt)
      {
        this.b.setColor(paramInt);
        y.E(this);
      }
    }
    
    void a(int paramInt, float paramFloat)
    {
      ValueAnimator localValueAnimator = this.i;
      if ((localValueAnimator != null) && (localValueAnimator.isRunning())) {
        this.i.cancel();
      }
      this.d = paramInt;
      this.e = paramFloat;
      b();
    }
    
    void a(int paramInt1, int paramInt2)
    {
      Object localObject = this.i;
      if ((localObject != null) && (((ValueAnimator)localObject).isRunning())) {
        this.i.cancel();
      }
      View localView = getChildAt(paramInt1);
      if (localView == null)
      {
        b();
        return;
      }
      int k = localView.getLeft();
      int m = localView.getRight();
      localObject = TabLayout.this;
      int n = k;
      int i1 = m;
      if (!((TabLayout)localObject).C)
      {
        n = k;
        i1 = m;
        if ((localView instanceof TabLayout.h))
        {
          a((TabLayout.h)localView, TabLayout.a((TabLayout)localObject));
          n = (int)TabLayout.a(TabLayout.this).left;
          i1 = (int)TabLayout.a(TabLayout.this).right;
        }
      }
      m = this.g;
      k = this.h;
      if ((m != n) || (k != i1))
      {
        localObject = new ValueAnimator();
        this.i = ((ValueAnimator)localObject);
        ((ValueAnimator)localObject).setInterpolator(ga.b);
        ((ValueAnimator)localObject).setDuration(paramInt2);
        ((ValueAnimator)localObject).setFloatValues(new float[] { 0.0F, 1.0F });
        ((ValueAnimator)localObject).addUpdateListener(new V(this, m, n, k, i1));
        ((ValueAnimator)localObject).addListener(new W(this, paramInt1));
        ((ValueAnimator)localObject).start();
      }
    }
    
    boolean a()
    {
      int k = getChildCount();
      for (int m = 0; m < k; m++) {
        if (getChildAt(m).getWidth() <= 0) {
          return true;
        }
      }
      return false;
    }
    
    void b(int paramInt)
    {
      if (this.a != paramInt)
      {
        this.a = paramInt;
        y.E(this);
      }
    }
    
    void b(int paramInt1, int paramInt2)
    {
      if ((paramInt1 != this.g) || (paramInt2 != this.h))
      {
        this.g = paramInt1;
        this.h = paramInt2;
        y.E(this);
      }
    }
    
    public void draw(Canvas paramCanvas)
    {
      Object localObject = TabLayout.this.n;
      int k = 0;
      int m;
      if (localObject != null) {
        m = ((Drawable)localObject).getIntrinsicHeight();
      } else {
        m = 0;
      }
      int n = this.a;
      if (n >= 0) {
        m = n;
      }
      int i1 = TabLayout.this.z;
      if (i1 != 0)
      {
        if (i1 != 1)
        {
          n = k;
          if (i1 != 2) {
            if (i1 != 3)
            {
              m = 0;
              n = k;
            }
            else
            {
              m = getHeight();
              n = k;
            }
          }
        }
        else
        {
          n = (getHeight() - m) / 2;
          m = (getHeight() + m) / 2;
        }
      }
      else
      {
        n = getHeight() - m;
        m = getHeight();
      }
      k = this.g;
      if ((k >= 0) && (this.h > k))
      {
        localObject = TabLayout.this.n;
        if (localObject == null) {
          localObject = this.c;
        }
        Drawable localDrawable = a.i((Drawable)localObject);
        localDrawable.setBounds(this.g, n, this.h, m);
        localObject = this.b;
        if (localObject != null) {
          if (Build.VERSION.SDK_INT == 21) {
            localDrawable.setColorFilter(((Paint)localObject).getColor(), PorterDuff.Mode.SRC_IN);
          } else {
            a.b(localDrawable, ((Paint)localObject).getColor());
          }
        }
        localDrawable.draw(paramCanvas);
      }
      super.draw(paramCanvas);
    }
    
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      ValueAnimator localValueAnimator = this.i;
      if ((localValueAnimator != null) && (localValueAnimator.isRunning()))
      {
        this.i.cancel();
        long l = this.i.getDuration();
        a(this.d, Math.round((1.0F - this.i.getAnimatedFraction()) * (float)l));
      }
      else
      {
        b();
      }
    }
    
    protected void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
        return;
      }
      Object localObject = TabLayout.this;
      int k = ((TabLayout)localObject).A;
      int m = 1;
      if ((k == 1) && (((TabLayout)localObject).x == 1))
      {
        int n = getChildCount();
        int i1 = 0;
        k = 0;
        int i3;
        for (int i2 = 0; k < n; i2 = i3)
        {
          localObject = getChildAt(k);
          i3 = i2;
          if (((View)localObject).getVisibility() == 0) {
            i3 = Math.max(i2, ((View)localObject).getMeasuredWidth());
          }
          k++;
        }
        if (i2 <= 0) {
          return;
        }
        k = TabLayout.this.a(16);
        if (i2 * n <= getMeasuredWidth() - k * 2)
        {
          k = 0;
          for (i3 = i1; i3 < n; i3++)
          {
            localObject = (LinearLayout.LayoutParams)getChildAt(i3).getLayoutParams();
            if ((((LinearLayout.LayoutParams)localObject).width != i2) || (((LinearLayout.LayoutParams)localObject).weight != 0.0F))
            {
              ((LinearLayout.LayoutParams)localObject).width = i2;
              ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
              k = 1;
            }
          }
        }
        else
        {
          localObject = TabLayout.this;
          ((TabLayout)localObject).x = 0;
          ((TabLayout)localObject).a(false);
          k = m;
        }
        if (k != 0) {
          super.onMeasure(paramInt1, paramInt2);
        }
      }
    }
    
    public void onRtlPropertiesChanged(int paramInt)
    {
      super.onRtlPropertiesChanged(paramInt);
      if ((Build.VERSION.SDK_INT < 23) && (this.f != paramInt))
      {
        requestLayout();
        this.f = paramInt;
      }
    }
  }
  
  public static class f
  {
    private Object a;
    private Drawable b;
    private CharSequence c;
    private CharSequence d;
    private int e = -1;
    private View f;
    public TabLayout g;
    public TabLayout.h h;
    
    public f a(int paramInt)
    {
      a(LayoutInflater.from(this.h.getContext()).inflate(paramInt, this.h, false));
      return this;
    }
    
    public f a(Drawable paramDrawable)
    {
      this.b = paramDrawable;
      h();
      return this;
    }
    
    public f a(View paramView)
    {
      this.f = paramView;
      h();
      return this;
    }
    
    public f a(CharSequence paramCharSequence)
    {
      this.d = paramCharSequence;
      h();
      return this;
    }
    
    public View a()
    {
      return this.f;
    }
    
    public Drawable b()
    {
      return this.b;
    }
    
    public f b(CharSequence paramCharSequence)
    {
      if ((TextUtils.isEmpty(this.d)) && (!TextUtils.isEmpty(paramCharSequence))) {
        this.h.setContentDescription(paramCharSequence);
      }
      this.c = paramCharSequence;
      h();
      return this;
    }
    
    void b(int paramInt)
    {
      this.e = paramInt;
    }
    
    public int c()
    {
      return this.e;
    }
    
    public CharSequence d()
    {
      return this.c;
    }
    
    public boolean e()
    {
      TabLayout localTabLayout = this.g;
      if (localTabLayout != null)
      {
        boolean bool;
        if (localTabLayout.getSelectedTabPosition() == this.e) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
    
    void f()
    {
      this.g = null;
      this.h = null;
      this.a = null;
      this.b = null;
      this.c = null;
      this.d = null;
      this.e = -1;
      this.f = null;
    }
    
    public void g()
    {
      TabLayout localTabLayout = this.g;
      if (localTabLayout != null)
      {
        localTabLayout.c(this);
        return;
      }
      throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
    
    void h()
    {
      TabLayout.h localh = this.h;
      if (localh != null) {
        localh.b();
      }
    }
  }
  
  public static class g
    implements ViewPager.f
  {
    private final WeakReference<TabLayout> a;
    private int b;
    private int c;
    
    public g(TabLayout paramTabLayout)
    {
      this.a = new WeakReference(paramTabLayout);
    }
    
    void a()
    {
      this.c = 0;
      this.b = 0;
    }
    
    public void a(int paramInt)
    {
      this.b = this.c;
      this.c = paramInt;
    }
    
    public void a(int paramInt1, float paramFloat, int paramInt2)
    {
      TabLayout localTabLayout = (TabLayout)this.a.get();
      if (localTabLayout != null)
      {
        paramInt2 = this.c;
        boolean bool1 = false;
        boolean bool2;
        if ((paramInt2 == 2) && (this.b != 1)) {
          bool2 = false;
        } else {
          bool2 = true;
        }
        if ((this.c != 2) || (this.b != 0)) {
          bool1 = true;
        }
        localTabLayout.a(paramInt1, paramFloat, bool2, bool1);
      }
    }
    
    public void b(int paramInt)
    {
      TabLayout localTabLayout = (TabLayout)this.a.get();
      if ((localTabLayout != null) && (localTabLayout.getSelectedTabPosition() != paramInt) && (paramInt < localTabLayout.getTabCount()))
      {
        int i = this.c;
        boolean bool;
        if ((i != 0) && ((i != 2) || (this.b != 0))) {
          bool = false;
        } else {
          bool = true;
        }
        localTabLayout.b(localTabLayout.b(paramInt), bool);
      }
    }
  }
  
  class h
    extends LinearLayout
  {
    private TabLayout.f a;
    private TextView b;
    private ImageView c;
    private View d;
    private TextView e;
    private ImageView f;
    private Drawable g;
    private int h = 2;
    
    public h(Context paramContext)
    {
      super();
      a(paramContext);
      y.a(this, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h, TabLayout.this.i);
      setGravity(17);
      setOrientation(TabLayout.this.B ^ true);
      setClickable(true);
      y.a(this, t.a(getContext(), 1002));
    }
    
    private float a(Layout paramLayout, int paramInt, float paramFloat)
    {
      return paramLayout.getLineWidth(paramInt) * (paramFloat / paramLayout.getPaint().getTextSize());
    }
    
    private void a(Context paramContext)
    {
      int j = TabLayout.this.r;
      Object localObject = null;
      if (j != 0)
      {
        this.g = Vd.b(paramContext, j);
        paramContext = this.g;
        if ((paramContext != null) && (paramContext.isStateful())) {
          this.g.setState(getDrawableState());
        }
      }
      else
      {
        this.g = null;
      }
      GradientDrawable localGradientDrawable = new GradientDrawable();
      localGradientDrawable.setColor(0);
      paramContext = localGradientDrawable;
      if (TabLayout.this.m != null)
      {
        paramContext = new GradientDrawable();
        paramContext.setCornerRadius(1.0E-5F);
        paramContext.setColor(-1);
        ColorStateList localColorStateList = Ea.a(TabLayout.this.m);
        if (Build.VERSION.SDK_INT >= 21)
        {
          if (TabLayout.this.D) {
            localGradientDrawable = null;
          }
          if (TabLayout.this.D) {
            paramContext = (Context)localObject;
          }
          paramContext = new RippleDrawable(localColorStateList, localGradientDrawable, paramContext);
        }
        else
        {
          paramContext = a.i(paramContext);
          a.a(paramContext, localColorStateList);
          paramContext = new LayerDrawable(new Drawable[] { localGradientDrawable, paramContext });
        }
      }
      y.a(this, paramContext);
      TabLayout.this.invalidate();
    }
    
    private void a(Canvas paramCanvas)
    {
      Drawable localDrawable = this.g;
      if (localDrawable != null)
      {
        localDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
        this.g.draw(paramCanvas);
      }
    }
    
    private void a(TextView paramTextView, ImageView paramImageView)
    {
      Object localObject1 = this.a;
      if ((localObject1 != null) && (((TabLayout.f)localObject1).b() != null)) {
        localObject1 = a.i(this.a.b()).mutate();
      } else {
        localObject1 = null;
      }
      Object localObject2 = this.a;
      if (localObject2 != null) {
        localObject2 = ((TabLayout.f)localObject2).d();
      } else {
        localObject2 = null;
      }
      if (paramImageView != null) {
        if (localObject1 != null)
        {
          paramImageView.setImageDrawable((Drawable)localObject1);
          paramImageView.setVisibility(0);
          setVisibility(0);
        }
        else
        {
          paramImageView.setVisibility(8);
          paramImageView.setImageDrawable(null);
        }
      }
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2) ^ true;
      if (paramTextView != null) {
        if (bool)
        {
          paramTextView.setText((CharSequence)localObject2);
          paramTextView.setVisibility(0);
          setVisibility(0);
        }
        else
        {
          paramTextView.setVisibility(8);
          paramTextView.setText(null);
        }
      }
      if (paramImageView != null)
      {
        paramTextView = (ViewGroup.MarginLayoutParams)paramImageView.getLayoutParams();
        int j;
        if ((bool) && (paramImageView.getVisibility() == 0)) {
          j = TabLayout.this.a(8);
        } else {
          j = 0;
        }
        if (TabLayout.this.B)
        {
          if (j != i.a(paramTextView))
          {
            i.a(paramTextView, j);
            paramTextView.bottomMargin = 0;
            paramImageView.setLayoutParams(paramTextView);
            paramImageView.requestLayout();
          }
        }
        else if (j != paramTextView.bottomMargin)
        {
          paramTextView.bottomMargin = j;
          i.a(paramTextView, 0);
          paramImageView.setLayoutParams(paramTextView);
          paramImageView.requestLayout();
        }
      }
      paramTextView = this.a;
      if (paramTextView != null) {
        paramTextView = TabLayout.f.a(paramTextView);
      } else {
        paramTextView = null;
      }
      if (bool) {
        paramTextView = null;
      }
      xb.a(this, paramTextView);
    }
    
    private int d()
    {
      View[] arrayOfView = new View[3];
      Object localObject = this.b;
      int j = 0;
      arrayOfView[0] = localObject;
      arrayOfView[1] = this.c;
      arrayOfView[2] = this.d;
      int k = arrayOfView.length;
      int m = 0;
      int n = 0;
      int i4;
      for (int i1 = 0; j < k; i1 = i4)
      {
        localObject = arrayOfView[j];
        int i2 = m;
        int i3 = n;
        i4 = i1;
        if (localObject != null)
        {
          i2 = m;
          i3 = n;
          i4 = i1;
          if (((View)localObject).getVisibility() == 0)
          {
            if (i1 != 0) {
              n = Math.min(n, ((View)localObject).getLeft());
            } else {
              n = ((View)localObject).getLeft();
            }
            if (i1 != 0) {
              i1 = Math.max(m, ((View)localObject).getRight());
            } else {
              i1 = ((View)localObject).getRight();
            }
            i4 = 1;
            i3 = n;
            i2 = i1;
          }
        }
        j++;
        m = i2;
        n = i3;
      }
      return m - n;
    }
    
    void a()
    {
      a(null);
      setSelected(false);
    }
    
    void a(TabLayout.f paramf)
    {
      if (paramf != this.a)
      {
        this.a = paramf;
        b();
      }
    }
    
    final void b()
    {
      TabLayout.f localf = this.a;
      PorterDuff.Mode localMode = null;
      if (localf != null) {
        localObject1 = localf.a();
      } else {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        Object localObject2 = ((View)localObject1).getParent();
        if (localObject2 != this)
        {
          if (localObject2 != null) {
            ((ViewGroup)localObject2).removeView((View)localObject1);
          }
          addView((View)localObject1);
        }
        this.d = ((View)localObject1);
        localObject2 = this.b;
        if (localObject2 != null) {
          ((TextView)localObject2).setVisibility(8);
        }
        localObject2 = this.c;
        if (localObject2 != null)
        {
          ((ImageView)localObject2).setVisibility(8);
          this.c.setImageDrawable(null);
        }
        this.e = ((TextView)((View)localObject1).findViewById(16908308));
        localObject2 = this.e;
        if (localObject2 != null) {
          this.h = C.g((TextView)localObject2);
        }
        this.f = ((ImageView)((View)localObject1).findViewById(16908294));
      }
      else
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          removeView((View)localObject1);
          this.d = null;
        }
        this.e = null;
        this.f = null;
      }
      Object localObject1 = this.d;
      boolean bool1 = false;
      if (localObject1 == null)
      {
        if (this.c == null)
        {
          localObject1 = (ImageView)LayoutInflater.from(getContext()).inflate(ca.design_layout_tab_icon, this, false);
          addView((View)localObject1, 0);
          this.c = ((ImageView)localObject1);
        }
        localObject1 = localMode;
        if (localf != null)
        {
          localObject1 = localMode;
          if (localf.b() != null) {
            localObject1 = a.i(localf.b()).mutate();
          }
        }
        if (localObject1 != null)
        {
          a.a((Drawable)localObject1, TabLayout.this.l);
          localMode = TabLayout.this.o;
          if (localMode != null) {
            a.a((Drawable)localObject1, localMode);
          }
        }
        if (this.b == null)
        {
          localObject1 = (TextView)LayoutInflater.from(getContext()).inflate(ca.design_layout_tab_text, this, false);
          addView((View)localObject1);
          this.b = ((TextView)localObject1);
          this.h = C.g(this.b);
        }
        C.d(this.b, TabLayout.this.j);
        localObject1 = TabLayout.this.k;
        if (localObject1 != null) {
          this.b.setTextColor((ColorStateList)localObject1);
        }
        a(this.b, this.c);
      }
      else if ((this.e != null) || (this.f != null))
      {
        a(this.e, this.f);
      }
      if ((localf != null) && (!TextUtils.isEmpty(TabLayout.f.a(localf)))) {
        setContentDescription(TabLayout.f.a(localf));
      }
      boolean bool2 = bool1;
      if (localf != null)
      {
        bool2 = bool1;
        if (localf.e()) {
          bool2 = true;
        }
      }
      setSelected(bool2);
    }
    
    final void c()
    {
      setOrientation(TabLayout.this.B ^ true);
      if ((this.e == null) && (this.f == null)) {
        a(this.b, this.c);
      } else {
        a(this.e, this.f);
      }
    }
    
    protected void drawableStateChanged()
    {
      super.drawableStateChanged();
      int[] arrayOfInt = getDrawableState();
      Drawable localDrawable = this.g;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (localDrawable != null)
      {
        bool2 = bool1;
        if (localDrawable.isStateful()) {
          bool2 = false | this.g.setState(arrayOfInt);
        }
      }
      if (bool2)
      {
        invalidate();
        TabLayout.this.invalidate();
      }
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(a.c.class.getName());
    }
    
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(a.c.class.getName());
    }
    
    public void onMeasure(int paramInt1, int paramInt2)
    {
      int j = View.MeasureSpec.getSize(paramInt1);
      int k = View.MeasureSpec.getMode(paramInt1);
      int m = TabLayout.this.getTabMaxWidth();
      int n = paramInt1;
      if (m > 0) {
        if (k != 0)
        {
          n = paramInt1;
          if (j <= m) {}
        }
        else
        {
          n = View.MeasureSpec.makeMeasureSpec(TabLayout.this.s, Integer.MIN_VALUE);
        }
      }
      super.onMeasure(n, paramInt2);
      if (this.b != null)
      {
        float f1 = TabLayout.this.p;
        k = this.h;
        Object localObject = this.c;
        j = 1;
        float f2;
        if ((localObject != null) && (((ImageView)localObject).getVisibility() == 0))
        {
          paramInt1 = 1;
          f2 = f1;
        }
        else
        {
          localObject = this.b;
          f2 = f1;
          paramInt1 = k;
          if (localObject != null)
          {
            f2 = f1;
            paramInt1 = k;
            if (((TextView)localObject).getLineCount() > 1)
            {
              f2 = TabLayout.this.q;
              paramInt1 = k;
            }
          }
        }
        f1 = this.b.getTextSize();
        int i1 = this.b.getLineCount();
        k = C.g(this.b);
        boolean bool = f2 < f1;
        if ((bool) || ((k >= 0) && (paramInt1 != k)))
        {
          k = j;
          if (TabLayout.this.A == 1)
          {
            k = j;
            if (bool)
            {
              k = j;
              if (i1 == 1)
              {
                localObject = this.b.getLayout();
                if (localObject != null)
                {
                  k = j;
                  if (a((Layout)localObject, 0, f2) <= getMeasuredWidth() - getPaddingLeft() - getPaddingRight()) {}
                }
                else
                {
                  k = 0;
                }
              }
            }
          }
          if (k != 0)
          {
            this.b.setTextSize(0, f2);
            this.b.setMaxLines(paramInt1);
            super.onMeasure(n, paramInt2);
          }
        }
      }
    }
    
    public boolean performClick()
    {
      boolean bool1 = super.performClick();
      boolean bool2 = bool1;
      if (this.a != null)
      {
        if (!bool1) {
          playSoundEffect(0);
        }
        this.a.g();
        bool2 = true;
      }
      return bool2;
    }
    
    public void setSelected(boolean paramBoolean)
    {
      int j;
      if (isSelected() != paramBoolean) {
        j = 1;
      } else {
        j = 0;
      }
      super.setSelected(paramBoolean);
      if ((j != 0) && (paramBoolean) && (Build.VERSION.SDK_INT < 16)) {
        sendAccessibilityEvent(4);
      }
      Object localObject = this.b;
      if (localObject != null) {
        ((TextView)localObject).setSelected(paramBoolean);
      }
      localObject = this.c;
      if (localObject != null) {
        ((ImageView)localObject).setSelected(paramBoolean);
      }
      localObject = this.d;
      if (localObject != null) {
        ((View)localObject).setSelected(paramBoolean);
      }
    }
  }
  
  public static class i
    implements TabLayout.c
  {
    private final ViewPager a;
    
    public i(ViewPager paramViewPager)
    {
      this.a = paramViewPager;
    }
    
    public void a(TabLayout.f paramf) {}
    
    public void b(TabLayout.f paramf) {}
    
    public void c(TabLayout.f paramf)
    {
      this.a.setCurrentItem(paramf.c());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/TabLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */