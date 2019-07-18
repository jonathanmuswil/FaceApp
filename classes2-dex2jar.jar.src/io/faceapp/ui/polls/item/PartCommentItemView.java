package io.faceapp.ui.polls.item;

import LIa.b;
import Pka;
import Rka;
import UPa;
import VQa;
import WIa;
import XIa.c;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.text.style.CharacterStyle;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class PartCommentItemView
  extends ConstraintLayout
  implements jta<LIa.b>
{
  public static final a u = new a(null);
  private VQa<XIa.c> v;
  private HashMap w;
  
  public PartCommentItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final CharSequence a(String paramString, int paramInt)
  {
    String str1 = getContext().getString(WIa.b.a(paramInt));
    String str2 = getContext().getString(2131689829);
    oXa.a(str2, "unformattedText");
    paramString = UPa.a(str2, paramString, "{user}", new CharacterStyle[] { new TypefaceSpan("sans-serif-medium") });
    oXa.a(str1, "styleName");
    return UPa.a(paramString, str1, "{style}", new CharacterStyle[] { new TypefaceSpan("sans-serif-medium") });
  }
  
  public void a(LIa.b paramb)
  {
    oXa.b(paramb, "model");
    paramb = paramb.a();
    TextView localTextView = (TextView)c(k.commentTitle);
    oXa.a(localTextView, "commentTitle");
    localTextView.setText(a(paramb.p().m(), paramb.l()));
    localTextView = (TextView)c(k.commentBody);
    oXa.a(localTextView, "commentBody");
    localTextView.setText(paramb.m());
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
    public final PartCommentItemView a(ViewGroup paramViewGroup, VQa<XIa.c> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493046, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartCommentItemView)paramViewGroup;
        PartCommentItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartCommentItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartCommentItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */