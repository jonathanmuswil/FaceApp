package io.faceapp.ui.rate_us.item;

import GVa;
import KOa;
import android.view.View;
import android.view.View.OnClickListener;
import oXa;

public final class b
  implements View.OnClickListener
{
  public b(StarsRatingView paramStarsRatingView) {}
  
  public final void onClick(View paramView)
  {
    if (!KOa.b.c())
    {
      oXa.a(paramView, "v");
      StarsRatingView.a(this.a).a(Integer.valueOf(2));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/rate_us/item/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */