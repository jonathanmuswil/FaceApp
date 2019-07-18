package io.faceapp.ui.photo_picker.item;

import _Va;
import android.content.Context;
import android.support.v7.widget.I;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import jta;
import oXa;
import rHa;

public final class HeaderLabelItemView
  extends I
  implements jta<rHa>
{
  public static final a d = new a(null);
  
  public HeaderLabelItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(rHa paramrHa)
  {
    oXa.b(paramrHa, "model");
    setText(paramrHa.a());
  }
  
  public static final class a
  {
    public final HeaderLabelItemView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493041, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (HeaderLabelItemView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.HeaderLabelItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/HeaderLabelItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */