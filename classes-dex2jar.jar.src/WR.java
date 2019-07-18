import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class wr
  implements IInterface
{
  private final IBinder a;
  private final String b;
  
  protected wr(IBinder paramIBinder, String paramString)
  {
    this.a = paramIBinder;
    this.b = paramString;
  }
  
  protected final Parcel a()
  {
    Parcel localParcel = Parcel.obtain();
    localParcel.writeInterfaceToken(this.b);
    return localParcel;
  }
  
  protected final void a(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      this.a.transact(paramInt, paramParcel, localParcel, 0);
      localParcel.readException();
      return;
    }
    finally
    {
      paramParcel.recycle();
      localParcel.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  protected final void b(int paramInt, Parcel paramParcel)
    throws RemoteException
  {
    try
    {
      this.a.transact(1, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */