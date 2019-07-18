package io.faceapp.ui.updates.item;

import _Va;
import android.content.Context;
import android.support.v7.widget.I;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;
import rHa;

public final class UpdatesLabelItemView
  extends I
  implements jta<rHa>
{
  public static final a d = new a(null);
  private HashMap e;
  
  public UpdatesLabelItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(rHa paramrHa)
  {
    oXa.b(paramrHa, "model");
    UpdatesLabelItemView localUpdatesLabelItemView = (UpdatesLabelItemView)b(k.labelView);
    oXa.a(localUpdatesLabelItemView, "labelView");
    localUpdatesLabelItemView.setText(paramrHa.a());
  }
  
  public View b(int paramInt)
  {
    if (this.e == null) {
      this.e = new HashMap();
    }
    View localView1 = (View)this.e.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.e.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final UpdatesLabelItemView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493061, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (UpdatesLabelItemView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.updates.item.UpdatesLabelItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/updates/item/UpdatesLabelItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */