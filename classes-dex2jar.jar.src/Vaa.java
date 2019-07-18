import java.io.IOException;

public final class vaa
  extends PT<vaa, vaa.a>
  implements xaa
{
  private static final vaa d = new vaa();
  private static volatile YT<vaa> e;
  private vaa.b f;
  private GT g = GT.a;
  private String h = "";
  
  static
  {
    d.h();
  }
  
  private void a(GT paramGT)
  {
    if (paramGT != null)
    {
      this.g = paramGT;
      return;
    }
    throw new NullPointerException();
  }
  
  private void a(vaa.b paramb)
  {
    if (paramb != null)
    {
      this.f = paramb;
      return;
    }
    throw new NullPointerException();
  }
  
  private void b(String paramString)
  {
    if (paramString != null)
    {
      this.h = paramString;
      return;
    }
    throw new NullPointerException();
  }
  
  public static vaa.a m()
  {
    return (vaa.a)d.c();
  }
  
  public static YT<vaa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 94	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 100	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+454->472, 2:+450->468, 3:+448->466, 4:+439->457, 5:+310->328, 6:+100->118, 7:+306->324, 8:+54->72
    //   64: new 102	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 103	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 105	vaa:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 105	vaa:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 107	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 40	vaa:d	Lvaa;
    //   95: invokespecial 110	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 105	vaa:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 105	vaa:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 112	HT
    //   122: astore_2
    //   123: aload_3
    //   124: checkcast 114	LT
    //   127: astore_3
    //   128: iload 6
    //   130: ifne +194 -> 324
    //   133: aload_2
    //   134: invokevirtual 117	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +123 -> 264
    //   144: iload 4
    //   146: bipush 10
    //   148: if_icmpeq +51 -> 199
    //   151: iload 4
    //   153: bipush 18
    //   155: if_icmpeq +33 -> 188
    //   158: iload 4
    //   160: bipush 26
    //   162: if_icmpeq +15 -> 177
    //   165: aload_2
    //   166: iload 4
    //   168: invokevirtual 120	HT:e	(I)Z
    //   171: ifne -43 -> 128
    //   174: goto +90 -> 264
    //   177: aload_0
    //   178: aload_2
    //   179: invokevirtual 123	HT:m	()Ljava/lang/String;
    //   182: putfield 54	vaa:h	Ljava/lang/String;
    //   185: goto -57 -> 128
    //   188: aload_0
    //   189: aload_2
    //   190: invokevirtual 126	HT:c	()LGT;
    //   193: putfield 50	vaa:g	LGT;
    //   196: goto -68 -> 128
    //   199: aload_0
    //   200: getfield 61	vaa:f	Lvaa$b;
    //   203: ifnull +17 -> 220
    //   206: aload_0
    //   207: getfield 61	vaa:f	Lvaa$b;
    //   210: invokevirtual 78	PT:c	()LPT$a;
    //   213: checkcast 15	vaa$b$a
    //   216: astore_1
    //   217: goto +5 -> 222
    //   220: aconst_null
    //   221: astore_1
    //   222: aload_0
    //   223: aload_2
    //   224: invokestatic 128	vaa$b:parser	()LYT;
    //   227: aload_3
    //   228: invokevirtual 131	HT:a	(LYT;LLT;)LVT;
    //   231: checkcast 12	vaa$b
    //   234: putfield 61	vaa:f	Lvaa$b;
    //   237: aload_1
    //   238: ifnull -110 -> 128
    //   241: aload_1
    //   242: aload_0
    //   243: getfield 61	vaa:f	Lvaa$b;
    //   246: invokevirtual 136	PT$a:b	(LPT;)LPT$a;
    //   249: pop
    //   250: aload_0
    //   251: aload_1
    //   252: invokevirtual 139	PT$a:b	()LPT;
    //   255: checkcast 12	vaa$b
    //   258: putfield 61	vaa:f	Lvaa$b;
    //   261: goto -133 -> 128
    //   264: iconst_1
    //   265: istore 6
    //   267: goto -139 -> 128
    //   270: astore_1
    //   271: goto +51 -> 322
    //   274: astore_3
    //   275: new 141	java/lang/RuntimeException
    //   278: astore_2
    //   279: new 87	RT
    //   282: astore_1
    //   283: aload_1
    //   284: aload_3
    //   285: invokevirtual 144	java/io/IOException:getMessage	()Ljava/lang/String;
    //   288: invokespecial 146	RT:<init>	(Ljava/lang/String;)V
    //   291: aload_1
    //   292: aload_0
    //   293: invokevirtual 149	RT:a	(LVT;)LRT;
    //   296: pop
    //   297: aload_2
    //   298: aload_1
    //   299: invokespecial 152	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   302: aload_2
    //   303: athrow
    //   304: astore_2
    //   305: new 141	java/lang/RuntimeException
    //   308: astore_1
    //   309: aload_2
    //   310: aload_0
    //   311: invokevirtual 149	RT:a	(LVT;)LRT;
    //   314: pop
    //   315: aload_1
    //   316: aload_2
    //   317: invokespecial 152	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   320: aload_1
    //   321: athrow
    //   322: aload_1
    //   323: athrow
    //   324: getstatic 40	vaa:d	Lvaa;
    //   327: areturn
    //   328: aload_2
    //   329: checkcast 154	PT$j
    //   332: astore_1
    //   333: aload_3
    //   334: checkcast 2	vaa
    //   337: astore_2
    //   338: aload_0
    //   339: aload_1
    //   340: aload_0
    //   341: getfield 61	vaa:f	Lvaa$b;
    //   344: aload_2
    //   345: getfield 61	vaa:f	Lvaa$b;
    //   348: invokeinterface 157 3 0
    //   353: checkcast 12	vaa$b
    //   356: putfield 61	vaa:f	Lvaa$b;
    //   359: aload_0
    //   360: getfield 50	vaa:g	LGT;
    //   363: getstatic 48	GT:a	LGT;
    //   366: if_acmpeq +9 -> 375
    //   369: iconst_1
    //   370: istore 7
    //   372: goto +6 -> 378
    //   375: iconst_0
    //   376: istore 7
    //   378: aload_0
    //   379: getfield 50	vaa:g	LGT;
    //   382: astore_3
    //   383: aload_2
    //   384: getfield 50	vaa:g	LGT;
    //   387: getstatic 48	GT:a	LGT;
    //   390: if_acmpeq +6 -> 396
    //   393: iconst_1
    //   394: istore 5
    //   396: aload_0
    //   397: aload_1
    //   398: iload 7
    //   400: aload_3
    //   401: iload 5
    //   403: aload_2
    //   404: getfield 50	vaa:g	LGT;
    //   407: invokeinterface 160 5 0
    //   412: putfield 50	vaa:g	LGT;
    //   415: aload_0
    //   416: aload_1
    //   417: aload_0
    //   418: getfield 54	vaa:h	Ljava/lang/String;
    //   421: invokevirtual 166	java/lang/String:isEmpty	()Z
    //   424: iconst_1
    //   425: ixor
    //   426: aload_0
    //   427: getfield 54	vaa:h	Ljava/lang/String;
    //   430: aload_2
    //   431: getfield 54	vaa:h	Ljava/lang/String;
    //   434: invokevirtual 166	java/lang/String:isEmpty	()Z
    //   437: iconst_1
    //   438: ixor
    //   439: aload_2
    //   440: getfield 54	vaa:h	Ljava/lang/String;
    //   443: invokeinterface 169 5 0
    //   448: putfield 54	vaa:h	Ljava/lang/String;
    //   451: getstatic 174	PT$h:a	LPT$h;
    //   454: astore_1
    //   455: aload_0
    //   456: areturn
    //   457: new 9	vaa$a
    //   460: dup
    //   461: aconst_null
    //   462: invokespecial 177	vaa$a:<init>	(LQY;)V
    //   465: areturn
    //   466: aconst_null
    //   467: areturn
    //   468: getstatic 40	vaa:d	Lvaa;
    //   471: areturn
    //   472: new 2	vaa
    //   475: dup
    //   476: invokespecial 38	vaa:<init>	()V
    //   479: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	480	0	this	vaa
    //   0	480	1	parami	PT.i
    //   0	480	2	paramObject1	Object
    //   0	480	3	paramObject2	Object
    //   8	159	4	i	int
    //   11	391	5	bool1	boolean
    //   14	252	6	j	int
    //   370	29	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	270	finally
    //   165	174	270	finally
    //   177	185	270	finally
    //   188	196	270	finally
    //   199	217	270	finally
    //   222	237	270	finally
    //   241	261	270	finally
    //   275	304	270	finally
    //   305	322	270	finally
    //   133	139	274	java/io/IOException
    //   165	174	274	java/io/IOException
    //   177	185	274	java/io/IOException
    //   188	196	274	java/io/IOException
    //   199	217	274	java/io/IOException
    //   222	237	274	java/io/IOException
    //   241	261	274	java/io/IOException
    //   133	139	304	RT
    //   165	174	304	RT
    //   177	185	304	RT
    //   188	196	304	RT
    //   199	217	304	RT
    //   222	237	304	RT
    //   241	261	304	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (this.f != null) {
      paramJT.b(1, l());
    }
    if (!this.g.isEmpty()) {
      paramJT.b(2, this.g);
    }
    if (!this.h.isEmpty()) {
      paramJT.b(3, k());
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    int j = 0;
    if (this.f != null) {
      j = 0 + JT.a(1, l());
    }
    i = j;
    if (!this.g.isEmpty()) {
      i = j + JT.a(2, this.g);
    }
    j = i;
    if (!this.h.isEmpty()) {
      j = i + JT.a(3, k());
    }
    this.c = j;
    return j;
  }
  
  public String k()
  {
    return this.h;
  }
  
  public vaa.b l()
  {
    vaa.b localb1 = this.f;
    vaa.b localb2 = localb1;
    if (localb1 == null) {
      localb2 = vaa.b.k();
    }
    return localb2;
  }
  
  public static final class a
    extends PT.a<vaa, a>
    implements xaa
  {
    private a()
    {
      super();
    }
    
    public a a(GT paramGT)
    {
      c();
      vaa.a((vaa)this.b, paramGT);
      return this;
    }
    
    public a a(String paramString)
    {
      c();
      vaa.a((vaa)this.b, paramString);
      return this;
    }
    
    public a a(vaa.b paramb)
    {
      c();
      vaa.a((vaa)this.b, paramb);
      return this;
    }
  }
  
  public static final class b
    extends PT<b, vaa.b.a>
    implements vaa.c
  {
    private static final b d = new b();
    private static volatile YT<b> e;
    private String f = "";
    private float g;
    private float h;
    private String i = "";
    private boolean j;
    private float k;
    private int l;
    private YZ m;
    
    static
    {
      d.h();
    }
    
    private void a(float paramFloat)
    {
      this.h = paramFloat;
    }
    
    private void a(YZ paramYZ)
    {
      if (paramYZ != null)
      {
        this.m = paramYZ;
        return;
      }
      throw new NullPointerException();
    }
    
    private void a(vaa.b.b paramb)
    {
      if (paramb != null)
      {
        this.l = paramb.a();
        return;
      }
      throw new NullPointerException();
    }
    
    private void a(boolean paramBoolean)
    {
      this.j = paramBoolean;
    }
    
    private void b(float paramFloat)
    {
      this.g = paramFloat;
    }
    
    private void b(String paramString)
    {
      if (paramString != null)
      {
        this.f = paramString;
        return;
      }
      throw new NullPointerException();
    }
    
    private void c(float paramFloat)
    {
      this.k = paramFloat;
    }
    
    private void c(String paramString)
    {
      if (paramString != null)
      {
        this.i = paramString;
        return;
      }
      throw new NullPointerException();
    }
    
    public static b k()
    {
      return d;
    }
    
    public static vaa.b.a o()
    {
      return (vaa.b.a)d.c();
    }
    
    public static YT<b> parser()
    {
      return d.e();
    }
    
    /* Error */
    protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
    {
      // Byte code:
      //   0: getstatic 119	QY:a	[I
      //   3: aload_1
      //   4: invokevirtual 124	java/lang/Enum:ordinal	()I
      //   7: iaload
      //   8: istore 4
      //   10: iconst_0
      //   11: istore 5
      //   13: iconst_0
      //   14: istore 6
      //   16: iload 4
      //   18: tableswitch	default:+46->64, 1:+796->814, 2:+792->810, 3:+790->808, 4:+781->799, 5:+400->418, 6:+100->118, 7:+396->414, 8:+54->72
      //   64: new 126	java/lang/UnsupportedOperationException
      //   67: dup
      //   68: invokespecial 127	java/lang/UnsupportedOperationException:<init>	()V
      //   71: athrow
      //   72: getstatic 129	vaa$b:e	LYT;
      //   75: ifnonnull +39 -> 114
      //   78: ldc 2
      //   80: monitorenter
      //   81: getstatic 129	vaa$b:e	LYT;
      //   84: ifnonnull +18 -> 102
      //   87: new 131	PT$b
      //   90: astore_1
      //   91: aload_1
      //   92: getstatic 42	vaa$b:d	Lvaa$b;
      //   95: invokespecial 134	PT$b:<init>	(LPT;)V
      //   98: aload_1
      //   99: putstatic 129	vaa$b:e	LYT;
      //   102: ldc 2
      //   104: monitorexit
      //   105: goto +9 -> 114
      //   108: astore_1
      //   109: ldc 2
      //   111: monitorexit
      //   112: aload_1
      //   113: athrow
      //   114: getstatic 129	vaa$b:e	LYT;
      //   117: areturn
      //   118: aload_2
      //   119: checkcast 136	HT
      //   122: astore_2
      //   123: aload_3
      //   124: checkcast 138	LT
      //   127: astore_3
      //   128: iload 6
      //   130: ifne +284 -> 414
      //   133: aload_2
      //   134: invokevirtual 141	HT:n	()I
      //   137: istore 4
      //   139: iload 4
      //   141: ifeq +213 -> 354
      //   144: iload 4
      //   146: bipush 10
      //   148: if_icmpeq +195 -> 343
      //   151: iload 4
      //   153: bipush 21
      //   155: if_icmpeq +177 -> 332
      //   158: iload 4
      //   160: bipush 29
      //   162: if_icmpeq +159 -> 321
      //   165: iload 4
      //   167: bipush 34
      //   169: if_icmpeq +141 -> 310
      //   172: iload 4
      //   174: bipush 40
      //   176: if_icmpeq +123 -> 299
      //   179: iload 4
      //   181: bipush 53
      //   183: if_icmpeq +105 -> 288
      //   186: iload 4
      //   188: bipush 56
      //   190: if_icmpeq +87 -> 277
      //   193: iload 4
      //   195: bipush 66
      //   197: if_icmpeq +15 -> 212
      //   200: aload_2
      //   201: iload 4
      //   203: invokevirtual 144	HT:e	(I)Z
      //   206: ifne -78 -> 128
      //   209: goto +145 -> 354
      //   212: aload_0
      //   213: getfield 58	vaa$b:m	LYZ;
      //   216: ifnull +17 -> 233
      //   219: aload_0
      //   220: getfield 58	vaa$b:m	LYZ;
      //   223: invokevirtual 103	PT:c	()LPT$a;
      //   226: checkcast 146	YZ$a
      //   229: astore_1
      //   230: goto +5 -> 235
      //   233: aconst_null
      //   234: astore_1
      //   235: aload_0
      //   236: aload_2
      //   237: invokestatic 150	YZ:parser	()LYT;
      //   240: aload_3
      //   241: invokevirtual 153	HT:a	(LYT;LLT;)LVT;
      //   244: checkcast 148	YZ
      //   247: putfield 58	vaa$b:m	LYZ;
      //   250: aload_1
      //   251: ifnull -123 -> 128
      //   254: aload_1
      //   255: aload_0
      //   256: getfield 58	vaa$b:m	LYZ;
      //   259: invokevirtual 158	PT$a:b	(LPT;)LPT$a;
      //   262: pop
      //   263: aload_0
      //   264: aload_1
      //   265: invokevirtual 161	PT$a:b	()LPT;
      //   268: checkcast 148	YZ
      //   271: putfield 58	vaa$b:m	LYZ;
      //   274: goto -146 -> 128
      //   277: aload_0
      //   278: aload_2
      //   279: invokevirtual 163	HT:d	()I
      //   282: putfield 67	vaa$b:l	I
      //   285: goto -157 -> 128
      //   288: aload_0
      //   289: aload_2
      //   290: invokevirtual 166	HT:e	()F
      //   293: putfield 95	vaa$b:k	F
      //   296: goto -168 -> 128
      //   299: aload_0
      //   300: aload_2
      //   301: invokevirtual 169	HT:b	()Z
      //   304: putfield 86	vaa$b:j	Z
      //   307: goto -179 -> 128
      //   310: aload_0
      //   311: aload_2
      //   312: invokevirtual 172	HT:m	()Ljava/lang/String;
      //   315: putfield 52	vaa$b:i	Ljava/lang/String;
      //   318: goto -190 -> 128
      //   321: aload_0
      //   322: aload_2
      //   323: invokevirtual 166	HT:e	()F
      //   326: putfield 55	vaa$b:h	F
      //   329: goto -201 -> 128
      //   332: aload_0
      //   333: aload_2
      //   334: invokevirtual 166	HT:e	()F
      //   337: putfield 88	vaa$b:g	F
      //   340: goto -212 -> 128
      //   343: aload_0
      //   344: aload_2
      //   345: invokevirtual 172	HT:m	()Ljava/lang/String;
      //   348: putfield 50	vaa$b:f	Ljava/lang/String;
      //   351: goto -223 -> 128
      //   354: iconst_1
      //   355: istore 6
      //   357: goto -229 -> 128
      //   360: astore_1
      //   361: goto +51 -> 412
      //   364: astore_1
      //   365: new 174	java/lang/RuntimeException
      //   368: astore_2
      //   369: new 112	RT
      //   372: astore_3
      //   373: aload_3
      //   374: aload_1
      //   375: invokevirtual 177	java/io/IOException:getMessage	()Ljava/lang/String;
      //   378: invokespecial 179	RT:<init>	(Ljava/lang/String;)V
      //   381: aload_3
      //   382: aload_0
      //   383: invokevirtual 182	RT:a	(LVT;)LRT;
      //   386: pop
      //   387: aload_2
      //   388: aload_3
      //   389: invokespecial 185	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
      //   392: aload_2
      //   393: athrow
      //   394: astore_2
      //   395: new 174	java/lang/RuntimeException
      //   398: astore_1
      //   399: aload_2
      //   400: aload_0
      //   401: invokevirtual 182	RT:a	(LVT;)LRT;
      //   404: pop
      //   405: aload_1
      //   406: aload_2
      //   407: invokespecial 185	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
      //   410: aload_1
      //   411: athrow
      //   412: aload_1
      //   413: athrow
      //   414: getstatic 42	vaa$b:d	Lvaa$b;
      //   417: areturn
      //   418: aload_2
      //   419: checkcast 187	PT$j
      //   422: astore_1
      //   423: aload_3
      //   424: checkcast 2	vaa$b
      //   427: astore_2
      //   428: aload_0
      //   429: aload_1
      //   430: aload_0
      //   431: getfield 50	vaa$b:f	Ljava/lang/String;
      //   434: invokevirtual 192	java/lang/String:isEmpty	()Z
      //   437: iconst_1
      //   438: ixor
      //   439: aload_0
      //   440: getfield 50	vaa$b:f	Ljava/lang/String;
      //   443: aload_2
      //   444: getfield 50	vaa$b:f	Ljava/lang/String;
      //   447: invokevirtual 192	java/lang/String:isEmpty	()Z
      //   450: iconst_1
      //   451: ixor
      //   452: aload_2
      //   453: getfield 50	vaa$b:f	Ljava/lang/String;
      //   456: invokeinterface 195 5 0
      //   461: putfield 50	vaa$b:f	Ljava/lang/String;
      //   464: aload_0
      //   465: getfield 88	vaa$b:g	F
      //   468: fconst_0
      //   469: fcmpl
      //   470: ifeq +9 -> 479
      //   473: iconst_1
      //   474: istore 7
      //   476: goto +6 -> 482
      //   479: iconst_0
      //   480: istore 7
      //   482: aload_0
      //   483: getfield 88	vaa$b:g	F
      //   486: fstore 8
      //   488: aload_2
      //   489: getfield 88	vaa$b:g	F
      //   492: fconst_0
      //   493: fcmpl
      //   494: ifeq +9 -> 503
      //   497: iconst_1
      //   498: istore 9
      //   500: goto +6 -> 506
      //   503: iconst_0
      //   504: istore 9
      //   506: aload_0
      //   507: aload_1
      //   508: iload 7
      //   510: fload 8
      //   512: iload 9
      //   514: aload_2
      //   515: getfield 88	vaa$b:g	F
      //   518: invokeinterface 198 5 0
      //   523: putfield 88	vaa$b:g	F
      //   526: aload_0
      //   527: getfield 55	vaa$b:h	F
      //   530: fconst_0
      //   531: fcmpl
      //   532: ifeq +9 -> 541
      //   535: iconst_1
      //   536: istore 7
      //   538: goto +6 -> 544
      //   541: iconst_0
      //   542: istore 7
      //   544: aload_0
      //   545: getfield 55	vaa$b:h	F
      //   548: fstore 8
      //   550: aload_2
      //   551: getfield 55	vaa$b:h	F
      //   554: fconst_0
      //   555: fcmpl
      //   556: ifeq +9 -> 565
      //   559: iconst_1
      //   560: istore 9
      //   562: goto +6 -> 568
      //   565: iconst_0
      //   566: istore 9
      //   568: aload_0
      //   569: aload_1
      //   570: iload 7
      //   572: fload 8
      //   574: iload 9
      //   576: aload_2
      //   577: getfield 55	vaa$b:h	F
      //   580: invokeinterface 198 5 0
      //   585: putfield 55	vaa$b:h	F
      //   588: aload_0
      //   589: aload_1
      //   590: aload_0
      //   591: getfield 52	vaa$b:i	Ljava/lang/String;
      //   594: invokevirtual 192	java/lang/String:isEmpty	()Z
      //   597: iconst_1
      //   598: ixor
      //   599: aload_0
      //   600: getfield 52	vaa$b:i	Ljava/lang/String;
      //   603: aload_2
      //   604: getfield 52	vaa$b:i	Ljava/lang/String;
      //   607: invokevirtual 192	java/lang/String:isEmpty	()Z
      //   610: iconst_1
      //   611: ixor
      //   612: aload_2
      //   613: getfield 52	vaa$b:i	Ljava/lang/String;
      //   616: invokeinterface 195 5 0
      //   621: putfield 52	vaa$b:i	Ljava/lang/String;
      //   624: aload_0
      //   625: getfield 86	vaa$b:j	Z
      //   628: istore 9
      //   630: aload_2
      //   631: getfield 86	vaa$b:j	Z
      //   634: istore 7
      //   636: aload_0
      //   637: aload_1
      //   638: iload 9
      //   640: iload 9
      //   642: iload 7
      //   644: iload 7
      //   646: invokeinterface 201 5 0
      //   651: putfield 86	vaa$b:j	Z
      //   654: aload_0
      //   655: getfield 95	vaa$b:k	F
      //   658: fconst_0
      //   659: fcmpl
      //   660: ifeq +9 -> 669
      //   663: iconst_1
      //   664: istore 7
      //   666: goto +6 -> 672
      //   669: iconst_0
      //   670: istore 7
      //   672: aload_0
      //   673: getfield 95	vaa$b:k	F
      //   676: fstore 8
      //   678: aload_2
      //   679: getfield 95	vaa$b:k	F
      //   682: fconst_0
      //   683: fcmpl
      //   684: ifeq +9 -> 693
      //   687: iconst_1
      //   688: istore 9
      //   690: goto +6 -> 696
      //   693: iconst_0
      //   694: istore 9
      //   696: aload_0
      //   697: aload_1
      //   698: iload 7
      //   700: fload 8
      //   702: iload 9
      //   704: aload_2
      //   705: getfield 95	vaa$b:k	F
      //   708: invokeinterface 198 5 0
      //   713: putfield 95	vaa$b:k	F
      //   716: aload_0
      //   717: getfield 67	vaa$b:l	I
      //   720: ifeq +9 -> 729
      //   723: iconst_1
      //   724: istore 7
      //   726: goto +6 -> 732
      //   729: iconst_0
      //   730: istore 7
      //   732: aload_0
      //   733: getfield 67	vaa$b:l	I
      //   736: istore 6
      //   738: iload 5
      //   740: istore 9
      //   742: aload_2
      //   743: getfield 67	vaa$b:l	I
      //   746: ifeq +6 -> 752
      //   749: iconst_1
      //   750: istore 9
      //   752: aload_0
      //   753: aload_1
      //   754: iload 7
      //   756: iload 6
      //   758: iload 9
      //   760: aload_2
      //   761: getfield 67	vaa$b:l	I
      //   764: invokeinterface 204 5 0
      //   769: putfield 67	vaa$b:l	I
      //   772: aload_0
      //   773: aload_1
      //   774: aload_0
      //   775: getfield 58	vaa$b:m	LYZ;
      //   778: aload_2
      //   779: getfield 58	vaa$b:m	LYZ;
      //   782: invokeinterface 207 3 0
      //   787: checkcast 148	YZ
      //   790: putfield 58	vaa$b:m	LYZ;
      //   793: getstatic 212	PT$h:a	LPT$h;
      //   796: astore_1
      //   797: aload_0
      //   798: areturn
      //   799: new 12	vaa$b$a
      //   802: dup
      //   803: aconst_null
      //   804: invokespecial 215	vaa$b$a:<init>	(LQY;)V
      //   807: areturn
      //   808: aconst_null
      //   809: areturn
      //   810: getstatic 42	vaa$b:d	Lvaa$b;
      //   813: areturn
      //   814: new 2	vaa$b
      //   817: dup
      //   818: invokespecial 40	vaa$b:<init>	()V
      //   821: areturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	822	0	this	b
      //   0	822	1	parami	PT.i
      //   0	822	2	paramObject1	Object
      //   0	822	3	paramObject2	Object
      //   8	194	4	n	int
      //   11	728	5	bool1	boolean
      //   14	743	6	i1	int
      //   474	281	7	bool2	boolean
      //   486	215	8	f1	float
      //   498	261	9	bool3	boolean
      // Exception table:
      //   from	to	target	type
      //   81	102	108	finally
      //   102	105	108	finally
      //   109	112	108	finally
      //   133	139	360	finally
      //   200	209	360	finally
      //   212	230	360	finally
      //   235	250	360	finally
      //   254	274	360	finally
      //   277	285	360	finally
      //   288	296	360	finally
      //   299	307	360	finally
      //   310	318	360	finally
      //   321	329	360	finally
      //   332	340	360	finally
      //   343	351	360	finally
      //   365	394	360	finally
      //   395	412	360	finally
      //   133	139	364	java/io/IOException
      //   200	209	364	java/io/IOException
      //   212	230	364	java/io/IOException
      //   235	250	364	java/io/IOException
      //   254	274	364	java/io/IOException
      //   277	285	364	java/io/IOException
      //   288	296	364	java/io/IOException
      //   299	307	364	java/io/IOException
      //   310	318	364	java/io/IOException
      //   321	329	364	java/io/IOException
      //   332	340	364	java/io/IOException
      //   343	351	364	java/io/IOException
      //   133	139	394	RT
      //   200	209	394	RT
      //   212	230	394	RT
      //   235	250	394	RT
      //   254	274	394	RT
      //   277	285	394	RT
      //   288	296	394	RT
      //   299	307	394	RT
      //   310	318	394	RT
      //   321	329	394	RT
      //   332	340	394	RT
      //   343	351	394	RT
    }
    
    public void a(JT paramJT)
      throws IOException
    {
      if (!this.f.isEmpty()) {
        paramJT.b(1, l());
      }
      float f1 = this.g;
      if (f1 != 0.0F) {
        paramJT.b(2, f1);
      }
      f1 = this.h;
      if (f1 != 0.0F) {
        paramJT.b(3, f1);
      }
      if (!this.i.isEmpty()) {
        paramJT.b(4, m());
      }
      boolean bool = this.j;
      if (bool) {
        paramJT.b(5, bool);
      }
      f1 = this.k;
      if (f1 != 0.0F) {
        paramJT.b(6, f1);
      }
      if (this.l != vaa.b.b.a.a()) {
        paramJT.e(7, this.l);
      }
      if (this.m != null) {
        paramJT.b(8, n());
      }
    }
    
    public int d()
    {
      int n = this.c;
      if (n != -1) {
        return n;
      }
      int i1 = 0;
      if (!this.f.isEmpty()) {
        i1 = 0 + JT.a(1, l());
      }
      float f1 = this.g;
      n = i1;
      if (f1 != 0.0F) {
        n = i1 + JT.a(2, f1);
      }
      f1 = this.h;
      i1 = n;
      if (f1 != 0.0F) {
        i1 = n + JT.a(3, f1);
      }
      n = i1;
      if (!this.i.isEmpty()) {
        n = i1 + JT.a(4, m());
      }
      boolean bool = this.j;
      i1 = n;
      if (bool) {
        i1 = n + JT.a(5, bool);
      }
      f1 = this.k;
      int i2 = i1;
      if (f1 != 0.0F) {
        i2 = i1 + JT.a(6, f1);
      }
      n = i2;
      if (this.l != vaa.b.b.a.a()) {
        n = i2 + JT.a(7, this.l);
      }
      i1 = n;
      if (this.m != null) {
        i1 = n + JT.a(8, n());
      }
      this.c = i1;
      return i1;
    }
    
    public String l()
    {
      return this.f;
    }
    
    public String m()
    {
      return this.i;
    }
    
    public YZ n()
    {
      YZ localYZ1 = this.m;
      YZ localYZ2 = localYZ1;
      if (localYZ1 == null) {
        localYZ2 = YZ.k();
      }
      return localYZ2;
    }
    
    public static final class a
      extends PT.a<vaa.b, a>
      implements vaa.c
    {
      private a()
      {
        super();
      }
      
      public a a(float paramFloat)
      {
        c();
        vaa.b.b((vaa.b)this.b, paramFloat);
        return this;
      }
      
      public a a(YZ paramYZ)
      {
        c();
        vaa.b.a((vaa.b)this.b, paramYZ);
        return this;
      }
      
      public a a(String paramString)
      {
        c();
        vaa.b.a((vaa.b)this.b, paramString);
        return this;
      }
      
      public a a(vaa.b.b paramb)
      {
        c();
        vaa.b.a((vaa.b)this.b, paramb);
        return this;
      }
      
      public a a(boolean paramBoolean)
      {
        c();
        vaa.b.a((vaa.b)this.b, paramBoolean);
        return this;
      }
      
      public a b(float paramFloat)
      {
        c();
        vaa.b.a((vaa.b)this.b, paramFloat);
        return this;
      }
      
      public a b(String paramString)
      {
        c();
        vaa.b.b((vaa.b)this.b, paramString);
        return this;
      }
      
      public a c(float paramFloat)
      {
        c();
        vaa.b.c((vaa.b)this.b, paramFloat);
        return this;
      }
    }
    
    public static enum b
      implements QT.a
    {
      private static final QT.b<b> h = new waa();
      private final int j;
      
      private b(int paramInt)
      {
        this.j = paramInt;
      }
      
      public static b a(int paramInt)
      {
        if (paramInt != 0)
        {
          if (paramInt != 1)
          {
            if (paramInt != 2)
            {
              if (paramInt != 3)
              {
                if (paramInt != 4)
                {
                  if (paramInt != 5) {
                    return null;
                  }
                  return f;
                }
                return e;
              }
              return d;
            }
            return c;
          }
          return b;
        }
        return a;
      }
      
      public final int a()
      {
        return this.j;
      }
    }
  }
  
  public static abstract interface c
    extends WT
  {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vaa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */