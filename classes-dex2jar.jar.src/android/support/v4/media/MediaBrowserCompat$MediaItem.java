package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator<MediaItem> CREATOR = new f();
  private final int a;
  private final MediaDescriptionCompat b;
  
  MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    this.a = paramParcel.readInt();
    this.b = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
    localStringBuilder.append("mFlags=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", mDescription=");
    localStringBuilder.append(this.b);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.a);
    this.b.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat$MediaItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */