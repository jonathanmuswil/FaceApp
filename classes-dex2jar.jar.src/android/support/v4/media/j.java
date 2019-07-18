package android.support.v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

class j
{
  public static Uri a(Object paramObject)
  {
    return ((MediaDescription)paramObject).getMediaUri();
  }
  
  static class a
  {
    public static void a(Object paramObject, Uri paramUri)
    {
      ((MediaDescription.Builder)paramObject).setMediaUri(paramUri);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */