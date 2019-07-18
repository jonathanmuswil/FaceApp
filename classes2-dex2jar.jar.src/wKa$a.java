import android.os.Bundle;
import android.support.v4.app.l;

public final class wKa$a
{
  public final wKa a(nsa.b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    oXa.b(paramb, "sharedImage");
    wKa localwKa = new wKa();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("shared_image", paramb);
    localBundle.putBoolean("watermark_needed", paramBoolean1);
    localBundle.putBoolean("is_light_theme", paramBoolean2);
    localwKa.m(localBundle);
    return localwKa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wKa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */