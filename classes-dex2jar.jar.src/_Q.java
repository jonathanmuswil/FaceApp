import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class _q
{
  private static final ClassLoader a = _q.class.getClassLoader();
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void a(Parcel paramParcel, IInterface paramIInterface)
  {
    if (paramIInterface == null) {}
    for (paramIInterface = null;; paramIInterface = paramIInterface.asBinder())
    {
      paramParcel.writeStrongBinder(paramIInterface);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */