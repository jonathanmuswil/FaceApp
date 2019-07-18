package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

final class xb
  implements Runnable
{
  xb(jb paramjb, AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, pc parampc) {}
  
  public final void run()
  {
    try
    {
      synchronized (this.a)
      {
        n localn = jb.d(this.f);
        if (localn == null)
        {
          this.f.c().s().a("Failed to get conditional properties", v.a(this.b), this.c, this.d);
          this.a.set(Collections.emptyList());
        }
        try
        {
          this.a.notify();
          return;
        }
        finally {}
        if (TextUtils.isEmpty(this.b)) {
          this.a.set(localn.a(this.c, this.d, this.e));
        } else {
          this.a.set(localn.a(this.b, this.c, this.d));
        }
        jb.e(this.f);
        this.a.notify();
      }
      this.a.notify();
    }
    catch (RemoteException localRemoteException)
    {
      this.f.c().s().a("Failed to get conditional properties", v.a(this.b), this.c, localRemoteException);
      this.a.set(Collections.emptyList());
      this.a.notify();
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */