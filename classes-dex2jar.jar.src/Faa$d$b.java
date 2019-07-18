import java.io.IOException;

public final class Faa$d$b
  extends PT<b, Faa.d.b.a>
  implements Faa.d.c
{
  private static final b d = new b();
  private static volatile YT<b> e;
  private String f = "";
  private float g;
  
  static
  {
    d.h();
  }
  
  private void a(float paramFloat)
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
  
  public static Faa.d.b.a l()
  {
    return (Faa.d.b.a)d.c();
  }
  
  public static YT<b> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 77	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 83	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+361->379, 2:+357->375, 3:+355->373, 4:+346->364, 5:+238->256, 6:+100->118, 7:+234->252, 8:+54->72
    //   64: new 85	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 86	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 88	Faa$d$b:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 88	Faa$d$b:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 90	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 31	Faa$d$b:d	LFaa$d$b;
    //   95: invokespecial 93	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 88	Faa$d$b:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 88	Faa$d$b:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 95	HT
    //   122: astore_1
    //   123: aload_3
    //   124: checkcast 97	LT
    //   127: astore_2
    //   128: iload 6
    //   130: ifne +122 -> 252
    //   133: aload_1
    //   134: invokevirtual 100	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +51 -> 192
    //   144: iload 4
    //   146: bipush 10
    //   148: if_icmpeq +33 -> 181
    //   151: iload 4
    //   153: bipush 21
    //   155: if_icmpeq +15 -> 170
    //   158: aload_1
    //   159: iload 4
    //   161: invokevirtual 103	HT:e	(I)Z
    //   164: ifne -36 -> 128
    //   167: goto +25 -> 192
    //   170: aload_0
    //   171: aload_1
    //   172: invokevirtual 106	HT:e	()F
    //   175: putfield 43	Faa$d$b:g	F
    //   178: goto -50 -> 128
    //   181: aload_0
    //   182: aload_1
    //   183: invokevirtual 110	HT:m	()Ljava/lang/String;
    //   186: putfield 40	Faa$d$b:f	Ljava/lang/String;
    //   189: goto -61 -> 128
    //   192: iconst_1
    //   193: istore 6
    //   195: goto -67 -> 128
    //   198: astore_1
    //   199: goto +51 -> 250
    //   202: astore_2
    //   203: new 112	java/lang/RuntimeException
    //   206: astore_3
    //   207: new 70	RT
    //   210: astore_1
    //   211: aload_1
    //   212: aload_2
    //   213: invokevirtual 115	java/io/IOException:getMessage	()Ljava/lang/String;
    //   216: invokespecial 117	RT:<init>	(Ljava/lang/String;)V
    //   219: aload_1
    //   220: aload_0
    //   221: invokevirtual 120	RT:a	(LVT;)LRT;
    //   224: pop
    //   225: aload_3
    //   226: aload_1
    //   227: invokespecial 123	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   230: aload_3
    //   231: athrow
    //   232: astore_1
    //   233: new 112	java/lang/RuntimeException
    //   236: astore_2
    //   237: aload_1
    //   238: aload_0
    //   239: invokevirtual 120	RT:a	(LVT;)LRT;
    //   242: pop
    //   243: aload_2
    //   244: aload_1
    //   245: invokespecial 123	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   248: aload_2
    //   249: athrow
    //   250: aload_1
    //   251: athrow
    //   252: getstatic 31	Faa$d$b:d	LFaa$d$b;
    //   255: areturn
    //   256: aload_2
    //   257: checkcast 125	PT$j
    //   260: astore_1
    //   261: aload_3
    //   262: checkcast 2	Faa$d$b
    //   265: astore_2
    //   266: aload_0
    //   267: aload_1
    //   268: aload_0
    //   269: getfield 40	Faa$d$b:f	Ljava/lang/String;
    //   272: invokevirtual 131	java/lang/String:isEmpty	()Z
    //   275: iconst_1
    //   276: ixor
    //   277: aload_0
    //   278: getfield 40	Faa$d$b:f	Ljava/lang/String;
    //   281: aload_2
    //   282: getfield 40	Faa$d$b:f	Ljava/lang/String;
    //   285: invokevirtual 131	java/lang/String:isEmpty	()Z
    //   288: iconst_1
    //   289: ixor
    //   290: aload_2
    //   291: getfield 40	Faa$d$b:f	Ljava/lang/String;
    //   294: invokeinterface 134 5 0
    //   299: putfield 40	Faa$d$b:f	Ljava/lang/String;
    //   302: aload_0
    //   303: getfield 43	Faa$d$b:g	F
    //   306: fconst_0
    //   307: fcmpl
    //   308: ifeq +9 -> 317
    //   311: iconst_1
    //   312: istore 7
    //   314: goto +6 -> 320
    //   317: iconst_0
    //   318: istore 7
    //   320: aload_0
    //   321: getfield 43	Faa$d$b:g	F
    //   324: fstore 8
    //   326: aload_2
    //   327: getfield 43	Faa$d$b:g	F
    //   330: fconst_0
    //   331: fcmpl
    //   332: ifeq +6 -> 338
    //   335: iconst_1
    //   336: istore 5
    //   338: aload_0
    //   339: aload_1
    //   340: iload 7
    //   342: fload 8
    //   344: iload 5
    //   346: aload_2
    //   347: getfield 43	Faa$d$b:g	F
    //   350: invokeinterface 137 5 0
    //   355: putfield 43	Faa$d$b:g	F
    //   358: getstatic 142	PT$h:a	LPT$h;
    //   361: astore_1
    //   362: aload_0
    //   363: areturn
    //   364: new 15	Faa$d$b$a
    //   367: dup
    //   368: aconst_null
    //   369: invokespecial 145	Faa$d$b$a:<init>	(LQY;)V
    //   372: areturn
    //   373: aconst_null
    //   374: areturn
    //   375: getstatic 31	Faa$d$b:d	LFaa$d$b;
    //   378: areturn
    //   379: new 2	Faa$d$b
    //   382: dup
    //   383: invokespecial 29	Faa$d$b:<init>	()V
    //   386: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	this	b
    //   0	387	1	parami	PT.i
    //   0	387	2	paramObject1	Object
    //   0	387	3	paramObject2	Object
    //   8	152	4	i	int
    //   11	334	5	bool1	boolean
    //   14	180	6	j	int
    //   312	29	7	bool2	boolean
    //   324	19	8	f1	float
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	198	finally
    //   158	167	198	finally
    //   170	178	198	finally
    //   181	189	198	finally
    //   203	232	198	finally
    //   233	250	198	finally
    //   133	139	202	java/io/IOException
    //   158	167	202	java/io/IOException
    //   170	178	202	java/io/IOException
    //   181	189	202	java/io/IOException
    //   133	139	232	RT
    //   158	167	232	RT
    //   170	178	232	RT
    //   181	189	232	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (!this.f.isEmpty()) {
      paramJT.b(1, k());
    }
    float f1 = this.g;
    if (f1 != 0.0F) {
      paramJT.b(2, f1);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    if (!this.f.isEmpty()) {
      i = 0 + JT.a(1, k());
    }
    float f1 = this.g;
    int j = i;
    if (f1 != 0.0F) {
      j = i + JT.a(2, f1);
    }
    this.c = j;
    return j;
  }
  
  public String k()
  {
    return this.f;
  }
  
  public static final class a
    extends PT.a<Faa.d.b, a>
    implements Faa.d.c
  {
    private a()
    {
      super();
    }
    
    public a a(float paramFloat)
    {
      c();
      Faa.d.b.a((Faa.d.b)this.b, paramFloat);
      return this;
    }
    
    public a a(String paramString)
    {
      c();
      Faa.d.b.a((Faa.d.b)this.b, paramString);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Faa$d$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */