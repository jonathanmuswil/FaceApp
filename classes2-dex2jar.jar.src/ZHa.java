import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.l;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.rd.PageIndicatorView;
import io.faceapp.k;
import io.faceapp.ui.components.AppBar;
import io.faceapp.ui.components.rtlviewpager.RtlViewPager;

public final class zHa
  implements ViewPager.f
{
  private final float a;
  private final int b;
  private final float c;
  
  zHa()
  {
    Object localObject2 = (RtlViewPager)((tHa)localObject1).f(k.pagerView);
    oXa.a(localObject2, "pagerView");
    this.a = (((tHa.b)EPa.a((ViewPager)localObject2)).a() - 2);
    this.b = (((l)localObject1).Wa().getDimensionPixelSize(2131165531) - ((l)localObject1).Wa().getDimensionPixelSize(2131165532));
    localObject2 = KOa.b;
    Object localObject1 = (RtlViewPager)((tHa)localObject1).f(k.pagerView);
    oXa.a(localObject1, "pagerView");
    localObject1 = ((ViewGroup)localObject1).getContext();
    oXa.a(localObject1, "pagerView.context");
    this.c = ((KOa)localObject2).a((Context)localObject1, 16);
  }
  
  public void a(int paramInt) {}
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramInt1 + paramFloat - this.a));
    Object localObject1 = this.d;
    Object localObject2 = (AppBar)((tHa)localObject1).f(k.appBar);
    oXa.a(localObject2, "appBar");
    tHa.a((tHa)localObject1, (View)localObject2, paramFloat);
    localObject2 = this.d;
    localObject1 = (PageIndicatorView)((tHa)localObject2).f(k.pagerIndicatorView);
    oXa.a(localObject1, "pagerIndicatorView");
    float f = 1.0F - paramFloat;
    tHa.a((tHa)localObject2, (View)localObject1, f);
    localObject1 = this.d;
    localObject2 = (TextView)((tHa)localObject1).f(k.nextBtnView);
    oXa.a(localObject2, "nextBtnView");
    tHa.a((tHa)localObject1, (View)localObject2, f);
    localObject2 = this.d;
    localObject1 = (TextView)((tHa)localObject2).f(k.startTrialBtnView);
    oXa.a(localObject1, "startTrialBtnView");
    tHa.a((tHa)localObject2, (View)localObject1, paramFloat);
    localObject1 = this.d;
    localObject2 = (TextView)((tHa)localObject1).f(k.declineTrialBtnView);
    oXa.a(localObject2, "declineTrialBtnView");
    tHa.a((tHa)localObject1, (View)localObject2, paramFloat);
    localObject1 = this.d.f(k.separatorView);
    oXa.a(localObject1, "separatorView");
    ((View)localObject1).setTranslationY(paramFloat * -1.0F * this.b);
    localObject1 = (TextView)this.d.f(k.startTrialBtnView);
    oXa.a(localObject1, "startTrialBtnView");
    ((TextView)localObject1).setTranslationY(this.c * f);
    localObject1 = (TextView)this.d.f(k.declineTrialBtnView);
    oXa.a(localObject1, "declineTrialBtnView");
    ((TextView)localObject1).setTranslationY(f * this.c);
  }
  
  public void b(int paramInt) {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */