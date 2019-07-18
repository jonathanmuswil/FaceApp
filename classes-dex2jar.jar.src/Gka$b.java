import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class Gka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    boolean bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    VOa localVOa = (VOa)Enum.valueOf(VOa.class, paramParcel.readString());
    boolean bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    return new Gka(str1, str2, bool1, localVOa, bool2, paramParcel.readString(), paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Gka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Gka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */