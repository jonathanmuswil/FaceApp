package io.faceapp.ui.layouts.selector.item;

import GPa;
import Ie;
import Ika;
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
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.ui.misc.b;
import java.util.HashMap;
import jta;
import oXa;
import sFa.b;
import yka;

public final class FilterItemView
  extends ConstraintLayout
  implements jta<e>
{
  public static final a u = new a(null);
  private VQa<sFa.b> v;
  private b w;
  private HashMap x;
  
  public FilterItemView(Context paramContext, AttributeSet paramAttributeSet)
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
  
  public void a(e parame)
  {
    oXa.b(parame, "model");
    yka localyka = parame.a().a();
    Object localObject1 = (TextView)c(k.filterName);
    oXa.a(localObject1, "filterName");
    ((TextView)localObject1).setText(localyka.c());
    Object localObject2 = (ImageView)c(k.proStatusLabelView);
    localObject1 = parame.b();
    int i = c.a[localObject1.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        ((ImageView)localObject2).setImageDrawable(null);
      }
    }
    else {
      ((ImageView)localObject2).setImageResource(2131231060);
    }
    localObject2 = localyka.a();
    localObject1 = a.a(getContext()).a((String)localObject2);
    oXa.a(localObject1, "GlideApp\n               …          .load(thumbUrl)");
    localObject2 = GPa.a(GPa.a((c)localObject1, (String)localObject2, null, 2, null), 0, 1, null);
    localObject1 = getContext();
    oXa.a(localObject1, "context");
    ((c)localObject2).a(a((Context)localObject1)).a((ImageView)c(k.thumb));
    setOnClickListener(new d(this, parame, localyka));
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
    public final FilterItemView a(ViewGroup paramViewGroup, VQa<sFa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493031, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (FilterItemView)paramViewGroup;
        FilterItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.selector.item.FilterItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/selector/item/FilterItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */