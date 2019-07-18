package io.faceapp.ui.polls.item;

import GPa;
import Ie;
import KOa;
import LIa.a;
import Mka;
import Pka;
import ROa;
import UPa;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cWa;
import cXa;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import io.faceapp.services.glide.d;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import jta;
import oXa;
import zYa;

public final class PartAuthorItemView
  extends ConstraintLayout
  implements jta<LIa.a>
{
  public static final a u = new a(null);
  private cXa<? super LIa.a, cWa> v;
  private HashMap w;
  
  public PartAuthorItemView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public PartAuthorItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public PartAuthorItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493045, this);
    setPadding(0, (int)KOa.b.a(paramContext, 10), 0, 0);
    if (isInEditMode()) {
      setBackgroundColor(getResources().getColor(2131099686));
    }
  }
  
  public void a(LIa.a parama)
  {
    oXa.b(parama, "model");
    parama = parama.a();
    Object localObject = a.a(getContext()).a(parama.t().l()).c().a(2131231087);
    oXa.a(localObject, "GlideApp.with(context)\n …photo_placeholder_circle)");
    GPa.a((c)localObject, 0, 1, null).a((ImageView)c(k.authorAvatar));
    localObject = (TextView)c(k.authorName);
    oXa.a(localObject, "authorName");
    ((TextView)localObject).setText(parama.t().m());
    localObject = (TextView)c(k.pollDate);
    oXa.a(localObject, "pollDate");
    parama = ROa.c.a().format(parama.l());
    oXa.a(parama, "DATE_FORMAT.format(poll.createdAt)");
    ((TextView)localObject).setText(zYa.a(parama));
    parama = (ImageView)c(k.pollMenu);
    oXa.a(parama, "pollMenu");
    UPa.a(parama);
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
    public final PartAuthorItemView a(ViewGroup paramViewGroup, cXa<? super LIa.a, cWa> paramcXa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramcXa, "onClick");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      paramViewGroup = new PartAuthorItemView(paramViewGroup);
      PartAuthorItemView.a(paramViewGroup, paramcXa);
      return paramViewGroup;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartAuthorItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */