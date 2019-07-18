package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

class i
{
  public static CharSequence a(Object paramObject)
  {
    return ((MediaDescription)paramObject).getDescription();
  }
  
  public static Object a(Parcel paramParcel)
  {
    return MediaDescription.CREATOR.createFromParcel(paramParcel);
  }
  
  public static void a(Object paramObject, Parcel paramParcel, int paramInt)
  {
    ((MediaDescription)paramObject).writeToParcel(paramParcel, paramInt);
  }
  
  public static Bundle b(Object paramObject)
  {
    return ((MediaDescription)paramObject).getExtras();
  }
  
  public static Bitmap c(Object paramObject)
  {
    return ((MediaDescription)paramObject).getIconBitmap();
  }
  
  public static Uri d(Object paramObject)
  {
    return ((MediaDescription)paramObject).getIconUri();
  }
  
  public static String e(Object paramObject)
  {
    return ((MediaDescription)paramObject).getMediaId();
  }
  
  public static CharSequence f(Object paramObject)
  {
    return ((MediaDescription)paramObject).getSubtitle();
  }
  
  public static CharSequence g(Object paramObject)
  {
    return ((MediaDescription)paramObject).getTitle();
  }
  
  static class a
  {
    public static Object a()
    {
      return new MediaDescription.Builder();
    }
    
    public static Object a(Object paramObject)
    {
      return ((MediaDescription.Builder)paramObject).build();
    }
    
    public static void a(Object paramObject, Bitmap paramBitmap)
    {
      ((MediaDescription.Builder)paramObject).setIconBitmap(paramBitmap);
    }
    
    public static void a(Object paramObject, Uri paramUri)
    {
      ((MediaDescription.Builder)paramObject).setIconUri(paramUri);
    }
    
    public static void a(Object paramObject, Bundle paramBundle)
    {
      ((MediaDescription.Builder)paramObject).setExtras(paramBundle);
    }
    
    public static void a(Object paramObject, CharSequence paramCharSequence)
    {
      ((MediaDescription.Builder)paramObject).setDescription(paramCharSequence);
    }
    
    public static void a(Object paramObject, String paramString)
    {
      ((MediaDescription.Builder)paramObject).setMediaId(paramString);
    }
    
    public static void b(Object paramObject, CharSequence paramCharSequence)
    {
      ((MediaDescription.Builder)paramObject).setSubtitle(paramCharSequence);
    }
    
    public static void c(Object paramObject, CharSequence paramCharSequence)
    {
      ((MediaDescription.Builder)paramObject).setTitle(paramCharSequence);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/media/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */