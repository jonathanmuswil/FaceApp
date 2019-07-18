import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.a;

public final class tt
  extends e<Object>
  implements aq
{
  private tt(Context paramContext)
  {
    super(paramContext, Zp.c, null, new a());
  }
  
  public static aq a(Context paramContext)
  {
    return new tt(paramContext);
  }
  
  public final g<Status> a(dq paramdq)
  {
    paramdq = new Iu(paramdq, a());
    a(paramdq);
    return paramdq;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */