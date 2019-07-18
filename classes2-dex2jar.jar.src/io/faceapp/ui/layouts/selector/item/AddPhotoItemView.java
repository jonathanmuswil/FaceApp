package io.faceapp.ui.layouts.selector.item;

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
import sFa.b;

public final class AddPhotoItemView
  extends AppCompatImageView
  implements jta<b>
{
  public static final a c = new a(null);
  private VQa<sFa.b> d;
  
  public AddPhotoItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(b paramb)
  {
    oXa.b(paramb, "model");
    setOnClickListener(new a(this));
  }
  
  public static final class a
  {
    public final AddPhotoItemView a(ViewGroup paramViewGroup, VQa<sFa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493030, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (AddPhotoItemView)paramViewGroup;
        AddPhotoItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.selector.item.AddPhotoItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/AddPhotoItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */