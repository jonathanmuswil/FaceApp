import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class oca
  extends pca
{
  public oca(Context paramContext, File paramFile, String paramString1, String paramString2)
    throws IOException
  {
    super(paramContext, paramFile, paramString1, paramString2);
  }
  
  public OutputStream a(File paramFile)
    throws IOException
  {
    return new GZIPOutputStream(new FileOutputStream(paramFile));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/oca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */