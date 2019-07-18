package io.faceapp.ui.polls.item;

import LIa.i;
import Mka;
import Pka;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cWa;
import cXa;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;
import zYa;

public final class PartVoteBtnItemView
  extends ConstraintLayout
  implements jta<LIa.i>
{
  public static final a u = new a(null);
  private cXa<? super LIa.i, cWa> v;
  private HashMap w;
  
  public PartVoteBtnItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(LIa.i parami)
  {
    oXa.b(parami, "model");
    Object localObject = getContext().getString(2131689837);
    TextView localTextView = (TextView)c(k.voteLabel);
    oXa.a(localTextView, "voteLabel");
    oXa.a(localObject, "unformattedText");
    localTextView.setText(zYa.a((String)localObject, "{user}", parami.a().t().m(), false, 4, null));
    localObject = (TextView)c(k.voteBtn);
    oXa.a(localObject, "voteBtn");
    ((View)localObject).setOnClickListener(new g(this, parami));
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
    public final PartVoteBtnItemView a(ViewGroup paramViewGroup, cXa<? super LIa.i, cWa> paramcXa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramcXa, "onClick");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493052, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartVoteBtnItemView)paramViewGroup;
        PartVoteBtnItemView.a(paramViewGroup, paramcXa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartVoteBtnItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartVoteBtnItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */