package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import fq;
import hq;
import java.io.InputStream;

@yh
public final class ada
  extends fq
{
  public static final Parcelable.Creator<ada> CREATOR = new bda();
  private ParcelFileDescriptor a;
  
  public ada()
  {
    this(null);
  }
  
  public ada(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.a = paramParcelFileDescriptor;
  }
  
  private final ParcelFileDescriptor z()
  {
    try
    {
      ParcelFileDescriptor localParcelFileDescriptor = this.a;
      return localParcelFileDescriptor;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final boolean wa()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 26	com/google/android/gms/internal/ads/ada:a	Landroid/os/ParcelFileDescriptor;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	ada
    //   6	2	1	localParcelFileDescriptor	ParcelFileDescriptor
    //   22	4	1	localObject	Object
    //   12	7	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = hq.a(paramParcel);
    hq.a(paramParcel, 2, z(), paramInt, false);
    hq.a(paramParcel, i);
  }
  
  public final InputStream y()
  {
    try
    {
      Object localObject1 = this.a;
      if (localObject1 == null) {
        return null;
      }
      localObject1 = new android/os/ParcelFileDescriptor$AutoCloseInputStream;
      ((ParcelFileDescriptor.AutoCloseInputStream)localObject1).<init>(this.a);
      this.a = null;
      return (InputStream)localObject1;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ada.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */