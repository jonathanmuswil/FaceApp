package com.google.android.gms.internal.ads;

import java.io.IOException;

@yh
final class ao
  implements UW
{
  private final UW a;
  private final long b;
  private final UW c;
  private long d;
  
  ao(UW paramUW1, int paramInt, UW paramUW2)
  {
    this.a = paramUW1;
    this.b = paramInt;
    this.c = paramUW2;
  }
  
  public final long a(VW paramVW)
    throws IOException
  {
    long l1 = paramVW.c;
    long l2 = this.b;
    VW localVW1;
    if (l1 >= l2)
    {
      localVW1 = null;
    }
    else
    {
      long l3 = paramVW.d;
      if (l3 != -1L) {
        l2 = Math.min(l3, l2 - l1);
      } else {
        l2 -= l1;
      }
      localVW1 = new VW(paramVW.a, l1, l2, null);
    }
    l2 = paramVW.d;
    VW localVW2;
    if ((l2 != -1L) && (paramVW.c + l2 <= this.b))
    {
      localVW2 = null;
    }
    else
    {
      l1 = Math.max(this.b, paramVW.c);
      l2 = paramVW.d;
      if (l2 != -1L) {
        l2 = Math.min(l2, paramVW.c + l2 - this.b);
      } else {
        l2 = -1L;
      }
      localVW2 = new VW(paramVW.a, l1, l2, null);
    }
    l1 = 0L;
    if (localVW1 != null) {
      l2 = this.a.a(localVW1);
    } else {
      l2 = 0L;
    }
    if (localVW2 != null) {
      l1 = this.c.a(localVW2);
    }
    this.d = paramVW.c;
    if ((l2 != -1L) && (l1 != -1L)) {
      return l2 + l1;
    }
    return -1L;
  }
  
  public final void close()
    throws IOException
  {
    this.a.close();
    this.c.close();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    long l1 = this.d;
    long l2 = this.b;
    int i;
    if (l1 < l2)
    {
      i = (int)Math.min(paramInt2, l2 - l1);
      i = this.a.read(paramArrayOfByte, paramInt1, i);
      this.d += i;
    }
    else
    {
      i = 0;
    }
    int j = i;
    if (this.d >= this.b)
    {
      paramInt1 = this.c.read(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
      j = i + paramInt1;
      this.d += paramInt1;
    }
    return j;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */