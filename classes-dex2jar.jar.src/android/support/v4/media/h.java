package android.support.v4.media;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator<MediaDescriptionCompat>
{
  public MediaDescriptionCompat createFromParcel(Parcel paramParcel)
  {
    if (Build.VERSION.SDK_INT < 21) {
      return new MediaDescriptionCompat(paramParcel);
    }
    return MediaDescriptionCompat.a(i.a(paramParcel));
  }
  
  public MediaDescriptionCompat[] newArray(int paramInt)
  {
    return new MediaDescriptionCompat[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */