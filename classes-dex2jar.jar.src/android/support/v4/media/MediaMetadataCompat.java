package android.support.v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import gd;
import ud;

public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new k();
  static final gd<String, Integer> a = new gd();
  private static final String[] b;
  private static final String[] c;
  private static final String[] d;
  final Bundle e;
  private Object f;
  
  static
  {
    Object localObject1 = a;
    Integer localInteger = Integer.valueOf(1);
    ((ud)localObject1).put("android.media.metadata.TITLE", localInteger);
    a.put("android.media.metadata.ARTIST", localInteger);
    Object localObject2 = a;
    localObject1 = Integer.valueOf(0);
    ((ud)localObject2).put("android.media.metadata.DURATION", localObject1);
    a.put("android.media.metadata.ALBUM", localInteger);
    a.put("android.media.metadata.AUTHOR", localInteger);
    a.put("android.media.metadata.WRITER", localInteger);
    a.put("android.media.metadata.COMPOSER", localInteger);
    a.put("android.media.metadata.COMPILATION", localInteger);
    a.put("android.media.metadata.DATE", localInteger);
    a.put("android.media.metadata.YEAR", localObject1);
    a.put("android.media.metadata.GENRE", localInteger);
    a.put("android.media.metadata.TRACK_NUMBER", localObject1);
    a.put("android.media.metadata.NUM_TRACKS", localObject1);
    a.put("android.media.metadata.DISC_NUMBER", localObject1);
    a.put("android.media.metadata.ALBUM_ARTIST", localInteger);
    Object localObject3 = a;
    localObject2 = Integer.valueOf(2);
    ((ud)localObject3).put("android.media.metadata.ART", localObject2);
    a.put("android.media.metadata.ART_URI", localInteger);
    a.put("android.media.metadata.ALBUM_ART", localObject2);
    a.put("android.media.metadata.ALBUM_ART_URI", localInteger);
    gd localgd = a;
    localObject3 = Integer.valueOf(3);
    localgd.put("android.media.metadata.USER_RATING", localObject3);
    a.put("android.media.metadata.RATING", localObject3);
    a.put("android.media.metadata.DISPLAY_TITLE", localInteger);
    a.put("android.media.metadata.DISPLAY_SUBTITLE", localInteger);
    a.put("android.media.metadata.DISPLAY_DESCRIPTION", localInteger);
    a.put("android.media.metadata.DISPLAY_ICON", localObject2);
    a.put("android.media.metadata.DISPLAY_ICON_URI", localInteger);
    a.put("android.media.metadata.MEDIA_ID", localInteger);
    a.put("android.media.metadata.BT_FOLDER_TYPE", localObject1);
    a.put("android.media.metadata.MEDIA_URI", localInteger);
    a.put("android.media.metadata.ADVERTISEMENT", localObject1);
    a.put("android.media.metadata.DOWNLOAD_STATUS", localObject1);
    b = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    c = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    d = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  MediaMetadataCompat(Parcel paramParcel)
  {
    this.e = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public static MediaMetadataCompat a(Object paramObject)
  {
    if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21))
    {
      Parcel localParcel = Parcel.obtain();
      l.a(paramObject, localParcel, 0);
      localParcel.setDataPosition(0);
      MediaMetadataCompat localMediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(localParcel);
      localParcel.recycle();
      localMediaMetadataCompat.f = paramObject;
      return localMediaMetadataCompat;
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.e);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/MediaMetadataCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */