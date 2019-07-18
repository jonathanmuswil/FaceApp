package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.H;

public class MobileAdsInitProvider
  extends ContentProvider
{
  private final H a = new H();
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    this.a.attachInfo(paramContext, paramProviderInfo);
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return this.a.delete(paramUri, paramString, paramArrayOfString);
  }
  
  public String getType(Uri paramUri)
  {
    return this.a.getType(paramUri);
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return this.a.insert(paramUri, paramContentValues);
  }
  
  public boolean onCreate()
  {
    return this.a.onCreate();
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return this.a.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return this.a.update(paramUri, paramContentValues, paramString, paramArrayOfString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/MobileAdsInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */