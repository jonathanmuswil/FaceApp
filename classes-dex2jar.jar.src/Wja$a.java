import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Wja$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Wja((Afa)Afa.CREATOR.createFromParcel(paramParcel), paramParcel.readInt());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Wja[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Wja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */