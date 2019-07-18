import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class uo$a
  implements Parcelable
{
  public static final Parcelable.Creator<a> CREATOR = new to();
  private String a;
  private long b;
  
  uo$a() {}
  
  protected uo$a(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readLong();
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public long l()
  {
    return this.b;
  }
  
  public String m()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeLong(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/uo$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */