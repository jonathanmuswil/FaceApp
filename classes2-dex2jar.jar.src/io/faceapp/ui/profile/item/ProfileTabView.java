package io.faceapp.ui.profile.item;

import MOa;
import UPa;
import _Va;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.faceapp.k;
import ita;
import java.util.HashMap;
import oXa;

public final class ProfileTabView
  extends ConstraintLayout
{
  public static final a u = new a(null);
  private HashMap v;
  
  public ProfileTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final void setBadge(int paramInt)
  {
    TextView localTextView;
    if (paramInt == 0)
    {
      localTextView = (TextView)c(k.badge);
      oXa.a(localTextView, "badge");
      UPa.c(localTextView);
    }
    else
    {
      localTextView = (TextView)c(k.badge);
      oXa.a(localTextView, "badge");
      MOa localMOa = MOa.a;
      Context localContext = getContext();
      oXa.a(localContext, "context");
      localTextView.setText(localMOa.a(localContext, paramInt));
      localTextView = (TextView)c(k.badge);
      oXa.a(localTextView, "badge");
      UPa.c(localTextView, 0L, 1, null);
    }
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
    int i;
    if (paramBoolean) {
      i = 2131099883;
    } else {
      i = 2131099849;
    }
    ((TextView)c(k.labelView)).setTextColor(getResources().getColor(i));
  }
  
  public static final class a
  {
    public final ProfileTabView a(ViewGroup paramViewGroup, String paramString)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramString, "text");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493053, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (ProfileTabView)paramViewGroup;
        TextView localTextView = (TextView)paramViewGroup.c(k.labelView);
        oXa.a(localTextView, "labelView");
        localTextView.setText(paramString);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.profile.item.ProfileTabView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/profile/item/ProfileTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */