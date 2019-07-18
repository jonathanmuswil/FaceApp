import android.net.Uri;
import java.io.File;

final class mGa<T, R>
  implements DRa<T, R>
{
  public static final mGa a = new mGa();
  
  public final Uri a(File paramFile)
  {
    oXa.b(paramFile, "it");
    return Uri.fromFile(paramFile);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */