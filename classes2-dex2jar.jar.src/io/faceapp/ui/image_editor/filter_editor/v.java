package io.faceapp.ui.image_editor.filter_editor;

import KOa;
import android.view.View;
import android.view.View.OnClickListener;
import dXa;
import java.util.List;
import oXa;

public final class v
  implements View.OnClickListener
{
  public v(int paramInt1, int paramInt2, FilterStrengthView paramFilterStrengthView, int paramInt3, int paramInt4, FilterStrengthView.b paramb) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      if (this.f.c().size() >= this.a) {
        FilterStrengthView.a(this.c).a(this.f.b(), this.f.c().get(this.b));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/filter_editor/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */