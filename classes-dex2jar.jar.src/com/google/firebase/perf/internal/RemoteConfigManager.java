package com.google.firebase.perf.internal;

import Av;
import Fy;
import Iv;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.annotation.Keep;
import android.util.Log;
import bv;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.remoteconfig.a;
import com.google.firebase.remoteconfig.f;
import ey;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nP;
import sz;
import tz;
import wz;

@Keep
public class RemoteConfigManager
{
  private static final RemoteConfigManager zzfd = new RemoteConfigManager();
  private static final long zzfe = TimeUnit.SECONDS.toMicros(30L);
  private static final long zzff = TimeUnit.HOURS.toMillis(12L);
  private boolean zzfg = false;
  private boolean zzfh = false;
  private long zzfi = 0L;
  private ey<wz<String, Long>> zzfj = Fy.a(C.a);
  private wz<String, Long> zzfk = wz.a();
  private a zzfl;
  private final Executor zzfm;
  private final Iv zzfn;
  
  private RemoteConfigManager()
  {
    this(new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, FirebasePerfProvider.zzcx());
  }
  
  private RemoteConfigManager(Executor paramExecutor, a parama, Iv paramIv)
  {
    this.zzfm = paramExecutor;
    this.zzfl = null;
    this.zzfn = paramIv;
  }
  
  private static sz<String> zza(Context paramContext, String paramString)
  {
    tz localtz = sz.q();
    int i = zzf(paramContext);
    Object localObject1 = new StringBuilder(String.valueOf(paramString).length() + 12);
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(":");
    ((StringBuilder)localObject1).append(i);
    String str = ((StringBuilder)localObject1).toString();
    for (i = 0; i < 3; i++)
    {
      localObject1 = String.valueOf(new String[] { str, paramString, "1.0.0.233854359" }[i]);
      if (((String)localObject1).length() != 0) {
        localObject1 = "_fireperf1:".concat((String)localObject1);
      } else {
        localObject1 = new String("_fireperf1:");
      }
      localObject1 = zzh((String)localObject1);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject1).length() + 16);
      localStringBuilder.append("fireperf:");
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append("_limits");
      localObject1 = localStringBuilder.toString();
      localStringBuilder = null;
      Object localObject2;
      try
      {
        localObject1 = bv.a(paramContext.getContentResolver(), (String)localObject1, null);
      }
      catch (SecurityException localSecurityException)
      {
        localObject2 = String.valueOf(localSecurityException.getMessage());
        if (((String)localObject2).length() != 0) {
          localObject2 = "Failed to fetch Gservices flag. SecurityException: ".concat((String)localObject2);
        } else {
          localObject2 = new String("Failed to fetch Gservices flag. SecurityException: ");
        }
        Log.w("FirebasePerformance", (String)localObject2);
        localObject2 = localStringBuilder;
      }
      if (localObject2 != null) {
        localtz.a(localObject2);
      }
    }
    return localtz.a();
  }
  
  public static RemoteConfigManager zzbz()
  {
    return zzfd;
  }
  
  private static wz<String, Long> zzc(List<String> paramList)
  {
    if (paramList == null) {
      return wz.a();
    }
    HashMap localHashMap = new HashMap();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String[] arrayOfString1 = ((String)paramList.next()).split(",");
      int i = arrayOfString1.length;
      int j = 0;
      while (j < i)
      {
        String[] arrayOfString2 = arrayOfString1[j].split(":");
        String str;
        if (arrayOfString2.length >= 2)
        {
          str = arrayOfString2[0].trim();
          if ((str.isEmpty()) || (localHashMap.containsKey(str))) {}
        }
        try
        {
          long l = Long.parseLong(arrayOfString2[1].trim());
          if (l >= 0L) {
            localHashMap.put(str, Long.valueOf(l));
          }
          j++;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;) {}
        }
      }
    }
    return wz.a(localHashMap);
  }
  
  @Deprecated
  private final wz<String, Long> zzca()
  {
    this.zzfk = ((wz)this.zzfj.get());
    this.zzfg = true;
    return this.zzfk;
  }
  
  private final void zzcc()
  {
    if (this.zzfg)
    {
      zzcd();
      return;
    }
    this.zzfm.execute(new D(this));
  }
  
  private final void zzcd()
  {
    if (!zzcf()) {
      return;
    }
    int i = this.zzfl.c().a();
    int j = 1;
    if (((i == 1) || (i == 0)) && (zzch()))
    {
      if (this.zzfn.n() <= zzfe) {
        j = 0;
      }
      if (j != 0) {
        zzce();
      }
    }
    else if ((i == -1) || (i == 2))
    {
      if (!this.zzfh)
      {
        this.zzfi = System.currentTimeMillis();
        this.zzfh = true;
        this.zzfm.execute(new b(this));
        return;
      }
      if (zzch()) {
        zzce();
      }
    }
  }
  
  private final void zzce()
  {
    this.zzfi = System.currentTimeMillis();
    nP localnP = this.zzfl.b();
    localnP.a(this.zzfm, new c(this));
    localnP.a(this.zzfm, new d(this));
  }
  
  private final boolean zzcf()
  {
    return (this.zzfl != null) && (((Long)this.zzfk.getOrDefault(Av.a("firebase_remote_config_enabled"), Long.valueOf(1L))).longValue() == 1L);
  }
  
  private final void zzcg()
  {
    if (this.zzfl.a()) {
      Log.d("FirebasePerformance", "Activated Firebase Remote Config Values for the Fireperf Namespace");
    }
  }
  
  private final boolean zzch()
  {
    return System.currentTimeMillis() - this.zzfi > zzff;
  }
  
  private static int zzf(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return 0;
  }
  
  private static String zzh(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("SHA-1").digest(paramString.getBytes());
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      int i = arrayOfByte.length;
      for (int j = 0; j < i; j++) {
        paramString.append(String.format("%02x", new Object[] { Byte.valueOf(arrayOfByte[j]) }));
      }
      paramString = paramString.toString();
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString) {}
    return null;
  }
  
  public final float zza(String paramString, float paramFloat)
  {
    zzcc();
    Object localObject = (Long)this.zzfk.get(Av.a(paramString));
    if (localObject != null) {
      paramFloat = (float)((Long)localObject).longValue();
    }
    float f = paramFloat;
    if (zzcf())
    {
      localObject = this.zzfl.a(Av.b(paramString));
      try
      {
        f = Float.parseFloat((String)localObject);
        f = 100.0F * f;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        f = paramFloat;
        if (!((String)localObject).isEmpty())
        {
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(localObject).length() + 46 + String.valueOf(paramString).length());
          localStringBuilder.append("Could not parse value: ");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(" for key: ");
          localStringBuilder.append(paramString);
          localStringBuilder.append(" into a float");
          Log.d("FirebasePerformance", localStringBuilder.toString());
          f = paramFloat;
        }
      }
    }
    return f;
  }
  
  public final void zza(a parama)
  {
    this.zzfl = parama;
  }
  
  public final long zzc(String paramString, long paramLong)
  {
    zzcc();
    long l = ((Long)this.zzfk.getOrDefault(Av.a(paramString), Long.valueOf(paramLong))).longValue();
    paramLong = l;
    if (zzcf())
    {
      String str = this.zzfl.a(Av.b(paramString));
      try
      {
        paramLong = ((float)Long.parseLong(str) * 100.0F);
        l = paramLong;
        int i = String.valueOf(paramString).length();
        l = paramLong;
        StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
        l = paramLong;
        localStringBuilder1.<init>(i + 74);
        l = paramLong;
        localStringBuilder1.append("Fetched value: ");
        l = paramLong;
        localStringBuilder1.append(paramLong);
        l = paramLong;
        localStringBuilder1.append(" for key: ");
        l = paramLong;
        localStringBuilder1.append(paramString);
        l = paramLong;
        localStringBuilder1.append(" from firebase remote config.");
        l = paramLong;
        Log.d("FirebasePerformance", localStringBuilder1.toString());
      }
      catch (NumberFormatException localNumberFormatException)
      {
        paramLong = l;
        if (!str.isEmpty())
        {
          StringBuilder localStringBuilder2 = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(paramString).length());
          localStringBuilder2.append("Could not parse value: ");
          localStringBuilder2.append(str);
          localStringBuilder2.append(" for key: ");
          localStringBuilder2.append(paramString);
          localStringBuilder2.append(" into a long");
          Log.d("FirebasePerformance", localStringBuilder2.toString());
          paramLong = l;
        }
      }
    }
    return paramLong;
  }
  
  public final void zzcb()
  {
    zzca();
    if (zzcf()) {
      zzcg();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/RemoteConfigManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */