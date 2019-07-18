package io.faceapp.ui.photo_picker.item;

import KIa.d;
import VQa;
import _Va;
import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import jta;
import oXa;

public final class CameraItemView
  extends AppCompatImageView
  implements jta<a>
{
  public static final a c = new a(null);
  private VQa<KIa.d> d;
  
  public CameraItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    setOnClickListener(new b(this));
  }
  
  public static final class a
  {
    public final CameraItemView a(ViewGroup paramViewGroup, VQa<KIa.d> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493023, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (CameraItemView)paramViewGroup;
        CameraItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.CameraItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/CameraItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */