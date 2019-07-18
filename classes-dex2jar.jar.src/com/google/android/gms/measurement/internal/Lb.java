package com.google.android.gms.measurement.internal;

final class lb
  implements Runnable
{
  lb(jb paramjb, boolean paramBoolean, ec paramec, pc parampc) {}
  
  public final void run()
  {
    n localn = jb.d(this.d);
    if (localn == null)
    {
      this.d.c().s().a("Discarding data. Failed to set user attribute");
      return;
    }
    jb localjb = this.d;
    ec localec;
    if (this.a) {
      localec = null;
    } else {
      localec = this.b;
    }
    localjb.a(localn, localec, this.c);
    jb.e(this.d);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/lb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */