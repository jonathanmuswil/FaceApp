package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new h();
  private final String a;
  private final CharSequence b;
  private final CharSequence c;
  private final CharSequence d;
  private final Bitmap e;
  private final Uri f;
  private final Bundle g;
  private final Uri h;
  private Object i;
  
  MediaDescriptionCompat(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.c = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.d = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    ClassLoader localClassLoader = MediaDescriptionCompat.class.getClassLoader();
    this.e = ((Bitmap)paramParcel.readParcelable(localClassLoader));
    this.f = ((Uri)paramParcel.readParcelable(localClassLoader));
    this.g = paramParcel.readBundle(localClassLoader);
    this.h = ((Uri)paramParcel.readParcelable(localClassLoader));
  }
  
  MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.a = paramString;
    this.b = paramCharSequence1;
    this.c = paramCharSequence2;
    this.d = paramCharSequence3;
    this.e = paramBitmap;
    this.f = paramUri1;
    this.g = paramBundle;
    this.h = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject)
  {
    Bundle localBundle1 = null;
    Bundle localBundle2 = null;
    Object localObject = localBundle1;
    if (paramObject != null)
    {
      localObject = localBundle1;
      if (Build.VERSION.SDK_INT >= 21)
      {
        a locala = new a();
        locala.a(i.e(paramObject));
        locala.c(i.g(paramObject));
        locala.b(i.f(paramObject));
        locala.a(i.a(paramObject));
        locala.a(i.c(paramObject));
        locala.a(i.d(paramObject));
        localBundle1 = i.b(paramObject);
        if (localBundle1 != null)
        {
          MediaSessionCompat.a(localBundle1);
          localObject = (Uri)localBundle1.getParcelable("android.support.v4.media.description.MEDIA_URI");
        }
        else
        {
          localObject = null;
        }
        if (localObject != null)
        {
          if ((!localBundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle1.size() != 2))
          {
            localBundle1.remove("android.support.v4.media.description.MEDIA_URI");
            localBundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
          }
        }
        else {
          localBundle2 = localBundle1;
        }
        locala.a(localBundle2);
        if (localObject != null) {
          locala.b((Uri)localObject);
        } else if (Build.VERSION.SDK_INT >= 23) {
          locala.b(j.a(paramObject));
        }
        localObject = locala.a();
        ((MediaDescriptionCompat)localObject).i = paramObject;
      }
    }
    return (MediaDescriptionCompat)localObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object l()
  {
    if ((this.i == null) && (Build.VERSION.SDK_INT >= 21))
    {
      Object localObject = i.a.a();
      i.a.a(localObject, this.a);
      i.a.c(localObject, this.b);
      i.a.b(localObject, this.c);
      i.a.a(localObject, this.d);
      i.a.a(localObject, this.e);
      i.a.a(localObject, this.f);
      Bundle localBundle1 = this.g;
      Bundle localBundle2 = localBundle1;
      if (Build.VERSION.SDK_INT < 23)
      {
        localBundle2 = localBundle1;
        if (this.h != null)
        {
          localBundle2 = localBundle1;
          if (localBundle1 == null)
          {
            localBundle2 = new Bundle();
            localBundle2.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
          }
          localBundle2.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
        }
      }
      i.a.a(localObject, localBundle2);
      if (Build.VERSION.SDK_INT >= 23) {
        j.a.a(localObject, this.h);
      }
      this.i = i.a.a(localObject);
      return this.i;
    }
    return this.i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b);
    localStringBuilder.append(", ");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", ");
    localStringBuilder.append(this.d);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.a);
      TextUtils.writeToParcel(this.b, paramParcel, paramInt);
      TextUtils.writeToParcel(this.c, paramParcel, paramInt);
      TextUtils.writeToParcel(this.d, paramParcel, paramInt);
      paramParcel.writeParcelable(this.e, paramInt);
      paramParcel.writeParcelable(this.f, paramInt);
      paramParcel.writeBundle(this.g);
      paramParcel.writeParcelable(this.h, paramInt);
    }
    else
    {
      i.a(l(), paramParcel, paramInt);
    }
  }
  
  public static final class a
  {
    private String a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private Bitmap e;
    private Uri f;
    private Bundle g;
    private Uri h;
    
    public a a(Bitmap paramBitmap)
    {
      this.e = paramBitmap;
      return this;
    }
    
    public a a(Uri paramUri)
    {
      this.f = paramUri;
      return this;
    }
    
    public a a(Bundle paramBundle)
    {
      this.g = paramBundle;
      return this;
    }
    
    public a a(CharSequence paramCharSequence)
    {
      this.d = paramCharSequence;
      return this;
    }
    
    public a a(String paramString)
    {
      this.a = paramString;
      return this;
    }
    
    public MediaDescriptionCompat a()
    {
      return new MediaDescriptionCompat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
    
    public a b(Uri paramUri)
    {
      this.h = paramUri;
      return this;
    }
    
    public a b(CharSequence paramCharSequence)
    {
      this.c = paramCharSequence;
      return this;
    }
    
    public a c(CharSequence paramCharSequence)
    {
      this.b = paramCharSequence;
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */