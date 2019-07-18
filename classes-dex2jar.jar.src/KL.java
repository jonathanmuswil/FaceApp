import java.io.File;

final class kl
  extends Cl.d
{
  kl(String paramString)
  {
    super(paramString);
  }
  
  public boolean accept(File paramFile, String paramString)
  {
    boolean bool;
    if ((super.accept(paramFile, paramString)) && (paramString.endsWith(".cls"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */