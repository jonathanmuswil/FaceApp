import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.util.HashMap;

public final class jya
  extends Aza<hya, fya.b>
{
  private HashMap z;
  
  public jya(Context paramContext, VQa<fya.b> paramVQa)
  {
    super(paramContext, paramVQa, 2131165446, 2131165444, 2131493037);
  }
  
  public void a(hya paramhya)
  {
    oXa.b(paramhya, "model");
    Object localObject = (TextView)c(k.title);
    oXa.a(localObject, "title");
    ((TextView)localObject).setText(paramhya.b().a().f());
    localObject = paramhya.b().a().b();
    c localc = a.a(getContext()).a((String)localObject);
    oXa.a(localc, "GlideApp\n            .wi…          .load(thumbUrl)");
    localObject = GPa.a(localc, (String)localObject, null, 2, null);
    int i = 0;
    GPa.a((c)localObject, 0, 1, null).a((ImageView)c(k.thumb));
    localObject = (ImageView)c(k.dot);
    oXa.a(localObject, "dot");
    if (!paramhya.a()) {
      i = 4;
    }
    ((ImageView)localObject).setVisibility(i);
    setOnClickListener(new iya(this, paramhya));
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jya.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */