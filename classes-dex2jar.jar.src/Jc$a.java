import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract class Jc$a
  extends Binder
  implements Jc
{
  public Jc$a()
  {
    attachInterface(this, "android.support.v4.os.IResultReceiver");
  }
  
  public static Jc a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
    if ((localIInterface != null) && ((localIInterface instanceof Jc))) {
      return (Jc)localIInterface;
    }
    return new Jc.a.a(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 1598968902) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel2.writeString("android.support.v4.os.IResultReceiver");
      return true;
    }
    paramParcel1.enforceInterface("android.support.v4.os.IResultReceiver");
    paramInt1 = paramParcel1.readInt();
    if (paramParcel1.readInt() != 0) {
      paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
    } else {
      paramParcel1 = null;
    }
    a(paramInt1, paramParcel1);
    return true;
  }
  
  private static class a
    implements Jc
  {
    private IBinder a;
    
    a(IBinder paramIBinder)
    {
      this.a = paramIBinder;
    }
    
    public IBinder asBinder()
    {
      return this.a;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Jc$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */