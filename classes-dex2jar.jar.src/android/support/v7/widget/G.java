package android.support.v7.widget;

import Gd;
import Md;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.e;
import android.support.v4.view.e.a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.b;
import android.support.v7.view.menu.D;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.u;
import android.support.v7.view.menu.v.a;
import android.support.v7.view.menu.w;
import android.support.v7.view.menu.w.a;
import android.support.v7.view.menu.z;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import je;

class g
  extends b
  implements e.a
{
  a A;
  c B;
  private b C;
  final f D = new f();
  int E;
  d k;
  private Drawable l;
  private boolean m;
  private boolean n;
  private boolean o;
  private int p;
  private int q;
  private int r;
  private boolean s;
  private boolean t;
  private boolean u;
  private boolean v;
  private int w;
  private final SparseBooleanArray x = new SparseBooleanArray();
  private View y;
  e z;
  
  public g(Context paramContext)
  {
    super(paramContext, Md.abc_action_menu_layout, Md.abc_action_menu_item_layout);
  }
  
  private View a(MenuItem paramMenuItem)
  {
    ViewGroup localViewGroup = (ViewGroup)this.i;
    if (localViewGroup == null) {
      return null;
    }
    int i = localViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = localViewGroup.getChildAt(j);
      if (((localView instanceof w.a)) && (((w.a)localView).getItemData() == paramMenuItem)) {
        return localView;
      }
    }
    return null;
  }
  
  public View a(p paramp, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramp.getActionView();
    if ((localView == null) || (paramp.f())) {
      localView = super.a(paramp, paramView, paramViewGroup);
    }
    int i;
    if (paramp.isActionViewExpanded()) {
      i = 8;
    } else {
      i = 0;
    }
    localView.setVisibility(i);
    paramp = (ActionMenuView)paramViewGroup;
    paramView = localView.getLayoutParams();
    if (!paramp.checkLayoutParams(paramView)) {
      localView.setLayoutParams(paramp.generateLayoutParams(paramView));
    }
    return localView;
  }
  
  public void a(Context paramContext, l paraml)
  {
    super.a(paramContext, paraml);
    paraml = paramContext.getResources();
    paramContext = je.a(paramContext);
    if (!this.o) {
      this.n = paramContext.g();
    }
    if (!this.u) {
      this.p = paramContext.b();
    }
    if (!this.s) {
      this.r = paramContext.c();
    }
    int i = this.p;
    if (this.n)
    {
      if (this.k == null)
      {
        this.k = new d(this.a);
        if (this.m)
        {
          this.k.setImageDrawable(this.l);
          this.l = null;
          this.m = false;
        }
        int j = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.k.measure(j, j);
      }
      i -= this.k.getMeasuredWidth();
    }
    else
    {
      this.k = null;
    }
    this.q = i;
    this.w = ((int)(paraml.getDisplayMetrics().density * 56.0F));
    this.y = null;
  }
  
  public void a(Configuration paramConfiguration)
  {
    if (!this.s) {
      this.r = je.a(this.b).c();
    }
    paramConfiguration = this.c;
    if (paramConfiguration != null) {
      paramConfiguration.b(true);
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    d locald = this.k;
    if (locald != null)
    {
      locald.setImageDrawable(paramDrawable);
    }
    else
    {
      this.m = true;
      this.l = paramDrawable;
    }
  }
  
  public void a(l paraml, boolean paramBoolean)
  {
    c();
    super.a(paraml, paramBoolean);
  }
  
  public void a(p paramp, w.a parama)
  {
    parama.a(paramp, 0);
    paramp = (ActionMenuView)this.i;
    parama = (ActionMenuItemView)parama;
    parama.setItemInvoker(paramp);
    if (this.C == null) {
      this.C = new b();
    }
    parama.setPopupCallback(this.C);
  }
  
  public void a(ActionMenuView paramActionMenuView)
  {
    this.i = paramActionMenuView;
    paramActionMenuView.a(this.c);
  }
  
  public void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    ((View)this.i).requestLayout();
    Object localObject1 = this.c;
    int i = 0;
    Object localObject2;
    int j;
    if (localObject1 != null)
    {
      localObject2 = ((l)localObject1).c();
      j = ((ArrayList)localObject2).size();
      for (i1 = 0; i1 < j; i1++)
      {
        localObject1 = ((p)((ArrayList)localObject2).get(i1)).a();
        if (localObject1 != null) {
          ((e)localObject1).a(this);
        }
      }
    }
    localObject1 = this.c;
    if (localObject1 != null) {
      localObject1 = ((l)localObject1).j();
    } else {
      localObject1 = null;
    }
    int i1 = i;
    boolean bool;
    if (this.n)
    {
      i1 = i;
      if (localObject1 != null)
      {
        j = ((ArrayList)localObject1).size();
        if (j == 1)
        {
          bool = ((p)((ArrayList)localObject1).get(0)).isActionViewExpanded() ^ true;
        }
        else
        {
          bool = i;
          if (j > 0) {
            bool = true;
          }
        }
      }
    }
    if (bool)
    {
      if (this.k == null) {
        this.k = new d(this.a);
      }
      localObject1 = (ViewGroup)this.k.getParent();
      if (localObject1 != this.i)
      {
        if (localObject1 != null) {
          ((ViewGroup)localObject1).removeView(this.k);
        }
        localObject1 = (ActionMenuView)this.i;
        ((ViewGroup)localObject1).addView(this.k, ((ActionMenuView)localObject1).b());
      }
    }
    else
    {
      localObject1 = this.k;
      if (localObject1 != null)
      {
        localObject1 = ((ImageView)localObject1).getParent();
        localObject2 = this.i;
        if (localObject1 == localObject2) {
          ((ViewGroup)localObject2).removeView(this.k);
        }
      }
    }
    ((ActionMenuView)this.i).setOverflowReserved(this.n);
  }
  
  public boolean a()
  {
    Object localObject1 = this;
    Object localObject2 = ((b)localObject1).c;
    int i;
    if (localObject2 != null)
    {
      localObject2 = ((l)localObject2).n();
      i = ((ArrayList)localObject2).size();
    }
    else
    {
      localObject2 = null;
      i = 0;
    }
    int j = ((g)localObject1).r;
    int i1 = ((g)localObject1).q;
    int i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
    ViewGroup localViewGroup = (ViewGroup)((b)localObject1).i;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    while (i3 < i)
    {
      localObject3 = (p)((ArrayList)localObject2).get(i3);
      if (((p)localObject3).k()) {
        i5++;
      } else if (((p)localObject3).j()) {
        i6++;
      } else {
        i4 = 1;
      }
      i7 = j;
      if (((g)localObject1).v)
      {
        i7 = j;
        if (((p)localObject3).isActionViewExpanded()) {
          i7 = 0;
        }
      }
      i3++;
      j = i7;
    }
    i3 = j;
    if (((g)localObject1).n) {
      if (i4 == 0)
      {
        i3 = j;
        if (i6 + i5 <= j) {}
      }
      else
      {
        i3 = j - 1;
      }
    }
    j = i3 - i5;
    Object localObject3 = ((g)localObject1).x;
    ((SparseBooleanArray)localObject3).clear();
    if (((g)localObject1).t)
    {
      i5 = ((g)localObject1).w;
      i6 = i1 / i5;
      i4 = i5 + i1 % i5 / i6;
    }
    else
    {
      i4 = 0;
      i6 = 0;
    }
    i3 = i1;
    int i7 = 0;
    i5 = 0;
    i1 = i;
    for (;;)
    {
      localObject1 = this;
      if (i7 >= i1) {
        break;
      }
      p localp = (p)((ArrayList)localObject2).get(i7);
      View localView;
      int i8;
      if (localp.k())
      {
        localView = ((g)localObject1).a(localp, ((g)localObject1).y, localViewGroup);
        if (((g)localObject1).y == null) {
          ((g)localObject1).y = localView;
        }
        if (((g)localObject1).t) {
          i6 -= ActionMenuView.a(localView, i4, i6, i2, 0);
        } else {
          localView.measure(i2, i2);
        }
        i8 = localView.getMeasuredWidth();
        i = i3 - i8;
        if (i5 == 0) {
          i5 = i8;
        }
        i3 = localp.getGroupId();
        if (i3 != 0) {
          ((SparseBooleanArray)localObject3).put(i3, true);
        }
        localp.d(true);
      }
      for (;;)
      {
        break;
        if (localp.j())
        {
          int i9 = localp.getGroupId();
          boolean bool = ((SparseBooleanArray)localObject3).get(i9);
          int i10;
          if (((j > 0) || (bool)) && (i3 > 0) && ((!((g)localObject1).t) || (i6 > 0))) {
            i10 = 1;
          } else {
            i10 = 0;
          }
          if (i10 != 0)
          {
            localView = ((g)localObject1).a(localp, ((g)localObject1).y, localViewGroup);
            if (((g)localObject1).y == null) {
              ((g)localObject1).y = localView;
            }
            if (((g)localObject1).t)
            {
              i8 = ActionMenuView.a(localView, i4, i6, i2, 0);
              i = i6 - i8;
              i6 = i;
              if (i8 == 0)
              {
                i10 = 0;
                i6 = i;
              }
            }
            else
            {
              localView.measure(i2, i2);
            }
            i8 = localView.getMeasuredWidth();
            i = i3 - i8;
            i3 = i5;
            if (i5 == 0) {
              i3 = i8;
            }
            if (((g)localObject1).t ? i >= 0 : i + i3 > 0) {
              i5 = 1;
            } else {
              i5 = 0;
            }
            i10 &= i5;
            i5 = i3;
          }
          else
          {
            i = i3;
          }
          if ((i10 != 0) && (i9 != 0))
          {
            ((SparseBooleanArray)localObject3).put(i9, true);
            i3 = j;
          }
          else
          {
            i3 = j;
            if (bool)
            {
              ((SparseBooleanArray)localObject3).put(i9, false);
              i8 = 0;
              for (;;)
              {
                i3 = j;
                if (i8 >= i7) {
                  break;
                }
                localObject1 = (p)((ArrayList)localObject2).get(i8);
                i3 = j;
                if (((p)localObject1).getGroupId() == i9)
                {
                  i3 = j;
                  if (((p)localObject1).h()) {
                    i3 = j + 1;
                  }
                  ((p)localObject1).d(false);
                }
                i8++;
                j = i3;
              }
            }
          }
          j = i3;
          if (i10 != 0) {
            j = i3 - 1;
          }
          localp.d(i10);
        }
        else
        {
          localp.d(false);
          i = i3;
        }
      }
      i7++;
      i3 = i;
    }
    return true;
  }
  
  public boolean a(int paramInt, p paramp)
  {
    return paramp.h();
  }
  
  public boolean a(D paramD)
  {
    boolean bool1 = paramD.hasVisibleItems();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    for (Object localObject = paramD; ((D)localObject).t() != this.c; localObject = (D)((D)localObject).t()) {}
    View localView = a(((D)localObject).getItem());
    if (localView == null) {
      return false;
    }
    this.E = paramD.getItem().getItemId();
    int i = paramD.size();
    for (int j = 0;; j++)
    {
      bool1 = bool2;
      if (j >= i) {
        break;
      }
      localObject = paramD.getItem(j);
      if ((((MenuItem)localObject).isVisible()) && (((MenuItem)localObject).getIcon() != null))
      {
        bool1 = true;
        break;
      }
    }
    this.A = new a(this.b, paramD, localView);
    this.A.a(bool1);
    this.A.e();
    super.a(paramD);
    return true;
  }
  
  public boolean a(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramViewGroup.getChildAt(paramInt) == this.k) {
      return false;
    }
    return super.a(paramViewGroup, paramInt);
  }
  
  public w b(ViewGroup paramViewGroup)
  {
    w localw = this.i;
    paramViewGroup = super.b(paramViewGroup);
    if (localw != paramViewGroup) {
      ((ActionMenuView)paramViewGroup).setPresenter(this);
    }
    return paramViewGroup;
  }
  
  public void b(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.n = paramBoolean;
    this.o = true;
  }
  
  public boolean c()
  {
    return e() | f();
  }
  
  public Drawable d()
  {
    d locald = this.k;
    if (locald != null) {
      return locald.getDrawable();
    }
    if (this.m) {
      return this.l;
    }
    return null;
  }
  
  public boolean e()
  {
    Object localObject = this.B;
    if (localObject != null)
    {
      w localw = this.i;
      if (localw != null)
      {
        ((View)localw).removeCallbacks((Runnable)localObject);
        this.B = null;
        return true;
      }
    }
    localObject = this.z;
    if (localObject != null)
    {
      ((u)localObject).a();
      return true;
    }
    return false;
  }
  
  public boolean f()
  {
    a locala = this.A;
    if (locala != null)
    {
      locala.a();
      return true;
    }
    return false;
  }
  
  public boolean g()
  {
    boolean bool;
    if ((this.B == null) && (!h())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean h()
  {
    e locale = this.z;
    boolean bool;
    if ((locale != null) && (locale.c())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    if ((this.n) && (!h()))
    {
      l locall = this.c;
      if ((locall != null) && (this.i != null) && (this.B == null) && (!locall.j().isEmpty()))
      {
        this.B = new c(new e(this.b, this.c, this.k, true));
        ((View)this.i).post(this.B);
        super.a(null);
        return true;
      }
    }
    return false;
  }
  
  private class a
    extends u
  {
    public a(Context paramContext, D paramD, View paramView)
    {
      super(paramD, paramView, false, Gd.actionOverflowMenuStyle);
      if (!((p)paramD.getItem()).h())
      {
        paramD = g.this.k;
        paramContext = paramD;
        if (paramD == null) {
          paramContext = (View)g.c(g.this);
        }
        a(paramContext);
      }
      a(g.this.D);
    }
    
    protected void d()
    {
      g localg = g.this;
      localg.A = null;
      localg.E = 0;
      super.d();
    }
  }
  
  private class b
    extends ActionMenuItemView.b
  {
    b() {}
    
    public z a()
    {
      Object localObject = g.this.A;
      if (localObject != null) {
        localObject = ((u)localObject).b();
      } else {
        localObject = null;
      }
      return (z)localObject;
    }
  }
  
  private class c
    implements Runnable
  {
    private g.e a;
    
    public c(g.e parame)
    {
      this.a = parame;
    }
    
    public void run()
    {
      if (g.d(g.this) != null) {
        g.e(g.this).a();
      }
      View localView = (View)g.f(g.this);
      if ((localView != null) && (localView.getWindowToken() != null) && (this.a.f())) {
        g.this.z = this.a;
      }
      g.this.B = null;
    }
  }
  
  private class d
    extends AppCompatImageView
    implements ActionMenuView.a
  {
    private final float[] c = new float[2];
    
    public d(Context paramContext)
    {
      super(null, Gd.actionOverflowButtonStyle);
      setClickable(true);
      setFocusable(true);
      setVisibility(0);
      setEnabled(true);
      xb.a(this, getContentDescription());
      setOnTouchListener(new h(this, this, g.this));
    }
    
    public boolean fa()
    {
      return false;
    }
    
    public boolean ga()
    {
      return false;
    }
    
    public boolean performClick()
    {
      if (super.performClick()) {
        return true;
      }
      playSoundEffect(0);
      g.this.i();
      return true;
    }
    
    protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
      Drawable localDrawable1 = getDrawable();
      Drawable localDrawable2 = getBackground();
      if ((localDrawable1 != null) && (localDrawable2 != null))
      {
        int i = getWidth();
        paramInt4 = getHeight();
        paramInt1 = Math.max(i, paramInt4) / 2;
        int j = getPaddingLeft();
        int k = getPaddingRight();
        paramInt3 = getPaddingTop();
        paramInt2 = getPaddingBottom();
        j = (i + (j - k)) / 2;
        paramInt2 = (paramInt4 + (paramInt3 - paramInt2)) / 2;
        a.a(localDrawable2, j - paramInt1, paramInt2 - paramInt1, j + paramInt1, paramInt2 + paramInt1);
      }
      return bool;
    }
  }
  
  private class e
    extends u
  {
    public e(Context paramContext, l paraml, View paramView, boolean paramBoolean)
    {
      super(paraml, paramView, paramBoolean, Gd.actionOverflowMenuStyle);
      a(8388613);
      a(g.this.D);
    }
    
    protected void d()
    {
      if (g.a(g.this) != null) {
        g.b(g.this).close();
      }
      g.this.z = null;
      super.d();
    }
  }
  
  private class f
    implements v.a
  {
    f() {}
    
    public void a(l paraml, boolean paramBoolean)
    {
      if ((paraml instanceof D)) {
        paraml.m().a(false);
      }
      v.a locala = g.this.b();
      if (locala != null) {
        locala.a(paraml, paramBoolean);
      }
    }
    
    public boolean a(l paraml)
    {
      boolean bool = false;
      if (paraml == null) {
        return false;
      }
      g.this.E = ((D)paraml).getItem().getItemId();
      v.a locala = g.this.b();
      if (locala != null) {
        bool = locala.a(paraml);
      }
      return bool;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */