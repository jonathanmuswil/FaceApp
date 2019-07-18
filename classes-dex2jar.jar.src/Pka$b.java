import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Pka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Pka(paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Pka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Pka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */