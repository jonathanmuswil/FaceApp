package com.google.android.gms.vision;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Pair;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Keep
public class EngineManager
{
  private static final ConcurrentMap<Pair<String, String>, EngineManager> zzai = new ConcurrentHashMap();
  private final String zzaj;
  
  private EngineManager(String paramString1, String paramString2)
  {
    paramString1 = paramString2;
    if (paramString2.startsWith("lib")) {
      paramString1 = paramString2.substring(3);
    }
    paramString2 = paramString1;
    if (paramString1.endsWith(".so")) {
      paramString2 = paramString1.substring(0, paramString1.length() - 3);
    }
    this.zzaj = paramString2;
  }
  
  public static EngineManager zza(String paramString1, String paramString2)
  {
    Pair localPair = Pair.create(paramString1, paramString2);
    if (zzai.get(localPair) != null) {
      return (EngineManager)zzai.get(localPair);
    }
    zzai.putIfAbsent(localPair, new EngineManager(paramString1, paramString2));
    return (EngineManager)zzai.get(localPair);
  }
  
  public static File zzc(Context paramContext)
  {
    return new File("assets/");
  }
  
  public final boolean zza(Context paramContext)
  {
    try
    {
      System.loadLibrary(this.zzaj);
      return true;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public final void zzb(Context paramContext)
  {
    try
    {
      paramContext = new java/lang/UnsupportedOperationException;
      paramContext.<init>("SDK might not contain correct files, please re-download.");
      throw paramContext;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/EngineManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */