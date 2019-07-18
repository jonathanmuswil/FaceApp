import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Date;

public final class Nka$b
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    oXa.b(paramParcel, "in");
    String str1 = paramParcel.readString();
    Pka localPka = (Pka)Pka.CREATOR.createFromParcel(paramParcel);
    String str2 = paramParcel.readString();
    boolean bool1;
    if (paramParcel.readInt() != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    String str3 = paramParcel.readString();
    WVa localWVa = (WVa)paramParcel.readSerializable();
    Date localDate = (Date)paramParcel.readSerializable();
    int i = paramParcel.readInt();
    ArrayList localArrayList1 = new ArrayList(i);
    while (i != 0)
    {
      localArrayList1.add((Rka)Rka.CREATOR.createFromParcel(paramParcel));
      i--;
    }
    i = paramParcel.readInt();
    ArrayList localArrayList2 = new ArrayList(i);
    while (i != 0)
    {
      localArrayList2.add(Integer.valueOf(paramParcel.readInt()));
      i--;
    }
    i = paramParcel.readInt();
    Rka localRka;
    if (paramParcel.readInt() != 0) {
      localRka = (Rka)Rka.CREATOR.createFromParcel(paramParcel);
    } else {
      localRka = null;
    }
    boolean bool2;
    if (paramParcel.readInt() != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    return new Nka(str1, localPka, str2, bool1, str3, localWVa, localDate, localArrayList1, localArrayList2, i, localRka, bool2, paramParcel.createStringArrayList());
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Nka[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Nka$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */