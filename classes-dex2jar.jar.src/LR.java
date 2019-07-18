import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class lr
{
  private static final ClassLoader a = lr.class.getClassLoader();
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator)
  {
    if (paramParcel.readInt() == 0) {
      return null;
    }
    return (Parcelable)paramCreator.createFromParcel(paramParcel);
  }
  
  public static void a(Parcel paramParcel, IInterface paramIInterface)
  {
    if (paramIInterface == null)
    {
      paramParcel.writeStrongBinder(null);
      return;
    }
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
  
  public static void a(Parcel paramParcel, Parcelable paramParcelable)
  {
    if (paramParcelable == null)
    {
      paramParcel.writeInt(0);
      return;
    }
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */