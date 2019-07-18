package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.t;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public final class va<R extends l>
  extends p<R>
  implements m<R>
{
  private o<? super R, ? extends l> a;
  private va<? extends l> b;
  private volatile n<? super R> c;
  private final Object d;
  private Status e;
  private final WeakReference<f> f;
  private final xa g;
  
  private final void a(Status paramStatus)
  {
    synchronized (this.d)
    {
      this.e = paramStatus;
      b(this.e);
      return;
    }
  }
  
  private final void b(Status paramStatus)
  {
    synchronized (this.d)
    {
      if (this.a != null)
      {
        paramStatus = this.a.a(paramStatus);
        t.a(paramStatus, "onFailure must not return null");
        this.b.a(paramStatus);
      }
      else if (b())
      {
        this.c.a(paramStatus);
      }
      return;
    }
  }
  
  private static void b(l paraml)
  {
    if ((paraml instanceof i)) {
      try
      {
        ((i)paraml).a();
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        paraml = String.valueOf(paraml);
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paraml).length() + 18);
        localStringBuilder.append("Unable to release ");
        localStringBuilder.append(paraml);
        Log.w("TransformedResultImpl", localStringBuilder.toString(), localRuntimeException);
      }
    }
  }
  
  private final boolean b()
  {
    f localf = (f)this.f.get();
    return (this.c != null) && (localf != null);
  }
  
  final void a()
  {
    this.c = null;
  }
  
  public final void a(R paramR)
  {
    synchronized (this.d)
    {
      if (paramR.w().B())
      {
        if (this.a != null)
        {
          ExecutorService localExecutorService = qa.a();
          wa localwa = new com/google/android/gms/common/api/internal/wa;
          localwa.<init>(this, paramR);
          localExecutorService.submit(localwa);
        }
        else if (b())
        {
          this.c.b(paramR);
        }
      }
      else
      {
        a(paramR.w());
        b(paramR);
      }
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */