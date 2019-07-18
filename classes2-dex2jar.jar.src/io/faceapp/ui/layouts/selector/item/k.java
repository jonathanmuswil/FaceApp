package io.faceapp.ui.layouts.selector.item;

import ARa;
import android.net.Uri;
import java.io.File;
import oXa;
import tia;

final class k<T>
  implements ARa<Object>
{
  k(PhotoItemView paramPhotoItemView, m paramm) {}
  
  public final void accept(Object paramObject)
  {
    if ((paramObject instanceof tia))
    {
      float f = ((tia)paramObject).b();
      PhotoItemView.a(this.a, f * 0.9F + 0.1F);
    }
    else if ((paramObject instanceof File))
    {
      paramObject = Uri.fromFile((File)paramObject);
      PhotoItemView localPhotoItemView = this.a;
      oXa.a(paramObject, "imageUri");
      PhotoItemView.a(localPhotoItemView, (Uri)paramObject, this.b.b());
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */