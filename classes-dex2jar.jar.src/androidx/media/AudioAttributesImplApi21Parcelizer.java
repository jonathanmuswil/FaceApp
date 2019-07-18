package androidx.media;

import android.media.AudioAttributes;

public final class AudioAttributesImplApi21Parcelizer
{
  public static android.support.v4.media.b read(androidx.versionedparcelable.b paramb)
  {
    android.support.v4.media.b localb = new android.support.v4.media.b();
    localb.a = ((AudioAttributes)paramb.a(localb.a, 1));
    localb.b = paramb.a(localb.b, 2);
    return localb;
  }
  
  public static void write(android.support.v4.media.b paramb, androidx.versionedparcelable.b paramb1)
  {
    paramb1.a(false, false);
    paramb1.b(paramb.a, 1);
    paramb1.b(paramb.b, 2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/media/AudioAttributesImplApi21Parcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */