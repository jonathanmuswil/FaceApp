import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Tja$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Tja((hka)hka.CREATOR.createFromParcel(paramParcel));
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Tja[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Tja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */