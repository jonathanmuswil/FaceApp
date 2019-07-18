package android.support.v7.view.menu;

import Ec;
import Nd;
import Vd;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.e;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class p
  implements Ec
{
  private View A;
  private e B;
  private MenuItem.OnActionExpandListener C;
  private boolean D = false;
  private ContextMenu.ContextMenuInfo E;
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private CharSequence e;
  private CharSequence f;
  private Intent g;
  private char h;
  private int i = 4096;
  private char j;
  private int k = 4096;
  private Drawable l;
  private int m = 0;
  l n;
  private D o;
  private Runnable p;
  private MenuItem.OnMenuItemClickListener q;
  private CharSequence r;
  private CharSequence s;
  private ColorStateList t = null;
  private PorterDuff.Mode u = null;
  private boolean v = false;
  private boolean w = false;
  private boolean x = false;
  private int y = 16;
  private int z = 0;
  
  p(l paraml, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    this.n = paraml;
    this.a = paramInt2;
    this.b = paramInt1;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramCharSequence;
    this.z = paramInt5;
  }
  
  private Drawable a(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      localDrawable = paramDrawable;
      if (this.x) {
        if (!this.v)
        {
          localDrawable = paramDrawable;
          if (!this.w) {}
        }
        else
        {
          localDrawable = a.i(paramDrawable).mutate();
          if (this.v) {
            a.a(localDrawable, this.t);
          }
          if (this.w) {
            a.a(localDrawable, this.u);
          }
          this.x = false;
        }
      }
    }
    return localDrawable;
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 & paramInt2) == paramInt2) {
      paramStringBuilder.append(paramString);
    }
  }
  
  public Ec a(e parame)
  {
    e locale = this.B;
    if (locale != null) {
      locale.f();
    }
    this.A = null;
    this.B = parame;
    this.n.b(true);
    parame = this.B;
    if (parame != null) {
      parame.a(new o(this));
    }
    return this;
  }
  
  public e a()
  {
    return this.B;
  }
  
  CharSequence a(w.a parama)
  {
    if ((parama != null) && (parama.ea())) {
      parama = getTitleCondensed();
    } else {
      parama = getTitle();
    }
    return parama;
  }
  
  public void a(D paramD)
  {
    this.o = paramD;
    paramD.setHeaderTitle(getTitle());
  }
  
  void a(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.E = paramContextMenuInfo;
  }
  
  public void a(boolean paramBoolean)
  {
    this.D = paramBoolean;
    this.n.b(false);
  }
  
  public void b()
  {
    this.n.c(this);
  }
  
  void b(boolean paramBoolean)
  {
    int i1 = this.y;
    int i2;
    if (paramBoolean) {
      i2 = 2;
    } else {
      i2 = 0;
    }
    this.y = (i2 | i1 & 0xFFFFFFFD);
    if (i1 != this.y) {
      this.n.b(false);
    }
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void c(boolean paramBoolean)
  {
    int i1 = this.y;
    int i2;
    if (paramBoolean) {
      i2 = 4;
    } else {
      i2 = 0;
    }
    this.y = (i2 | i1 & 0xFFFFFFFB);
  }
  
  public boolean collapseActionView()
  {
    if ((this.z & 0x8) == 0) {
      return false;
    }
    if (this.A == null) {
      return true;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = this.C;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionCollapse(this))) {
      return false;
    }
    return this.n.a(this);
  }
  
  char d()
  {
    char c1;
    char c2;
    if (this.n.p())
    {
      c1 = this.j;
      c2 = c1;
    }
    else
    {
      c1 = this.h;
      c2 = c1;
    }
    return c2;
  }
  
  public void d(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.y |= 0x20;
    } else {
      this.y &= 0xFFFFFFDF;
    }
  }
  
  String e()
  {
    char c1 = d();
    if (c1 == 0) {
      return "";
    }
    Resources localResources = this.n.e().getResources();
    StringBuilder localStringBuilder = new StringBuilder();
    if (ViewConfiguration.get(this.n.e()).hasPermanentMenuKey()) {
      localStringBuilder.append(localResources.getString(Nd.abc_prepend_shortcut_label));
    }
    int i1;
    if (this.n.p()) {
      i1 = this.k;
    } else {
      i1 = this.i;
    }
    a(localStringBuilder, i1, 65536, localResources.getString(Nd.abc_menu_meta_shortcut_label));
    a(localStringBuilder, i1, 4096, localResources.getString(Nd.abc_menu_ctrl_shortcut_label));
    a(localStringBuilder, i1, 2, localResources.getString(Nd.abc_menu_alt_shortcut_label));
    a(localStringBuilder, i1, 1, localResources.getString(Nd.abc_menu_shift_shortcut_label));
    a(localStringBuilder, i1, 4, localResources.getString(Nd.abc_menu_sym_shortcut_label));
    a(localStringBuilder, i1, 8, localResources.getString(Nd.abc_menu_function_shortcut_label));
    if (c1 != '\b')
    {
      if (c1 != '\n')
      {
        if (c1 != ' ') {
          localStringBuilder.append(c1);
        } else {
          localStringBuilder.append(localResources.getString(Nd.abc_menu_space_shortcut_label));
        }
      }
      else {
        localStringBuilder.append(localResources.getString(Nd.abc_menu_enter_shortcut_label));
      }
    }
    else {
      localStringBuilder.append(localResources.getString(Nd.abc_menu_delete_shortcut_label));
    }
    return localStringBuilder.toString();
  }
  
  boolean e(boolean paramBoolean)
  {
    int i1 = this.y;
    boolean bool = false;
    int i2;
    if (paramBoolean) {
      i2 = 0;
    } else {
      i2 = 8;
    }
    this.y = (i2 | i1 & 0xFFFFFFF7);
    paramBoolean = bool;
    if (i1 != this.y) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public boolean expandActionView()
  {
    if (!f()) {
      return false;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = this.C;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionExpand(this))) {
      return false;
    }
    return this.n.b(this);
  }
  
  public boolean f()
  {
    int i1 = this.z;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((i1 & 0x8) != 0)
    {
      if (this.A == null)
      {
        e locale = this.B;
        if (locale != null) {
          this.A = locale.a(this);
        }
      }
      bool2 = bool1;
      if (this.A != null) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean g()
  {
    Object localObject = this.q;
    if ((localObject != null) && (((MenuItem.OnMenuItemClickListener)localObject).onMenuItemClick(this))) {
      return true;
    }
    localObject = this.n;
    if (((l)localObject).a((l)localObject, this)) {
      return true;
    }
    localObject = this.p;
    if (localObject != null)
    {
      ((Runnable)localObject).run();
      return true;
    }
    if (this.g != null) {
      try
      {
        this.n.e().startActivity(this.g);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
      }
    }
    e locale = this.B;
    return (locale != null) && (locale.d());
  }
  
  public ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public View getActionView()
  {
    Object localObject = this.A;
    if (localObject != null) {
      return (View)localObject;
    }
    localObject = this.B;
    if (localObject != null)
    {
      this.A = ((e)localObject).a(this);
      return this.A;
    }
    return null;
  }
  
  public int getAlphabeticModifiers()
  {
    return this.k;
  }
  
  public char getAlphabeticShortcut()
  {
    return this.j;
  }
  
  public CharSequence getContentDescription()
  {
    return this.r;
  }
  
  public int getGroupId()
  {
    return this.b;
  }
  
  public Drawable getIcon()
  {
    Drawable localDrawable = this.l;
    if (localDrawable != null) {
      return a(localDrawable);
    }
    if (this.m != 0)
    {
      localDrawable = Vd.b(this.n.e(), this.m);
      this.m = 0;
      this.l = localDrawable;
      return a(localDrawable);
    }
    return null;
  }
  
  public ColorStateList getIconTintList()
  {
    return this.t;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return this.u;
  }
  
  public Intent getIntent()
  {
    return this.g;
  }
  
  @ViewDebug.CapturedViewProperty
  public int getItemId()
  {
    return this.a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return this.E;
  }
  
  public int getNumericModifiers()
  {
    return this.i;
  }
  
  public char getNumericShortcut()
  {
    return this.h;
  }
  
  public int getOrder()
  {
    return this.c;
  }
  
  public SubMenu getSubMenu()
  {
    return this.o;
  }
  
  @ViewDebug.CapturedViewProperty
  public CharSequence getTitle()
  {
    return this.e;
  }
  
  public CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = this.f;
    if (localCharSequence == null) {
      localCharSequence = this.e;
    }
    Object localObject = localCharSequence;
    if (Build.VERSION.SDK_INT < 18)
    {
      localObject = localCharSequence;
      if (localCharSequence != null)
      {
        localObject = localCharSequence;
        if (!(localCharSequence instanceof String)) {
          localObject = localCharSequence.toString();
        }
      }
    }
    return (CharSequence)localObject;
  }
  
  public CharSequence getTooltipText()
  {
    return this.s;
  }
  
  public boolean h()
  {
    boolean bool;
    if ((this.y & 0x20) == 32) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean hasSubMenu()
  {
    boolean bool;
    if (this.o != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    boolean bool;
    if ((this.y & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isActionViewExpanded()
  {
    return this.D;
  }
  
  public boolean isCheckable()
  {
    int i1 = this.y;
    boolean bool = true;
    if ((i1 & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isChecked()
  {
    boolean bool;
    if ((this.y & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEnabled()
  {
    boolean bool;
    if ((this.y & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isVisible()
  {
    e locale = this.B;
    boolean bool1 = true;
    boolean bool2 = true;
    if ((locale != null) && (locale.e()))
    {
      if (((this.y & 0x8) != 0) || (!this.B.b())) {
        bool2 = false;
      }
      return bool2;
    }
    if ((this.y & 0x8) == 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean j()
  {
    int i1 = this.z;
    boolean bool = true;
    if ((i1 & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean k()
  {
    boolean bool;
    if ((this.z & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean l()
  {
    return this.n.k();
  }
  
  boolean m()
  {
    boolean bool;
    if ((this.n.q()) && (d() != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean n()
  {
    boolean bool;
    if ((this.z & 0x4) == 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public Ec setActionView(int paramInt)
  {
    Context localContext = this.n.e();
    setActionView(LayoutInflater.from(localContext).inflate(paramInt, new LinearLayout(localContext), false));
    return this;
  }
  
  public Ec setActionView(View paramView)
  {
    this.A = paramView;
    this.B = null;
    if ((paramView != null) && (paramView.getId() == -1))
    {
      int i1 = this.a;
      if (i1 > 0) {
        paramView.setId(i1);
      }
    }
    this.n.c(this);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (this.j == paramChar) {
      return this;
    }
    this.j = Character.toLowerCase(paramChar);
    this.n.b(false);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    if ((this.j == paramChar) && (this.k == paramInt)) {
      return this;
    }
    this.j = Character.toLowerCase(paramChar);
    this.k = KeyEvent.normalizeMetaState(paramInt);
    this.n.b(false);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = this.y;
    this.y = (paramBoolean | i1 & 0xFFFFFFFE);
    if (i1 != this.y) {
      this.n.b(false);
    }
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    if ((this.y & 0x4) != 0) {
      this.n.a(this);
    } else {
      b(paramBoolean);
    }
    return this;
  }
  
  public Ec setContentDescription(CharSequence paramCharSequence)
  {
    this.r = paramCharSequence;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.y |= 0x10;
    } else {
      this.y &= 0xFFFFFFEF;
    }
    this.n.b(false);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    this.l = null;
    this.m = paramInt;
    this.x = true;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    this.m = 0;
    this.l = paramDrawable;
    this.x = true;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    this.t = paramColorStateList;
    this.v = true;
    this.x = true;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    this.u = paramMode;
    this.w = true;
    this.x = true;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    this.g = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    if (this.h == paramChar) {
      return this;
    }
    this.h = ((char)paramChar);
    this.n.b(false);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    if ((this.h == paramChar) && (this.i == paramInt)) {
      return this;
    }
    this.h = ((char)paramChar);
    this.i = KeyEvent.normalizeMetaState(paramInt);
    this.n.b(false);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    this.C = paramOnActionExpandListener;
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.q = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    this.h = ((char)paramChar1);
    this.j = Character.toLowerCase(paramChar2);
    this.n.b(false);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    this.h = ((char)paramChar1);
    this.i = KeyEvent.normalizeMetaState(paramInt1);
    this.j = Character.toLowerCase(paramChar2);
    this.k = KeyEvent.normalizeMetaState(paramInt2);
    this.n.b(false);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    int i1 = paramInt & 0x3;
    if ((i1 != 0) && (i1 != 1) && (i1 != 2)) {
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    this.z = paramInt;
    this.n.c(this);
  }
  
  public Ec setShowAsActionFlags(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    setTitle(this.n.e().getString(paramInt));
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    this.e = paramCharSequence;
    this.n.b(false);
    D localD = this.o;
    if (localD != null) {
      localD.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    this.f = paramCharSequence;
    if (paramCharSequence == null) {
      paramCharSequence = this.e;
    }
    this.n.b(false);
    return this;
  }
  
  public Ec setTooltipText(CharSequence paramCharSequence)
  {
    this.s = paramCharSequence;
    this.n.b(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    if (e(paramBoolean)) {
      this.n.d(this);
    }
    return this;
  }
  
  public String toString()
  {
    Object localObject = this.e;
    if (localObject != null) {
      localObject = ((CharSequence)localObject).toString();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/view/menu/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */