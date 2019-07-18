package io.faceapp.ui.user_settings.item;

import KOa;
import UNa.b.h;
import VQa;
import aka;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class c
  implements View.OnClickListener
{
  public c(aka paramaka, UserSettingsLoginItemView paramUserSettingsLoginItemView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      UserSettingsLoginItemView.a(this.b).a(new UNa.b.h(this.a.a(), false));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/user_settings/item/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */