package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaSessionCompat
{
  public static void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
    }
  }
  
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new g();
    private final MediaDescriptionCompat a;
    private final long b;
    private Object c;
    
    QueueItem(Parcel paramParcel)
    {
      this.a = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      this.b = paramParcel.readLong();
    }
    
    private QueueItem(Object paramObject, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (paramLong != -1L)
        {
          this.a = paramMediaDescriptionCompat;
          this.b = paramLong;
          this.c = paramObject;
          return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      }
      throw new IllegalArgumentException("Description cannot be null.");
    }
    
    public static QueueItem a(Object paramObject)
    {
      if ((paramObject != null) && (Build.VERSION.SDK_INT >= 21)) {
        return new QueueItem(paramObject, MediaDescriptionCompat.a(j.a(paramObject)), j.b(paramObject));
      }
      return null;
    }
    
    public static List<QueueItem> a(List<?> paramList)
    {
      if ((paramList != null) && (Build.VERSION.SDK_INT >= 21))
      {
        ArrayList localArrayList = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          localArrayList.add(a(paramList.next()));
        }
        return localArrayList;
      }
      return null;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MediaSession.QueueItem {Description=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", Id=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      this.a.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(this.b);
    }
  }
  
  public static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new h();
    ResultReceiver a;
    
    ResultReceiverWrapper(Parcel paramParcel)
    {
      this.a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      this.a.writeToParcel(paramParcel, paramInt);
    }
  }
  
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new i();
    private final Object a;
    private b b;
    private Bundle c;
    
    Token(Object paramObject)
    {
      this(paramObject, null, null);
    }
    
    Token(Object paramObject, b paramb, Bundle paramBundle)
    {
      this.a = paramObject;
      this.b = paramb;
      this.c = paramBundle;
    }
    
    public void a(Bundle paramBundle)
    {
      this.c = paramBundle;
    }
    
    public void a(b paramb)
    {
      this.b = paramb;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Token)) {
        return false;
      }
      Object localObject = (Token)paramObject;
      paramObject = this.a;
      if (paramObject == null)
      {
        if (((Token)localObject).a != null) {
          bool = false;
        }
        return bool;
      }
      localObject = ((Token)localObject).a;
      if (localObject == null) {
        return false;
      }
      return paramObject.equals(localObject);
    }
    
    public int hashCode()
    {
      Object localObject = this.a;
      if (localObject == null) {
        return 0;
      }
      return localObject.hashCode();
    }
    
    public b l()
    {
      return this.b;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      if (Build.VERSION.SDK_INT >= 21) {
        paramParcel.writeParcelable((Parcelable)this.a, paramInt);
      } else {
        paramParcel.writeStrongBinder((IBinder)this.a);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/session/MediaSessionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */