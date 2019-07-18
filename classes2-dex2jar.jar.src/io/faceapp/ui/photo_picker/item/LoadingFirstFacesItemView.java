package io.faceapp.ui.photo_picker.item;

import KIa.a.a;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import jta;
import oXa;

public final class LoadingFirstFacesItemView
  extends ConstraintLayout
  implements jta<KIa.a.a>
{
  public static final a u = new a(null);
  
  public LoadingFirstFacesItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(KIa.a.a parama)
  {
    oXa.b(parama, "model");
  }
  
  public static final class a
  {
    public final LoadingFirstFacesItemView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493042, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (LoadingFirstFacesItemView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.LoadingFirstFacesItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/LoadingFirstFacesItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */