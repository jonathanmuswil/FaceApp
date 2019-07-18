import java.io.IOException;

public final class daa
  extends PT<daa, daa.a>
  implements eaa
{
  private static final daa d = new daa();
  private static volatile YT<daa> e;
  private String f = "";
  private String g = "";
  private int h;
  
  static
  {
    d.h();
  }
  
  public static daa k()
  {
    return d;
  }
  
  public static YT<daa> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 56	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 62	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+411->429, 2:+407->425, 3:+405->423, 4:+396->414, 5:+256->274, 6:+100->118, 7:+252->270, 8:+54->72
    //   64: new 64	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 65	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 67	daa:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 67	daa:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 69	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 27	daa:d	Ldaa;
    //   95: invokespecial 72	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 67	daa:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 67	daa:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 74	HT
    //   122: astore_1
    //   123: aload_3
    //   124: checkcast 76	LT
    //   127: astore_2
    //   128: iload 6
    //   130: ifne +140 -> 270
    //   133: aload_1
    //   134: invokevirtual 79	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +69 -> 210
    //   144: iload 4
    //   146: bipush 10
    //   148: if_icmpeq +51 -> 199
    //   151: iload 4
    //   153: bipush 18
    //   155: if_icmpeq +33 -> 188
    //   158: iload 4
    //   160: bipush 24
    //   162: if_icmpeq +15 -> 177
    //   165: aload_1
    //   166: iload 4
    //   168: invokevirtual 82	HT:e	(I)Z
    //   171: ifne -43 -> 128
    //   174: goto +36 -> 210
    //   177: aload_0
    //   178: aload_1
    //   179: invokevirtual 84	HT:d	()I
    //   182: putfield 86	daa:h	I
    //   185: goto -57 -> 128
    //   188: aload_0
    //   189: aload_1
    //   190: invokevirtual 90	HT:m	()Ljava/lang/String;
    //   193: putfield 37	daa:g	Ljava/lang/String;
    //   196: goto -68 -> 128
    //   199: aload_0
    //   200: aload_1
    //   201: invokevirtual 90	HT:m	()Ljava/lang/String;
    //   204: putfield 35	daa:f	Ljava/lang/String;
    //   207: goto -79 -> 128
    //   210: iconst_1
    //   211: istore 6
    //   213: goto -85 -> 128
    //   216: astore_1
    //   217: goto +51 -> 268
    //   220: astore_2
    //   221: new 92	java/lang/RuntimeException
    //   224: astore_1
    //   225: new 49	RT
    //   228: astore_3
    //   229: aload_3
    //   230: aload_2
    //   231: invokevirtual 95	java/io/IOException:getMessage	()Ljava/lang/String;
    //   234: invokespecial 98	RT:<init>	(Ljava/lang/String;)V
    //   237: aload_3
    //   238: aload_0
    //   239: invokevirtual 101	RT:a	(LVT;)LRT;
    //   242: pop
    //   243: aload_1
    //   244: aload_3
    //   245: invokespecial 104	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   248: aload_1
    //   249: athrow
    //   250: astore_2
    //   251: new 92	java/lang/RuntimeException
    //   254: astore_1
    //   255: aload_2
    //   256: aload_0
    //   257: invokevirtual 101	RT:a	(LVT;)LRT;
    //   260: pop
    //   261: aload_1
    //   262: aload_2
    //   263: invokespecial 104	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   266: aload_1
    //   267: athrow
    //   268: aload_1
    //   269: athrow
    //   270: getstatic 27	daa:d	Ldaa;
    //   273: areturn
    //   274: aload_2
    //   275: checkcast 106	PT$j
    //   278: astore_1
    //   279: aload_3
    //   280: checkcast 2	daa
    //   283: astore_2
    //   284: aload_0
    //   285: aload_1
    //   286: aload_0
    //   287: getfield 35	daa:f	Ljava/lang/String;
    //   290: invokevirtual 112	java/lang/String:isEmpty	()Z
    //   293: iconst_1
    //   294: ixor
    //   295: aload_0
    //   296: getfield 35	daa:f	Ljava/lang/String;
    //   299: aload_2
    //   300: getfield 35	daa:f	Ljava/lang/String;
    //   303: invokevirtual 112	java/lang/String:isEmpty	()Z
    //   306: iconst_1
    //   307: ixor
    //   308: aload_2
    //   309: getfield 35	daa:f	Ljava/lang/String;
    //   312: invokeinterface 115 5 0
    //   317: putfield 35	daa:f	Ljava/lang/String;
    //   320: aload_0
    //   321: aload_1
    //   322: aload_0
    //   323: getfield 37	daa:g	Ljava/lang/String;
    //   326: invokevirtual 112	java/lang/String:isEmpty	()Z
    //   329: iconst_1
    //   330: ixor
    //   331: aload_0
    //   332: getfield 37	daa:g	Ljava/lang/String;
    //   335: aload_2
    //   336: getfield 37	daa:g	Ljava/lang/String;
    //   339: invokevirtual 112	java/lang/String:isEmpty	()Z
    //   342: iconst_1
    //   343: ixor
    //   344: aload_2
    //   345: getfield 37	daa:g	Ljava/lang/String;
    //   348: invokeinterface 115 5 0
    //   353: putfield 37	daa:g	Ljava/lang/String;
    //   356: aload_0
    //   357: getfield 86	daa:h	I
    //   360: ifeq +9 -> 369
    //   363: iconst_1
    //   364: istore 7
    //   366: goto +6 -> 372
    //   369: iconst_0
    //   370: istore 7
    //   372: aload_0
    //   373: getfield 86	daa:h	I
    //   376: istore 6
    //   378: aload_2
    //   379: getfield 86	daa:h	I
    //   382: ifeq +6 -> 388
    //   385: iconst_1
    //   386: istore 5
    //   388: aload_0
    //   389: aload_1
    //   390: iload 7
    //   392: iload 6
    //   394: iload 5
    //   396: aload_2
    //   397: getfield 86	daa:h	I
    //   400: invokeinterface 118 5 0
    //   405: putfield 86	daa:h	I
    //   408: getstatic 123	PT$h:a	LPT$h;
    //   411: astore_1
    //   412: aload_0
    //   413: areturn
    //   414: new 9	daa$a
    //   417: dup
    //   418: aconst_null
    //   419: invokespecial 126	daa$a:<init>	(LQY;)V
    //   422: areturn
    //   423: aconst_null
    //   424: areturn
    //   425: getstatic 27	daa:d	Ldaa;
    //   428: areturn
    //   429: new 2	daa
    //   432: dup
    //   433: invokespecial 25	daa:<init>	()V
    //   436: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	437	0	this	daa
    //   0	437	1	parami	PT.i
    //   0	437	2	paramObject1	Object
    //   0	437	3	paramObject2	Object
    //   8	159	4	i	int
    //   11	384	5	bool1	boolean
    //   14	379	6	j	int
    //   364	27	7	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	216	finally
    //   165	174	216	finally
    //   177	185	216	finally
    //   188	196	216	finally
    //   199	207	216	finally
    //   221	250	216	finally
    //   251	268	216	finally
    //   133	139	220	java/io/IOException
    //   165	174	220	java/io/IOException
    //   177	185	220	java/io/IOException
    //   188	196	220	java/io/IOException
    //   199	207	220	java/io/IOException
    //   133	139	250	RT
    //   165	174	250	RT
    //   177	185	250	RT
    //   188	196	250	RT
    //   199	207	250	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (!this.f.isEmpty()) {
      paramJT.b(1, l());
    }
    if (!this.g.isEmpty()) {
      paramJT.b(2, n());
    }
    if (this.h != OZ.a.a()) {
      paramJT.e(3, this.h);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    int j = 0;
    if (!this.f.isEmpty()) {
      j = 0 + JT.a(1, l());
    }
    i = j;
    if (!this.g.isEmpty()) {
      i = j + JT.a(2, n());
    }
    j = i;
    if (this.h != OZ.a.a()) {
      j = i + JT.a(3, this.h);
    }
    this.c = j;
    return j;
  }
  
  public String l()
  {
    return this.f;
  }
  
  public OZ m()
  {
    OZ localOZ1 = OZ.a(this.h);
    OZ localOZ2 = localOZ1;
    if (localOZ1 == null) {
      localOZ2 = OZ.d;
    }
    return localOZ2;
  }
  
  public String n()
  {
    return this.g;
  }
  
  public static final class a
    extends PT.a<daa, a>
    implements eaa
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/daa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */