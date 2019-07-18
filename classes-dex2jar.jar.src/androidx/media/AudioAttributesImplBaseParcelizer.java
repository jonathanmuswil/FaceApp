package androidx.media;

import android.support.v4.media.c;
import androidx.versionedparcelable.b;

public final class AudioAttributesImplBaseParcelizer
{
  public static c read(b paramb)
  {
    c localc = new c();
    localc.a = paramb.a(localc.a, 1);
    localc.b = paramb.a(localc.b, 2);
    localc.c = paramb.a(localc.c, 3);
    localc.d = paramb.a(localc.d, 4);
    return localc;
  }
  
  public static void write(c paramc, b paramb)
  {
    paramb.a(false, false);
    paramb.b(paramc.a, 1);
    paramb.b(paramc.b, 2);
    paramb.b(paramc.c, 3);
    paramb.b(paramc.d, 4);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/media/AudioAttributesImplBaseParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */