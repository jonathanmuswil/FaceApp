import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class dr
  extends Zq
  implements cr
{
  public dr()
  {
    super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      a((Status)_q.a(paramParcel1, Status.CREATOR));
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */