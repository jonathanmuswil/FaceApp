package io.faceapp.ui.facebook.item;

import VQa;
import _Va;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import io.faceapp.k;
import io.faceapp.ui.components.AuthButtonView;
import io.faceapp.ui.components.AuthButtonView.a.a;
import java.util.HashMap;
import jta;
import oXa;
import pwa.b;

public final class FacebookAuthItemView
  extends LinearLayout
  implements jta<b>
{
  public static final a a = new a(null);
  private VQa<pwa.b> b;
  private HashMap c;
  
  public FacebookAuthItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(b paramb)
  {
    oXa.b(paramb, "model");
    ((AuthButtonView)b(k.loginFacebookBtnView)).a(new AuthButtonView.a.a(Integer.valueOf(2131689636)));
    paramb = (AuthButtonView)b(k.loginFacebookBtnView);
    oXa.a(paramb, "loginFacebookBtnView");
    paramb.setOnClickListener(new a(this));
  }
  
  public View b(int paramInt)
  {
    if (this.c == null) {
      this.c = new HashMap();
    }
    View localView1 = (View)this.c.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.c.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final FacebookAuthItemView a(ViewGroup paramViewGroup, VQa<pwa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493029, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (FacebookAuthItemView)paramViewGroup;
        FacebookAuthItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.facebook.item.FacebookAuthItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/facebook/item/FacebookAuthItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */