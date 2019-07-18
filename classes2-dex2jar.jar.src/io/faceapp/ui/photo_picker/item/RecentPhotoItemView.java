package io.faceapp.ui.photo_picker.item;

import GPa;
import Hf;
import Ie;
import KIa.d;
import Rja;
import UPa;
import VQa;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import eoa.b;
import eoa.c;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.util.HashMap;
import jta;
import oXa;

public final class RecentPhotoItemView
  extends ConstraintLayout
  implements jta<eoa.c>
{
  public static final a u = new a(null);
  private VQa<KIa.d> v;
  private HashMap w;
  
  public RecentPhotoItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(eoa.c paramc)
  {
    oXa.b(paramc, "model");
    Object localObject = a.a(getContext()).a(paramc.a().b()).a(Hf.d).a(2131231088);
    oXa.a(localObject, "GlideApp.with(context)\n …r(R.drawable.placeholder)");
    GPa.a((c)localObject, 0, 1, null).a((ImageView)c(k.thumb));
    if (paramc.b() == eoa.b.b)
    {
      ((ImageView)c(k.sourceIcon)).setImageResource(2131231035);
      localObject = (ImageView)c(k.sourceIcon);
      oXa.a(localObject, "sourceIcon");
      UPa.e((View)localObject);
    }
    else
    {
      localObject = (ImageView)c(k.sourceIcon);
      oXa.a(localObject, "sourceIcon");
      UPa.a((View)localObject);
    }
    if (paramc.b() == eoa.b.c)
    {
      localObject = (ImageView)c(k.demoLabel);
      oXa.a(localObject, "demoLabel");
      UPa.e((View)localObject);
    }
    else
    {
      localObject = (ImageView)c(k.demoLabel);
      oXa.a(localObject, "demoLabel");
      UPa.a((View)localObject);
    }
    setOnClickListener(new g(this, paramc));
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
    public final RecentPhotoItemView a(ViewGroup paramViewGroup, VQa<KIa.d> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493054, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (RecentPhotoItemView)paramViewGroup;
        RecentPhotoItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.photo_picker.item.RecentPhotoItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/RecentPhotoItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */