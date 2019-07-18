import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class kr
  extends Binder
  implements IInterface
{
  protected kr(String paramString)
  {
    attachInterface(this, paramString);
  }
  
  protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    throw null;
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    boolean bool;
    if (paramInt1 > 16777215)
    {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    else
    {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
    }
    if (bool) {
      return true;
    }
    return a(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */