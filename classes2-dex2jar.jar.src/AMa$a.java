import android.os.Bundle;
import android.support.v4.app.l;

public final class AMa$a
{
  public final AMa a(Rja paramRja, pIa.a parama, String paramString)
  {
    oXa.b(paramRja, "imageDesc");
    oXa.b(parama, "startEditorMode");
    AMa localAMa = new AMa();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("image_desc", paramRja);
    localBundle.putString("start_editor_mode", parama.a());
    localBundle.putString("editor_mode_payload", paramString);
    localAMa.m(localBundle);
    return localAMa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/AMa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */