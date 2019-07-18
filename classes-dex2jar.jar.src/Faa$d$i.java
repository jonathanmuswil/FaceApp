import java.io.IOException;

public final class Faa$d$i
  extends PT<i, Faa.d.i.a>
  implements Faa.d.j
{
  private static final i d = new i();
  private static volatile YT<i> e;
  private float f;
  
  static
  {
    d.h();
  }
  
  private void a(float paramFloat)
  {
    this.f = paramFloat;
  }
  
  public static Faa.d.i.a k()
  {
    return (Faa.d.i.a)d.c();
  }
  
  public static YT<i> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 64	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 70	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iload 4
    //   18: tableswitch	default:+46->64, 1:+307->325, 2:+303->321, 3:+301->319, 4:+292->310, 5:+220->238, 6:+100->118, 7:+216->234, 8:+54->72
    //   64: new 72	java/lang/UnsupportedOperationException
    //   67: dup
    //   68: invokespecial 73	java/lang/UnsupportedOperationException:<init>	()V
    //   71: athrow
    //   72: getstatic 75	Faa$d$i:e	LYT;
    //   75: ifnonnull +39 -> 114
    //   78: ldc 2
    //   80: monitorenter
    //   81: getstatic 75	Faa$d$i:e	LYT;
    //   84: ifnonnull +18 -> 102
    //   87: new 77	PT$b
    //   90: astore_1
    //   91: aload_1
    //   92: getstatic 29	Faa$d$i:d	LFaa$d$i;
    //   95: invokespecial 80	PT$b:<init>	(LPT;)V
    //   98: aload_1
    //   99: putstatic 75	Faa$d$i:e	LYT;
    //   102: ldc 2
    //   104: monitorexit
    //   105: goto +9 -> 114
    //   108: astore_1
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_1
    //   113: athrow
    //   114: getstatic 75	Faa$d$i:e	LYT;
    //   117: areturn
    //   118: aload_2
    //   119: checkcast 82	HT
    //   122: astore_1
    //   123: aload_3
    //   124: checkcast 84	LT
    //   127: astore_2
    //   128: iload 6
    //   130: ifne +104 -> 234
    //   133: aload_1
    //   134: invokevirtual 87	HT:n	()I
    //   137: istore 4
    //   139: iload 4
    //   141: ifeq +33 -> 174
    //   144: iload 4
    //   146: bipush 13
    //   148: if_icmpeq +15 -> 163
    //   151: aload_1
    //   152: iload 4
    //   154: invokevirtual 90	HT:e	(I)Z
    //   157: ifne -29 -> 128
    //   160: goto +14 -> 174
    //   163: aload_0
    //   164: aload_1
    //   165: invokevirtual 93	HT:e	()F
    //   168: putfield 37	Faa$d$i:f	F
    //   171: goto -43 -> 128
    //   174: iconst_1
    //   175: istore 6
    //   177: goto -49 -> 128
    //   180: astore_1
    //   181: goto +51 -> 232
    //   184: astore_1
    //   185: new 95	java/lang/RuntimeException
    //   188: astore_3
    //   189: new 57	RT
    //   192: astore_2
    //   193: aload_2
    //   194: aload_1
    //   195: invokevirtual 99	java/io/IOException:getMessage	()Ljava/lang/String;
    //   198: invokespecial 102	RT:<init>	(Ljava/lang/String;)V
    //   201: aload_2
    //   202: aload_0
    //   203: invokevirtual 105	RT:a	(LVT;)LRT;
    //   206: pop
    //   207: aload_3
    //   208: aload_2
    //   209: invokespecial 108	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   212: aload_3
    //   213: athrow
    //   214: astore_1
    //   215: new 95	java/lang/RuntimeException
    //   218: astore_2
    //   219: aload_1
    //   220: aload_0
    //   221: invokevirtual 105	RT:a	(LVT;)LRT;
    //   224: pop
    //   225: aload_2
    //   226: aload_1
    //   227: invokespecial 108	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   230: aload_2
    //   231: athrow
    //   232: aload_1
    //   233: athrow
    //   234: getstatic 29	Faa$d$i:d	LFaa$d$i;
    //   237: areturn
    //   238: aload_2
    //   239: checkcast 110	PT$j
    //   242: astore_1
    //   243: aload_3
    //   244: checkcast 2	Faa$d$i
    //   247: astore_2
    //   248: aload_0
    //   249: getfield 37	Faa$d$i:f	F
    //   252: fconst_0
    //   253: fcmpl
    //   254: ifeq +9 -> 263
    //   257: iconst_1
    //   258: istore 7
    //   260: goto +6 -> 266
    //   263: iconst_0
    //   264: istore 7
    //   266: aload_0
    //   267: getfield 37	Faa$d$i:f	F
    //   270: fstore 8
    //   272: aload_2
    //   273: getfield 37	Faa$d$i:f	F
    //   276: fconst_0
    //   277: fcmpl
    //   278: ifeq +6 -> 284
    //   281: iconst_1
    //   282: istore 5
    //   284: aload_0
    //   285: aload_1
    //   286: iload 7
    //   288: fload 8
    //   290: iload 5
    //   292: aload_2
    //   293: getfield 37	Faa$d$i:f	F
    //   296: invokeinterface 113 5 0
    //   301: putfield 37	Faa$d$i:f	F
    //   304: getstatic 118	PT$h:a	LPT$h;
    //   307: astore_1
    //   308: aload_0
    //   309: areturn
    //   310: new 15	Faa$d$i$a
    //   313: dup
    //   314: aconst_null
    //   315: invokespecial 121	Faa$d$i$a:<init>	(LQY;)V
    //   318: areturn
    //   319: aconst_null
    //   320: areturn
    //   321: getstatic 29	Faa$d$i:d	LFaa$d$i;
    //   324: areturn
    //   325: new 2	Faa$d$i
    //   328: dup
    //   329: invokespecial 27	Faa$d$i:<init>	()V
    //   332: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	333	0	this	i
    //   0	333	1	parami	PT.i
    //   0	333	2	paramObject1	Object
    //   0	333	3	paramObject2	Object
    //   8	145	4	i	int
    //   11	280	5	bool1	boolean
    //   14	162	6	j	int
    //   258	29	7	bool2	boolean
    //   270	19	8	f1	float
    // Exception table:
    //   from	to	target	type
    //   81	102	108	finally
    //   102	105	108	finally
    //   109	112	108	finally
    //   133	139	180	finally
    //   151	160	180	finally
    //   163	171	180	finally
    //   185	214	180	finally
    //   215	232	180	finally
    //   133	139	184	java/io/IOException
    //   151	160	184	java/io/IOException
    //   163	171	184	java/io/IOException
    //   133	139	214	RT
    //   151	160	214	RT
    //   163	171	214	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    float f1 = this.f;
    if (f1 != 0.0F) {
      paramJT.b(1, f1);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    float f1 = this.f;
    if (f1 != 0.0F) {
      i = 0 + JT.a(1, f1);
    }
    this.c = i;
    return i;
  }
  
  public static final class a
    extends PT.a<Faa.d.i, a>
    implements Faa.d.j
  {
    private a()
    {
      super();
    }
    
    public a a(float paramFloat)
    {
      c();
      Faa.d.i.a((Faa.d.i)this.b, paramFloat);
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Faa$d$i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */