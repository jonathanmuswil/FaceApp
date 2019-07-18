package io.faceapp.ui.polls.item;

import KOa;
import LIa.i;
import android.view.View;
import android.view.View.OnClickListener;
import cXa;
import oXa;

public final class g
  implements View.OnClickListener
{
  public g(PartVoteBtnItemView paramPartVoteBtnItemView, LIa.i parami) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      PartVoteBtnItemView.a(this.a).a(this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */