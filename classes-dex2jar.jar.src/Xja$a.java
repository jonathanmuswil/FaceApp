import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Xja$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Xja(paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Xja[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Xja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */