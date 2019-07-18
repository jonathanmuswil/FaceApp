import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ika$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new ika(paramParcel.readString(), paramParcel.readInt(), paramParcel.readInt());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new ika[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ika$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */