package io.faceapp.ui.layouts.item;

import VQa;
import XDa.b;
import XDa.c;
import _Va;
import android.animation.LayoutTransition;
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
import java.util.HashMap;
import jta;
import oXa;

public final class LayoutModeItemView
  extends ConstraintLayout
  implements jta<XDa.b>
{
  private static final Typeface u = Typeface.create("sans-serif-medium", 0);
  private static final Typeface v = Typeface.DEFAULT;
  public static final a w = new a(null);
  private VQa<XDa.c> x;
  private XDa.b y;
  private HashMap z;
  
  public LayoutModeItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(XDa.b paramb)
  {
    oXa.b(paramb, "model");
    this.y = paramb;
    ((ImageView)c(k.icon)).setImageResource(paramb.b());
    ((TextView)c(k.title)).setText(paramb.d());
    setOnClickListener(new a(this, paramb));
  }
  
  public View c(int paramInt)
  {
    if (this.z == null) {
      this.z = new HashMap();
    }
    View localView1 = (View)this.z.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.z.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final XDa.b getMode$app_prodRelease()
  {
    return this.y;
  }
  
  public final void setMode$app_prodRelease(XDa.b paramb)
  {
    this.y = paramb;
  }
  
  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    TextView localTextView = (TextView)c(k.title);
    oXa.a(localTextView, "title");
    Typeface localTypeface;
    if (paramBoolean) {
      localTypeface = u;
    } else {
      localTypeface = v;
    }
    localTextView.setTypeface(localTypeface);
  }
  
  public static final class a
  {
    public final LayoutModeItemView a(ViewGroup paramViewGroup, VQa<XDa.c> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "screenActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493039, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (LayoutModeItemView)paramViewGroup;
        LayoutModeItemView.a(paramViewGroup, paramVQa);
        paramViewGroup.getLayoutTransition().enableTransitionType(4);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.item.LayoutModeItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/layouts/item/LayoutModeItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */