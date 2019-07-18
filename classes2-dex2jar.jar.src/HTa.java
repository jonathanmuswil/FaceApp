import android.content.Intent;
import android.support.v4.app.l;
import com.facebook.b;
import com.facebook.j;
import com.facebook.j.a;
import com.facebook.login.J;
import com.facebook.login.L;
import com.facebook.n;
import com.facebook.p;
import java.util.List;

public final class hta
  implements cta, n<L>
{
  private static final List<String> a = mWa.b(new String[] { "email", "user_friends", "public_profile", "user_photos" });
  @Deprecated
  public static final hta.a b = new hta.a(null);
  private bta c;
  private final j d = j.a.a();
  
  private final dta a(b paramb)
  {
    String str = paramb.u();
    oXa.a(str, "accessToken.token");
    paramb = paramb.v();
    oXa.a(paramb, "accessToken.userId");
    return new dta(str, paramb);
  }
  
  public void a(l paraml, bta parambta)
  {
    oXa.b(paraml, "fragment");
    oXa.b(parambta, "callback");
    reset();
    b localb = b.n();
    if (localb == null)
    {
      this.c = parambta;
      J.a().a(this.d, this);
      J.a().a(paraml, a);
    }
    else
    {
      parambta.a(this, a(localb));
    }
  }
  
  public void a(L paramL)
  {
    if (paramL != null) {
      paramL = paramL.a();
    } else {
      paramL = null;
    }
    if (paramL != null)
    {
      bta localbta = this.c;
      if (localbta != null) {
        localbta.a(this, a(paramL));
      }
    }
    else
    {
      paramL = this.c;
      if (paramL != null) {
        paramL.a(this, new gta(fta.b.c.a));
      }
    }
    reset();
  }
  
  public void a(p paramp)
  {
    oXa.b(paramp, "error");
    bta localbta = this.c;
    if (localbta != null) {
      localbta.a(this, new gta(new fta.b.b(paramp.getLocalizedMessage())));
    }
    reset();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.d.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCancel()
  {
    bta localbta = this.c;
    if (localbta != null) {
      localbta.a(this, new gta(fta.b.a.a));
    }
    reset();
  }
  
  public void reset()
  {
    this.c = null;
  }
  
  private static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */