import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class WOa$b
  implements WOa.c
{
  private final File a;
  
  public WOa$b(File paramFile)
  {
    this.a = paramFile;
  }
  
  public FileInputStream a()
    throws FileNotFoundException, SecurityException
  {
    return new FileInputStream(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WOa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */