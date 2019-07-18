package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

class n
{
  public static long a(Object paramObject)
  {
    return ((PlaybackState)paramObject).getActions();
  }
  
  public static long b(Object paramObject)
  {
    return ((PlaybackState)paramObject).getActiveQueueItemId();
  }
  
  public static long c(Object paramObject)
  {
    return ((PlaybackState)paramObject).getBufferedPosition();
  }
  
  public static List<Object> d(Object paramObject)
  {
    return ((PlaybackState)paramObject).getCustomActions();
  }
  
  public static CharSequence e(Object paramObject)
  {
    return ((PlaybackState)paramObject).getErrorMessage();
  }
  
  public static long f(Object paramObject)
  {
    return ((PlaybackState)paramObject).getLastPositionUpdateTime();
  }
  
  public static float g(Object paramObject)
  {
    return ((PlaybackState)paramObject).getPlaybackSpeed();
  }
  
  public static long h(Object paramObject)
  {
    return ((PlaybackState)paramObject).getPosition();
  }
  
  public static int i(Object paramObject)
  {
    return ((PlaybackState)paramObject).getState();
  }
  
  static final class a
  {
    public static String a(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getAction();
    }
    
    public static Bundle b(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getExtras();
    }
    
    public static int c(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getIcon();
    }
    
    public static CharSequence d(Object paramObject)
    {
      return ((PlaybackState.CustomAction)paramObject).getName();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */