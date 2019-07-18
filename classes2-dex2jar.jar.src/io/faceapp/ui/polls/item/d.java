package io.faceapp.ui.polls.item;

import KOa;
import LIa.e;
import VQa;
import XIa.c.a;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class d
  implements View.OnClickListener
{
  public d(PartInviteBtnItemView paramPartInviteBtnItemView, LIa.e parame) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      PartInviteBtnItemView.a(this.a).a(new XIa.c.a(this.b.b()));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */