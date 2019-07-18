package com.google.firebase.perf.provider;

import Iv;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.t;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.a;
import com.google.firebase.perf.internal.x;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.metrics.AppStartTrace.a;
import wv;

@Keep
public class FirebasePerfProvider
  extends ContentProvider
{
  private static final Iv zzhh = new Iv();
  private final Handler mHandler = new Handler(Looper.getMainLooper());
  
  static
  {
    new wv();
  }
  
  public static Iv zzcx()
  {
    return zzhh;
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    t.a(paramProviderInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
    if (!"com.google.firebase.firebaseperfprovider".equals(paramProviderInfo.authority))
    {
      super.attachInfo(paramContext, paramProviderInfo);
      a.a().a(getContext());
      paramContext = AppStartTrace.a();
      paramContext.a(getContext());
      this.mHandler.post(new AppStartTrace.a(paramContext));
      if (x.q()) {
        GaugeManager.zzbh();
      }
      return;
    }
    throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/provider/FirebasePerfProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */