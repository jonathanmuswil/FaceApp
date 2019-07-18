package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

class f
{
  public static Object a(a parama)
  {
    return new b(parama);
  }
  
  public static abstract interface a
  {
    public abstract void L();
    
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
    
    public abstract void a(CharSequence paramCharSequence);
    
    public abstract void a(Object paramObject);
    
    public abstract void a(String paramString, Bundle paramBundle);
    
    public abstract void b(Bundle paramBundle);
    
    public abstract void b(Object paramObject);
    
    public abstract void b(List<?> paramList);
  }
  
  static class b<T extends f.a>
    extends MediaController.Callback
  {
    protected final T a;
    
    public b(T paramT)
    {
      this.a = paramT;
    }
    
    public void onAudioInfoChanged(MediaController.PlaybackInfo paramPlaybackInfo)
    {
      this.a.a(paramPlaybackInfo.getPlaybackType(), f.c.b(paramPlaybackInfo), paramPlaybackInfo.getVolumeControl(), paramPlaybackInfo.getMaxVolume(), paramPlaybackInfo.getCurrentVolume());
    }
    
    public void onExtrasChanged(Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      this.a.b(paramBundle);
    }
    
    public void onMetadataChanged(MediaMetadata paramMediaMetadata)
    {
      this.a.a(paramMediaMetadata);
    }
    
    public void onPlaybackStateChanged(PlaybackState paramPlaybackState)
    {
      this.a.b(paramPlaybackState);
    }
    
    public void onQueueChanged(List<MediaSession.QueueItem> paramList)
    {
      this.a.b(paramList);
    }
    
    public void onQueueTitleChanged(CharSequence paramCharSequence)
    {
      this.a.a(paramCharSequence);
    }
    
    public void onSessionDestroyed()
    {
      this.a.L();
    }
    
    public void onSessionEvent(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      this.a.a(paramString, paramBundle);
    }
  }
  
  public static class c
  {
    private static int a(AudioAttributes paramAudioAttributes)
    {
      if ((paramAudioAttributes.getFlags() & 0x1) == 1) {
        return 7;
      }
      if ((paramAudioAttributes.getFlags() & 0x4) == 4) {
        return 6;
      }
      switch (paramAudioAttributes.getUsage())
      {
      default: 
        return 3;
      case 13: 
        return 1;
      case 6: 
        return 2;
      case 5: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
        return 5;
      case 4: 
        return 4;
      case 3: 
        return 8;
      case 2: 
        return 0;
      }
      return 3;
    }
    
    public static AudioAttributes a(Object paramObject)
    {
      return ((MediaController.PlaybackInfo)paramObject).getAudioAttributes();
    }
    
    public static int b(Object paramObject)
    {
      return a(a(paramObject));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */