import android.os.Parcel;

public class Bo$a
  implements Go<Bo, a>
{
  private String a;
  
  public a a(Bo paramBo)
  {
    if (paramBo == null) {
      return this;
    }
    a(paramBo.a());
    return this;
  }
  
  a a(Parcel paramParcel)
  {
    a((Bo)paramParcel.readParcelable(Bo.class.getClassLoader()));
    return this;
  }
  
  public a a(String paramString)
  {
    this.a = paramString;
    return this;
  }
  
  public Bo a()
  {
    return new Bo(this, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Bo$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */