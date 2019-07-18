package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class m
  implements Parcelable.Creator<RatingCompat>
{
  public RatingCompat createFromParcel(Parcel paramParcel)
  {
    return new RatingCompat(paramParcel.readInt(), paramParcel.readFloat());
  }
  
  public RatingCompat[] newArray(int paramInt)
  {
    return new RatingCompat[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */