import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class cfa$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    return new cfa(paramParcel.readInt(), paramParcel.readInt());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new cfa[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cfa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */