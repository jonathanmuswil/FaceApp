package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

final class maa
  implements qba
{
  private final Uri a;
  private final dba b;
  private final naa c;
  private final vba d;
  private final _Y e;
  private volatile boolean f;
  private boolean g;
  private long h;
  private long i;
  
  public maa(gaa paramgaa, Uri paramUri, dba paramdba, naa paramnaa, vba paramvba)
  {
    tba.a(paramUri);
    this.a = ((Uri)paramUri);
    tba.a(paramdba);
    this.b = ((dba)paramdba);
    tba.a(paramnaa);
    this.c = ((naa)paramnaa);
    this.d = paramvba;
    this.e = new _Y();
    this.g = true;
    this.i = -1L;
  }
  
  public final void a(long paramLong1, long paramLong2)
  {
    this.e.a = paramLong1;
    this.h = paramLong2;
    this.g = true;
  }
  
  public final boolean a()
  {
    return this.f;
  }
  
  public final void b()
  {
    this.f = true;
  }
  
  public final void c()
    throws IOException, InterruptedException
  {
    int k = 0;
    Object localObject4;
    for (;;)
    {
      if ((k != 0) || (this.f)) {
        return;
      }
      try
      {
        long l1 = this.e.a;
        Object localObject1 = this.b;
        localObject4 = new com/google/android/gms/internal/ads/gba;
        ((gba)localObject4).<init>(this.a, l1, -1L, gaa.f(this.j));
        this.i = ((dba)localObject1).a((gba)localObject4);
        if (this.i != -1L) {
          this.i += l1;
        }
        localObject4 = new com/google/android/gms/internal/ads/TY;
        ((TY)localObject4).<init>(this.b, l1, this.i);
        int m = k;
        try
        {
          localObject1 = this.c.a((VY)localObject4, this.b.getUri());
          int n = k;
          long l2 = l1;
          m = k;
          if (this.g)
          {
            m = k;
            ((UY)localObject1).a(l1, this.h);
            m = k;
            this.g = false;
            l2 = l1;
            n = k;
          }
          while (n == 0)
          {
            m = n;
            if (this.f) {
              break;
            }
            m = n;
            this.d.a();
            m = n;
            k = ((UY)localObject1).a((VY)localObject4, this.e);
            n = k;
            m = k;
            if (((VY)localObject4).getPosition() > gaa.g(this.j) + l2)
            {
              m = k;
              l2 = ((VY)localObject4).getPosition();
              m = k;
              this.d.c();
              m = k;
              gaa.i(this.j).post(gaa.h(this.j));
              n = k;
            }
          }
          if (n == 1)
          {
            k = 0;
          }
          else
          {
            this.e.a = ((VY)localObject4).getPosition();
            k = n;
          }
          Hba.a(this.b);
          continue;
        }
        finally
        {
          k = m;
        }
        if (k == 1) {
          break label370;
        }
      }
      finally
      {
        localObject4 = null;
      }
    }
    if (localObject4 != null) {
      this.e.a = ((VY)localObject4).getPosition();
    }
    label370:
    Hba.a(this.b);
    throw ((Throwable)localObject3);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/maa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */