package com.google.android.gms.internal.ads;

import Fq;
import Gq;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@yh
public final class rh
  implements wh
{
  private static final Object a = new Object();
  private static wh b = null;
  private static wh c = null;
  private final Object d = new Object();
  private final Context e;
  private final WeakHashMap<Thread, Boolean> f = new WeakHashMap();
  private final ExecutorService g = Executors.newCachedThreadPool();
  private final Yl h;
  
  private rh(Context paramContext)
  {
    this(paramContext, Yl.y());
  }
  
  private rh(Context paramContext, Yl paramYl)
  {
    Context localContext = paramContext;
    if (paramContext.getApplicationContext() != null) {
      localContext = paramContext.getApplicationContext();
    }
    this.e = localContext;
    this.h = paramYl;
  }
  
  private final Uri.Builder a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    boolean bool;
    try
    {
      bool = Gq.a(this.e).a();
    }
    catch (Throwable localThrowable1)
    {
      Tl.b("Error fetching instant app info", localThrowable1);
      bool = false;
    }
    String str2;
    try
    {
      String str1 = this.e.getPackageName();
    }
    catch (Throwable localThrowable2)
    {
      Tl.d("Cannot obtain package name, proceeding.");
      str2 = "unknown";
    }
    Uri.Builder localBuilder = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(bool)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
    String str3 = Build.MANUFACTURER;
    String str4 = Build.MODEL;
    if (!str4.startsWith(str3))
    {
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
      localStringBuilder.append(str3);
      localStringBuilder.append(" ");
      localStringBuilder.append(str4);
      str4 = localStringBuilder.toString();
    }
    paramString2 = localBuilder.appendQueryParameter("device", str4).appendQueryParameter("js", this.h.a).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", paramString1).appendQueryParameter("stacktrace", paramString2).appendQueryParameter("eids", TextUtils.join(",", ra.a())).appendQueryParameter("exceptionkey", paramString3).appendQueryParameter("cl", "237950021").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", Kea.f()).appendQueryParameter("sampling_rate", Integer.toString(paramInt));
    paramString1 = ra.He;
    return paramString2.appendQueryParameter("pb_tm", String.valueOf(Kea.e().a(paramString1)));
  }
  
  public static wh a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
      {
        Object localObject2 = ra.l;
        if (((Boolean)Kea.e().a((ga)localObject2)).booleanValue())
        {
          localObject2 = new com/google/android/gms/internal/ads/rh;
          ((rh)localObject2).<init>(paramContext);
          b = (wh)localObject2;
        }
        else
        {
          paramContext = new com/google/android/gms/internal/ads/xh;
          paramContext.<init>();
          b = paramContext;
        }
      }
      return b;
    }
  }
  
  public static wh a(Context paramContext, Yl arg1)
  {
    synchronized (a)
    {
      if (c == null)
      {
        Object localObject2 = ra.l;
        if (((Boolean)Kea.e().a((ga)localObject2)).booleanValue())
        {
          localObject2 = new com/google/android/gms/internal/ads/rh;
          ((rh)localObject2).<init>(paramContext, ???);
          paramContext = Looper.getMainLooper().getThread();
          if (paramContext != null) {
            synchronized (((rh)localObject2).d)
            {
              ((rh)localObject2).f.put(paramContext, Boolean.valueOf(true));
              ??? = paramContext.getUncaughtExceptionHandler();
              uh localuh = new com/google/android/gms/internal/ads/uh;
              localuh.<init>((rh)localObject2, ???);
              paramContext.setUncaughtExceptionHandler(localuh);
            }
          }
          ??? = Thread.getDefaultUncaughtExceptionHandler();
          paramContext = new com/google/android/gms/internal/ads/sh;
          paramContext.<init>((rh)localObject2, ???);
          Thread.setDefaultUncaughtExceptionHandler(paramContext);
          c = (wh)localObject2;
        }
        else
        {
          paramContext = new com/google/android/gms/internal/ads/xh;
          paramContext.<init>();
          c = paramContext;
        }
      }
      return c;
    }
  }
  
  protected final void a(Thread paramThread, Throwable paramThrowable)
  {
    int i = 1;
    if (paramThrowable != null)
    {
      paramThread = paramThrowable;
      j = 0;
      int n;
      for (int k = 0; paramThread != null; k = n)
      {
        StackTraceElement[] arrayOfStackTraceElement = paramThread.getStackTrace();
        int m = arrayOfStackTraceElement.length;
        n = j;
        int i1 = 0;
        j = k;
        k = n;
        for (n = i1; n < m; n++)
        {
          StackTraceElement localStackTraceElement = arrayOfStackTraceElement[n];
          if (Hl.b(localStackTraceElement.getClassName())) {
            k = 1;
          }
          if (rh.class.getName().equals(localStackTraceElement.getClassName())) {
            j = 1;
          }
        }
        paramThread = paramThread.getCause();
        n = j;
        j = k;
      }
      if ((j != 0) && (k == 0))
      {
        j = i;
        break label140;
      }
    }
    int j = 0;
    label140:
    if (j != 0) {
      a(paramThrowable, "", 1.0F);
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    a(paramThrowable, paramString, 1.0F);
  }
  
  public final void a(Throwable paramThrowable, String paramString, float paramFloat)
  {
    if (Hl.a(paramThrowable) == null) {
      return;
    }
    Object localObject1 = paramThrowable.getClass().getName();
    Object localObject2 = new StringWriter();
    pQ.a(paramThrowable, new PrintWriter((Writer)localObject2));
    localObject2 = ((StringWriter)localObject2).toString();
    double d1 = Math.random();
    double d2 = paramFloat;
    int i = 0;
    int j = 1;
    int k;
    if (d1 < d2) {
      k = 1;
    } else {
      k = 0;
    }
    if (paramFloat > 0.0F) {
      j = (int)(1.0F / paramFloat);
    }
    if (k != 0)
    {
      paramThrowable = new ArrayList();
      paramThrowable.add(a((String)localObject1, (String)localObject2, paramString, j).toString());
      j = paramThrowable.size();
      k = i;
      while (k < j)
      {
        paramString = paramThrowable.get(k);
        k++;
        paramString = (String)paramString;
        localObject1 = new Xl();
        this.g.submit(new vh(this, (Xl)localObject1, paramString));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */