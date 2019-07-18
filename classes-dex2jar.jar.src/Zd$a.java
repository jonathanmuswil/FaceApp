import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public class zd$a
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
  
  public zd$a(int paramInt, CharSequence paramCharSequence)
  {
    this(paramCharSequence);
  }
  
  zd$a(Object paramObject)
  {
    this.H = paramObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zd$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */