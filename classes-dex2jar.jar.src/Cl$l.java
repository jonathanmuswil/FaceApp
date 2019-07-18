import java.io.File;
import java.io.FilenameFilter;

class Cl$l
  implements FilenameFilter
{
  private final String a;
  
  public Cl$l(String paramString)
  {
    this.a = paramString;
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    paramFile = new StringBuilder();
    paramFile.append(this.a);
    paramFile.append(".cls");
    boolean bool1 = paramString.equals(paramFile.toString());
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    bool1 = bool2;
    if (paramString.contains(this.a))
    {
      bool1 = bool2;
      if (!paramString.endsWith(".cls_temp")) {
        bool1 = true;
      }
    }
    return bool1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */