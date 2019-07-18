package io.faceapp.ui.photo_picker.item;

import KIa.a.b;
import KIa.d;
import VQa;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class NoPermissionItemView
  extends ConstraintLayout
  implements jta<KIa.a.b>
{
  public static final a u = new a(null);
  private VQa<KIa.d> v;
  private HashMap w;
  
  public NoPermissionItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(KIa.a.b paramb)
  {
    oXa.b(paramb, "model");
    paramb = (TextView)c(k.requestPermission);
    oXa.a(paramb, "requestPermission");
    paramb.setOnClickListener(new c(this));
  }
  
  public View c(int paramInt)
  {
    if (this.w == null) {
      this.w = new HashMap();
    }
    View localView1 = (View)this.w.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.w.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final NoPermissionItemView a(ViewGroup paramViewGroup, VQa<KIa.d> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493043, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (NoPermissionItemView)paramViewGroup;
        NoPermissionItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.NoPermissionItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/NoPermissionItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */