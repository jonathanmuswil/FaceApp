package io.faceapp.ui.components;

import ARa;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import dW;

final class m<T>
  implements ARa<dW>
{
  m(FaceSelectOverlay paramFaceSelectOverlay) {}
  
  public final void a(dW paramdW)
  {
    Bitmap localBitmap = this.a.getBitmap();
    if (localBitmap != null) {
      localBitmap.recycle();
    }
    this.a.setBitmap(Bitmap.createBitmap(paramdW.g() - paramdW.b(), paramdW.a() - paramdW.h(), Bitmap.Config.ARGB_8888));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */