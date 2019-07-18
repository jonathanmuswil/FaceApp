package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

@yh
final class mo
  implements dba
{
  private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private static final AtomicReference<byte[]> b = new AtomicReference();
  private SSLSocketFactory c = new no(this);
  private final int d;
  private final int e;
  private final String f;
  private final mba g;
  private final sba<? super mo> h;
  private gba i;
  private HttpURLConnection j;
  private InputStream k;
  private boolean l;
  private long m;
  private long n;
  private long o;
  private long p;
  private int q;
  private Set<Socket> r = new HashSet();
  
  mo(String paramString, sba<? super mo> paramsba, int paramInt1, int paramInt2, int paramInt3)
  {
    tba.a(paramString);
    this.f = paramString;
    this.h = paramsba;
    this.g = new mba();
    this.d = paramInt1;
    this.e = paramInt2;
    this.q = paramInt3;
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
        Tl.b(((StringBuilder)localObject).toString());
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
              Tl.d(((StringBuilder)localObject).toString());
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
          Tl.b(localStringBuilder.toString());
          l2 = l1;
        }
      }
    }
    return l2;
  }
  
  private final void a()
  {
    HttpURLConnection localHttpURLConnection = this.j;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        Tl.b("Unexpected error while disconnecting", localException);
      }
      this.j = null;
    }
  }
  
  private final void a(Socket paramSocket)
  {
    this.r.add(paramSocket);
  }
  
  public final long a(gba paramgba)
    throws kba
  {
    this.i = paramgba;
    this.p = 0L;
    this.o = 0L;
    try
    {
      Object localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(paramgba.a.toString());
      byte[] arrayOfByte = paramgba.b;
      long l1 = paramgba.d;
      long l2 = paramgba.e;
      boolean bool1 = paramgba.a(1);
      int i2;
      for (int i1 = 0;; i1 = i2)
      {
        i2 = i1 + 1;
        if (i1 > 20) {
          break label944;
        }
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)((URL)localObject1).openConnection();
        if ((localHttpURLConnection instanceof HttpsURLConnection)) {
          ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(this.c);
        }
        localHttpURLConnection.setConnectTimeout(this.d);
        localHttpURLConnection.setReadTimeout(this.e);
        Object localObject4 = this.g.a().entrySet().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject5 = (Map.Entry)((Iterator)localObject4).next();
          localHttpURLConnection.setRequestProperty((String)((Map.Entry)localObject5).getKey(), (String)((Map.Entry)localObject5).getValue());
        }
        if ((l1 == 0L) && (l2 == -1L)) {
          break label335;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>(27);
        ((StringBuilder)localObject4).append("bytes=");
        ((StringBuilder)localObject4).append(l1);
        ((StringBuilder)localObject4).append("-");
        localObject4 = ((StringBuilder)localObject4).toString();
        if (l2 != -1L)
        {
          localObject4 = String.valueOf(localObject4);
          i1 = String.valueOf(localObject4).length();
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>(i1 + 20);
          ((StringBuilder)localObject5).append((String)localObject4);
          ((StringBuilder)localObject5).append(l1 + l2 - 1L);
          localObject4 = ((StringBuilder)localObject5).toString();
        }
        localHttpURLConnection.setRequestProperty("Range", (String)localObject4);
        label335:
        localHttpURLConnection.setRequestProperty("User-Agent", this.f);
        if (!bool1) {
          localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        localHttpURLConnection.setInstanceFollowRedirects(false);
        boolean bool2;
        if (arrayOfByte != null) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        localHttpURLConnection.setDoOutput(bool2);
        if (arrayOfByte != null)
        {
          localHttpURLConnection.setRequestMethod("POST");
          if (arrayOfByte.length != 0)
          {
            localHttpURLConnection.setFixedLengthStreamingMode(arrayOfByte.length);
            localHttpURLConnection.connect();
            localObject4 = localHttpURLConnection.getOutputStream();
            ((OutputStream)localObject4).write(arrayOfByte);
            ((OutputStream)localObject4).close();
            break label444;
          }
        }
        localHttpURLConnection.connect();
        label444:
        i1 = localHttpURLConnection.getResponseCode();
        if ((i1 != 300) && (i1 != 301) && (i1 != 302) && (i1 != 303) && ((arrayOfByte != null) || ((i1 != 307) && (i1 != 308))))
        {
          this.j = localHttpURLConnection;
          try
          {
            i1 = this.j.getResponseCode();
            if ((i1 >= 200) && (i1 <= 299))
            {
              if (i1 == 200)
              {
                l1 = paramgba.d;
                if (l1 != 0L) {}
              }
              else
              {
                l1 = 0L;
              }
              this.m = l1;
              if (!paramgba.a(1))
              {
                l1 = paramgba.e;
                if (l1 != -1L)
                {
                  this.n = l1;
                }
                else
                {
                  l1 = a(this.j);
                  if (l1 != -1L) {
                    l1 -= this.m;
                  } else {
                    l1 = -1L;
                  }
                  this.n = l1;
                }
              }
              else
              {
                this.n = paramgba.e;
              }
              try
              {
                this.k = this.j.getInputStream();
                this.l = true;
                localObject1 = this.h;
                if (localObject1 != null) {
                  ((sba)localObject1).a(this, paramgba);
                }
                return this.n;
              }
              catch (IOException localIOException1)
              {
                a();
                throw new kba(localIOException1, paramgba, 1);
              }
            }
            localObject2 = this.j.getHeaderFields();
            a();
            paramgba = new lba(i1, (Map)localObject2, paramgba);
            if (i1 == 416) {
              paramgba.initCause(new fba(0));
            }
            throw paramgba;
          }
          catch (IOException localIOException2)
          {
            a();
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
        Object localObject5 = localHttpURLConnection.getHeaderField("Location");
        localHttpURLConnection.disconnect();
        if (localObject5 == null) {
          break;
        }
        localObject4 = new java/net/URL;
        ((URL)localObject4).<init>((URL)localObject2, (String)localObject5);
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
        localObject2 = localObject4;
      }
      localObject2 = new java/net/ProtocolException;
      ((ProtocolException)localObject2).<init>("Null location redirect");
      throw ((Throwable)localObject2);
      label944:
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
  
  final void a(int paramInt)
  {
    this.q = paramInt;
    Iterator localIterator = this.r.iterator();
    while (localIterator.hasNext())
    {
      Socket localSocket = (Socket)localIterator.next();
      if (!localSocket.isClosed()) {
        try
        {
          localSocket.setReceiveBufferSize(this.q);
        }
        catch (SocketException localSocketException)
        {
          Tl.c("Failed to update receive buffer size.", localSocketException);
        }
      }
    }
  }
  
  public final void close()
    throws kba
  {
    for (;;)
    {
      try
      {
        if (this.k != null)
        {
          localObject1 = this.j;
          if (this.n == -1L) {
            l1 = this.n;
          } else {
            l1 = this.n - this.p;
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
        this.k = null;
        a();
        if (this.l)
        {
          this.l = false;
          sba localsba = this.h;
          if (localsba != null) {
            localsba.d(this);
          }
        }
        this.r.clear();
      }
      try
      {
        localObject1 = ((HttpURLConnection)localObject1).getInputStream();
        if (l1 == -1L ? ((InputStream)localObject1).read() != -1 : l1 > 2048L)
        {
          Object localObject3 = localObject1.getClass().getName();
          if ((((String)localObject3).equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) || (((String)localObject3).equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")))
          {
            localObject3 = localObject1.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((Method)localObject3).setAccessible(true);
            ((Method)localObject3).invoke(localObject1, new Object[0]);
          }
        }
      }
      catch (Exception localException)
      {
        continue;
      }
      try
      {
        this.k.close();
      }
      catch (IOException localIOException)
      {
        localObject1 = new com/google/android/gms/internal/ads/kba;
        ((kba)localObject1).<init>(localIOException, this.i, 3);
        throw ((Throwable)localObject1);
      }
    }
    this.k = null;
    a();
    if (this.l)
    {
      this.l = false;
      localObject1 = this.h;
      if (localObject1 != null) {
        ((sba)localObject1).d(this);
      }
    }
    this.r.clear();
  }
  
  public final Uri getUri()
  {
    HttpURLConnection localHttpURLConnection = this.j;
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
      if (this.o != this.m)
      {
        byte[] arrayOfByte1 = (byte[])b.getAndSet(null);
        byte[] arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1 == null) {
          arrayOfByte2 = new byte['က'];
        }
        while (this.o != this.m)
        {
          i1 = (int)Math.min(this.m - this.o, arrayOfByte2.length);
          i1 = this.k.read(arrayOfByte2, 0, i1);
          if (!Thread.interrupted())
          {
            if (i1 != -1)
            {
              this.o += i1;
              if (this.h != null) {
                this.h.a(this, i1);
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
      if (this.n != -1L)
      {
        long l1 = this.n - this.p;
        if (l1 == 0L) {
          return -1;
        }
        i1 = (int)Math.min(paramInt2, l1);
      }
      paramInt1 = this.k.read(paramArrayOfByte, paramInt1, i1);
      if (paramInt1 == -1)
      {
        if (this.n == -1L) {
          return -1;
        }
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
      }
      this.p += paramInt1;
      if (this.h != null) {
        this.h.a(this, paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new kba(paramArrayOfByte, this.i, 2);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */