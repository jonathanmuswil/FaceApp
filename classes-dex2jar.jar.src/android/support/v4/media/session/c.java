package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c
  implements IBinder.DeathRecipient
{
  final Object a;
  a b;
  a c;
  
  public c()
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.a = f.a(new b(this));
    }
    else
    {
      c localc = new c(this);
      this.c = localc;
      this.a = localc;
    }
  }
  
  public void a() {}
  
  void a(int paramInt, Object paramObject, Bundle paramBundle)
  {
    a locala = this.b;
    if (locala != null)
    {
      paramObject = locala.obtainMessage(paramInt, paramObject);
      ((Message)paramObject).setData(paramBundle);
      ((Message)paramObject).sendToTarget();
    }
  }
  
  public void a(Bundle paramBundle) {}
  
  public void a(MediaMetadataCompat paramMediaMetadataCompat) {}
  
  public void a(PlaybackStateCompat paramPlaybackStateCompat) {}
  
  public void a(e parame) {}
  
  public void a(CharSequence paramCharSequence) {}
  
  public void a(String paramString, Bundle paramBundle) {}
  
  public void a(List<MediaSessionCompat.QueueItem> paramList) {}
  
  public void binderDied()
  {
    a(8, null, null);
  }
  
  private class a
    extends Handler
  {}
  
  private static class b
    implements f.a
  {
    private final WeakReference<c> a;
    
    b(c paramc)
    {
      this.a = new WeakReference(paramc);
    }
    
    public void L()
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a();
      }
    }
    
    public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(new e(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5));
      }
    }
    
    public void a(CharSequence paramCharSequence)
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(paramCharSequence);
      }
    }
    
    public void a(Object paramObject)
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(MediaMetadataCompat.a(paramObject));
      }
    }
    
    public void a(String paramString, Bundle paramBundle)
    {
      c localc = (c)this.a.get();
      if ((localc != null) && ((localc.c == null) || (Build.VERSION.SDK_INT >= 23))) {
        localc.a(paramString, paramBundle);
      }
    }
    
    public void b(Bundle paramBundle)
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(paramBundle);
      }
    }
    
    public void b(Object paramObject)
    {
      c localc = (c)this.a.get();
      if ((localc != null) && (localc.c == null)) {
        localc.a(PlaybackStateCompat.a(paramObject));
      }
    }
    
    public void b(List<?> paramList)
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(MediaSessionCompat.QueueItem.a(paramList));
      }
    }
  }
  
  private static class c
    extends a.a
  {
    private final WeakReference<c> a;
    
    c(c paramc)
    {
      this.a = new WeakReference(paramc);
    }
    
    public void L()
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(8, null, null);
      }
    }
    
    public void a(MediaMetadataCompat paramMediaMetadataCompat)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(3, paramMediaMetadataCompat, null);
      }
    }
    
    public void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null)
      {
        if (paramParcelableVolumeInfo != null) {
          paramParcelableVolumeInfo = new e(paramParcelableVolumeInfo.a, paramParcelableVolumeInfo.b, paramParcelableVolumeInfo.c, paramParcelableVolumeInfo.d, paramParcelableVolumeInfo.e);
        } else {
          paramParcelableVolumeInfo = null;
        }
        localc.a(4, paramParcelableVolumeInfo, null);
      }
    }
    
    public void a(PlaybackStateCompat paramPlaybackStateCompat)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(2, paramPlaybackStateCompat, null);
      }
    }
    
    public void a(CharSequence paramCharSequence)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(6, paramCharSequence, null);
      }
    }
    
    public void a(String paramString, Bundle paramBundle)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(1, paramString, paramBundle);
      }
    }
    
    public void b(Bundle paramBundle)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(7, paramBundle, null);
      }
    }
    
    public void b(List<MediaSessionCompat.QueueItem> paramList)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(5, paramList, null);
      }
    }
    
    public void b(boolean paramBoolean)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(11, Boolean.valueOf(paramBoolean), null);
      }
    }
    
    public void c(boolean paramBoolean)
      throws RemoteException
    {}
    
    public void d(int paramInt)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(9, Integer.valueOf(paramInt), null);
      }
    }
    
    public void e(int paramInt)
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(12, Integer.valueOf(paramInt), null);
      }
    }
    
    public void la()
      throws RemoteException
    {
      c localc = (c)this.a.get();
      if (localc != null) {
        localc.a(13, null, null);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */