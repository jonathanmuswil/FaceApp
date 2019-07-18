package io.faceapp.ui.polls.item;

import KOa;
import LIa.d;
import android.view.View;
import android.view.View.OnClickListener;
import cXa;
import oXa;

public final class c
  implements View.OnClickListener
{
  public c(PartImageItemView paramPartImageItemView, LIa.d paramd) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      PartImageItemView.a(this.a).a(this.b);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */