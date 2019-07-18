import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class xq
  extends wr
  implements wq
{
  xq(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.service.ICommonService");
  }
  
  public final void a(uq paramuq)
    throws RemoteException
  {
    Parcel localParcel = a();
    yr.a(localParcel, paramuq);
    b(1, localParcel);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */