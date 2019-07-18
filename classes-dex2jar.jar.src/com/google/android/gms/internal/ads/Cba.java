package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class cba
  implements dba
{
  private final byte[] a;
  private Uri b;
  private int c;
  private int d;
  
  public cba(byte[] paramArrayOfByte)
  {
    tba.a(paramArrayOfByte);
    boolean bool;
    if (paramArrayOfByte.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    tba.a(bool);
    this.a = paramArrayOfByte;
  }
  
  public final long a(gba paramgba)
    throws IOException
  {
    this.b = paramgba.a;
    long l1 = paramgba.d;
    this.c = ((int)l1);
    long l2 = paramgba.e;
    long l3 = l2;
    if (l2 == -1L) {
      l3 = this.a.length - l1;
    }
    this.d = ((int)l3);
    int i = this.d;
    if ((i > 0) && (this.c + i <= this.a.length)) {
      return i;
    }
    i = this.c;
    l3 = paramgba.e;
    int j = this.a.length;
    paramgba = new StringBuilder(77);
    paramgba.append("Unsatisfiable range: [");
    paramgba.append(i);
    paramgba.append(", ");
    paramgba.append(l3);
    paramgba.append("], length: ");
    paramgba.append(j);
    throw new IOException(paramgba.toString());
  }
  
  public final void close()
    throws IOException
  {
    this.b = null;
  }
  
  public final Uri getUri()
  {
    return this.b;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = this.d;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(this.a, this.c, paramArrayOfByte, paramInt1, paramInt2);
    this.c += paramInt2;
    this.d -= paramInt2;
    return paramInt2;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */