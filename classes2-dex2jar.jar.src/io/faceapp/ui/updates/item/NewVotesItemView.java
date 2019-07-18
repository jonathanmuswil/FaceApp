package io.faceapp.ui.updates.item;

import CWa;
import GPa;
import Ie;
import NXa;
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
import io.faceapp.services.glide.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;
import zMa.b;
import zYa;

public final class NewVotesItemView
  extends ConstraintLayout
  implements jta<Wka>
{
  public static final a u = new a(null);
  private VQa<zMa.b> v;
  private HashMap w;
  
  public NewVotesItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final CharSequence b(Wka paramWka)
  {
    int i = paramWka.g();
    Object localObject1 = paramWka.f();
    ArrayList localArrayList = new ArrayList(mWa.a((Iterable)localObject1, 10));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      localArrayList.add((Pka)((WVa)((Iterator)localObject1).next()).c());
    }
    paramWka = paramWka.e();
    localObject1 = NXa.d(0, localArrayList.size()).iterator();
    for (int j = 0; ((Iterator)localObject1).hasNext(); j++)
    {
      int k = ((CWa)localObject1).nextInt();
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("{user[");
      ((StringBuilder)localObject2).append(k);
      ((StringBuilder)localObject2).append("]}");
      localObject2 = ((StringBuilder)localObject2).toString();
      if (zYa.a(paramWka, (String)localObject2, 0, false, 6, null) < 0) {
        break;
      }
      paramWka = UPa.a(paramWka, ((Pka)localArrayList.get(k)).m(), (String)localObject2, new CharacterStyle[] { a.a(u) });
    }
    return UPa.a(paramWka, String.valueOf(i - j), "{other_votes_count}", new CharacterStyle[] { a.a(u) });
  }
  
  public void a(Wka paramWka)
  {
    oXa.b(paramWka, "model");
    Object localObject1 = (Pka)((WVa)mWa.e(paramWka.f())).c();
    Object localObject2 = (Pka)((WVa)paramWka.f().get(1)).c();
    localObject1 = a.a(getContext()).a(((Pka)localObject1).l()).c().a(2131231087);
    oXa.a(localObject1, "GlideApp.with(context)\n …photo_placeholder_circle)");
    GPa.a((c)localObject1, 0, 1, null).a((ImageView)c(k.avatarBack));
    localObject2 = a.a(getContext()).a(((Pka)localObject2).l()).c().a(2131231087).ba();
    oXa.a(localObject2, "GlideApp.with(context)\n …    .optionalCircleCrop()");
    GPa.a((c)localObject2, 0, 1, null).a((ImageView)c(k.avatarFront));
    localObject2 = (TextView)c(k.title);
    oXa.a(localObject2, "title");
    ((TextView)localObject2).setText(b(paramWka));
    localObject1 = (TextView)c(k.date);
    oXa.a(localObject1, "date");
    localObject2 = ROa.c.a().format(paramWka.c());
    oXa.a(localObject2, "DATE_FORMAT.format(model.created)");
    ((TextView)localObject1).setText(zYa.a((String)localObject2));
    setOnClickListener(new b(this, paramWka));
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
    private final TypefaceSpan a()
    {
      return new TypefaceSpan("sans-serif-medium");
    }
    
    public final NewVotesItemView a(ViewGroup paramViewGroup, VQa<zMa.b> paramVQa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramVQa, "viewActions");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493058, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (NewVotesItemView)paramViewGroup;
        NewVotesItemView.a(paramViewGroup, paramVQa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.updates.item.NewVotesItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/updates/item/NewVotesItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */