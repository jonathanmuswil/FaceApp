package io.faceapp.ui.polls.item;

import GPa;
import Ie;
import LIa.c;
import Pka;
import ROa;
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
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import jta;
import oXa;
import zYa;

public final class PartCommentWithAvatarItemView
  extends ConstraintLayout
  implements jta<LIa.c>
{
  public static final a u = new a(null);
  private VQa<XIa.c> v;
  private HashMap w;
  
  public PartCommentWithAvatarItemView(Context paramContext, AttributeSet paramAttributeSet)
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
  
  public void a(LIa.c paramc)
  {
    oXa.b(paramc, "model");
    Object localObject1 = paramc.a().p();
    Object localObject2 = a.a(getContext()).a(((Pka)localObject1).l()).c().a(2131231087);
    oXa.a(localObject2, "GlideApp.with(context)\n …photo_placeholder_circle)");
    GPa.a((c)localObject2, 0, 1, null).a((ImageView)c(k.avatarView));
    localObject2 = (TextView)c(k.title);
    oXa.a(localObject2, "title");
    ((TextView)localObject2).setText(a(((Pka)localObject1).m(), paramc.a().l()));
    localObject1 = (TextView)c(k.commentView);
    oXa.a(localObject1, "commentView");
    ((TextView)localObject1).setText(paramc.a().m());
    localObject1 = (TextView)c(k.date);
    oXa.a(localObject1, "date");
    paramc = ROa.c.a().format(paramc.a().n());
    oXa.a(paramc, "DATE_FORMAT.format(model.vote.createdAt)");
    ((TextView)localObject1).setText(zYa.a(paramc));
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
    public final PartCommentWithAvatarItemView a(ViewGroup paramViewGroup, VQa<XIa.c> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493047, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartCommentWithAvatarItemView)paramViewGroup;
        PartCommentWithAvatarItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartCommentWithAvatarItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartCommentWithAvatarItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */