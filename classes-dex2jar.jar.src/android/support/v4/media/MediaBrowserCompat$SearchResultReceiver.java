package android.support.v4.media;

import Oc;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$SearchResultReceiver
  extends Oc
{
  private final String d;
  private final Bundle e;
  private final g f;
  
  protected void a(int paramInt, Bundle paramBundle)
  {
    MediaSessionCompat.a(paramBundle);
    if ((paramInt == 0) && (paramBundle != null) && (paramBundle.containsKey("search_results")))
    {
      Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
      paramBundle = null;
      if (arrayOfParcelable != null)
      {
        ArrayList localArrayList = new ArrayList();
        int i = arrayOfParcelable.length;
        for (paramInt = 0;; paramInt++)
        {
          paramBundle = localArrayList;
          if (paramInt >= i) {
            break;
          }
          localArrayList.add((MediaBrowserCompat.MediaItem)arrayOfParcelable[paramInt]);
        }
      }
      this.f.a(this.d, this.e, paramBundle);
      return;
    }
    this.f.a(this.d, this.e);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat$SearchResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */