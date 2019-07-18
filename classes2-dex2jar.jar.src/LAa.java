import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.util.HashMap;
import java.util.Map;

public final class lAa
  extends Aza<iAa, hAa.b>
{
  private HashMap A;
  private final HashMap<String, io.faceapp.ui.misc.a> z = new HashMap();
  
  public lAa(Context paramContext, VQa<hAa.b> paramVQa)
  {
    super(paramContext, paramVQa, 0, 0, 0, 28, null);
  }
  
  private final io.faceapp.ui.misc.a l(String paramString)
  {
    io.faceapp.ui.misc.a locala = (io.faceapp.ui.misc.a)this.z.get(paramString);
    if (locala != null)
    {
      paramString = locala;
    }
    else
    {
      locala = new io.faceapp.ui.misc.a(paramString);
      this.z.put(paramString, locala);
      paramString = locala;
    }
    return paramString;
  }
  
  public void a(iAa paramiAa)
  {
    oXa.b(paramiAa, "model");
    setSelected(paramiAa.a());
    ImageView localImageView = (ImageView)c(k.proStatusLabelView);
    Object localObject = paramiAa.c();
    int i = jAa.a[localObject.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        localImageView.setImageDrawable(null);
      }
    }
    else {
      localImageView.setImageResource(2131231060);
    }
    localObject = (TextView)c(k.title);
    oXa.a(localObject, "title");
    ((TextView)localObject).setText(paramiAa.b().e());
    localObject = io.faceapp.services.glide.a.a(getContext()).a(paramiAa.d()).a(new BitmapDrawable(getResources(), paramiAa.d())).a(l(paramiAa.b().a()));
    oXa.a(localObject, "GlideApp\n            .wi…nsform(model.payload.id))");
    GPa.a((c)localObject, 0, 1, null).a((ImageView)c(k.thumb));
    setOnClickListener(new kAa(this, paramiAa));
  }
  
  public View c(int paramInt)
  {
    if (this.A == null) {
      this.A = new HashMap();
    }
    View localView1 = (View)this.A.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.A.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lAa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */