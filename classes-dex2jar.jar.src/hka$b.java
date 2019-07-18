import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class hka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new hka(paramParcel.readString(), paramParcel.readString(), (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.readString(), paramParcel.readInt());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new hka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */