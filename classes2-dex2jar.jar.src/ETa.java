import android.content.Context;
import android.content.Intent;
import android.support.v4.app.l;
import com.facebook.accountkit.ui.AccountKitActivity;
import com.facebook.accountkit.ui.AccountKitActivity.a;
import com.facebook.accountkit.ui.Ia;
import com.facebook.accountkit.ui.g.a;
import com.facebook.accountkit.ui.ub;
import com.facebook.accountkit.ui.ub.a;

public final class eta
  implements cta
{
  @Deprecated
  public static final eta.a a = new eta.a(null);
  private bta b;
  
  private final dta a(Rm paramRm)
  {
    String str = paramRm.o();
    oXa.a(str, "accessToken.token");
    paramRm = paramRm.l();
    oXa.a(paramRm, "accessToken.accountId");
    return new dta(str, paramRm);
  }
  
  private final void a(l paraml)
  {
    Object localObject = paraml.La();
    if (localObject != null)
    {
      localObject = new Intent((Context)localObject, AccountKitActivity.class);
      g.a locala = new g.a(Ia.a, AccountKitActivity.a.b);
      locala.a(new ub(ub.a.b, 0));
      ((Intent)localObject).putExtra(AccountKitActivity.q, locala.a());
      paraml.a((Intent)localObject, 12399);
      return;
    }
    throw new IllegalStateException("Required value was null.");
  }
  
  public void a(l paraml, bta parambta)
  {
    oXa.b(paraml, "fragment");
    oXa.b(parambta, "callback");
    reset();
    Rm localRm = Sm.f();
    if (localRm == null)
    {
      this.b = parambta;
      a(paraml);
    }
    else
    {
      parambta.a(this, a(localRm));
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 12399) && (paramIntent != null))
    {
      paramIntent = paramIntent.getParcelableExtra("account_kit_log_in_result");
      if (paramIntent != null)
      {
        Xm localXm = (Xm)paramIntent;
        Vm localVm = localXm.getError();
        paramIntent = localXm.a();
        bta localbta = this.b;
        if (localbta != null) {
          if (localVm != null) {
            localbta.a(this, new gta(new fta.a.b(localVm.n())));
          } else if (localXm.j()) {
            localbta.a(this, new gta(fta.a.a.a));
          } else if (paramIntent == null) {
            localbta.a(this, new gta(fta.a.c.a));
          } else {
            localbta.a(this, a(paramIntent));
          }
        }
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type com.facebook.accountkit.AccountKitLoginResult");
      }
    }
    reset();
  }
  
  public void reset()
  {
    this.b = null;
  }
  
  private static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */