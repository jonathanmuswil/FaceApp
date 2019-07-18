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

public final class txa
  extends Aza<qxa, fya.b>
{
  private HashMap z;
  
  public txa(Context paramContext, VQa<fya.b> paramVQa)
  {
    super(paramContext, paramVQa, 2131165446, 2131165444, 2131493037);
  }
  
  public void a(qxa paramqxa)
  {
    oXa.b(paramqxa, "model");
    Object localObject1 = (TextView)c(k.title);
    oXa.a(localObject1, "title");
    ((TextView)localObject1).setText(paramqxa.b().f());
    Object localObject2 = (ImageView)c(k.proStatusLabelView);
    localObject1 = paramqxa.c();
    if (rxa.a[localObject1.ordinal()] != 1) {
      ((ImageView)localObject2).setImageDrawable(null);
    } else {
      ((ImageView)localObject2).setImageResource(2131231060);
    }
    localObject1 = paramqxa.b().b();
    localObject2 = a.a(getContext()).a((String)localObject1);
    oXa.a(localObject2, "GlideApp\n            .wi…          .load(thumbUrl)");
    localObject1 = GPa.a((c)localObject2, (String)localObject1, null, 2, null);
    int i = 0;
    GPa.a((c)localObject1, 0, 1, null).a((ImageView)c(k.thumb));
    localObject1 = (ImageView)c(k.dot);
    oXa.a(localObject1, "dot");
    if (!paramqxa.a()) {
      i = 4;
    }
    ((ImageView)localObject1).setVisibility(i);
    setOnClickListener(new sxa(this, paramqxa));
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/txa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */