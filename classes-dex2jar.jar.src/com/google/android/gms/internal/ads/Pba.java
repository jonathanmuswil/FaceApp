package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

@SuppressLint({"HandlerLeak"})
final class pba<T extends qba>
  extends Handler
  implements Runnable
{
  private final T a;
  private final oba<T> b;
  public final int c;
  private final long d;
  private IOException e;
  private int f;
  private volatile Thread g;
  private volatile boolean h;
  
  public pba(Looper paramLooper, T paramT, oba<T> paramoba, int paramInt, long paramLong)
  {
    super(paramT);
    this.a = paramoba;
    this.b = paramInt;
    this.c = paramLong;
    Object localObject;
    this.d = localObject;
  }
  
  private final void a()
  {
    this.e = null;
    nba.b(this.i).execute(nba.a(this.i));
  }
  
  private final void b()
  {
    nba.a(this.i, null);
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    IOException localIOException = this.e;
    if ((localIOException != null) && (this.f > paramInt)) {
      throw localIOException;
    }
  }
  
  public final void a(long paramLong)
  {
    boolean bool;
    if (nba.a(this.i) == null) {
      bool = true;
    } else {
      bool = false;
    }
    tba.b(bool);
    nba.a(this.i, this);
    if (paramLong > 0L)
    {
      sendEmptyMessageDelayed(0, paramLong);
      return;
    }
    a();
  }
  
  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    this.e = null;
    if (hasMessages(0))
    {
      removeMessages(0);
      if (!paramBoolean) {
        sendEmptyMessage(1);
      }
    }
    else
    {
      this.a.b();
      if (this.g != null) {
        this.g.interrupt();
      }
    }
    if (paramBoolean)
    {
      b();
      long l = SystemClock.elapsedRealtime();
      this.b.a(this.a, l, l - this.d, true);
    }
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (this.h) {
      return;
    }
    int j = paramMessage.what;
    if (j == 0)
    {
      a();
      return;
    }
    if (j != 4)
    {
      b();
      long l1 = SystemClock.elapsedRealtime();
      long l2 = l1 - this.d;
      if (this.a.a())
      {
        this.b.a(this.a, l1, l2, false);
        return;
      }
      j = paramMessage.what;
      if (j != 1)
      {
        if (j != 2)
        {
          if (j == 3)
          {
            this.e = ((IOException)paramMessage.obj);
            j = this.b.a(this.a, l1, l2, this.e);
            if (j == 3)
            {
              nba.a(this.i, this.e);
              return;
            }
            if (j != 2)
            {
              if (j == 1) {
                j = 1;
              } else {
                j = this.f + 1;
              }
              this.f = j;
              a(Math.min((this.f - 1) * 1000, 5000));
            }
          }
          return;
        }
        this.b.a(this.a, l1, l2);
        return;
      }
      this.b.a(this.a, l1, l2, false);
      return;
    }
    throw ((Error)paramMessage.obj);
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 164	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   4: putfield 103	com/google/android/gms/internal/ads/pba:g	Ljava/lang/Thread;
    //   7: aload_0
    //   8: getfield 38	com/google/android/gms/internal/ads/pba:a	Lcom/google/android/gms/internal/ads/qba;
    //   11: invokeinterface 130 1 0
    //   16: ifne +69 -> 85
    //   19: aload_0
    //   20: getfield 38	com/google/android/gms/internal/ads/pba:a	Lcom/google/android/gms/internal/ads/qba;
    //   23: invokevirtual 170	java/lang/Object:getClass	()Ljava/lang/Class;
    //   26: invokevirtual 176	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   29: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   32: astore_1
    //   33: aload_1
    //   34: invokevirtual 186	java/lang/String:length	()I
    //   37: ifeq +13 -> 50
    //   40: ldc -68
    //   42: aload_1
    //   43: invokevirtual 192	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   46: astore_1
    //   47: goto +13 -> 60
    //   50: new 178	java/lang/String
    //   53: dup
    //   54: ldc -68
    //   56: invokespecial 195	java/lang/String:<init>	(Ljava/lang/String;)V
    //   59: astore_1
    //   60: aload_1
    //   61: invokestatic 199	com/google/android/gms/internal/ads/Gba:a	(Ljava/lang/String;)V
    //   64: aload_0
    //   65: getfield 38	com/google/android/gms/internal/ads/pba:a	Lcom/google/android/gms/internal/ads/qba;
    //   68: invokeinterface 201 1 0
    //   73: invokestatic 202	com/google/android/gms/internal/ads/Gba:a	()V
    //   76: goto +9 -> 85
    //   79: astore_1
    //   80: invokestatic 202	com/google/android/gms/internal/ads/Gba:a	()V
    //   83: aload_1
    //   84: athrow
    //   85: aload_0
    //   86: getfield 87	com/google/android/gms/internal/ads/pba:h	Z
    //   89: ifne +9 -> 98
    //   92: aload_0
    //   93: iconst_2
    //   94: invokevirtual 97	android/os/Handler:sendEmptyMessage	(I)Z
    //   97: pop
    //   98: return
    //   99: astore_1
    //   100: ldc -52
    //   102: ldc -50
    //   104: aload_1
    //   105: invokestatic 211	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   108: pop
    //   109: aload_0
    //   110: getfield 87	com/google/android/gms/internal/ads/pba:h	Z
    //   113: ifne +12 -> 125
    //   116: aload_0
    //   117: iconst_4
    //   118: aload_1
    //   119: invokevirtual 215	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   122: invokevirtual 218	android/os/Message:sendToTarget	()V
    //   125: aload_1
    //   126: athrow
    //   127: astore_1
    //   128: ldc -52
    //   130: ldc -36
    //   132: aload_1
    //   133: invokestatic 211	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   136: pop
    //   137: aload_0
    //   138: getfield 87	com/google/android/gms/internal/ads/pba:h	Z
    //   141: ifne +19 -> 160
    //   144: aload_0
    //   145: iconst_3
    //   146: new 222	com/google/android/gms/internal/ads/rba
    //   149: dup
    //   150: aload_1
    //   151: invokespecial 225	com/google/android/gms/internal/ads/rba:<init>	(Ljava/lang/Throwable;)V
    //   154: invokevirtual 215	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   157: invokevirtual 218	android/os/Message:sendToTarget	()V
    //   160: return
    //   161: astore_1
    //   162: ldc -52
    //   164: ldc -29
    //   166: aload_1
    //   167: invokestatic 211	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   170: pop
    //   171: aload_0
    //   172: getfield 87	com/google/android/gms/internal/ads/pba:h	Z
    //   175: ifne +19 -> 194
    //   178: aload_0
    //   179: iconst_3
    //   180: new 222	com/google/android/gms/internal/ads/rba
    //   183: dup
    //   184: aload_1
    //   185: invokespecial 225	com/google/android/gms/internal/ads/rba:<init>	(Ljava/lang/Throwable;)V
    //   188: invokevirtual 215	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   191: invokevirtual 218	android/os/Message:sendToTarget	()V
    //   194: return
    //   195: astore_1
    //   196: aload_0
    //   197: getfield 38	com/google/android/gms/internal/ads/pba:a	Lcom/google/android/gms/internal/ads/qba;
    //   200: invokeinterface 130 1 0
    //   205: invokestatic 79	com/google/android/gms/internal/ads/tba:b	(Z)V
    //   208: aload_0
    //   209: getfield 87	com/google/android/gms/internal/ads/pba:h	Z
    //   212: ifne +9 -> 221
    //   215: aload_0
    //   216: iconst_2
    //   217: invokevirtual 97	android/os/Handler:sendEmptyMessage	(I)Z
    //   220: pop
    //   221: return
    //   222: astore_1
    //   223: aload_0
    //   224: getfield 87	com/google/android/gms/internal/ads/pba:h	Z
    //   227: ifne +12 -> 239
    //   230: aload_0
    //   231: iconst_3
    //   232: aload_1
    //   233: invokevirtual 215	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   236: invokevirtual 218	android/os/Message:sendToTarget	()V
    //   239: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	pba
    //   32	29	1	str	String
    //   79	5	1	localObject	Object
    //   99	27	1	localError	Error
    //   127	24	1	localOutOfMemoryError	OutOfMemoryError
    //   161	24	1	localException	Exception
    //   195	1	1	localInterruptedException	InterruptedException
    //   222	11	1	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   64	73	79	finally
    //   0	47	99	java/lang/Error
    //   50	60	99	java/lang/Error
    //   60	64	99	java/lang/Error
    //   73	76	99	java/lang/Error
    //   80	85	99	java/lang/Error
    //   85	98	99	java/lang/Error
    //   0	47	127	java/lang/OutOfMemoryError
    //   50	60	127	java/lang/OutOfMemoryError
    //   60	64	127	java/lang/OutOfMemoryError
    //   73	76	127	java/lang/OutOfMemoryError
    //   80	85	127	java/lang/OutOfMemoryError
    //   85	98	127	java/lang/OutOfMemoryError
    //   0	47	161	java/lang/Exception
    //   50	60	161	java/lang/Exception
    //   60	64	161	java/lang/Exception
    //   73	76	161	java/lang/Exception
    //   80	85	161	java/lang/Exception
    //   85	98	161	java/lang/Exception
    //   0	47	195	java/lang/InterruptedException
    //   50	60	195	java/lang/InterruptedException
    //   60	64	195	java/lang/InterruptedException
    //   73	76	195	java/lang/InterruptedException
    //   80	85	195	java/lang/InterruptedException
    //   85	98	195	java/lang/InterruptedException
    //   0	47	222	java/io/IOException
    //   50	60	222	java/io/IOException
    //   60	64	222	java/io/IOException
    //   73	76	222	java/io/IOException
    //   80	85	222	java/io/IOException
    //   85	98	222	java/io/IOException
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */