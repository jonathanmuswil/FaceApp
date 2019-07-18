import android.support.v4.view.ViewPager.f;
import android.view.View;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.components.AppBar;
import io.faceapp.ui.components.rtlviewpager.RtlViewPager;

public final class xHa
  implements ViewPager.f
{
  private final float a;
  
  xHa()
  {
    RtlViewPager localRtlViewPager = (RtlViewPager)localRtlViewPager.f(k.pagerView);
    oXa.a(localRtlViewPager, "pagerView");
    this.a = (((tHa.b)EPa.a(localRtlViewPager)).a() - 2);
  }
  
  public void a(int paramInt) {}
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramInt1 + paramFloat - this.a));
    Object localObject1 = this.b;
    Object localObject2 = (AppBar)((tHa)localObject1).f(k.appBar);
    oXa.a(localObject2, "appBar");
    tHa.a((tHa)localObject1, (View)localObject2, paramFloat);
    localObject2 = this.b;
    localObject1 = (TextView)((tHa)localObject2).f(k.startTrialBtnView);
    oXa.a(localObject1, "startTrialBtnView");
    tHa.a((tHa)localObject2, (View)localObject1, paramFloat);
    localObject1 = this.b;
    localObject2 = (TextView)((tHa)localObject1).f(k.nextBtnView);
    oXa.a(localObject2, "nextBtnView");
    tHa.a((tHa)localObject1, (View)localObject2, 1.0F - paramFloat);
  }
  
  public void b(int paramInt) {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */