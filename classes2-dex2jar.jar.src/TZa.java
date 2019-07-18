import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;

public final class tza
  extends Aza<rza, mza.b>
{
  private HashMap z;
  
  public tza(Context paramContext, VQa<mza.b> paramVQa)
  {
    super(paramContext, paramVQa, 0, 0, 0, 28, null);
  }
  
  public void a(rza paramrza)
  {
    oXa.b(paramrza, "model");
    setSelected(paramrza.a());
    ((TextView)c(k.title)).setText(2131689818);
    paramrza = (ImageView)c(k.thumb);
    oXa.a(paramrza, "thumb");
    paramrza.setScaleType(ImageView.ScaleType.CENTER);
    ((ImageView)c(k.thumb)).setBackgroundResource(2131230828);
    ((ImageView)c(k.thumb)).setImageResource(2131230974);
    setOnClickListener(new sza(this));
  }
  
  public View c(int paramInt)
  {
    if (this.z == null) {
      this.z = new HashMap();
    }
    View localView1 = (View)this.z.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.z.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */