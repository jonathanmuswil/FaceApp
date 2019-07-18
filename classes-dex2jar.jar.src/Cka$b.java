import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class Cka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    String str3 = paramParcel.readString();
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    while (i != 0)
    {
      localArrayList.add((Dka)paramParcel.readParcelable(Cka.class.getClassLoader()));
      i--;
    }
    return new Cka(str1, str2, str3, localArrayList, paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Cka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */