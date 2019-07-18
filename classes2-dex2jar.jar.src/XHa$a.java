import android.os.Bundle;
import android.support.v4.app.l;

public final class XHa$a
{
  public final XHa a(Rja paramRja, pIa.a parama, String paramString, boolean paramBoolean)
  {
    oXa.b(paramRja, "imageDesc");
    oXa.b(parama, "startMode");
    XHa localXHa = new XHa();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("image_desc", paramRja);
    localBundle.putString("start_mode", parama.a());
    localBundle.putString("payload", paramString);
    localBundle.putBoolean("has_parent_screen", paramBoolean);
    localXHa.m(localBundle);
    return localXHa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/XHa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */