package android.support.v7.view.menu;

import Jd;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.f;
import android.support.v4.view.y;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class u
  implements n
{
  private final Context a;
  private final l b;
  private final boolean c;
  private final int d;
  private final int e;
  private View f;
  private int g = 8388611;
  private boolean h;
  private v.a i;
  private s j;
  private PopupWindow.OnDismissListener k;
  private final PopupWindow.OnDismissListener l = new t(this);
  
  public u(Context paramContext, l paraml, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paraml, paramView, paramBoolean, paramInt, 0);
  }
  
  public u(Context paramContext, l paraml, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    this.b = paraml;
    this.f = paramView;
    this.c = paramBoolean;
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    s locals = b();
    locals.c(paramBoolean2);
    if (paramBoolean1)
    {
      int m = paramInt1;
      if ((f.a(this.g, y.l(this.f)) & 0x7) == 5) {
        m = paramInt1 - this.f.getWidth();
      }
      locals.b(m);
      locals.c(paramInt2);
      paramInt1 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      locals.a(new Rect(m - paramInt1, paramInt2 - paramInt1, m + paramInt1, paramInt2 + paramInt1));
    }
    locals.K();
  }
  
  private s g()
  {
    Display localDisplay = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
    Object localObject = new Point();
    if (Build.VERSION.SDK_INT >= 17) {
      localDisplay.getRealSize((Point)localObject);
    } else {
      localDisplay.getSize((Point)localObject);
    }
    int m;
    if (Math.min(((Point)localObject).x, ((Point)localObject).y) >= this.a.getResources().getDimensionPixelSize(Jd.abc_cascading_menus_min_smallest_width)) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0) {
      localObject = new i(this.a, this.f, this.d, this.e, this.c);
    } else {
      localObject = new C(this.a, this.b, this.f, this.d, this.e, this.c);
    }
    ((s)localObject).a(this.b);
    ((s)localObject).a(this.l);
    ((s)localObject).a(this.f);
    ((v)localObject).a(this.i);
    ((s)localObject).b(this.h);
    ((s)localObject).a(this.g);
    return (s)localObject;
  }
  
  public void a()
  {
    if (c()) {
      this.j.dismiss();
    }
  }
  
  public void a(int paramInt)
  {
    this.g = paramInt;
  }
  
  public void a(v.a parama)
  {
    this.i = parama;
    s locals = this.j;
    if (locals != null) {
      locals.a(parama);
    }
  }
  
  public void a(View paramView)
  {
    this.f = paramView;
  }
  
  public void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.k = paramOnDismissListener;
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    s locals = this.j;
    if (locals != null) {
      locals.b(paramBoolean);
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    if (c()) {
      return true;
    }
    if (this.f == null) {
      return false;
    }
    a(paramInt1, paramInt2, true, true);
    return true;
  }
  
  public s b()
  {
    if (this.j == null) {
      this.j = g();
    }
    return this.j;
  }
  
  public boolean c()
  {
    s locals = this.j;
    boolean bool;
    if ((locals != null) && (locals.L())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void d()
  {
    this.j = null;
    PopupWindow.OnDismissListener localOnDismissListener = this.k;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public void e()
  {
    if (f()) {
      return;
    }
    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
  }
  
  public boolean f()
  {
    if (c()) {
      return true;
    }
    if (this.f == null) {
      return false;
    }
    a(0, 0, false, false);
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */