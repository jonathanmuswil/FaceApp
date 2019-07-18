import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"ParcelCreator"})
public final class bka
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new bka.a();
  private final String a;
  private final String b;
  
  public bka(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof bka))
      {
        paramObject = (bka)paramObject;
        if ((oXa.a(this.a, ((bka)paramObject).a)) && (oXa.a(this.b, ((bka)paramObject).b))) {}
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
    String str = this.a;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = this.b;
    if (str != null) {
      i = str.hashCode();
    }
    return j * 31 + i;
  }
  
  public final String l()
  {
    return this.b;
  }
  
  public final String m()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PhoneNumberCredentials(userId=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", token=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oXa.b(paramParcel, "parcel");
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      oXa.b(paramParcel, "in");
      return new bka(paramParcel.readString(), paramParcel.readString());
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new bka[paramInt];
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */