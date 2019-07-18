package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;

public final class zba
{
  public static final byte[] a = { 0, 0, 0, 1 };
  private static final float[] b = { 1.0F, 1.0F, 1.0909091F, 0.90909094F, 1.4545455F, 1.2121212F, 2.1818182F, 1.8181819F, 2.909091F, 2.4242425F, 1.6363636F, 1.3636364F, 1.939394F, 1.6161616F, 1.3333334F, 1.5F, 2.0F };
  private static final Object c = new Object();
  private static int[] d = new int[10];
  
  public static Aba a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte = new Dba(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte.b(8);
    paramInt1 = paramArrayOfByte.a(8);
    paramArrayOfByte.b(16);
    int i = paramArrayOfByte.b();
    int j = 1;
    int k;
    boolean bool1;
    if ((paramInt1 != 100) && (paramInt1 != 110) && (paramInt1 != 122) && (paramInt1 != 244) && (paramInt1 != 44) && (paramInt1 != 83) && (paramInt1 != 86) && (paramInt1 != 118) && (paramInt1 != 128) && (paramInt1 != 138))
    {
      k = 1;
      bool1 = false;
    }
    else
    {
      m = paramArrayOfByte.b();
      if (m == 3) {
        bool1 = paramArrayOfByte.a();
      } else {
        bool1 = false;
      }
      paramArrayOfByte.b();
      paramArrayOfByte.b();
      paramArrayOfByte.b(1);
      if (paramArrayOfByte.a())
      {
        if (m != 3) {
          paramInt2 = 8;
        } else {
          paramInt2 = 12;
        }
        for (k = 0; k < paramInt2; k++) {
          if (paramArrayOfByte.a())
          {
            if (k < 6) {
              n = 16;
            } else {
              n = 64;
            }
            i1 = 0;
            i2 = 8;
            i3 = 8;
            while (i1 < n)
            {
              paramInt1 = i2;
              if (i2 != 0) {
                paramInt1 = (paramArrayOfByte.c() + i3 + 256) % 256;
              }
              if (paramInt1 != 0) {
                i3 = paramInt1;
              }
              i1++;
              i2 = paramInt1;
            }
          }
        }
      }
      k = m;
    }
    int i2 = paramArrayOfByte.b();
    int m = paramArrayOfByte.b();
    if (m == 0)
    {
      paramInt1 = paramArrayOfByte.b() + 4;
    }
    else
    {
      if (m == 1)
      {
        bool2 = paramArrayOfByte.a();
        paramArrayOfByte.c();
        paramArrayOfByte.c();
        long l = paramArrayOfByte.b();
        for (paramInt1 = 0; paramInt1 < l; paramInt1++) {
          paramArrayOfByte.b();
        }
        paramInt2 = 0;
        break label368;
      }
      paramInt1 = 0;
    }
    boolean bool2 = false;
    paramInt2 = paramInt1;
    label368:
    paramArrayOfByte.b();
    paramArrayOfByte.b(1);
    int n = paramArrayOfByte.b();
    paramInt1 = paramArrayOfByte.b();
    boolean bool3 = paramArrayOfByte.a();
    if (!bool3) {
      paramArrayOfByte.b(1);
    }
    paramArrayOfByte.b(1);
    int i3 = n + 1 << 4;
    int i1 = (true - bool3) * (paramInt1 + 1) << 4;
    n = i3;
    paramInt1 = i1;
    if (paramArrayOfByte.a())
    {
      int i4 = paramArrayOfByte.b();
      int i5 = paramArrayOfByte.b();
      int i6 = paramArrayOfByte.b();
      int i7 = paramArrayOfByte.b();
      if (k == 0)
      {
        k = true - bool3;
        paramInt1 = 1;
      }
      else
      {
        if (k == 3) {
          paramInt1 = 1;
        } else {
          paramInt1 = 2;
        }
        n = j;
        if (k == 1) {
          n = 2;
        }
        k = (true - bool3) * n;
      }
      n = i3 - (i4 + i5) * paramInt1;
      paramInt1 = i1 - (i6 + i7) * k;
    }
    float f1 = 1.0F;
    float f2;
    if ((paramArrayOfByte.a()) && (paramArrayOfByte.a()))
    {
      k = paramArrayOfByte.a(8);
      if (k == 255)
      {
        k = paramArrayOfByte.a(16);
        i1 = paramArrayOfByte.a(16);
        f2 = f1;
        if (k != 0)
        {
          f2 = f1;
          if (i1 != 0) {
            f2 = k / i1;
          }
        }
      }
      else
      {
        paramArrayOfByte = b;
        if (k < paramArrayOfByte.length)
        {
          f2 = paramArrayOfByte[k];
        }
        else
        {
          paramArrayOfByte = new StringBuilder(46);
          paramArrayOfByte.append("Unexpected aspect_ratio_idc value: ");
          paramArrayOfByte.append(k);
          Log.w("NalUnitUtil", paramArrayOfByte.toString());
        }
      }
    }
    else
    {
      f2 = 1.0F;
    }
    return new Aba(i, n, paramInt1, f2, bool1, bool3, i2 + 4, m, paramInt2, bool2);
  }
  
  public static void a(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.position();
    int j = 0;
    int k = 0;
    for (;;)
    {
      int m = j + 1;
      if (m >= i) {
        break;
      }
      int n = paramByteBuffer.get(j) & 0xFF;
      int i1;
      if (k == 3)
      {
        i1 = k;
        if (n == 1)
        {
          i1 = k;
          if ((paramByteBuffer.get(m) & 0x1F) == 7)
          {
            ByteBuffer localByteBuffer = paramByteBuffer.duplicate();
            localByteBuffer.position(j - 3);
            localByteBuffer.limit(i);
            paramByteBuffer.position(0);
            paramByteBuffer.put(localByteBuffer);
          }
        }
      }
      else
      {
        i1 = k;
        if (n == 0) {
          i1 = k + 1;
        }
      }
      k = i1;
      if (n != 0) {
        k = 0;
      }
      j = m;
    }
    paramByteBuffer.clear();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */