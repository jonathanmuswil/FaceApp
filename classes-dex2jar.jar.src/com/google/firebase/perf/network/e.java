package com.google.firebase.perf.network;

import Iv;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import vv;

final class e
{
  private final HttpURLConnection a;
  private final vv b;
  private long c = -1L;
  private long d = -1L;
  private final Iv e;
  
  public e(HttpURLConnection paramHttpURLConnection, Iv paramIv, vv paramvv)
  {
    this.a = paramHttpURLConnection;
    this.b = paramvv;
    this.e = paramIv;
    this.b.a(this.a.getURL().toString());
  }
  
  private final void E()
  {
    if (this.c == -1L)
    {
      this.e.l();
      this.c = this.e.m();
      this.b.b(this.c);
    }
    String str = this.a.getRequestMethod();
    if (str != null)
    {
      this.b.b(str);
      return;
    }
    if (this.a.getDoOutput())
    {
      this.b.b("POST");
      return;
    }
    this.b.b("GET");
  }
  
  public final String A()
    throws IOException
  {
    E();
    if (this.d == -1L)
    {
      this.d = this.e.n();
      this.b.d(this.d);
    }
    try
    {
      String str = this.a.getResponseMessage();
      this.b.b(this.a.getResponseCode());
      return str;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final URL B()
  {
    return this.a.getURL();
  }
  
  public final boolean C()
  {
    return this.a.getUseCaches();
  }
  
  public final boolean D()
  {
    return this.a.usingProxy();
  }
  
  public final int a(String paramString, int paramInt)
  {
    E();
    return this.a.getHeaderFieldInt(paramString, paramInt);
  }
  
  public final long a(String paramString, long paramLong)
  {
    E();
    return this.a.getHeaderFieldDate(paramString, paramLong);
  }
  
  public final Object a(Class[] paramArrayOfClass)
    throws IOException
  {
    E();
    this.b.b(this.a.getResponseCode());
    try
    {
      paramArrayOfClass = this.a.getContent(paramArrayOfClass);
      if ((paramArrayOfClass instanceof InputStream))
      {
        this.b.c(this.a.getContentType());
        paramArrayOfClass = new a((InputStream)paramArrayOfClass, this.b, this.e);
      }
      else
      {
        this.b.c(this.a.getContentType());
        this.b.f(this.a.getContentLength());
        this.b.e(this.e.n());
        this.b.o();
      }
      return paramArrayOfClass;
    }
    catch (IOException paramArrayOfClass)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw paramArrayOfClass;
    }
  }
  
  public final String a(int paramInt)
  {
    E();
    return this.a.getHeaderField(paramInt);
  }
  
  public final String a(String paramString)
  {
    E();
    return this.a.getHeaderField(paramString);
  }
  
  public final void a()
    throws IOException
  {
    if (this.c == -1L)
    {
      this.e.l();
      this.c = this.e.m();
      this.b.b(this.c);
    }
    try
    {
      this.a.connect();
      return;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final void a(long paramLong)
  {
    this.a.setFixedLengthStreamingMode(paramLong);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.a.addRequestProperty(paramString1, paramString2);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.a.setAllowUserInteraction(paramBoolean);
  }
  
  public final long b(String paramString, long paramLong)
  {
    E();
    return this.a.getHeaderFieldLong(paramString, paramLong);
  }
  
  public final String b(int paramInt)
  {
    E();
    return this.a.getHeaderFieldKey(paramInt);
  }
  
  public final String b(String paramString)
  {
    return this.a.getRequestProperty(paramString);
  }
  
  public final void b()
  {
    this.b.e(this.e.n());
    this.b.o();
    this.a.disconnect();
  }
  
  public final void b(long paramLong)
  {
    this.a.setIfModifiedSince(paramLong);
  }
  
  public final void b(String paramString1, String paramString2)
  {
    this.a.setRequestProperty(paramString1, paramString2);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.a.setDefaultUseCaches(paramBoolean);
  }
  
  public final void c(int paramInt)
  {
    this.a.setChunkedStreamingMode(paramInt);
  }
  
  public final void c(String paramString)
    throws ProtocolException
  {
    this.a.setRequestMethod(paramString);
  }
  
  public final void c(boolean paramBoolean)
  {
    this.a.setDoInput(paramBoolean);
  }
  
  public final boolean c()
  {
    return this.a.getAllowUserInteraction();
  }
  
  public final int d()
  {
    return this.a.getConnectTimeout();
  }
  
  public final void d(int paramInt)
  {
    this.a.setConnectTimeout(paramInt);
  }
  
  public final void d(boolean paramBoolean)
  {
    this.a.setDoOutput(paramBoolean);
  }
  
  public final Object e()
    throws IOException
  {
    E();
    this.b.b(this.a.getResponseCode());
    try
    {
      Object localObject = this.a.getContent();
      if ((localObject instanceof InputStream))
      {
        this.b.c(this.a.getContentType());
        localObject = new a((InputStream)localObject, this.b, this.e);
      }
      else
      {
        this.b.c(this.a.getContentType());
        this.b.f(this.a.getContentLength());
        this.b.e(this.e.n());
        this.b.o();
      }
      return localObject;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final void e(int paramInt)
  {
    this.a.setFixedLengthStreamingMode(paramInt);
  }
  
  public final void e(boolean paramBoolean)
  {
    this.a.setInstanceFollowRedirects(paramBoolean);
  }
  
  public final boolean equals(Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  public final String f()
  {
    E();
    return this.a.getContentEncoding();
  }
  
  public final void f(int paramInt)
  {
    this.a.setReadTimeout(paramInt);
  }
  
  public final void f(boolean paramBoolean)
  {
    this.a.setUseCaches(paramBoolean);
  }
  
  public final int g()
  {
    E();
    return this.a.getContentLength();
  }
  
  public final long h()
  {
    E();
    return this.a.getContentLengthLong();
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final String i()
  {
    E();
    return this.a.getContentType();
  }
  
  public final long j()
  {
    E();
    return this.a.getDate();
  }
  
  public final boolean k()
  {
    return this.a.getDefaultUseCaches();
  }
  
  public final boolean l()
  {
    return this.a.getDoInput();
  }
  
  public final boolean m()
  {
    return this.a.getDoOutput();
  }
  
  public final InputStream n()
  {
    E();
    try
    {
      this.b.b(this.a.getResponseCode());
    }
    catch (IOException localIOException)
    {
      Log.d("FirebasePerformance", "IOException thrown trying to obtain the response code");
    }
    InputStream localInputStream = this.a.getErrorStream();
    if (localInputStream != null) {
      return new a(localInputStream, this.b, this.e);
    }
    return localInputStream;
  }
  
  public final long o()
  {
    E();
    return this.a.getExpiration();
  }
  
  public final Map<String, List<String>> p()
  {
    E();
    return this.a.getHeaderFields();
  }
  
  public final long q()
  {
    return this.a.getIfModifiedSince();
  }
  
  public final InputStream r()
    throws IOException
  {
    E();
    this.b.b(this.a.getResponseCode());
    this.b.c(this.a.getContentType());
    try
    {
      a locala = new a(this.a.getInputStream(), this.b, this.e);
      return locala;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final boolean s()
  {
    return this.a.getInstanceFollowRedirects();
  }
  
  public final long t()
  {
    E();
    return this.a.getLastModified();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
  
  public final OutputStream u()
    throws IOException
  {
    try
    {
      b localb = new b(this.a.getOutputStream(), this.b, this.e);
      return localb;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final Permission v()
    throws IOException
  {
    try
    {
      Permission localPermission = this.a.getPermission();
      return localPermission;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
  
  public final int w()
  {
    return this.a.getReadTimeout();
  }
  
  public final String x()
  {
    return this.a.getRequestMethod();
  }
  
  public final Map<String, List<String>> y()
  {
    return this.a.getRequestProperties();
  }
  
  public final int z()
    throws IOException
  {
    E();
    if (this.d == -1L)
    {
      this.d = this.e.n();
      this.b.d(this.d);
    }
    try
    {
      int i = this.a.getResponseCode();
      this.b.b(i);
      return i;
    }
    catch (IOException localIOException)
    {
      this.b.e(this.e.n());
      h.a(this.b);
      throw localIOException;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */