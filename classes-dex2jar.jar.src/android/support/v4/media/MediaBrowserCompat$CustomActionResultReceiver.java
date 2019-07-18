package android.support.v4.media;

import Oc;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

class MediaBrowserCompat$CustomActionResultReceiver
  extends Oc
{
  private final String d;
  private final Bundle e;
  private final d f;
  
  protected void a(int paramInt, Bundle paramBundle)
  {
    if (this.f == null) {
      return;
    }
    MediaSessionCompat.a(paramBundle);
    if (paramInt != -1)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unknown result code: ");
          localStringBuilder.append(paramInt);
          localStringBuilder.append(" (extras=");
          localStringBuilder.append(this.e);
          localStringBuilder.append(", resultData=");
          localStringBuilder.append(paramBundle);
          localStringBuilder.append(")");
          Log.w("MediaBrowserCompat", localStringBuilder.toString());
        }
        else
        {
          this.f.b(this.d, this.e, paramBundle);
        }
      }
      else {
        this.f.c(this.d, this.e, paramBundle);
      }
    }
    else {
      this.f.a(this.d, this.e, paramBundle);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */