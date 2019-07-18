package com.google.android.gms.ads.identifier;

import Vq;
import Wq;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.t;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import zq;

public class AdvertisingIdClient
{
  private final Context mContext;
  private com.google.android.gms.common.a zze;
  private Vq zzf;
  private boolean zzg;
  private final Object zzh = new Object();
  private a zzi;
  private final boolean zzj;
  private final long zzk;
  
  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L, false, false);
  }
  
  private AdvertisingIdClient(Context paramContext, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    t.a(paramContext);
    Context localContext = paramContext;
    if (paramBoolean1)
    {
      localContext = paramContext.getApplicationContext();
      if (localContext == null) {
        localContext = paramContext;
      }
    }
    this.mContext = localContext;
    this.zzg = false;
    this.zzk = paramLong;
    this.zzj = paramBoolean2;
  }
  
  /* Error */
  public static Info getAdvertisingIdInfo(Context paramContext)
    throws IOException, IllegalStateException, g, h
  {
    // Byte code:
    //   0: new 71	com/google/android/gms/ads/identifier/b
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 73	com/google/android/gms/ads/identifier/b:<init>	(Landroid/content/Context;)V
    //   8: astore_1
    //   9: aload_1
    //   10: ldc 75
    //   12: iconst_0
    //   13: invokevirtual 78	com/google/android/gms/ads/identifier/b:a	(Ljava/lang/String;Z)Z
    //   16: istore_2
    //   17: aload_1
    //   18: ldc 80
    //   20: fconst_0
    //   21: invokevirtual 83	com/google/android/gms/ads/identifier/b:a	(Ljava/lang/String;F)F
    //   24: fstore_3
    //   25: aload_1
    //   26: ldc 85
    //   28: ldc 87
    //   30: invokevirtual 90	com/google/android/gms/ads/identifier/b:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   33: astore 4
    //   35: new 2	com/google/android/gms/ads/identifier/AdvertisingIdClient
    //   38: dup
    //   39: aload_0
    //   40: ldc2_w 91
    //   43: iload_2
    //   44: aload_1
    //   45: ldc 94
    //   47: iconst_0
    //   48: invokevirtual 78	com/google/android/gms/ads/identifier/b:a	(Ljava/lang/String;Z)Z
    //   51: invokespecial 32	com/google/android/gms/ads/identifier/AdvertisingIdClient:<init>	(Landroid/content/Context;JZZ)V
    //   54: astore_0
    //   55: invokestatic 100	android/os/SystemClock:elapsedRealtime	()J
    //   58: lstore 5
    //   60: aload_0
    //   61: iconst_0
    //   62: invokespecial 104	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Z)V
    //   65: aload_0
    //   66: invokevirtual 108	com/google/android/gms/ads/identifier/AdvertisingIdClient:getInfo	()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;
    //   69: astore_1
    //   70: aload_0
    //   71: aload_1
    //   72: iload_2
    //   73: fload_3
    //   74: invokestatic 100	android/os/SystemClock:elapsedRealtime	()J
    //   77: lload 5
    //   79: lsub
    //   80: aload 4
    //   82: aconst_null
    //   83: invokespecial 111	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z
    //   86: pop
    //   87: aload_0
    //   88: invokevirtual 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:finish	()V
    //   91: aload_1
    //   92: areturn
    //   93: astore 4
    //   95: goto +20 -> 115
    //   98: astore_1
    //   99: aload_0
    //   100: aconst_null
    //   101: iload_2
    //   102: fload_3
    //   103: ldc2_w 91
    //   106: aload 4
    //   108: aload_1
    //   109: invokespecial 111	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;ZFJLjava/lang/String;Ljava/lang/Throwable;)Z
    //   112: pop
    //   113: aload_1
    //   114: athrow
    //   115: aload_0
    //   116: invokevirtual 114	com/google/android/gms/ads/identifier/AdvertisingIdClient:finish	()V
    //   119: aload 4
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramContext	Context
    //   8	84	1	localObject	Object
    //   98	16	1	localThrowable	Throwable
    //   16	86	2	bool	boolean
    //   24	79	3	f	float
    //   33	48	4	str1	String
    //   93	27	4	str2	String
    //   58	20	5	l	long
    // Exception table:
    //   from	to	target	type
    //   55	87	93	finally
    //   99	115	93	finally
    //   55	87	98	java/lang/Throwable
  }
  
  public static boolean getIsAdIdFakeForDebugLogging(Context paramContext)
    throws IOException, g, h
  {
    b localb = new b(paramContext);
    paramContext = new AdvertisingIdClient(paramContext, -1L, localb.a("gads:ad_id_app_context:enabled", false), localb.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
    try
    {
      paramContext.zza(false);
      boolean bool = paramContext.zzb();
      return bool;
    }
    finally
    {
      paramContext.finish();
    }
  }
  
  public static void setShouldSkipGmsCoreVersionCheck(boolean paramBoolean) {}
  
  private static Vq zza(Context paramContext, com.google.android.gms.common.a parama)
    throws IOException
  {
    try
    {
      paramContext = Wq.a(parama.a(10000L, TimeUnit.MILLISECONDS));
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      throw new IOException(paramContext);
    }
    catch (InterruptedException paramContext)
    {
      throw new IOException("Interrupted exception");
    }
  }
  
  /* Error */
  private static com.google.android.gms.common.a zza(Context paramContext, boolean paramBoolean)
    throws IOException, g, h
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 160	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: ldc -94
    //   6: iconst_0
    //   7: invokevirtual 168	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   10: pop
    //   11: invokestatic 173	com/google/android/gms/common/f:a	()Lcom/google/android/gms/common/f;
    //   14: aload_0
    //   15: ldc -82
    //   17: invokevirtual 177	com/google/android/gms/common/f:a	(Landroid/content/Context;I)I
    //   20: istore_2
    //   21: iload_2
    //   22: ifeq +21 -> 43
    //   25: iload_2
    //   26: iconst_2
    //   27: if_icmpne +6 -> 33
    //   30: goto +13 -> 43
    //   33: new 61	java/io/IOException
    //   36: dup
    //   37: ldc -77
    //   39: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   42: athrow
    //   43: iload_1
    //   44: ifeq +9 -> 53
    //   47: ldc 119
    //   49: astore_3
    //   50: goto +6 -> 56
    //   53: ldc -75
    //   55: astore_3
    //   56: new 137	com/google/android/gms/common/a
    //   59: dup
    //   60: invokespecial 182	com/google/android/gms/common/a:<init>	()V
    //   63: astore 4
    //   65: new 184	android/content/Intent
    //   68: dup
    //   69: aload_3
    //   70: invokespecial 185	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   73: astore_3
    //   74: aload_3
    //   75: ldc -69
    //   77: invokevirtual 191	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   80: pop
    //   81: invokestatic 196	zq:a	()Lzq;
    //   84: aload_0
    //   85: aload_3
    //   86: aload 4
    //   88: iconst_1
    //   89: invokevirtual 199	zq:a	(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   92: istore_1
    //   93: iload_1
    //   94: ifeq +6 -> 100
    //   97: aload 4
    //   99: areturn
    //   100: new 61	java/io/IOException
    //   103: dup
    //   104: ldc -55
    //   106: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: astore_0
    //   111: new 61	java/io/IOException
    //   114: dup
    //   115: aload_0
    //   116: invokespecial 148	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   119: athrow
    //   120: astore_0
    //   121: new 65	com/google/android/gms/common/g
    //   124: dup
    //   125: bipush 9
    //   127: invokespecial 204	com/google/android/gms/common/g:<init>	(I)V
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramContext	Context
    //   0	131	1	paramBoolean	boolean
    //   20	8	2	i	int
    //   49	37	3	localObject	Object
    //   63	35	4	locala	com.google.android.gms.common.a
    // Exception table:
    //   from	to	target	type
    //   81	93	110	java/lang/Throwable
    //   0	11	120	android/content/pm/PackageManager$NameNotFoundException
  }
  
  private final void zza()
  {
    synchronized (this.zzh)
    {
      if (this.zzi != null) {
        this.zzi.c.countDown();
      }
    }
    try
    {
      this.zzi.join();
      if (this.zzk > 0L)
      {
        a locala = new com/google/android/gms/ads/identifier/AdvertisingIdClient$a;
        locala.<init>(this, this.zzk);
        this.zzi = locala;
      }
      return;
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  private final void zza(boolean paramBoolean)
    throws IOException, IllegalStateException, g, h
  {
    t.c("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.zzg) {
        finish();
      }
      this.zze = zza(this.mContext, this.zzj);
      this.zzf = zza(this.mContext, this.zze);
      this.zzg = true;
      if (paramBoolean) {
        zza();
      }
      return;
    }
    finally {}
  }
  
  private final boolean zza(Info paramInfo, boolean paramBoolean, float paramFloat, long paramLong, String paramString, Throwable paramThrowable)
  {
    if (Math.random() > paramFloat) {
      return false;
    }
    HashMap localHashMap = new HashMap();
    String str1 = "1";
    String str2;
    if (paramBoolean) {
      str2 = "1";
    } else {
      str2 = "0";
    }
    localHashMap.put("app_context", str2);
    if (paramInfo != null)
    {
      if (paramInfo.isLimitAdTrackingEnabled()) {
        str2 = str1;
      } else {
        str2 = "0";
      }
      localHashMap.put("limit_ad_tracking", str2);
    }
    if ((paramInfo != null) && (paramInfo.getId() != null)) {
      localHashMap.put("ad_id_size", Integer.toString(paramInfo.getId().length()));
    }
    if (paramThrowable != null) {
      localHashMap.put("error", paramThrowable.getClass().getName());
    }
    if ((paramString != null) && (!paramString.isEmpty())) {
      localHashMap.put("experiment_id", paramString);
    }
    localHashMap.put("tag", "AdvertisingIdClient");
    localHashMap.put("time_spent", Long.toString(paramLong));
    new a(this, localHashMap).start();
    return true;
  }
  
  /* Error */
  private final boolean zzb()
    throws IOException
  {
    // Byte code:
    //   0: ldc -31
    //   2: invokestatic 227	com/google/android/gms/common/internal/t:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 53	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   11: ifne +90 -> 101
    //   14: aload_0
    //   15: getfield 38	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzh	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 206	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzi	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   25: ifnull +58 -> 83
    //   28: aload_0
    //   29: getfield 206	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzi	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   32: getfield 323	com/google/android/gms/ads/identifier/AdvertisingIdClient$a:d	Z
    //   35: ifeq +48 -> 83
    //   38: aload_1
    //   39: monitorexit
    //   40: aload_0
    //   41: iconst_0
    //   42: invokespecial 104	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Z)V
    //   45: aload_0
    //   46: getfield 53	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   49: ifeq +6 -> 55
    //   52: goto +49 -> 101
    //   55: new 61	java/io/IOException
    //   58: astore_1
    //   59: aload_1
    //   60: ldc_w 325
    //   63: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   66: aload_1
    //   67: athrow
    //   68: astore_2
    //   69: new 61	java/io/IOException
    //   72: astore_1
    //   73: aload_1
    //   74: ldc_w 325
    //   77: aload_2
    //   78: invokespecial 328	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   81: aload_1
    //   82: athrow
    //   83: new 61	java/io/IOException
    //   86: astore_2
    //   87: aload_2
    //   88: ldc_w 330
    //   91: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   94: aload_2
    //   95: athrow
    //   96: astore_2
    //   97: aload_1
    //   98: monitorexit
    //   99: aload_2
    //   100: athrow
    //   101: aload_0
    //   102: getfield 231	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/a;
    //   105: invokestatic 43	com/google/android/gms/common/internal/t:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: aload_0
    //   110: getfield 235	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	LVq;
    //   113: invokestatic 43	com/google/android/gms/common/internal/t:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: aload_0
    //   118: getfield 235	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	LVq;
    //   121: invokeinterface 335 1 0
    //   126: istore_3
    //   127: aload_0
    //   128: monitorexit
    //   129: aload_0
    //   130: invokespecial 237	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	()V
    //   133: iload_3
    //   134: ireturn
    //   135: astore_1
    //   136: ldc_w 301
    //   139: ldc_w 337
    //   142: aload_1
    //   143: invokestatic 343	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   146: pop
    //   147: new 61	java/io/IOException
    //   150: astore_1
    //   151: aload_1
    //   152: ldc_w 345
    //   155: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   158: aload_1
    //   159: athrow
    //   160: astore_1
    //   161: aload_0
    //   162: monitorexit
    //   163: aload_1
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	AdvertisingIdClient
    //   135	8	1	localRemoteException	android.os.RemoteException
    //   150	9	1	localIOException1	IOException
    //   160	4	1	localObject2	Object
    //   68	10	2	localException	Exception
    //   86	9	2	localIOException2	IOException
    //   96	4	2	localObject3	Object
    //   126	8	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   40	45	68	java/lang/Exception
    //   21	40	96	finally
    //   83	96	96	finally
    //   97	99	96	finally
    //   117	127	135	android/os/RemoteException
    //   7	21	160	finally
    //   40	45	160	finally
    //   45	52	160	finally
    //   55	68	160	finally
    //   69	83	160	finally
    //   99	101	160	finally
    //   101	117	160	finally
    //   117	127	160	finally
    //   127	129	160	finally
    //   136	160	160	finally
    //   161	163	160	finally
  }
  
  protected void finalize()
    throws Throwable
  {
    finish();
    super.finalize();
  }
  
  public final void finish()
  {
    t.c("Calling this from your main thread can lead to deadlock");
    try
    {
      if (this.mContext != null)
      {
        com.google.android.gms.common.a locala = this.zze;
        if (locala != null)
        {
          try
          {
            if (this.zzg) {
              zq.a().a(this.mContext, this.zze);
            }
          }
          catch (Throwable localThrowable)
          {
            Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", localThrowable);
          }
          this.zzg = false;
          this.zzf = null;
          this.zze = null;
          return;
        }
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public Info getInfo()
    throws IOException
  {
    // Byte code:
    //   0: ldc -31
    //   2: invokestatic 227	com/google/android/gms/common/internal/t:c	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 53	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   11: ifne +90 -> 101
    //   14: aload_0
    //   15: getfield 38	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzh	Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield 206	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzi	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   25: ifnull +58 -> 83
    //   28: aload_0
    //   29: getfield 206	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzi	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   32: getfield 323	com/google/android/gms/ads/identifier/AdvertisingIdClient$a:d	Z
    //   35: ifeq +48 -> 83
    //   38: aload_1
    //   39: monitorexit
    //   40: aload_0
    //   41: iconst_0
    //   42: invokespecial 104	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	(Z)V
    //   45: aload_0
    //   46: getfield 53	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzg	Z
    //   49: ifeq +6 -> 55
    //   52: goto +49 -> 101
    //   55: new 61	java/io/IOException
    //   58: astore_1
    //   59: aload_1
    //   60: ldc_w 325
    //   63: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   66: aload_1
    //   67: athrow
    //   68: astore_2
    //   69: new 61	java/io/IOException
    //   72: astore_1
    //   73: aload_1
    //   74: ldc_w 325
    //   77: aload_2
    //   78: invokespecial 328	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   81: aload_1
    //   82: athrow
    //   83: new 61	java/io/IOException
    //   86: astore_2
    //   87: aload_2
    //   88: ldc_w 330
    //   91: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   94: aload_2
    //   95: athrow
    //   96: astore_2
    //   97: aload_1
    //   98: monitorexit
    //   99: aload_2
    //   100: athrow
    //   101: aload_0
    //   102: getfield 231	com/google/android/gms/ads/identifier/AdvertisingIdClient:zze	Lcom/google/android/gms/common/a;
    //   105: invokestatic 43	com/google/android/gms/common/internal/t:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   108: pop
    //   109: aload_0
    //   110: getfield 235	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	LVq;
    //   113: invokestatic 43	com/google/android/gms/common/internal/t:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   116: pop
    //   117: new 6	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   120: astore_1
    //   121: aload_1
    //   122: aload_0
    //   123: getfield 235	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	LVq;
    //   126: invokeinterface 354 1 0
    //   131: aload_0
    //   132: getfield 235	com/google/android/gms/ads/identifier/AdvertisingIdClient:zzf	LVq;
    //   135: iconst_1
    //   136: invokeinterface 358 2 0
    //   141: invokespecial 361	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_0
    //   147: invokespecial 237	com/google/android/gms/ads/identifier/AdvertisingIdClient:zza	()V
    //   150: aload_1
    //   151: areturn
    //   152: astore_1
    //   153: ldc_w 301
    //   156: ldc_w 337
    //   159: aload_1
    //   160: invokestatic 343	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   163: pop
    //   164: new 61	java/io/IOException
    //   167: astore_1
    //   168: aload_1
    //   169: ldc_w 345
    //   172: invokespecial 153	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   175: aload_1
    //   176: athrow
    //   177: astore_1
    //   178: aload_0
    //   179: monitorexit
    //   180: aload_1
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	AdvertisingIdClient
    //   152	8	1	localRemoteException	android.os.RemoteException
    //   167	9	1	localIOException1	IOException
    //   177	4	1	localObject2	Object
    //   68	10	2	localException	Exception
    //   86	9	2	localIOException2	IOException
    //   96	4	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   40	45	68	java/lang/Exception
    //   21	40	96	finally
    //   83	96	96	finally
    //   97	99	96	finally
    //   117	144	152	android/os/RemoteException
    //   7	21	177	finally
    //   40	45	177	finally
    //   45	52	177	finally
    //   55	68	177	finally
    //   69	83	177	finally
    //   99	101	177	finally
    //   101	117	177	finally
    //   117	144	177	finally
    //   144	146	177	finally
    //   153	177	177	finally
    //   178	180	177	finally
  }
  
  public void start()
    throws IOException, IllegalStateException, g, h
  {
    zza(true);
  }
  
  public static final class Info
  {
    private final String zzq;
    private final boolean zzr;
    
    public Info(String paramString, boolean paramBoolean)
    {
      this.zzq = paramString;
      this.zzr = paramBoolean;
    }
    
    public final String getId()
    {
      return this.zzq;
    }
    
    public final boolean isLimitAdTrackingEnabled()
    {
      return this.zzr;
    }
    
    public final String toString()
    {
      String str = this.zzq;
      boolean bool = this.zzr;
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
      localStringBuilder.append("{");
      localStringBuilder.append(str);
      localStringBuilder.append("}");
      localStringBuilder.append(bool);
      return localStringBuilder.toString();
    }
  }
  
  static final class a
    extends Thread
  {
    private WeakReference<AdvertisingIdClient> a;
    private long b;
    CountDownLatch c;
    boolean d;
    
    public a(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
    {
      this.a = new WeakReference(paramAdvertisingIdClient);
      this.b = paramLong;
      this.c = new CountDownLatch(1);
      this.d = false;
      start();
    }
    
    private final void a()
    {
      AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.a.get();
      if (localAdvertisingIdClient != null)
      {
        localAdvertisingIdClient.finish();
        this.d = true;
      }
    }
    
    public final void run()
    {
      try
      {
        if (!this.c.await(this.b, TimeUnit.MILLISECONDS)) {
          a();
        }
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        a();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/identifier/AdvertisingIdClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */