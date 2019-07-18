package io.faceapp.ui.polls.item;

import GPa;
import Ie;
import Mka;
import UPa;
import WVa;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import io.faceapp.k;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.util.ArrayList;
import oXa;

public final class b
  implements ViewTreeObserver.OnPreDrawListener
{
  public b(View paramView, Mka paramMka, ProgressBar paramProgressBar, ArrayList paramArrayList1, ArrayList paramArrayList2) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    ImageView localImageView = (ImageView)this.a;
    Object localObject = this.b.n();
    float f = localImageView.getWidth() / ((Number)((WVa)localObject).c()).floatValue();
    int i = (int)(((Number)((WVa)localObject).d()).floatValue() * f);
    if (localImageView.getHeight() != i)
    {
      localImageView.getLayoutParams().height = i;
      localImageView.requestLayout();
    }
    localObject = this.c;
    oXa.a(localObject, "loadingView");
    UPa.e((View)localObject);
    UPa.d(this.d);
    UPa.d(this.e);
    localObject = io.faceapp.services.glide.a.a(localImageView.getContext()).a(this.b.o()).b(new a(this)).a(2131231088);
    oXa.a(localObject, "GlideApp\n               …r(R.drawable.placeholder)");
    GPa.a((c)localObject, 0, 1, null).a((ImageView)localImageView.findViewById(k.pollImage));
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */