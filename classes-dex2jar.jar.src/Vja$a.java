import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Vja$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Vja(paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Vja[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Vja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */