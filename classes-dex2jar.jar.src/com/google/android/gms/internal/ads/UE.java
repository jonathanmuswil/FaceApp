package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class ue
{
  private static final Comparator<byte[]> a = new Ve();
  private final List<byte[]> b = new ArrayList();
  private final List<byte[]> c = new ArrayList(64);
  private int d = 0;
  private final int e = 4096;
  
  public ue(int paramInt) {}
  
  private final void a()
  {
    try
    {
      while (this.d > this.e)
      {
        byte[] arrayOfByte = (byte[])this.b.remove(0);
        this.c.remove(arrayOfByte);
        this.d -= arrayOfByte.length;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        if (paramArrayOfByte.length <= this.e)
        {
          this.b.add(paramArrayOfByte);
          int i = Collections.binarySearch(this.c, paramArrayOfByte, a);
          int j = i;
          if (i < 0) {
            j = -i - 1;
          }
          this.c.add(j, paramArrayOfByte);
          this.d += paramArrayOfByte.length;
          a();
          return;
        }
      }
      finally {}
    }
  }
  
  public final byte[] a(int paramInt)
  {
    int i = 0;
    try
    {
      while (i < this.c.size())
      {
        arrayOfByte = (byte[])this.c.get(i);
        if (arrayOfByte.length >= paramInt)
        {
          this.d -= arrayOfByte.length;
          this.c.remove(i);
          this.b.remove(arrayOfByte);
          return arrayOfByte;
        }
        i++;
      }
      byte[] arrayOfByte = new byte[paramInt];
      return arrayOfByte;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */