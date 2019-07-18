package io.faceapp.ui.photo_picker.item;

import KIa.a.c;
import _Va;
import android.content.Context;
import android.support.v7.widget.I;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import jta;
import oXa;

public final class NoPhotosItemView
  extends I
  implements jta<KIa.a.c>
{
  public static final a d = new a(null);
  
  public NoPhotosItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(KIa.a.c paramc)
  {
    oXa.b(paramc, "model");
  }
  
  public static final class a
  {
    public final NoPhotosItemView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493044, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (NoPhotosItemView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.NoPhotosItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/NoPhotosItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */