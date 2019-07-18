package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i
  implements Parcelable.Creator<MediaSessionCompat.Token>
{
  public MediaSessionCompat.Token createFromParcel(Parcel paramParcel)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      paramParcel = paramParcel.readParcelable(null);
    } else {
      paramParcel = paramParcel.readStrongBinder();
    }
    return new MediaSessionCompat.Token(paramParcel);
  }
  
  public MediaSessionCompat.Token[] newArray(int paramInt)
  {
    return new MediaSessionCompat.Token[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */