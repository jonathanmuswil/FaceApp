import java.io.File;
import java.io.FilenameFilter;

class Cl$f
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool;
    if ((!Qk.a.accept(paramFile, paramString)) && (!paramString.contains("SessionMissingBinaryImages"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */