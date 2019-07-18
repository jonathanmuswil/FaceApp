package io.faceapp.ui.onboarding.page;

import HHa.a;
import HHa.a.b;
import UPa;
import WVa;
import _Va;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.android.billingclient.api.I;
import ija;
import io.faceapp.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jta;
import mWa;
import oXa;
import zYa;

public final class YearlyTrialPageView
  extends ConstraintLayout
  implements jta<HHa.a.b>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public YearlyTrialPageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private final String a(I paramI)
  {
    String str = getContext().getString(2131689799);
    paramI = a.a(u, paramI, 12);
    oXa.a(str, "fullText");
    return zYa.a(str, "{price}", paramI, false, 4, null);
  }
  
  private final String b(I paramI)
  {
    String str = getContext().getString(2131689798);
    paramI = a.a(u, paramI, 0, 2, null);
    oXa.a(str, "fullText");
    return zYa.a(str, "{price}", paramI, false, 4, null);
  }
  
  private final void d()
  {
    getViewTreeObserver().addOnPreDrawListener(new c(this));
  }
  
  private final void e()
  {
    Object localObject1 = getResources().getString(2131689700);
    oXa.a(localObject1, "fullText");
    Object localObject2 = zYa.a((CharSequence)localObject1, new String[] { "." }, false, 0, 6, null);
    Object localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
    Iterator localIterator = ((Iterable)localObject2).iterator();
    String str;
    while (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      localObject2 = new StringBuilder();
      if (str != null)
      {
        ((StringBuilder)localObject2).append(zYa.d(str).toString());
        ((StringBuilder)localObject2).append('.');
        ((Collection)localObject3).add(((StringBuilder)localObject2).toString());
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type kotlin.CharSequence");
      }
    }
    localObject2 = localObject3;
    if (((Collection)localObject3).size() == 1)
    {
      localObject2 = zYa.a((CharSequence)localObject1, new String[] { "。" }, false, 0, 6, null);
      localObject3 = new ArrayList(mWa.a((Iterable)localObject2, 10));
      localObject1 = ((Iterable)localObject2).iterator();
      for (;;)
      {
        localObject2 = localObject3;
        if (!((Iterator)localObject1).hasNext()) {
          break label268;
        }
        str = (String)((Iterator)localObject1).next();
        localObject2 = new StringBuilder();
        if (str == null) {
          break;
        }
        ((StringBuilder)localObject2).append(zYa.d(str).toString());
        ((StringBuilder)localObject2).append('。');
        ((Collection)localObject3).add(((StringBuilder)localObject2).toString());
      }
      throw new _Va("null cannot be cast to non-null type kotlin.CharSequence");
    }
    label268:
    if (((Collection)localObject2).size() >= 3)
    {
      localObject3 = (TextView)c(k.payment2);
      oXa.a(localObject3, "payment2");
      ((TextView)localObject3).setText((CharSequence)((List)localObject2).get(0));
      localObject3 = (TextView)c(k.payment3);
      oXa.a(localObject3, "payment3");
      ((TextView)localObject3).setText((CharSequence)((List)localObject2).get(1));
      localObject3 = (TextView)c(k.payment4);
      oXa.a(localObject3, "payment4");
      ((TextView)localObject3).setText((CharSequence)((List)localObject2).get(2));
    }
    else
    {
      ((TextView)c(k.payment2)).setText(2131689786);
      ((TextView)c(k.payment3)).setText(2131689787);
      ((TextView)c(k.payment4)).setText(2131689788);
    }
  }
  
  private final CharSequence getTermsAndPrivacyText()
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("{terms} ");
    ((StringBuilder)localObject1).append(getContext().getString(2131689784));
    ((StringBuilder)localObject1).append(" {privacy}");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = getContext().getString(2131689737);
    oXa.a(localObject2, "context.getString(R.stri…InAppPurchase_TermsOfUse)");
    localObject2 = UPa.a((CharSequence)localObject1, (String)localObject2, "{terms}", new CharacterStyle[] { new d(this), new StyleSpan(1) });
    localObject1 = getContext().getString(2131689714);
    oXa.a(localObject1, "context.getString(R.stri…ppPurchase_PrivacyPolicy)");
    return UPa.a((CharSequence)localObject2, (String)localObject1, "{privacy}", new CharacterStyle[] { new e(this), new StyleSpan(1) });
  }
  
  public void a(HHa.a.b paramb)
  {
    oXa.b(paramb, "model");
    TextView localTextView = (TextView)c(k.pricePerYear);
    oXa.a(localTextView, "pricePerYear");
    localTextView.setText(b(paramb.b()));
    localTextView = (TextView)c(k.pricePerMonth);
    oXa.a(localTextView, "pricePerMonth");
    localTextView.setText(a(paramb.b()));
    paramb = (TextView)c(k.termsAndPrivacy);
    oXa.a(paramb, "termsAndPrivacy");
    paramb.setText(getTermsAndPrivacyText());
    paramb = (TextView)c(k.termsAndPrivacy);
    oXa.a(paramb, "termsAndPrivacy");
    paramb.setMovementMethod(LinkMovementMethod.getInstance());
    e();
    d();
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    private final String a(I paramI, int paramInt)
    {
      if (paramInt == 1) {
        paramI = ija.a(ija.a, paramI, paramInt, null, 4, null);
      } else {
        paramI = ija.a.a(paramI, paramInt, paramI);
      }
      String str = (String)paramI.a();
      paramI = (String)paramI.b();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append(paramI);
      return localStringBuilder.toString();
    }
    
    public final YearlyTrialPageView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493132, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (YearlyTrialPageView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.onboarding.page.YearlyTrialPageView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/onboarding/page/YearlyTrialPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */