import java.io.IOException;

public final class kZ$b
  extends PT<b, kZ.b.a>
  implements kZ.c
{
  private static final b d = new b();
  private static volatile YT<b> e;
  private int f = 0;
  private Object g;
  
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
    //   0: getstatic 56	QY:a	[I
    //   3: aload_1
    //   4: invokevirtual 62	java/lang/Enum:ordinal	()I
    //   7: iaload
    //   8: istore 4
    //   10: iconst_0
    //   11: istore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: iconst_0
    //   17: istore 7
    //   19: iconst_0
    //   20: istore 8
    //   22: iload 4
    //   24: tableswitch	default:+48->72, 1:+539->563, 2:+535->559, 3:+533->557, 4:+524->548, 5:+360->384, 6:+102->126, 7:+356->380, 8:+56->80
    //   72: new 64	java/lang/UnsupportedOperationException
    //   75: dup
    //   76: invokespecial 65	java/lang/UnsupportedOperationException:<init>	()V
    //   79: athrow
    //   80: getstatic 67	kZ$b:e	LYT;
    //   83: ifnonnull +39 -> 122
    //   86: ldc 2
    //   88: monitorenter
    //   89: getstatic 67	kZ$b:e	LYT;
    //   92: ifnonnull +18 -> 110
    //   95: new 69	PT$b
    //   98: astore_1
    //   99: aload_1
    //   100: getstatic 31	kZ$b:d	LkZ$b;
    //   103: invokespecial 72	PT$b:<init>	(LPT;)V
    //   106: aload_1
    //   107: putstatic 67	kZ$b:e	LYT;
    //   110: ldc 2
    //   112: monitorexit
    //   113: goto +9 -> 122
    //   116: astore_1
    //   117: ldc 2
    //   119: monitorexit
    //   120: aload_1
    //   121: athrow
    //   122: getstatic 67	kZ$b:e	LYT;
    //   125: areturn
    //   126: aload_2
    //   127: checkcast 74	HT
    //   130: astore_2
    //   131: aload_3
    //   132: checkcast 76	LT
    //   135: astore_3
    //   136: iload 8
    //   138: ifne +242 -> 380
    //   141: aload_2
    //   142: invokevirtual 79	HT:n	()I
    //   145: istore 4
    //   147: iload 4
    //   149: ifeq +171 -> 320
    //   152: iload 4
    //   154: bipush 10
    //   156: if_icmpeq +93 -> 249
    //   159: iload 4
    //   161: bipush 18
    //   163: if_icmpeq +15 -> 178
    //   166: aload_2
    //   167: iload 4
    //   169: invokevirtual 82	HT:e	(I)Z
    //   172: ifne -36 -> 136
    //   175: goto +145 -> 320
    //   178: aload_0
    //   179: getfield 38	kZ$b:f	I
    //   182: iconst_2
    //   183: if_icmpne +20 -> 203
    //   186: aload_0
    //   187: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   190: checkcast 86	iZ
    //   193: invokevirtual 90	PT:c	()LPT$a;
    //   196: checkcast 92	iZ$a
    //   199: astore_1
    //   200: goto +5 -> 205
    //   203: aconst_null
    //   204: astore_1
    //   205: aload_0
    //   206: aload_2
    //   207: invokestatic 94	iZ:parser	()LYT;
    //   210: aload_3
    //   211: invokevirtual 97	HT:a	(LYT;LLT;)LVT;
    //   214: putfield 84	kZ$b:g	Ljava/lang/Object;
    //   217: aload_1
    //   218: ifnull +23 -> 241
    //   221: aload_1
    //   222: aload_0
    //   223: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   226: checkcast 86	iZ
    //   229: invokevirtual 102	PT$a:b	(LPT;)LPT$a;
    //   232: pop
    //   233: aload_0
    //   234: aload_1
    //   235: invokevirtual 105	PT$a:b	()LPT;
    //   238: putfield 84	kZ$b:g	Ljava/lang/Object;
    //   241: aload_0
    //   242: iconst_2
    //   243: putfield 38	kZ$b:f	I
    //   246: goto -110 -> 136
    //   249: aload_0
    //   250: getfield 38	kZ$b:f	I
    //   253: iconst_1
    //   254: if_icmpne +20 -> 274
    //   257: aload_0
    //   258: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   261: checkcast 107	laa
    //   264: invokevirtual 90	PT:c	()LPT$a;
    //   267: checkcast 109	laa$a
    //   270: astore_1
    //   271: goto +5 -> 276
    //   274: aconst_null
    //   275: astore_1
    //   276: aload_0
    //   277: aload_2
    //   278: invokestatic 110	laa:parser	()LYT;
    //   281: aload_3
    //   282: invokevirtual 97	HT:a	(LYT;LLT;)LVT;
    //   285: putfield 84	kZ$b:g	Ljava/lang/Object;
    //   288: aload_1
    //   289: ifnull +23 -> 312
    //   292: aload_1
    //   293: aload_0
    //   294: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   297: checkcast 107	laa
    //   300: invokevirtual 102	PT$a:b	(LPT;)LPT$a;
    //   303: pop
    //   304: aload_0
    //   305: aload_1
    //   306: invokevirtual 105	PT$a:b	()LPT;
    //   309: putfield 84	kZ$b:g	Ljava/lang/Object;
    //   312: aload_0
    //   313: iconst_1
    //   314: putfield 38	kZ$b:f	I
    //   317: goto -181 -> 136
    //   320: iconst_1
    //   321: istore 8
    //   323: goto -187 -> 136
    //   326: astore_1
    //   327: goto +51 -> 378
    //   330: astore_3
    //   331: new 112	java/lang/RuntimeException
    //   334: astore_2
    //   335: new 49	RT
    //   338: astore_1
    //   339: aload_1
    //   340: aload_3
    //   341: invokevirtual 116	java/io/IOException:getMessage	()Ljava/lang/String;
    //   344: invokespecial 119	RT:<init>	(Ljava/lang/String;)V
    //   347: aload_1
    //   348: aload_0
    //   349: invokevirtual 122	RT:a	(LVT;)LRT;
    //   352: pop
    //   353: aload_2
    //   354: aload_1
    //   355: invokespecial 125	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   358: aload_2
    //   359: athrow
    //   360: astore_1
    //   361: new 112	java/lang/RuntimeException
    //   364: astore_2
    //   365: aload_1
    //   366: aload_0
    //   367: invokevirtual 122	RT:a	(LVT;)LRT;
    //   370: pop
    //   371: aload_2
    //   372: aload_1
    //   373: invokespecial 125	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   376: aload_2
    //   377: athrow
    //   378: aload_1
    //   379: athrow
    //   380: getstatic 31	kZ$b:d	LkZ$b;
    //   383: areturn
    //   384: aload_2
    //   385: checkcast 127	PT$j
    //   388: astore_1
    //   389: aload_3
    //   390: checkcast 2	kZ$b
    //   393: astore_2
    //   394: getstatic 129	QY:c	[I
    //   397: aload_2
    //   398: invokevirtual 133	kZ$b:l	()LkZ$b$b;
    //   401: invokevirtual 62	java/lang/Enum:ordinal	()I
    //   404: iaload
    //   405: istore 8
    //   407: iload 8
    //   409: iconst_1
    //   410: if_icmpeq +77 -> 487
    //   413: iload 8
    //   415: iconst_2
    //   416: if_icmpeq +33 -> 449
    //   419: iload 8
    //   421: iconst_3
    //   422: if_icmpeq +6 -> 428
    //   425: goto +97 -> 522
    //   428: aload_0
    //   429: getfield 38	kZ$b:f	I
    //   432: ifeq +6 -> 438
    //   435: iconst_1
    //   436: istore 5
    //   438: aload_1
    //   439: iload 5
    //   441: invokeinterface 136 2 0
    //   446: goto +76 -> 522
    //   449: iload 6
    //   451: istore 5
    //   453: aload_0
    //   454: getfield 38	kZ$b:f	I
    //   457: iconst_2
    //   458: if_icmpne +6 -> 464
    //   461: iconst_1
    //   462: istore 5
    //   464: aload_0
    //   465: aload_1
    //   466: iload 5
    //   468: aload_0
    //   469: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   472: aload_2
    //   473: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   476: invokeinterface 139 4 0
    //   481: putfield 84	kZ$b:g	Ljava/lang/Object;
    //   484: goto +38 -> 522
    //   487: iload 7
    //   489: istore 5
    //   491: aload_0
    //   492: getfield 38	kZ$b:f	I
    //   495: iconst_1
    //   496: if_icmpne +6 -> 502
    //   499: iconst_1
    //   500: istore 5
    //   502: aload_0
    //   503: aload_1
    //   504: iload 5
    //   506: aload_0
    //   507: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   510: aload_2
    //   511: getfield 84	kZ$b:g	Ljava/lang/Object;
    //   514: invokeinterface 139 4 0
    //   519: putfield 84	kZ$b:g	Ljava/lang/Object;
    //   522: aload_1
    //   523: getstatic 144	PT$h:a	LPT$h;
    //   526: if_acmpne +20 -> 546
    //   529: aload_2
    //   530: getfield 38	kZ$b:f	I
    //   533: istore 8
    //   535: iload 8
    //   537: ifeq +9 -> 546
    //   540: aload_0
    //   541: iload 8
    //   543: putfield 38	kZ$b:f	I
    //   546: aload_0
    //   547: areturn
    //   548: new 12	kZ$b$a
    //   551: dup
    //   552: aconst_null
    //   553: invokespecial 147	kZ$b$a:<init>	(LQY;)V
    //   556: areturn
    //   557: aconst_null
    //   558: areturn
    //   559: getstatic 31	kZ$b:d	LkZ$b;
    //   562: areturn
    //   563: new 2	kZ$b
    //   566: dup
    //   567: invokespecial 29	kZ$b:<init>	()V
    //   570: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	571	0	this	b
    //   0	571	1	parami	PT.i
    //   0	571	2	paramObject1	Object
    //   0	571	3	paramObject2	Object
    //   8	160	4	i	int
    //   11	494	5	bool1	boolean
    //   14	436	6	bool2	boolean
    //   17	471	7	bool3	boolean
    //   20	522	8	j	int
    // Exception table:
    //   from	to	target	type
    //   89	110	116	finally
    //   110	113	116	finally
    //   117	120	116	finally
    //   141	147	326	finally
    //   166	175	326	finally
    //   178	200	326	finally
    //   205	217	326	finally
    //   221	241	326	finally
    //   241	246	326	finally
    //   249	271	326	finally
    //   276	288	326	finally
    //   292	312	326	finally
    //   312	317	326	finally
    //   331	360	326	finally
    //   361	378	326	finally
    //   141	147	330	java/io/IOException
    //   166	175	330	java/io/IOException
    //   178	200	330	java/io/IOException
    //   205	217	330	java/io/IOException
    //   221	241	330	java/io/IOException
    //   241	246	330	java/io/IOException
    //   249	271	330	java/io/IOException
    //   276	288	330	java/io/IOException
    //   292	312	330	java/io/IOException
    //   312	317	330	java/io/IOException
    //   141	147	360	RT
    //   166	175	360	RT
    //   178	200	360	RT
    //   205	217	360	RT
    //   221	241	360	RT
    //   241	246	360	RT
    //   249	271	360	RT
    //   276	288	360	RT
    //   292	312	360	RT
    //   312	317	360	RT
  }
  
  public void a(JT paramJT)
    throws IOException
  {
    if (this.f == 1) {
      paramJT.b(1, (laa)this.g);
    }
    if (this.f == 2) {
      paramJT.b(2, (iZ)this.g);
    }
  }
  
  public int d()
  {
    int i = this.c;
    if (i != -1) {
      return i;
    }
    i = 0;
    if (this.f == 1) {
      i = 0 + JT.a(1, (laa)this.g);
    }
    int j = i;
    if (this.f == 2) {
      j = i + JT.a(2, (iZ)this.g);
    }
    this.c = j;
    return j;
  }
  
  public iZ k()
  {
    if (this.f == 2) {
      return (iZ)this.g;
    }
    return iZ.k();
  }
  
  public kZ.b.b l()
  {
    return kZ.b.b.a(this.f);
  }
  
  public laa m()
  {
    if (this.f == 1) {
      return (laa)this.g;
    }
    return laa.l();
  }
  
  public static final class a
    extends PT.a<kZ.b, a>
    implements kZ.c
  {
    private a()
    {
      super();
    }
  }
  
  public static enum b
    implements QT.a
  {
    private final int e;
    
    private b(int paramInt)
    {
      this.e = paramInt;
    }
    
    public static b a(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return null;
          }
          return b;
        }
        return a;
      }
      return c;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kZ$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */