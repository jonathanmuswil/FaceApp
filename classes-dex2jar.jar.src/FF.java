import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ff
  implements Ze<InputStream>
{
  static final ff.b a = new ff.a();
  private final Ug b;
  private final int c;
  private final ff.b d;
  private HttpURLConnection e;
  private InputStream f;
  private volatile boolean g;
  
  public ff(Ug paramUg, int paramInt)
  {
    this(paramUg, paramInt, a);
  }
  
  ff(Ug paramUg, int paramInt, ff.b paramb)
  {
    this.b = paramUg;
    this.c = paramInt;
    this.d = paramb;
  }
  
  private InputStream a(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    if (TextUtils.isEmpty(paramHttpURLConnection.getContentEncoding()))
    {
      int i = paramHttpURLConnection.getContentLength();
      this.f = Ej.a(paramHttpURLConnection.getInputStream(), i);
    }
    else
    {
      if (Log.isLoggable("HttpUrlFetcher", 3))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Got non empty content encoding: ");
        localStringBuilder.append(paramHttpURLConnection.getContentEncoding());
        Log.d("HttpUrlFetcher", localStringBuilder.toString());
      }
      this.f = paramHttpURLConnection.getInputStream();
    }
    return this.f;
  }
  
  private InputStream a(URL paramURL1, int paramInt, URL paramURL2, Map<String, String> paramMap)
    throws IOException
  {
    if ((paramInt >= 5) || (paramURL2 != null)) {}
    try
    {
      if (paramURL1.toURI().equals(paramURL2.toURI()))
      {
        paramURL2 = new com/bumptech/glide/load/e;
        paramURL2.<init>("In re-direct loop");
        throw paramURL2;
      }
    }
    catch (URISyntaxException paramURL2)
    {
      Iterator localIterator;
      int i;
      for (;;) {}
    }
    this.e = this.d.a(paramURL1);
    localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramURL2 = (Map.Entry)localIterator.next();
      this.e.addRequestProperty((String)paramURL2.getKey(), (String)paramURL2.getValue());
    }
    this.e.setConnectTimeout(this.c);
    this.e.setReadTimeout(this.c);
    this.e.setUseCaches(false);
    this.e.setDoInput(true);
    this.e.setInstanceFollowRedirects(false);
    this.e.connect();
    this.f = this.e.getInputStream();
    if (this.g) {
      return null;
    }
    i = this.e.getResponseCode();
    if (a(i)) {
      return a(this.e);
    }
    if (b(i))
    {
      paramURL2 = this.e.getHeaderField("Location");
      if (!TextUtils.isEmpty(paramURL2))
      {
        paramURL2 = new URL(paramURL1, paramURL2);
        b();
        return a(paramURL2, paramInt + 1, paramURL1, paramMap);
      }
      throw new e("Received empty or null redirect url");
    }
    if (i == -1) {
      throw new e(i);
    }
    throw new e(this.e.getResponseMessage(), i);
    throw new e("Too many (> 5) redirects!");
  }
  
  private static boolean a(int paramInt)
  {
    boolean bool;
    if (paramInt / 100 == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean b(int paramInt)
  {
    boolean bool;
    if (paramInt / 100 == 3) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Class<InputStream> a()
  {
    return InputStream.class;
  }
  
  /* Error */
  public void a(Fe paramFe, Ze.a<? super InputStream> parama)
  {
    // Byte code:
    //   0: invokestatic 229	Jj:a	()J
    //   3: lstore_3
    //   4: aload_2
    //   5: aload_0
    //   6: aload_0
    //   7: getfield 39	ff:b	LUg;
    //   10: invokevirtual 234	Ug:c	()Ljava/net/URL;
    //   13: iconst_0
    //   14: aconst_null
    //   15: aload_0
    //   16: getfield 39	ff:b	LUg;
    //   19: invokevirtual 237	Ug:b	()Ljava/util/Map;
    //   22: invokespecial 205	ff:a	(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
    //   25: invokeinterface 242 2 0
    //   30: ldc 75
    //   32: iconst_2
    //   33: invokestatic 81	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   36: ifeq +87 -> 123
    //   39: new 83	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   46: astore_1
    //   47: goto +50 -> 97
    //   50: astore_1
    //   51: goto +73 -> 124
    //   54: astore_1
    //   55: ldc 75
    //   57: iconst_3
    //   58: invokestatic 81	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   61: ifeq +12 -> 73
    //   64: ldc 75
    //   66: ldc -12
    //   68: aload_1
    //   69: invokestatic 247	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   72: pop
    //   73: aload_2
    //   74: aload_1
    //   75: invokeinterface 250 2 0
    //   80: ldc 75
    //   82: iconst_2
    //   83: invokestatic 81	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   86: ifeq +37 -> 123
    //   89: new 83	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   96: astore_1
    //   97: aload_1
    //   98: ldc -4
    //   100: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_1
    //   105: lload_3
    //   106: invokestatic 255	Jj:a	(J)D
    //   109: invokevirtual 258	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   112: pop
    //   113: ldc 75
    //   115: aload_1
    //   116: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: invokestatic 261	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   122: pop
    //   123: return
    //   124: ldc 75
    //   126: iconst_2
    //   127: invokestatic 81	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   130: ifeq +37 -> 167
    //   133: new 83	java/lang/StringBuilder
    //   136: dup
    //   137: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   140: astore_2
    //   141: aload_2
    //   142: ldc -4
    //   144: invokevirtual 90	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload_2
    //   149: lload_3
    //   150: invokestatic 255	Jj:a	(J)D
    //   153: invokevirtual 258	java/lang/StringBuilder:append	(D)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: ldc 75
    //   159: aload_2
    //   160: invokevirtual 93	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 261	android/util/Log:v	(Ljava/lang/String;Ljava/lang/String;)I
    //   166: pop
    //   167: aload_1
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	ff
    //   0	169	1	paramFe	Fe
    //   0	169	2	parama	Ze.a<? super InputStream>
    //   3	147	3	l	long
    // Exception table:
    //   from	to	target	type
    //   4	30	50	finally
    //   55	73	50	finally
    //   73	80	50	finally
    //   4	30	54	java/io/IOException
  }
  
  public void b()
  {
    InputStream localInputStream = this.f;
    if (localInputStream != null) {
      try
      {
        localInputStream.close();
      }
      catch (IOException localIOException) {}
    }
    HttpURLConnection localHttpURLConnection = this.e;
    if (localHttpURLConnection != null) {
      localHttpURLConnection.disconnect();
    }
    this.e = null;
  }
  
  public a c()
  {
    return a.b;
  }
  
  public void cancel()
  {
    this.g = true;
  }
  
  private static class a
    implements ff.b
  {
    public HttpURLConnection a(URL paramURL)
      throws IOException
    {
      return (HttpURLConnection)FirebasePerfUrlConnection.instrument(paramURL.openConnection());
    }
  }
  
  static abstract interface b
  {
    public abstract HttpURLConnection a(URL paramURL)
      throws IOException;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */