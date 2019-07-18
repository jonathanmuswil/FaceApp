package android.support.v7.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;
import rc;

public class Preference
  implements Comparable<Preference>
{
  private boolean A = true;
  private int B = h.preference;
  private int C;
  private a D;
  private List<Preference> E;
  private final View.OnClickListener F = new b(this);
  private Context a;
  private e b;
  private c c;
  private b d;
  private c e;
  private int f = Integer.MAX_VALUE;
  private int g = 0;
  private CharSequence h;
  private CharSequence i;
  private int j;
  private String k;
  private Intent l;
  private String m;
  private boolean n = true;
  private boolean o = true;
  private boolean p = true;
  private String q;
  private Object r;
  private boolean s = true;
  private boolean t = true;
  private boolean u = true;
  private boolean v = true;
  private boolean w = true;
  private boolean x;
  private boolean y = true;
  private boolean z;
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, rc.a(paramContext, f.preferenceStyle, 16842894));
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public Preference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.a = paramContext;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.Preference, paramInt1, paramInt2);
    this.j = rc.b(paramContext, i.Preference_icon, i.Preference_android_icon, 0);
    this.k = rc.b(paramContext, i.Preference_key, i.Preference_android_key);
    this.h = rc.c(paramContext, i.Preference_title, i.Preference_android_title);
    this.i = rc.c(paramContext, i.Preference_summary, i.Preference_android_summary);
    this.f = rc.a(paramContext, i.Preference_order, i.Preference_android_order, Integer.MAX_VALUE);
    this.m = rc.b(paramContext, i.Preference_fragment, i.Preference_android_fragment);
    this.B = rc.b(paramContext, i.Preference_layout, i.Preference_android_layout, h.preference);
    this.C = rc.b(paramContext, i.Preference_widgetLayout, i.Preference_android_widgetLayout, 0);
    this.n = rc.a(paramContext, i.Preference_enabled, i.Preference_android_enabled, true);
    this.o = rc.a(paramContext, i.Preference_selectable, i.Preference_android_selectable, true);
    this.p = rc.a(paramContext, i.Preference_persistent, i.Preference_android_persistent, true);
    this.q = rc.b(paramContext, i.Preference_dependency, i.Preference_android_dependency);
    paramInt1 = i.Preference_allowDividerAbove;
    this.v = rc.a(paramContext, paramInt1, paramInt1, this.o);
    paramInt1 = i.Preference_allowDividerBelow;
    this.w = rc.a(paramContext, paramInt1, paramInt1, this.o);
    if (paramContext.hasValue(i.Preference_defaultValue)) {
      this.r = a(paramContext, i.Preference_defaultValue);
    } else if (paramContext.hasValue(i.Preference_android_defaultValue)) {
      this.r = a(paramContext, i.Preference_android_defaultValue);
    }
    this.A = rc.a(paramContext, i.Preference_shouldDisableView, i.Preference_android_shouldDisableView, true);
    this.x = paramContext.hasValue(i.Preference_singleLineTitle);
    if (this.x) {
      this.y = rc.a(paramContext, i.Preference_singleLineTitle, i.Preference_android_singleLineTitle, true);
    }
    this.z = rc.a(paramContext, i.Preference_iconSpaceReserved, i.Preference_android_iconSpaceReserved, false);
    paramInt1 = i.Preference_isPreferenceVisible;
    this.u = rc.a(paramContext, paramInt1, paramInt1, true);
    paramContext.recycle();
  }
  
  protected int a(int paramInt)
  {
    if (!z()) {
      return paramInt;
    }
    c localc = e();
    if (localc != null) {
      return localc.a(this.k, paramInt);
    }
    this.b.e();
    throw null;
  }
  
  public int a(Preference paramPreference)
  {
    int i1 = this.f;
    int i2 = paramPreference.f;
    if (i1 != i2) {
      return i1 - i2;
    }
    CharSequence localCharSequence1 = this.h;
    CharSequence localCharSequence2 = paramPreference.h;
    if (localCharSequence1 == localCharSequence2) {
      return 0;
    }
    if (localCharSequence1 == null) {
      return 1;
    }
    if (localCharSequence2 == null) {
      return -1;
    }
    return localCharSequence1.toString().compareToIgnoreCase(paramPreference.h.toString());
  }
  
  public Context a()
  {
    return this.a;
  }
  
  protected Object a(TypedArray paramTypedArray, int paramInt)
  {
    return null;
  }
  
  protected String a(String paramString)
  {
    if (!z()) {
      return paramString;
    }
    c localc = e();
    if (localc != null) {
      return localc.a(this.k, paramString);
    }
    this.b.e();
    throw null;
  }
  
  public void a(Preference paramPreference, boolean paramBoolean)
  {
    if (this.s == paramBoolean)
    {
      this.s = (paramBoolean ^ true);
      b(y());
      l();
    }
  }
  
  protected void a(View paramView)
  {
    x();
  }
  
  public boolean a(Object paramObject)
  {
    b localb = this.d;
    boolean bool;
    if ((localb != null) && (!localb.a(this, paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  protected boolean a(boolean paramBoolean)
  {
    if (!z()) {
      return paramBoolean;
    }
    c localc = e();
    if (localc != null) {
      return localc.a(this.k, paramBoolean);
    }
    this.b.e();
    throw null;
  }
  
  StringBuilder b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    CharSequence localCharSequence = h();
    if (!TextUtils.isEmpty(localCharSequence))
    {
      localStringBuilder.append(localCharSequence);
      localStringBuilder.append(' ');
    }
    localCharSequence = g();
    if (!TextUtils.isEmpty(localCharSequence))
    {
      localStringBuilder.append(localCharSequence);
      localStringBuilder.append(' ');
    }
    if (localStringBuilder.length() > 0) {
      localStringBuilder.setLength(localStringBuilder.length() - 1);
    }
    return localStringBuilder;
  }
  
  public void b(Preference paramPreference, boolean paramBoolean)
  {
    if (this.t == paramBoolean)
    {
      this.t = (paramBoolean ^ true);
      b(y());
      l();
    }
  }
  
  public void b(boolean paramBoolean)
  {
    List localList = this.E;
    if (localList == null) {
      return;
    }
    int i1 = localList.size();
    for (int i2 = 0; i2 < i1; i2++) {
      ((Preference)localList.get(i2)).a(this, paramBoolean);
    }
  }
  
  protected boolean b(int paramInt)
  {
    if (!z()) {
      return false;
    }
    if (paramInt == a(paramInt)) {
      return true;
    }
    c localc = e();
    if (localc != null)
    {
      localc.b(this.k, paramInt);
      return true;
    }
    this.b.a();
    throw null;
  }
  
  protected boolean b(String paramString)
  {
    if (!z()) {
      return false;
    }
    if (TextUtils.equals(paramString, a(null))) {
      return true;
    }
    c localc = e();
    if (localc != null)
    {
      localc.b(this.k, paramString);
      return true;
    }
    this.b.a();
    throw null;
  }
  
  public String c()
  {
    return this.m;
  }
  
  protected boolean c(boolean paramBoolean)
  {
    if (!z()) {
      return false;
    }
    if (paramBoolean == a(paramBoolean ^ true)) {
      return true;
    }
    c localc = e();
    if (localc != null)
    {
      localc.b(this.k, paramBoolean);
      return true;
    }
    this.b.a();
    throw null;
  }
  
  public Intent d()
  {
    return this.l;
  }
  
  public c e()
  {
    Object localObject = this.c;
    if (localObject != null) {
      return (c)localObject;
    }
    localObject = this.b;
    if (localObject == null) {
      return null;
    }
    ((e)localObject).d();
    throw null;
  }
  
  public e f()
  {
    return this.b;
  }
  
  public CharSequence g()
  {
    return this.i;
  }
  
  public CharSequence h()
  {
    return this.h;
  }
  
  public boolean i()
  {
    return TextUtils.isEmpty(this.k) ^ true;
  }
  
  public boolean j()
  {
    boolean bool;
    if ((this.n) && (this.s) && (this.t)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean k()
  {
    return this.p;
  }
  
  protected void l()
  {
    a locala = this.D;
    if (locala != null) {
      locala.a(this);
    }
  }
  
  public String toString()
  {
    return b().toString();
  }
  
  protected void w() {}
  
  public void x()
  {
    if (!j()) {
      return;
    }
    w();
    Object localObject = this.e;
    if ((localObject != null) && (((c)localObject).a(this))) {
      return;
    }
    localObject = f();
    if (localObject == null)
    {
      if (this.l != null) {
        a().startActivity(this.l);
      }
      return;
    }
    ((e)localObject).c();
    throw null;
  }
  
  public boolean y()
  {
    return j() ^ true;
  }
  
  protected boolean z()
  {
    boolean bool;
    if ((this.b != null) && (k()) && (i())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  static abstract interface a
  {
    public abstract void a(Preference paramPreference);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(Preference paramPreference, Object paramObject);
  }
  
  public static abstract interface c
  {
    public abstract boolean a(Preference paramPreference);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/Preference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */