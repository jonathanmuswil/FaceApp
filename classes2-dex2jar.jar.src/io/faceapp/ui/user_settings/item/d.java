package io.faceapp.ui.user_settings.item;

import KOa;
import UNa.b.i;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import cka;
import oXa;

public final class d
  implements View.OnClickListener
{
  public d(cka paramcka, UserSettingsLoginItemView paramUserSettingsLoginItemView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      UserSettingsLoginItemView.a(this.b).a(new UNa.b.i(this.a.a(), false));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/user_settings/item/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */