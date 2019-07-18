import android.content.Context;
import java.io.File;

class ug
  implements sg.a
{
  ug(Context paramContext, String paramString) {}
  
  public File a()
  {
    File localFile = this.a.getCacheDir();
    if (localFile == null) {
      return null;
    }
    String str = this.b;
    if (str != null) {
      return new File(localFile, str);
    }
    return localFile;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */