import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class Va$b
{
  public final int a;
  public final int b;
  public final byte[] c;
  
  Va$b(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramArrayOfByte;
  }
  
  public static b a(int paramInt, ByteOrder paramByteOrder)
  {
    return a(new int[] { paramInt }, paramByteOrder);
  }
  
  public static b a(long paramLong, ByteOrder paramByteOrder)
  {
    return a(new long[] { paramLong }, paramByteOrder);
  }
  
  public static b a(Va.d paramd, ByteOrder paramByteOrder)
  {
    return a(new Va.d[] { paramd }, paramByteOrder);
  }
  
  public static b a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append('\000');
    paramString = localStringBuilder.toString().getBytes(Va.E);
    return new b(2, paramString.length, paramString);
  }
  
  public static b a(int[] paramArrayOfInt, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[Va.k[3] * paramArrayOfInt.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putShort((short)paramArrayOfInt[j]);
    }
    return new b(3, paramArrayOfInt.length, localByteBuffer.array());
  }
  
  public static b a(long[] paramArrayOfLong, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[Va.k[4] * paramArrayOfLong.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfLong.length;
    for (int j = 0; j < i; j++) {
      localByteBuffer.putInt((int)paramArrayOfLong[j]);
    }
    return new b(4, paramArrayOfLong.length, localByteBuffer.array());
  }
  
  public static b a(Va.d[] paramArrayOfd, ByteOrder paramByteOrder)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(new byte[Va.k[5] * paramArrayOfd.length]);
    localByteBuffer.order(paramByteOrder);
    int i = paramArrayOfd.length;
    for (int j = 0; j < i; j++)
    {
      paramByteOrder = paramArrayOfd[j];
      localByteBuffer.putInt((int)paramByteOrder.a);
      localByteBuffer.putInt((int)paramByteOrder.b);
    }
    return new b(5, paramArrayOfd.length, localByteBuffer.array());
  }
  
  public double a(ByteOrder paramByteOrder)
  {
    paramByteOrder = d(paramByteOrder);
    if (paramByteOrder != null)
    {
      if ((paramByteOrder instanceof String)) {
        return Double.parseDouble((String)paramByteOrder);
      }
      if ((paramByteOrder instanceof long[]))
      {
        paramByteOrder = (long[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof int[]))
      {
        paramByteOrder = (int[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof double[]))
      {
        paramByteOrder = (double[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof Va.d[]))
      {
        paramByteOrder = (Va.d[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0].a();
        }
        throw new NumberFormatException("There are more than one component");
      }
      throw new NumberFormatException("Couldn't find a double value");
    }
    throw new NumberFormatException("NULL can't be converted to a double value");
  }
  
  public int b(ByteOrder paramByteOrder)
  {
    paramByteOrder = d(paramByteOrder);
    if (paramByteOrder != null)
    {
      if ((paramByteOrder instanceof String)) {
        return Integer.parseInt((String)paramByteOrder);
      }
      if ((paramByteOrder instanceof long[]))
      {
        paramByteOrder = (long[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return (int)paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      if ((paramByteOrder instanceof int[]))
      {
        paramByteOrder = (int[])paramByteOrder;
        if (paramByteOrder.length == 1) {
          return paramByteOrder[0];
        }
        throw new NumberFormatException("There are more than one component");
      }
      throw new NumberFormatException("Couldn't find a integer value");
    }
    throw new NumberFormatException("NULL can't be converted to a integer value");
  }
  
  public String c(ByteOrder paramByteOrder)
  {
    Object localObject = d(paramByteOrder);
    if (localObject == null) {
      return null;
    }
    if ((localObject instanceof String)) {
      return (String)localObject;
    }
    paramByteOrder = new StringBuilder();
    boolean bool = localObject instanceof long[];
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (bool)
    {
      localObject = (long[])localObject;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m]);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    if ((localObject instanceof int[]))
    {
      localObject = (int[])localObject;
      m = i;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m]);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    if ((localObject instanceof double[]))
    {
      localObject = (double[])localObject;
      m = j;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m]);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    if ((localObject instanceof Va.d[]))
    {
      localObject = (Va.d[])localObject;
      m = k;
      while (m < localObject.length)
      {
        paramByteOrder.append(localObject[m].a);
        paramByteOrder.append('/');
        paramByteOrder.append(localObject[m].b);
        i = m + 1;
        m = i;
        if (i != localObject.length)
        {
          paramByteOrder.append(",");
          m = i;
        }
      }
      return paramByteOrder.toString();
    }
    return null;
  }
  
  /* Error */
  Object d(ByteOrder paramByteOrder)
  {
    // Byte code:
    //   0: new 154	Va$a
    //   3: astore_2
    //   4: aload_2
    //   5: aload_0
    //   6: getfield 22	Va$b:c	[B
    //   9: invokespecial 157	Va$a:<init>	([B)V
    //   12: aload_2
    //   13: astore_3
    //   14: aload_2
    //   15: aload_1
    //   16: invokevirtual 160	Va$a:a	(Ljava/nio/ByteOrder;)V
    //   19: aload_2
    //   20: astore_3
    //   21: aload_0
    //   22: getfield 18	Va$b:a	I
    //   25: istore 4
    //   27: iconst_1
    //   28: istore 5
    //   30: iconst_0
    //   31: istore 6
    //   33: iconst_0
    //   34: istore 7
    //   36: iconst_0
    //   37: istore 8
    //   39: iconst_0
    //   40: istore 9
    //   42: iconst_0
    //   43: istore 10
    //   45: iconst_0
    //   46: istore 11
    //   48: iconst_0
    //   49: istore 12
    //   51: iconst_0
    //   52: istore 13
    //   54: iconst_0
    //   55: istore 14
    //   57: iload 4
    //   59: tableswitch	default:+61->120, 1:+744->803, 2:+559->618, 3:+500->559, 4:+441->500, 5:+370->429, 6:+744->803, 7:+559->618, 8:+311->370, 9:+252->311, 10:+179->238, 11:+119->178, 12:+64->123
    //   120: goto +798 -> 918
    //   123: aload_2
    //   124: astore_3
    //   125: aload_0
    //   126: getfield 20	Va$b:b	I
    //   129: newarray <illegal type>
    //   131: astore_1
    //   132: aload_2
    //   133: astore_3
    //   134: iload 14
    //   136: aload_0
    //   137: getfield 20	Va$b:b	I
    //   140: if_icmpge +19 -> 159
    //   143: aload_2
    //   144: astore_3
    //   145: aload_1
    //   146: iload 14
    //   148: aload_2
    //   149: invokevirtual 163	Va$a:readDouble	()D
    //   152: dastore
    //   153: iinc 14 1
    //   156: goto -24 -> 132
    //   159: aload_2
    //   160: invokevirtual 168	java/io/InputStream:close	()V
    //   163: goto +13 -> 176
    //   166: astore_3
    //   167: ldc -86
    //   169: ldc -84
    //   171: aload_3
    //   172: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   175: pop
    //   176: aload_1
    //   177: areturn
    //   178: aload_2
    //   179: astore_3
    //   180: aload_0
    //   181: getfield 20	Va$b:b	I
    //   184: newarray <illegal type>
    //   186: astore_1
    //   187: iload 6
    //   189: istore 14
    //   191: aload_2
    //   192: astore_3
    //   193: iload 14
    //   195: aload_0
    //   196: getfield 20	Va$b:b	I
    //   199: if_icmpge +20 -> 219
    //   202: aload_2
    //   203: astore_3
    //   204: aload_1
    //   205: iload 14
    //   207: aload_2
    //   208: invokevirtual 182	Va$a:readFloat	()F
    //   211: f2d
    //   212: dastore
    //   213: iinc 14 1
    //   216: goto -25 -> 191
    //   219: aload_2
    //   220: invokevirtual 168	java/io/InputStream:close	()V
    //   223: goto +13 -> 236
    //   226: astore_3
    //   227: ldc -86
    //   229: ldc -84
    //   231: aload_3
    //   232: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   235: pop
    //   236: aload_1
    //   237: areturn
    //   238: aload_2
    //   239: astore_3
    //   240: aload_0
    //   241: getfield 20	Va$b:b	I
    //   244: anewarray 34	Va$d
    //   247: astore_1
    //   248: iload 7
    //   250: istore 14
    //   252: aload_2
    //   253: astore_3
    //   254: iload 14
    //   256: aload_0
    //   257: getfield 20	Va$b:b	I
    //   260: if_icmpge +32 -> 292
    //   263: aload_2
    //   264: astore_3
    //   265: aload_1
    //   266: iload 14
    //   268: new 34	Va$d
    //   271: dup
    //   272: aload_2
    //   273: invokevirtual 186	Va$a:readInt	()I
    //   276: i2l
    //   277: aload_2
    //   278: invokevirtual 186	Va$a:readInt	()I
    //   281: i2l
    //   282: invokespecial 189	Va$d:<init>	(JJ)V
    //   285: aastore
    //   286: iinc 14 1
    //   289: goto -37 -> 252
    //   292: aload_2
    //   293: invokevirtual 168	java/io/InputStream:close	()V
    //   296: goto +13 -> 309
    //   299: astore_3
    //   300: ldc -86
    //   302: ldc -84
    //   304: aload_3
    //   305: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   308: pop
    //   309: aload_1
    //   310: areturn
    //   311: aload_2
    //   312: astore_3
    //   313: aload_0
    //   314: getfield 20	Va$b:b	I
    //   317: newarray <illegal type>
    //   319: astore_1
    //   320: iload 8
    //   322: istore 14
    //   324: aload_2
    //   325: astore_3
    //   326: iload 14
    //   328: aload_0
    //   329: getfield 20	Va$b:b	I
    //   332: if_icmpge +19 -> 351
    //   335: aload_2
    //   336: astore_3
    //   337: aload_1
    //   338: iload 14
    //   340: aload_2
    //   341: invokevirtual 186	Va$a:readInt	()I
    //   344: iastore
    //   345: iinc 14 1
    //   348: goto -24 -> 324
    //   351: aload_2
    //   352: invokevirtual 168	java/io/InputStream:close	()V
    //   355: goto +13 -> 368
    //   358: astore_3
    //   359: ldc -86
    //   361: ldc -84
    //   363: aload_3
    //   364: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   367: pop
    //   368: aload_1
    //   369: areturn
    //   370: aload_2
    //   371: astore_3
    //   372: aload_0
    //   373: getfield 20	Va$b:b	I
    //   376: newarray <illegal type>
    //   378: astore_1
    //   379: iload 9
    //   381: istore 14
    //   383: aload_2
    //   384: astore_3
    //   385: iload 14
    //   387: aload_0
    //   388: getfield 20	Va$b:b	I
    //   391: if_icmpge +19 -> 410
    //   394: aload_2
    //   395: astore_3
    //   396: aload_1
    //   397: iload 14
    //   399: aload_2
    //   400: invokevirtual 193	Va$a:readShort	()S
    //   403: iastore
    //   404: iinc 14 1
    //   407: goto -24 -> 383
    //   410: aload_2
    //   411: invokevirtual 168	java/io/InputStream:close	()V
    //   414: goto +13 -> 427
    //   417: astore_3
    //   418: ldc -86
    //   420: ldc -84
    //   422: aload_3
    //   423: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   426: pop
    //   427: aload_1
    //   428: areturn
    //   429: aload_2
    //   430: astore_3
    //   431: aload_0
    //   432: getfield 20	Va$b:b	I
    //   435: anewarray 34	Va$d
    //   438: astore_1
    //   439: iload 10
    //   441: istore 14
    //   443: aload_2
    //   444: astore_3
    //   445: iload 14
    //   447: aload_0
    //   448: getfield 20	Va$b:b	I
    //   451: if_icmpge +30 -> 481
    //   454: aload_2
    //   455: astore_3
    //   456: aload_1
    //   457: iload 14
    //   459: new 34	Va$d
    //   462: dup
    //   463: aload_2
    //   464: invokevirtual 196	Va$a:b	()J
    //   467: aload_2
    //   468: invokevirtual 196	Va$a:b	()J
    //   471: invokespecial 189	Va$d:<init>	(JJ)V
    //   474: aastore
    //   475: iinc 14 1
    //   478: goto -35 -> 443
    //   481: aload_2
    //   482: invokevirtual 168	java/io/InputStream:close	()V
    //   485: goto +13 -> 498
    //   488: astore_3
    //   489: ldc -86
    //   491: ldc -84
    //   493: aload_3
    //   494: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   497: pop
    //   498: aload_1
    //   499: areturn
    //   500: aload_2
    //   501: astore_3
    //   502: aload_0
    //   503: getfield 20	Va$b:b	I
    //   506: newarray <illegal type>
    //   508: astore_1
    //   509: iload 11
    //   511: istore 14
    //   513: aload_2
    //   514: astore_3
    //   515: iload 14
    //   517: aload_0
    //   518: getfield 20	Va$b:b	I
    //   521: if_icmpge +19 -> 540
    //   524: aload_2
    //   525: astore_3
    //   526: aload_1
    //   527: iload 14
    //   529: aload_2
    //   530: invokevirtual 196	Va$a:b	()J
    //   533: lastore
    //   534: iinc 14 1
    //   537: goto -24 -> 513
    //   540: aload_2
    //   541: invokevirtual 168	java/io/InputStream:close	()V
    //   544: goto +13 -> 557
    //   547: astore_3
    //   548: ldc -86
    //   550: ldc -84
    //   552: aload_3
    //   553: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   556: pop
    //   557: aload_1
    //   558: areturn
    //   559: aload_2
    //   560: astore_3
    //   561: aload_0
    //   562: getfield 20	Va$b:b	I
    //   565: newarray <illegal type>
    //   567: astore_1
    //   568: iload 12
    //   570: istore 14
    //   572: aload_2
    //   573: astore_3
    //   574: iload 14
    //   576: aload_0
    //   577: getfield 20	Va$b:b	I
    //   580: if_icmpge +19 -> 599
    //   583: aload_2
    //   584: astore_3
    //   585: aload_1
    //   586: iload 14
    //   588: aload_2
    //   589: invokevirtual 199	Va$a:readUnsignedShort	()I
    //   592: iastore
    //   593: iinc 14 1
    //   596: goto -24 -> 572
    //   599: aload_2
    //   600: invokevirtual 168	java/io/InputStream:close	()V
    //   603: goto +13 -> 616
    //   606: astore_3
    //   607: ldc -86
    //   609: ldc -84
    //   611: aload_3
    //   612: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   615: pop
    //   616: aload_1
    //   617: areturn
    //   618: iload 13
    //   620: istore 14
    //   622: aload_2
    //   623: astore_3
    //   624: aload_0
    //   625: getfield 20	Va$b:b	I
    //   628: getstatic 202	Va:l	[B
    //   631: arraylength
    //   632: if_icmplt +68 -> 700
    //   635: iconst_0
    //   636: istore 14
    //   638: iload 5
    //   640: istore 6
    //   642: aload_2
    //   643: astore_3
    //   644: iload 14
    //   646: getstatic 202	Va:l	[B
    //   649: arraylength
    //   650: if_icmpge +33 -> 683
    //   653: aload_2
    //   654: astore_3
    //   655: aload_0
    //   656: getfield 22	Va$b:c	[B
    //   659: iload 14
    //   661: baload
    //   662: getstatic 202	Va:l	[B
    //   665: iload 14
    //   667: baload
    //   668: if_icmpeq +9 -> 677
    //   671: iconst_0
    //   672: istore 6
    //   674: goto +9 -> 683
    //   677: iinc 14 1
    //   680: goto -42 -> 638
    //   683: iload 13
    //   685: istore 14
    //   687: iload 6
    //   689: ifeq +11 -> 700
    //   692: aload_2
    //   693: astore_3
    //   694: getstatic 202	Va:l	[B
    //   697: arraylength
    //   698: istore 14
    //   700: aload_2
    //   701: astore_3
    //   702: new 40	java/lang/StringBuilder
    //   705: astore_1
    //   706: aload_2
    //   707: astore_3
    //   708: aload_1
    //   709: invokespecial 41	java/lang/StringBuilder:<init>	()V
    //   712: aload_2
    //   713: astore_3
    //   714: iload 14
    //   716: aload_0
    //   717: getfield 20	Va$b:b	I
    //   720: if_icmpge +57 -> 777
    //   723: aload_2
    //   724: astore_3
    //   725: aload_0
    //   726: getfield 22	Va$b:c	[B
    //   729: iload 14
    //   731: baload
    //   732: istore 6
    //   734: iload 6
    //   736: ifne +6 -> 742
    //   739: goto +38 -> 777
    //   742: iload 6
    //   744: bipush 32
    //   746: if_icmplt +16 -> 762
    //   749: aload_2
    //   750: astore_3
    //   751: aload_1
    //   752: iload 6
    //   754: i2c
    //   755: invokevirtual 48	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   758: pop
    //   759: goto +12 -> 771
    //   762: aload_2
    //   763: astore_3
    //   764: aload_1
    //   765: bipush 63
    //   767: invokevirtual 48	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   770: pop
    //   771: iinc 14 1
    //   774: goto -62 -> 712
    //   777: aload_2
    //   778: astore_3
    //   779: aload_1
    //   780: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   783: astore_1
    //   784: aload_2
    //   785: invokevirtual 168	java/io/InputStream:close	()V
    //   788: goto +13 -> 801
    //   791: astore_3
    //   792: ldc -86
    //   794: ldc -84
    //   796: aload_3
    //   797: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   800: pop
    //   801: aload_1
    //   802: areturn
    //   803: aload_2
    //   804: astore_3
    //   805: aload_0
    //   806: getfield 22	Va$b:c	[B
    //   809: arraylength
    //   810: iconst_1
    //   811: if_icmpne +71 -> 882
    //   814: aload_2
    //   815: astore_3
    //   816: aload_0
    //   817: getfield 22	Va$b:c	[B
    //   820: iconst_0
    //   821: baload
    //   822: iflt +60 -> 882
    //   825: aload_2
    //   826: astore_3
    //   827: aload_0
    //   828: getfield 22	Va$b:c	[B
    //   831: iconst_0
    //   832: baload
    //   833: iconst_1
    //   834: if_icmpgt +48 -> 882
    //   837: aload_2
    //   838: astore_3
    //   839: new 58	java/lang/String
    //   842: dup
    //   843: iconst_1
    //   844: newarray <illegal type>
    //   846: dup
    //   847: iconst_0
    //   848: aload_0
    //   849: getfield 22	Va$b:c	[B
    //   852: iconst_0
    //   853: baload
    //   854: bipush 48
    //   856: iadd
    //   857: i2c
    //   858: castore
    //   859: invokespecial 205	java/lang/String:<init>	([C)V
    //   862: astore_1
    //   863: aload_2
    //   864: invokevirtual 168	java/io/InputStream:close	()V
    //   867: goto +13 -> 880
    //   870: astore_3
    //   871: ldc -86
    //   873: ldc -84
    //   875: aload_3
    //   876: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   879: pop
    //   880: aload_1
    //   881: areturn
    //   882: aload_2
    //   883: astore_3
    //   884: new 58	java/lang/String
    //   887: dup
    //   888: aload_0
    //   889: getfield 22	Va$b:c	[B
    //   892: getstatic 56	Va:E	Ljava/nio/charset/Charset;
    //   895: invokespecial 208	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   898: astore_1
    //   899: aload_2
    //   900: invokevirtual 168	java/io/InputStream:close	()V
    //   903: goto +13 -> 916
    //   906: astore_3
    //   907: ldc -86
    //   909: ldc -84
    //   911: aload_3
    //   912: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   915: pop
    //   916: aload_1
    //   917: areturn
    //   918: aload_2
    //   919: invokevirtual 168	java/io/InputStream:close	()V
    //   922: goto +13 -> 935
    //   925: astore_1
    //   926: ldc -86
    //   928: ldc -84
    //   930: aload_1
    //   931: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   934: pop
    //   935: aconst_null
    //   936: areturn
    //   937: astore_3
    //   938: aload_2
    //   939: astore_1
    //   940: aload_3
    //   941: astore_2
    //   942: goto +12 -> 954
    //   945: astore_1
    //   946: aconst_null
    //   947: astore_3
    //   948: goto +41 -> 989
    //   951: astore_2
    //   952: aconst_null
    //   953: astore_1
    //   954: aload_1
    //   955: astore_3
    //   956: ldc -86
    //   958: ldc -46
    //   960: aload_2
    //   961: invokestatic 213	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   964: pop
    //   965: aload_1
    //   966: ifnull +20 -> 986
    //   969: aload_1
    //   970: invokevirtual 168	java/io/InputStream:close	()V
    //   973: goto +13 -> 986
    //   976: astore_1
    //   977: ldc -86
    //   979: ldc -84
    //   981: aload_1
    //   982: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   985: pop
    //   986: aconst_null
    //   987: areturn
    //   988: astore_1
    //   989: aload_3
    //   990: ifnull +20 -> 1010
    //   993: aload_3
    //   994: invokevirtual 168	java/io/InputStream:close	()V
    //   997: goto +13 -> 1010
    //   1000: astore_3
    //   1001: ldc -86
    //   1003: ldc -84
    //   1005: aload_3
    //   1006: invokestatic 178	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1009: pop
    //   1010: aload_1
    //   1011: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1012	0	this	b
    //   0	1012	1	paramByteOrder	ByteOrder
    //   3	939	2	localObject1	Object
    //   951	10	2	localIOException1	java.io.IOException
    //   13	132	3	localObject2	Object
    //   166	6	3	localIOException2	java.io.IOException
    //   179	25	3	localObject3	Object
    //   226	6	3	localIOException3	java.io.IOException
    //   239	26	3	localObject4	Object
    //   299	6	3	localIOException4	java.io.IOException
    //   312	25	3	localObject5	Object
    //   358	6	3	localIOException5	java.io.IOException
    //   371	25	3	localObject6	Object
    //   417	6	3	localIOException6	java.io.IOException
    //   430	26	3	localObject7	Object
    //   488	6	3	localIOException7	java.io.IOException
    //   501	25	3	localObject8	Object
    //   547	6	3	localIOException8	java.io.IOException
    //   560	25	3	localObject9	Object
    //   606	6	3	localIOException9	java.io.IOException
    //   623	156	3	localObject10	Object
    //   791	6	3	localIOException10	java.io.IOException
    //   804	35	3	localObject11	Object
    //   870	6	3	localIOException11	java.io.IOException
    //   883	1	3	localObject12	Object
    //   906	6	3	localIOException12	java.io.IOException
    //   937	4	3	localIOException13	java.io.IOException
    //   947	47	3	localByteOrder	ByteOrder
    //   1000	6	3	localIOException14	java.io.IOException
    //   25	33	4	i	int
    //   28	611	5	j	int
    //   31	722	6	k	int
    //   34	215	7	m	int
    //   37	284	8	n	int
    //   40	340	9	i1	int
    //   43	397	10	i2	int
    //   46	464	11	i3	int
    //   49	520	12	i4	int
    //   52	632	13	i5	int
    //   55	717	14	i6	int
    // Exception table:
    //   from	to	target	type
    //   159	163	166	java/io/IOException
    //   219	223	226	java/io/IOException
    //   292	296	299	java/io/IOException
    //   351	355	358	java/io/IOException
    //   410	414	417	java/io/IOException
    //   481	485	488	java/io/IOException
    //   540	544	547	java/io/IOException
    //   599	603	606	java/io/IOException
    //   784	788	791	java/io/IOException
    //   863	867	870	java/io/IOException
    //   899	903	906	java/io/IOException
    //   918	922	925	java/io/IOException
    //   14	19	937	java/io/IOException
    //   21	27	937	java/io/IOException
    //   125	132	937	java/io/IOException
    //   134	143	937	java/io/IOException
    //   145	153	937	java/io/IOException
    //   180	187	937	java/io/IOException
    //   193	202	937	java/io/IOException
    //   204	213	937	java/io/IOException
    //   240	248	937	java/io/IOException
    //   254	263	937	java/io/IOException
    //   265	286	937	java/io/IOException
    //   313	320	937	java/io/IOException
    //   326	335	937	java/io/IOException
    //   337	345	937	java/io/IOException
    //   372	379	937	java/io/IOException
    //   385	394	937	java/io/IOException
    //   396	404	937	java/io/IOException
    //   431	439	937	java/io/IOException
    //   445	454	937	java/io/IOException
    //   456	475	937	java/io/IOException
    //   502	509	937	java/io/IOException
    //   515	524	937	java/io/IOException
    //   526	534	937	java/io/IOException
    //   561	568	937	java/io/IOException
    //   574	583	937	java/io/IOException
    //   585	593	937	java/io/IOException
    //   624	635	937	java/io/IOException
    //   644	653	937	java/io/IOException
    //   655	671	937	java/io/IOException
    //   694	700	937	java/io/IOException
    //   702	706	937	java/io/IOException
    //   708	712	937	java/io/IOException
    //   714	723	937	java/io/IOException
    //   725	734	937	java/io/IOException
    //   751	759	937	java/io/IOException
    //   764	771	937	java/io/IOException
    //   779	784	937	java/io/IOException
    //   805	814	937	java/io/IOException
    //   816	825	937	java/io/IOException
    //   827	837	937	java/io/IOException
    //   839	863	937	java/io/IOException
    //   884	899	937	java/io/IOException
    //   0	12	945	finally
    //   0	12	951	java/io/IOException
    //   969	973	976	java/io/IOException
    //   14	19	988	finally
    //   21	27	988	finally
    //   125	132	988	finally
    //   134	143	988	finally
    //   145	153	988	finally
    //   180	187	988	finally
    //   193	202	988	finally
    //   204	213	988	finally
    //   240	248	988	finally
    //   254	263	988	finally
    //   265	286	988	finally
    //   313	320	988	finally
    //   326	335	988	finally
    //   337	345	988	finally
    //   372	379	988	finally
    //   385	394	988	finally
    //   396	404	988	finally
    //   431	439	988	finally
    //   445	454	988	finally
    //   456	475	988	finally
    //   502	509	988	finally
    //   515	524	988	finally
    //   526	534	988	finally
    //   561	568	988	finally
    //   574	583	988	finally
    //   585	593	988	finally
    //   624	635	988	finally
    //   644	653	988	finally
    //   655	671	988	finally
    //   694	700	988	finally
    //   702	706	988	finally
    //   708	712	988	finally
    //   714	723	988	finally
    //   725	734	988	finally
    //   751	759	988	finally
    //   764	771	988	finally
    //   779	784	988	finally
    //   805	814	988	finally
    //   816	825	988	finally
    //   827	837	988	finally
    //   839	863	988	finally
    //   884	899	988	finally
    //   956	965	988	finally
    //   993	997	1000	java/io/IOException
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    localStringBuilder.append(Va.j[this.a]);
    localStringBuilder.append(", data length:");
    localStringBuilder.append(this.c.length);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Va$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */