package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class f
  implements Parcelable.Creator<MediaBrowserCompat.MediaItem>
{
  public MediaBrowserCompat.MediaItem createFromParcel(Parcel paramParcel)
  {
    return new MediaBrowserCompat.MediaItem(paramParcel);
  }
  
  public MediaBrowserCompat.MediaItem[] newArray(int paramInt)
  {
    return new MediaBrowserCompat.MediaItem[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */