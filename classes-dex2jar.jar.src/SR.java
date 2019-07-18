import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import java.util.Set;

public final class sr
  extends h<tr>
{
  private final Bundle G;
  
  public sr(Context paramContext, Looper paramLooper, d paramd, Op paramOp, f.b paramb, f.c paramc)
  {
    super(paramContext, paramLooper, 16, paramd, paramb, paramc);
    if (paramOp == null)
    {
      this.G = new Bundle();
      return;
    }
    throw new NoSuchMethodError();
  }
  
  public final int g()
  {
    return 12451000;
  }
  
  public final boolean j()
  {
    d locald = A();
    return (!TextUtils.isEmpty(locald.b())) && (!locald.a(Np.c).isEmpty());
  }
  
  protected final Bundle s()
  {
    return this.G;
  }
  
  protected final String w()
  {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  protected final String x()
  {
    return "com.google.android.gms.auth.service.START";
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */