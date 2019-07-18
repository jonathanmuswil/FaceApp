package io.faceapp.ui.pro.item;

import RJa.a;
import RJa.b;
import UPa;
import VQa;
import WVa;
import android.content.Context;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
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
import qja;
import zYa;

public final class ProItemView
  extends ConstraintLayout
  implements jta<a>
{
  public static final a u = new a(null);
  private VQa<RJa.b> v;
  private HashMap w;
  
  public ProItemView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public ProItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public ProItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493140, this);
    setBackgroundResource(2131230838);
    if (isInEditMode())
    {
      setBackgroundColor(getResources().getColor(2131099686));
      paramContext = u;
      Resources localResources = getResources();
      oXa.a(localResources, "resources");
      a(a.a(paramContext, localResources));
    }
  }
  
  public void a(a parama)
  {
    oXa.b(parama, "model");
    Object localObject1 = parama.c();
    if (localObject1 != null)
    {
      ((Integer)localObject1).intValue();
      localObject1 = (TextView)c(k.durationDigits);
      oXa.a(localObject1, "durationDigits");
      ((TextView)localObject1).setText(String.valueOf(parama.c().intValue()));
      localObject1 = (TextView)c(k.durationDigits);
      oXa.a(localObject1, "durationDigits");
      UPa.e((View)localObject1);
      localObject1 = (ImageView)c(k.durationIcon);
      oXa.a(localObject1, "durationIcon");
      UPa.c((View)localObject1);
      if (localObject1 != null) {}
    }
    else
    {
      localObject1 = (TextView)c(k.durationDigits);
      oXa.a(localObject1, "durationDigits");
      UPa.c((View)localObject1);
      localObject1 = (ImageView)c(k.durationIcon);
      oXa.a(localObject1, "durationIcon");
      UPa.e((View)localObject1);
    }
    ((TextView)c(k.durationText)).setText(parama.d());
    localObject1 = parama.a();
    if (localObject1 != null)
    {
      localObject2 = (TextView)c(k.durationExtraText);
      oXa.a(localObject2, "durationExtraText");
      UPa.e((View)localObject2);
      localObject2 = (TextView)c(k.durationExtraText);
      oXa.a(localObject2, "durationExtraText");
      ((TextView)localObject2).setText((CharSequence)localObject1);
    }
    else
    {
      localObject1 = (TextView)c(k.durationExtraText);
      oXa.a(localObject1, "durationExtraText");
      UPa.a((View)localObject1);
    }
    TextView localTextView = (TextView)c(k.paymentPrice);
    oXa.a(localTextView, "paymentPrice");
    a locala = u;
    localObject1 = parama.e().b();
    Object localObject2 = parama.c();
    int i;
    if (localObject2 != null) {
      i = ((Integer)localObject2).intValue();
    } else {
      i = 1;
    }
    localTextView.setText(locala.a((I)localObject1, i));
    ((TextView)c(k.paymentPeriod)).setText(parama.b());
    setOnClickListener(new b(this, parama));
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
  
  public final VQa<RJa.b> getViewActions()
  {
    return this.v;
  }
  
  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    ImageView localImageView = (ImageView)c(k.durationIcon);
    oXa.a(localImageView, "durationIcon");
    if (UPa.d(localImageView))
    {
      int i;
      if (paramBoolean) {
        i = 2131231005;
      } else {
        i = 2131231006;
      }
      ((ImageView)c(k.durationIcon)).setImageResource(i);
    }
  }
  
  public final void setViewActions(VQa<RJa.b> paramVQa)
  {
    this.v = paramVQa;
  }
  
  public static final class a
  {
    private final a a(Resources paramResources)
    {
      I localI = new I("{\"productId\":\"pro_yearly_v3\",\"type\":\"subs\",\"price\":\"RUB 1,490.00\",\"price_amount_micros\":1490000000,\"price_currency_code\":\"RUB\",\"subscriptionPeriod\":\"P1Y\",\"title\":\"FaceApp PRO yearly (FaceApp)\",\"description\":\"Access to premium filters and features\"}");
      String str = a(this, localI, 0, 2, null);
      paramResources = paramResources.getString(2131689713);
      oXa.a(paramResources, "resources.getString(R.st…AppPurchase_PricePerYear)");
      paramResources = zYa.a(paramResources, "{price}", str, false, 4, null);
      return new a(new RJa.a(qja.b, localI), Integer.valueOf(12), 2131689711, paramResources, 2131689692);
    }
    
    public final String a(I paramI, int paramInt)
    {
      oXa.b(paramI, "skuDetails");
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
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/pro/item/ProItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */