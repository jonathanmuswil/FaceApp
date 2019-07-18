import android.os.Parcel;

public final class Io$a
  extends No.a<Io, a>
{
  public a a(Io paramIo)
  {
    if (paramIo == null) {
      return this;
    }
    super.a(paramIo);
    a locala = (a)this;
    locala.a(paramIo.c());
    return locala;
  }
  
  a a(Parcel paramParcel)
  {
    return a((Io)paramParcel.readParcelable(Io.class.getClassLoader()));
  }
  
  public a a(String paramString)
  {
    a("og:type", paramString);
    return this;
  }
  
  public Io a()
  {
    return new Io(this, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Io$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */