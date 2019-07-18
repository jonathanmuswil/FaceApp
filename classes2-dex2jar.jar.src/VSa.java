public final class vsa
{
  public static final vsa a = new vsa();
  
  /* Error */
  private final String a(WOa.c paramc)
  {
    // Byte code:
    //   0: ldc 34
    //   2: invokestatic 40	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   5: astore_2
    //   6: aload_2
    //   7: ldc 42
    //   9: invokestatic 47	oXa:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: aload_1
    //   13: invokeinterface 52 1 0
    //   18: astore_1
    //   19: sipush 8192
    //   22: newarray <illegal type>
    //   24: astore_3
    //   25: iconst_0
    //   26: istore 4
    //   28: iload 4
    //   30: iconst_m1
    //   31: if_icmpeq +34 -> 65
    //   34: aload_1
    //   35: aload_3
    //   36: invokevirtual 58	java/io/InputStream:read	([B)I
    //   39: istore 5
    //   41: iload 5
    //   43: istore 4
    //   45: iload 5
    //   47: ifle -19 -> 28
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: iload 5
    //   55: invokevirtual 62	java/security/MessageDigest:update	([BII)V
    //   58: iload 5
    //   60: istore 4
    //   62: goto -34 -> 28
    //   65: aload_2
    //   66: invokevirtual 66	java/security/MessageDigest:digest	()[B
    //   69: astore_3
    //   70: new 68	java/math/BigInteger
    //   73: astore_2
    //   74: aload_2
    //   75: iconst_1
    //   76: aload_3
    //   77: invokespecial 71	java/math/BigInteger:<init>	(I[B)V
    //   80: getstatic 76	yXa:a	LyXa;
    //   83: astore_3
    //   84: iconst_1
    //   85: anewarray 4	java/lang/Object
    //   88: astore_3
    //   89: aload_3
    //   90: iconst_0
    //   91: aload_2
    //   92: bipush 16
    //   94: invokevirtual 80	java/math/BigInteger:toString	(I)Ljava/lang/String;
    //   97: aastore
    //   98: ldc 82
    //   100: aload_3
    //   101: aload_3
    //   102: arraylength
    //   103: invokestatic 88	java/util/Arrays:copyOf	([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   106: invokestatic 94	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   109: astore_2
    //   110: aload_2
    //   111: ldc 96
    //   113: invokestatic 47	oXa:a	(Ljava/lang/Object;Ljava/lang/String;)V
    //   116: aload_2
    //   117: bipush 32
    //   119: bipush 48
    //   121: iconst_0
    //   122: iconst_4
    //   123: aconst_null
    //   124: invokestatic 101	zYa:a	(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;
    //   127: astore_2
    //   128: aload_1
    //   129: invokevirtual 104	java/io/InputStream:close	()V
    //   132: aload_2
    //   133: areturn
    //   134: astore_2
    //   135: goto +25 -> 160
    //   138: astore_2
    //   139: ldc 106
    //   141: invokestatic 111	icb:a	(Ljava/lang/String;)Licb$a;
    //   144: aload_2
    //   145: ldc 113
    //   147: iconst_0
    //   148: anewarray 4	java/lang/Object
    //   151: invokevirtual 118	icb$a:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: aload_1
    //   155: invokevirtual 104	java/io/InputStream:close	()V
    //   158: aconst_null
    //   159: areturn
    //   160: aload_1
    //   161: invokevirtual 104	java/io/InputStream:close	()V
    //   164: aload_2
    //   165: athrow
    //   166: astore_1
    //   167: ldc 106
    //   169: invokestatic 111	icb:a	(Ljava/lang/String;)Licb$a;
    //   172: aload_1
    //   173: ldc 120
    //   175: iconst_0
    //   176: anewarray 4	java/lang/Object
    //   179: invokevirtual 118	icb$a:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: aconst_null
    //   183: areturn
    //   184: astore_1
    //   185: ldc 106
    //   187: invokestatic 111	icb:a	(Ljava/lang/String;)Licb$a;
    //   190: aload_1
    //   191: ldc 122
    //   193: iconst_0
    //   194: anewarray 4	java/lang/Object
    //   197: invokevirtual 118	icb$a:a	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: aconst_null
    //   201: areturn
    //   202: astore_1
    //   203: goto -71 -> 132
    //   206: astore_1
    //   207: goto -49 -> 158
    //   210: astore_1
    //   211: goto -47 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	vsa
    //   0	214	1	paramc	WOa.c
    //   5	128	2	localObject1	Object
    //   134	1	2	localObject2	Object
    //   138	27	2	localIOException	java.io.IOException
    //   24	78	3	localObject3	Object
    //   26	35	4	i	int
    //   39	20	5	j	int
    // Exception table:
    //   from	to	target	type
    //   34	41	134	finally
    //   50	58	134	finally
    //   65	128	134	finally
    //   139	154	134	finally
    //   34	41	138	java/io/IOException
    //   50	58	138	java/io/IOException
    //   65	128	138	java/io/IOException
    //   12	19	166	java/lang/Exception
    //   0	12	184	java/security/NoSuchAlgorithmException
    //   128	132	202	java/io/IOException
    //   154	158	206	java/io/IOException
    //   160	164	210	java/io/IOException
  }
  
  private final xQa b(Rja paramRja, String paramString, bfa parambfa)
  {
    paramRja = xQa.a(new zsa(paramRja, paramString, parambfa));
    oXa.a(paramRja, "Completable.create { emi…mitter.onComplete()\n    }");
    return paramRja;
  }
  
  public final XQa<NOa<vsa.a>> a(Rja paramRja)
  {
    oXa.b(paramRja, "imageDesc");
    if ((paramRja instanceof Tja))
    {
      paramRja = ((Tja)paramRja).a();
      paramRja = XQa.a(new NOa(new vsa.a("n/a", paramRja.n(), paramRja.l(), paramRja.m())));
      oXa.a(paramRja, "Single.just(Box(demoCacheInfo))");
      return paramRja;
    }
    paramRja = XQa.a(new xsa(paramRja));
    oXa.a(paramRja, "Single.defer {\n         …le.just(result)\n        }");
    return paramRja;
  }
  
  public final void a()
  {
    KOa.b.b(wsa.b);
  }
  
  public final void a(Rja paramRja, String paramString, bfa parambfa)
  {
    oXa.b(paramRja, "imageDesc");
    oXa.b(paramString, "photoCode");
    oXa.b(parambfa, "host");
    if ((paramRja instanceof Tja)) {
      return;
    }
    KOa.b.b(new ysa(paramRja, paramString, parambfa));
  }
  
  public static final class a
  {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    
    public a(String paramString1, String paramString2, String paramString3, int paramInt)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.c = paramString3;
      this.d = paramInt;
    }
    
    public final String a()
    {
      return this.a;
    }
    
    public final String b()
    {
      return this.c;
    }
    
    public final int c()
    {
      return this.d;
    }
    
    public final String d()
    {
      return this.b;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b)) && (oXa.a(this.c, ((a)paramObject).c)))
          {
            int i;
            if (this.d == ((a)paramObject).d) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label86;
            }
          }
        }
        return false;
      }
      label86:
      return true;
    }
    
    public int hashCode()
    {
      String str = this.a;
      int i = 0;
      int j;
      if (str != null) {
        j = str.hashCode();
      } else {
        j = 0;
      }
      str = this.b;
      int k;
      if (str != null) {
        k = str.hashCode();
      } else {
        k = 0;
      }
      str = this.c;
      if (str != null) {
        i = str.hashCode();
      }
      return ((j * 31 + k) * 31 + i) * 31 + this.d;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CacheInfo(fileMd5=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", photoCode=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(", hostName=");
      localStringBuilder.append(this.c);
      localStringBuilder.append(", hostPort=");
      localStringBuilder.append(this.d);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/vsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */