package io.faceapp.ui.layouts.stylist.selector.item;

import GPa;
import Ie;
import KFa.b;
import LFa;
import VQa;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import io.faceapp.ui.misc.b;
import java.util.HashMap;
import jta;
import oXa;

public final class AvailableFilterItemView
  extends ConstraintLayout
  implements jta<LFa>
{
  public static final a u = new a(null);
  private VQa<KFa.b> v;
  private b w;
  private HashMap x;
  
  public AvailableFilterItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final b a(Context paramContext)
  {
    b localb = this.w;
    if (localb != null) {
      return localb;
    }
    paramContext = paramContext.getApplicationContext();
    oXa.a(paramContext, "context.applicationContext");
    paramContext = new b(paramContext, false, false, 6, null);
    this.w = paramContext;
    return paramContext;
  }
  
  public void a(LFa paramLFa)
  {
    oXa.b(paramLFa, "model");
    Object localObject = (TextView)c(k.filterName);
    oXa.a(localObject, "filterName");
    ((TextView)localObject).setText(paramLFa.b());
    localObject = io.faceapp.services.glide.a.a(getContext()).a(paramLFa.e());
    oXa.a(localObject, "GlideApp\n               …    .load(model.thumbUrl)");
    c localc = GPa.a(GPa.a((c)localObject, paramLFa.e(), null, 2, null), 0, 1, null);
    localObject = getContext();
    oXa.a(localObject, "context");
    localc.a(a((Context)localObject)).a((ImageView)c(k.thumb));
    setOnClickListener(new a(this, paramLFa));
  }
  
  public View c(int paramInt)
  {
    if (this.x == null) {
      this.x = new HashMap();
    }
    View localView1 = (View)this.x.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.x.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final AvailableFilterItemView a(ViewGroup paramViewGroup, VQa<KFa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493055, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (AvailableFilterItemView)paramViewGroup;
        AvailableFilterItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.stylist.selector.item.AvailableFilterItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/stylist/selector/item/AvailableFilterItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */