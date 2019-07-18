import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class xd
{
  public static int a(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramAccessibilityEvent.getContentChangeTypes();
    }
    return 0;
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      paramAccessibilityEvent.setContentChangeTypes(paramInt);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */