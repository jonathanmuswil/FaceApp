package io.faceapp.ui.image_editor.filter_editor;

import Aza;
import GPa;
import Ie;
import VQa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import lka;
import oXa;

public final class d
  extends Aza<a, s.b>
{
  private HashMap z;
  
  public d(Context paramContext, VQa<s.b> paramVQa)
  {
    super(paramContext, paramVQa, 0, 0, 0, 28, null);
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    setSelected(parama.a());
    Object localObject1 = (ImageView)c(k.proStatusLabelView);
    Object localObject2 = parama.c();
    int i = b.a[localObject2.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        ((ImageView)localObject1).setImageDrawable(null);
      }
    }
    else {
      ((ImageView)localObject1).setImageResource(2131231060);
    }
    localObject2 = (TextView)c(k.title);
    oXa.a(localObject2, "title");
    ((TextView)localObject2).setText(parama.b().q());
    localObject1 = parama.b().l();
    localObject2 = io.faceapp.services.glide.a.a(getContext()).a((String)localObject1);
    oXa.a(localObject2, "GlideApp\n            .wi…          .load(thumbUrl)");
    GPa.a(GPa.a((io.faceapp.services.glide.c)localObject2, (String)localObject1, null, 2, null), 0, 1, null).a((ImageView)c(k.thumb));
    setOnClickListener(new c(this, parama));
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */