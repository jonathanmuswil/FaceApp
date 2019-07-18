import android.view.View;
import android.widget.LinearLayout;
import io.faceapp.k;

final class fGa
  implements uRa
{
  fGa(eGa parameGa, FGa.d.a parama) {}
  
  public final void run()
  {
    Object localObject = (LinearLayout)this.a.g(k.primaryContainerView);
    oXa.a(localObject, "primaryContainerView");
    UPa.e((View)localObject);
    localObject = this.a.g(k.containerChooseStylesView);
    oXa.a(localObject, "containerChooseStylesView");
    UPa.c((View)localObject);
    localObject = this.a.g(k.containerCreatePollView);
    if (this.b.a() == null) {
      UPa.e((View)localObject);
    } else {
      UPa.c((View)localObject);
    }
    localObject = this.a.g(k.containerPollCreatedJustNowView);
    if (oXa.a(this.b.a(), Boolean.valueOf(true))) {
      UPa.e((View)localObject);
    } else {
      UPa.c((View)localObject);
    }
    localObject = this.a.g(k.containerPollCreatedEarlierView);
    if (oXa.a(this.b.a(), Boolean.valueOf(false))) {
      UPa.e((View)localObject);
    } else {
      UPa.c((View)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */