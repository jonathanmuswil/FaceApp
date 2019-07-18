package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.k;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

@yh
public final class oo
  implements dba
{
  private InputStream a;
  private boolean b;
  private final Context c;
  private final dba d;
  private final sba<dba> e;
  private final po f;
  private Uri g;
  
  public oo(Context paramContext, dba paramdba, sba<dba> paramsba, po parampo)
  {
    this.c = paramContext;
    this.d = paramdba;
    this.e = paramsba;
    this.f = parampo;
  }
  
  /* Error */
  public final long a(gba paramgba)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/google/android/gms/internal/ads/oo:b	Z
    //   4: ifne +555 -> 559
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield 49	com/google/android/gms/internal/ads/oo:b	Z
    //   12: aload_0
    //   13: aload_1
    //   14: getfield 53	com/google/android/gms/internal/ads/gba:a	Landroid/net/Uri;
    //   17: putfield 55	com/google/android/gms/internal/ads/oo:g	Landroid/net/Uri;
    //   20: aload_0
    //   21: getfield 33	com/google/android/gms/internal/ads/oo:e	Lcom/google/android/gms/internal/ads/sba;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnull +11 -> 37
    //   29: aload_2
    //   30: aload_0
    //   31: aload_1
    //   32: invokeinterface 60 3 0
    //   37: aload_1
    //   38: getfield 53	com/google/android/gms/internal/ads/gba:a	Landroid/net/Uri;
    //   41: invokestatic 65	com/google/android/gms/internal/ads/dda:a	(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/dda;
    //   44: astore_3
    //   45: getstatic 71	com/google/android/gms/internal/ads/ra:wd	Lcom/google/android/gms/internal/ads/ga;
    //   48: astore_2
    //   49: invokestatic 76	com/google/android/gms/internal/ads/Kea:e	()Lcom/google/android/gms/internal/ads/oa;
    //   52: aload_2
    //   53: invokevirtual 81	com/google/android/gms/internal/ads/oa:a	(Lcom/google/android/gms/internal/ads/ga;)Ljava/lang/Object;
    //   56: checkcast 83	java/lang/Boolean
    //   59: invokevirtual 87	java/lang/Boolean:booleanValue	()Z
    //   62: ifeq +396 -> 458
    //   65: aload_3
    //   66: ifnull +437 -> 503
    //   69: aload_3
    //   70: aload_1
    //   71: getfield 90	com/google/android/gms/internal/ads/gba:d	J
    //   74: putfield 93	com/google/android/gms/internal/ads/dda:h	J
    //   77: aload_3
    //   78: getfield 95	com/google/android/gms/internal/ads/dda:g	Z
    //   81: ifeq +21 -> 102
    //   84: getstatic 98	com/google/android/gms/internal/ads/ra:yd	Lcom/google/android/gms/internal/ads/ga;
    //   87: astore_2
    //   88: invokestatic 76	com/google/android/gms/internal/ads/Kea:e	()Lcom/google/android/gms/internal/ads/oa;
    //   91: aload_2
    //   92: invokevirtual 81	com/google/android/gms/internal/ads/oa:a	(Lcom/google/android/gms/internal/ads/ga;)Ljava/lang/Object;
    //   95: checkcast 100	java/lang/Long
    //   98: astore_2
    //   99: goto +18 -> 117
    //   102: getstatic 103	com/google/android/gms/internal/ads/ra:xd	Lcom/google/android/gms/internal/ads/ga;
    //   105: astore_2
    //   106: invokestatic 76	com/google/android/gms/internal/ads/Kea:e	()Lcom/google/android/gms/internal/ads/oa;
    //   109: aload_2
    //   110: invokevirtual 81	com/google/android/gms/internal/ads/oa:a	(Lcom/google/android/gms/internal/ads/ga;)Ljava/lang/Object;
    //   113: checkcast 100	java/lang/Long
    //   116: astore_2
    //   117: aload_2
    //   118: invokevirtual 107	java/lang/Long:longValue	()J
    //   121: lstore 4
    //   123: invokestatic 113	com/google/android/gms/ads/internal/k:j	()Lcom/google/android/gms/common/util/e;
    //   126: invokeinterface 117 1 0
    //   131: lstore 6
    //   133: invokestatic 121	com/google/android/gms/ads/internal/k:w	()Lcom/google/android/gms/internal/ads/rda;
    //   136: pop
    //   137: aload_0
    //   138: getfield 29	com/google/android/gms/internal/ads/oo:c	Landroid/content/Context;
    //   141: aload_3
    //   142: invokestatic 126	com/google/android/gms/internal/ads/rda:a	(Landroid/content/Context;Lcom/google/android/gms/internal/ads/dda;)Ljava/util/concurrent/Future;
    //   145: astore_2
    //   146: aload_0
    //   147: aload_2
    //   148: lload 4
    //   150: getstatic 132	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   153: invokeinterface 138 4 0
    //   158: checkcast 140	java/io/InputStream
    //   161: putfield 142	com/google/android/gms/internal/ads/oo:a	Ljava/io/InputStream;
    //   164: invokestatic 113	com/google/android/gms/ads/internal/k:j	()Lcom/google/android/gms/common/util/e;
    //   167: invokeinterface 117 1 0
    //   172: lload 6
    //   174: lsub
    //   175: lstore 6
    //   177: aload_0
    //   178: getfield 35	com/google/android/gms/internal/ads/oo:f	Lcom/google/android/gms/internal/ads/po;
    //   181: iconst_1
    //   182: lload 6
    //   184: invokeinterface 147 4 0
    //   189: new 149	java/lang/StringBuilder
    //   192: dup
    //   193: bipush 44
    //   195: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   198: astore_1
    //   199: aload_1
    //   200: ldc -102
    //   202: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: aload_1
    //   207: lload 6
    //   209: invokevirtual 161	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload_1
    //   214: ldc -93
    //   216: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload_1
    //   221: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokestatic 172	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   227: ldc2_w 173
    //   230: lreturn
    //   231: astore_1
    //   232: goto +161 -> 393
    //   235: astore 8
    //   237: aload_2
    //   238: iconst_1
    //   239: invokeinterface 178 2 0
    //   244: pop
    //   245: invokestatic 184	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   248: invokevirtual 187	java/lang/Thread:interrupt	()V
    //   251: invokestatic 113	com/google/android/gms/ads/internal/k:j	()Lcom/google/android/gms/common/util/e;
    //   254: invokeinterface 117 1 0
    //   259: lload 6
    //   261: lsub
    //   262: lstore 6
    //   264: aload_0
    //   265: getfield 35	com/google/android/gms/internal/ads/oo:f	Lcom/google/android/gms/internal/ads/po;
    //   268: iconst_0
    //   269: lload 6
    //   271: invokeinterface 147 4 0
    //   276: new 149	java/lang/StringBuilder
    //   279: dup
    //   280: bipush 44
    //   282: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   285: astore_2
    //   286: aload_2
    //   287: ldc -102
    //   289: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload_2
    //   294: lload 6
    //   296: invokevirtual 161	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: aload_2
    //   301: ldc -93
    //   303: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload_2
    //   308: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: invokestatic 172	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   314: goto +189 -> 503
    //   317: astore 8
    //   319: aload_2
    //   320: iconst_1
    //   321: invokeinterface 178 2 0
    //   326: pop
    //   327: invokestatic 113	com/google/android/gms/ads/internal/k:j	()Lcom/google/android/gms/common/util/e;
    //   330: invokeinterface 117 1 0
    //   335: lload 6
    //   337: lsub
    //   338: lstore 6
    //   340: aload_0
    //   341: getfield 35	com/google/android/gms/internal/ads/oo:f	Lcom/google/android/gms/internal/ads/po;
    //   344: iconst_0
    //   345: lload 6
    //   347: invokeinterface 147 4 0
    //   352: new 149	java/lang/StringBuilder
    //   355: dup
    //   356: bipush 44
    //   358: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   361: astore_2
    //   362: aload_2
    //   363: ldc -102
    //   365: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: pop
    //   369: aload_2
    //   370: lload 6
    //   372: invokevirtual 161	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   375: pop
    //   376: aload_2
    //   377: ldc -93
    //   379: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: aload_2
    //   384: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   387: invokestatic 172	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   390: goto +113 -> 503
    //   393: invokestatic 113	com/google/android/gms/ads/internal/k:j	()Lcom/google/android/gms/common/util/e;
    //   396: invokeinterface 117 1 0
    //   401: lload 6
    //   403: lsub
    //   404: lstore 6
    //   406: aload_0
    //   407: getfield 35	com/google/android/gms/internal/ads/oo:f	Lcom/google/android/gms/internal/ads/po;
    //   410: iconst_0
    //   411: lload 6
    //   413: invokeinterface 147 4 0
    //   418: new 149	java/lang/StringBuilder
    //   421: dup
    //   422: bipush 44
    //   424: invokespecial 152	java/lang/StringBuilder:<init>	(I)V
    //   427: astore_2
    //   428: aload_2
    //   429: ldc -102
    //   431: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: pop
    //   435: aload_2
    //   436: lload 6
    //   438: invokevirtual 161	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   441: pop
    //   442: aload_2
    //   443: ldc -93
    //   445: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   448: pop
    //   449: aload_2
    //   450: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   453: invokestatic 172	com/google/android/gms/internal/ads/mk:f	(Ljava/lang/String;)V
    //   456: aload_1
    //   457: athrow
    //   458: aconst_null
    //   459: astore_2
    //   460: aload_3
    //   461: ifnull +19 -> 480
    //   464: aload_3
    //   465: aload_1
    //   466: getfield 90	com/google/android/gms/internal/ads/gba:d	J
    //   469: putfield 93	com/google/android/gms/internal/ads/dda:h	J
    //   472: invokestatic 191	com/google/android/gms/ads/internal/k:i	()Lcom/google/android/gms/internal/ads/Wca;
    //   475: aload_3
    //   476: invokevirtual 196	com/google/android/gms/internal/ads/Wca:a	(Lcom/google/android/gms/internal/ads/dda;)Lcom/google/android/gms/internal/ads/ada;
    //   479: astore_2
    //   480: aload_2
    //   481: ifnull +22 -> 503
    //   484: aload_2
    //   485: invokevirtual 201	com/google/android/gms/internal/ads/ada:wa	()Z
    //   488: ifeq +15 -> 503
    //   491: aload_0
    //   492: aload_2
    //   493: invokevirtual 205	com/google/android/gms/internal/ads/ada:y	()Ljava/io/InputStream;
    //   496: putfield 142	com/google/android/gms/internal/ads/oo:a	Ljava/io/InputStream;
    //   499: ldc2_w 173
    //   502: lreturn
    //   503: aload_1
    //   504: astore_2
    //   505: aload_3
    //   506: ifnull +42 -> 548
    //   509: new 51	com/google/android/gms/internal/ads/gba
    //   512: dup
    //   513: aload_3
    //   514: getfield 208	com/google/android/gms/internal/ads/dda:a	Ljava/lang/String;
    //   517: invokestatic 214	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   520: aload_1
    //   521: getfield 217	com/google/android/gms/internal/ads/gba:b	[B
    //   524: aload_1
    //   525: getfield 219	com/google/android/gms/internal/ads/gba:c	J
    //   528: aload_1
    //   529: getfield 90	com/google/android/gms/internal/ads/gba:d	J
    //   532: aload_1
    //   533: getfield 221	com/google/android/gms/internal/ads/gba:e	J
    //   536: aload_1
    //   537: getfield 223	com/google/android/gms/internal/ads/gba:f	Ljava/lang/String;
    //   540: aload_1
    //   541: getfield 226	com/google/android/gms/internal/ads/gba:g	I
    //   544: invokespecial 229	com/google/android/gms/internal/ads/gba:<init>	(Landroid/net/Uri;[BJJJLjava/lang/String;I)V
    //   547: astore_2
    //   548: aload_0
    //   549: getfield 31	com/google/android/gms/internal/ads/oo:d	Lcom/google/android/gms/internal/ads/dba;
    //   552: aload_2
    //   553: invokeinterface 231 2 0
    //   558: lreturn
    //   559: new 41	java/io/IOException
    //   562: dup
    //   563: ldc -23
    //   565: invokespecial 235	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   568: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	569	0	this	oo
    //   0	569	1	paramgba	gba
    //   24	529	2	localObject	Object
    //   44	470	3	localdda	dda
    //   121	28	4	l1	long
    //   131	306	6	l2	long
    //   235	1	8	localInterruptedException	InterruptedException
    //   317	1	8	localExecutionException	java.util.concurrent.ExecutionException
    // Exception table:
    //   from	to	target	type
    //   146	164	231	finally
    //   237	251	231	finally
    //   319	327	231	finally
    //   146	164	235	java/lang/InterruptedException
    //   146	164	317	java/util/concurrent/ExecutionException
    //   146	164	317	java/util/concurrent/TimeoutException
  }
  
  public final void close()
    throws IOException
  {
    if (this.b)
    {
      this.b = false;
      this.g = null;
      Object localObject = this.a;
      if (localObject != null)
      {
        k.a((Closeable)localObject);
        this.a = null;
      }
      else
      {
        this.d.close();
      }
      localObject = this.e;
      if (localObject != null) {
        ((sba)localObject).d(this);
      }
      return;
    }
    throw new IOException("Attempt to close an already closed CacheDataSource.");
  }
  
  public final Uri getUri()
  {
    return this.g;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (this.b)
    {
      InputStream localInputStream = this.a;
      if (localInputStream != null) {
        paramInt1 = localInputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      } else {
        paramInt1 = this.d.read(paramArrayOfByte, paramInt1, paramInt2);
      }
      paramArrayOfByte = this.e;
      if (paramArrayOfByte != null) {
        paramArrayOfByte.a(this, paramInt1);
      }
      return paramInt1;
    }
    throw new IOException("Attempt to read closed CacheDataSource.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */