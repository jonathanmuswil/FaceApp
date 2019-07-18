package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.app.g;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21
  implements d
{
  final Object a;
  private final List<c> b;
  private HashMap<c, a> c;
  final MediaSessionCompat.Token d;
  
  void a()
  {
    if (this.d.l() == null) {
      return;
    }
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      a locala = new a(localc);
      this.c.put(localc, locala);
      localc.c = locala;
      try
      {
        this.d.l().a(locala);
        localc.a(13, null, null);
      }
      catch (RemoteException localRemoteException)
      {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", localRemoteException);
      }
    }
    this.b.clear();
  }
  
  private static class ExtraBinderRequestResultReceiver
    extends ResultReceiver
  {
    private WeakReference<MediaControllerCompat.MediaControllerImplApi21> a;
    
    protected void onReceiveResult(int paramInt, Bundle paramBundle)
    {
      MediaControllerCompat.MediaControllerImplApi21 localMediaControllerImplApi21 = (MediaControllerCompat.MediaControllerImplApi21)this.a.get();
      if ((localMediaControllerImplApi21 != null) && (paramBundle != null)) {
        synchronized (localMediaControllerImplApi21.a)
        {
          localMediaControllerImplApi21.d.a(b.a.a(g.a(paramBundle, "android.support.v4.media.session.EXTRA_BINDER")));
          localMediaControllerImplApi21.d.a(paramBundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
          localMediaControllerImplApi21.a();
          return;
        }
      }
    }
  }
  
  private static class a
    extends c.c
  {
    a(c paramc)
    {
      super();
    }
    
    public void L()
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void a(MediaMetadataCompat paramMediaMetadataCompat)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void a(CharSequence paramCharSequence)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void b(Bundle paramBundle)
      throws RemoteException
    {
      throw new AssertionError();
    }
    
    public void b(List<MediaSessionCompat.QueueItem> paramList)
      throws RemoteException
    {
      throw new AssertionError();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */