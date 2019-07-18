package com.google.firebase.perf.network;

import Iv;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import vv;

public final class d
  extends HttpsURLConnection
{
  private final e a;
  private final HttpsURLConnection b;
  
  d(HttpsURLConnection paramHttpsURLConnection, Iv paramIv, vv paramvv)
  {
    super(paramHttpsURLConnection.getURL());
    this.b = paramHttpsURLConnection;
    this.a = new e(paramHttpsURLConnection, paramIv, paramvv);
  }
  
  public final void addRequestProperty(String paramString1, String paramString2)
  {
    this.a.a(paramString1, paramString2);
  }
  
  public final void connect()
    throws IOException
  {
    this.a.a();
  }
  
  public final void disconnect()
  {
    this.a.b();
  }
  
  public final boolean equals(Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  public final boolean getAllowUserInteraction()
  {
    return this.a.c();
  }
  
  public final String getCipherSuite()
  {
    return this.b.getCipherSuite();
  }
  
  public final int getConnectTimeout()
  {
    return this.a.d();
  }
  
  public final Object getContent()
    throws IOException
  {
    return this.a.e();
  }
  
  public final Object getContent(Class[] paramArrayOfClass)
    throws IOException
  {
    return this.a.a(paramArrayOfClass);
  }
  
  public final String getContentEncoding()
  {
    return this.a.f();
  }
  
  public final int getContentLength()
  {
    return this.a.g();
  }
  
  public final long getContentLengthLong()
  {
    return this.a.h();
  }
  
  public final String getContentType()
  {
    return this.a.i();
  }
  
  public final long getDate()
  {
    return this.a.j();
  }
  
  public final boolean getDefaultUseCaches()
  {
    return this.a.k();
  }
  
  public final boolean getDoInput()
  {
    return this.a.l();
  }
  
  public final boolean getDoOutput()
  {
    return this.a.m();
  }
  
  public final InputStream getErrorStream()
  {
    return this.a.n();
  }
  
  public final long getExpiration()
  {
    return this.a.o();
  }
  
  public final String getHeaderField(int paramInt)
  {
    return this.a.a(paramInt);
  }
  
  public final String getHeaderField(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public final long getHeaderFieldDate(String paramString, long paramLong)
  {
    return this.a.a(paramString, paramLong);
  }
  
  public final int getHeaderFieldInt(String paramString, int paramInt)
  {
    return this.a.a(paramString, paramInt);
  }
  
  public final String getHeaderFieldKey(int paramInt)
  {
    return this.a.b(paramInt);
  }
  
  public final long getHeaderFieldLong(String paramString, long paramLong)
  {
    return this.a.b(paramString, paramLong);
  }
  
  public final Map<String, List<String>> getHeaderFields()
  {
    return this.a.p();
  }
  
  public final HostnameVerifier getHostnameVerifier()
  {
    return this.b.getHostnameVerifier();
  }
  
  public final long getIfModifiedSince()
  {
    return this.a.q();
  }
  
  public final InputStream getInputStream()
    throws IOException
  {
    return this.a.r();
  }
  
  public final boolean getInstanceFollowRedirects()
  {
    return this.a.s();
  }
  
  public final long getLastModified()
  {
    return this.a.t();
  }
  
  public final Certificate[] getLocalCertificates()
  {
    return this.b.getLocalCertificates();
  }
  
  public final Principal getLocalPrincipal()
  {
    return this.b.getLocalPrincipal();
  }
  
  public final OutputStream getOutputStream()
    throws IOException
  {
    return this.a.u();
  }
  
  public final Principal getPeerPrincipal()
    throws SSLPeerUnverifiedException
  {
    return this.b.getPeerPrincipal();
  }
  
  public final Permission getPermission()
    throws IOException
  {
    return this.a.v();
  }
  
  public final int getReadTimeout()
  {
    return this.a.w();
  }
  
  public final String getRequestMethod()
  {
    return this.a.x();
  }
  
  public final Map<String, List<String>> getRequestProperties()
  {
    return this.a.y();
  }
  
  public final String getRequestProperty(String paramString)
  {
    return this.a.b(paramString);
  }
  
  public final int getResponseCode()
    throws IOException
  {
    return this.a.z();
  }
  
  public final String getResponseMessage()
    throws IOException
  {
    return this.a.A();
  }
  
  public final SSLSocketFactory getSSLSocketFactory()
  {
    return this.b.getSSLSocketFactory();
  }
  
  public final Certificate[] getServerCertificates()
    throws SSLPeerUnverifiedException
  {
    return this.b.getServerCertificates();
  }
  
  public final URL getURL()
  {
    return this.a.B();
  }
  
  public final boolean getUseCaches()
  {
    return this.a.C();
  }
  
  public final int hashCode()
  {
    return this.a.hashCode();
  }
  
  public final void setAllowUserInteraction(boolean paramBoolean)
  {
    this.a.a(paramBoolean);
  }
  
  public final void setChunkedStreamingMode(int paramInt)
  {
    this.a.c(paramInt);
  }
  
  public final void setConnectTimeout(int paramInt)
  {
    this.a.d(paramInt);
  }
  
  public final void setDefaultUseCaches(boolean paramBoolean)
  {
    this.a.b(paramBoolean);
  }
  
  public final void setDoInput(boolean paramBoolean)
  {
    this.a.c(paramBoolean);
  }
  
  public final void setDoOutput(boolean paramBoolean)
  {
    this.a.d(paramBoolean);
  }
  
  public final void setFixedLengthStreamingMode(int paramInt)
  {
    this.a.e(paramInt);
  }
  
  public final void setFixedLengthStreamingMode(long paramLong)
  {
    this.a.a(paramLong);
  }
  
  public final void setHostnameVerifier(HostnameVerifier paramHostnameVerifier)
  {
    this.b.setHostnameVerifier(paramHostnameVerifier);
  }
  
  public final void setIfModifiedSince(long paramLong)
  {
    this.a.b(paramLong);
  }
  
  public final void setInstanceFollowRedirects(boolean paramBoolean)
  {
    this.a.e(paramBoolean);
  }
  
  public final void setReadTimeout(int paramInt)
  {
    this.a.f(paramInt);
  }
  
  public final void setRequestMethod(String paramString)
    throws ProtocolException
  {
    this.a.c(paramString);
  }
  
  public final void setRequestProperty(String paramString1, String paramString2)
  {
    this.a.b(paramString1, paramString2);
  }
  
  public final void setSSLSocketFactory(SSLSocketFactory paramSSLSocketFactory)
  {
    this.b.setSSLSocketFactory(paramSSLSocketFactory);
  }
  
  public final void setUseCaches(boolean paramBoolean)
  {
    this.a.f(paramBoolean);
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
  
  public final boolean usingProxy()
  {
    return this.a.D();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */