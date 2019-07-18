import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.p;
import android.support.v7.app.B;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

final class lla
  implements DialogInterface.OnShowListener
{
  lla(Dialog paramDialog) {}
  
  public final void onShow(DialogInterface paramDialogInterface)
  {
    if (paramDialogInterface != null)
    {
      Object localObject = (FrameLayout)((p)paramDialogInterface).findViewById(2131296509);
      if (localObject != null)
      {
        paramDialogInterface = this.a.getWindow();
        if (paramDialogInterface != null)
        {
          ((FrameLayout)localObject).setBackgroundResource(2131230834);
          localObject = BottomSheetBehavior.b((View)localObject);
          oXa.a(localObject, "BottomSheetBehavior.from(sheet)");
          paramDialogInterface = paramDialogInterface.getDecorView();
          oXa.a(paramDialogInterface, "window.decorView");
          ((BottomSheetBehavior)localObject).b(paramDialogInterface.getHeight());
        }
      }
      return;
    }
    throw new _Va("null cannot be cast to non-null type android.support.design.widget.BottomSheetDialog");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */