package com.google.android.gms.internal.ads;

public final class _aa
{
  public final Kaa a;
  public final Xaa b;
  public final Object c;
  public final WX[] d;
  
  public _aa(Kaa paramKaa, Xaa paramXaa, Object paramObject, WX[] paramArrayOfWX)
  {
    this.a = paramKaa;
    this.b = paramXaa;
    this.c = paramObject;
    this.d = paramArrayOfWX;
  }
  
  public final boolean a(_aa param_aa, int paramInt)
  {
    if (param_aa == null) {
      return false;
    }
    return (Hba.a(this.b.a(paramInt), param_aa.b.a(paramInt))) && (Hba.a(this.d[paramInt], param_aa.d[paramInt]));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/_aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */