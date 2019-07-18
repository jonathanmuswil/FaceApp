package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator<MediaSessionCompat.ResultReceiverWrapper>
{
  public MediaSessionCompat.ResultReceiverWrapper createFromParcel(Parcel paramParcel)
  {
    return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
  }
  
  public MediaSessionCompat.ResultReceiverWrapper[] newArray(int paramInt)
  {
    return new MediaSessionCompat.ResultReceiverWrapper[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */