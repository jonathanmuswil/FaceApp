import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class zd$c
{
  final Object a;
  
  zd$c(Object paramObject)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zd$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */