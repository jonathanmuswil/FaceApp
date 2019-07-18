import android.content.Context;
import android.support.v4.app.l;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.f;
import io.faceapp.k;

final class yKa
  implements Runnable
{
  yKa(wKa paramwKa) {}
  
  public final void run()
  {
    Object localObject1 = hda.c;
    Object localObject2 = this.a.Jb();
    oXa.a(localObject2, "requireContext()");
    f localf = ((hda)localObject1).a((Context)localObject2, hda.a.a.a.c);
    localObject2 = localf.getParent();
    localObject1 = localObject2;
    if (!(localObject2 instanceof ViewGroup)) {
      localObject1 = null;
    }
    localObject1 = (ViewGroup)localObject1;
    if (localObject1 != null) {
      ((ViewGroup)localObject1).removeView(localf);
    }
    ((FrameLayout)this.a.f(k.adContainerView)).removeAllViews();
    ((FrameLayout)this.a.f(k.adContainerView)).addView(localf);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yKa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */