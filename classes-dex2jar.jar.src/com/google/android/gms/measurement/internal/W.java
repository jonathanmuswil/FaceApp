package com.google.android.gms.measurement.internal;

final class w
  implements Runnable
{
  w(v paramv, int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3) {}
  
  public final void run()
  {
    H localH = this.f.a.h();
    if (localH.l())
    {
      if (v.a(this.f) == 0) {
        if (this.f.g().o())
        {
          localObject1 = this.f;
          ((v)localObject1).a();
          v.a((v)localObject1, 'C');
        }
        else
        {
          localObject1 = this.f;
          ((v)localObject1).a();
          v.a((v)localObject1, 'c');
        }
      }
      if (v.b(this.f) < 0L)
      {
        localObject1 = this.f;
        v.a((v)localObject1, ((v)localObject1).g().l());
      }
      char c1 = "01VDIWEA?".charAt(this.a);
      char c2 = v.a(this.f);
      long l = v.b(this.f);
      Object localObject1 = v.a(true, this.b, this.c, this.d, this.e);
      Object localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 24);
      ((StringBuilder)localObject2).append("2");
      ((StringBuilder)localObject2).append(c1);
      ((StringBuilder)localObject2).append(c2);
      ((StringBuilder)localObject2).append(l);
      ((StringBuilder)localObject2).append(":");
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = localObject2;
      if (((String)localObject2).length() > 1024) {
        localObject1 = this.b.substring(0, 1024);
      }
      localH.e.a((String)localObject1, 1L);
      return;
    }
    this.f.a(6, "Persisted config not initialized. Not logging error/warn");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */