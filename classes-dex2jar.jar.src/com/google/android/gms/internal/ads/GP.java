package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@yh
public final class gp
  extends Lo
  implements sba<dba>
{
  private String d;
  private final vn e;
  private boolean f;
  private final fp g;
  private final Do h;
  private ByteBuffer i;
  private boolean j;
  private final Object k;
  private boolean l;
  
  public gp(wn paramwn, vn paramvn)
  {
    super(paramwn);
    this.e = paramvn;
    this.g = new fp();
    this.h = new Do();
    this.k = new Object();
  }
  
  private final void f()
  {
    int m = (int)this.g.a();
    int n = (int)this.h.a(this.i);
    int i1 = this.i.position();
    int i2 = Math.round(n * (i1 / m));
    boolean bool;
    if (i2 > 0) {
      bool = true;
    } else {
      bool = false;
    }
    int i3 = so.d();
    int i4 = so.e();
    String str = this.d;
    a(str, b(str), i1, m, i2, n, bool, i3, i4);
  }
  
  /* Error */
  public final boolean a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield 78	com/google/android/gms/internal/ads/gp:d	Ljava/lang/String;
    //   5: aload_0
    //   6: aload_1
    //   7: invokevirtual 82	com/google/android/gms/internal/ads/gp:b	(Ljava/lang/String;)Ljava/lang/String;
    //   10: astore_2
    //   11: ldc 99
    //   13: astore_3
    //   14: aload_3
    //   15: astore 4
    //   17: new 91	com/google/android/gms/internal/ads/jba
    //   20: astore 5
    //   22: aload_3
    //   23: astore 4
    //   25: aload 5
    //   27: aload_0
    //   28: getfield 101	com/google/android/gms/internal/ads/Lo:b	Ljava/lang/String;
    //   31: aconst_null
    //   32: aload_0
    //   33: aload_0
    //   34: getfield 31	com/google/android/gms/internal/ads/gp:e	Lcom/google/android/gms/internal/ads/vn;
    //   37: getfield 106	com/google/android/gms/internal/ads/vn:d	I
    //   40: aload_0
    //   41: getfield 31	com/google/android/gms/internal/ads/gp:e	Lcom/google/android/gms/internal/ads/vn;
    //   44: getfield 108	com/google/android/gms/internal/ads/vn:f	I
    //   47: iconst_1
    //   48: aconst_null
    //   49: invokespecial 111	com/google/android/gms/internal/ads/jba:<init>	(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Eba;Lcom/google/android/gms/internal/ads/sba;IIZLcom/google/android/gms/internal/ads/mba;)V
    //   52: aload_3
    //   53: astore 4
    //   55: aload_0
    //   56: getfield 31	com/google/android/gms/internal/ads/gp:e	Lcom/google/android/gms/internal/ads/vn;
    //   59: getfield 113	com/google/android/gms/internal/ads/vn:j	Z
    //   62: istore 6
    //   64: aload 5
    //   66: astore 7
    //   68: iload 6
    //   70: ifeq +34 -> 104
    //   73: aload_3
    //   74: astore 4
    //   76: new 115	com/google/android/gms/internal/ads/oo
    //   79: astore 7
    //   81: aload_3
    //   82: astore 4
    //   84: aload 7
    //   86: aload_0
    //   87: getfield 118	com/google/android/gms/internal/ads/Lo:a	Landroid/content/Context;
    //   90: aload 5
    //   92: aconst_null
    //   93: aconst_null
    //   94: invokespecial 121	com/google/android/gms/internal/ads/oo:<init>	(Landroid/content/Context;Lcom/google/android/gms/internal/ads/dba;Lcom/google/android/gms/internal/ads/sba;Lcom/google/android/gms/internal/ads/po;)V
    //   97: goto +7 -> 104
    //   100: astore_3
    //   101: goto +601 -> 702
    //   104: aload_3
    //   105: astore 4
    //   107: aload_1
    //   108: invokestatic 127	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   111: astore 5
    //   113: aload_3
    //   114: astore 4
    //   116: new 129	com/google/android/gms/internal/ads/gba
    //   119: astore 8
    //   121: aload_3
    //   122: astore 4
    //   124: aload 8
    //   126: aload 5
    //   128: invokespecial 132	com/google/android/gms/internal/ads/gba:<init>	(Landroid/net/Uri;)V
    //   131: aload_3
    //   132: astore 4
    //   134: aload 7
    //   136: aload 8
    //   138: invokeinterface 135 2 0
    //   143: pop2
    //   144: aload_3
    //   145: astore 4
    //   147: aload_0
    //   148: getfield 139	com/google/android/gms/internal/ads/Lo:c	Ljava/lang/ref/WeakReference;
    //   151: invokevirtual 145	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   154: checkcast 147	com/google/android/gms/internal/ads/wn
    //   157: astore 5
    //   159: aload 5
    //   161: ifnull +15 -> 176
    //   164: aload_3
    //   165: astore 4
    //   167: aload 5
    //   169: aload_2
    //   170: aload_0
    //   171: invokeinterface 150 3 0
    //   176: aload_3
    //   177: astore 4
    //   179: invokestatic 155	com/google/android/gms/ads/internal/k:j	()Lcom/google/android/gms/common/util/e;
    //   182: astore 8
    //   184: aload_3
    //   185: astore 4
    //   187: aload 8
    //   189: invokeinterface 158 1 0
    //   194: lstore 9
    //   196: aload_3
    //   197: astore 4
    //   199: getstatic 164	com/google/android/gms/internal/ads/ra:F	Lcom/google/android/gms/internal/ads/ga;
    //   202: astore 5
    //   204: aload_3
    //   205: astore 4
    //   207: invokestatic 169	com/google/android/gms/internal/ads/Kea:e	()Lcom/google/android/gms/internal/ads/oa;
    //   210: aload 5
    //   212: invokevirtual 174	com/google/android/gms/internal/ads/oa:a	(Lcom/google/android/gms/internal/ads/ga;)Ljava/lang/Object;
    //   215: checkcast 176	java/lang/Long
    //   218: invokevirtual 179	java/lang/Long:longValue	()J
    //   221: lstore 11
    //   223: aload_3
    //   224: astore 4
    //   226: getstatic 182	com/google/android/gms/internal/ads/ra:E	Lcom/google/android/gms/internal/ads/ga;
    //   229: astore 5
    //   231: aload_3
    //   232: astore 4
    //   234: invokestatic 169	com/google/android/gms/internal/ads/Kea:e	()Lcom/google/android/gms/internal/ads/oa;
    //   237: aload 5
    //   239: invokevirtual 174	com/google/android/gms/internal/ads/oa:a	(Lcom/google/android/gms/internal/ads/ga;)Ljava/lang/Object;
    //   242: checkcast 176	java/lang/Long
    //   245: invokevirtual 179	java/lang/Long:longValue	()J
    //   248: lstore 13
    //   250: aload_3
    //   251: astore 4
    //   253: aload_0
    //   254: aload_0
    //   255: getfield 31	com/google/android/gms/internal/ads/gp:e	Lcom/google/android/gms/internal/ads/vn;
    //   258: getfield 184	com/google/android/gms/internal/ads/vn:c	I
    //   261: invokestatic 188	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   264: putfield 55	com/google/android/gms/internal/ads/gp:i	Ljava/nio/ByteBuffer;
    //   267: aload_3
    //   268: astore 4
    //   270: sipush 8192
    //   273: newarray <illegal type>
    //   275: astore 15
    //   277: lload 9
    //   279: lstore 16
    //   281: aload_3
    //   282: astore 4
    //   284: aload 7
    //   286: aload 15
    //   288: iconst_0
    //   289: aload_0
    //   290: getfield 55	com/google/android/gms/internal/ads/gp:i	Ljava/nio/ByteBuffer;
    //   293: invokevirtual 191	java/nio/ByteBuffer:remaining	()I
    //   296: sipush 8192
    //   299: invokestatic 195	java/lang/Math:min	(II)I
    //   302: invokeinterface 199 4 0
    //   307: istore 18
    //   309: iload 18
    //   311: iconst_m1
    //   312: if_icmpne +36 -> 348
    //   315: aload_3
    //   316: astore 4
    //   318: aload_0
    //   319: iconst_1
    //   320: putfield 201	com/google/android/gms/internal/ads/gp:l	Z
    //   323: aload_3
    //   324: astore 4
    //   326: aload_0
    //   327: aload_1
    //   328: aload_2
    //   329: aload_0
    //   330: getfield 43	com/google/android/gms/internal/ads/gp:h	Lcom/google/android/gms/internal/ads/Do;
    //   333: aload_0
    //   334: getfield 55	com/google/android/gms/internal/ads/gp:i	Ljava/nio/ByteBuffer;
    //   337: invokevirtual 58	com/google/android/gms/internal/ads/Do:a	(Ljava/nio/ByteBuffer;)J
    //   340: l2i
    //   341: i2l
    //   342: invokevirtual 204	com/google/android/gms/internal/ads/Lo:a	(Ljava/lang/String;Ljava/lang/String;J)V
    //   345: goto +77 -> 422
    //   348: aload_3
    //   349: astore 4
    //   351: aload_0
    //   352: getfield 48	com/google/android/gms/internal/ads/gp:k	Ljava/lang/Object;
    //   355: astore 5
    //   357: aload_3
    //   358: astore 4
    //   360: aload 5
    //   362: monitorenter
    //   363: aload_0
    //   364: getfield 206	com/google/android/gms/internal/ads/gp:f	Z
    //   367: ifne +26 -> 393
    //   370: aload_0
    //   371: getfield 55	com/google/android/gms/internal/ads/gp:i	Ljava/nio/ByteBuffer;
    //   374: astore 19
    //   376: aload_3
    //   377: astore 4
    //   379: aload 19
    //   381: aload 15
    //   383: iconst_0
    //   384: iload 18
    //   386: invokevirtual 210	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   389: pop
    //   390: goto +3 -> 393
    //   393: aload_3
    //   394: astore 4
    //   396: aload 5
    //   398: monitorexit
    //   399: aload_3
    //   400: astore 4
    //   402: aload_0
    //   403: getfield 55	com/google/android/gms/internal/ads/gp:i	Ljava/nio/ByteBuffer;
    //   406: invokevirtual 191	java/nio/ByteBuffer:remaining	()I
    //   409: ifgt +15 -> 424
    //   412: aload_3
    //   413: astore 4
    //   415: aload_0
    //   416: invokespecial 212	com/google/android/gms/internal/ads/gp:f	()V
    //   419: goto -74 -> 345
    //   422: iconst_1
    //   423: ireturn
    //   424: aload_3
    //   425: astore 4
    //   427: aload_0
    //   428: getfield 206	com/google/android/gms/internal/ads/gp:f	Z
    //   431: ifne +151 -> 582
    //   434: aload_3
    //   435: astore 4
    //   437: aload 8
    //   439: invokeinterface 158 1 0
    //   444: lstore 20
    //   446: lload 16
    //   448: lstore 22
    //   450: lload 20
    //   452: lload 16
    //   454: lsub
    //   455: lload 11
    //   457: lcmp
    //   458: iflt +14 -> 472
    //   461: aload_3
    //   462: astore 4
    //   464: aload_0
    //   465: invokespecial 212	com/google/android/gms/internal/ads/gp:f	()V
    //   468: lload 20
    //   470: lstore 22
    //   472: lload 20
    //   474: lload 9
    //   476: lsub
    //   477: ldc2_w 213
    //   480: lload 13
    //   482: lmul
    //   483: lcmp
    //   484: ifgt +10 -> 494
    //   487: lload 22
    //   489: lstore 16
    //   491: goto -210 -> 281
    //   494: ldc -40
    //   496: astore_3
    //   497: aload_3
    //   498: astore 4
    //   500: new 218	java/lang/StringBuilder
    //   503: astore 7
    //   505: aload_3
    //   506: astore 4
    //   508: aload 7
    //   510: bipush 49
    //   512: invokespecial 221	java/lang/StringBuilder:<init>	(I)V
    //   515: aload_3
    //   516: astore 4
    //   518: aload 7
    //   520: ldc -33
    //   522: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: pop
    //   526: aload_3
    //   527: astore 4
    //   529: aload 7
    //   531: lload 13
    //   533: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   536: pop
    //   537: aload_3
    //   538: astore 4
    //   540: aload 7
    //   542: ldc -24
    //   544: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: pop
    //   548: aload_3
    //   549: astore 4
    //   551: aload 7
    //   553: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   556: astore 5
    //   558: aload_3
    //   559: astore 4
    //   561: new 238	java/io/IOException
    //   564: astore 7
    //   566: aload_3
    //   567: astore 4
    //   569: aload 7
    //   571: aload 5
    //   573: invokespecial 241	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   576: aload_3
    //   577: astore 4
    //   579: aload 7
    //   581: athrow
    //   582: ldc -13
    //   584: astore_3
    //   585: aload_3
    //   586: astore 4
    //   588: new 238	java/io/IOException
    //   591: astore 7
    //   593: aload_3
    //   594: astore 4
    //   596: aload_0
    //   597: getfield 55	com/google/android/gms/internal/ads/gp:i	Ljava/nio/ByteBuffer;
    //   600: invokevirtual 246	java/nio/ByteBuffer:limit	()I
    //   603: istore 18
    //   605: aload_3
    //   606: astore 4
    //   608: new 218	java/lang/StringBuilder
    //   611: astore 5
    //   613: aload_3
    //   614: astore 4
    //   616: aload 5
    //   618: bipush 35
    //   620: invokespecial 221	java/lang/StringBuilder:<init>	(I)V
    //   623: aload_3
    //   624: astore 4
    //   626: aload 5
    //   628: ldc -8
    //   630: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: pop
    //   634: aload_3
    //   635: astore 4
    //   637: aload 5
    //   639: iload 18
    //   641: invokevirtual 251	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   644: pop
    //   645: aload_3
    //   646: astore 4
    //   648: aload 5
    //   650: ldc -3
    //   652: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: pop
    //   656: aload_3
    //   657: astore 4
    //   659: aload 7
    //   661: aload 5
    //   663: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   666: invokespecial 241	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   669: aload_3
    //   670: astore 4
    //   672: aload 7
    //   674: athrow
    //   675: astore 7
    //   677: aload_3
    //   678: astore 4
    //   680: aload 5
    //   682: monitorexit
    //   683: aload_3
    //   684: astore 4
    //   686: aload 7
    //   688: athrow
    //   689: astore_3
    //   690: goto +12 -> 702
    //   693: astore 7
    //   695: aload 4
    //   697: astore_3
    //   698: goto -21 -> 677
    //   701: astore_3
    //   702: aload_3
    //   703: invokevirtual 257	java/lang/Object:getClass	()Ljava/lang/Class;
    //   706: invokevirtual 262	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   709: astore 7
    //   711: aload_3
    //   712: invokevirtual 265	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   715: astore_3
    //   716: new 218	java/lang/StringBuilder
    //   719: dup
    //   720: aload 7
    //   722: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   725: invokevirtual 274	java/lang/String:length	()I
    //   728: iconst_1
    //   729: iadd
    //   730: aload_3
    //   731: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   734: invokevirtual 274	java/lang/String:length	()I
    //   737: iadd
    //   738: invokespecial 221	java/lang/StringBuilder:<init>	(I)V
    //   741: astore 5
    //   743: aload 5
    //   745: aload 7
    //   747: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   750: pop
    //   751: aload 5
    //   753: ldc_w 276
    //   756: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   759: pop
    //   760: aload 5
    //   762: aload_3
    //   763: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   766: pop
    //   767: aload 5
    //   769: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   772: astore_3
    //   773: new 218	java/lang/StringBuilder
    //   776: dup
    //   777: aload_1
    //   778: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   781: invokevirtual 274	java/lang/String:length	()I
    //   784: bipush 34
    //   786: iadd
    //   787: aload_3
    //   788: invokestatic 271	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   791: invokevirtual 274	java/lang/String:length	()I
    //   794: iadd
    //   795: invokespecial 221	java/lang/StringBuilder:<init>	(I)V
    //   798: astore 7
    //   800: aload 7
    //   802: ldc_w 278
    //   805: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   808: pop
    //   809: aload 7
    //   811: aload_1
    //   812: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   815: pop
    //   816: aload 7
    //   818: ldc_w 280
    //   821: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   824: pop
    //   825: aload 7
    //   827: aload_3
    //   828: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   831: pop
    //   832: aload 7
    //   834: invokevirtual 236	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   837: invokestatic 284	com/google/android/gms/internal/ads/Tl:d	(Ljava/lang/String;)V
    //   840: aload_0
    //   841: aload_1
    //   842: aload_2
    //   843: aload 4
    //   845: aload_3
    //   846: invokevirtual 287	com/google/android/gms/internal/ads/Lo:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   849: iconst_0
    //   850: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	851	0	this	gp
    //   0	851	1	paramString	String
    //   10	833	2	str1	String
    //   13	69	3	str2	String
    //   100	362	3	localException1	Exception
    //   496	188	3	str3	String
    //   689	1	3	localException2	Exception
    //   697	1	3	localObject1	Object
    //   701	11	3	localException3	Exception
    //   715	131	3	str4	String
    //   15	829	4	localObject2	Object
    //   20	748	5	localObject3	Object
    //   62	7	6	bool	boolean
    //   66	607	7	localObject4	Object
    //   675	12	7	localObject5	Object
    //   693	1	7	localObject6	Object
    //   709	124	7	localObject7	Object
    //   119	319	8	localObject8	Object
    //   194	281	9	l1	long
    //   221	235	11	l2	long
    //   248	284	13	l3	long
    //   275	107	15	arrayOfByte	byte[]
    //   279	211	16	l4	long
    //   307	333	18	m	int
    //   374	6	19	localByteBuffer	ByteBuffer
    //   444	29	20	l5	long
    //   448	40	22	l6	long
    // Exception table:
    //   from	to	target	type
    //   76	81	100	java/lang/Exception
    //   84	97	100	java/lang/Exception
    //   167	176	100	java/lang/Exception
    //   318	323	100	java/lang/Exception
    //   326	345	100	java/lang/Exception
    //   500	505	100	java/lang/Exception
    //   508	515	100	java/lang/Exception
    //   518	526	100	java/lang/Exception
    //   529	537	100	java/lang/Exception
    //   540	548	100	java/lang/Exception
    //   551	558	100	java/lang/Exception
    //   561	566	100	java/lang/Exception
    //   569	576	100	java/lang/Exception
    //   579	582	100	java/lang/Exception
    //   588	593	100	java/lang/Exception
    //   596	605	100	java/lang/Exception
    //   608	613	100	java/lang/Exception
    //   616	623	100	java/lang/Exception
    //   626	634	100	java/lang/Exception
    //   637	645	100	java/lang/Exception
    //   648	656	100	java/lang/Exception
    //   659	669	100	java/lang/Exception
    //   672	675	100	java/lang/Exception
    //   363	376	675	finally
    //   402	412	689	java/lang/Exception
    //   415	419	689	java/lang/Exception
    //   427	434	689	java/lang/Exception
    //   437	446	689	java/lang/Exception
    //   464	468	689	java/lang/Exception
    //   686	689	689	java/lang/Exception
    //   379	390	693	finally
    //   396	399	693	finally
    //   680	683	693	finally
    //   17	22	701	java/lang/Exception
    //   25	52	701	java/lang/Exception
    //   55	64	701	java/lang/Exception
    //   107	113	701	java/lang/Exception
    //   116	121	701	java/lang/Exception
    //   124	131	701	java/lang/Exception
    //   134	144	701	java/lang/Exception
    //   147	159	701	java/lang/Exception
    //   179	184	701	java/lang/Exception
    //   187	196	701	java/lang/Exception
    //   199	204	701	java/lang/Exception
    //   207	223	701	java/lang/Exception
    //   226	231	701	java/lang/Exception
    //   234	250	701	java/lang/Exception
    //   253	267	701	java/lang/Exception
    //   270	277	701	java/lang/Exception
    //   284	309	701	java/lang/Exception
    //   351	357	701	java/lang/Exception
    //   360	363	701	java/lang/Exception
  }
  
  protected final String b(String paramString)
  {
    paramString = String.valueOf(super.b(paramString));
    if (paramString.length() != 0) {
      return "cache:".concat(paramString);
    }
    return new String("cache:");
  }
  
  public final void b()
  {
    this.f = true;
  }
  
  public final ByteBuffer c()
  {
    synchronized (this.k)
    {
      if ((this.i != null) && (!this.j))
      {
        this.i.flip();
        this.j = true;
      }
      this.f = true;
      return this.i;
    }
  }
  
  public final String d()
  {
    return this.d;
  }
  
  public final boolean e()
  {
    return this.l;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */