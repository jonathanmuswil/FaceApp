import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Afa$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new Afa(paramParcel.readString(), paramParcel.readString(), (cfa)cfa.CREATOR.createFromParcel(paramParcel), paramParcel.readString(), (cfa)cfa.CREATOR.createFromParcel(paramParcel), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Afa[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Afa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */