package io.faceapp.ui.user_settings.item;

import KOa;
import UNa.b.f;
import VQa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class b
  implements View.OnClickListener
{
  public b(UserSettingsLoginItemView paramUserSettingsLoginItemView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      UserSettingsLoginItemView.a(this.a).a(UNa.b.f.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/user_settings/item/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */