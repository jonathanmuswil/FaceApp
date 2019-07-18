package com.google.android.gms.internal.ads;

final class sh
  implements Thread.UncaughtExceptionHandler
{
  sh(rh paramrh, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  /* Error */
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	com/google/android/gms/internal/ads/sh:b	Lcom/google/android/gms/internal/ads/rh;
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual 28	com/google/android/gms/internal/ads/rh:a	(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //   9: aload_0
    //   10: getfield 16	com/google/android/gms/internal/ads/sh:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull +39 -> 54
    //   18: aload_3
    //   19: aload_1
    //   20: aload_2
    //   21: invokeinterface 30 3 0
    //   26: return
    //   27: astore_3
    //   28: goto +27 -> 55
    //   31: astore_3
    //   32: ldc 32
    //   34: invokestatic 37	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;)V
    //   37: aload_0
    //   38: getfield 16	com/google/android/gms/internal/ads/sh:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   41: astore_3
    //   42: aload_3
    //   43: ifnull +11 -> 54
    //   46: aload_3
    //   47: aload_1
    //   48: aload_2
    //   49: invokeinterface 30 3 0
    //   54: return
    //   55: aload_0
    //   56: getfield 16	com/google/android/gms/internal/ads/sh:a	Ljava/lang/Thread$UncaughtExceptionHandler;
    //   59: astore 4
    //   61: aload 4
    //   63: ifnull +12 -> 75
    //   66: aload 4
    //   68: aload_1
    //   69: aload_2
    //   70: invokeinterface 30 3 0
    //   75: aload_3
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	sh
    //   0	77	1	paramThread	Thread
    //   0	77	2	paramThrowable	Throwable
    //   13	6	3	localUncaughtExceptionHandler1	Thread.UncaughtExceptionHandler
    //   27	1	3	localObject	Object
    //   31	1	3	localThrowable	Throwable
    //   41	35	3	localUncaughtExceptionHandler2	Thread.UncaughtExceptionHandler
    //   59	8	4	localUncaughtExceptionHandler3	Thread.UncaughtExceptionHandler
    // Exception table:
    //   from	to	target	type
    //   0	9	27	finally
    //   32	37	27	finally
    //   0	9	31	java/lang/Throwable
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */