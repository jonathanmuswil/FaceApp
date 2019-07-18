package com.google.android.gms.internal.ads;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.util.concurrent.Callable;

@yh
public final class zl
{
  /* Error */
  public static <T> T a(android.content.Context paramContext, Callable<T> paramCallable)
  {
    // Byte code:
    //   0: invokestatic 15	android/os/StrictMode:getThreadPolicy	()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore_2
    //   4: new 17	android/os/StrictMode$ThreadPolicy$Builder
    //   7: astore_3
    //   8: aload_3
    //   9: aload_2
    //   10: invokespecial 21	android/os/StrictMode$ThreadPolicy$Builder:<init>	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   13: aload_3
    //   14: invokevirtual 25	android/os/StrictMode$ThreadPolicy$Builder:permitDiskReads	()Landroid/os/StrictMode$ThreadPolicy$Builder;
    //   17: invokevirtual 28	android/os/StrictMode$ThreadPolicy$Builder:permitDiskWrites	()Landroid/os/StrictMode$ThreadPolicy$Builder;
    //   20: invokevirtual 31	android/os/StrictMode$ThreadPolicy$Builder:build	()Landroid/os/StrictMode$ThreadPolicy;
    //   23: invokestatic 34	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   26: aload_1
    //   27: invokeinterface 40 1 0
    //   32: astore_1
    //   33: aload_2
    //   34: invokestatic 34	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   37: aload_1
    //   38: areturn
    //   39: astore_0
    //   40: goto +28 -> 68
    //   43: astore_1
    //   44: ldc 42
    //   46: aload_1
    //   47: invokestatic 48	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   50: aload_0
    //   51: invokestatic 53	com/google/android/gms/internal/ads/rh:a	(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/wh;
    //   54: aload_1
    //   55: ldc 55
    //   57: invokeinterface 60 3 0
    //   62: aload_2
    //   63: invokestatic 34	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   66: aconst_null
    //   67: areturn
    //   68: aload_2
    //   69: invokestatic 34	android/os/StrictMode:setThreadPolicy	(Landroid/os/StrictMode$ThreadPolicy;)V
    //   72: aload_0
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	paramContext	android.content.Context
    //   0	74	1	paramCallable	Callable<T>
    //   3	66	2	localThreadPolicy	StrictMode.ThreadPolicy
    //   7	7	3	localBuilder	StrictMode.ThreadPolicy.Builder
    // Exception table:
    //   from	to	target	type
    //   4	33	39	finally
    //   44	62	39	finally
    //   4	33	43	java/lang/Throwable
  }
  
  public static <T> T a(Callable<T> paramCallable)
    throws Exception
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.getThreadPolicy();
    try
    {
      StrictMode.ThreadPolicy.Builder localBuilder = new android/os/StrictMode$ThreadPolicy$Builder;
      localBuilder.<init>(localThreadPolicy);
      StrictMode.setThreadPolicy(localBuilder.permitDiskReads().permitDiskWrites().build());
      paramCallable = paramCallable.call();
      return paramCallable;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */