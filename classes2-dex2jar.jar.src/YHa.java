import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.view.View;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.components.rtlviewpager.RtlViewPager;

public final class yHa
  implements ViewPager.f
{
  public void a(int paramInt) {}
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    Object localObject = (RtlViewPager)this.a.f(k.pagerView);
    oXa.a(localObject, "pagerView");
    float f = ((tHa.b)EPa.a((ViewPager)localObject)).a() - 2;
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramInt1 + paramFloat - f));
    tHa localtHa = this.a;
    localObject = (TextView)localtHa.f(k.startBtnView);
    oXa.a(localObject, "startBtnView");
    tHa.a(localtHa, (View)localObject, paramFloat);
    localtHa = this.a;
    localObject = (TextView)localtHa.f(k.nextBtnView);
    oXa.a(localObject, "nextBtnView");
    tHa.a(localtHa, (View)localObject, 1.0F - paramFloat);
  }
  
  public void b(int paramInt) {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yHa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */