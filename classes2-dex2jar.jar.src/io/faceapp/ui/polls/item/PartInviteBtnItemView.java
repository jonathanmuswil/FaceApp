package io.faceapp.ui.polls.item;

import LIa.e;
import UPa;
import VQa;
import XIa.c;
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

public final class PartInviteBtnItemView
  extends ConstraintLayout
  implements jta<LIa.e>
{
  public static final a u = new a(null);
  private VQa<XIa.c> v;
  private HashMap w;
  
  public PartInviteBtnItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(LIa.e parame)
  {
    oXa.b(parame, "model");
    if (parame.a())
    {
      parame = (TextView)c(k.inviteBtn);
      oXa.a(parame, "inviteBtn");
      UPa.a(parame);
    }
    else
    {
      TextView localTextView = (TextView)c(k.inviteBtn);
      oXa.a(localTextView, "inviteBtn");
      UPa.e(localTextView);
      localTextView = (TextView)c(k.inviteBtn);
      oXa.a(localTextView, "inviteBtn");
      localTextView.setOnClickListener(new d(this, parame));
    }
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
    public final PartInviteBtnItemView a(ViewGroup paramViewGroup, VQa<XIa.c> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493049, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartInviteBtnItemView)paramViewGroup;
        PartInviteBtnItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartInviteBtnItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartInviteBtnItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */