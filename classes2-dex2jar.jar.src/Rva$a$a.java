import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class Rva$a$a
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    Uri localUri1 = (Uri)paramParcel.readParcelable(Rva.a.class.getClassLoader());
    Uri localUri2 = (Uri)paramParcel.readParcelable(Rva.a.class.getClassLoader());
    String str = paramParcel.readString();
    float f = paramParcel.readFloat();
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    while (i != 0)
    {
      localArrayList.add(paramParcel.createStringArrayList());
      i--;
    }
    return new Rva.a(localUri1, localUri2, str, f, localArrayList);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Rva.a[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Rva$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */