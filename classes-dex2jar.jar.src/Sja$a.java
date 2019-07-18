import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Sja$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Sja(paramParcel.readString(), (dfa)dfa.CREATOR.createFromParcel(paramParcel));
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Sja[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Sja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */