import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class de
  implements TransformationMethod
{
  private Locale a;
  
  public de(Context paramContext)
  {
    this.a = paramContext.getResources().getConfiguration().locale;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramCharSequence != null) {
      paramCharSequence = paramCharSequence.toString().toUpperCase(this.a);
    } else {
      paramCharSequence = null;
    }
    return paramCharSequence;
  }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */