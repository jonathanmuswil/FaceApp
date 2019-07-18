import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class jka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new jka(paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new jka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */