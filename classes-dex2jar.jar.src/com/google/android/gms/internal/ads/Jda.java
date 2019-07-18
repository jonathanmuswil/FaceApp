package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.common.internal.c;
import java.io.InputStream;
import java.util.concurrent.Future;

@yh
public final class jda
{
  private cda a;
  private boolean b;
  private final Context c;
  private final Object d = new Object();
  
  jda(Context paramContext)
  {
    this.c = paramContext;
  }
  
  private final void a()
  {
    synchronized (this.d)
    {
      if (this.a == null) {
        return;
      }
      this.a.a();
      this.a = null;
      Binder.flushPendingCommands();
      return;
    }
  }
  
  final Future<InputStream> a(dda arg1)
  {
    lda locallda = new lda(this);
    mda localmda = new mda(this, ???, locallda);
    qda localqda = new qda(this, locallda);
    synchronized (this.d)
    {
      cda localcda = new com/google/android/gms/internal/ads/cda;
      localcda.<init>(this.c, k.q().b(), localmda, localqda);
      this.a = localcda;
      this.a.m();
      return locallda;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */