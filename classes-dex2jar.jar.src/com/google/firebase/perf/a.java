package com.google.firebase.perf;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.internal.FeatureControl;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.RemoteConfigManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import zv;

public class a
{
  private static volatile a a;
  private final Map<String, String> b = new ConcurrentHashMap();
  private final zv c;
  private Boolean d = null;
  
  a(FirebaseApp paramFirebaseApp, com.google.firebase.remoteconfig.a parama)
  {
    this(paramFirebaseApp, parama, RemoteConfigManager.zzbz(), FeatureControl.zzaq(), GaugeManager.zzbe());
  }
  
  private a(FirebaseApp paramFirebaseApp, com.google.firebase.remoteconfig.a parama, RemoteConfigManager paramRemoteConfigManager, FeatureControl paramFeatureControl, GaugeManager paramGaugeManager)
  {
    if (paramFirebaseApp == null)
    {
      this.d = Boolean.valueOf(false);
      this.c = new zv(new Bundle());
      return;
    }
    paramFirebaseApp = paramFirebaseApp.b();
    this.c = b(paramFirebaseApp);
    this.d = a(paramFirebaseApp);
    paramRemoteConfigManager.zza(parama);
    paramFeatureControl.zza(this.c);
    paramGaugeManager.zze(paramFirebaseApp);
  }
  
  private final Boolean a(Context paramContext)
  {
    if (d()) {
      return Boolean.valueOf(false);
    }
    paramContext = paramContext.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    try
    {
      if (paramContext.contains("isEnabled"))
      {
        boolean bool = paramContext.getBoolean("isEnabled", true);
        return Boolean.valueOf(bool);
      }
    }
    catch (ClassCastException paramContext)
    {
      paramContext = String.valueOf(paramContext.getMessage());
      if (paramContext.length() != 0) {
        paramContext = "Unable to access enable value: ".concat(paramContext);
      } else {
        paramContext = new String("Unable to access enable value: ");
      }
      Log.d("FirebasePerformance", paramContext);
      if (this.c.a("firebase_performance_collection_enabled")) {
        return Boolean.valueOf(this.c.a("firebase_performance_collection_enabled", true));
      }
      Log.d("isEnabled", "No perf enable meta data found in manifest.");
    }
    return null;
  }
  
  public static a b()
  {
    if (a == null) {
      try
      {
        if (a == null) {
          a = (a)FirebaseApp.getInstance().a(a.class);
        }
      }
      finally {}
    }
    return a;
  }
  
  private static zv b(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
    }
    catch (NullPointerException paramContext) {}catch (PackageManager.NameNotFoundException paramContext) {}
    paramContext = String.valueOf(paramContext.getMessage());
    if (paramContext.length() != 0) {
      paramContext = "No perf enable meta data found ".concat(paramContext);
    } else {
      paramContext = new String("No perf enable meta data found ");
    }
    Log.d("isEnabled", paramContext);
    paramContext = null;
    if (paramContext != null) {
      return new zv(paramContext);
    }
    return new zv();
  }
  
  private final boolean d()
  {
    return this.c.a("firebase_performance_collection_deactivated", false);
  }
  
  public final Map<String, String> a()
  {
    return new HashMap(this.b);
  }
  
  public boolean c()
  {
    Boolean localBoolean = this.d;
    if (localBoolean != null) {
      return localBoolean.booleanValue();
    }
    return FirebaseApp.getInstance().isDataCollectionDefaultEnabled();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */