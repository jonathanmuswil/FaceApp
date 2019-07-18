package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class l
  implements Parcelable.Creator<PlaybackStateCompat>
{
  public PlaybackStateCompat createFromParcel(Parcel paramParcel)
  {
    return new PlaybackStateCompat(paramParcel);
  }
  
  public PlaybackStateCompat[] newArray(int paramInt)
  {
    return new PlaybackStateCompat[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */