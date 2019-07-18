import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;

public final class yLa
  extends jLa<xLa, wLa>
  implements xLa
{
  private HashMap d;
  
  public yLa(Context paramContext)
  {
    super(paramContext, 2131493106);
  }
  
  public QQa<Object> a()
  {
    TextView localTextView = (TextView)a(k.goProBtnView);
    oXa.a(localTextView, "goProBtnView");
    return UPa.d(localTextView, 0L, 1, null);
  }
  
  public View a(int paramInt)
  {
    if (this.d == null) {
      this.d = new HashMap();
    }
    View localView1 = (View)this.d.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.d.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public wLa b()
  {
    return new wLa();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str1 = getResources().getString(2131689765);
    String str2 = getResources().getString(2131689766);
    String str3 = getResources().getString(2131689767);
    String str4 = getResources().getString(2131689768);
    String str5 = getResources().getString(2131690228);
    TextView localTextView = (TextView)a(k.labelSubtitleView);
    oXa.a(localTextView, "labelSubtitleView");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(str5);
    localStringBuilder.append('\n');
    localStringBuilder.append(str2);
    localStringBuilder.append(str5);
    localStringBuilder.append('\n');
    localStringBuilder.append(str3);
    localStringBuilder.append(str5);
    localStringBuilder.append(' ');
    localStringBuilder.append(str4);
    localStringBuilder.append(str5);
    localTextView.setText(localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yLa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */