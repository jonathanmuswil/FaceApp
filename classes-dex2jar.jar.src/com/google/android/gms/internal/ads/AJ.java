package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class aj
  extends Ni
{
  private final String a;
  private final int b;
  
  public aj(Ki paramKi)
  {
    this(str, i);
  }
  
  public aj(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final int I()
    throws RemoteException
  {
    return this.b;
  }
  
  public final String getType()
    throws RemoteException
  {
    return this.a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */