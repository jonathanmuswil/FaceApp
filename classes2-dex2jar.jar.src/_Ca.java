import android.graphics.PointF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.LightSourceView;

final class _Ca
  extends pXa
  implements cXa<PointF, cWa>
{
  _Ca(WCa paramWCa)
  {
    super(1);
  }
  
  public final void a(PointF paramPointF)
  {
    oXa.b(paramPointF, "src");
    this.b.getViewActions().a(new KAa.b.f(paramPointF));
    ((LightSourceView)this.b.f(k.lightSourceView)).animate().cancel();
    paramPointF = (LightSourceView)this.b.f(k.lightSourceView);
    oXa.a(paramPointF, "lightSourceView");
    paramPointF.setAlpha(1.0F);
    WCa.a(this.b).a(new Object());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */