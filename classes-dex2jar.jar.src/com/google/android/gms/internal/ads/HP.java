package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

@yh
@TargetApi(16)
public final class hp
  extends Lo
  implements Ao
{
  private so d;
  private String e;
  private boolean f;
  private Exception g;
  private boolean h;
  
  public hp(wn paramwn, vn paramvn)
  {
    super(paramwn);
    this.d = new so(paramwn.getContext(), paramvn);
    this.d.a(this);
  }
  
  private static String b(String paramString, Exception paramException)
  {
    String str = paramException.getClass().getCanonicalName();
    paramException = paramException.getMessage();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(str).length() + String.valueOf(paramException).length());
    localStringBuilder.append(paramString);
    localStringBuilder.append("/");
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    localStringBuilder.append(paramException);
    return localStringBuilder.toString();
  }
  
  private final void d(String paramString)
  {
    try
    {
      this.f = true;
      notify();
      a();
      String str = this.e;
      if (str != null)
      {
        str = b(str);
        Exception localException = this.g;
        if (localException != null)
        {
          a(this.e, str, "badUrl", b(paramString, localException));
          return;
        }
        a(this.e, str, "externalAbort", "Programmatic precache abort.");
      }
      return;
    }
    finally {}
  }
  
  public final void a()
  {
    so localso = this.d;
    if (localso != null)
    {
      localso.a(null);
      this.d.c();
    }
    super.a();
  }
  
  public final void a(int paramInt) {}
  
  public final void a(String paramString, Exception paramException)
  {
    this.g = paramException;
    Tl.c("Precache error", paramException);
    d(paramString);
  }
  
  public final void a(boolean paramBoolean, long paramLong)
  {
    wn localwn = (wn)this.c.get();
    if (localwn != null) {
      Cm.a.execute(new ip(localwn, paramBoolean, paramLong));
    }
  }
  
  public final boolean a(String paramString)
  {
    return a(paramString, new String[] { paramString });
  }
  
  public final boolean a(String paramString, String[] paramArrayOfString)
  {
    this.e = paramString;
    String str1 = b(paramString);
    Object localObject1 = "error";
    Object localObject2 = localObject1;
    try
    {
      Uri[] arrayOfUri = new Uri[paramArrayOfString.length];
      int i = 0;
      for (;;)
      {
        localObject2 = localObject1;
        int j = paramArrayOfString.length;
        if (i < j)
        {
          localObject6 = localObject1;
          try
          {
            arrayOfUri[i] = Uri.parse(paramArrayOfString[i]);
            i++;
          }
          catch (Exception paramArrayOfString)
          {
            localObject2 = localObject6;
            break label696;
          }
        }
      }
      localObject2 = localObject1;
      this.d.a(arrayOfUri, this.b);
      localObject2 = localObject1;
      paramArrayOfString = (wn)this.c.get();
      if (paramArrayOfString != null)
      {
        localObject6 = localObject1;
        paramArrayOfString.a(str1, this);
      }
      localObject2 = localObject1;
      localObject6 = k.j();
      localObject2 = localObject1;
      long l1 = ((e)localObject6).a();
      localObject2 = localObject1;
      paramArrayOfString = ra.F;
      localObject2 = localObject1;
      long l2 = ((Long)Kea.e().a(paramArrayOfString)).longValue();
      localObject2 = localObject1;
      paramArrayOfString = ra.E;
      localObject2 = localObject1;
      long l3 = ((Long)Kea.e().a(paramArrayOfString)).longValue() * 1000L;
      localObject2 = localObject1;
      paramArrayOfString = ra.D;
      localObject2 = localObject1;
      long l4 = ((Integer)Kea.e().a(paramArrayOfString)).intValue();
      long l5 = -1L;
      paramArrayOfString = (String[])localObject1;
      for (;;)
      {
        localObject2 = paramArrayOfString;
        for (;;)
        {
          boolean bool;
          try
          {
            if (((e)localObject6).a() - l1 <= l3)
            {
              bool = this.f;
              if (bool) {
                localObject1 = paramArrayOfString;
              }
            }
          }
          finally {}
          try
          {
            if (this.g != null) {
              paramArrayOfString = "badUrl";
            }
            try
            {
              throw this.g;
            }
            finally
            {
              long l6;
              long l7;
              break label676;
            }
            localObject2 = "externalAbort";
            paramArrayOfString = (String[])localObject2;
            localObject1 = new java/io/IOException;
            paramArrayOfString = (String[])localObject2;
            ((IOException)localObject1).<init>("Abort requested before buffering finished. ");
            paramArrayOfString = (String[])localObject2;
            throw ((Throwable)localObject1);
          }
          finally
          {
            for (;;)
            {
              paramArrayOfString = (String[])localObject1;
            }
          }
        }
        bool = this.h;
        if (bool)
        {
          localObject1 = paramArrayOfString;
        }
        else
        {
          localObject2 = this.d.f();
          if (localObject2 == null) {
            break label549;
          }
        }
        try
        {
          l6 = ((AX)localObject2).getDuration();
          if (l6 > 0L)
          {
            l7 = ((AX)localObject2).b();
            if (l7 != l5)
            {
              if (l7 > 0L) {
                bool = true;
              } else {
                bool = false;
              }
              a(paramString, str1, l7, l6, bool, so.d(), so.e());
              l5 = l7;
            }
            if (l7 >= l6) {
              a(paramString, str1, l6);
            } else {
              if ((this.d.b() < l4) || (l7 <= 0L)) {
                break label468;
              }
            }
            return true;
            label468:
            l7 = l5;
            l5 = l2;
            l2 = l7;
          }
          else
          {
            l7 = l2;
            l2 = l5;
            l5 = l7;
          }
          try
          {
            wait(l5);
            l7 = l5;
            l5 = l2;
            l2 = l7;
          }
          catch (InterruptedException paramArrayOfString)
          {
            localObject2 = "interrupted";
            paramArrayOfString = (String[])localObject2;
            localObject1 = new java/io/IOException;
            paramArrayOfString = (String[])localObject2;
            ((IOException)localObject1).<init>("Wait interrupted.");
            paramArrayOfString = (String[])localObject2;
            throw ((Throwable)localObject1);
          }
          label549:
          localObject2 = "exoPlayerReleased";
          paramArrayOfString = (String[])localObject2;
          localObject1 = new java/io/IOException;
          paramArrayOfString = (String[])localObject2;
          ((IOException)localObject1).<init>("ExoPlayer was released during preloading.");
          paramArrayOfString = (String[])localObject2;
          throw ((Throwable)localObject1);
        }
        finally
        {
          break label676;
        }
      }
      localObject2 = "downloadTimeout";
      paramArrayOfString = (String[])localObject2;
      localObject6 = new java/io/IOException;
      paramArrayOfString = (String[])localObject2;
      localObject1 = new java/lang/StringBuilder;
      paramArrayOfString = (String[])localObject2;
      ((StringBuilder)localObject1).<init>(47);
      paramArrayOfString = (String[])localObject2;
      ((StringBuilder)localObject1).append("Timeout reached. Limit: ");
      paramArrayOfString = (String[])localObject2;
      ((StringBuilder)localObject1).append(l3);
      paramArrayOfString = (String[])localObject2;
      ((StringBuilder)localObject1).append(" ms");
      paramArrayOfString = (String[])localObject2;
      ((IOException)localObject6).<init>(((StringBuilder)localObject1).toString());
      paramArrayOfString = (String[])localObject2;
      throw ((Throwable)localObject6);
    }
    catch (Exception paramArrayOfString)
    {
      label676:
      label696:
      localObject1 = paramArrayOfString.getMessage();
      Object localObject6 = new StringBuilder(String.valueOf(paramString).length() + 34 + String.valueOf(localObject1).length());
      ((StringBuilder)localObject6).append("Failed to preload url ");
      ((StringBuilder)localObject6).append(paramString);
      ((StringBuilder)localObject6).append(" Exception: ");
      ((StringBuilder)localObject6).append((String)localObject1);
      Tl.d(((StringBuilder)localObject6).toString());
      a();
      a(paramString, str1, str2, b(str2, paramArrayOfString));
    }
    localObject1 = paramArrayOfString;
    localObject6 = paramArrayOfString;
    throw ((Throwable)localObject5);
    return false;
  }
  
  protected final String b(String paramString)
  {
    paramString = String.valueOf(super.b(paramString));
    if (paramString.length() != 0) {
      return "cache:".concat(paramString);
    }
    return new String("cache:");
  }
  
  public final void b()
  {
    d(null);
  }
  
  public final void b(int paramInt)
  {
    this.d.g().c(paramInt);
  }
  
  public final void b(int paramInt1, int paramInt2) {}
  
  public final so c()
  {
    try
    {
      this.h = true;
      notify();
      this.d.a(null);
      so localso = this.d;
      this.d = null;
      return localso;
    }
    finally {}
  }
  
  public final void c(int paramInt)
  {
    this.d.g().d(paramInt);
  }
  
  public final void d(int paramInt)
  {
    this.d.g().a(paramInt);
  }
  
  public final void e(int paramInt)
  {
    this.d.g().b(paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */