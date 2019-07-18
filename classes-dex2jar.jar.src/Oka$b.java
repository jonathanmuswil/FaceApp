import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class oka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    int i = paramParcel.readInt();
    int j = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(j);
    while (j != 0)
    {
      localArrayList.add((pka)paramParcel.readParcelable(oka.class.getClassLoader()));
      j--;
    }
    return new oka(i, localArrayList);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new oka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */