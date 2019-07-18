import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

class yd$b
  implements AccessibilityManager.TouchExplorationStateChangeListener
{
  final yd.a a;
  
  yd$b(yd.a parama)
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yd$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */