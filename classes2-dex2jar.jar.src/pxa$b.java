import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class pxa$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new pxa(paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new pxa[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pxa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */