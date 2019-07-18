package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class wg
  extends FilterInputStream
{
  private final long a;
  private long b;
  
  wg(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.a = paramLong;
  }
  
  final long a()
  {
    return this.a - this.b;
  }
  
  public final int read()
    throws IOException
  {
    int i = super.read();
    if (i != -1) {
      this.b += 1L;
    }
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      this.b += paramInt1;
    }
    return paramInt1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */