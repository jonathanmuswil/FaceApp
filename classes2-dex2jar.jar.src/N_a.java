import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class n_a
  implements qZa
{
  private final uZa a;
  
  public n_a(uZa paramuZa)
  {
    this.a = paramuZa;
  }
  
  private int a(BZa paramBZa, int paramInt)
  {
    paramBZa = paramBZa.b("Retry-After");
    if (paramBZa == null) {
      return paramInt;
    }
    if (paramBZa.matches("\\d+")) {
      return Integer.valueOf(paramBZa).intValue();
    }
    return Integer.MAX_VALUE;
  }
  
  private xZa a(BZa paramBZa, EZa paramEZa)
    throws IOException
  {
    if (paramBZa != null)
    {
      int i = paramBZa.c();
      String str = paramBZa.k().e();
      Proxy localProxy = null;
      if ((i != 307) && (i != 308)) {
        if (i != 401) {
          if (i != 503) {
            if (i != 407) {
              if (i == 408) {}
            }
          }
        }
      }
      switch (i)
      {
      default: 
        return null;
        if (!this.a.Q()) {
          return null;
        }
        paramEZa = paramBZa.k().a();
        if ((paramEZa != null) && (paramEZa.d())) {
          return null;
        }
        if ((paramBZa.i() != null) && (paramBZa.i().c() == 408)) {
          return null;
        }
        if (a(paramBZa, 0) > 0) {
          return null;
        }
        return paramBZa.k();
        if (paramEZa != null) {
          localProxy = paramEZa.b();
        } else {
          localProxy = this.a.t();
        }
        if (localProxy.type() == Proxy.Type.HTTP) {
          return this.a.u().a(paramEZa, paramBZa);
        }
        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        if ((paramBZa.i() != null) && (paramBZa.i().c() == 503)) {
          return null;
        }
        if (a(paramBZa, Integer.MAX_VALUE) == 0) {
          return paramBZa.k();
        }
        return null;
        return this.a.a().a(paramEZa, paramBZa);
        if ((!str.equals("GET")) && (!str.equals("HEAD"))) {
          return null;
        }
        break;
      }
      if (!this.a.k()) {
        return null;
      }
      paramEZa = paramBZa.b("Location");
      if (paramEZa == null) {
        return null;
      }
      pZa localpZa = paramBZa.k().g().e(paramEZa);
      if (localpZa == null) {
        return null;
      }
      if ((!localpZa.n().equals(paramBZa.k().g().n())) && (!this.a.m())) {
        return null;
      }
      xZa.a locala = paramBZa.k().f();
      if (j_a.b(str))
      {
        boolean bool = j_a.d(str);
        if (j_a.c(str))
        {
          locala.a("GET", null);
        }
        else
        {
          paramEZa = localProxy;
          if (bool) {
            paramEZa = paramBZa.k().a();
          }
          locala.a(str, paramEZa);
        }
        if (!bool)
        {
          locala.a("Transfer-Encoding");
          locala.a("Content-Length");
          locala.a("Content-Type");
        }
      }
      if (!LZa.a(paramBZa.k().g(), localpZa)) {
        locala.a("Authorization");
      }
      locala.a(localpZa);
      return locala.a();
    }
    throw new IllegalStateException();
  }
  
  private boolean a(IOException paramIOException, c_a paramc_a, boolean paramBoolean, xZa paramxZa)
  {
    if (!this.a.Q()) {
      return false;
    }
    if ((paramBoolean) && (a(paramIOException, paramxZa))) {
      return false;
    }
    if (!a(paramIOException, paramBoolean)) {
      return false;
    }
    return paramc_a.b();
  }
  
  private boolean a(IOException paramIOException, xZa paramxZa)
  {
    paramxZa = paramxZa.a();
    boolean bool;
    if (((paramxZa != null) && (paramxZa.d())) || ((paramIOException instanceof FileNotFoundException))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean a(IOException paramIOException, boolean paramBoolean)
  {
    boolean bool1 = paramIOException instanceof ProtocolException;
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if ((paramIOException instanceof InterruptedIOException))
    {
      bool1 = bool2;
      if ((paramIOException instanceof SocketTimeoutException))
      {
        bool1 = bool2;
        if (!paramBoolean) {
          bool1 = true;
        }
      }
      return bool1;
    }
    if (((paramIOException instanceof SSLHandshakeException)) && ((paramIOException.getCause() instanceof CertificateException))) {
      return false;
    }
    return !(paramIOException instanceof SSLPeerUnverifiedException);
  }
  
  /* Error */
  public BZa a(qZa.a parama)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 222 1 0
    //   6: astore_2
    //   7: aload_1
    //   8: checkcast 224	k_a
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual 227	k_a:f	()Lc_a;
    //   16: astore 4
    //   18: aconst_null
    //   19: astore 5
    //   21: iconst_0
    //   22: istore 6
    //   24: aload 4
    //   26: aload_2
    //   27: invokevirtual 230	c_a:a	(LxZa;)V
    //   30: aload 4
    //   32: invokevirtual 232	c_a:f	()Z
    //   35: ifne +289 -> 324
    //   38: aload_3
    //   39: aload_2
    //   40: aload 4
    //   42: aconst_null
    //   43: invokevirtual 235	k_a:a	(LxZa;Lc_a;LVZa;)LBZa;
    //   46: astore 7
    //   48: aload 7
    //   50: astore_1
    //   51: aload 5
    //   53: ifnull +38 -> 91
    //   56: aload 7
    //   58: invokevirtual 239	BZa:h	()LBZa$a;
    //   61: astore_1
    //   62: aload 5
    //   64: invokevirtual 239	BZa:h	()LBZa$a;
    //   67: astore 5
    //   69: aload 5
    //   71: aconst_null
    //   72: invokevirtual 244	BZa$a:a	(LDZa;)LBZa$a;
    //   75: pop
    //   76: aload_1
    //   77: aload 5
    //   79: invokevirtual 246	BZa$a:a	()LBZa;
    //   82: invokevirtual 249	BZa$a:c	(LBZa;)LBZa$a;
    //   85: pop
    //   86: aload_1
    //   87: invokevirtual 246	BZa$a:a	()LBZa;
    //   90: astore_1
    //   91: getstatic 254	JZa:a	LJZa;
    //   94: aload_1
    //   95: invokevirtual 257	JZa:a	(LBZa;)LVZa;
    //   98: astore 7
    //   100: aload 7
    //   102: ifnull +16 -> 118
    //   105: aload 7
    //   107: invokevirtual 262	VZa:b	()LXZa;
    //   110: invokevirtual 267	XZa:f	()LEZa;
    //   113: astore 5
    //   115: goto +6 -> 121
    //   118: aconst_null
    //   119: astore 5
    //   121: aload_0
    //   122: aload_1
    //   123: aload 5
    //   125: invokespecial 269	n_a:a	(LBZa;LEZa;)LxZa;
    //   128: astore_2
    //   129: aload_2
    //   130: ifnonnull +23 -> 153
    //   133: aload 7
    //   135: ifnull +16 -> 151
    //   138: aload 7
    //   140: invokevirtual 270	VZa:f	()Z
    //   143: ifeq +8 -> 151
    //   146: aload 4
    //   148: invokevirtual 272	c_a:h	()V
    //   151: aload_1
    //   152: areturn
    //   153: aload_2
    //   154: invokevirtual 69	xZa:a	()LAZa;
    //   157: astore 5
    //   159: aload 5
    //   161: ifnull +13 -> 174
    //   164: aload 5
    //   166: invokevirtual 74	AZa:d	()Z
    //   169: ifeq +5 -> 174
    //   172: aload_1
    //   173: areturn
    //   174: aload_1
    //   175: invokevirtual 275	BZa:a	()LDZa;
    //   178: invokestatic 278	LZa:a	(Ljava/io/Closeable;)V
    //   181: aload 4
    //   183: invokevirtual 280	c_a:e	()Z
    //   186: ifeq +8 -> 194
    //   189: aload 7
    //   191: invokevirtual 282	VZa:c	()V
    //   194: iinc 6 1
    //   197: iload 6
    //   199: bipush 20
    //   201: if_icmpgt +9 -> 210
    //   204: aload_1
    //   205: astore 5
    //   207: goto -183 -> 24
    //   210: new 284	java/lang/StringBuilder
    //   213: dup
    //   214: invokespecial 285	java/lang/StringBuilder:<init>	()V
    //   217: astore_1
    //   218: aload_1
    //   219: ldc_w 287
    //   222: invokevirtual 291	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   225: pop
    //   226: aload_1
    //   227: iload 6
    //   229: invokevirtual 294	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: new 111	java/net/ProtocolException
    //   236: dup
    //   237: aload_1
    //   238: invokevirtual 297	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokespecial 116	java/net/ProtocolException:<init>	(Ljava/lang/String;)V
    //   244: athrow
    //   245: astore_1
    //   246: goto +71 -> 317
    //   249: astore_1
    //   250: aload_1
    //   251: instanceof 299
    //   254: ifne +9 -> 263
    //   257: iconst_1
    //   258: istore 8
    //   260: goto +6 -> 266
    //   263: iconst_0
    //   264: istore 8
    //   266: aload_0
    //   267: aload_1
    //   268: aload 4
    //   270: iload 8
    //   272: aload_2
    //   273: invokespecial 301	n_a:a	(Ljava/io/IOException;Lc_a;ZLxZa;)Z
    //   276: ifeq +6 -> 282
    //   279: goto +25 -> 304
    //   282: aload_1
    //   283: athrow
    //   284: astore_1
    //   285: aload_0
    //   286: aload_1
    //   287: invokevirtual 304	_Za:b	()Ljava/io/IOException;
    //   290: aload 4
    //   292: iconst_0
    //   293: aload_2
    //   294: invokespecial 301	n_a:a	(Ljava/io/IOException;Lc_a;ZLxZa;)Z
    //   297: istore 8
    //   299: iload 8
    //   301: ifeq +11 -> 312
    //   304: aload 4
    //   306: invokevirtual 306	c_a:d	()V
    //   309: goto -285 -> 24
    //   312: aload_1
    //   313: invokevirtual 308	_Za:a	()Ljava/io/IOException;
    //   316: athrow
    //   317: aload 4
    //   319: invokevirtual 306	c_a:d	()V
    //   322: aload_1
    //   323: athrow
    //   324: new 47	java/io/IOException
    //   327: dup
    //   328: ldc_w 310
    //   331: invokespecial 311	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   334: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	335	0	this	n_a
    //   0	335	1	parama	qZa.a
    //   6	288	2	localxZa	xZa
    //   11	28	3	localk_a	k_a
    //   16	302	4	localc_a	c_a
    //   19	187	5	localObject1	Object
    //   22	206	6	i	int
    //   46	144	7	localObject2	Object
    //   258	42	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   38	48	245	finally
    //   250	257	245	finally
    //   266	279	245	finally
    //   282	284	245	finally
    //   285	299	245	finally
    //   312	317	245	finally
    //   38	48	249	java/io/IOException
    //   38	48	284	_Za
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/n_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */