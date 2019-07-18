import android.view.View;
import java.lang.ref.WeakReference;

public class zn$a
{
  private WeakReference<View> a;
  private String b;
  
  public zn$a(View paramView, String paramString)
  {
    this.a = new WeakReference(paramView);
    this.b = paramString;
  }
  
  public View a()
  {
    Object localObject = this.a;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (View)((WeakReference)localObject).get();
    }
    return (View)localObject;
  }
  
  public String b()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zn$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */