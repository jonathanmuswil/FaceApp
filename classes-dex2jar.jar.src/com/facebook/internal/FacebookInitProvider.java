package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;

public final class FacebookInitProvider
  extends ContentProvider
{
  private static final String a = "FacebookInitProvider";
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    try
    {
      FacebookSdk.c(getContext());
    }
    catch (Exception localException)
    {
      Log.i(a, "Failed to auto initialize the Facebook SDK", localException);
    }
    return false;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/FacebookInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */