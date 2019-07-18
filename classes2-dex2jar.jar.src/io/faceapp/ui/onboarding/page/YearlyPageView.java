package io.faceapp.ui.onboarding.page;

import HHa.a;
import HHa.a.a;
import UPa;
import VOa;
import WVa;
import _Va;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.billingclient.api.I;
import ija;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;
import zYa;

public final class YearlyPageView
  extends ConstraintLayout
  implements jta<HHa.a.a>
{
  public static final a u = new a(null);
  private HashMap v;
  
  public YearlyPageView(Context paramContext, AttributeSet paramAttributeSet)
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
  
  private final CharSequence getPaymentConditionsText()
  {
    String str = getResources().getString(2131689700);
    oXa.a(str, "resources.getString(R.st…ase_DescriptionTextGPlay)");
    Object localObject = getContext().getString(2131689737);
    oXa.a(localObject, "context.getString(R.stri…InAppPurchase_TermsOfUse)");
    localObject = UPa.a(str, (String)localObject, "{link_terms}", new CharacterStyle[] { new a(this), new StyleSpan(1) });
    str = getContext().getString(2131689714);
    oXa.a(str, "context.getString(R.stri…ppPurchase_PrivacyPolicy)");
    return UPa.a((CharSequence)localObject, str, "{link_privacy}", new CharacterStyle[] { new b(this), new StyleSpan(1) });
  }
  
  public void a(HHa.a.a parama)
  {
    oXa.b(parama, "model");
    if (parama.a() == VOa.c)
    {
      ((ImageView)c(k.bannerView)).setImageResource(2131231091);
      ((TextView)c(k.labelFaceappPro)).setTextColor(Color.parseColor("#741A30"));
    }
    else
    {
      ((ImageView)c(k.bannerView)).setImageResource(2131231092);
      ((TextView)c(k.labelFaceappPro)).setTextColor(Color.parseColor("#32395A"));
    }
    TextView localTextView = (TextView)c(k.pricePerYear);
    oXa.a(localTextView, "pricePerYear");
    localTextView.setText(b(parama.b()));
    localTextView = (TextView)c(k.pricePerMonth);
    oXa.a(localTextView, "pricePerMonth");
    localTextView.setText(a(parama.b()));
    parama = (TextView)c(k.paymentConditions);
    oXa.a(parama, "paymentConditions");
    parama.setText(getPaymentConditionsText());
    parama = (TextView)c(k.paymentConditions);
    oXa.a(parama, "paymentConditions");
    parama.setMovementMethod(LinkMovementMethod.getInstance());
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
      String str1 = (String)paramI.a();
      String str2 = (String)paramI.b();
      paramI = new StringBuilder();
      paramI.append(str1);
      paramI.append(str2);
      return paramI.toString();
    }
    
    public final YearlyPageView a(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493134, paramViewGroup, false);
      if (paramViewGroup != null) {
        return (YearlyPageView)paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.onboarding.page.YearlyPageView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/onboarding/page/YearlyPageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */