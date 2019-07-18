import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class dfa$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    Float localFloat1;
    if (paramParcel.readInt() != 0) {
      localFloat1 = Float.valueOf(paramParcel.readFloat());
    } else {
      localFloat1 = null;
    }
    Float localFloat2;
    if (paramParcel.readInt() != 0) {
      localFloat2 = Float.valueOf(paramParcel.readFloat());
    } else {
      localFloat2 = null;
    }
    String str3 = paramParcel.readString();
    Integer localInteger;
    if (paramParcel.readInt() != 0) {
      localInteger = Integer.valueOf(paramParcel.readInt());
    } else {
      localInteger = null;
    }
    Float localFloat3;
    if (paramParcel.readInt() != 0) {
      localFloat3 = Float.valueOf(paramParcel.readFloat());
    } else {
      localFloat3 = null;
    }
    return new dfa(str1, str2, localFloat1, localFloat2, str3, localInteger, localFloat3, paramParcel.readInt());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new dfa[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dfa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */