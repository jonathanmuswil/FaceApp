import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public final class eMa
  extends jLa<cMa, bMa>
  implements cMa
{
  public eMa(Context paramContext)
  {
    super(paramContext, 2131493109);
  }
  
  public void a(String paramString, int paramInt)
  {
    oXa.b(paramString, "versionName");
    String str = getContext().getString(2131689932);
    Object localObject = findViewById(2131296932);
    if (localObject != null)
    {
      localObject = (TextView)localObject;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append(" - ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" (");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(')');
      ((TextView)localObject).setText(localStringBuilder.toString());
      return;
    }
    oXa.a();
    throw null;
  }
  
  public bMa b()
  {
    return new bMa();
  }
  
  public void ja()
  {
    View localView = getRootView();
    if (localView != null) {
      localView.postDelayed(new dMa(this), 2000L);
    }
  }
  
  public void la()
  {
    Context localContext = getContext();
    if (localContext != null) {
      Toast.makeText(localContext, "Debug menu unlocked. Restarting...", 0).show();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eMa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */