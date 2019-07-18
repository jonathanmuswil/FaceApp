package io.faceapp.ui.image_editor.filter_editor;

import KOa;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class c
  implements View.OnClickListener
{
  public c(d paramd, a parama) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      VQa localVQa = d.a(this.a);
      paramView = this.b.c();
      if (b.b[paramView.ordinal()] != 1) {
        paramView = new s.b.a(this.b.b());
      } else {
        paramView = new s.b.b(this.b.b());
      }
      localVQa.a(paramView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */