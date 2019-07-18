import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class bka$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new bka(paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new bka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */