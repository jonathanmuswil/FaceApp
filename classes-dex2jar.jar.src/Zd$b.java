import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

public class zd$b
{
  final Object a;
  
  zd$b(Object paramObject)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zd$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */