package io.faceapp.ui.updates.item;

import GPa;
import Ie;
import Pka;
import ROa;
import UPa;
import VQa;
import WVa;
import Wka;
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
import java.text.SimpleDateFormat;
import java.util.HashMap;
import jta;
import mWa;
import oXa;
import zMa.b;
import zYa;

public final class SingleNewVoteItemView
  extends ConstraintLayout
  implements jta<Wka>
{
  public static final a u = new a(null);
  private VQa<zMa.b> v;
  private HashMap w;
  
  public SingleNewVoteItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(Wka paramWka)
  {
    oXa.b(paramWka, "model");
    Object localObject1 = (WVa)mWa.e(paramWka.f());
    Object localObject2 = (Pka)((WVa)localObject1).a();
    localObject1 = (String)((WVa)localObject1).b();
    Object localObject3 = a.a(getContext()).a(((Pka)localObject2).l()).c().a(2131231087);
    oXa.a(localObject3, "GlideApp.with(context)\n …photo_placeholder_circle)");
    GPa.a((c)localObject3, 0, 1, null).a((ImageView)c(k.avatarView));
    localObject3 = (TextView)c(k.title);
    oXa.a(localObject3, "title");
    ((TextView)localObject3).setText(UPa.a(paramWka.e(), ((Pka)localObject2).m(), "{user[0]}", new CharacterStyle[] { new TypefaceSpan("sans-serif-medium") }));
    localObject2 = (TextView)c(k.commentView);
    oXa.a(localObject2, "commentView");
    ((TextView)localObject2).setText((CharSequence)localObject1);
    localObject1 = (TextView)c(k.date);
    oXa.a(localObject1, "date");
    localObject2 = ROa.c.a().format(paramWka.c());
    oXa.a(localObject2, "DATE_FORMAT.format(model.created)");
    ((TextView)localObject1).setText(zYa.a((String)localObject2));
    setOnClickListener(new d(this, paramWka));
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
    public final SingleNewVoteItemView a(ViewGroup paramViewGroup, VQa<zMa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493060, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (SingleNewVoteItemView)paramViewGroup;
        SingleNewVoteItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.updates.item.SingleNewVoteItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/updates/item/SingleNewVoteItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */