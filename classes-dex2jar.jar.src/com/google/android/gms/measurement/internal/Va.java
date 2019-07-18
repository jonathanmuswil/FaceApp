package com.google.android.gms.measurement.internal;

final class va
  implements Runnable
{
  va(da paramda, String paramString1, String paramString2, String paramString3, long paramLong) {}
  
  public final void run()
  {
    Object localObject = this.a;
    if (localObject == null)
    {
      da.a(this.e).s().C().a(this.b, null);
      return;
    }
    localObject = new fb(this.c, (String)localObject, this.d);
    da.a(this.e).s().C().a(this.b, (fb)localObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/va.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */