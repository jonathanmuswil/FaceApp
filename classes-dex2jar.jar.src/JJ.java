import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.a;
import java.util.List;
import java.util.concurrent.Executor;

public final class jj<R>
  implements cj, rj, hj, Tj.c
{
  private static final qd<jj<?>> a = Tj.a(150, new ij());
  private static final boolean b = Log.isLoggable("Request", 2);
  private Drawable A;
  private int B;
  private int C;
  private RuntimeException D;
  private boolean c;
  private final String d;
  private final Wj e;
  private fj<R> f;
  private dj g;
  private Context h;
  private Ce i;
  private Object j;
  private Class<R> k;
  private _i<?> l;
  private int m;
  private int n;
  private Fe o;
  private sj<R> p;
  private List<fj<R>> q;
  private Jf r;
  private yj<? super R> s;
  private Executor t;
  private Wf<R> u;
  private Jf.d v;
  private long w;
  private jj.a x;
  private Drawable y;
  private Drawable z;
  
  jj()
  {
    String str;
    if (b) {
      str = String.valueOf(super.hashCode());
    } else {
      str = null;
    }
    this.d = str;
    this.e = Wj.a();
  }
  
  private static int a(int paramInt, float paramFloat)
  {
    if (paramInt != Integer.MIN_VALUE) {
      paramInt = Math.round(paramFloat * paramInt);
    }
    return paramInt;
  }
  
  private Drawable a(int paramInt)
  {
    Resources.Theme localTheme;
    if (this.l.u() != null) {
      localTheme = this.l.u();
    } else {
      localTheme = this.h.getTheme();
    }
    return Yh.a(this.i, paramInt, localTheme);
  }
  
  public static <R> jj<R> a(Context paramContext, Ce paramCe, Object paramObject, Class<R> paramClass, _i<?> param_i, int paramInt1, int paramInt2, Fe paramFe, sj<R> paramsj, fj<R> paramfj, List<fj<R>> paramList, dj paramdj, Jf paramJf, yj<? super R> paramyj, Executor paramExecutor)
  {
    jj localjj1 = (jj)a.a();
    jj localjj2 = localjj1;
    if (localjj1 == null) {
      localjj2 = new jj();
    }
    localjj2.b(paramContext, paramCe, paramObject, paramClass, param_i, paramInt1, paramInt2, paramFe, paramsj, paramfj, paramList, paramdj, paramJf, paramyj, paramExecutor);
    return localjj2;
  }
  
  /* Error */
  private void a(Qf paramQf, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 122	jj:e	LWj;
    //   6: invokevirtual 167	Wj:b	()V
    //   9: aload_1
    //   10: aload_0
    //   11: getfield 169	jj:D	Ljava/lang/RuntimeException;
    //   14: invokevirtual 174	Qf:a	(Ljava/lang/Exception;)V
    //   17: aload_0
    //   18: getfield 147	jj:i	LCe;
    //   21: invokevirtual 178	Ce:e	()I
    //   24: istore_3
    //   25: iload_3
    //   26: iload_2
    //   27: if_icmpgt +98 -> 125
    //   30: new 180	java/lang/StringBuilder
    //   33: astore 4
    //   35: aload 4
    //   37: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   40: aload 4
    //   42: ldc -73
    //   44: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload 4
    //   50: aload_0
    //   51: getfield 189	jj:j	Ljava/lang/Object;
    //   54: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload 4
    //   60: ldc -62
    //   62: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload 4
    //   68: aload_0
    //   69: getfield 196	jj:B	I
    //   72: invokevirtual 199	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload 4
    //   78: ldc -56
    //   80: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload 4
    //   86: aload_0
    //   87: getfield 202	jj:C	I
    //   90: invokevirtual 199	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload 4
    //   96: ldc -52
    //   98: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: pop
    //   102: ldc -50
    //   104: aload 4
    //   106: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   109: aload_1
    //   110: invokestatic 213	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   113: pop
    //   114: iload_3
    //   115: iconst_4
    //   116: if_icmpgt +9 -> 125
    //   119: aload_1
    //   120: ldc -50
    //   122: invokevirtual 216	Qf:a	(Ljava/lang/String;)V
    //   125: aload_0
    //   126: aconst_null
    //   127: putfield 218	jj:v	LJf$d;
    //   130: aload_0
    //   131: getstatic 220	jj$a:e	Ljj$a;
    //   134: putfield 222	jj:x	Ljj$a;
    //   137: iconst_1
    //   138: istore 5
    //   140: aload_0
    //   141: iconst_1
    //   142: putfield 224	jj:c	Z
    //   145: aload_0
    //   146: getfield 226	jj:q	Ljava/util/List;
    //   149: ifnull +62 -> 211
    //   152: aload_0
    //   153: getfield 226	jj:q	Ljava/util/List;
    //   156: invokeinterface 232 1 0
    //   161: astore 4
    //   163: iconst_0
    //   164: istore_2
    //   165: iload_2
    //   166: istore_3
    //   167: aload 4
    //   169: invokeinterface 238 1 0
    //   174: ifeq +39 -> 213
    //   177: iload_2
    //   178: aload 4
    //   180: invokeinterface 241 1 0
    //   185: checkcast 243	fj
    //   188: aload_1
    //   189: aload_0
    //   190: getfield 189	jj:j	Ljava/lang/Object;
    //   193: aload_0
    //   194: getfield 245	jj:p	Lsj;
    //   197: aload_0
    //   198: invokespecial 247	jj:o	()Z
    //   201: invokeinterface 250 5 0
    //   206: ior
    //   207: istore_2
    //   208: goto -43 -> 165
    //   211: iconst_0
    //   212: istore_3
    //   213: aload_0
    //   214: getfield 252	jj:f	Lfj;
    //   217: ifnull +34 -> 251
    //   220: aload_0
    //   221: getfield 252	jj:f	Lfj;
    //   224: aload_1
    //   225: aload_0
    //   226: getfield 189	jj:j	Ljava/lang/Object;
    //   229: aload_0
    //   230: getfield 245	jj:p	Lsj;
    //   233: aload_0
    //   234: invokespecial 247	jj:o	()Z
    //   237: invokeinterface 250 5 0
    //   242: ifeq +9 -> 251
    //   245: iload 5
    //   247: istore_2
    //   248: goto +5 -> 253
    //   251: iconst_0
    //   252: istore_2
    //   253: iload_3
    //   254: iload_2
    //   255: ior
    //   256: ifne +7 -> 263
    //   259: aload_0
    //   260: invokespecial 254	jj:r	()V
    //   263: aload_0
    //   264: iconst_0
    //   265: putfield 224	jj:c	Z
    //   268: aload_0
    //   269: invokespecial 256	jj:p	()V
    //   272: aload_0
    //   273: monitorexit
    //   274: return
    //   275: astore_1
    //   276: aload_0
    //   277: iconst_0
    //   278: putfield 224	jj:c	Z
    //   281: aload_1
    //   282: athrow
    //   283: astore_1
    //   284: aload_0
    //   285: monitorexit
    //   286: aload_1
    //   287: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	this	jj
    //   0	288	1	paramQf	Qf
    //   0	288	2	paramInt	int
    //   24	232	3	i1	int
    //   33	146	4	localObject	Object
    //   138	108	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   145	163	275	finally
    //   167	208	275	finally
    //   213	245	275	finally
    //   259	263	275	finally
    //   2	25	283	finally
    //   30	114	283	finally
    //   119	125	283	finally
    //   125	137	283	finally
    //   140	145	283	finally
    //   263	272	283	finally
    //   276	283	283	finally
  }
  
  private void a(Wf<?> paramWf)
  {
    this.r.b(paramWf);
    this.u = null;
  }
  
  /* Error */
  private void a(Wf<R> paramWf, R paramR, a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 247	jj:o	()Z
    //   6: istore 4
    //   8: aload_0
    //   9: getstatic 269	jj$a:d	Ljj$a;
    //   12: putfield 222	jj:x	Ljj$a;
    //   15: aload_0
    //   16: aload_1
    //   17: putfield 265	jj:u	LWf;
    //   20: aload_0
    //   21: getfield 147	jj:i	LCe;
    //   24: invokevirtual 178	Ce:e	()I
    //   27: iconst_3
    //   28: if_icmpgt +132 -> 160
    //   31: new 180	java/lang/StringBuilder
    //   34: astore_1
    //   35: aload_1
    //   36: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   39: aload_1
    //   40: ldc_w 271
    //   43: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_1
    //   48: aload_2
    //   49: invokevirtual 275	java/lang/Object:getClass	()Ljava/lang/Class;
    //   52: invokevirtual 280	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   55: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_1
    //   60: ldc_w 282
    //   63: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: aload_1
    //   68: aload_3
    //   69: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload_1
    //   74: ldc_w 284
    //   77: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_1
    //   82: aload_0
    //   83: getfield 189	jj:j	Ljava/lang/Object;
    //   86: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_1
    //   91: ldc -62
    //   93: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload_1
    //   98: aload_0
    //   99: getfield 196	jj:B	I
    //   102: invokevirtual 199	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_1
    //   107: ldc -56
    //   109: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: aload_1
    //   114: aload_0
    //   115: getfield 202	jj:C	I
    //   118: invokevirtual 199	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload_1
    //   123: ldc_w 286
    //   126: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_1
    //   131: aload_0
    //   132: getfield 288	jj:w	J
    //   135: invokestatic 293	Jj:a	(J)D
    //   138: invokevirtual 296	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload_1
    //   143: ldc_w 298
    //   146: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: ldc -50
    //   152: aload_1
    //   153: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokestatic 301	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   159: pop
    //   160: iconst_1
    //   161: istore 5
    //   163: aload_0
    //   164: iconst_1
    //   165: putfield 224	jj:c	Z
    //   168: aload_0
    //   169: getfield 226	jj:q	Ljava/util/List;
    //   172: ifnull +63 -> 235
    //   175: aload_0
    //   176: getfield 226	jj:q	Ljava/util/List;
    //   179: invokeinterface 232 1 0
    //   184: astore_1
    //   185: iconst_0
    //   186: istore 6
    //   188: iload 6
    //   190: istore 7
    //   192: aload_1
    //   193: invokeinterface 238 1 0
    //   198: ifeq +40 -> 238
    //   201: iload 6
    //   203: aload_1
    //   204: invokeinterface 241 1 0
    //   209: checkcast 243	fj
    //   212: aload_2
    //   213: aload_0
    //   214: getfield 189	jj:j	Ljava/lang/Object;
    //   217: aload_0
    //   218: getfield 245	jj:p	Lsj;
    //   221: aload_3
    //   222: iload 4
    //   224: invokeinterface 304 6 0
    //   229: ior
    //   230: istore 6
    //   232: goto -44 -> 188
    //   235: iconst_0
    //   236: istore 7
    //   238: aload_0
    //   239: getfield 252	jj:f	Lfj;
    //   242: ifnull +34 -> 276
    //   245: aload_0
    //   246: getfield 252	jj:f	Lfj;
    //   249: aload_2
    //   250: aload_0
    //   251: getfield 189	jj:j	Ljava/lang/Object;
    //   254: aload_0
    //   255: getfield 245	jj:p	Lsj;
    //   258: aload_3
    //   259: iload 4
    //   261: invokeinterface 304 6 0
    //   266: ifeq +10 -> 276
    //   269: iload 5
    //   271: istore 6
    //   273: goto +6 -> 279
    //   276: iconst_0
    //   277: istore 6
    //   279: iload 6
    //   281: iload 7
    //   283: ior
    //   284: ifne +27 -> 311
    //   287: aload_0
    //   288: getfield 306	jj:s	Lyj;
    //   291: aload_3
    //   292: iload 4
    //   294: invokeinterface 311 3 0
    //   299: astore_1
    //   300: aload_0
    //   301: getfield 245	jj:p	Lsj;
    //   304: aload_2
    //   305: aload_1
    //   306: invokeinterface 316 3 0
    //   311: aload_0
    //   312: iconst_0
    //   313: putfield 224	jj:c	Z
    //   316: aload_0
    //   317: invokespecial 318	jj:q	()V
    //   320: aload_0
    //   321: monitorexit
    //   322: return
    //   323: astore_1
    //   324: aload_0
    //   325: iconst_0
    //   326: putfield 224	jj:c	Z
    //   329: aload_1
    //   330: athrow
    //   331: astore_1
    //   332: aload_0
    //   333: monitorexit
    //   334: aload_1
    //   335: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	336	0	this	jj
    //   0	336	1	paramWf	Wf<R>
    //   0	336	2	paramR	R
    //   0	336	3	parama	a
    //   6	287	4	bool1	boolean
    //   161	109	5	bool2	boolean
    //   186	98	6	bool3	boolean
    //   190	94	7	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   168	185	323	finally
    //   192	232	323	finally
    //   238	269	323	finally
    //   287	311	323	finally
    //   2	160	331	finally
    //   163	168	331	finally
    //   311	320	331	finally
    //   324	331	331	finally
  }
  
  private void a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" this: ");
    localStringBuilder.append(this.d);
    Log.v("Request", localStringBuilder.toString());
  }
  
  /* Error */
  private boolean a(jj<?> paramjj)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 226	jj:q	Ljava/util/List;
    //   8: astore_2
    //   9: iconst_0
    //   10: istore_3
    //   11: aload_2
    //   12: ifnonnull +9 -> 21
    //   15: iconst_0
    //   16: istore 4
    //   18: goto +14 -> 32
    //   21: aload_0
    //   22: getfield 226	jj:q	Ljava/util/List;
    //   25: invokeinterface 327 1 0
    //   30: istore 4
    //   32: aload_1
    //   33: getfield 226	jj:q	Ljava/util/List;
    //   36: ifnonnull +9 -> 45
    //   39: iconst_0
    //   40: istore 5
    //   42: goto +14 -> 56
    //   45: aload_1
    //   46: getfield 226	jj:q	Ljava/util/List;
    //   49: invokeinterface 327 1 0
    //   54: istore 5
    //   56: iload 4
    //   58: iload 5
    //   60: if_icmpne +5 -> 65
    //   63: iconst_1
    //   64: istore_3
    //   65: aload_1
    //   66: monitorexit
    //   67: aload_0
    //   68: monitorexit
    //   69: iload_3
    //   70: ireturn
    //   71: astore_2
    //   72: aload_1
    //   73: monitorexit
    //   74: aload_2
    //   75: athrow
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	jj
    //   0	81	1	paramjj	jj<?>
    //   8	4	2	localList	List
    //   71	4	2	localObject	Object
    //   10	60	3	bool	boolean
    //   16	45	4	i1	int
    //   40	21	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   4	9	71	finally
    //   21	32	71	finally
    //   32	39	71	finally
    //   45	56	71	finally
    //   65	67	71	finally
    //   72	74	71	finally
    //   2	4	76	finally
    //   74	76	76	finally
  }
  
  private void b(Context paramContext, Ce paramCe, Object paramObject, Class<R> paramClass, _i<?> param_i, int paramInt1, int paramInt2, Fe paramFe, sj<R> paramsj, fj<R> paramfj, List<fj<R>> paramList, dj paramdj, Jf paramJf, yj<? super R> paramyj, Executor paramExecutor)
  {
    try
    {
      this.h = paramContext;
      this.i = paramCe;
      this.j = paramObject;
      this.k = paramClass;
      this.l = param_i;
      this.m = paramInt1;
      this.n = paramInt2;
      this.o = paramFe;
      this.p = paramsj;
      this.f = paramfj;
      this.q = paramList;
      this.g = paramdj;
      this.r = paramJf;
      this.s = paramyj;
      this.t = paramExecutor;
      this.x = jj.a.a;
      if ((this.D == null) && (paramCe.g()))
      {
        paramContext = new java/lang/RuntimeException;
        paramContext.<init>("Glide request origin trace");
        this.D = paramContext;
      }
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private void g()
  {
    if (!this.c) {
      return;
    }
    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
  }
  
  private boolean h()
  {
    dj localdj = this.g;
    boolean bool;
    if ((localdj != null) && (!localdj.f(this))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean i()
  {
    dj localdj = this.g;
    boolean bool;
    if ((localdj != null) && (!localdj.c(this))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean j()
  {
    dj localdj = this.g;
    boolean bool;
    if ((localdj != null) && (!localdj.d(this))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void k()
  {
    g();
    this.e.b();
    this.p.a(this);
    Jf.d locald = this.v;
    if (locald != null)
    {
      locald.a();
      this.v = null;
    }
  }
  
  private Drawable l()
  {
    if (this.y == null)
    {
      this.y = this.l.g();
      if ((this.y == null) && (this.l.f() > 0)) {
        this.y = a(this.l.f());
      }
    }
    return this.y;
  }
  
  private Drawable m()
  {
    if (this.A == null)
    {
      this.A = this.l.h();
      if ((this.A == null) && (this.l.i() > 0)) {
        this.A = a(this.l.i());
      }
    }
    return this.A;
  }
  
  private Drawable n()
  {
    if (this.z == null)
    {
      this.z = this.l.o();
      if ((this.z == null) && (this.l.p() > 0)) {
        this.z = a(this.l.p());
      }
    }
    return this.z;
  }
  
  private boolean o()
  {
    dj localdj = this.g;
    boolean bool;
    if ((localdj != null) && (localdj.d())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void p()
  {
    dj localdj = this.g;
    if (localdj != null) {
      localdj.b(this);
    }
  }
  
  private void q()
  {
    dj localdj = this.g;
    if (localdj != null) {
      localdj.e(this);
    }
  }
  
  private void r()
  {
    try
    {
      boolean bool = i();
      if (!bool) {
        return;
      }
      Object localObject1 = null;
      if (this.j == null) {
        localObject1 = m();
      }
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = l();
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = n();
      }
      this.p.a((Drawable)localObject1);
      return;
    }
    finally {}
  }
  
  public void a()
  {
    try
    {
      g();
      this.h = null;
      this.i = null;
      this.j = null;
      this.k = null;
      this.l = null;
      this.m = -1;
      this.n = -1;
      this.p = null;
      this.q = null;
      this.f = null;
      this.g = null;
      this.s = null;
      this.v = null;
      this.y = null;
      this.z = null;
      this.A = null;
      this.B = -1;
      this.C = -1;
      this.D = null;
      a.a(this);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void a(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 122	jj:e	LWj;
    //   6: invokevirtual 167	Wj:b	()V
    //   9: getstatic 101	jj:b	Z
    //   12: ifeq +39 -> 51
    //   15: new 180	java/lang/StringBuilder
    //   18: astore_3
    //   19: aload_3
    //   20: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   23: aload_3
    //   24: ldc_w 419
    //   27: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_3
    //   32: aload_0
    //   33: getfield 288	jj:w	J
    //   36: invokestatic 293	Jj:a	(J)D
    //   39: invokevirtual 296	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload_0
    //   44: aload_3
    //   45: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 420	jj:a	(Ljava/lang/String;)V
    //   51: aload_0
    //   52: getfield 222	jj:x	Ljj$a;
    //   55: astore_3
    //   56: getstatic 422	jj$a:c	Ljj$a;
    //   59: astore 4
    //   61: aload_3
    //   62: aload 4
    //   64: if_acmpeq +6 -> 70
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: aload_0
    //   71: getstatic 424	jj$a:b	Ljj$a;
    //   74: putfield 222	jj:x	Ljj$a;
    //   77: aload_0
    //   78: getfield 133	jj:l	L_i;
    //   81: invokevirtual 427	_i:t	()F
    //   84: fstore 5
    //   86: aload_0
    //   87: iload_1
    //   88: fload 5
    //   90: invokestatic 429	jj:a	(IF)I
    //   93: putfield 196	jj:B	I
    //   96: aload_0
    //   97: iload_2
    //   98: fload 5
    //   100: invokestatic 429	jj:a	(IF)I
    //   103: putfield 202	jj:C	I
    //   106: getstatic 101	jj:b	Z
    //   109: ifeq +39 -> 148
    //   112: new 180	java/lang/StringBuilder
    //   115: astore_3
    //   116: aload_3
    //   117: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   120: aload_3
    //   121: ldc_w 431
    //   124: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_3
    //   129: aload_0
    //   130: getfield 288	jj:w	J
    //   133: invokestatic 293	Jj:a	(J)D
    //   136: invokevirtual 296	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload_0
    //   141: aload_3
    //   142: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokespecial 420	jj:a	(Ljava/lang/String;)V
    //   148: aload_0
    //   149: getfield 259	jj:r	LJf;
    //   152: astore 6
    //   154: aload_0
    //   155: getfield 147	jj:i	LCe;
    //   158: astore 7
    //   160: aload_0
    //   161: getfield 189	jj:j	Ljava/lang/Object;
    //   164: astore 8
    //   166: aload_0
    //   167: getfield 133	jj:l	L_i;
    //   170: invokevirtual 434	_i:s	()Lcom/bumptech/glide/load/g;
    //   173: astore 9
    //   175: aload_0
    //   176: getfield 196	jj:B	I
    //   179: istore_2
    //   180: aload_0
    //   181: getfield 202	jj:C	I
    //   184: istore_1
    //   185: aload_0
    //   186: getfield 133	jj:l	L_i;
    //   189: invokevirtual 436	_i:r	()Ljava/lang/Class;
    //   192: astore 10
    //   194: aload_0
    //   195: getfield 330	jj:k	Ljava/lang/Class;
    //   198: astore 11
    //   200: aload_0
    //   201: getfield 336	jj:o	LFe;
    //   204: astore 12
    //   206: aload_0
    //   207: getfield 133	jj:l	L_i;
    //   210: invokevirtual 439	_i:e	()LHf;
    //   213: astore 13
    //   215: aload_0
    //   216: getfield 133	jj:l	L_i;
    //   219: invokevirtual 442	_i:v	()Ljava/util/Map;
    //   222: astore 14
    //   224: aload_0
    //   225: getfield 133	jj:l	L_i;
    //   228: invokevirtual 445	_i:V	()Z
    //   231: istore 15
    //   233: aload_0
    //   234: getfield 133	jj:l	L_i;
    //   237: invokevirtual 448	_i:T	()Z
    //   240: istore 16
    //   242: aload_0
    //   243: getfield 133	jj:l	L_i;
    //   246: invokevirtual 451	_i:k	()Lcom/bumptech/glide/load/j;
    //   249: astore 4
    //   251: aload_0
    //   252: getfield 133	jj:l	L_i;
    //   255: invokevirtual 454	_i:R	()Z
    //   258: istore 17
    //   260: aload_0
    //   261: getfield 133	jj:l	L_i;
    //   264: invokevirtual 457	_i:Q	()Z
    //   267: istore 18
    //   269: aload_0
    //   270: getfield 133	jj:l	L_i;
    //   273: invokevirtual 460	_i:P	()Z
    //   276: istore 19
    //   278: aload_0
    //   279: getfield 133	jj:l	L_i;
    //   282: invokevirtual 462	_i:j	()Z
    //   285: istore 20
    //   287: aload_0
    //   288: getfield 340	jj:t	Ljava/util/concurrent/Executor;
    //   291: astore_3
    //   292: aload 6
    //   294: aload 7
    //   296: aload 8
    //   298: aload 9
    //   300: iload_2
    //   301: iload_1
    //   302: aload 10
    //   304: aload 11
    //   306: aload 12
    //   308: aload 13
    //   310: aload 14
    //   312: iload 15
    //   314: iload 16
    //   316: aload 4
    //   318: iload 17
    //   320: iload 18
    //   322: iload 19
    //   324: iload 20
    //   326: aload_0
    //   327: aload_3
    //   328: invokevirtual 465	Jf:a	(LCe;Ljava/lang/Object;Lcom/bumptech/glide/load/g;IILjava/lang/Class;Ljava/lang/Class;LFe;LHf;Ljava/util/Map;ZZLcom/bumptech/glide/load/j;ZZZZLhj;Ljava/util/concurrent/Executor;)LJf$d;
    //   331: astore_3
    //   332: aload_0
    //   333: aload_3
    //   334: putfield 218	jj:v	LJf$d;
    //   337: aload_0
    //   338: getfield 222	jj:x	Ljj$a;
    //   341: getstatic 424	jj$a:b	Ljj$a;
    //   344: if_acmpeq +8 -> 352
    //   347: aload_0
    //   348: aconst_null
    //   349: putfield 218	jj:v	LJf$d;
    //   352: getstatic 101	jj:b	Z
    //   355: ifeq +39 -> 394
    //   358: new 180	java/lang/StringBuilder
    //   361: astore_3
    //   362: aload_3
    //   363: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   366: aload_3
    //   367: ldc_w 467
    //   370: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload_3
    //   375: aload_0
    //   376: getfield 288	jj:w	J
    //   379: invokestatic 293	Jj:a	(J)D
    //   382: invokevirtual 296	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: aload_0
    //   387: aload_3
    //   388: invokevirtual 210	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   391: invokespecial 420	jj:a	(Ljava/lang/String;)V
    //   394: aload_0
    //   395: monitorexit
    //   396: return
    //   397: astore_3
    //   398: goto +8 -> 406
    //   401: astore_3
    //   402: goto +4 -> 406
    //   405: astore_3
    //   406: aload_0
    //   407: monitorexit
    //   408: aload_3
    //   409: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	410	0	this	jj
    //   0	410	1	paramInt1	int
    //   0	410	2	paramInt2	int
    //   18	370	3	localObject1	Object
    //   397	1	3	localObject2	Object
    //   401	1	3	localObject3	Object
    //   405	4	3	localObject4	Object
    //   59	258	4	localObject5	Object
    //   84	15	5	f1	float
    //   152	141	6	localJf	Jf
    //   158	137	7	localCe	Ce
    //   164	133	8	localObject6	Object
    //   173	126	9	localg	com.bumptech.glide.load.g
    //   192	111	10	localClass1	Class
    //   198	107	11	localClass2	Class
    //   204	103	12	localFe	Fe
    //   213	96	13	localHf	Hf
    //   222	89	14	localMap	java.util.Map
    //   231	82	15	bool1	boolean
    //   240	75	16	bool2	boolean
    //   258	61	17	bool3	boolean
    //   267	54	18	bool4	boolean
    //   276	47	19	bool5	boolean
    //   285	40	20	bool6	boolean
    // Exception table:
    //   from	to	target	type
    //   332	352	397	finally
    //   352	394	397	finally
    //   292	332	401	finally
    //   2	51	405	finally
    //   51	61	405	finally
    //   70	148	405	finally
    //   148	292	405	finally
  }
  
  public void a(Qf paramQf)
  {
    try
    {
      a(paramQf, 5);
      return;
    }
    finally
    {
      paramQf = finally;
      throw paramQf;
    }
  }
  
  public void a(Wf<?> paramWf, a parama)
  {
    try
    {
      this.e.b();
      this.v = null;
      if (paramWf == null)
      {
        paramWf = new Qf;
        parama = new java/lang/StringBuilder;
        parama.<init>();
        parama.append("Expected to receive a Resource<R> with an object of ");
        parama.append(this.k);
        parama.append(" inside, but instead got null.");
        paramWf.<init>(parama.toString());
        a(paramWf);
        return;
      }
      Object localObject = paramWf.get();
      if ((localObject != null) && (this.k.isAssignableFrom(localObject.getClass())))
      {
        if (!j())
        {
          a(paramWf);
          this.x = jj.a.d;
          return;
        }
        a(paramWf, localObject, parama);
        return;
      }
      a(paramWf);
      Qf localQf = new Qf;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Expected to receive an object of ");
      localStringBuilder.append(this.k);
      localStringBuilder.append(" but instead got ");
      if (localObject != null) {
        parama = localObject.getClass();
      } else {
        parama = "";
      }
      localStringBuilder.append(parama);
      localStringBuilder.append("{");
      localStringBuilder.append(localObject);
      localStringBuilder.append("} inside Resource{");
      localStringBuilder.append(paramWf);
      localStringBuilder.append("}.");
      if (localObject != null) {
        paramWf = "";
      } else {
        paramWf = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
      }
      localStringBuilder.append(paramWf);
      localQf.<init>(localStringBuilder.toString());
      a(localQf);
      return;
    }
    finally {}
  }
  
  public boolean a(cj paramcj)
  {
    try
    {
      boolean bool1 = paramcj instanceof jj;
      boolean bool2 = false;
      if (bool1)
      {
        jj localjj = (jj)paramcj;
        bool1 = bool2;
        try
        {
          if (this.m == localjj.m)
          {
            bool1 = bool2;
            if (this.n == localjj.n)
            {
              bool1 = bool2;
              if (Pj.a(this.j, localjj.j))
              {
                bool1 = bool2;
                if (this.k.equals(localjj.k))
                {
                  bool1 = bool2;
                  if (this.l.equals(localjj.l))
                  {
                    bool1 = bool2;
                    if (this.o == localjj.o)
                    {
                      bool1 = bool2;
                      if (a(localjj)) {
                        bool1 = true;
                      }
                    }
                  }
                }
              }
            }
          }
          return bool1;
        }
        finally {}
      }
      return false;
    }
    finally {}
  }
  
  public void b()
  {
    try
    {
      g();
      this.e.b();
      this.w = Jj.a();
      if (this.j == null)
      {
        if (Pj.b(this.m, this.n))
        {
          this.B = this.m;
          this.C = this.n;
        }
        int i1;
        if (m() == null) {
          i1 = 5;
        } else {
          i1 = 3;
        }
        localObject1 = new Qf;
        ((Qf)localObject1).<init>("Received null model");
        a((Qf)localObject1, i1);
        return;
      }
      if (this.x != jj.a.b)
      {
        if (this.x == jj.a.d)
        {
          a(this.u, a.e);
          return;
        }
        this.x = jj.a.c;
        if (Pj.b(this.m, this.n)) {
          a(this.m, this.n);
        } else {
          this.p.b(this);
        }
        if (((this.x == jj.a.b) || (this.x == jj.a.c)) && (i())) {
          this.p.b(n());
        }
        if (b)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append("finished run method in ");
          ((StringBuilder)localObject1).append(Jj.a(this.w));
          a(((StringBuilder)localObject1).toString());
        }
        return;
      }
      Object localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Cannot restart a running request");
      throw ((Throwable)localObject1);
    }
    finally {}
  }
  
  public boolean c()
  {
    try
    {
      boolean bool = isComplete();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void clear()
  {
    try
    {
      g();
      this.e.b();
      jj.a locala1 = this.x;
      jj.a locala2 = jj.a.f;
      if (locala1 == locala2) {
        return;
      }
      k();
      if (this.u != null) {
        a(this.u);
      }
      if (h()) {
        this.p.c(n());
      }
      this.x = jj.a.f;
      return;
    }
    finally {}
  }
  
  public Wj d()
  {
    return this.e;
  }
  
  public boolean e()
  {
    try
    {
      jj.a locala1 = this.x;
      jj.a locala2 = jj.a.e;
      boolean bool;
      if (locala1 == locala2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean f()
  {
    try
    {
      jj.a locala1 = this.x;
      jj.a locala2 = jj.a.f;
      boolean bool;
      if (locala1 == locala2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isComplete()
  {
    try
    {
      jj.a locala1 = this.x;
      jj.a locala2 = jj.a.d;
      boolean bool;
      if (locala1 == locala2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isRunning()
  {
    try
    {
      if (this.x != jj.a.b)
      {
        jj.a locala1 = this.x;
        jj.a locala2 = jj.a.c;
        if (locala1 != locala2)
        {
          bool = false;
          break label36;
        }
      }
      boolean bool = true;
      label36:
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static enum a
  {
    private a() {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */