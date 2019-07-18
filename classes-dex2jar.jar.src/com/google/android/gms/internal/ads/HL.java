package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.Map;

@yh
public final class hl
{
  private static Kca a;
  private static final Object b = new Object();
  @Deprecated
  private static final ll<Void> c = new il();
  
  public hl(Context paramContext)
  {
    if (paramContext.getApplicationContext() != null) {
      paramContext = paramContext.getApplicationContext();
    }
    a(paramContext);
  }
  
  private static Kca a(Context paramContext)
  {
    synchronized (b)
    {
      if (a == null)
      {
        ra.a(paramContext);
        Object localObject2 = ra.zd;
        if (((Boolean)Kea.e().a((ga)localObject2)).booleanValue())
        {
          paramContext = Zk.a(paramContext);
        }
        else
        {
          localObject2 = new com/google/android/gms/internal/ads/Ud;
          Object localObject3 = new com/google/android/gms/internal/ads/ui;
          ((ui)localObject3).<init>();
          ((Ud)localObject2).<init>((td)localObject3);
          localObject3 = new java/io/File;
          ((File)localObject3).<init>(paramContext.getCacheDir(), "volley");
          paramContext = new com/google/android/gms/internal/ads/Kca;
          vf localvf = new com/google/android/gms/internal/ads/vf;
          localvf.<init>((File)localObject3);
          paramContext.<init>(localvf, (fY)localObject2);
          paramContext.a();
        }
        a = paramContext;
      }
      paramContext = a;
      return paramContext;
    }
  }
  
  public static xm<HZ> a(String paramString)
  {
    Hm localHm = new Hm();
    a.a(new ol(paramString, localHm));
    return localHm;
  }
  
  public final xm<String> a(int paramInt, String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    nl localnl = new nl(null);
    jl localjl = new jl(this, paramString, localnl);
    Ll localLl = new Ll(null);
    paramMap = new kl(this, paramInt, paramString, localnl, localjl, paramArrayOfByte, paramMap, localLl);
    if (Ll.a()) {
      try
      {
        localLl.a(paramString, "GET", paramMap.a(), paramMap.h());
      }
      catch (a paramString)
      {
        Tl.d(paramString.getMessage());
      }
    }
    a.a(paramMap);
    return localnl;
  }
  
  public final xm<String> a(String paramString, Map<String, String> paramMap)
  {
    return a(0, paramString, paramMap, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */