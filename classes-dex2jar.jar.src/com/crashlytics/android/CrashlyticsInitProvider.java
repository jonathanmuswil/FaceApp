package com.crashlytics.android;

import Aba;
import Naa;
import Uaa;
import Xaa;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class CrashlyticsInitProvider
  extends ContentProvider
{
  boolean a(Context paramContext, Aba paramAba, a parama)
  {
    if (paramAba.e(paramContext)) {
      return parama.a(paramContext);
    }
    return paramAba.d(paramContext);
  }
  
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
    Context localContext = getContext();
    if (a(localContext, new Aba(), new b())) {
      try
      {
        a locala = new com/crashlytics/android/a;
        locala.<init>();
        Naa.a(localContext, new Uaa[] { locala });
        Naa.e().e("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization successful");
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Naa.e().e("CrashlyticsInitProvider", "CrashlyticsInitProvider initialization unsuccessful");
        return false;
      }
    } else {
      Naa.e().e("CrashlyticsInitProvider", "CrashlyticsInitProvider skipping initialization");
    }
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  static abstract interface a
  {
    public abstract boolean a(Context paramContext);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/crashlytics/android/CrashlyticsInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */