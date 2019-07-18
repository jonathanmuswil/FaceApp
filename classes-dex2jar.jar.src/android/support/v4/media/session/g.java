package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g
  implements Parcelable.Creator<MediaSessionCompat.QueueItem>
{
  public MediaSessionCompat.QueueItem createFromParcel(Parcel paramParcel)
  {
    return new MediaSessionCompat.QueueItem(paramParcel);
  }
  
  public MediaSessionCompat.QueueItem[] newArray(int paramInt)
  {
    return new MediaSessionCompat.QueueItem[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */