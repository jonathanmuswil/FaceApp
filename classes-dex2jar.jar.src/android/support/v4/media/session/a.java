package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public abstract interface a
  extends IInterface
{
  public abstract void L()
    throws RemoteException;
  
  public abstract void a(MediaMetadataCompat paramMediaMetadataCompat)
    throws RemoteException;
  
  public abstract void a(ParcelableVolumeInfo paramParcelableVolumeInfo)
    throws RemoteException;
  
  public abstract void a(PlaybackStateCompat paramPlaybackStateCompat)
    throws RemoteException;
  
  public abstract void a(CharSequence paramCharSequence)
    throws RemoteException;
  
  public abstract void a(String paramString, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(List<MediaSessionCompat.QueueItem> paramList)
    throws RemoteException;
  
  public abstract void b(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void c(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void d(int paramInt)
    throws RemoteException;
  
  public abstract void e(int paramInt)
    throws RemoteException;
  
  public abstract void la()
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      if (paramInt1 != 1598968902)
      {
        boolean bool1 = false;
        boolean bool2 = false;
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        Object localObject5 = null;
        String str = null;
        switch (paramInt1)
        {
        default: 
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        case 13: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          la();
          return true;
        case 12: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          e(paramParcel1.readInt());
          return true;
        case 11: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          b(bool2);
          return true;
        case 10: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          bool2 = bool1;
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          c(bool2);
          return true;
        case 9: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          d(paramParcel1.readInt());
          return true;
        case 8: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = str;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
          }
          a(paramParcel2);
          return true;
        case 7: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject1;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          }
          b(paramParcel2);
          return true;
        case 6: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject2;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
          }
          a(paramParcel2);
          return true;
        case 5: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          b(paramParcel1.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
          return true;
        case 4: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject3;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
          }
          a(paramParcel2);
          return true;
        case 3: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          paramParcel2 = (Parcel)localObject4;
          if (paramParcel1.readInt() != 0) {
            paramParcel2 = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
          }
          a(paramParcel2);
          return true;
        case 2: 
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
          L();
          return true;
        }
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        str = paramParcel1.readString();
        paramParcel2 = (Parcel)localObject5;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a(str, paramParcel2);
        return true;
      }
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      return true;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */