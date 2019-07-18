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

public final class qza
  extends Aza<nza, mza.b>
{
  private HashMap z;
  
  public qza(Context paramContext, VQa<mza.b> paramVQa)
  {
    super(paramContext, paramVQa, 0, 0, 0, 28, null);
  }
  
  public void a(nza paramnza)
  {
    oXa.b(paramnza, "model");
    Object localObject1 = (TextView)c(k.title);
    oXa.a(localObject1, "title");
    ((TextView)localObject1).setText(paramnza.b().g());
    setSelected(paramnza.a());
    Object localObject2 = (ImageView)c(k.proStatusLabelView);
    localObject1 = paramnza.c();
    int i = oza.a[localObject1.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        ((ImageView)localObject2).setImageDrawable(null);
      }
    }
    else {
      ((ImageView)localObject2).setImageResource(2131231060);
    }
    localObject1 = paramnza.b().a();
    localObject2 = a.a(getContext()).a((String)localObject1);
    oXa.a(localObject2, "GlideApp\n            .wi…          .load(thumbUrl)");
    GPa.a(GPa.a((c)localObject2, (String)localObject1, null, 2, null), 0, 1, null).a((ImageView)c(k.thumb));
    setOnClickListener(new pza(this, paramnza));
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */