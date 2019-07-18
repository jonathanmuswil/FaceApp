package io.faceapp.ui.fun.item;

import Eka;
import GPa;
import Ie;
import VQa;
import _Va;
import android.content.Context;
import android.graphics.Typeface;
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
import ita;
import java.util.HashMap;
import jta;
import lxa.e;
import oXa;

public final class FunItemView
  extends ConstraintLayout
  implements jta<a>
{
  public static final a u = new a(null);
  private VQa<lxa.e> v;
  private HashMap w;
  
  public FunItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    String str = parama.a().b();
    Object localObject = io.faceapp.services.glide.a.a(getContext()).a(str);
    oXa.a(localObject, "GlideApp.with(context)\n …          .load(imageUri)");
    localObject = GPa.a((c)localObject, str, null, 2, null).a(2131231088);
    oXa.a(localObject, "GlideApp.with(context)\n …r(R.drawable.placeholder)");
    GPa.a((c)localObject, 0, 1, null).a((ImageView)c(k.filterImageView));
    localObject = (TextView)c(k.labelView);
    oXa.a(localObject, "labelView");
    ((TextView)localObject).setText(parama.a().d());
    setSelected(parama.b());
    setOnClickListener(new b(this, parama));
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
  
  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    TextView localTextView = (TextView)c(k.labelView);
    oXa.a(localTextView, "labelView");
    Typeface localTypeface;
    if (paramBoolean) {
      localTypeface = ita.d.c();
    } else {
      localTypeface = ita.d.b();
    }
    localTextView.setTypeface(localTypeface);
  }
  
  public static final class a
  {
    public final FunItemView a(ViewGroup paramViewGroup, VQa<lxa.e> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493033, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (FunItemView)paramViewGroup;
        FunItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.`fun`.item.FunItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/fun/item/FunItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */