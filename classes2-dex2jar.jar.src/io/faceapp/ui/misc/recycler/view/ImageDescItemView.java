package io.faceapp.ui.misc.recycler.view;

import GPa;
import Ie;
import Rja;
import Wja;
import _Va;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import cWa;
import cXa;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import jta;
import oXa;

public final class ImageDescItemView
  extends AppCompatImageView
  implements jta<Rja>
{
  public static final a c = new a(null);
  private cXa<? super Rja, cWa> d;
  
  public ImageDescItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(Rja paramRja)
  {
    oXa.b(paramRja, "model");
    Object localObject;
    if ((paramRja instanceof Wja))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("#33");
      ((StringBuilder)localObject).append(((Wja)paramRja).d());
      localObject = new ColorDrawable(Color.parseColor(((StringBuilder)localObject).toString()));
    }
    else
    {
      localObject = null;
    }
    c localc = a.a(getContext()).a(paramRja.b());
    if ((localObject == null) || (localc.a((Drawable)localObject) == null)) {
      localc.a(2131231088);
    }
    oXa.a(localc, "GlideApp.with(context)\n …R.drawable.placeholder) }");
    GPa.a(localc, 0, 1, null).a(this);
    setOnClickListener(new e(this, paramRja));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = getMeasuredWidth();
    if (Math.abs(paramInt1 - getMeasuredHeight()) > 2) {
      setMeasuredDimension(paramInt1, paramInt1);
    }
  }
  
  public static final class a
  {
    public final ImageDescItemView a(ViewGroup paramViewGroup, cXa<? super Rja, cWa> paramcXa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramcXa, "onImageClicked");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493034, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (ImageDescItemView)paramViewGroup;
        ImageDescItemView.a(paramViewGroup, paramcXa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.misc.recycler.view.ImageDescItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/recycler/view/ImageDescItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */