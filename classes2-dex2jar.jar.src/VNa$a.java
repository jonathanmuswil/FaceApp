import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.l;

public final class VNa$a
{
  public final VNa a(Uri paramUri, int paramInt)
  {
    oXa.b(paramUri, "imageUri");
    VNa localVNa = new VNa();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("image_uri", paramUri);
    localBundle.putInt("target_size", paramInt);
    localVNa.m(localBundle);
    return localVNa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/VNa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */