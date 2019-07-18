import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class pxa
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new pxa.b();
  private static final pxa a;
  public static final pxa.a b = new pxa.a(null);
  private final String c;
  private final String d;
  
  static
  {
    a = new pxa("", null);
  }
  
  public pxa(String paramString1, String paramString2)
  {
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof pxa))
      {
        paramObject = (pxa)paramObject;
        if ((oXa.a(this.c, ((pxa)paramObject).c)) && (oXa.a(this.d, ((pxa)paramObject).d))) {}
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
    String str = this.c;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.d;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public final String m()
  {
    return this.c;
  }
  
  public final String n()
  {
    return this.d;
  }
  
  public final String o()
  {
    String str = this.d;
    if (str == null) {
      str = this.c;
    }
    return str;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FilterSelection(filterId=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", subFilterId=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
  }
  
  public static final class a
  {
    public final pxa a()
    {
      return pxa.l();
    }
    
    public final pxa a(lka paramlka, String paramString)
    {
      oXa.b(paramlka, "filter");
      if (paramlka.r() == null) {
        paramString = null;
      } else if (paramString == null) {
        paramString = paramlka.m();
      }
      return new pxa(paramlka.m(), paramString);
    }
  }
  
  public static final class b
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new pxa(paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new pxa[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */