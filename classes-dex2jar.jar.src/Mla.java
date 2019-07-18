import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.p;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v7.app.C;

public abstract class mla<V extends sla, P extends gla<V>>
  extends _ka<V, P>
{
  public void a(Dialog paramDialog, int paramInt)
  {
    oXa.b(paramDialog, "dialog");
    super.a(paramDialog, paramInt);
    paramDialog.setOnShowListener(new lla(paramDialog));
  }
  
  public Dialog n(Bundle paramBundle)
  {
    paramBundle = La();
    if (paramBundle != null) {
      return new p(paramBundle, Nb());
    }
    throw new IllegalStateException("Required value was null.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/mla.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */