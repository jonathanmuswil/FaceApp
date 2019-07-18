package io.faceapp.ui.components;

import ARa;
import Aja;
import WVa;
import android.view.TextureView;

final class f<T>
  implements ARa<WVa<? extends Integer, ? extends Integer>>
{
  f(CameraPreview paramCameraPreview) {}
  
  public final void a(WVa<Integer, Integer> paramWVa)
  {
    CameraPreview.a(this.a).b(this.a.getMeasuredWidth());
    CameraPreview.a(this.a).a(this.a.getMeasuredHeight());
    paramWVa = this.a;
    CameraPreview.a(paramWVa, paramWVa.getMeasuredWidth(), this.a.getMeasuredHeight());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */