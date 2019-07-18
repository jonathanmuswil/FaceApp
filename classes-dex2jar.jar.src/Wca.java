import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class wca
{
  private static final String[] a = new String[0];
  private static wca.b b = wca.b.a;
  private HttpURLConnection c = null;
  public final URL d;
  private final String e;
  private wca.e f;
  private boolean g;
  private boolean h = true;
  private boolean i = false;
  private int j = 8192;
  private String k;
  private int l;
  
  public wca(CharSequence paramCharSequence, String paramString)
    throws wca.c
  {
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramCharSequence.toString());
      this.d = localURL;
      this.e = paramString;
      return;
    }
    catch (MalformedURLException paramCharSequence)
    {
      throw new wca.c(paramCharSequence);
    }
  }
  
  public static String a(CharSequence paramCharSequence, Map<?, ?> paramMap)
  {
    Object localObject = paramCharSequence.toString();
    paramCharSequence = (CharSequence)localObject;
    if (paramMap != null) {
      if (paramMap.isEmpty())
      {
        paramCharSequence = (CharSequence)localObject;
      }
      else
      {
        paramCharSequence = new StringBuilder((String)localObject);
        b((String)localObject, paramCharSequence);
        a((String)localObject, paramCharSequence);
        paramMap = paramMap.entrySet().iterator();
        localObject = (Map.Entry)paramMap.next();
        paramCharSequence.append(((Map.Entry)localObject).getKey().toString());
        paramCharSequence.append('=');
        localObject = ((Map.Entry)localObject).getValue();
        if (localObject != null) {
          paramCharSequence.append(localObject);
        }
        while (paramMap.hasNext())
        {
          paramCharSequence.append('&');
          localObject = (Map.Entry)paramMap.next();
          paramCharSequence.append(((Map.Entry)localObject).getKey().toString());
          paramCharSequence.append('=');
          localObject = ((Map.Entry)localObject).getValue();
          if (localObject != null) {
            paramCharSequence.append(localObject);
          }
        }
        paramCharSequence = paramCharSequence.toString();
      }
    }
    return paramCharSequence;
  }
  
  private static StringBuilder a(String paramString, StringBuilder paramStringBuilder)
  {
    int m = paramString.indexOf('?');
    int n = paramStringBuilder.length() - 1;
    if (m == -1) {
      paramStringBuilder.append('?');
    } else if ((m < n) && (paramString.charAt(n) != '&')) {
      paramStringBuilder.append('&');
    }
    return paramStringBuilder;
  }
  
  public static wca a(CharSequence paramCharSequence)
    throws wca.c
  {
    return new wca(paramCharSequence, "DELETE");
  }
  
  public static wca a(CharSequence paramCharSequence, Map<?, ?> paramMap, boolean paramBoolean)
  {
    paramMap = a(paramCharSequence, paramMap);
    paramCharSequence = paramMap;
    if (paramBoolean) {
      paramCharSequence = b(paramMap);
    }
    return c(paramCharSequence);
  }
  
  /* Error */
  public static String b(CharSequence paramCharSequence)
    throws wca.c
  {
    // Byte code:
    //   0: new 65	java/net/URL
    //   3: dup
    //   4: aload_0
    //   5: invokeinterface 71 1 0
    //   10: invokespecial 74	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 175	java/net/URL:getHost	()Ljava/lang/String;
    //   18: astore_2
    //   19: aload_1
    //   20: invokevirtual 178	java/net/URL:getPort	()I
    //   23: istore_3
    //   24: aload_2
    //   25: astore_0
    //   26: iload_3
    //   27: iconst_m1
    //   28: if_icmpeq +38 -> 66
    //   31: new 92	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 179	java/lang/StringBuilder:<init>	()V
    //   38: astore_0
    //   39: aload_0
    //   40: aload_2
    //   41: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_0
    //   46: bipush 58
    //   48: invokevirtual 127	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload_0
    //   53: iload_3
    //   54: invokestatic 184	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   57: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_0
    //   62: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: astore_0
    //   66: new 186	java/net/URI
    //   69: astore_2
    //   70: aload_2
    //   71: aload_1
    //   72: invokevirtual 189	java/net/URL:getProtocol	()Ljava/lang/String;
    //   75: aload_0
    //   76: aload_1
    //   77: invokevirtual 192	java/net/URL:getPath	()Ljava/lang/String;
    //   80: aload_1
    //   81: invokevirtual 195	java/net/URL:getQuery	()Ljava/lang/String;
    //   84: aload_1
    //   85: invokevirtual 198	java/net/URL:getRef	()Ljava/lang/String;
    //   88: invokespecial 201	java/net/URI:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_2
    //   92: invokevirtual 204	java/net/URI:toASCIIString	()Ljava/lang/String;
    //   95: astore_2
    //   96: aload_2
    //   97: bipush 63
    //   99: invokevirtual 146	java/lang/String:indexOf	(I)I
    //   102: istore_3
    //   103: aload_2
    //   104: astore_0
    //   105: iload_3
    //   106: ifle +64 -> 170
    //   109: iinc 3 1
    //   112: aload_2
    //   113: astore_0
    //   114: iload_3
    //   115: aload_2
    //   116: invokevirtual 205	java/lang/String:length	()I
    //   119: if_icmpge +51 -> 170
    //   122: new 92	java/lang/StringBuilder
    //   125: astore_0
    //   126: aload_0
    //   127: invokespecial 179	java/lang/StringBuilder:<init>	()V
    //   130: aload_0
    //   131: aload_2
    //   132: iconst_0
    //   133: iload_3
    //   134: invokevirtual 209	java/lang/String:substring	(II)Ljava/lang/String;
    //   137: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_0
    //   142: aload_2
    //   143: iload_3
    //   144: invokevirtual 211	java/lang/String:substring	(I)Ljava/lang/String;
    //   147: ldc -43
    //   149: ldc -41
    //   151: invokevirtual 219	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   154: ldc -35
    //   156: ldc -33
    //   158: invokevirtual 219	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   161: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload_0
    //   166: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: astore_0
    //   170: aload_0
    //   171: areturn
    //   172: astore_0
    //   173: new 170	java/io/IOException
    //   176: dup
    //   177: ldc -31
    //   179: invokespecial 226	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   182: astore_2
    //   183: aload_2
    //   184: aload_0
    //   185: invokevirtual 230	java/io/IOException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   188: pop
    //   189: new 14	wca$c
    //   192: dup
    //   193: aload_2
    //   194: invokespecial 81	wca$c:<init>	(Ljava/io/IOException;)V
    //   197: athrow
    //   198: astore_0
    //   199: new 14	wca$c
    //   202: dup
    //   203: aload_0
    //   204: invokespecial 81	wca$c:<init>	(Ljava/io/IOException;)V
    //   207: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	208	0	paramCharSequence	CharSequence
    //   13	72	1	localURL	URL
    //   18	176	2	localObject	Object
    //   23	121	3	m	int
    // Exception table:
    //   from	to	target	type
    //   66	103	172	java/net/URISyntaxException
    //   114	170	172	java/net/URISyntaxException
    //   0	14	198	java/io/IOException
  }
  
  private static StringBuilder b(String paramString, StringBuilder paramStringBuilder)
  {
    if (paramString.indexOf(':') + 2 == paramString.lastIndexOf('/')) {
      paramStringBuilder.append('/');
    }
    return paramStringBuilder;
  }
  
  public static wca b(CharSequence paramCharSequence, Map<?, ?> paramMap, boolean paramBoolean)
  {
    paramMap = a(paramCharSequence, paramMap);
    paramCharSequence = paramMap;
    if (paramBoolean) {
      paramCharSequence = b(paramMap);
    }
    return d(paramCharSequence);
  }
  
  public static wca c(CharSequence paramCharSequence)
    throws wca.c
  {
    return new wca(paramCharSequence, "GET");
  }
  
  public static wca d(CharSequence paramCharSequence)
    throws wca.c
  {
    return new wca(paramCharSequence, "POST");
  }
  
  public static wca e(CharSequence paramCharSequence)
    throws wca.c
  {
    return new wca(paramCharSequence, "PUT");
  }
  
  private static String f(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {
      return paramString;
    }
    return "UTF-8";
  }
  
  private HttpURLConnection p()
  {
    try
    {
      HttpURLConnection localHttpURLConnection;
      if (this.k != null) {
        localHttpURLConnection = b.a(this.d, q());
      } else {
        localHttpURLConnection = b.a(this.d);
      }
      localHttpURLConnection.setRequestMethod(this.e);
      return localHttpURLConnection;
    }
    catch (IOException localIOException)
    {
      throw new wca.c(localIOException);
    }
  }
  
  private Proxy q()
  {
    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.k, this.l));
  }
  
  public int a(String paramString, int paramInt)
    throws wca.c
  {
    f();
    return j().getHeaderFieldInt(paramString, paramInt);
  }
  
  public String a()
    throws wca.c
  {
    return b(d());
  }
  
  public wca a(int paramInt)
  {
    j().setConnectTimeout(paramInt);
    return this;
  }
  
  protected wca a(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    return (wca)new vca(this, paramInputStream, this.h, paramInputStream, paramOutputStream).call();
  }
  
  public wca a(String paramString, Number paramNumber)
    throws wca.c
  {
    a(paramString, null, paramNumber);
    return this;
  }
  
  public wca a(String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString1);
      localStringBuilder.append("; charset=");
      localStringBuilder.append(paramString2);
      c("Content-Type", localStringBuilder.toString());
      return this;
    }
    c("Content-Type", paramString1);
    return this;
  }
  
  public wca a(String paramString1, String paramString2, Number paramNumber)
    throws wca.c
  {
    if (paramNumber != null) {
      paramNumber = paramNumber.toString();
    } else {
      paramNumber = null;
    }
    a(paramString1, paramString2, paramNumber);
    return this;
  }
  
  public wca a(String paramString1, String paramString2, String paramString3)
    throws wca.c
  {
    a(paramString1, paramString2, null, paramString3);
    return this;
  }
  
  /* Error */
  public wca a(String paramString1, String paramString2, String paramString3, java.io.File paramFile)
    throws wca.c
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aload 6
    //   8: astore 7
    //   10: new 325	java/io/BufferedInputStream
    //   13: astore 8
    //   15: aload 6
    //   17: astore 7
    //   19: new 327	java/io/FileInputStream
    //   22: astore 9
    //   24: aload 6
    //   26: astore 7
    //   28: aload 9
    //   30: aload 4
    //   32: invokespecial 330	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: aload 6
    //   37: astore 7
    //   39: aload 8
    //   41: aload 9
    //   43: invokespecial 333	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   46: aload_0
    //   47: aload_1
    //   48: aload_2
    //   49: aload_3
    //   50: aload 8
    //   52: invokevirtual 336	wca:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Lwca;
    //   55: pop
    //   56: aload 8
    //   58: invokevirtual 339	java/io/BufferedInputStream:close	()V
    //   61: aload_0
    //   62: areturn
    //   63: astore_1
    //   64: aload 8
    //   66: astore 7
    //   68: goto +38 -> 106
    //   71: astore_2
    //   72: aload 8
    //   74: astore_1
    //   75: goto +11 -> 86
    //   78: astore_1
    //   79: goto +27 -> 106
    //   82: astore_2
    //   83: aload 5
    //   85: astore_1
    //   86: aload_1
    //   87: astore 7
    //   89: new 14	wca$c
    //   92: astore_3
    //   93: aload_1
    //   94: astore 7
    //   96: aload_3
    //   97: aload_2
    //   98: invokespecial 81	wca$c:<init>	(Ljava/io/IOException;)V
    //   101: aload_1
    //   102: astore 7
    //   104: aload_3
    //   105: athrow
    //   106: aload 7
    //   108: ifnull +8 -> 116
    //   111: aload 7
    //   113: invokevirtual 339	java/io/BufferedInputStream:close	()V
    //   116: aload_1
    //   117: athrow
    //   118: astore_1
    //   119: goto -58 -> 61
    //   122: astore_2
    //   123: goto -7 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	wca
    //   0	126	1	paramString1	String
    //   0	126	2	paramString2	String
    //   0	126	3	paramString3	String
    //   0	126	4	paramFile	java.io.File
    //   1	83	5	localObject1	Object
    //   4	32	6	localObject2	Object
    //   8	104	7	localObject3	Object
    //   13	60	8	localBufferedInputStream	BufferedInputStream
    //   22	20	9	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   46	56	63	finally
    //   46	56	71	java/io/IOException
    //   10	15	78	finally
    //   19	24	78	finally
    //   28	35	78	finally
    //   39	46	78	finally
    //   89	93	78	finally
    //   96	101	78	finally
    //   104	106	78	finally
    //   10	15	82	java/io/IOException
    //   19	24	82	java/io/IOException
    //   28	35	82	java/io/IOException
    //   39	46	82	java/io/IOException
    //   56	61	118	java/io/IOException
    //   111	116	122	java/io/IOException
  }
  
  public wca a(String paramString1, String paramString2, String paramString3, InputStream paramInputStream)
    throws wca.c
  {
    try
    {
      m();
      b(paramString1, paramString2, paramString3);
      a(paramInputStream, this.f);
      return this;
    }
    catch (IOException paramString1)
    {
      throw new wca.c(paramString1);
    }
  }
  
  public wca a(String paramString1, String paramString2, String paramString3, String paramString4)
    throws wca.c
  {
    try
    {
      m();
      b(paramString1, paramString2, paramString3);
      this.f.b(paramString4);
      return this;
    }
    catch (IOException paramString1)
    {
      throw new wca.c(paramString1);
    }
  }
  
  public wca a(Map.Entry<String, String> paramEntry)
  {
    c((String)paramEntry.getKey(), (String)paramEntry.getValue());
    return this;
  }
  
  public wca a(boolean paramBoolean)
  {
    j().setUseCaches(paramBoolean);
    return this;
  }
  
  public BufferedInputStream b()
    throws wca.c
  {
    return new BufferedInputStream(n(), this.j);
  }
  
  public String b(String paramString)
    throws wca.c
  {
    ByteArrayOutputStream localByteArrayOutputStream = c();
    try
    {
      a(b(), localByteArrayOutputStream);
      paramString = localByteArrayOutputStream.toString(f(paramString));
      return paramString;
    }
    catch (IOException paramString)
    {
      throw new wca.c(paramString);
    }
  }
  
  protected String b(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString1.length() != 0))
    {
      int m = paramString1.length();
      int n = paramString1.indexOf(';') + 1;
      if ((n != 0) && (n != m))
      {
        int i1 = paramString1.indexOf(';', n);
        int i2 = n;
        int i3 = i1;
        if (i1 == -1) {}
        for (i2 = n;; i2 = n)
        {
          i3 = m;
          do
          {
            if (i2 >= i3) {
              break;
            }
            n = paramString1.indexOf('=', i2);
            if ((n != -1) && (n < i3) && (paramString2.equals(paramString1.substring(i2, n).trim())))
            {
              String str = paramString1.substring(n + 1, i3).trim();
              i2 = str.length();
              if (i2 != 0)
              {
                if ((i2 > 2) && ('"' == str.charAt(0)))
                {
                  i3 = i2 - 1;
                  if ('"' == str.charAt(i3)) {
                    return str.substring(1, i3);
                  }
                }
                return str;
              }
            }
            n = i3 + 1;
            i1 = paramString1.indexOf(';', n);
            i2 = n;
            i3 = i1;
          } while (i1 != -1);
        }
      }
    }
    return null;
  }
  
  protected wca b(String paramString1, String paramString2, String paramString3)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("form-data; name=\"");
    localStringBuilder.append(paramString1);
    if (paramString2 != null)
    {
      localStringBuilder.append("\"; filename=\"");
      localStringBuilder.append(paramString2);
    }
    localStringBuilder.append('"');
    f("Content-Disposition", localStringBuilder.toString());
    if (paramString3 != null) {
      f("Content-Type", paramString3);
    }
    f("\r\n");
    return this;
  }
  
  protected ByteArrayOutputStream c()
  {
    int m = i();
    if (m > 0) {
      return new ByteArrayOutputStream(m);
    }
    return new ByteArrayOutputStream();
  }
  
  public wca c(String paramString)
  {
    a(paramString, null);
    return this;
  }
  
  public wca c(String paramString1, String paramString2)
  {
    j().setRequestProperty(paramString1, paramString2);
    return this;
  }
  
  public String d()
  {
    return d("Content-Type", "charset");
  }
  
  public String d(String paramString)
    throws wca.c
  {
    f();
    return j().getHeaderField(paramString);
  }
  
  public String d(String paramString1, String paramString2)
  {
    return b(d(paramString1), paramString2);
  }
  
  public int e(String paramString)
    throws wca.c
  {
    return a(paramString, -1);
  }
  
  protected wca e()
    throws IOException
  {
    wca.e locale = this.f;
    if (locale == null) {
      return this;
    }
    if (this.g) {
      locale.b("\r\n--00content0boundary00--\r\n");
    }
    if (this.h) {}
    try
    {
      this.f.close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    this.f.close();
    this.f = null;
    return this;
  }
  
  public wca e(String paramString1, String paramString2)
  {
    a(paramString1, null, paramString2);
    return this;
  }
  
  protected wca f()
    throws wca.c
  {
    try
    {
      e();
      return this;
    }
    catch (IOException localIOException)
    {
      throw new wca.c(localIOException);
    }
  }
  
  public wca f(CharSequence paramCharSequence)
    throws wca.c
  {
    try
    {
      l();
      this.f.b(paramCharSequence.toString());
      return this;
    }
    catch (IOException paramCharSequence)
    {
      throw new wca.c(paramCharSequence);
    }
  }
  
  public wca f(String paramString1, String paramString2)
    throws wca.c
  {
    f(paramString1);
    f(": ");
    f(paramString2);
    f("\r\n");
    return this;
  }
  
  public int g()
    throws wca.c
  {
    try
    {
      e();
      int m = j().getResponseCode();
      return m;
    }
    catch (IOException localIOException)
    {
      throw new wca.c(localIOException);
    }
  }
  
  public String h()
  {
    return d("Content-Encoding");
  }
  
  public int i()
  {
    return e("Content-Length");
  }
  
  public HttpURLConnection j()
  {
    if (this.c == null) {
      this.c = p();
    }
    return this.c;
  }
  
  public String k()
  {
    return j().getRequestMethod();
  }
  
  protected wca l()
    throws IOException
  {
    if (this.f != null) {
      return this;
    }
    j().setDoOutput(true);
    String str = b(j().getRequestProperty("Content-Type"), "charset");
    this.f = new wca.e(j().getOutputStream(), str, this.j);
    return this;
  }
  
  protected wca m()
    throws IOException
  {
    if (!this.g)
    {
      this.g = true;
      c("multipart/form-data; boundary=00content0boundary00");
      l();
      this.f.b("--00content0boundary00\r\n");
    }
    else
    {
      this.f.b("\r\n--00content0boundary00\r\n");
    }
    return this;
  }
  
  public InputStream n()
    throws wca.c
  {
    if (g() < 400)
    {
      try
      {
        InputStream localInputStream1 = j().getInputStream();
      }
      catch (IOException localIOException1)
      {
        throw new wca.c(localIOException1);
      }
    }
    else
    {
      InputStream localInputStream2 = j().getErrorStream();
      Object localObject = localInputStream2;
      if (localInputStream2 == null) {
        try
        {
          localObject = j().getInputStream();
        }
        catch (IOException localIOException2)
        {
          throw new wca.c(localIOException2);
        }
      }
    }
    if ((this.i) && ("gzip".equals(h()))) {
      try
      {
        GZIPInputStream localGZIPInputStream = new GZIPInputStream(localIOException2);
        return localGZIPInputStream;
      }
      catch (IOException localIOException3)
      {
        throw new wca.c(localIOException3);
      }
    }
    return localIOException3;
  }
  
  public URL o()
  {
    return j().getURL();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(k());
    localStringBuilder.append(' ');
    localStringBuilder.append(o());
    return localStringBuilder.toString();
  }
  
  protected static abstract class a<V>
    extends wca.d<V>
  {
    private final Closeable a;
    private final boolean b;
    
    protected a(Closeable paramCloseable, boolean paramBoolean)
    {
      this.a = paramCloseable;
      this.b = paramBoolean;
    }
    
    protected void a()
      throws IOException
    {
      Closeable localCloseable = this.a;
      if ((localCloseable instanceof Flushable)) {
        ((Flushable)localCloseable).flush();
      }
      if (this.b) {}
      try
      {
        this.a.close();
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
      this.a.close();
    }
  }
  
  public static abstract interface b
  {
    public static final b a = new xca();
    
    public abstract HttpURLConnection a(URL paramURL)
      throws IOException;
    
    public abstract HttpURLConnection a(URL paramURL, Proxy paramProxy)
      throws IOException;
  }
  
  public static class c
    extends RuntimeException
  {
    protected c(IOException paramIOException)
    {
      super();
    }
    
    public IOException getCause()
    {
      return (IOException)super.getCause();
    }
  }
  
  protected static abstract class d<V>
    implements Callable<V>
  {
    protected abstract void a()
      throws IOException;
    
    protected abstract V b()
      throws wca.c, IOException;
    
    /* Error */
    public V call()
      throws wca.c
    {
      // Byte code:
      //   0: iconst_1
      //   1: istore_1
      //   2: aload_0
      //   3: invokevirtual 25	wca$d:b	()Ljava/lang/Object;
      //   6: astore_2
      //   7: aload_0
      //   8: invokevirtual 27	wca$d:a	()V
      //   11: aload_2
      //   12: areturn
      //   13: astore_2
      //   14: new 22	wca$c
      //   17: dup
      //   18: aload_2
      //   19: invokespecial 30	wca$c:<init>	(Ljava/io/IOException;)V
      //   22: athrow
      //   23: astore_2
      //   24: iconst_0
      //   25: istore_1
      //   26: goto +19 -> 45
      //   29: astore_3
      //   30: new 22	wca$c
      //   33: astore_2
      //   34: aload_2
      //   35: aload_3
      //   36: invokespecial 30	wca$c:<init>	(Ljava/io/IOException;)V
      //   39: aload_2
      //   40: athrow
      //   41: astore_2
      //   42: aload_2
      //   43: athrow
      //   44: astore_2
      //   45: aload_0
      //   46: invokevirtual 27	wca$d:a	()V
      //   49: goto +17 -> 66
      //   52: astore_3
      //   53: iload_1
      //   54: ifne +12 -> 66
      //   57: new 22	wca$c
      //   60: dup
      //   61: aload_3
      //   62: invokespecial 30	wca$c:<init>	(Ljava/io/IOException;)V
      //   65: athrow
      //   66: aload_2
      //   67: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	68	0	this	d
      //   1	53	1	i	int
      //   6	6	2	localObject1	Object
      //   13	6	2	localIOException1	IOException
      //   23	1	2	localObject2	Object
      //   33	7	2	localc1	wca.c
      //   41	2	2	localc2	wca.c
      //   44	23	2	localObject3	Object
      //   29	7	3	localIOException2	IOException
      //   52	10	3	localIOException3	IOException
      // Exception table:
      //   from	to	target	type
      //   7	11	13	java/io/IOException
      //   2	7	23	finally
      //   2	7	29	java/io/IOException
      //   2	7	41	wca$c
      //   30	41	44	finally
      //   42	44	44	finally
      //   45	49	52	java/io/IOException
    }
  }
  
  public static class e
    extends BufferedOutputStream
  {
    private final CharsetEncoder a;
    
    public e(OutputStream paramOutputStream, String paramString, int paramInt)
    {
      super(paramInt);
      this.a = Charset.forName(wca.a(paramString)).newEncoder();
    }
    
    public e b(String paramString)
      throws IOException
    {
      paramString = this.a.encode(CharBuffer.wrap(paramString));
      super.write(paramString.array(), 0, paramString.limit());
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */