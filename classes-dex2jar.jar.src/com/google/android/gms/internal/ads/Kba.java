package com.google.android.gms.internal.ads;

import java.io.IOException;

public class kba
  extends IOException
{
  private final int a;
  private final gba b;
  
  public kba(IOException paramIOException, gba paramgba, int paramInt)
  {
    super(paramIOException);
    this.b = paramgba;
    this.a = paramInt;
  }
  
  public kba(String paramString, gba paramgba, int paramInt)
  {
    super(paramString);
    this.b = paramgba;
    this.a = 1;
  }
  
  public kba(String paramString, IOException paramIOException, gba paramgba, int paramInt)
  {
    super(paramString, paramIOException);
    this.b = paramgba;
    this.a = 1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */