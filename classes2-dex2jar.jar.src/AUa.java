import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;
import com.bumptech.glide.load.a;
import io.faceapp.k;
import io.faceapp.ui.misc.recycler.view.ContentErrorView;
import io.faceapp.ui.misc.recycler.view.LoadingView;

public final class aua
  implements fj<Drawable>
{
  public boolean a(Qf paramQf, Object paramObject, sj<Drawable> paramsj, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean a(Drawable paramDrawable, Object paramObject, sj<Drawable> paramsj, a parama, boolean paramBoolean)
  {
    paramDrawable = (LoadingView)this.a.f(k.loadingView);
    oXa.a(paramDrawable, "loadingView");
    UPa.b(paramDrawable, 0L, 1, null);
    paramDrawable = (ContentErrorView)this.a.f(k.contentErrorView);
    oXa.a(paramDrawable, "contentErrorView");
    UPa.b(paramDrawable, 0L, 1, null);
    paramDrawable = (TextView)this.a.f(k.menuLaterBtnView);
    oXa.a(paramDrawable, "menuLaterBtnView");
    UPa.c(paramDrawable, 0L, 1, null);
    paramDrawable = (ConstraintLayout)this.a.f(k.imageContainerView);
    oXa.a(paramDrawable, "imageContainerView");
    UPa.c(paramDrawable, 0L, 1, null);
    paramDrawable = (TextView)this.a.f(k.label1View);
    oXa.a(paramDrawable, "label1View");
    UPa.c(paramDrawable, 0L, 1, null);
    paramDrawable = (TextView)this.a.f(k.loginView);
    oXa.a(paramDrawable, "loginView");
    UPa.c(paramDrawable, 0L, 1, null);
    paramDrawable = (TextView)this.a.f(k.label2View);
    oXa.a(paramDrawable, "label2View");
    UPa.c(paramDrawable, 0L, 1, null);
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */