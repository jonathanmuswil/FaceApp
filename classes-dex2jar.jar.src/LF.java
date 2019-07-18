import android.net.Uri;
import java.util.List;

public final class lf
{
  public static boolean a(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 != Integer.MIN_VALUE) && (paramInt2 != Integer.MIN_VALUE) && (paramInt1 <= 512) && (paramInt2 <= 384)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean a(Uri paramUri)
  {
    boolean bool;
    if ((b(paramUri)) && (!d(paramUri))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean b(Uri paramUri)
  {
    boolean bool;
    if ((paramUri != null) && ("content".equals(paramUri.getScheme())) && ("media".equals(paramUri.getAuthority()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c(Uri paramUri)
  {
    boolean bool;
    if ((b(paramUri)) && (d(paramUri))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean d(Uri paramUri)
  {
    return paramUri.getPathSegments().contains("video");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */