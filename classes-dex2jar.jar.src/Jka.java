import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class jka
  implements ska
{
  public static final Parcelable.Creator CREATOR = new jka.b();
  public static final jka.a a = new jka.a(null);
  private final String b;
  private final String c;
  private final String d;
  
  public jka(String paramString1, String paramString2, String paramString3)
  {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public final String a()
  {
    return this.b;
  }
  
  public final String b()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof jka))
      {
        paramObject = (jka)paramObject;
        if ((oXa.a(this.b, ((jka)paramObject).b)) && (oXa.a(this.c, ((jka)paramObject).c)) && (oXa.a(this.d, ((jka)paramObject).d))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    String str = this.b;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.c;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = this.d;
    if (str != null) {
      i = str.hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AdjustInfo(id=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", title=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", iconUrl=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
  
  public static final class a
  {
    public final jka a(RY paramRY)
    {
      oXa.b(paramRY, "data");
      String str1 = paramRY.m();
      oXa.a(str1, "data.id");
      String str2 = paramRY.n();
      oXa.a(str2, "data.title");
      paramRY = paramRY.l();
      oXa.a(paramRY, "data.iconUrl");
      return new jka(str1, str2, paramRY);
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new jka(paramParcel.readString(), paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new jka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */