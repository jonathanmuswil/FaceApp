import android.content.Context;
import android.support.v4.app.l;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.f;
import io.faceapp.k;

final class tDa
  implements Runnable
{
  tDa(rDa paramrDa) {}
  
  public final void run()
  {
    Object localObject1 = hda.c;
    Object localObject2 = this.a.Jb();
    oXa.a(localObject2, "requireContext()");
    f localf = ((hda)localObject1).a((Context)localObject2, hda.a.a.a.c);
    localObject1 = localf.getParent();
    localObject2 = localObject1;
    if (!(localObject1 instanceof ViewGroup)) {
      localObject2 = null;
    }
    localObject2 = (ViewGroup)localObject2;
    if (localObject2 != null) {
      ((ViewGroup)localObject2).removeView(localf);
    }
    ((FrameLayout)this.a.f(k.adContainerView)).removeAllViews();
    ((FrameLayout)this.a.f(k.adContainerView)).addView(localf);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */