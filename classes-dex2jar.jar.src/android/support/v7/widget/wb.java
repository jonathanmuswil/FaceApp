package android.support.v7.widget;

import Gd;
import Kd;
import Ld;
import Nd;
import Pd;
import Vd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.J;
import android.support.v4.view.y;
import android.support.v7.app.a.a;
import android.support.v7.view.menu.b;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.v.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;

public class wb
  implements V
{
  Toolbar a;
  private int b;
  private View c;
  private View d;
  private Drawable e;
  private Drawable f;
  private Drawable g;
  private boolean h;
  CharSequence i;
  private CharSequence j;
  private CharSequence k;
  Window.Callback l;
  boolean m;
  private g n;
  private int o = 0;
  private int p = 0;
  private Drawable q;
  
  public wb(Toolbar paramToolbar, boolean paramBoolean)
  {
    this(paramToolbar, paramBoolean, Nd.abc_action_bar_up_description, Kd.abc_ic_ab_back_material);
  }
  
  public wb(Toolbar paramToolbar, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramToolbar;
    this.i = paramToolbar.getTitle();
    this.j = paramToolbar.getSubtitle();
    boolean bool;
    if (this.i != null) {
      bool = true;
    } else {
      bool = false;
    }
    this.h = bool;
    this.g = paramToolbar.getNavigationIcon();
    paramToolbar = pb.a(paramToolbar.getContext(), null, Pd.ActionBar, Gd.actionBarStyle, 0);
    this.q = paramToolbar.b(Pd.ActionBar_homeAsUpIndicator);
    if (paramBoolean)
    {
      Object localObject = paramToolbar.e(Pd.ActionBar_title);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        c((CharSequence)localObject);
      }
      localObject = paramToolbar.e(Pd.ActionBar_subtitle);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        b((CharSequence)localObject);
      }
      localObject = paramToolbar.b(Pd.ActionBar_logo);
      if (localObject != null) {
        a((Drawable)localObject);
      }
      localObject = paramToolbar.b(Pd.ActionBar_icon);
      if (localObject != null) {
        setIcon((Drawable)localObject);
      }
      if (this.g == null)
      {
        localObject = this.q;
        if (localObject != null) {
          b((Drawable)localObject);
        }
      }
      a(paramToolbar.d(Pd.ActionBar_displayOptions, 0));
      paramInt2 = paramToolbar.g(Pd.ActionBar_customNavigationLayout, 0);
      if (paramInt2 != 0)
      {
        a(LayoutInflater.from(this.a.getContext()).inflate(paramInt2, this.a, false));
        a(this.b | 0x10);
      }
      paramInt2 = paramToolbar.f(Pd.ActionBar_height, 0);
      if (paramInt2 > 0)
      {
        localObject = this.a.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = paramInt2;
        this.a.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      int i1 = paramToolbar.b(Pd.ActionBar_contentInsetStart, -1);
      paramInt2 = paramToolbar.b(Pd.ActionBar_contentInsetEnd, -1);
      if ((i1 >= 0) || (paramInt2 >= 0)) {
        this.a.a(Math.max(i1, 0), Math.max(paramInt2, 0));
      }
      paramInt2 = paramToolbar.g(Pd.ActionBar_titleTextStyle, 0);
      if (paramInt2 != 0)
      {
        localObject = this.a;
        ((Toolbar)localObject).b(((ViewGroup)localObject).getContext(), paramInt2);
      }
      paramInt2 = paramToolbar.g(Pd.ActionBar_subtitleTextStyle, 0);
      if (paramInt2 != 0)
      {
        localObject = this.a;
        ((Toolbar)localObject).a(((ViewGroup)localObject).getContext(), paramInt2);
      }
      paramInt2 = paramToolbar.g(Pd.ActionBar_popupTheme, 0);
      if (paramInt2 != 0) {
        this.a.setPopupTheme(paramInt2);
      }
    }
    else
    {
      this.b = n();
    }
    paramToolbar.a();
    d(paramInt1);
    this.k = this.a.getNavigationContentDescription();
    this.a.setNavigationOnClickListener(new ub(this));
  }
  
  private void d(CharSequence paramCharSequence)
  {
    this.i = paramCharSequence;
    if ((this.b & 0x8) != 0) {
      this.a.setTitle(paramCharSequence);
    }
  }
  
  private int n()
  {
    int i1;
    if (this.a.getNavigationIcon() != null)
    {
      i1 = 15;
      this.q = this.a.getNavigationIcon();
    }
    else
    {
      i1 = 11;
    }
    return i1;
  }
  
  private void o()
  {
    if ((this.b & 0x4) != 0) {
      if (TextUtils.isEmpty(this.k)) {
        this.a.setNavigationContentDescription(this.p);
      } else {
        this.a.setNavigationContentDescription(this.k);
      }
    }
  }
  
  private void p()
  {
    if ((this.b & 0x4) != 0)
    {
      Toolbar localToolbar = this.a;
      Drawable localDrawable = this.g;
      if (localDrawable == null) {
        localDrawable = this.q;
      }
      localToolbar.setNavigationIcon(localDrawable);
    }
    else
    {
      this.a.setNavigationIcon(null);
    }
  }
  
  private void q()
  {
    int i1 = this.b;
    Drawable localDrawable;
    if ((i1 & 0x2) != 0)
    {
      if ((i1 & 0x1) != 0)
      {
        localDrawable = this.f;
        if (localDrawable == null) {
          localDrawable = this.e;
        }
      }
      else
      {
        localDrawable = this.e;
      }
    }
    else {
      localDrawable = null;
    }
    this.a.setLogo(localDrawable);
  }
  
  public J a(int paramInt, long paramLong)
  {
    J localJ = y.a(this.a);
    float f1;
    if (paramInt == 0) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    }
    localJ.a(f1);
    localJ.a(paramLong);
    localJ.a(new vb(this, paramInt));
    return localJ;
  }
  
  public void a(int paramInt)
  {
    int i1 = this.b ^ paramInt;
    this.b = paramInt;
    if (i1 != 0)
    {
      if ((i1 & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0) {
          o();
        }
        p();
      }
      if ((i1 & 0x3) != 0) {
        q();
      }
      if ((i1 & 0x8) != 0) {
        if ((paramInt & 0x8) != 0)
        {
          this.a.setTitle(this.i);
          this.a.setSubtitle(this.j);
        }
        else
        {
          this.a.setTitle(null);
          this.a.setSubtitle(null);
        }
      }
      if ((i1 & 0x10) != 0)
      {
        View localView = this.d;
        if (localView != null) {
          if ((paramInt & 0x10) != 0) {
            this.a.addView(localView);
          } else {
            this.a.removeView(localView);
          }
        }
      }
    }
  }
  
  public void a(Drawable paramDrawable)
  {
    this.f = paramDrawable;
    q();
  }
  
  public void a(Sa paramSa)
  {
    Object localObject = this.c;
    if (localObject != null)
    {
      ViewParent localViewParent = ((View)localObject).getParent();
      localObject = this.a;
      if (localViewParent == localObject) {
        ((ViewGroup)localObject).removeView(this.c);
      }
    }
    this.c = paramSa;
    if ((paramSa != null) && (this.o == 2))
    {
      this.a.addView(this.c, 0);
      localObject = (Toolbar.b)this.c.getLayoutParams();
      ((ViewGroup.MarginLayoutParams)localObject).width = -2;
      ((ViewGroup.MarginLayoutParams)localObject).height = -2;
      ((a.a)localObject).a = 8388691;
      paramSa.setAllowCollapse(true);
    }
  }
  
  public void a(Menu paramMenu, v.a parama)
  {
    if (this.n == null)
    {
      this.n = new g(this.a.getContext());
      this.n.a(Ld.action_menu_presenter);
    }
    this.n.a(parama);
    this.a.a((l)paramMenu, this.n);
  }
  
  public void a(View paramView)
  {
    View localView = this.d;
    if ((localView != null) && ((this.b & 0x10) != 0)) {
      this.a.removeView(localView);
    }
    this.d = paramView;
    if ((paramView != null) && ((this.b & 0x10) != 0)) {
      this.a.addView(this.d);
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.k = paramCharSequence;
    o();
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean a()
  {
    return this.a.i();
  }
  
  public void b()
  {
    this.m = true;
  }
  
  public void b(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = Vd.b(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    a(localDrawable);
  }
  
  public void b(Drawable paramDrawable)
  {
    this.g = paramDrawable;
    p();
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.j = paramCharSequence;
    if ((this.b & 0x8) != 0) {
      this.a.setSubtitle(paramCharSequence);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.setCollapsible(paramBoolean);
  }
  
  public void c(int paramInt)
  {
    this.a.setVisibility(paramInt);
  }
  
  public void c(CharSequence paramCharSequence)
  {
    this.h = true;
    d(paramCharSequence);
  }
  
  public boolean c()
  {
    return this.a.b();
  }
  
  public void collapseActionView()
  {
    this.a.c();
  }
  
  public void d(int paramInt)
  {
    if (paramInt == this.p) {
      return;
    }
    this.p = paramInt;
    if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
      e(this.p);
    }
  }
  
  public boolean d()
  {
    return this.a.h();
  }
  
  public void e(int paramInt)
  {
    String str;
    if (paramInt == 0) {
      str = null;
    } else {
      str = getContext().getString(paramInt);
    }
    a(str);
  }
  
  public boolean e()
  {
    return this.a.g();
  }
  
  public boolean f()
  {
    return this.a.k();
  }
  
  public void g()
  {
    this.a.d();
  }
  
  public Context getContext()
  {
    return this.a.getContext();
  }
  
  public CharSequence getTitle()
  {
    return this.a.getTitle();
  }
  
  public boolean h()
  {
    return this.a.f();
  }
  
  public int i()
  {
    return this.o;
  }
  
  public ViewGroup j()
  {
    return this.a;
  }
  
  public int k()
  {
    return this.b;
  }
  
  public void l()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void m()
  {
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public void setIcon(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = Vd.b(getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    setIcon(localDrawable);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.e = paramDrawable;
    q();
  }
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    this.l = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    if (!this.h) {
      d(paramCharSequence);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/wb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */