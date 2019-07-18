package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class m
  implements Parcelable.Creator<PlaybackStateCompat.CustomAction>
{
  public PlaybackStateCompat.CustomAction createFromParcel(Parcel paramParcel)
  {
    return new PlaybackStateCompat.CustomAction(paramParcel);
  }
  
  public PlaybackStateCompat.CustomAction[] newArray(int paramInt)
  {
    return new PlaybackStateCompat.CustomAction[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */