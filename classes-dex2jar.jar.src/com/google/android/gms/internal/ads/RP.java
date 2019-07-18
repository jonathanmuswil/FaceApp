package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class rp
  extends zT
{
  private ByteBuffer l;
  
  public rp(String paramString)
  {
    super(paramString);
  }
  
  public final void a(ByteBuffer paramByteBuffer)
  {
    this.l = paramByteBuffer;
    paramByteBuffer.position(paramByteBuffer.position() + paramByteBuffer.remaining());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */