import android.os.Parcel;
import android.os.RemoteException;

public abstract class vq
  extends xr
  implements uq
{
  public vq()
  {
    super("com.google.android.gms.common.internal.service.ICommonCallbacks");
  }
  
  protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 == 1)
    {
      i(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */