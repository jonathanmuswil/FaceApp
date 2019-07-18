package com.google.android.gms.internal.ads;

public final class re
  extends Mm<Be>
{
  private final Object c = new Object();
  private final we d;
  private boolean e;
  
  public re(we paramwe)
  {
    this.d = paramwe;
  }
  
  public final void c()
  {
    synchronized (this.c)
    {
      if (this.e) {
        return;
      }
      this.e = true;
      Object localObject2 = new com/google/android/gms/internal/ads/se;
      ((se)localObject2).<init>(this);
      Object localObject4 = new com/google/android/gms/internal/ads/Km;
      ((Km)localObject4).<init>();
      a((Lm)localObject2, (Jm)localObject4);
      localObject4 = new com/google/android/gms/internal/ads/te;
      ((te)localObject4).<init>(this);
      localObject2 = new com/google/android/gms/internal/ads/ve;
      ((ve)localObject2).<init>(this);
      a((Lm)localObject4, (Jm)localObject2);
      return;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */