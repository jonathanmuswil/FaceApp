package io.faceapp.ui.polls.item;

import CWa;
import KOa;
import LIa.d;
import Mka;
import NXa;
import UPa;
import WIa;
import WIa.a;
import _Va;
import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import cWa;
import cXa;
import io.faceapp.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;

public final class PartImageItemView
  extends ConstraintLayout
  implements jta<LIa.d>
{
  public static final a u = new a(null);
  private cXa<? super LIa.d, cWa> v;
  private HashMap w;
  
  public PartImageItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final void a(TextView paramTextView, ImageView paramImageView, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = KOa.b;
      localObject2 = getContext();
      oXa.a(localObject2, "context");
      UPa.a(paramTextView, Integer.valueOf(((KOa)localObject1).c((Context)localObject2, 2131165544)), null, null, null, 14, null);
      localObject2 = paramTextView.getLayoutParams();
      paramTextView = (TextView)localObject2;
      if (!(localObject2 instanceof ViewGroup.MarginLayoutParams)) {
        paramTextView = null;
      }
      localObject1 = (ViewGroup.MarginLayoutParams)paramTextView;
      if (localObject1 != null)
      {
        paramTextView = KOa.b;
        localObject2 = getContext();
        oXa.a(localObject2, "context");
        ((ViewGroup.MarginLayoutParams)localObject1).leftMargin = paramTextView.c((Context)localObject2, 2131165542);
      }
      paramImageView.setImageResource(2131231048);
    }
    else
    {
      localObject2 = KOa.b;
      localObject1 = getContext();
      oXa.a(localObject1, "context");
      UPa.a(paramTextView, Integer.valueOf(((KOa)localObject2).c((Context)localObject1, 2131165543)), null, null, null, 14, null);
      localObject2 = paramTextView.getLayoutParams();
      paramTextView = (TextView)localObject2;
      if (!(localObject2 instanceof ViewGroup.MarginLayoutParams)) {
        paramTextView = null;
      }
      localObject2 = (ViewGroup.MarginLayoutParams)paramTextView;
      if (localObject2 != null)
      {
        paramTextView = KOa.b;
        localObject1 = getContext();
        oXa.a(localObject1, "context");
        ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = paramTextView.c((Context)localObject1, 2131165541);
      }
      paramImageView.setImageResource(0);
    }
  }
  
  public void a(LIa.d paramd)
  {
    oXa.b(paramd, "model");
    Mka localMka = paramd.a();
    Object localObject1 = (TextView)c(k.label_original);
    oXa.a(localObject1, "label_original");
    Object localObject2 = (TextView)c(k.label_style1);
    oXa.a(localObject2, "label_style1");
    Object localObject3 = (TextView)c(k.label_style2);
    oXa.a(localObject3, "label_style2");
    Object localObject4 = (TextView)c(k.label_style3);
    oXa.a(localObject4, "label_style3");
    localObject4 = mWa.a(new TextView[] { localObject1, localObject2, localObject3, localObject4 });
    localObject1 = (ImageView)c(k.winning_icon_1);
    oXa.a(localObject1, "winning_icon_1");
    localObject3 = (ImageView)c(k.winning_icon_2);
    oXa.a(localObject3, "winning_icon_2");
    localObject2 = (ImageView)c(k.winning_icon_3);
    oXa.a(localObject2, "winning_icon_3");
    localObject3 = mWa.a(new ImageView[] { localObject1, localObject3, localObject2 });
    localObject2 = WIa.b.a(localMka);
    localObject1 = NXa.d(1, 4).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      int i = ((CWa)localObject1).nextInt();
      boolean bool;
      if (!paramd.b()) {
        bool = false;
      } else {
        bool = ((WIa.a)localObject2).c().contains(Integer.valueOf(i));
      }
      Object localObject5 = ((ArrayList)localObject4).get(i);
      oXa.a(localObject5, "labelViews[it]");
      TextView localTextView = (TextView)localObject5;
      localObject5 = ((ArrayList)localObject3).get(i - 1);
      oXa.a(localObject5, "winningIcons[it - 1]");
      a(localTextView, (ImageView)localObject5, bool);
    }
    localObject1 = (ProgressBar)c(k.imageLoading);
    localObject2 = (ImageView)c(k.pollImage);
    ((View)localObject2).getViewTreeObserver().addOnPreDrawListener(new b((View)localObject2, localMka, (ProgressBar)localObject1, (ArrayList)localObject4, (ArrayList)localObject3));
    setOnClickListener(new c(this, paramd));
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
    public final PartImageItemView a(ViewGroup paramViewGroup, cXa<? super LIa.d, cWa> paramcXa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramcXa, "onClick");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493048, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartImageItemView)paramViewGroup;
        PartImageItemView.a(paramViewGroup, paramcXa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartImageItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartImageItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */