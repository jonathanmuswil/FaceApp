import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class lka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    boolean bool;
    if (paramParcel.readInt() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return new lka(str1, str2, bool, (VOa)Enum.valueOf(VOa.class, paramParcel.readString()), paramParcel.createStringArrayList(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new lka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */