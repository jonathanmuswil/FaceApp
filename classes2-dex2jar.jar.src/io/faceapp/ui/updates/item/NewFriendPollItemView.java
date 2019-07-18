package io.faceapp.ui.updates.item;

import GPa;
import Ie;
import Oka;
import Pka;
import ROa;
import UPa;
import VQa;
import Vka;
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
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import jta;
import oXa;
import zMa.b;
import zMa.b.a;
import zMa.b.b;
import zYa;

public final class NewFriendPollItemView
  extends ConstraintLayout
  implements jta<Vka>
{
  public static final a u = new a(null);
  private VQa<zMa.b> v;
  private HashMap w;
  
  public NewFriendPollItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(Vka paramVka)
  {
    oXa.b(paramVka, "model");
    Object localObject1 = paramVka.d().n();
    Object localObject2 = io.faceapp.services.glide.a.a(getContext()).a(((Pka)localObject1).l()).c().a(2131231087);
    oXa.a(localObject2, "GlideApp.with(context)\n …photo_placeholder_circle)");
    GPa.a((c)localObject2, 0, 1, null).a((ImageView)c(k.avatarView));
    localObject2 = (TextView)c(k.title);
    oXa.a(localObject2, "title");
    ((TextView)localObject2).setText(UPa.a(paramVka.e(), ((Pka)localObject1).m(), "{user}", new CharacterStyle[] { new TypefaceSpan("sans-serif-medium") }));
    localObject2 = (TextView)c(k.date);
    oXa.a(localObject2, "date");
    localObject1 = ROa.c.a().format(paramVka.c());
    oXa.a(localObject1, "DATE_FORMAT.format(model.created)");
    ((TextView)localObject2).setText(zYa.a((String)localObject1));
    if (paramVka.d().m() != null) {
      paramVka = new zMa.b.a(paramVka.d().l());
    } else {
      paramVka = new zMa.b.b(paramVka.d().l());
    }
    setOnClickListener(new a(this, paramVka));
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
    public final NewFriendPollItemView a(ViewGroup paramViewGroup, VQa<zMa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493057, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (NewFriendPollItemView)paramViewGroup;
        NewFriendPollItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.updates.item.NewFriendPollItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/updates/item/NewFriendPollItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */