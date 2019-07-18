package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public abstract interface dba
{
  public abstract long a(gba paramgba)
    throws IOException;
  
  public abstract void close()
    throws IOException;
  
  public abstract Uri getUri();
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */