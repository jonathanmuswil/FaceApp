package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k
  implements Parcelable.Creator<MediaMetadataCompat>
{
  public MediaMetadataCompat createFromParcel(Parcel paramParcel)
  {
    return new MediaMetadataCompat(paramParcel);
  }
  
  public MediaMetadataCompat[] newArray(int paramInt)
  {
    return new MediaMetadataCompat[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */