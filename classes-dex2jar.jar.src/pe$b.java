import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.e;
import android.support.v4.view.j;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.widget.fa;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

class pe$b
{
  e A;
  private CharSequence B;
  private CharSequence C;
  private ColorStateList D = null;
  private PorterDuff.Mode E = null;
  private Menu a;
  private int b;
  private int c;
  private int d;
  private int e;
  private boolean f;
  private boolean g;
  private boolean h;
  private int i;
  private int j;
  private CharSequence k;
  private CharSequence l;
  private int m;
  private char n;
  private int o;
  private char p;
  private int q;
  private int r;
  private boolean s;
  private boolean t;
  private boolean u;
  private int v;
  private int w;
  private String x;
  private String y;
  private String z;
  
  public pe$b(pe parampe, Menu paramMenu)
  {
    this.a = paramMenu;
    d();
  }
  
  private char a(String paramString)
  {
    if (paramString == null) {
      return '\000';
    }
    return paramString.charAt(0);
  }
  
  private <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramArrayOfClass = this.F.e.getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
      return paramArrayOfClass;
    }
    catch (Exception paramArrayOfClass)
    {
      paramArrayOfObject = new StringBuilder();
      paramArrayOfObject.append("Cannot instantiate class: ");
      paramArrayOfObject.append(paramString);
      Log.w("SupportMenuInflater", paramArrayOfObject.toString(), paramArrayOfClass);
    }
    return null;
  }
  
  private void a(MenuItem paramMenuItem)
  {
    Object localObject = paramMenuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
    int i1 = this.r;
    int i2 = 0;
    if (i1 >= 1) {
      bool = true;
    } else {
      bool = false;
    }
    ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.l).setIcon(this.m);
    i1 = this.v;
    if (i1 >= 0) {
      paramMenuItem.setShowAsAction(i1);
    }
    if (this.z != null) {
      if (!this.F.e.isRestricted()) {
        paramMenuItem.setOnMenuItemClickListener(new pe.a(this.F.a(), this.z));
      } else {
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
    }
    boolean bool = paramMenuItem instanceof p;
    if (bool) {
      localObject = (p)paramMenuItem;
    }
    if (this.r >= 2) {
      if (bool) {
        ((p)paramMenuItem).c(true);
      } else if ((paramMenuItem instanceof q)) {
        ((q)paramMenuItem).a(true);
      }
    }
    localObject = this.x;
    if (localObject != null)
    {
      paramMenuItem.setActionView((View)a((String)localObject, pe.a, this.F.c));
      i2 = 1;
    }
    i1 = this.w;
    if (i1 > 0) {
      if (i2 == 0) {
        paramMenuItem.setActionView(i1);
      } else {
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
    }
    localObject = this.A;
    if (localObject != null) {
      j.a(paramMenuItem, (e)localObject);
    }
    j.a(paramMenuItem, this.B);
    j.b(paramMenuItem, this.C);
    j.a(paramMenuItem, this.n, this.o);
    j.b(paramMenuItem, this.p, this.q);
    localObject = this.E;
    if (localObject != null) {
      j.a(paramMenuItem, (PorterDuff.Mode)localObject);
    }
    localObject = this.D;
    if (localObject != null) {
      j.a(paramMenuItem, (ColorStateList)localObject);
    }
  }
  
  public void a()
  {
    this.h = true;
    a(this.a.add(this.b, this.i, this.j, this.k));
  }
  
  public void a(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = this.F.e.obtainStyledAttributes(paramAttributeSet, Pd.MenuGroup);
    this.b = paramAttributeSet.getResourceId(Pd.MenuGroup_android_id, 0);
    this.c = paramAttributeSet.getInt(Pd.MenuGroup_android_menuCategory, 0);
    this.d = paramAttributeSet.getInt(Pd.MenuGroup_android_orderInCategory, 0);
    this.e = paramAttributeSet.getInt(Pd.MenuGroup_android_checkableBehavior, 0);
    this.f = paramAttributeSet.getBoolean(Pd.MenuGroup_android_visible, true);
    this.g = paramAttributeSet.getBoolean(Pd.MenuGroup_android_enabled, true);
    paramAttributeSet.recycle();
  }
  
  public SubMenu b()
  {
    this.h = true;
    SubMenu localSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
    a(localSubMenu.getItem());
    return localSubMenu;
  }
  
  public void b(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = this.F.e.obtainStyledAttributes(paramAttributeSet, Pd.MenuItem);
    this.i = paramAttributeSet.getResourceId(Pd.MenuItem_android_id, 0);
    this.j = (paramAttributeSet.getInt(Pd.MenuItem_android_menuCategory, this.c) & 0xFFFF0000 | paramAttributeSet.getInt(Pd.MenuItem_android_orderInCategory, this.d) & 0xFFFF);
    this.k = paramAttributeSet.getText(Pd.MenuItem_android_title);
    this.l = paramAttributeSet.getText(Pd.MenuItem_android_titleCondensed);
    this.m = paramAttributeSet.getResourceId(Pd.MenuItem_android_icon, 0);
    this.n = a(paramAttributeSet.getString(Pd.MenuItem_android_alphabeticShortcut));
    this.o = paramAttributeSet.getInt(Pd.MenuItem_alphabeticModifiers, 4096);
    this.p = a(paramAttributeSet.getString(Pd.MenuItem_android_numericShortcut));
    this.q = paramAttributeSet.getInt(Pd.MenuItem_numericModifiers, 4096);
    if (paramAttributeSet.hasValue(Pd.MenuItem_android_checkable)) {
      this.r = paramAttributeSet.getBoolean(Pd.MenuItem_android_checkable, false);
    } else {
      this.r = this.e;
    }
    this.s = paramAttributeSet.getBoolean(Pd.MenuItem_android_checked, false);
    this.t = paramAttributeSet.getBoolean(Pd.MenuItem_android_visible, this.f);
    this.u = paramAttributeSet.getBoolean(Pd.MenuItem_android_enabled, this.g);
    this.v = paramAttributeSet.getInt(Pd.MenuItem_showAsAction, -1);
    this.z = paramAttributeSet.getString(Pd.MenuItem_android_onClick);
    this.w = paramAttributeSet.getResourceId(Pd.MenuItem_actionLayout, 0);
    this.x = paramAttributeSet.getString(Pd.MenuItem_actionViewClass);
    this.y = paramAttributeSet.getString(Pd.MenuItem_actionProviderClass);
    int i1;
    if (this.y != null) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((i1 != 0) && (this.w == 0) && (this.x == null))
    {
      this.A = ((e)a(this.y, pe.b, this.F.d));
    }
    else
    {
      if (i1 != 0) {
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
      }
      this.A = null;
    }
    this.B = paramAttributeSet.getText(Pd.MenuItem_contentDescription);
    this.C = paramAttributeSet.getText(Pd.MenuItem_tooltipText);
    if (paramAttributeSet.hasValue(Pd.MenuItem_iconTintMode)) {
      this.E = fa.a(paramAttributeSet.getInt(Pd.MenuItem_iconTintMode, -1), this.E);
    } else {
      this.E = null;
    }
    if (paramAttributeSet.hasValue(Pd.MenuItem_iconTint)) {
      this.D = paramAttributeSet.getColorStateList(Pd.MenuItem_iconTint);
    } else {
      this.D = null;
    }
    paramAttributeSet.recycle();
    this.h = false;
  }
  
  public boolean c()
  {
    return this.h;
  }
  
  public void d()
  {
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = 0;
    this.f = true;
    this.g = true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pe$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */