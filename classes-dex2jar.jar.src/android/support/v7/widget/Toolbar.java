package android.support.v7.widget;

import Gd;
import Pd;
import Vd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.c;
import android.support.v4.view.f;
import android.support.v4.view.i;
import android.support.v4.view.y;
import android.support.v7.app.a.a;
import android.support.v7.view.menu.D;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.v;
import android.support.v7.view.menu.v.a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import le;
import pe;

public class Toolbar
  extends ViewGroup
{
  private int A;
  private boolean B;
  private boolean C;
  private final ArrayList<View> D = new ArrayList();
  private final ArrayList<View> E = new ArrayList();
  private final int[] F = new int[2];
  c G;
  private final ActionMenuView.e H = new qb(this);
  private wb I;
  private g J;
  private a K;
  private v.a L;
  private l.a M;
  private boolean N;
  private final Runnable O = new rb(this);
  private ActionMenuView a;
  private TextView b;
  private TextView c;
  private ImageButton d;
  private ImageView e;
  private Drawable f;
  private CharSequence g;
  ImageButton h;
  View i;
  private Context j;
  private int k;
  private int l;
  private int m;
  int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private Pa t;
  private int u;
  private int v;
  private int w = 8388627;
  private CharSequence x;
  private CharSequence y;
  private int z;
  
  public Toolbar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = pb.a(getContext(), paramAttributeSet, Pd.Toolbar, paramInt, 0);
    this.l = paramContext.g(Pd.Toolbar_titleTextAppearance, 0);
    this.m = paramContext.g(Pd.Toolbar_subtitleTextAppearance, 0);
    this.w = paramContext.e(Pd.Toolbar_android_gravity, this.w);
    this.n = paramContext.e(Pd.Toolbar_buttonGravity, 48);
    int i1 = paramContext.b(Pd.Toolbar_titleMargin, 0);
    paramInt = i1;
    if (paramContext.g(Pd.Toolbar_titleMargins)) {
      paramInt = paramContext.b(Pd.Toolbar_titleMargins, i1);
    }
    this.s = paramInt;
    this.r = paramInt;
    this.q = paramInt;
    this.p = paramInt;
    paramInt = paramContext.b(Pd.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0) {
      this.p = paramInt;
    }
    paramInt = paramContext.b(Pd.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0) {
      this.q = paramInt;
    }
    paramInt = paramContext.b(Pd.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0) {
      this.r = paramInt;
    }
    paramInt = paramContext.b(Pd.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0) {
      this.s = paramInt;
    }
    this.o = paramContext.c(Pd.Toolbar_maxButtonHeight, -1);
    i1 = paramContext.b(Pd.Toolbar_contentInsetStart, Integer.MIN_VALUE);
    paramInt = paramContext.b(Pd.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
    int i2 = paramContext.c(Pd.Toolbar_contentInsetLeft, 0);
    int i3 = paramContext.c(Pd.Toolbar_contentInsetRight, 0);
    l();
    this.t.a(i2, i3);
    if ((i1 != Integer.MIN_VALUE) || (paramInt != Integer.MIN_VALUE)) {
      this.t.b(i1, paramInt);
    }
    this.u = paramContext.b(Pd.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
    this.v = paramContext.b(Pd.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
    this.f = paramContext.b(Pd.Toolbar_collapseIcon);
    this.g = paramContext.e(Pd.Toolbar_collapseContentDescription);
    paramAttributeSet = paramContext.e(Pd.Toolbar_title);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setTitle(paramAttributeSet);
    }
    paramAttributeSet = paramContext.e(Pd.Toolbar_subtitle);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setSubtitle(paramAttributeSet);
    }
    this.j = getContext();
    setPopupTheme(paramContext.g(Pd.Toolbar_popupTheme, 0));
    paramAttributeSet = paramContext.b(Pd.Toolbar_navigationIcon);
    if (paramAttributeSet != null) {
      setNavigationIcon(paramAttributeSet);
    }
    paramAttributeSet = paramContext.e(Pd.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setNavigationContentDescription(paramAttributeSet);
    }
    paramAttributeSet = paramContext.b(Pd.Toolbar_logo);
    if (paramAttributeSet != null) {
      setLogo(paramAttributeSet);
    }
    paramAttributeSet = paramContext.e(Pd.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setLogoDescription(paramAttributeSet);
    }
    if (paramContext.g(Pd.Toolbar_titleTextColor)) {
      setTitleTextColor(paramContext.a(Pd.Toolbar_titleTextColor, -1));
    }
    if (paramContext.g(Pd.Toolbar_subtitleTextColor)) {
      setSubtitleTextColor(paramContext.a(Pd.Toolbar_subtitleTextColor, -1));
    }
    paramContext.a();
  }
  
  private int a(int paramInt)
  {
    int i1 = y.l(this);
    int i2 = f.a(paramInt, i1) & 0x7;
    if (i2 != 1)
    {
      paramInt = 3;
      if ((i2 != 3) && (i2 != 5))
      {
        if (i1 == 1) {
          paramInt = 5;
        }
        return paramInt;
      }
    }
    return i2;
  }
  
  private int a(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return i.b(paramView) + i.a(paramView);
  }
  
  private int a(View paramView, int paramInt)
  {
    b localb = (b)paramView.getLayoutParams();
    int i1 = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (i1 - paramInt) / 2;
    } else {
      paramInt = 0;
    }
    int i2 = b(localb.a);
    if (i2 != 48)
    {
      if (i2 != 80)
      {
        int i3 = getPaddingTop();
        int i4 = getPaddingBottom();
        int i5 = getHeight();
        i2 = (i5 - i3 - i4 - i1) / 2;
        paramInt = localb.topMargin;
        if (i2 >= paramInt)
        {
          i1 = i5 - i4 - i1 - i2 - i3;
          i4 = localb.bottomMargin;
          paramInt = i2;
          if (i1 < i4) {
            paramInt = Math.max(0, i2 - (i4 - i1));
          }
        }
        return i3 + paramInt;
      }
      return getHeight() - getPaddingBottom() - i1 - localb.bottomMargin - paramInt;
    }
    return getPaddingTop() - paramInt;
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int i2 = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int i3 = Math.max(0, i1) + Math.max(0, i2);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramArrayOfInt[1] = Math.max(0, -i2);
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + i3 + paramInt2, localMarginLayoutParams.width), ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height));
    return paramView.getMeasuredWidth() + i3;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    b localb = (b)paramView.getLayoutParams();
    int i1 = localb.leftMargin - paramArrayOfInt[0];
    paramInt1 += Math.max(0, i1);
    paramArrayOfInt[0] = Math.max(0, -i1);
    paramInt2 = a(paramView, paramInt2);
    i1 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 + (i1 + localb.rightMargin);
  }
  
  private int a(List<View> paramList, int[] paramArrayOfInt)
  {
    int i1 = paramArrayOfInt[0];
    int i2 = paramArrayOfInt[1];
    int i3 = paramList.size();
    int i4 = 0;
    int i5 = 0;
    while (i4 < i3)
    {
      View localView = (View)paramList.get(i4);
      paramArrayOfInt = (b)localView.getLayoutParams();
      i1 = paramArrayOfInt.leftMargin - i1;
      i2 = paramArrayOfInt.rightMargin - i2;
      int i6 = Math.max(0, i1);
      int i7 = Math.max(0, i2);
      i1 = Math.max(0, -i1);
      i2 = Math.max(0, -i2);
      i5 += i6 + localView.getMeasuredWidth() + i7;
      i4++;
    }
    return i5;
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i1 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0)
      {
        paramInt1 = paramInt5;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i1, paramInt1);
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = generateDefaultLayoutParams();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
      localObject = generateLayoutParams((ViewGroup.LayoutParams)localObject);
    } else {
      localObject = (b)localObject;
    }
    ((b)localObject).b = 1;
    if ((paramBoolean) && (this.i != null))
    {
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.E.add(paramView);
    }
    else
    {
      addView(paramView, (ViewGroup.LayoutParams)localObject);
    }
  }
  
  private void a(List<View> paramList, int paramInt)
  {
    int i1 = y.l(this);
    int i2 = 0;
    if (i1 == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i3 = getChildCount();
    int i4 = f.a(paramInt, y.l(this));
    paramList.clear();
    paramInt = i2;
    Object localObject1;
    Object localObject2;
    if (i1 != 0) {
      for (paramInt = i3 - 1; paramInt >= 0; paramInt--)
      {
        localObject1 = getChildAt(paramInt);
        localObject2 = (b)((View)localObject1).getLayoutParams();
        if ((((b)localObject2).b == 0) && (d((View)localObject1)) && (a(((a.a)localObject2).a) == i4)) {
          paramList.add(localObject1);
        }
      }
    }
    while (paramInt < i3)
    {
      localObject2 = getChildAt(paramInt);
      localObject1 = (b)((View)localObject2).getLayoutParams();
      if ((((b)localObject1).b == 0) && (d((View)localObject2)) && (a(((a.a)localObject1).a) == i4)) {
        paramList.add(localObject2);
      }
      paramInt++;
    }
  }
  
  private int b(int paramInt)
  {
    int i1 = paramInt & 0x70;
    paramInt = i1;
    if (i1 != 16)
    {
      paramInt = i1;
      if (i1 != 48)
      {
        paramInt = i1;
        if (i1 != 80) {
          paramInt = this.w & 0x70;
        }
      }
    }
    return paramInt;
  }
  
  private int b(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return paramView.topMargin + paramView.bottomMargin;
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    b localb = (b)paramView.getLayoutParams();
    int i1 = localb.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i1);
    paramArrayOfInt[1] = Math.max(0, -i1);
    i1 = a(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - paramInt2, i1, paramInt1, paramView.getMeasuredHeight() + i1);
    return paramInt1 - (paramInt2 + localb.leftMargin);
  }
  
  private boolean c(View paramView)
  {
    boolean bool;
    if ((paramView.getParent() != this) && (!this.E.contains(paramView))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean d(View paramView)
  {
    boolean bool;
    if ((paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private MenuInflater getMenuInflater()
  {
    return new pe(getContext());
  }
  
  private void l()
  {
    if (this.t == null) {
      this.t = new Pa();
    }
  }
  
  private void m()
  {
    if (this.e == null) {
      this.e = new AppCompatImageView(getContext());
    }
  }
  
  private void n()
  {
    o();
    if (this.a.g() == null)
    {
      l locall = (l)this.a.getMenu();
      if (this.K == null) {
        this.K = new a();
      }
      this.a.setExpandedActionViewsExclusive(true);
      locall.a(this.K, this.j);
    }
  }
  
  private void o()
  {
    if (this.a == null)
    {
      this.a = new ActionMenuView(getContext());
      this.a.setPopupTheme(this.k);
      this.a.setOnMenuItemClickListener(this.H);
      this.a.a(this.L, this.M);
      b localb = generateDefaultLayoutParams();
      localb.a = (0x800005 | this.n & 0x70);
      this.a.setLayoutParams(localb);
      a(this.a, false);
    }
  }
  
  private void p()
  {
    if (this.d == null)
    {
      this.d = new s(getContext(), null, Gd.toolbarNavigationButtonStyle);
      b localb = generateDefaultLayoutParams();
      localb.a = (0x800003 | this.n & 0x70);
      this.d.setLayoutParams(localb);
    }
  }
  
  private void q()
  {
    removeCallbacks(this.O);
    post(this.O);
  }
  
  private boolean r()
  {
    if (!this.N) {
      return false;
    }
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
    {
      View localView = getChildAt(i2);
      if ((d(localView)) && (localView.getMeasuredWidth() > 0) && (localView.getMeasuredHeight() > 0)) {
        return false;
      }
    }
    return true;
  }
  
  void a()
  {
    for (int i1 = this.E.size() - 1; i1 >= 0; i1--) {
      addView((View)this.E.get(i1));
    }
    this.E.clear();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    l();
    this.t.b(paramInt1, paramInt2);
  }
  
  public void a(Context paramContext, int paramInt)
  {
    this.m = paramInt;
    TextView localTextView = this.c;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public void a(l paraml, g paramg)
  {
    if ((paraml == null) && (this.a == null)) {
      return;
    }
    o();
    l locall = this.a.g();
    if (locall == paraml) {
      return;
    }
    if (locall != null)
    {
      locall.b(this.J);
      locall.b(this.K);
    }
    if (this.K == null) {
      this.K = new a();
    }
    paramg.b(true);
    if (paraml != null)
    {
      paraml.a(paramg, this.j);
      paraml.a(this.K, this.j);
    }
    else
    {
      paramg.a(this.j, null);
      this.K.a(this.j, null);
      paramg.a(true);
      this.K.a(true);
    }
    this.a.setPopupTheme(this.k);
    this.a.setPresenter(paramg);
    this.J = paramg;
  }
  
  public void b(Context paramContext, int paramInt)
  {
    this.l = paramInt;
    TextView localTextView = this.b;
    if (localTextView != null) {
      localTextView.setTextAppearance(paramContext, paramInt);
    }
  }
  
  public boolean b()
  {
    if (getVisibility() == 0)
    {
      ActionMenuView localActionMenuView = this.a;
      if ((localActionMenuView != null) && (localActionMenuView.f())) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void c()
  {
    Object localObject = this.K;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((a)localObject).b;
    }
    if (localObject != null) {
      ((p)localObject).collapseActionView();
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof b))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d()
  {
    ActionMenuView localActionMenuView = this.a;
    if (localActionMenuView != null) {
      localActionMenuView.a();
    }
  }
  
  void e()
  {
    if (this.h == null)
    {
      this.h = new s(getContext(), null, Gd.toolbarNavigationButtonStyle);
      this.h.setImageDrawable(this.f);
      this.h.setContentDescription(this.g);
      b localb = generateDefaultLayoutParams();
      localb.a = (0x800003 | this.n & 0x70);
      localb.b = 2;
      this.h.setLayoutParams(localb);
      this.h.setOnClickListener(new sb(this));
    }
  }
  
  public boolean f()
  {
    a locala = this.K;
    boolean bool;
    if ((locala != null) && (locala.b != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g()
  {
    ActionMenuView localActionMenuView = this.a;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.c())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected b generateDefaultLayoutParams()
  {
    return new b(-2, -2);
  }
  
  public b generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new b(getContext(), paramAttributeSet);
  }
  
  protected b generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof b)) {
      return new b((b)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof a.a)) {
      return new b((a.a)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new b((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new b(paramLayoutParams);
  }
  
  public int getContentInsetEnd()
  {
    Pa localPa = this.t;
    int i1;
    if (localPa != null) {
      i1 = localPa.a();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public int getContentInsetEndWithActions()
  {
    int i1 = this.v;
    if (i1 == Integer.MIN_VALUE) {
      i1 = getContentInsetEnd();
    }
    return i1;
  }
  
  public int getContentInsetLeft()
  {
    Pa localPa = this.t;
    int i1;
    if (localPa != null) {
      i1 = localPa.b();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public int getContentInsetRight()
  {
    Pa localPa = this.t;
    int i1;
    if (localPa != null) {
      i1 = localPa.c();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public int getContentInsetStart()
  {
    Pa localPa = this.t;
    int i1;
    if (localPa != null) {
      i1 = localPa.d();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i1 = this.u;
    if (i1 == Integer.MIN_VALUE) {
      i1 = getContentInsetStart();
    }
    return i1;
  }
  
  public int getCurrentContentInsetEnd()
  {
    Object localObject = this.a;
    if (localObject != null)
    {
      localObject = ((ActionMenuView)localObject).g();
      if ((localObject != null) && (((l)localObject).hasVisibleItems()))
      {
        i1 = 1;
        break label32;
      }
    }
    int i1 = 0;
    label32:
    if (i1 != 0) {
      i1 = Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    } else {
      i1 = getContentInsetEnd();
    }
    return i1;
  }
  
  public int getCurrentContentInsetLeft()
  {
    int i1;
    if (y.l(this) == 1) {
      i1 = getCurrentContentInsetEnd();
    } else {
      i1 = getCurrentContentInsetStart();
    }
    return i1;
  }
  
  public int getCurrentContentInsetRight()
  {
    int i1;
    if (y.l(this) == 1) {
      i1 = getCurrentContentInsetStart();
    } else {
      i1 = getCurrentContentInsetEnd();
    }
    return i1;
  }
  
  public int getCurrentContentInsetStart()
  {
    int i1;
    if (getNavigationIcon() != null) {
      i1 = Math.max(getContentInsetStart(), Math.max(this.u, 0));
    } else {
      i1 = getContentInsetStart();
    }
    return i1;
  }
  
  public Drawable getLogo()
  {
    Object localObject = this.e;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  public CharSequence getLogoDescription()
  {
    Object localObject = this.e;
    if (localObject != null) {
      localObject = ((ImageView)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Menu getMenu()
  {
    n();
    return this.a.getMenu();
  }
  
  public CharSequence getNavigationContentDescription()
  {
    Object localObject = this.d;
    if (localObject != null) {
      localObject = ((ImageButton)localObject).getContentDescription();
    } else {
      localObject = null;
    }
    return (CharSequence)localObject;
  }
  
  public Drawable getNavigationIcon()
  {
    Object localObject = this.d;
    if (localObject != null) {
      localObject = ((ImageButton)localObject).getDrawable();
    } else {
      localObject = null;
    }
    return (Drawable)localObject;
  }
  
  g getOuterActionMenuPresenter()
  {
    return this.J;
  }
  
  public Drawable getOverflowIcon()
  {
    n();
    return this.a.getOverflowIcon();
  }
  
  Context getPopupContext()
  {
    return this.j;
  }
  
  public int getPopupTheme()
  {
    return this.k;
  }
  
  public CharSequence getSubtitle()
  {
    return this.y;
  }
  
  public CharSequence getTitle()
  {
    return this.x;
  }
  
  public int getTitleMarginBottom()
  {
    return this.s;
  }
  
  public int getTitleMarginEnd()
  {
    return this.q;
  }
  
  public int getTitleMarginStart()
  {
    return this.p;
  }
  
  public int getTitleMarginTop()
  {
    return this.r;
  }
  
  public V getWrapper()
  {
    if (this.I == null) {
      this.I = new wb(this, true);
    }
    return this.I;
  }
  
  public boolean h()
  {
    ActionMenuView localActionMenuView = this.a;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    ActionMenuView localActionMenuView = this.a;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.e())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  void j()
  {
    for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
    {
      View localView = getChildAt(i1);
      if ((((b)localView.getLayoutParams()).b != 2) && (localView != this.a))
      {
        removeViewAt(i1);
        this.E.add(localView);
      }
    }
  }
  
  public boolean k()
  {
    ActionMenuView localActionMenuView = this.a;
    boolean bool;
    if ((localActionMenuView != null) && (localActionMenuView.fa())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.O);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 9) {
      this.C = false;
    }
    if (!this.C)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i1 == 9) && (!bool)) {
        this.C = true;
      }
    }
    if ((i1 == 10) || (i1 == 3)) {
      this.C = false;
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (y.l(this) == 1) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2 = getWidth();
    int i3 = getHeight();
    int i4 = getPaddingLeft();
    int i5 = getPaddingRight();
    int i6 = getPaddingTop();
    int i7 = getPaddingBottom();
    int i8 = i2 - i5;
    int[] arrayOfInt = this.F;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = y.m(this);
    if (paramInt1 >= 0) {
      paramInt4 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt4 = 0;
    }
    if (d(this.d))
    {
      if (i1 != 0)
      {
        paramInt3 = b(this.d, i8, arrayOfInt, paramInt4);
        i9 = i4;
        break label167;
      }
      i9 = a(this.d, i4, arrayOfInt, paramInt4);
    }
    else
    {
      i9 = i4;
    }
    paramInt3 = i8;
    label167:
    paramInt1 = i9;
    paramInt2 = paramInt3;
    if (d(this.h)) {
      if (i1 != 0)
      {
        paramInt2 = b(this.h, paramInt3, arrayOfInt, paramInt4);
        paramInt1 = i9;
      }
      else
      {
        paramInt1 = a(this.h, i9, arrayOfInt, paramInt4);
        paramInt2 = paramInt3;
      }
    }
    int i9 = paramInt1;
    paramInt3 = paramInt2;
    if (d(this.a)) {
      if (i1 != 0)
      {
        i9 = a(this.a, paramInt1, arrayOfInt, paramInt4);
        paramInt3 = paramInt2;
      }
      else
      {
        paramInt3 = b(this.a, paramInt2, arrayOfInt, paramInt4);
        i9 = paramInt1;
      }
    }
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - i9);
    arrayOfInt[1] = Math.max(0, paramInt1 - (i8 - paramInt3));
    paramInt2 = Math.max(i9, paramInt2);
    paramInt3 = Math.min(paramInt3, i8 - paramInt1);
    i9 = paramInt2;
    paramInt1 = paramInt3;
    if (d(this.i)) {
      if (i1 != 0)
      {
        paramInt1 = b(this.i, paramInt3, arrayOfInt, paramInt4);
        i9 = paramInt2;
      }
      else
      {
        i9 = a(this.i, paramInt2, arrayOfInt, paramInt4);
        paramInt1 = paramInt3;
      }
    }
    paramInt3 = i9;
    paramInt2 = paramInt1;
    if (d(this.e)) {
      if (i1 != 0)
      {
        paramInt2 = b(this.e, paramInt1, arrayOfInt, paramInt4);
        paramInt3 = i9;
      }
      else
      {
        paramInt3 = a(this.e, i9, arrayOfInt, paramInt4);
        paramInt2 = paramInt1;
      }
    }
    boolean bool = d(this.b);
    paramBoolean = d(this.c);
    Object localObject1;
    if (bool)
    {
      localObject1 = (b)this.b.getLayoutParams();
      paramInt1 = ((ViewGroup.MarginLayoutParams)localObject1).topMargin + this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin + 0;
    }
    else
    {
      paramInt1 = 0;
    }
    if (paramBoolean)
    {
      localObject1 = (b)this.c.getLayoutParams();
      paramInt1 += ((ViewGroup.MarginLayoutParams)localObject1).topMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
    }
    if ((!bool) && (!paramBoolean)) {}
    for (paramInt1 = paramInt3;; paramInt1 = paramInt3)
    {
      paramInt3 = paramInt2;
      break label1330;
      if (bool) {
        localObject1 = this.b;
      } else {
        localObject1 = this.c;
      }
      if (paramBoolean) {
        localObject2 = this.c;
      } else {
        localObject2 = this.b;
      }
      localObject1 = (b)((View)localObject1).getLayoutParams();
      Object localObject2 = (b)((View)localObject2).getLayoutParams();
      if (((bool) && (this.b.getMeasuredWidth() > 0)) || ((paramBoolean) && (this.c.getMeasuredWidth() > 0))) {
        i9 = 1;
      } else {
        i9 = 0;
      }
      i8 = this.w & 0x70;
      if (i8 != 48)
      {
        if (i8 != 80)
        {
          i8 = (i3 - i6 - i7 - paramInt1) / 2;
          int i10 = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
          int i11 = this.r;
          if (i8 < i10 + i11)
          {
            paramInt1 = i10 + i11;
          }
          else
          {
            i11 = i3 - i7 - paramInt1 - i8 - i6;
            i3 = ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
            i7 = this.s;
            paramInt1 = i8;
            if (i11 < i3 + i7) {
              paramInt1 = Math.max(0, i8 - (((ViewGroup.MarginLayoutParams)localObject2).bottomMargin + i7 - i11));
            }
          }
          paramInt1 = i6 + paramInt1;
        }
        else
        {
          paramInt1 = i3 - i7 - ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin - this.s - paramInt1;
        }
      }
      else {
        paramInt1 = getPaddingTop() + ((ViewGroup.MarginLayoutParams)localObject1).topMargin + this.r;
      }
      if (i1 == 0) {
        break;
      }
      if (i9 != 0) {
        i1 = this.p;
      } else {
        i1 = 0;
      }
      i1 -= arrayOfInt[1];
      paramInt2 -= Math.max(0, i1);
      arrayOfInt[1] = Math.max(0, -i1);
      if (bool)
      {
        localObject1 = (b)this.b.getLayoutParams();
        i8 = paramInt2 - this.b.getMeasuredWidth();
        i1 = this.b.getMeasuredHeight() + paramInt1;
        this.b.layout(i8, paramInt1, paramInt2, i1);
        paramInt1 = i8 - this.q;
        i8 = i1 + ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
      }
      else
      {
        i1 = paramInt2;
        i8 = paramInt1;
        paramInt1 = i1;
      }
      if (paramBoolean)
      {
        localObject1 = (b)this.c.getLayoutParams();
        i8 += ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
        i1 = this.c.getMeasuredWidth();
        i6 = this.c.getMeasuredHeight();
        this.c.layout(paramInt2 - i1, i8, paramInt2, i6 + i8);
        i1 = paramInt2 - this.q;
        i8 = ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
      }
      else
      {
        i1 = paramInt2;
      }
      if (i9 != 0) {
        paramInt2 = Math.min(paramInt1, i1);
      }
    }
    if (i9 != 0) {
      i1 = this.p;
    } else {
      i1 = 0;
    }
    i1 -= arrayOfInt[0];
    paramInt3 += Math.max(0, i1);
    arrayOfInt[0] = Math.max(0, -i1);
    if (bool)
    {
      localObject1 = (b)this.b.getLayoutParams();
      i1 = this.b.getMeasuredWidth() + paramInt3;
      i8 = this.b.getMeasuredHeight() + paramInt1;
      this.b.layout(paramInt3, paramInt1, i1, i8);
      i1 += this.q;
      paramInt1 = i8 + ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
    }
    else
    {
      i1 = paramInt3;
    }
    if (paramBoolean)
    {
      localObject1 = (b)this.c.getLayoutParams();
      paramInt1 += ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
      i6 = this.c.getMeasuredWidth() + paramInt3;
      i8 = this.c.getMeasuredHeight();
      this.c.layout(paramInt3, paramInt1, i6, i8 + paramInt1);
      i8 = i6 + this.q;
      paramInt1 = ((ViewGroup.MarginLayoutParams)localObject1).bottomMargin;
    }
    else
    {
      i8 = paramInt3;
    }
    paramInt1 = paramInt3;
    paramInt3 = paramInt2;
    if (i9 != 0)
    {
      paramInt1 = Math.max(i1, i8);
      paramInt3 = paramInt2;
    }
    label1330:
    i9 = i4;
    i4 = 0;
    a(this.D, 3);
    int i1 = this.D.size();
    for (paramInt2 = 0; paramInt2 < i1; paramInt2++) {
      paramInt1 = a((View)this.D.get(paramInt2), paramInt1, arrayOfInt, paramInt4);
    }
    a(this.D, 5);
    i1 = this.D.size();
    for (paramInt2 = 0; paramInt2 < i1; paramInt2++) {
      paramInt3 = b((View)this.D.get(paramInt2), paramInt3, arrayOfInt, paramInt4);
    }
    a(this.D, 1);
    i1 = a(this.D, arrayOfInt);
    paramInt2 = i9 + (i2 - i9 - i5) / 2 - i1 / 2;
    i9 = i1 + paramInt2;
    if (paramInt2 >= paramInt1) {
      if (i9 > paramInt3) {
        paramInt1 = paramInt2 - (i9 - paramInt3);
      } else {
        paramInt1 = paramInt2;
      }
    }
    paramInt3 = this.D.size();
    for (paramInt2 = i4; paramInt2 < paramInt3; paramInt2++) {
      paramInt1 = a((View)this.D.get(paramInt2), paramInt1, arrayOfInt, paramInt4);
    }
    this.D.clear();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = this.F;
    if (Fb.a(this))
    {
      i1 = 1;
      i2 = 0;
    }
    else
    {
      i1 = 0;
      i2 = 1;
    }
    if (d(this.d))
    {
      a(this.d, paramInt1, 0, paramInt2, 0, this.o);
      i3 = this.d.getMeasuredWidth() + a(this.d);
      i4 = Math.max(0, this.d.getMeasuredHeight() + b(this.d));
      i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
    }
    else
    {
      i3 = 0;
      i4 = 0;
      i5 = 0;
    }
    int i6 = i3;
    int i7 = i4;
    int i3 = i5;
    if (d(this.h))
    {
      a(this.h, paramInt1, 0, paramInt2, 0, this.o);
      i6 = this.h.getMeasuredWidth() + a(this.h);
      i7 = Math.max(i4, this.h.getMeasuredHeight() + b(this.h));
      i3 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
    }
    int i5 = getCurrentContentInsetStart();
    int i4 = 0 + Math.max(i5, i6);
    arrayOfInt[i1] = Math.max(0, i5 - i6);
    if (d(this.a))
    {
      a(this.a, paramInt1, i4, paramInt2, 0, this.o);
      i5 = this.a.getMeasuredWidth() + a(this.a);
      i7 = Math.max(i7, this.a.getMeasuredHeight() + b(this.a));
      i3 = View.combineMeasuredStates(i3, this.a.getMeasuredState());
    }
    else
    {
      i5 = 0;
    }
    i6 = getCurrentContentInsetEnd();
    int i1 = i4 + Math.max(i6, i5);
    arrayOfInt[i2] = Math.max(0, i6 - i5);
    int i2 = i1;
    i4 = i7;
    i5 = i3;
    if (d(this.i))
    {
      i2 = i1 + a(this.i, paramInt1, i1, paramInt2, 0, arrayOfInt);
      i4 = Math.max(i7, this.i.getMeasuredHeight() + b(this.i));
      i5 = View.combineMeasuredStates(i3, this.i.getMeasuredState());
    }
    i1 = i2;
    i7 = i4;
    i3 = i5;
    if (d(this.e))
    {
      i1 = i2 + a(this.e, paramInt1, i2, paramInt2, 0, arrayOfInt);
      i7 = Math.max(i4, this.e.getMeasuredHeight() + b(this.e));
      i3 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
    }
    int i8 = getChildCount();
    i4 = i1;
    i5 = 0;
    for (i2 = i7; i5 < i8; i2 = i7)
    {
      View localView = getChildAt(i5);
      i6 = i4;
      i1 = i3;
      i7 = i2;
      if (((b)localView.getLayoutParams()).b == 0) {
        if (!d(localView))
        {
          i6 = i4;
          i1 = i3;
          i7 = i2;
        }
        else
        {
          i6 = i4 + a(localView, paramInt1, i4, paramInt2, 0, arrayOfInt);
          i7 = Math.max(i2, localView.getMeasuredHeight() + b(localView));
          i1 = View.combineMeasuredStates(i3, localView.getMeasuredState());
        }
      }
      i5++;
      i4 = i6;
      i3 = i1;
    }
    i1 = this.r + this.s;
    i6 = this.p + this.q;
    if (d(this.b))
    {
      a(this.b, paramInt1, i4 + i6, paramInt2, i1, arrayOfInt);
      i8 = this.b.getMeasuredWidth();
      i5 = a(this.b);
      i7 = this.b.getMeasuredHeight();
      int i9 = b(this.b);
      i3 = View.combineMeasuredStates(i3, this.b.getMeasuredState());
      i7 += i9;
      i5 = i8 + i5;
    }
    else
    {
      i5 = 0;
      i7 = 0;
    }
    if (d(this.c))
    {
      i5 = Math.max(i5, a(this.c, paramInt1, i4 + i6, paramInt2, i7 + i1, arrayOfInt));
      i7 += this.c.getMeasuredHeight() + b(this.c);
      i3 = View.combineMeasuredStates(i3, this.c.getMeasuredState());
    }
    i2 = Math.max(i2, i7);
    i8 = getPaddingLeft();
    i6 = getPaddingRight();
    i1 = getPaddingTop();
    i7 = getPaddingBottom();
    i5 = View.resolveSizeAndState(Math.max(i4 + i5 + (i8 + i6), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i3);
    paramInt1 = View.resolveSizeAndState(Math.max(i2 + (i1 + i7), getSuggestedMinimumHeight()), paramInt2, i3 << 16);
    if (r()) {
      paramInt1 = 0;
    }
    setMeasuredDimension(i5, paramInt1);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof d))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    d locald = (d)paramParcelable;
    super.onRestoreInstanceState(locald.l());
    paramParcelable = this.a;
    if (paramParcelable != null) {
      paramParcelable = paramParcelable.g();
    } else {
      paramParcelable = null;
    }
    int i1 = locald.c;
    if ((i1 != 0) && (this.K != null) && (paramParcelable != null))
    {
      paramParcelable = paramParcelable.findItem(i1);
      if (paramParcelable != null) {
        paramParcelable.expandActionView();
      }
    }
    if (locald.d) {
      q();
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      super.onRtlPropertiesChanged(paramInt);
    }
    l();
    Pa localPa = this.t;
    boolean bool = true;
    if (paramInt != 1) {
      bool = false;
    }
    localPa.a(bool);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    d locald = new d(super.onSaveInstanceState());
    Object localObject = this.K;
    if (localObject != null)
    {
      localObject = ((a)localObject).b;
      if (localObject != null) {
        locald.c = ((p)localObject).getItemId();
      }
    }
    locald.d = i();
    return locald;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getActionMasked();
    if (i1 == 0) {
      this.B = false;
    }
    if (!this.B)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i1 == 0) && (!bool)) {
        this.B = true;
      }
    }
    if ((i1 == 1) || (i1 == 3)) {
      this.B = false;
    }
    return true;
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    this.N = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = Integer.MIN_VALUE;
    }
    if (i1 != this.v)
    {
      this.v = i1;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = Integer.MIN_VALUE;
    }
    if (i1 != this.u)
    {
      this.u = i1;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setLogo(int paramInt)
  {
    setLogo(Vd.b(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      m();
      if (!c(this.e)) {
        a(this.e, true);
      }
    }
    else
    {
      localImageView = this.e;
      if ((localImageView != null) && (c(localImageView)))
      {
        removeView(this.e);
        this.E.remove(this.e);
      }
    }
    ImageView localImageView = this.e;
    if (localImageView != null) {
      localImageView.setImageDrawable(paramDrawable);
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      m();
    }
    ImageView localImageView = this.e;
    if (localImageView != null) {
      localImageView.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setNavigationContentDescription(localCharSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      p();
    }
    ImageButton localImageButton = this.d;
    if (localImageButton != null) {
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(Vd.b(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      p();
      if (!c(this.d)) {
        a(this.d, true);
      }
    }
    else
    {
      localImageButton = this.d;
      if ((localImageButton != null) && (c(localImageButton)))
      {
        removeView(this.d);
        this.E.remove(this.d);
      }
    }
    ImageButton localImageButton = this.d;
    if (localImageButton != null) {
      localImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    p();
    this.d.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(c paramc)
  {
    this.G = paramc;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    n();
    this.a.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (this.k != paramInt)
    {
      this.k = paramInt;
      if (paramInt == 0) {
        this.j = getContext();
      } else {
        this.j = new ContextThemeWrapper(getContext(), paramInt);
      }
    }
  }
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.c == null)
      {
        localObject = getContext();
        this.c = new I((Context)localObject);
        this.c.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        int i1 = this.m;
        if (i1 != 0) {
          this.c.setTextAppearance((Context)localObject, i1);
        }
        i1 = this.A;
        if (i1 != 0) {
          this.c.setTextColor(i1);
        }
      }
      if (!c(this.c)) {
        a(this.c, true);
      }
    }
    else
    {
      localObject = this.c;
      if ((localObject != null) && (c((View)localObject)))
      {
        removeView(this.c);
        this.E.remove(this.c);
      }
    }
    Object localObject = this.c;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    this.y = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    this.A = paramInt;
    TextView localTextView = this.c;
    if (localTextView != null) {
      localTextView.setTextColor(paramInt);
    }
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.b == null)
      {
        localObject = getContext();
        this.b = new I((Context)localObject);
        this.b.setSingleLine();
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        int i1 = this.l;
        if (i1 != 0) {
          this.b.setTextAppearance((Context)localObject, i1);
        }
        i1 = this.z;
        if (i1 != 0) {
          this.b.setTextColor(i1);
        }
      }
      if (!c(this.b)) {
        a(this.b, true);
      }
    }
    else
    {
      localObject = this.b;
      if ((localObject != null) && (c((View)localObject)))
      {
        removeView(this.b);
        this.E.remove(this.b);
      }
    }
    Object localObject = this.b;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    this.x = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    this.s = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    this.q = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    this.p = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    this.r = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt)
  {
    this.z = paramInt;
    TextView localTextView = this.b;
    if (localTextView != null) {
      localTextView.setTextColor(paramInt);
    }
  }
  
  private class a
    implements v
  {
    l a;
    p b;
    
    a() {}
    
    public void a(Context paramContext, l paraml)
    {
      l locall = this.a;
      if (locall != null)
      {
        paramContext = this.b;
        if (paramContext != null) {
          locall.a(paramContext);
        }
      }
      this.a = paraml;
    }
    
    public void a(l paraml, boolean paramBoolean) {}
    
    public void a(boolean paramBoolean)
    {
      if (this.b != null)
      {
        l locall = this.a;
        int i = 0;
        int j = i;
        if (locall != null)
        {
          int k = locall.size();
          for (int m = 0;; m++)
          {
            j = i;
            if (m >= k) {
              break;
            }
            if (this.a.getItem(m) == this.b)
            {
              j = 1;
              break;
            }
          }
        }
        if (j == 0) {
          b(this.a, this.b);
        }
      }
    }
    
    public boolean a()
    {
      return false;
    }
    
    public boolean a(D paramD)
    {
      return false;
    }
    
    public boolean a(l paraml, p paramp)
    {
      Toolbar.this.e();
      Object localObject = Toolbar.this.h.getParent();
      paraml = Toolbar.this;
      if (localObject != paraml)
      {
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(paraml.h);
        }
        paraml = Toolbar.this;
        paraml.addView(paraml.h);
      }
      Toolbar.this.i = paramp.getActionView();
      this.b = paramp;
      localObject = Toolbar.this.i.getParent();
      paraml = Toolbar.this;
      if (localObject != paraml)
      {
        if ((localObject instanceof ViewGroup)) {
          ((ViewGroup)localObject).removeView(paraml.i);
        }
        paraml = Toolbar.this.generateDefaultLayoutParams();
        localObject = Toolbar.this;
        paraml.a = (0x800003 | ((Toolbar)localObject).n & 0x70);
        paraml.b = 2;
        ((Toolbar)localObject).i.setLayoutParams(paraml);
        paraml = Toolbar.this;
        paraml.addView(paraml.i);
      }
      Toolbar.this.j();
      Toolbar.this.requestLayout();
      paramp.a(true);
      paraml = Toolbar.this.i;
      if ((paraml instanceof le)) {
        ((le)paraml).onActionViewExpanded();
      }
      return true;
    }
    
    public boolean b(l paraml, p paramp)
    {
      paraml = Toolbar.this.i;
      if ((paraml instanceof le)) {
        ((le)paraml).onActionViewCollapsed();
      }
      paraml = Toolbar.this;
      paraml.removeView(paraml.i);
      paraml = Toolbar.this;
      paraml.removeView(paraml.h);
      paraml = Toolbar.this;
      paraml.i = null;
      paraml.a();
      this.b = null;
      Toolbar.this.requestLayout();
      paramp.a(false);
      return true;
    }
  }
  
  public static class b
    extends a.a
  {
    int b = 0;
    
    public b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.a = 8388627;
    }
    
    public b(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public b(a.a parama)
    {
      super();
    }
    
    public b(b paramb)
    {
      super();
      this.b = paramb.b;
    }
    
    public b(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      a(paramMarginLayoutParams);
    }
    
    void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      this.leftMargin = paramMarginLayoutParams.leftMargin;
      this.topMargin = paramMarginLayoutParams.topMargin;
      this.rightMargin = paramMarginLayoutParams.rightMargin;
      this.bottomMargin = paramMarginLayoutParams.bottomMargin;
    }
  }
  
  public static abstract interface c
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
  
  public static class d
    extends c
  {
    public static final Parcelable.Creator<d> CREATOR = new tb();
    int c;
    boolean d;
    
    public d(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.c = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.d = bool;
    }
    
    public d(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.c);
      paramParcel.writeInt(this.d);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */