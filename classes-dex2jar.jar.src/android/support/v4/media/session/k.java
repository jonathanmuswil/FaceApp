package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k
  implements Parcelable.Creator<ParcelableVolumeInfo>
{
  public ParcelableVolumeInfo createFromParcel(Parcel paramParcel)
  {
    return new ParcelableVolumeInfo(paramParcel);
  }
  
  public ParcelableVolumeInfo[] newArray(int paramInt)
  {
    return new ParcelableVolumeInfo[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */