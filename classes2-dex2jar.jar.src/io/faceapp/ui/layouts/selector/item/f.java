package io.faceapp.ui.layouts.selector.item;

import GPa;
import Hf;
import Ie;
import android.net.Uri;
import android.widget.ImageView;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.b;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import oXa;
import uRa;

final class f
  implements uRa
{
  f(PhotoItemView paramPhotoItemView, Uri paramUri) {}
  
  public final void run()
  {
    Object localObject = (ImageView)this.a.c(k.photo);
    oXa.a(localObject, "photo");
    localObject = a.a(((ImageView)localObject).getContext()).a(this.b).a(Hf.a).a(b.da());
    oXa.a(localObject, "GlideApp\n               …ns.circleCropTransform())");
    GPa.a((c)localObject, 0, 1, null).a((ImageView)this.a.c(k.photo));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */