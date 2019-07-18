package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.lang.ref.WeakReference;

@yh
@TargetApi(16)
public abstract class dp
  extends Lo
{
  private final Bn d = new Bn();
  private boolean e;
  private String f = null;
  private boolean g;
  
  public dp(wn paramwn)
  {
    super(paramwn);
    this.d.a(new ep(this));
  }
  
  public void a()
  {
    this.d.d();
    super.a();
  }
  
  public final boolean a(String paramString)
  {
    Object localObject1 = c(paramString);
    String str1 = b(paramString);
    Object localObject2 = "error";
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = localObject2;
    Object localObject12 = localObject8;
    try
    {
      if (this.d.a((RV)localObject1))
      {
        localObject10 = localObject2;
        localObject12 = localObject8;
        hV localhV = this.d.e();
        if (localhV != null)
        {
          localObject10 = localObject2;
          localObject12 = localObject8;
          localObject1 = (wn)this.c.get();
          if (localObject1 != null)
          {
            localObject10 = localObject2;
            localObject12 = localObject8;
            ((wn)localObject1).a(str1, this);
          }
          localObject10 = localObject2;
          localObject12 = localObject8;
          e locale = k.j();
          localObject10 = localObject2;
          localObject12 = localObject8;
          long l1 = locale.a();
          localObject10 = localObject2;
          localObject12 = localObject8;
          localObject1 = ra.F;
          localObject10 = localObject2;
          localObject12 = localObject8;
          long l2 = ((Long)Kea.e().a((ga)localObject1)).longValue();
          localObject10 = localObject2;
          localObject12 = localObject8;
          localObject1 = ra.E;
          localObject10 = localObject2;
          localObject12 = localObject8;
          long l3 = ((Long)Kea.e().a((ga)localObject1)).longValue() * 1000L;
          localObject10 = localObject2;
          localObject12 = localObject8;
          localObject1 = ra.D;
          localObject10 = localObject2;
          localObject12 = localObject8;
          long l4 = ((Integer)Kea.e().a((ga)localObject1)).intValue();
          long l5 = -1L;
          for (;;)
          {
            localObject10 = localObject2;
            localObject12 = localObject8;
            localObject1 = localObject2;
            localObject13 = localObject7;
            try
            {
              if (locale.a() - l1 <= l3)
              {
                localObject1 = localObject2;
                localObject13 = localObject7;
                if (this.e)
                {
                  localObject1 = localObject2;
                  localObject13 = localObject7;
                  if (!TextUtils.isEmpty(this.f))
                  {
                    localObject1 = "badUrl";
                    localObject10 = localObject1;
                    localObject12 = localObject6;
                  }
                }
              }
              try
              {
                localObject2 = this.f;
                break label343;
                localObject1 = "externalAbort";
                localObject2 = localObject9;
                label343:
                localObject10 = localObject1;
                localObject12 = localObject2;
                localObject13 = new java/io/IOException;
                localObject10 = localObject1;
                localObject12 = localObject2;
                ((IOException)localObject13).<init>("Abort requested before buffering finished. ");
                throw ((Throwable)localObject13);
              }
              finally
              {
                long l6;
                long l7;
                boolean bool;
                int i;
                break label807;
              }
              localObject1 = localObject2;
              localObject13 = localObject7;
              if (this.g)
              {
                localObject1 = localObject2;
                localObject13 = localObject7;
              }
              else
              {
                localObject1 = localObject2;
                localObject13 = localObject7;
                l6 = localhV.getDuration();
                if (l6 <= 0L) {
                  break label569;
                }
                localObject1 = localObject2;
                localObject13 = localObject7;
                l7 = localhV.b();
                if (l7 != l5)
                {
                  if (l7 > 0L) {
                    bool = true;
                  } else {
                    bool = false;
                  }
                  localObject1 = localObject2;
                  localObject13 = localObject7;
                  a(paramString, str1, l7, l6, bool);
                  l5 = l7;
                }
                if (l7 >= l6)
                {
                  localObject1 = localObject2;
                  localObject13 = localObject7;
                  a(paramString, str1, l6);
                  localObject1 = localObject2;
                  localObject13 = localObject7;
                }
                else
                {
                  localObject1 = localObject2;
                  localObject13 = localObject7;
                  c();
                  if ((0L < l4) || (l7 <= 0L)) {
                    break label566;
                  }
                  localObject1 = localObject2;
                  localObject13 = localObject7;
                }
              }
              return true;
              label566:
              label569:
              localObject1 = localObject2;
              localObject13 = localObject7;
              localObject10 = localObject2;
              localObject12 = localObject8;
              try
              {
                Thread.sleep(l2);
              }
              catch (InterruptedException localInterruptedException)
              {
                localObject2 = "error";
                localObject1 = "Sleep interrupted.";
                localObject11 = localObject2;
                localObject12 = localObject1;
                localObject13 = new java/io/IOException;
                localObject11 = localObject2;
                localObject12 = localObject1;
                ((IOException)localObject13).<init>("Interrupted sleep.");
                throw ((Throwable)localObject13);
              }
              localObject2 = "downloadTimeout";
              localObject11 = localObject2;
              localObject12 = localObject6;
              localObject1 = Long.toString(l3);
              localObject11 = localObject2;
              localObject12 = localObject6;
              i = String.valueOf(localObject1).length();
              localObject11 = localObject2;
              localObject12 = localObject6;
              localObject13 = new java/lang/StringBuilder;
              localObject11 = localObject2;
              localObject12 = localObject6;
              ((StringBuilder)localObject13).<init>(i + 27);
              localObject11 = localObject2;
              localObject12 = localObject6;
              ((StringBuilder)localObject13).append("Timeout reached. Limit: ");
              localObject11 = localObject2;
              localObject12 = localObject6;
              ((StringBuilder)localObject13).append((String)localObject1);
              localObject11 = localObject2;
              localObject12 = localObject6;
              ((StringBuilder)localObject13).append(" ms");
              localObject11 = localObject2;
              localObject12 = localObject6;
              localObject1 = ((StringBuilder)localObject13).toString();
              try
              {
                localObject11 = new java/io/IOException;
                ((IOException)localObject11).<init>("Timed out while buffering.");
                throw ((Throwable)localObject11);
              }
              finally
              {
                localObject11 = "downloadTimeout";
                localObject12 = localObject1;
              }
              localObject1 = localObject11;
            }
            finally
            {
              localObject12 = localObject13;
              localObject11 = localObject1;
            }
          }
          label807:
          localObject13 = localObject12;
          throw ((Throwable)localObject5);
        }
        str2 = "playerFailed";
        localObject1 = "ExoPlayer not created";
        localObject11 = str2;
        localObject12 = localObject1;
        a();
        localObject11 = str2;
        localObject12 = localObject1;
        localObject13 = new java/io/IOException;
        localObject11 = str2;
        localObject12 = localObject1;
        ((IOException)localObject13).<init>("Failed to get ExoPlayer");
        localObject11 = str2;
        localObject12 = localObject1;
        throw ((Throwable)localObject13);
      }
      localObject1 = "playerFailed";
      String str2 = "ExoPlayer prepare failed";
      localObject11 = localObject1;
      localObject12 = str2;
      a();
      localObject11 = localObject1;
      localObject12 = str2;
      Object localObject13 = new java/io/IOException;
      localObject11 = localObject1;
      localObject12 = str2;
      ((IOException)localObject13).<init>("Failed to prepare AdExoPlayerHelper");
      localObject11 = localObject1;
      localObject12 = str2;
      throw ((Throwable)localObject13);
    }
    catch (IOException localIOException)
    {
      Object localObject11;
      String str3 = localIOException.getMessage();
      localObject1 = new StringBuilder(String.valueOf(paramString).length() + 34 + String.valueOf(str3).length());
      ((StringBuilder)localObject1).append("Failed to preload url ");
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(" Exception: ");
      ((StringBuilder)localObject1).append(str3);
      Tl.d(((StringBuilder)localObject1).toString());
      a(paramString, str1, (String)localObject11, (String)localObject12);
    }
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
    try
    {
      this.e = true;
      return;
    }
    finally {}
  }
  
  protected abstract int c();
  
  protected abstract RV c(String paramString);
  
  public final void d()
  {
    try
    {
      this.g = true;
      this.d.a();
      return;
    }
    finally {}
  }
  
  public final Bn e()
  {
    return this.d;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */