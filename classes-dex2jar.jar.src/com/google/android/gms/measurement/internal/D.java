package com.google.android.gms.measurement.internal;

final class d
  implements Runnable
{
  d(c paramc, ya paramya) {}
  
  public final void run()
  {
    this.a.a();
    if (tc.a())
    {
      this.a.n().a(this);
      return;
    }
    boolean bool = this.b.c();
    c.a(this.b, 0L);
    if (bool) {
      this.b.b();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */