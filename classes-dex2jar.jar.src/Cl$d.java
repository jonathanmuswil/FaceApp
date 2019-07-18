import java.io.File;
import java.io.FilenameFilter;

class Cl$d
  implements FilenameFilter
{
  private final String a;
  
  public Cl$d(String paramString)
  {
    this.a = paramString;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool;
    if ((paramString.contains(this.a)) && (!paramString.endsWith(".cls_temp"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */