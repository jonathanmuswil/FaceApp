import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class zd
{
  private final AccessibilityNodeInfo a;
  public int b = -1;
  
  private zd(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.a = paramAccessibilityNodeInfo;
  }
  
  public static zd a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return new zd(paramAccessibilityNodeInfo);
  }
  
  public static zd a(zd paramzd)
  {
    return a(AccessibilityNodeInfo.obtain(paramzd.a));
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    Bundle localBundle = d();
    if (localBundle != null)
    {
      int i = localBundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      int j;
      if (paramBoolean) {
        j = paramInt;
      } else {
        j = 0;
      }
      localBundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", j | i & paramInt);
    }
  }
  
  private static String b(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        switch (paramInt)
        {
        default: 
          return "ACTION_UNKNOWN";
        case 131072: 
          return "ACTION_SET_SELECTION";
        case 65536: 
          return "ACTION_CUT";
        case 32768: 
          return "ACTION_PASTE";
        case 16384: 
          return "ACTION_COPY";
        case 8192: 
          return "ACTION_SCROLL_BACKWARD";
        case 4096: 
          return "ACTION_SCROLL_FORWARD";
        case 2048: 
          return "ACTION_PREVIOUS_HTML_ELEMENT";
        case 1024: 
          return "ACTION_NEXT_HTML_ELEMENT";
        case 512: 
          return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        case 256: 
          return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        case 128: 
          return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        case 64: 
          return "ACTION_ACCESSIBILITY_FOCUS";
        case 32: 
          return "ACTION_LONG_CLICK";
        case 16: 
          return "ACTION_CLICK";
        case 8: 
          return "ACTION_CLEAR_SELECTION";
        }
        return "ACTION_SELECT";
      }
      return "ACTION_CLEAR_FOCUS";
    }
    return "ACTION_FOCUS";
  }
  
  public int a()
  {
    return this.a.getActions();
  }
  
  public void a(int paramInt)
  {
    this.a.addAction(paramInt);
  }
  
  public void a(Rect paramRect)
  {
    this.a.getBoundsInParent(paramRect);
  }
  
  public void a(View paramView)
  {
    this.a.addChild(paramView);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.a.setClassName(paramCharSequence);
  }
  
  public void a(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.a;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (AccessibilityNodeInfo.CollectionInfo)((zd.b)paramObject).a;
      }
      localAccessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.a.setAccessibilityFocused(paramBoolean);
    }
  }
  
  public boolean a(zd.a parama)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction)parama.H);
    }
    return false;
  }
  
  public CharSequence b()
  {
    return this.a.getClassName();
  }
  
  public void b(Rect paramRect)
  {
    this.a.getBoundsInScreen(paramRect);
  }
  
  public void b(View paramView)
  {
    this.a.setParent(paramView);
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.a.setContentDescription(paramCharSequence);
  }
  
  public void b(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      AccessibilityNodeInfo localAccessibilityNodeInfo = this.a;
      if (paramObject == null) {
        paramObject = null;
      } else {
        paramObject = (AccessibilityNodeInfo.CollectionItemInfo)((zd.c)paramObject).a;
      }
      localAccessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.a.setCheckable(paramBoolean);
  }
  
  public CharSequence c()
  {
    return this.a.getContentDescription();
  }
  
  public void c(Rect paramRect)
  {
    this.a.setBoundsInParent(paramRect);
  }
  
  public void c(View paramView)
  {
    this.a.setSource(paramView);
  }
  
  public void c(CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.a.setError(paramCharSequence);
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.a.setChecked(paramBoolean);
  }
  
  public Bundle d()
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return this.a.getExtras();
    }
    return new Bundle();
  }
  
  public void d(Rect paramRect)
  {
    this.a.setBoundsInScreen(paramRect);
  }
  
  public void d(CharSequence paramCharSequence)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      this.a.setHintText(paramCharSequence);
    } else if (i >= 19) {
      this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramCharSequence);
    }
  }
  
  public void d(boolean paramBoolean)
  {
    this.a.setClickable(paramBoolean);
  }
  
  public CharSequence e()
  {
    return this.a.getPackageName();
  }
  
  public void e(CharSequence paramCharSequence)
  {
    this.a.setPackageName(paramCharSequence);
  }
  
  public void e(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.a.setContentInvalid(paramBoolean);
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (zd.class != paramObject.getClass()) {
      return false;
    }
    zd localzd = (zd)paramObject;
    paramObject = this.a;
    if (paramObject == null)
    {
      if (localzd.a != null) {
        return false;
      }
    }
    else if (!((AccessibilityNodeInfo)paramObject).equals(localzd.a)) {
      return false;
    }
    return true;
  }
  
  public CharSequence f()
  {
    return this.a.getText();
  }
  
  public void f(CharSequence paramCharSequence)
  {
    this.a.setText(paramCharSequence);
  }
  
  public void f(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      this.a.setDismissable(paramBoolean);
    }
  }
  
  public String g()
  {
    if (Build.VERSION.SDK_INT >= 18) {
      return this.a.getViewIdResourceName();
    }
    return null;
  }
  
  public void g(boolean paramBoolean)
  {
    this.a.setEnabled(paramBoolean);
  }
  
  public void h(boolean paramBoolean)
  {
    this.a.setFocusable(paramBoolean);
  }
  
  public boolean h()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.a.isAccessibilityFocused();
    }
    return false;
  }
  
  public int hashCode()
  {
    AccessibilityNodeInfo localAccessibilityNodeInfo = this.a;
    int i;
    if (localAccessibilityNodeInfo == null) {
      i = 0;
    } else {
      i = localAccessibilityNodeInfo.hashCode();
    }
    return i;
  }
  
  public void i(boolean paramBoolean)
  {
    this.a.setFocused(paramBoolean);
  }
  
  public boolean i()
  {
    return this.a.isCheckable();
  }
  
  public void j(boolean paramBoolean)
  {
    this.a.setLongClickable(paramBoolean);
  }
  
  public boolean j()
  {
    return this.a.isChecked();
  }
  
  public void k(boolean paramBoolean)
  {
    this.a.setScrollable(paramBoolean);
  }
  
  public boolean k()
  {
    return this.a.isClickable();
  }
  
  public void l(boolean paramBoolean)
  {
    this.a.setSelected(paramBoolean);
  }
  
  public boolean l()
  {
    return this.a.isEnabled();
  }
  
  public void m(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      this.a.setShowingHintText(paramBoolean);
    } else {
      a(4, paramBoolean);
    }
  }
  
  public boolean m()
  {
    return this.a.isFocusable();
  }
  
  public void n(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16) {
      this.a.setVisibleToUser(paramBoolean);
    }
  }
  
  public boolean n()
  {
    return this.a.isFocused();
  }
  
  public boolean o()
  {
    return this.a.isLongClickable();
  }
  
  public boolean p()
  {
    return this.a.isPassword();
  }
  
  public boolean q()
  {
    return this.a.isScrollable();
  }
  
  public boolean r()
  {
    return this.a.isSelected();
  }
  
  public boolean s()
  {
    if (Build.VERSION.SDK_INT >= 16) {
      return this.a.isVisibleToUser();
    }
    return false;
  }
  
  public void t()
  {
    this.a.recycle();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(super.toString());
    Object localObject = new Rect();
    a((Rect)localObject);
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("; boundsInParent: ");
    localStringBuilder2.append(localObject);
    localStringBuilder1.append(localStringBuilder2.toString());
    b((Rect)localObject);
    localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("; boundsInScreen: ");
    localStringBuilder2.append(localObject);
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder1.append("; packageName: ");
    localStringBuilder1.append(e());
    localStringBuilder1.append("; className: ");
    localStringBuilder1.append(b());
    localStringBuilder1.append("; text: ");
    localStringBuilder1.append(f());
    localStringBuilder1.append("; contentDescription: ");
    localStringBuilder1.append(c());
    localStringBuilder1.append("; viewId: ");
    localStringBuilder1.append(g());
    localStringBuilder1.append("; checkable: ");
    localStringBuilder1.append(i());
    localStringBuilder1.append("; checked: ");
    localStringBuilder1.append(j());
    localStringBuilder1.append("; focusable: ");
    localStringBuilder1.append(m());
    localStringBuilder1.append("; focused: ");
    localStringBuilder1.append(n());
    localStringBuilder1.append("; selected: ");
    localStringBuilder1.append(r());
    localStringBuilder1.append("; clickable: ");
    localStringBuilder1.append(k());
    localStringBuilder1.append("; longClickable: ");
    localStringBuilder1.append(o());
    localStringBuilder1.append("; enabled: ");
    localStringBuilder1.append(l());
    localStringBuilder1.append("; password: ");
    localStringBuilder1.append(p());
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("; scrollable: ");
    ((StringBuilder)localObject).append(q());
    localStringBuilder1.append(((StringBuilder)localObject).toString());
    localStringBuilder1.append("; [");
    int i = a();
    while (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      int k = i & j;
      localStringBuilder1.append(b(j));
      i = k;
      if (k != 0)
      {
        localStringBuilder1.append(", ");
        i = k;
      }
    }
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
  
  public AccessibilityNodeInfo u()
  {
    return this.a;
  }
  
  public static class a
  {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final a p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;
    final Object H;
    
    static
    {
      Object localObject1 = null;
      a = new a(1, null);
      b = new a(2, null);
      c = new a(4, null);
      d = new a(8, null);
      e = new a(16, null);
      f = new a(32, null);
      g = new a(64, null);
      h = new a(128, null);
      i = new a(256, null);
      j = new a(512, null);
      k = new a(1024, null);
      l = new a(2048, null);
      m = new a(4096, null);
      n = new a(8192, null);
      o = new a(16384, null);
      p = new a(32768, null);
      q = new a(65536, null);
      r = new a(131072, null);
      s = new a(262144, null);
      t = new a(524288, null);
      u = new a(1048576, null);
      v = new a(2097152, null);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
      } else {
        localObject2 = null;
      }
      w = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
      } else {
        localObject2 = null;
      }
      x = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
      } else {
        localObject2 = null;
      }
      y = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
      } else {
        localObject2 = null;
      }
      z = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
      } else {
        localObject2 = null;
      }
      A = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
      } else {
        localObject2 = null;
      }
      B = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 23) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
      } else {
        localObject2 = null;
      }
      C = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 24) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
      } else {
        localObject2 = null;
      }
      D = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 26) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
      } else {
        localObject2 = null;
      }
      E = new a(localObject2);
      if (Build.VERSION.SDK_INT >= 28) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
      } else {
        localObject2 = null;
      }
      F = new a(localObject2);
      Object localObject2 = localObject1;
      if (Build.VERSION.SDK_INT >= 28) {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
      }
      G = new a(localObject2);
    }
    
    public a(int paramInt, CharSequence paramCharSequence)
    {
      this(paramCharSequence);
    }
    
    a(Object paramObject)
    {
      this.H = paramObject;
    }
  }
  
  public static class b
  {
    final Object a;
    
    b(Object paramObject)
    {
      this.a = paramObject;
    }
    
    public static b a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 21) {
        return new b(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3));
      }
      if (i >= 19) {
        return new b(AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean));
      }
      return new b(null);
    }
  }
  
  public static class c
  {
    final Object a;
    
    c(Object paramObject)
    {
      this.a = paramObject;
    }
    
    public static c a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 21) {
        return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2));
      }
      if (i >= 19) {
        return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1));
      }
      return new c(null);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */