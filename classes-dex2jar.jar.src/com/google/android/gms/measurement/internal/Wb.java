package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class wb
  implements Runnable
{
  wb(jb paramjb, boolean paramBoolean1, boolean paramBoolean2, uc paramuc1, pc parampc, uc paramuc2) {}
  
  public final void run()
  {
    n localn = jb.d(this.f);
    if (localn == null)
    {
      this.f.c().s().a("Discarding data. Failed to send conditional user property to service");
      return;
    }
    if (this.a)
    {
      jb localjb = this.f;
      uc localuc;
      if (this.b) {
        localuc = null;
      } else {
        localuc = this.c;
      }
      localjb.a(localn, localuc, this.d);
    }
    else
    {
      try
      {
        if (TextUtils.isEmpty(this.e.a)) {
          localn.a(this.c, this.d);
        } else {
          localn.a(this.c);
        }
      }
      catch (RemoteException localRemoteException)
      {
        this.f.c().s().a("Failed to send conditional user property to the service", localRemoteException);
      }
    }
    jb.e(this.f);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/wb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */