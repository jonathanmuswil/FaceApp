import java.io.File;

public class sg
  implements pg.a
{
  private final long a;
  private final sg.a b;
  
  public sg(sg.a parama, long paramLong)
  {
    this.a = paramLong;
    this.b = parama;
  }
  
  public pg build()
  {
    File localFile = this.b.a();
    if (localFile == null) {
      return null;
    }
    if ((!localFile.mkdirs()) && ((!localFile.exists()) || (!localFile.isDirectory()))) {
      return null;
    }
    return tg.a(localFile, this.a);
  }
  
  public static abstract interface a
  {
    public abstract File a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */