package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class gba
{
  public final Uri a;
  public final byte[] b;
  public final long c;
  public final long d;
  public final long e;
  public final String f;
  public final int g;
  
  public gba(Uri paramUri)
  {
    this(paramUri, 0);
  }
  
  private gba(Uri paramUri, int paramInt)
  {
    this(paramUri, 0L, -1L, null, 0);
  }
  
  private gba(Uri paramUri, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    this(paramUri, null, paramLong1, paramLong2, paramLong3, paramString, paramInt);
  }
  
  public gba(Uri paramUri, long paramLong1, long paramLong2, String paramString)
  {
    this(paramUri, paramLong1, paramLong1, paramLong2, paramString, 0);
  }
  
  private gba(Uri paramUri, long paramLong1, long paramLong2, String paramString, int paramInt)
  {
    this(paramUri, 0L, 0L, -1L, null, 0);
  }
  
  public gba(Uri paramUri, byte[] paramArrayOfByte, long paramLong1, long paramLong2, long paramLong3, String paramString, int paramInt)
  {
    boolean bool1 = true;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    tba.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    tba.a(bool2);
    boolean bool2 = bool1;
    if (paramLong3 <= 0L) {
      if (paramLong3 == -1L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    tba.a(bool2);
    this.a = paramUri;
    this.b = paramArrayOfByte;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramString;
    this.g = paramInt;
  }
  
  public final boolean a(int paramInt)
  {
    return (this.g & 0x1) == 1;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(this.a);
    String str2 = Arrays.toString(this.b);
    long l1 = this.c;
    long l2 = this.d;
    long l3 = this.e;
    String str3 = this.f;
    int i = this.g;
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 93 + String.valueOf(str2).length() + String.valueOf(str3).length());
    localStringBuilder.append("DataSpec[");
    localStringBuilder.append(str1);
    localStringBuilder.append(", ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(l1);
    localStringBuilder.append(", ");
    localStringBuilder.append(l2);
    localStringBuilder.append(", ");
    localStringBuilder.append(l3);
    localStringBuilder.append(", ");
    localStringBuilder.append(str3);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */