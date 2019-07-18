import java.io.File;
import java.io.FilenameFilter;

final class ul
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool;
    if ((paramString.length() == 39) && (paramString.endsWith(".cls"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */