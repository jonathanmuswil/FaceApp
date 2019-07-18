import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class br
  extends Yq
  implements ar
{
  br(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
  }
  
  public final void a(cr paramcr)
    throws RemoteException
  {
    Parcel localParcel = a();
    _q.a(localParcel, paramcr);
    a(1, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */