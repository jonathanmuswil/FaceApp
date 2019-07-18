import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Cl$a
  implements FilenameFilter
{
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool;
    if ((!Cl.b.accept(paramFile, paramString)) && (Cl.a().matcher(paramString).matches())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */