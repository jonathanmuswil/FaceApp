package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

final class pda
  extends PushbackInputStream
{
  pda(mda parammda, InputStream paramInputStream, int paramInt)
  {
    super(paramInputStream, 1);
  }
  
  public final void close()
    throws IOException
  {
    try
    {
      jda.a(this.a.c);
      super.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */