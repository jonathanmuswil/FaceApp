import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class uka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new uka((WVa)paramParcel.readSerializable(), (WVa)paramParcel.readSerializable());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new uka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */