import java.io.File;

final class Cl$g
  implements am.a
{
  private final Dca a;
  
  public Cl$g(Dca paramDca)
  {
    this.a = paramDca;
  }
  
  public File a()
  {
    File localFile = new File(this.a.a(), "log-files");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return localFile;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */