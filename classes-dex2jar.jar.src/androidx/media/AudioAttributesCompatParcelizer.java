package androidx.media;

import android.support.v4.media.AudioAttributesCompat;
import android.support.v4.media.a;
import androidx.versionedparcelable.b;

public final class AudioAttributesCompatParcelizer
{
  public static AudioAttributesCompat read(b paramb)
  {
    AudioAttributesCompat localAudioAttributesCompat = new AudioAttributesCompat();
    localAudioAttributesCompat.c = ((a)paramb.a(localAudioAttributesCompat.c, 1));
    return localAudioAttributesCompat;
  }
  
  public static void write(AudioAttributesCompat paramAudioAttributesCompat, b paramb)
  {
    paramb.a(false, false);
    paramb.b(paramAudioAttributesCompat.c, 1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/androidx/media/AudioAttributesCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */