package android.support.v4.media;

import Oc;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;

class MediaBrowserCompat$ItemReceiver
  extends Oc
{
  private final String d;
  private final e e;
  
  protected void a(int paramInt, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("media_item")))
    {
      paramBundle = paramBundle.getParcelable("media_item");
      if ((paramBundle != null) && (!(paramBundle instanceof MediaBrowserCompat.MediaItem))) {
        this.e.a(this.d);
      } else {
        this.e.a((MediaBrowserCompat.MediaItem)paramBundle);
      }
      return;
    }
    this.e.a(this.d);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat$ItemReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */