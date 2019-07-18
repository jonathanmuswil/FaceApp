package com.google.android.gms.internal.ads;

import Hq;
import Iq;
import android.os.RemoteException;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.m;
import java.util.List;
import rp.a;
import rp.b;
import zp;
import zp.b;

@yh
public final class fc
  extends zp
{
  private final cc a;
  private final List<rp.b> b;
  private final jb c;
  private final m d;
  private final rp.a e;
  private final List<k> f;
  private final zp.b g;
  
  /* Error */
  public fc(cc paramcc)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 27	zp:<init>	()V
    //   4: aload_0
    //   5: new 29	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 30	java/util/ArrayList:<init>	()V
    //   12: putfield 32	com/google/android/gms/internal/ads/fc:b	Ljava/util/List;
    //   15: aload_0
    //   16: new 34	com/google/android/gms/ads/m
    //   19: dup
    //   20: invokespecial 35	com/google/android/gms/ads/m:<init>	()V
    //   23: putfield 37	com/google/android/gms/internal/ads/fc:d	Lcom/google/android/gms/ads/m;
    //   26: aload_0
    //   27: new 29	java/util/ArrayList
    //   30: dup
    //   31: invokespecial 30	java/util/ArrayList:<init>	()V
    //   34: putfield 39	com/google/android/gms/internal/ads/fc:f	Ljava/util/List;
    //   37: aload_0
    //   38: aload_1
    //   39: putfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   42: aconst_null
    //   43: astore_2
    //   44: aload_0
    //   45: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   48: invokeinterface 47 1 0
    //   53: astore_1
    //   54: aload_1
    //   55: ifnull +124 -> 179
    //   58: aload_1
    //   59: invokeinterface 53 1 0
    //   64: astore_3
    //   65: aload_3
    //   66: invokeinterface 59 1 0
    //   71: ifeq +108 -> 179
    //   74: aload_3
    //   75: invokeinterface 63 1 0
    //   80: astore_1
    //   81: aload_1
    //   82: instanceof 65
    //   85: ifeq +51 -> 136
    //   88: aload_1
    //   89: checkcast 65	android/os/IBinder
    //   92: astore_1
    //   93: aload_1
    //   94: ifnull +42 -> 136
    //   97: aload_1
    //   98: ldc 67
    //   100: invokeinterface 71 2 0
    //   105: astore 4
    //   107: aload 4
    //   109: instanceof 73
    //   112: ifeq +12 -> 124
    //   115: aload 4
    //   117: checkcast 73	com/google/android/gms/internal/ads/gb
    //   120: astore_1
    //   121: goto +17 -> 138
    //   124: new 75	com/google/android/gms/internal/ads/ib
    //   127: dup
    //   128: aload_1
    //   129: invokespecial 78	com/google/android/gms/internal/ads/ib:<init>	(Landroid/os/IBinder;)V
    //   132: astore_1
    //   133: goto +5 -> 138
    //   136: aconst_null
    //   137: astore_1
    //   138: aload_1
    //   139: ifnull -74 -> 65
    //   142: aload_0
    //   143: getfield 32	com/google/android/gms/internal/ads/fc:b	Ljava/util/List;
    //   146: astore 5
    //   148: new 80	com/google/android/gms/internal/ads/jb
    //   151: astore 4
    //   153: aload 4
    //   155: aload_1
    //   156: invokespecial 83	com/google/android/gms/internal/ads/jb:<init>	(Lcom/google/android/gms/internal/ads/gb;)V
    //   159: aload 5
    //   161: aload 4
    //   163: invokeinterface 87 2 0
    //   168: pop
    //   169: goto -104 -> 65
    //   172: astore_1
    //   173: ldc 89
    //   175: aload_1
    //   176: invokestatic 94	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   179: aload_0
    //   180: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   183: invokeinterface 97 1 0
    //   188: astore_1
    //   189: aload_1
    //   190: ifnull +87 -> 277
    //   193: aload_1
    //   194: invokeinterface 53 1 0
    //   199: astore_3
    //   200: aload_3
    //   201: invokeinterface 59 1 0
    //   206: ifeq +71 -> 277
    //   209: aload_3
    //   210: invokeinterface 63 1 0
    //   215: astore_1
    //   216: aload_1
    //   217: instanceof 65
    //   220: ifeq +14 -> 234
    //   223: aload_1
    //   224: checkcast 65	android/os/IBinder
    //   227: invokestatic 102	com/google/android/gms/internal/ads/k:a	(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/j;
    //   230: astore_1
    //   231: goto +5 -> 236
    //   234: aconst_null
    //   235: astore_1
    //   236: aload_1
    //   237: ifnull -37 -> 200
    //   240: aload_0
    //   241: getfield 39	com/google/android/gms/internal/ads/fc:f	Ljava/util/List;
    //   244: astore 4
    //   246: new 104	com/google/android/gms/internal/ads/m
    //   249: astore 5
    //   251: aload 5
    //   253: aload_1
    //   254: invokespecial 107	com/google/android/gms/internal/ads/m:<init>	(Lcom/google/android/gms/internal/ads/j;)V
    //   257: aload 4
    //   259: aload 5
    //   261: invokeinterface 87 2 0
    //   266: pop
    //   267: goto -67 -> 200
    //   270: astore_1
    //   271: ldc 89
    //   273: aload_1
    //   274: invokestatic 94	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: aload_0
    //   278: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   281: invokeinterface 111 1 0
    //   286: astore_3
    //   287: aload_3
    //   288: ifnull +22 -> 310
    //   291: new 80	com/google/android/gms/internal/ads/jb
    //   294: astore_1
    //   295: aload_1
    //   296: aload_3
    //   297: invokespecial 83	com/google/android/gms/internal/ads/jb:<init>	(Lcom/google/android/gms/internal/ads/gb;)V
    //   300: goto +12 -> 312
    //   303: astore_1
    //   304: ldc 89
    //   306: aload_1
    //   307: invokestatic 94	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   310: aconst_null
    //   311: astore_1
    //   312: aload_0
    //   313: aload_1
    //   314: putfield 113	com/google/android/gms/internal/ads/fc:c	Lcom/google/android/gms/internal/ads/jb;
    //   317: aload_0
    //   318: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   321: invokeinterface 117 1 0
    //   326: ifnull +30 -> 356
    //   329: new 119	com/google/android/gms/internal/ads/bb
    //   332: astore_1
    //   333: aload_1
    //   334: aload_0
    //   335: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   338: invokeinterface 117 1 0
    //   343: invokespecial 122	com/google/android/gms/internal/ads/bb:<init>	(Lcom/google/android/gms/internal/ads/Ya;)V
    //   346: goto +12 -> 358
    //   349: astore_1
    //   350: ldc 89
    //   352: aload_1
    //   353: invokestatic 94	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   356: aconst_null
    //   357: astore_1
    //   358: aload_0
    //   359: aload_1
    //   360: putfield 124	com/google/android/gms/internal/ads/fc:e	Lrp$a;
    //   363: aload_2
    //   364: astore_1
    //   365: aload_0
    //   366: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   369: invokeinterface 128 1 0
    //   374: ifnull +32 -> 406
    //   377: new 130	com/google/android/gms/internal/ads/fb
    //   380: astore_1
    //   381: aload_1
    //   382: aload_0
    //   383: getfield 41	com/google/android/gms/internal/ads/fc:a	Lcom/google/android/gms/internal/ads/cc;
    //   386: invokeinterface 128 1 0
    //   391: invokespecial 133	com/google/android/gms/internal/ads/fb:<init>	(Lcom/google/android/gms/internal/ads/cb;)V
    //   394: goto +12 -> 406
    //   397: astore_1
    //   398: ldc 89
    //   400: aload_1
    //   401: invokestatic 94	com/google/android/gms/internal/ads/Tl:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   404: aload_2
    //   405: astore_1
    //   406: aload_0
    //   407: aload_1
    //   408: putfield 135	com/google/android/gms/internal/ads/fc:g	Lzp$b;
    //   411: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	412	0	this	fc
    //   0	412	1	paramcc	cc
    //   43	362	2	localObject1	Object
    //   64	233	3	localObject2	Object
    //   105	153	4	localObject3	Object
    //   146	114	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   44	54	172	android/os/RemoteException
    //   58	65	172	android/os/RemoteException
    //   65	93	172	android/os/RemoteException
    //   97	121	172	android/os/RemoteException
    //   124	133	172	android/os/RemoteException
    //   142	169	172	android/os/RemoteException
    //   179	189	270	android/os/RemoteException
    //   193	200	270	android/os/RemoteException
    //   200	231	270	android/os/RemoteException
    //   240	267	270	android/os/RemoteException
    //   277	287	303	android/os/RemoteException
    //   291	300	303	android/os/RemoteException
    //   317	346	349	android/os/RemoteException
    //   365	394	397	android/os/RemoteException
  }
  
  private final Hq m()
  {
    try
    {
      Hq localHq = this.a.G();
      return localHq;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final String a()
  {
    try
    {
      String str = this.a.N();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final String b()
  {
    try
    {
      String str = this.a.x();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final String c()
  {
    try
    {
      String str = this.a.v();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final String d()
  {
    try
    {
      String str = this.a.u();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final rp.b e()
  {
    return this.c;
  }
  
  public final List<rp.b> f()
  {
    return this.b;
  }
  
  public final String g()
  {
    try
    {
      String str = this.a.F();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final Double h()
  {
    try
    {
      double d1 = this.a.J();
      if (d1 == -1.0D) {
        return null;
      }
      return Double.valueOf(d1);
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final String i()
  {
    try
    {
      String str = this.a.O();
      return str;
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
  
  public final m j()
  {
    try
    {
      if (this.a.getVideoController() != null) {
        this.d.a(this.a.getVideoController());
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("Exception occurred while getting video controller", localRemoteException);
    }
    return this.d;
  }
  
  public final Object l()
  {
    try
    {
      Object localObject = this.a.y();
      if (localObject != null)
      {
        localObject = Iq.J((Hq)localObject);
        return localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      Tl.b("", localRemoteException);
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */