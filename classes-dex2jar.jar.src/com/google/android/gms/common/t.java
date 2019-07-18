package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class t
  extends r
{
  private static final WeakReference<byte[]> b = new WeakReference(null);
  private WeakReference<byte[]> c = b;
  
  t(byte[] paramArrayOfByte)
  {
    super(paramArrayOfByte);
  }
  
  final byte[] a()
  {
    try
    {
      Object localObject1 = (byte[])this.c.get();
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = b();
        localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(localObject2);
        this.c = ((WeakReference)localObject1);
      }
      return (byte[])localObject2;
    }
    finally {}
  }
  
  protected abstract byte[] b();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */