package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class vb
  implements Runnable
{
  vb(jb paramjb, boolean paramBoolean1, boolean paramBoolean2, k paramk, pc parampc, String paramString) {}
  
  public final void run()
  {
    n localn = jb.d(this.f);
    if (localn == null)
    {
      this.f.c().s().a("Discarding data. Failed to send event to service");
      return;
    }
    if (this.a)
    {
      jb localjb = this.f;
      k localk;
      if (this.b) {
        localk = null;
      } else {
        localk = this.c;
      }
      localjb.a(localn, localk, this.d);
    }
    else
    {
      try
      {
        if (TextUtils.isEmpty(this.e)) {
          localn.a(this.c, this.d);
        } else {
          localn.a(this.c, this.e, this.f.c().B());
        }
      }
      catch (RemoteException localRemoteException)
      {
        this.f.c().s().a("Failed to send event to the service", localRemoteException);
      }
    }
    jb.e(this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */