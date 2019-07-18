import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.accountkit.internal.va;

public final class jn
  implements Parcelable
{
  public static final Parcelable.Creator<jn> CREATOR = new in();
  private final String a;
  private final String b;
  private final String c;
  
  private jn(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.a = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public jn(String paramString1, String paramString2, String paramString3)
  {
    this.a = va.a(paramString2);
    this.b = va.a(paramString1);
    this.c = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof jn)) && (hashCode() == paramObject.hashCode())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public String l()
  {
    return this.b;
  }
  
  public String m()
  {
    return this.c;
  }
  
  public String n()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b);
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("+");
    localStringBuilder.append(this.b);
    localStringBuilder.append(this.a);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */