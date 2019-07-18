import java.io.IOException;

public final class gZ$b
  extends PT<b, gZ.b.a>
  implements gZ.c
{
  private static final b d = new b();
  private static volatile YT<b> e;
  private String f = "";
  
  static
  {
    d.h();
  }
  
  public static YT<b> parser()
  {
    return d.e();
  }
  
  /* Error */
  protected final Object a(PT.i parami, Object paramObject1, Object paramObject2)
  {
    // Byte code:
    //   0: getstatic 54	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 60	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: tableswitch	default:+48->56, 1:+292->300, 2:+288->296, 3:+286->294, 4:+277->285, 5:+225->233, 6:+102->110, 7:+221->229, 8:+56->64
    //   56: new 62	java/lang/UnsupportedOperationException
    //   59: dup
    //   60: invokespecial 63	java/lang/UnsupportedOperationException:<init>	()V
    //   63: athrow
    //   64: getstatic 65	gZ$b:e	LYT;
    //   67: ifnonnull +39 -> 106
    //   70: ldc 2
    //   72: monitorenter
    //   73: getstatic 65	gZ$b:e	LYT;
    //   76: ifnonnull +18 -> 94
    //   79: new 67	PT$b
    //   82: astore_1
    //   83: aload_1
    //   84: getstatic 27	gZ$b:d	LgZ$b;
    //   87: invokespecial 70	PT$b:<init>	(LPT;)V
    //   90: aload_1
    //   91: putstatic 65	gZ$b:e	LYT;
    //   94: ldc 2
    //   96: monitorexit
    //   97: goto +9 -> 106
    //   100: astore_1
    //   101: ldc 2
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    //   106: getstatic 65	gZ$b:e	LYT;
    //   109: areturn
    //   110: aload_2
    //   111: checkcast 72	HT
    //   114: astore_1
    //   115: aload_3
    //   116: checkcast 74	LT
    //   119: astore_2
    //   120: iconst_0
    //   121: istore 4
    //   123: iload 4
    //   125: ifne +104 -> 229
    //   128: aload_1
    //   129: invokevirtual 77	HT:n	()I
    //   132: istore 5
    //   134: iload 5
    //   136: ifeq +33 -> 169
    //   139: iload 5
    //   141: bipush 10
    //   143: if_icmpeq +15 -> 158
    //   146: aload_1
    //   147: iload 5
    //   149: invokevirtual 80	HT:e	(I)Z
    //   152: ifne -29 -> 123
    //   155: goto +14 -> 169
    //   158: aload_0
    //   159: aload_1
    //   160: invokevirtual 84	HT:m	()Ljava/lang/String;
    //   163: putfield 36	gZ$b:f	Ljava/lang/String;
    //   166: goto -43 -> 123
    //   169: iconst_1
    //   170: istore 4
    //   172: goto -49 -> 123
    //   175: astore_1
    //   176: goto +51 -> 227
    //   179: astore_3
    //   180: new 86	java/lang/RuntimeException
    //   183: astore_2
    //   184: new 47	RT
    //   187: astore_1
    //   188: aload_1
    //   189: aload_3
    //   190: invokevirtual 89	java/io/IOException:getMessage	()Ljava/lang/String;
    //   193: invokespecial 92	RT:<init>	(Ljava/lang/String;)V
    //   196: aload_1
    //   197: aload_0
    //   198: invokevirtual 95	RT:a	(LVT;)LRT;
    //   201: pop
    //   202: aload_2
    //   203: aload_1
    //   204: invokespecial 98	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   207: aload_2
    //   208: athrow
    //   209: astore_1
    //   210: new 86	java/lang/RuntimeException
    //   213: astore_2
    //   214: aload_1
    //   215: aload_0
    //   216: invokevirtual 95	RT:a	(LVT;)LRT;
    //   219: pop
    //   220: aload_2
    //   221: aload_1
    //   222: invokespecial 98	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   225: aload_2
    //   226: athrow
    //   227: aload_1
    //   228: athrow
    //   229: getstatic 27	gZ$b:d	LgZ$b;
    //   232: areturn
    //   233: aload_2
    //   234: checkcast 100	PT$j
    //   237: astore_1
    //   238: aload_3
    //   239: checkcast 2	gZ$b
    //   242: astore_2
    //   243: aload_0
    //   244: aload_1
    //   245: aload_0
    //   246: getfield 36	gZ$b:f	Ljava/lang/String;
    //   249: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   252: iconst_1
    //   253: ixor
    //   254: aload_0
    //   255: getfield 36	gZ$b:f	Ljava/lang/String;
    //   258: iconst_1
    //   259: aload_2
    //   260: getfield 36	gZ$b:f	Ljava/lang/String;
    //   263: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   266: ixor
    //   267: aload_2
    //   268: getfield 36	gZ$b:f	Ljava/lang/String;
    //   271: invokeinterface 109 5 0
    //   276: putfield 36	gZ$b:f	Ljava/lang/String;
    //   279: getstatic 114	PT$h:a	LPT$h;
    //   282: astore_1
    //   283: aload_0
    //   284: areturn
    //   285: new 12	gZ$b$a
    //   288: dup
    //   289: aconst_null
    //   290: invokespecial 117	gZ$b$a:<init>	(LQY;)V
    //   293: areturn
    //   294: aconst_null
    //   295: areturn
    //   296: getstatic 27	gZ$b:d	LgZ$b;
    //   299: areturn
    //   300: new 2	gZ$b
    //   303: dup
    //   304: invokespecial 25	gZ$b:<init>	()V
    //   307: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	308	0	this	b
    //   0	308	1	parami	PT.i
    //   0	308	2	paramObject1	Object
    //   0	308	3	paramObject2	Object
    //   121	50	4	i	int
    //   132	16	5	j	int
    // Exception table:
    //   from	to	target	type
    //   73	94	100	finally
    //   94	97	100	finally
    //   101	104	100	finally
    //   128	134	175	finally
    //   146	155	175	finally
    //   158	166	175	finally
    //   180	209	175	finally
    //   210	227	175	finally
    //   128	134	179	java/io/IOException
    //   146	155	179	java/io/IOException
    //   158	166	179	java/io/IOException
    //   128	134	209	RT
    //   146	155	209	RT
    //   158	166	209	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (!this.f.isEmpty()) {
      paramJT.b(1, k());
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
    this.c = i;
    return i;
  }
  
  public String k()
  {
    return this.f;
  }
  
  public static final class a
    extends PT.a<gZ.b, a>
    implements gZ.c
  {
    private a()
    {
      super();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gZ$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */