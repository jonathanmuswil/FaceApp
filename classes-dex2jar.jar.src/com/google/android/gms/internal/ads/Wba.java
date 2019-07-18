package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class wba
{
  private int a;
  private long[] b = new long[32];
  
  public wba()
  {
    this(32);
  }
  
  private wba(int paramInt) {}
  
  public final int a()
  {
    return this.a;
  }
  
  public final long a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.a)) {
      return this.b[paramInt];
    }
    int i = this.a;
    StringBuilder localStringBuilder = new StringBuilder(46);
    localStringBuilder.append("Invalid index ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(", size is ");
    localStringBuilder.append(i);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final void a(long paramLong)
  {
    int i = this.a;
    long[] arrayOfLong = this.b;
    if (i == arrayOfLong.length) {
      this.b = Arrays.copyOf(arrayOfLong, i << 1);
    }
    arrayOfLong = this.b;
    i = this.a;
    this.a = (i + 1);
    arrayOfLong[i] = paramLong;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */