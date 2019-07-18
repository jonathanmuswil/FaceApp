import java.io.File;
import java.io.FileFilter;

final class vl
  implements FileFilter
{
  public boolean accept(File paramFile)
  {
    boolean bool;
    if ((paramFile.isDirectory()) && (paramFile.getName().length() == 35)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */