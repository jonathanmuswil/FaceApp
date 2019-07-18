package com.google.android.gms.internal.ads;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class vf
  implements Nl
{
  private final Map<String, Wf> a = new LinkedHashMap(16, 0.75F, true);
  private long b = 0L;
  private final File c;
  private final int d;
  
  public vf(File paramFile)
  {
    this(paramFile, 5242880);
  }
  
  public vf(File paramFile, int paramInt)
  {
    this.c = paramFile;
    this.d = paramInt;
  }
  
  static int a(InputStream paramInputStream)
    throws IOException
  {
    int i = c(paramInputStream);
    int j = c(paramInputStream);
    int k = c(paramInputStream);
    return c(paramInputStream) << 24 | i | 0x0 | j << 8 | k << 16;
  }
  
  private static InputStream a(File paramFile)
    throws FileNotFoundException
  {
    return new FileInputStream(paramFile);
  }
  
  static String a(wg paramwg)
    throws IOException
  {
    return new String(a(paramwg, b(paramwg)), "UTF-8");
  }
  
  static void a(OutputStream paramOutputStream, int paramInt)
    throws IOException
  {
    paramOutputStream.write(paramInt & 0xFF);
    paramOutputStream.write(paramInt >> 8 & 0xFF);
    paramOutputStream.write(paramInt >> 16 & 0xFF);
    paramOutputStream.write(paramInt >>> 24);
  }
  
  static void a(OutputStream paramOutputStream, long paramLong)
    throws IOException
  {
    paramOutputStream.write((byte)(int)paramLong);
    paramOutputStream.write((byte)(int)(paramLong >>> 8));
    paramOutputStream.write((byte)(int)(paramLong >>> 16));
    paramOutputStream.write((byte)(int)(paramLong >>> 24));
    paramOutputStream.write((byte)(int)(paramLong >>> 32));
    paramOutputStream.write((byte)(int)(paramLong >>> 40));
    paramOutputStream.write((byte)(int)(paramLong >>> 48));
    paramOutputStream.write((byte)(int)(paramLong >>> 56));
  }
  
  static void a(OutputStream paramOutputStream, String paramString)
    throws IOException
  {
    paramString = paramString.getBytes("UTF-8");
    a(paramOutputStream, paramString.length);
    paramOutputStream.write(paramString, 0, paramString.length);
  }
  
  private final void a(String paramString)
  {
    try
    {
      boolean bool = d(paramString).delete();
      b(paramString);
      if (!bool) {
        Yb.a("Could not delete cache entry for key=%s, filename=%s", new Object[] { paramString, c(paramString) });
      }
      return;
    }
    finally {}
  }
  
  private final void a(String paramString, Wf paramWf)
  {
    if (!this.a.containsKey(paramString))
    {
      this.b += paramWf.a;
    }
    else
    {
      Wf localWf = (Wf)this.a.get(paramString);
      this.b += paramWf.a - localWf.a;
    }
    this.a.put(paramString, paramWf);
  }
  
  private static byte[] a(wg paramwg, long paramLong)
    throws IOException
  {
    long l = paramwg.a();
    if ((paramLong >= 0L) && (paramLong <= l))
    {
      int i = (int)paramLong;
      if (i == paramLong)
      {
        byte[] arrayOfByte = new byte[i];
        new DataInputStream(paramwg).readFully(arrayOfByte);
        return arrayOfByte;
      }
    }
    paramwg = new StringBuilder(73);
    paramwg.append("streamToBytes length=");
    paramwg.append(paramLong);
    paramwg.append(", maxLength=");
    paramwg.append(l);
    throw new IOException(paramwg.toString());
  }
  
  static long b(InputStream paramInputStream)
    throws IOException
  {
    return c(paramInputStream) & 0xFF | 0L | (c(paramInputStream) & 0xFF) << 8 | (c(paramInputStream) & 0xFF) << 16 | (c(paramInputStream) & 0xFF) << 24 | (c(paramInputStream) & 0xFF) << 32 | (c(paramInputStream) & 0xFF) << 40 | (c(paramInputStream) & 0xFF) << 48 | (0xFF & c(paramInputStream)) << 56;
  }
  
  static List<FX> b(wg paramwg)
    throws IOException
  {
    int i = a(paramwg);
    if (i >= 0)
    {
      Object localObject;
      if (i == 0) {
        localObject = Collections.emptyList();
      } else {
        localObject = new ArrayList();
      }
      for (int j = 0; j < i; j++) {
        ((List)localObject).add(new FX(a(paramwg).intern(), a(paramwg).intern()));
      }
      return (List<FX>)localObject;
    }
    paramwg = new StringBuilder(31);
    paramwg.append("readHeaderList size=");
    paramwg.append(i);
    throw new IOException(paramwg.toString());
  }
  
  private final void b(String paramString)
  {
    paramString = (Wf)this.a.remove(paramString);
    if (paramString != null) {
      this.b -= paramString.a;
    }
  }
  
  private static int c(InputStream paramInputStream)
    throws IOException
  {
    int i = paramInputStream.read();
    if (i != -1) {
      return i;
    }
    throw new EOFException();
  }
  
  private static String c(String paramString)
  {
    int i = paramString.length() / 2;
    String str = String.valueOf(String.valueOf(paramString.substring(0, i).hashCode()));
    paramString = String.valueOf(String.valueOf(paramString.substring(i).hashCode()));
    if (paramString.length() != 0) {
      return str.concat(paramString);
    }
    return new String(str);
  }
  
  private final File d(String paramString)
  {
    return new File(this.c, c(paramString));
  }
  
  /* Error */
  public final void M()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 37	com/google/android/gms/internal/ads/vf:c	Ljava/io/File;
    //   6: invokevirtual 238	java/io/File:exists	()Z
    //   9: istore_1
    //   10: iconst_0
    //   11: istore_2
    //   12: iload_1
    //   13: ifne +35 -> 48
    //   16: aload_0
    //   17: getfield 37	com/google/android/gms/internal/ads/vf:c	Ljava/io/File;
    //   20: invokevirtual 241	java/io/File:mkdirs	()Z
    //   23: ifne +22 -> 45
    //   26: ldc -13
    //   28: iconst_1
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_0
    //   35: getfield 37	com/google/android/gms/internal/ads/vf:c	Ljava/io/File;
    //   38: invokevirtual 246	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   41: aastore
    //   42: invokestatic 248	com/google/android/gms/internal/ads/Yb:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: aload_0
    //   49: getfield 37	com/google/android/gms/internal/ads/vf:c	Ljava/io/File;
    //   52: invokevirtual 252	java/io/File:listFiles	()[Ljava/io/File;
    //   55: astore_3
    //   56: aload_3
    //   57: ifnonnull +6 -> 63
    //   60: aload_0
    //   61: monitorexit
    //   62: return
    //   63: aload_3
    //   64: arraylength
    //   65: istore 4
    //   67: iload_2
    //   68: iload 4
    //   70: if_icmpge +101 -> 171
    //   73: aload_3
    //   74: iload_2
    //   75: aaload
    //   76: astore 5
    //   78: aload 5
    //   80: invokevirtual 254	java/io/File:length	()J
    //   83: lstore 6
    //   85: new 127	com/google/android/gms/internal/ads/wg
    //   88: astore 8
    //   90: new 256	java/io/BufferedInputStream
    //   93: astore 9
    //   95: aload 9
    //   97: aload 5
    //   99: invokestatic 258	com/google/android/gms/internal/ads/vf:a	(Ljava/io/File;)Ljava/io/InputStream;
    //   102: invokespecial 259	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   105: aload 8
    //   107: aload 9
    //   109: lload 6
    //   111: invokespecial 262	com/google/android/gms/internal/ads/wg:<init>	(Ljava/io/InputStream;J)V
    //   114: aload 8
    //   116: invokestatic 265	com/google/android/gms/internal/ads/Wf:a	(Lcom/google/android/gms/internal/ads/wg;)Lcom/google/android/gms/internal/ads/Wf;
    //   119: astore 9
    //   121: aload 9
    //   123: lload 6
    //   125: putfield 117	com/google/android/gms/internal/ads/Wf:a	J
    //   128: aload_0
    //   129: aload 9
    //   131: getfield 268	com/google/android/gms/internal/ads/Wf:b	Ljava/lang/String;
    //   134: aload 9
    //   136: invokespecial 270	com/google/android/gms/internal/ads/vf:a	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Wf;)V
    //   139: aload 8
    //   141: invokevirtual 275	java/io/FilterInputStream:close	()V
    //   144: goto +21 -> 165
    //   147: astore 9
    //   149: aload 8
    //   151: invokevirtual 275	java/io/FilterInputStream:close	()V
    //   154: aload 9
    //   156: athrow
    //   157: astore 8
    //   159: aload 5
    //   161: invokevirtual 94	java/io/File:delete	()Z
    //   164: pop
    //   165: iinc 2 1
    //   168: goto -101 -> 67
    //   171: aload_0
    //   172: monitorexit
    //   173: return
    //   174: astore 5
    //   176: aload_0
    //   177: monitorexit
    //   178: aload 5
    //   180: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	181	0	this	vf
    //   9	4	1	bool	boolean
    //   11	155	2	i	int
    //   55	19	3	arrayOfFile	File[]
    //   65	6	4	j	int
    //   76	84	5	localFile	File
    //   174	5	5	localObject1	Object
    //   83	41	6	l	long
    //   88	62	8	localwg	wg
    //   157	1	8	localIOException	IOException
    //   93	42	9	localObject2	Object
    //   147	8	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   114	139	147	finally
    //   78	114	157	java/io/IOException
    //   139	144	157	java/io/IOException
    //   149	157	157	java/io/IOException
    //   2	10	174	finally
    //   16	45	174	finally
    //   48	56	174	finally
    //   63	67	174	finally
    //   78	114	174	finally
    //   139	144	174	finally
    //   149	157	174	finally
    //   159	165	174	finally
  }
  
  /* Error */
  public final void a(String paramString, fz paramfz)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   6: aload_2
    //   7: getfield 281	com/google/android/gms/internal/ads/fz:a	[B
    //   10: arraylength
    //   11: i2l
    //   12: ladd
    //   13: aload_0
    //   14: getfield 39	com/google/android/gms/internal/ads/vf:d	I
    //   17: i2l
    //   18: lcmp
    //   19: ifle +31 -> 50
    //   22: aload_2
    //   23: getfield 281	com/google/android/gms/internal/ads/fz:a	[B
    //   26: arraylength
    //   27: i2f
    //   28: fstore_3
    //   29: aload_0
    //   30: getfield 39	com/google/android/gms/internal/ads/vf:d	I
    //   33: istore 4
    //   35: fload_3
    //   36: iload 4
    //   38: i2f
    //   39: ldc_w 282
    //   42: fmul
    //   43: fcmpl
    //   44: ifle +6 -> 50
    //   47: aload_0
    //   48: monitorexit
    //   49: return
    //   50: aload_0
    //   51: aload_1
    //   52: invokespecial 88	com/google/android/gms/internal/ads/vf:d	(Ljava/lang/String;)Ljava/io/File;
    //   55: astore 5
    //   57: new 284	java/io/BufferedOutputStream
    //   60: astore 6
    //   62: new 286	java/io/FileOutputStream
    //   65: astore 7
    //   67: aload 7
    //   69: aload 5
    //   71: invokespecial 287	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   74: aload 6
    //   76: aload 7
    //   78: invokespecial 290	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   81: new 115	com/google/android/gms/internal/ads/Wf
    //   84: astore 7
    //   86: aload 7
    //   88: aload_1
    //   89: aload_2
    //   90: invokespecial 292	com/google/android/gms/internal/ads/Wf:<init>	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/fz;)V
    //   93: aload 7
    //   95: aload 6
    //   97: invokevirtual 295	com/google/android/gms/internal/ads/Wf:a	(Ljava/io/OutputStream;)Z
    //   100: ifeq +260 -> 360
    //   103: aload 6
    //   105: aload_2
    //   106: getfield 281	com/google/android/gms/internal/ads/fz:a	[B
    //   109: invokevirtual 297	java/io/BufferedOutputStream:write	([B)V
    //   112: aload 6
    //   114: invokevirtual 298	java/io/BufferedOutputStream:close	()V
    //   117: aload 7
    //   119: aload 5
    //   121: invokevirtual 254	java/io/File:length	()J
    //   124: putfield 117	com/google/android/gms/internal/ads/Wf:a	J
    //   127: aload_0
    //   128: aload_1
    //   129: aload 7
    //   131: invokespecial 270	com/google/android/gms/internal/ads/vf:a	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Wf;)V
    //   134: aload_0
    //   135: getfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   138: aload_0
    //   139: getfield 39	com/google/android/gms/internal/ads/vf:d	I
    //   142: i2l
    //   143: lcmp
    //   144: iflt +213 -> 357
    //   147: getstatic 301	com/google/android/gms/internal/ads/Yb:b	Z
    //   150: ifeq +13 -> 163
    //   153: ldc_w 303
    //   156: iconst_0
    //   157: anewarray 4	java/lang/Object
    //   160: invokestatic 305	com/google/android/gms/internal/ads/Yb:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_0
    //   164: getfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   167: lstore 8
    //   169: invokestatic 310	android/os/SystemClock:elapsedRealtime	()J
    //   172: lstore 10
    //   174: aload_0
    //   175: getfield 33	com/google/android/gms/internal/ads/vf:a	Ljava/util/Map;
    //   178: invokeinterface 314 1 0
    //   183: invokeinterface 320 1 0
    //   188: astore_1
    //   189: iconst_0
    //   190: istore 4
    //   192: aload_1
    //   193: invokeinterface 325 1 0
    //   198: ifeq +110 -> 308
    //   201: aload_1
    //   202: invokeinterface 329 1 0
    //   207: checkcast 331	java/util/Map$Entry
    //   210: invokeinterface 334 1 0
    //   215: checkcast 115	com/google/android/gms/internal/ads/Wf
    //   218: astore_2
    //   219: aload_0
    //   220: aload_2
    //   221: getfield 268	com/google/android/gms/internal/ads/Wf:b	Ljava/lang/String;
    //   224: invokespecial 88	com/google/android/gms/internal/ads/vf:d	(Ljava/lang/String;)Ljava/io/File;
    //   227: invokevirtual 94	java/io/File:delete	()Z
    //   230: ifeq +19 -> 249
    //   233: aload_0
    //   234: aload_0
    //   235: getfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   238: aload_2
    //   239: getfield 117	com/google/android/gms/internal/ads/Wf:a	J
    //   242: lsub
    //   243: putfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   246: goto +29 -> 275
    //   249: ldc 98
    //   251: iconst_2
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload_2
    //   258: getfield 268	com/google/android/gms/internal/ads/Wf:b	Ljava/lang/String;
    //   261: aastore
    //   262: dup
    //   263: iconst_1
    //   264: aload_2
    //   265: getfield 268	com/google/android/gms/internal/ads/Wf:b	Ljava/lang/String;
    //   268: invokestatic 101	com/google/android/gms/internal/ads/vf:c	(Ljava/lang/String;)Ljava/lang/String;
    //   271: aastore
    //   272: invokestatic 106	com/google/android/gms/internal/ads/Yb:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: aload_1
    //   276: invokeinterface 336 1 0
    //   281: iinc 4 1
    //   284: aload_0
    //   285: getfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   288: l2f
    //   289: aload_0
    //   290: getfield 39	com/google/android/gms/internal/ads/vf:d	I
    //   293: i2f
    //   294: ldc_w 282
    //   297: fmul
    //   298: fcmpg
    //   299: ifge +6 -> 305
    //   302: goto +6 -> 308
    //   305: goto -113 -> 192
    //   308: getstatic 301	com/google/android/gms/internal/ads/Yb:b	Z
    //   311: ifeq +46 -> 357
    //   314: ldc_w 338
    //   317: iconst_3
    //   318: anewarray 4	java/lang/Object
    //   321: dup
    //   322: iconst_0
    //   323: iload 4
    //   325: invokestatic 343	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: aastore
    //   329: dup
    //   330: iconst_1
    //   331: aload_0
    //   332: getfield 35	com/google/android/gms/internal/ads/vf:b	J
    //   335: lload 8
    //   337: lsub
    //   338: invokestatic 348	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   341: aastore
    //   342: dup
    //   343: iconst_2
    //   344: invokestatic 310	android/os/SystemClock:elapsedRealtime	()J
    //   347: lload 10
    //   349: lsub
    //   350: invokestatic 348	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   353: aastore
    //   354: invokestatic 305	com/google/android/gms/internal/ads/Yb:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   357: aload_0
    //   358: monitorexit
    //   359: return
    //   360: aload 6
    //   362: invokevirtual 298	java/io/BufferedOutputStream:close	()V
    //   365: ldc_w 350
    //   368: iconst_1
    //   369: anewarray 4	java/lang/Object
    //   372: dup
    //   373: iconst_0
    //   374: aload 5
    //   376: invokevirtual 246	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   379: aastore
    //   380: invokestatic 106	com/google/android/gms/internal/ads/Yb:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   383: new 42	java/io/IOException
    //   386: astore_1
    //   387: aload_1
    //   388: invokespecial 351	java/io/IOException:<init>	()V
    //   391: aload_1
    //   392: athrow
    //   393: astore_1
    //   394: aload 5
    //   396: invokevirtual 94	java/io/File:delete	()Z
    //   399: ifne +21 -> 420
    //   402: ldc_w 353
    //   405: iconst_1
    //   406: anewarray 4	java/lang/Object
    //   409: dup
    //   410: iconst_0
    //   411: aload 5
    //   413: invokevirtual 246	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   416: aastore
    //   417: invokestatic 106	com/google/android/gms/internal/ads/Yb:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   420: aload_0
    //   421: monitorexit
    //   422: return
    //   423: astore_1
    //   424: aload_0
    //   425: monitorexit
    //   426: aload_1
    //   427: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	428	0	this	vf
    //   0	428	1	paramString	String
    //   0	428	2	paramfz	fz
    //   28	8	3	f	float
    //   33	291	4	i	int
    //   55	357	5	localFile	File
    //   60	301	6	localBufferedOutputStream	java.io.BufferedOutputStream
    //   65	65	7	localObject	Object
    //   167	169	8	l1	long
    //   172	176	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   57	163	393	java/io/IOException
    //   163	189	393	java/io/IOException
    //   192	246	393	java/io/IOException
    //   249	275	393	java/io/IOException
    //   275	281	393	java/io/IOException
    //   284	302	393	java/io/IOException
    //   308	357	393	java/io/IOException
    //   360	393	393	java/io/IOException
    //   2	35	423	finally
    //   50	57	423	finally
    //   57	163	423	finally
    //   163	189	423	finally
    //   192	246	423	finally
    //   249	275	423	finally
    //   275	281	423	finally
    //   284	302	423	finally
    //   308	357	423	finally
    //   360	393	423	finally
    //   394	420	423	finally
  }
  
  /* Error */
  public final fz e(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	com/google/android/gms/internal/ads/vf:a	Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface 121 2 0
    //   12: checkcast 115	com/google/android/gms/internal/ads/Wf
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull +7 -> 24
    //   20: aload_0
    //   21: monitorexit
    //   22: aconst_null
    //   23: areturn
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial 88	com/google/android/gms/internal/ads/vf:d	(Ljava/lang/String;)Ljava/io/File;
    //   29: astore_3
    //   30: new 127	com/google/android/gms/internal/ads/wg
    //   33: astore 4
    //   35: new 256	java/io/BufferedInputStream
    //   38: astore 5
    //   40: aload 5
    //   42: aload_3
    //   43: invokestatic 258	com/google/android/gms/internal/ads/vf:a	(Ljava/io/File;)Ljava/io/InputStream;
    //   46: invokespecial 259	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   49: aload 4
    //   51: aload 5
    //   53: aload_3
    //   54: invokevirtual 254	java/io/File:length	()J
    //   57: invokespecial 262	com/google/android/gms/internal/ads/wg:<init>	(Ljava/io/InputStream;J)V
    //   60: aload 4
    //   62: invokestatic 265	com/google/android/gms/internal/ads/Wf:a	(Lcom/google/android/gms/internal/ads/wg;)Lcom/google/android/gms/internal/ads/Wf;
    //   65: astore 5
    //   67: aload_1
    //   68: aload 5
    //   70: getfield 268	com/google/android/gms/internal/ads/Wf:b	Ljava/lang/String;
    //   73: invokestatic 361	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   76: ifne +46 -> 122
    //   79: ldc_w 363
    //   82: iconst_3
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_3
    //   89: invokevirtual 246	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: aload_1
    //   96: aastore
    //   97: dup
    //   98: iconst_2
    //   99: aload 5
    //   101: getfield 268	com/google/android/gms/internal/ads/Wf:b	Ljava/lang/String;
    //   104: aastore
    //   105: invokestatic 106	com/google/android/gms/internal/ads/Yb:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   108: aload_0
    //   109: aload_1
    //   110: invokespecial 96	com/google/android/gms/internal/ads/vf:b	(Ljava/lang/String;)V
    //   113: aload 4
    //   115: invokevirtual 275	java/io/FilterInputStream:close	()V
    //   118: aload_0
    //   119: monitorexit
    //   120: aconst_null
    //   121: areturn
    //   122: aload 4
    //   124: aload 4
    //   126: invokevirtual 130	com/google/android/gms/internal/ads/wg:a	()J
    //   129: invokestatic 61	com/google/android/gms/internal/ads/vf:a	(Lcom/google/android/gms/internal/ads/wg;J)[B
    //   132: astore 6
    //   134: new 278	com/google/android/gms/internal/ads/fz
    //   137: astore 5
    //   139: aload 5
    //   141: invokespecial 364	com/google/android/gms/internal/ads/fz:<init>	()V
    //   144: aload 5
    //   146: aload 6
    //   148: putfield 281	com/google/android/gms/internal/ads/fz:a	[B
    //   151: aload 5
    //   153: aload_2
    //   154: getfield 366	com/google/android/gms/internal/ads/Wf:c	Ljava/lang/String;
    //   157: putfield 367	com/google/android/gms/internal/ads/fz:b	Ljava/lang/String;
    //   160: aload 5
    //   162: aload_2
    //   163: getfield 369	com/google/android/gms/internal/ads/Wf:d	J
    //   166: putfield 371	com/google/android/gms/internal/ads/fz:c	J
    //   169: aload 5
    //   171: aload_2
    //   172: getfield 373	com/google/android/gms/internal/ads/Wf:e	J
    //   175: putfield 374	com/google/android/gms/internal/ads/fz:d	J
    //   178: aload 5
    //   180: aload_2
    //   181: getfield 377	com/google/android/gms/internal/ads/Wf:f	J
    //   184: putfield 378	com/google/android/gms/internal/ads/fz:e	J
    //   187: aload 5
    //   189: aload_2
    //   190: getfield 381	com/google/android/gms/internal/ads/Wf:g	J
    //   193: putfield 382	com/google/android/gms/internal/ads/fz:f	J
    //   196: aload_2
    //   197: getfield 386	com/google/android/gms/internal/ads/Wf:h	Ljava/util/List;
    //   200: astore 7
    //   202: new 388	java/util/TreeMap
    //   205: astore 6
    //   207: aload 6
    //   209: getstatic 392	java/lang/String:CASE_INSENSITIVE_ORDER	Ljava/util/Comparator;
    //   212: invokespecial 395	java/util/TreeMap:<init>	(Ljava/util/Comparator;)V
    //   215: aload 7
    //   217: invokeinterface 396 1 0
    //   222: astore 7
    //   224: aload 7
    //   226: invokeinterface 325 1 0
    //   231: ifeq +36 -> 267
    //   234: aload 7
    //   236: invokeinterface 329 1 0
    //   241: checkcast 176	com/google/android/gms/internal/ads/FX
    //   244: astore 8
    //   246: aload 6
    //   248: aload 8
    //   250: invokevirtual 398	com/google/android/gms/internal/ads/FX:a	()Ljava/lang/String;
    //   253: aload 8
    //   255: invokevirtual 400	com/google/android/gms/internal/ads/FX:b	()Ljava/lang/String;
    //   258: invokeinterface 125 3 0
    //   263: pop
    //   264: goto -40 -> 224
    //   267: aload 5
    //   269: aload 6
    //   271: putfield 402	com/google/android/gms/internal/ads/fz:g	Ljava/util/Map;
    //   274: aload 5
    //   276: aload_2
    //   277: getfield 386	com/google/android/gms/internal/ads/Wf:h	Ljava/util/List;
    //   280: invokestatic 406	java/util/Collections:unmodifiableList	(Ljava/util/List;)Ljava/util/List;
    //   283: putfield 407	com/google/android/gms/internal/ads/fz:h	Ljava/util/List;
    //   286: aload 4
    //   288: invokevirtual 275	java/io/FilterInputStream:close	()V
    //   291: aload_0
    //   292: monitorexit
    //   293: aload 5
    //   295: areturn
    //   296: astore_2
    //   297: aload 4
    //   299: invokevirtual 275	java/io/FilterInputStream:close	()V
    //   302: aload_2
    //   303: athrow
    //   304: astore 4
    //   306: ldc_w 409
    //   309: iconst_2
    //   310: anewarray 4	java/lang/Object
    //   313: dup
    //   314: iconst_0
    //   315: aload_3
    //   316: invokevirtual 246	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: aload 4
    //   324: invokevirtual 410	java/io/IOException:toString	()Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic 106	com/google/android/gms/internal/ads/Yb:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload_0
    //   332: aload_1
    //   333: invokespecial 412	com/google/android/gms/internal/ads/vf:a	(Ljava/lang/String;)V
    //   336: aload_0
    //   337: monitorexit
    //   338: aconst_null
    //   339: areturn
    //   340: astore_1
    //   341: aload_0
    //   342: monitorexit
    //   343: aload_1
    //   344: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	vf
    //   0	345	1	paramString	String
    //   15	262	2	localWf	Wf
    //   296	7	2	localObject1	Object
    //   29	287	3	localFile	File
    //   33	265	4	localwg	wg
    //   304	19	4	localIOException	IOException
    //   38	256	5	localObject2	Object
    //   132	138	6	localObject3	Object
    //   200	35	7	localObject4	Object
    //   244	10	8	localFX	FX
    // Exception table:
    //   from	to	target	type
    //   60	113	296	finally
    //   122	224	296	finally
    //   224	264	296	finally
    //   267	286	296	finally
    //   30	60	304	java/io/IOException
    //   113	118	304	java/io/IOException
    //   286	291	304	java/io/IOException
    //   297	304	304	java/io/IOException
    //   2	16	340	finally
    //   24	30	340	finally
    //   30	60	340	finally
    //   113	118	340	finally
    //   286	291	340	finally
    //   297	304	340	finally
    //   306	336	340	finally
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */