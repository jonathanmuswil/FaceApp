import android.view.View;
import android.view.WindowId;

class hc
  implements ic
{
  private final WindowId a;
  
  hc(View paramView)
  {
    this.a = paramView.getWindowId();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof hc)) && (((hc)paramObject).a.equals(this.a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */