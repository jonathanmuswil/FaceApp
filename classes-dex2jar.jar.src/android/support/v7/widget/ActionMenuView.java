package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.l.b;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.v.a;
import android.support.v7.view.menu.w;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
  extends pa
  implements l.b, w
{
  e A;
  private l p;
  private Context q;
  private int r;
  private boolean s;
  private g t;
  private v.a u;
  l.a v;
  private boolean w;
  private int x;
  private int y;
  private int z;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.y = ((int)(56.0F * f));
    this.z = ((int)(f * 4.0F));
    this.q = paramContext;
    this.r = 0;
  }
  
  static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c localc = (c)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView)) {
      localActionMenuItemView = (ActionMenuItemView)paramView;
    } else {
      localActionMenuItemView = null;
    }
    boolean bool = true;
    if ((localActionMenuItemView != null) && (localActionMenuItemView.ha())) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    }
    paramInt4 = 2;
    if ((paramInt2 > 0) && ((paramInt3 == 0) || (paramInt2 >= 2)))
    {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, Integer.MIN_VALUE), i);
      int j = paramView.getMeasuredWidth();
      int k = j / paramInt1;
      paramInt2 = k;
      if (j % paramInt1 != 0) {
        paramInt2 = k + 1;
      }
      if ((paramInt3 != 0) && (paramInt2 < 2)) {
        paramInt2 = paramInt4;
      }
    }
    else
    {
      paramInt2 = 0;
    }
    if ((localc.c) || (paramInt3 == 0)) {
      bool = false;
    }
    localc.f = bool;
    localc.d = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), i);
    return paramInt2;
  }
  
  private void e(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getSize(paramInt2);
    int m = getPaddingLeft();
    paramInt1 = getPaddingRight();
    int n = getPaddingTop() + getPaddingBottom();
    int i1 = ViewGroup.getChildMeasureSpec(paramInt2, n, -2);
    int i2 = j - (m + paramInt1);
    paramInt2 = this.y;
    paramInt1 = i2 / paramInt2;
    if (paramInt1 == 0)
    {
      setMeasuredDimension(i2, 0);
      return;
    }
    int i3 = paramInt2 + i2 % paramInt2 / paramInt1;
    int i4 = getChildCount();
    int i5 = 0;
    paramInt2 = 0;
    j = 0;
    int i6 = 0;
    int i7 = 0;
    m = 0;
    long l1 = 0L;
    Object localObject1;
    Object localObject2;
    while (i5 < i4)
    {
      localObject1 = getChildAt(i5);
      if (((View)localObject1).getVisibility() != 8)
      {
        boolean bool = localObject1 instanceof ActionMenuItemView;
        i6++;
        if (bool)
        {
          i8 = this.z;
          ((View)localObject1).setPadding(i8, 0, i8, 0);
        }
        localObject2 = (c)((View)localObject1).getLayoutParams();
        ((c)localObject2).h = false;
        ((c)localObject2).e = 0;
        ((c)localObject2).d = 0;
        ((c)localObject2).f = false;
        ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams)localObject2).rightMargin = 0;
        if ((bool) && (((ActionMenuItemView)localObject1).ha())) {
          bool = true;
        } else {
          bool = false;
        }
        ((c)localObject2).g = bool;
        if (((c)localObject2).c) {
          i8 = 1;
        } else {
          i8 = paramInt1;
        }
        i9 = a((View)localObject1, i3, i8, i1, n);
        i7 = Math.max(i7, i9);
        i8 = m;
        if (((c)localObject2).f) {
          i8 = m + 1;
        }
        if (((c)localObject2).c) {
          j = 1;
        }
        paramInt1 -= i9;
        paramInt2 = Math.max(paramInt2, ((View)localObject1).getMeasuredHeight());
        if (i9 == 1) {
          l1 |= 1 << i5;
        }
        m = i8;
      }
      i5++;
    }
    if ((j != 0) && (i6 == 2)) {
      n = 1;
    } else {
      n = 0;
    }
    int i8 = 0;
    int i9 = paramInt1;
    paramInt1 = i8;
    i5 = i2;
    while ((m > 0) && (i9 > 0))
    {
      int i10 = Integer.MAX_VALUE;
      i2 = 0;
      int i11 = 0;
      long l3;
      for (long l2 = 0L; i2 < i4; l2 = l3)
      {
        localObject2 = (c)getChildAt(i2).getLayoutParams();
        int i12;
        if (!((c)localObject2).f)
        {
          i12 = i10;
          i8 = i11;
          l3 = l2;
        }
        else
        {
          int i13 = ((c)localObject2).d;
          if (i13 < i10)
          {
            i12 = i13;
            l3 = 1L << i2;
            i8 = 1;
          }
          else
          {
            i12 = i10;
            i8 = i11;
            l3 = l2;
            if (i13 == i10)
            {
              l3 = l2 | 1L << i2;
              i8 = i11 + 1;
              i12 = i10;
            }
          }
        }
        i2++;
        i10 = i12;
        i11 = i8;
      }
      i8 = paramInt1;
      paramInt1 = paramInt2;
      l1 |= l2;
      if (i11 > i9)
      {
        paramInt2 = paramInt1;
        paramInt1 = i8;
        break;
      }
      paramInt2 = i10 + 1;
      for (i8 = 0; i8 < i4; i8++)
      {
        localObject1 = getChildAt(i8);
        localObject2 = (c)((View)localObject1).getLayoutParams();
        long l4 = 1 << i8;
        if ((l2 & l4) == 0L)
        {
          l3 = l1;
          if (((c)localObject2).d == paramInt2) {
            l3 = l1 | l4;
          }
          l1 = l3;
        }
        else
        {
          if ((n != 0) && (((c)localObject2).g) && (i9 == 1))
          {
            i2 = this.z;
            ((View)localObject1).setPadding(i2 + i3, 0, i2, 0);
          }
          ((c)localObject2).d += 1;
          ((c)localObject2).h = true;
          i9--;
        }
      }
      paramInt2 = paramInt1;
      paramInt1 = 1;
    }
    if ((j == 0) && (i6 == 1)) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i9 > 0) && (l1 != 0L) && ((i9 < i6 - 1) || (j != 0) || (i7 > 1)))
    {
      float f1 = Long.bitCount(l1);
      if (j == 0)
      {
        float f2;
        if ((l1 & 1L) != 0L)
        {
          f2 = f1;
          if (!((c)getChildAt(0).getLayoutParams()).g) {
            f2 = f1 - 0.5F;
          }
        }
        else
        {
          f2 = f1;
        }
        j = i4 - 1;
        f1 = f2;
        if ((l1 & 1 << j) != 0L)
        {
          f1 = f2;
          if (!((c)getChildAt(j).getLayoutParams()).g) {
            f1 = f2 - 0.5F;
          }
        }
      }
      if (f1 > 0.0F) {
        j = (int)(i9 * i3 / f1);
      } else {
        j = 0;
      }
      m = 0;
      for (;;)
      {
        i8 = paramInt1;
        if (m >= i4) {
          break;
        }
        if ((l1 & 1 << m) == 0L)
        {
          i8 = paramInt1;
        }
        else
        {
          localObject2 = getChildAt(m);
          localObject1 = (c)((View)localObject2).getLayoutParams();
          if ((localObject2 instanceof ActionMenuItemView))
          {
            ((c)localObject1).e = j;
            ((c)localObject1).h = true;
            if ((m == 0) && (!((c)localObject1).g)) {
              ((ViewGroup.MarginLayoutParams)localObject1).leftMargin = (-j / 2);
            }
          }
          else
          {
            if (!((c)localObject1).c) {
              break label1063;
            }
            ((c)localObject1).e = j;
            ((c)localObject1).h = true;
            ((ViewGroup.MarginLayoutParams)localObject1).rightMargin = (-j / 2);
          }
          i8 = 1;
          break label1101;
          label1063:
          if (m != 0) {
            ((ViewGroup.MarginLayoutParams)localObject1).leftMargin = (j / 2);
          }
          i8 = paramInt1;
          if (m != i4 - 1)
          {
            ((ViewGroup.MarginLayoutParams)localObject1).rightMargin = (j / 2);
            i8 = paramInt1;
          }
        }
        label1101:
        m++;
        paramInt1 = i8;
      }
    }
    i8 = paramInt1;
    paramInt1 = 0;
    if (i8 != 0) {
      while (paramInt1 < i4)
      {
        localObject2 = getChildAt(paramInt1);
        localObject1 = (c)((View)localObject2).getLayoutParams();
        if (((c)localObject1).h) {
          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(((c)localObject1).d * i3 + ((c)localObject1).e, 1073741824), i1);
        }
        paramInt1++;
      }
    }
    if (i == 1073741824) {
      paramInt2 = k;
    }
    setMeasuredDimension(i5, paramInt2);
  }
  
  public void a()
  {
    g localg = this.t;
    if (localg != null) {
      localg.c();
    }
  }
  
  public void a(l paraml)
  {
    this.p = paraml;
  }
  
  public void a(v.a parama, l.a parama1)
  {
    this.u = parama;
    this.v = parama1;
  }
  
  public boolean a(p paramp)
  {
    return this.p.a(paramp, 0);
  }
  
  public c b()
  {
    c localc = generateDefaultLayoutParams();
    localc.c = true;
    return localc;
  }
  
  public boolean c()
  {
    g localg = this.t;
    boolean bool;
    if ((localg != null) && (localg.e())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((paramLayoutParams != null) && ((paramLayoutParams instanceof c))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean d()
  {
    g localg = this.t;
    boolean bool;
    if ((localg != null) && (localg.g())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public boolean e()
  {
    g localg = this.t;
    boolean bool;
    if ((localg != null) && (localg.h())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected boolean e(int paramInt)
  {
    boolean bool1 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool2 = bool1;
    if (paramInt < getChildCount())
    {
      bool2 = bool1;
      if ((localView1 instanceof a)) {
        bool2 = false | ((a)localView1).fa();
      }
    }
    bool1 = bool2;
    if (paramInt > 0)
    {
      bool1 = bool2;
      if ((localView2 instanceof a)) {
        bool1 = bool2 | ((a)localView2).ga();
      }
    }
    return bool1;
  }
  
  public boolean f()
  {
    return this.s;
  }
  
  public boolean fa()
  {
    g localg = this.t;
    boolean bool;
    if ((localg != null) && (localg.i())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public l g()
  {
    return this.p;
  }
  
  protected c generateDefaultLayoutParams()
  {
    c localc = new c(-2, -2);
    localc.b = 16;
    return localc;
  }
  
  public c generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new c(getContext(), paramAttributeSet);
  }
  
  protected c generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof c)) {
        paramLayoutParams = new c((c)paramLayoutParams);
      } else {
        paramLayoutParams = new c(paramLayoutParams);
      }
      if (paramLayoutParams.b <= 0) {
        paramLayoutParams.b = 16;
      }
      return paramLayoutParams;
    }
    return generateDefaultLayoutParams();
  }
  
  public Menu getMenu()
  {
    if (this.p == null)
    {
      Object localObject = getContext();
      this.p = new l((Context)localObject);
      this.p.a(new d());
      this.t = new g((Context)localObject);
      this.t.c(true);
      g localg = this.t;
      localObject = this.u;
      if (localObject == null) {
        localObject = new b();
      }
      localg.a((v.a)localObject);
      this.p.a(this.t, this.q);
      this.t.a(this);
    }
    return this.p;
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    return this.t.d();
  }
  
  public int getPopupTheme()
  {
    return this.r;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = this.t;
    if (paramConfiguration != null)
    {
      paramConfiguration.a(false);
      if (this.t.h())
      {
        this.t.e();
        this.t.i();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    a();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.w)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = getPaddingRight();
    paramInt2 = getPaddingLeft();
    paramBoolean = Fb.a(this);
    paramInt1 = m - paramInt1 - paramInt2;
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    Object localObject1;
    Object localObject2;
    int i2;
    while (paramInt2 < i)
    {
      localObject1 = getChildAt(paramInt2);
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (c)((View)localObject1).getLayoutParams();
        if (((c)localObject2).c)
        {
          n = ((View)localObject1).getMeasuredWidth();
          paramInt4 = n;
          if (e(paramInt2)) {
            paramInt4 = n + k;
          }
          int i1 = ((View)localObject1).getMeasuredHeight();
          if (paramBoolean)
          {
            i2 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams)localObject2).leftMargin;
            n = i2 + paramInt4;
          }
          else
          {
            n = getWidth() - getPaddingRight() - ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
            i2 = n - paramInt4;
          }
          int i3 = j - i1 / 2;
          ((View)localObject1).layout(i2, i3, n, i1 + i3);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        }
        else
        {
          paramInt1 -= ((View)localObject1).getMeasuredWidth() + ((ViewGroup.MarginLayoutParams)localObject2).leftMargin + ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
          e(paramInt2);
          paramInt3++;
        }
      }
      paramInt2++;
    }
    if ((i == 1) && (paramInt4 == 0))
    {
      localObject2 = getChildAt(0);
      paramInt1 = ((View)localObject2).getMeasuredWidth();
      paramInt2 = ((View)localObject2).getMeasuredHeight();
      paramInt3 = m / 2 - paramInt1 / 2;
      paramInt4 = j - paramInt2 / 2;
      ((View)localObject2).layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    }
    paramInt2 = paramInt3 - (paramInt4 ^ 0x1);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    }
    paramInt4 = 0;
    paramInt2 = 0;
    int n = Math.max(0, paramInt1);
    if (paramBoolean)
    {
      paramInt3 = getWidth() - getPaddingRight();
      paramInt1 = paramInt2;
      while (paramInt1 < i)
      {
        localObject1 = getChildAt(paramInt1);
        localObject2 = (c)((View)localObject1).getLayoutParams();
        paramInt2 = paramInt3;
        if (((View)localObject1).getVisibility() != 8) {
          if (((c)localObject2).c)
          {
            paramInt2 = paramInt3;
          }
          else
          {
            paramInt2 = paramInt3 - ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
            i2 = ((View)localObject1).getMeasuredWidth();
            paramInt4 = ((View)localObject1).getMeasuredHeight();
            paramInt3 = j - paramInt4 / 2;
            ((View)localObject1).layout(paramInt2 - i2, paramInt3, paramInt2, paramInt4 + paramInt3);
            paramInt2 -= i2 + ((ViewGroup.MarginLayoutParams)localObject2).leftMargin + n;
          }
        }
        paramInt1++;
        paramInt3 = paramInt2;
      }
    }
    paramInt3 = getPaddingLeft();
    paramInt1 = paramInt4;
    while (paramInt1 < i)
    {
      localObject2 = getChildAt(paramInt1);
      localObject1 = (c)((View)localObject2).getLayoutParams();
      paramInt2 = paramInt3;
      if (((View)localObject2).getVisibility() != 8) {
        if (((c)localObject1).c)
        {
          paramInt2 = paramInt3;
        }
        else
        {
          paramInt4 = paramInt3 + ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
          paramInt2 = ((View)localObject2).getMeasuredWidth();
          i2 = ((View)localObject2).getMeasuredHeight();
          paramInt3 = j - i2 / 2;
          ((View)localObject2).layout(paramInt4, paramInt3, paramInt4 + paramInt2, i2 + paramInt3);
          paramInt2 = paramInt4 + (paramInt2 + ((ViewGroup.MarginLayoutParams)localObject1).rightMargin + n);
        }
      }
      paramInt1++;
      paramInt3 = paramInt2;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool1 = this.w;
    boolean bool2;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    this.w = bool2;
    if (bool1 != this.w) {
      this.x = 0;
    }
    int i = View.MeasureSpec.getSize(paramInt1);
    Object localObject;
    if (this.w)
    {
      localObject = this.p;
      if ((localObject != null) && (i != this.x))
      {
        this.x = i;
        ((l)localObject).b(true);
      }
    }
    int j = getChildCount();
    if ((this.w) && (j > 0))
    {
      e(paramInt1, paramInt2);
    }
    else
    {
      for (i = 0; i < j; i++)
      {
        localObject = (c)getChildAt(i).getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).rightMargin = 0;
        ((ViewGroup.MarginLayoutParams)localObject).leftMargin = 0;
      }
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    this.t.b(paramBoolean);
  }
  
  public void setOnMenuItemClickListener(e parame)
  {
    this.A = parame;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    this.t.a(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    this.s = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (this.r != paramInt)
    {
      this.r = paramInt;
      if (paramInt == 0) {
        this.q = getContext();
      } else {
        this.q = new ContextThemeWrapper(getContext(), paramInt);
      }
    }
  }
  
  public void setPresenter(g paramg)
  {
    this.t = paramg;
    this.t.a(this);
  }
  
  public static abstract interface a
  {
    public abstract boolean fa();
    
    public abstract boolean ga();
  }
  
  private static class b
    implements v.a
  {
    public void a(l paraml, boolean paramBoolean) {}
    
    public boolean a(l paraml)
    {
      return false;
    }
  }
  
  public static class c
    extends pa.a
  {
    @ViewDebug.ExportedProperty
    public boolean c;
    @ViewDebug.ExportedProperty
    public int d;
    @ViewDebug.ExportedProperty
    public int e;
    @ViewDebug.ExportedProperty
    public boolean f;
    @ViewDebug.ExportedProperty
    public boolean g;
    boolean h;
    
    public c(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.c = false;
    }
    
    public c(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public c(c paramc)
    {
      super();
      this.c = paramc.c;
    }
    
    public c(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  private class d
    implements l.a
  {
    d() {}
    
    public void a(l paraml)
    {
      l.a locala = ActionMenuView.this.v;
      if (locala != null) {
        locala.a(paraml);
      }
    }
    
    public boolean a(l paraml, MenuItem paramMenuItem)
    {
      paraml = ActionMenuView.this.A;
      boolean bool;
      if ((paraml != null) && (paraml.onMenuItemClick(paramMenuItem))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface e
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */