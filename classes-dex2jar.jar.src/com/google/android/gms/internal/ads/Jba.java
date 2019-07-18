package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class jba
  implements dba
{
  private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private static final AtomicReference<byte[]> b = new AtomicReference();
  private final boolean c;
  private final int d;
  private final int e;
  private final String f;
  private final Eba<String> g;
  private final mba h;
  private final mba i;
  private final sba<? super jba> j;
  private gba k;
  private HttpURLConnection l;
  private InputStream m;
  private boolean n;
  private long o;
  private long p;
  private long q;
  private long r;
  
  public jba(String paramString, Eba<String> paramEba, sba<? super jba> paramsba, int paramInt1, int paramInt2, boolean paramBoolean, mba parammba)
  {
    tba.a(paramString);
    this.f = paramString;
    this.g = null;
    this.j = paramsba;
    this.i = new mba();
    this.d = paramInt1;
    this.e = paramInt2;
    this.c = true;
    this.h = null;
  }
  
  private static long a(HttpURLConnection paramHttpURLConnection)
  {
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    long l1;
    Object localObject;
    if (!TextUtils.isEmpty(str)) {
      try
      {
        l1 = Long.parseLong(str);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        localObject = new StringBuilder(String.valueOf(str).length() + 28);
        ((StringBuilder)localObject).append("Unexpected Content-Length [");
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append("]");
        Log.e("DefaultHttpDataSource", ((StringBuilder)localObject).toString());
      }
    } else {
      l1 = -1L;
    }
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Range");
    long l2 = l1;
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      localObject = a.matcher(paramHttpURLConnection);
      l2 = l1;
      if (((Matcher)localObject).find()) {
        try
        {
          long l3 = Long.parseLong(((Matcher)localObject).group(2)) - Long.parseLong(((Matcher)localObject).group(1)) + 1L;
          if (l1 < 0L)
          {
            l2 = l3;
          }
          else
          {
            l2 = l1;
            if (l1 != l3)
            {
              int i1 = String.valueOf(str).length();
              int i2 = String.valueOf(paramHttpURLConnection).length();
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>(i1 + 26 + i2);
              ((StringBuilder)localObject).append("Inconsistent headers [");
              ((StringBuilder)localObject).append(str);
              ((StringBuilder)localObject).append("] [");
              ((StringBuilder)localObject).append(paramHttpURLConnection);
              ((StringBuilder)localObject).append("]");
              Log.w("DefaultHttpDataSource", ((StringBuilder)localObject).toString());
              l2 = Math.max(l1, l3);
            }
          }
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramHttpURLConnection).length() + 27);
          localStringBuilder.append("Unexpected Content-Range [");
          localStringBuilder.append(paramHttpURLConnection);
          localStringBuilder.append("]");
          Log.e("DefaultHttpDataSource", localStringBuilder.toString());
          l2 = l1;
        }
      }
    }
    return l2;
  }
  
  private final HttpURLConnection a(URL paramURL, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
    localHttpURLConnection.setConnectTimeout(this.d);
    localHttpURLConnection.setReadTimeout(this.e);
    paramURL = this.i.a().entrySet().iterator();
    Object localObject;
    while (paramURL.hasNext())
    {
      localObject = (Map.Entry)paramURL.next();
      localHttpURLConnection.setRequestProperty((String)((Map.Entry)localObject).getKey(), (String)((Map.Entry)localObject).getValue());
    }
    if ((paramLong1 != 0L) || (paramLong2 != -1L))
    {
      paramURL = new StringBuilder(27);
      paramURL.append("bytes=");
      paramURL.append(paramLong1);
      paramURL.append("-");
      localObject = paramURL.toString();
      paramURL = (URL)localObject;
      if (paramLong2 != -1L)
      {
        paramURL = String.valueOf(localObject);
        localObject = new StringBuilder(String.valueOf(paramURL).length() + 20);
        ((StringBuilder)localObject).append(paramURL);
        ((StringBuilder)localObject).append(paramLong1 + paramLong2 - 1L);
        paramURL = ((StringBuilder)localObject).toString();
      }
      localHttpURLConnection.setRequestProperty("Range", paramURL);
    }
    localHttpURLConnection.setRequestProperty("User-Agent", this.f);
    if (!paramBoolean1) {
      localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
    }
    localHttpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfByte != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    localHttpURLConnection.setDoOutput(paramBoolean1);
    if (paramArrayOfByte != null)
    {
      localHttpURLConnection.setRequestMethod("POST");
      if (paramArrayOfByte.length != 0)
      {
        localHttpURLConnection.setFixedLengthStreamingMode(paramArrayOfByte.length);
        localHttpURLConnection.connect();
        paramURL = localHttpURLConnection.getOutputStream();
        paramURL.write(paramArrayOfByte);
        paramURL.close();
        break label317;
      }
    }
    localHttpURLConnection.connect();
    label317:
    return localHttpURLConnection;
  }
  
  private final void b()
  {
    HttpURLConnection localHttpURLConnection = this.l;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
      }
      this.l = null;
    }
  }
  
  public final long a(gba paramgba)
    throws kba
  {
    this.k = paramgba;
    this.r = 0L;
    this.q = 0L;
    try
    {
      Object localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(paramgba.a.toString());
      byte[] arrayOfByte = paramgba.b;
      long l1 = paramgba.d;
      long l2 = paramgba.e;
      boolean bool = paramgba.a(1);
      int i1;
      if (!this.c) {
        localObject1 = a((URL)localObject1, arrayOfByte, l1, l2, bool, true);
      } else {
        i1 = 0;
      }
      int i2;
      for (;;)
      {
        i2 = i1 + 1;
        if (i1 > 20) {
          break label616;
        }
        Object localObject4 = a((URL)localObject1, arrayOfByte, l1, l2, bool, false);
        i1 = ((HttpURLConnection)localObject4).getResponseCode();
        if ((i1 != 300) && (i1 != 301) && (i1 != 302) && (i1 != 303) && ((arrayOfByte != null) || ((i1 != 307) && (i1 != 308))))
        {
          localObject1 = localObject4;
          this.l = ((HttpURLConnection)localObject1);
          try
          {
            i1 = this.l.getResponseCode();
            if ((i1 >= 200) && (i1 <= 299))
            {
              this.l.getContentType();
              if (i1 == 200)
              {
                l1 = paramgba.d;
                if (l1 != 0L) {}
              }
              else
              {
                l1 = 0L;
              }
              this.o = l1;
              if (!paramgba.a(1))
              {
                l2 = paramgba.e;
                l1 = -1L;
                if (l2 != -1L)
                {
                  this.p = l2;
                }
                else
                {
                  l2 = a(this.l);
                  if (l2 != -1L) {
                    l1 = l2 - this.o;
                  }
                  this.p = l1;
                }
              }
              else
              {
                this.p = paramgba.e;
              }
              try
              {
                this.m = this.l.getInputStream();
                this.n = true;
                localObject1 = this.j;
                if (localObject1 != null) {
                  ((sba)localObject1).a(this, paramgba);
                }
                return this.p;
              }
              catch (IOException localIOException1)
              {
                b();
                throw new kba(localIOException1, paramgba, 1);
              }
            }
            localObject2 = this.l.getHeaderFields();
            b();
            paramgba = new lba(i1, (Map)localObject2, paramgba);
            if (i1 == 416) {
              paramgba.initCause(new fba(0));
            }
            throw paramgba;
          }
          catch (IOException localIOException2)
          {
            b();
            localObject2 = String.valueOf(paramgba.a.toString());
            if (((String)localObject2).length() != 0) {
              localObject2 = "Unable to connect to ".concat((String)localObject2);
            } else {
              localObject2 = new String("Unable to connect to ");
            }
            throw new kba((String)localObject2, localIOException2, paramgba, 1);
          }
        }
        localObject3 = null;
        String str = ((HttpURLConnection)localObject4).getHeaderField("Location");
        ((HttpURLConnection)localObject4).disconnect();
        if (str == null) {
          break;
        }
        localObject4 = new java/net/URL;
        ((URL)localObject4).<init>((URL)localObject2, str);
        localObject2 = ((URL)localObject4).getProtocol();
        if ((!"https".equals(localObject2)) && (!"http".equals(localObject2)))
        {
          localObject3 = new java/net/ProtocolException;
          localObject2 = String.valueOf(localObject2);
          if (((String)localObject2).length() != 0) {
            localObject2 = "Unsupported protocol redirect: ".concat((String)localObject2);
          } else {
            localObject2 = new String("Unsupported protocol redirect: ");
          }
          ((ProtocolException)localObject3).<init>((String)localObject2);
          throw ((Throwable)localObject3);
        }
        i1 = i2;
        localObject2 = localObject4;
      }
      localObject2 = new java/net/ProtocolException;
      ((ProtocolException)localObject2).<init>("Null location redirect");
      throw ((Throwable)localObject2);
      label616:
      Object localObject3 = new java/net/NoRouteToHostException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>(31);
      ((StringBuilder)localObject2).append("Too many redirects: ");
      ((StringBuilder)localObject2).append(i2);
      ((NoRouteToHostException)localObject3).<init>(((StringBuilder)localObject2).toString());
      throw ((Throwable)localObject3);
    }
    catch (IOException localIOException3)
    {
      Object localObject2 = String.valueOf(paramgba.a.toString());
      if (((String)localObject2).length() != 0) {
        localObject2 = "Unable to connect to ".concat((String)localObject2);
      } else {
        localObject2 = new String("Unable to connect to ");
      }
      throw new kba((String)localObject2, localIOException3, paramgba, 1);
    }
  }
  
  public final Map<String, List<String>> a()
  {
    HttpURLConnection localHttpURLConnection = this.l;
    if (localHttpURLConnection == null) {
      return null;
    }
    return localHttpURLConnection.getHeaderFields();
  }
  
  public final void close()
    throws kba
  {
    for (;;)
    {
      try
      {
        if (this.m != null)
        {
          localObject1 = this.l;
          if (this.p == -1L) {
            l1 = this.p;
          } else {
            l1 = this.p - this.r;
          }
          if (Hba.a != 19)
          {
            int i1 = Hba.a;
            if (i1 != 20) {
              continue;
            }
          }
        }
      }
      finally
      {
        Object localObject1;
        long l1;
        Object localObject2;
        sba localsba;
        this.m = null;
        b();
        if (this.n)
        {
          this.n = false;
          localsba = this.j;
          if (localsba != null) {
            localsba.d(this);
          }
        }
      }
      try
      {
        localObject1 = ((HttpURLConnection)localObject1).getInputStream();
        if (l1 == -1L ? ((InputStream)localObject1).read() != -1 : l1 > 2048L)
        {
          localObject2 = localObject1.getClass().getName();
          if ((((String)localObject2).equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) || (((String)localObject2).equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")))
          {
            localObject2 = localObject1.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((Method)localObject2).setAccessible(true);
            ((Method)localObject2).invoke(localObject1, new Object[0]);
          }
        }
      }
      catch (Exception localException)
      {
        continue;
      }
      try
      {
        this.m.close();
      }
      catch (IOException localIOException)
      {
        localObject2 = new com/google/android/gms/internal/ads/kba;
        ((kba)localObject2).<init>(localIOException, this.k, 3);
        throw ((Throwable)localObject2);
      }
    }
    this.m = null;
    b();
    if (this.n)
    {
      this.n = false;
      localsba = this.j;
      if (localsba != null) {
        localsba.d(this);
      }
    }
  }
  
  public final Uri getUri()
  {
    HttpURLConnection localHttpURLConnection = this.l;
    if (localHttpURLConnection == null) {
      return null;
    }
    return Uri.parse(localHttpURLConnection.getURL().toString());
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws kba
  {
    try
    {
      if (this.q != this.o)
      {
        byte[] arrayOfByte1 = (byte[])b.getAndSet(null);
        byte[] arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1 == null) {
          arrayOfByte2 = new byte['က'];
        }
        while (this.q != this.o)
        {
          i1 = (int)Math.min(this.o - this.q, arrayOfByte2.length);
          i1 = this.m.read(arrayOfByte2, 0, i1);
          if (!Thread.interrupted())
          {
            if (i1 != -1)
            {
              this.q += i1;
              if (this.j != null) {
                this.j.a(this, i1);
              }
            }
            else
            {
              paramArrayOfByte = new java/io/EOFException;
              paramArrayOfByte.<init>();
              throw paramArrayOfByte;
            }
          }
          else
          {
            paramArrayOfByte = new java/io/InterruptedIOException;
            paramArrayOfByte.<init>();
            throw paramArrayOfByte;
          }
        }
        b.set(arrayOfByte2);
      }
      if (paramInt2 == 0) {
        return 0;
      }
      int i1 = paramInt2;
      if (this.p != -1L)
      {
        long l1 = this.p - this.r;
        if (l1 == 0L) {
          return -1;
        }
        i1 = (int)Math.min(paramInt2, l1);
      }
      paramInt1 = this.m.read(paramArrayOfByte, paramInt1, i1);
      if (paramInt1 == -1)
      {
        if (this.p == -1L) {
          return -1;
        }
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
      }
      this.r += paramInt1;
      if (this.j != null) {
        this.j.a(this, paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new kba(paramArrayOfByte, this.k, 2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */