package io.faceapp.ui.image_editor.common.view;

import APa;
import android.graphics.Matrix;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import io.faceapp.ui.components.ImageDisplay;

public final class o
  implements ViewTreeObserver.OnPreDrawListener
{
  public boolean onPreDraw()
  {
    APa localAPa = ScrollableContentView.a(this.a);
    if ((localAPa != null) && (this.a.getWidth() > 0) && (this.a.getHeight() > 0))
    {
      Object localObject = ScrollableContentView.c(this.a);
      if (localObject == null)
      {
        localObject = new APa(this.a.getWidth(), this.a.getHeight());
        ScrollableContentView localScrollableContentView = this.a;
        localObject = ScrollableContentView.a(localScrollableContentView, localAPa, (APa)localObject, ScrollableContentView.d(localScrollableContentView));
      }
      this.a.setImageMatrix((Matrix)localObject);
      this.a.getViewTreeObserver().removeOnPreDrawListener(ScrollableContentView.b(this.a));
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */