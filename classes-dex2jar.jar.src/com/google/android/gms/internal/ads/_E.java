package com.google.android.gms.internal.ads;

@yh
public final class _e<I, O>
  implements am<I, O>
{
  private final He<O> a;
  private final Ie<I> b;
  private final String c;
  private final xm<Be> d;
  
  _e(xm<Be> paramxm, String paramString, Ie<I> paramIe, He<O> paramHe)
  {
    this.d = paramxm;
    this.c = paramString;
    this.b = paramIe;
    this.a = paramHe;
  }
  
  public final xm<O> b(I paramI)
    throws Exception
  {
    return gm.a(this.d, new af(this, paramI), Cm.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */