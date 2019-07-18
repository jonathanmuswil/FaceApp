import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

class el
  implements FilenameFilter
{
  el(Cl paramCl, Set paramSet) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    if (paramString.length() < 35) {
      return false;
    }
    return this.a.contains(paramString.substring(0, 35));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */