package com.google.android.gms.internal.ads;

public final class vea<T>
{
  public final T a;
  public final fz b;
  public final xb c;
  public boolean d = false;
  
  private vea(xb paramxb)
  {
    this.a = null;
    this.b = null;
    this.c = paramxb;
  }
  
  private vea(T paramT, fz paramfz)
  {
    this.a = paramT;
    this.b = paramfz;
    this.c = null;
  }
  
  public static <T> vea<T> a(xb paramxb)
  {
    return new vea(paramxb);
  }
  
  public static <T> vea<T> a(T paramT, fz paramfz)
  {
    return new vea(paramT, paramfz);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */