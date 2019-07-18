import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

public final class yd
{
  public static boolean a(AccessibilityManager paramAccessibilityManager, yd.a parama)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      if (parama == null) {
        return false;
      }
      return paramAccessibilityManager.addTouchExplorationStateChangeListener(new yd.b(parama));
    }
    return false;
  }
  
  public static boolean b(AccessibilityManager paramAccessibilityManager, yd.a parama)
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      if (parama == null) {
        return false;
      }
      return paramAccessibilityManager.removeTouchExplorationStateChangeListener(new yd.b(parama));
    }
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void onTouchExplorationStateChanged(boolean paramBoolean);
  }
  
  private static class b
    implements AccessibilityManager.TouchExplorationStateChangeListener
  {
    final yd.a a;
    
    b(yd.a parama)
    {
      this.a = parama;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        paramObject = (b)paramObject;
        return this.a.equals(((b)paramObject).a);
      }
      return false;
    }
    
    public int hashCode()
    {
      return this.a.hashCode();
    }
    
    public void onTouchExplorationStateChanged(boolean paramBoolean)
    {
      this.a.onTouchExplorationStateChanged(paramBoolean);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */