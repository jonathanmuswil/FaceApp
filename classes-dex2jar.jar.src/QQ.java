import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;

final class qq
  extends lq
{
  private final d<Status> a;
  
  public qq(d<Status> paramd)
  {
    this.a = paramd;
  }
  
  public final void i(int paramInt)
    throws RemoteException
  {
    this.a.a(new Status(paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */