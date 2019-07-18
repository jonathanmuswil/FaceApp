package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class ic
  extends SSLSocketFactory
{
  private final SSLSocketFactory a;
  
  ic()
  {
    this(HttpsURLConnection.getDefaultSSLSocketFactory());
  }
  
  private ic(SSLSocketFactory paramSSLSocketFactory)
  {
    this.a = paramSSLSocketFactory;
  }
  
  private final SSLSocket a(SSLSocket paramSSLSocket)
  {
    return new jc(this, paramSSLSocket);
  }
  
  public final Socket createSocket()
    throws IOException
  {
    return a((SSLSocket)this.a.createSocket());
  }
  
  public final Socket createSocket(String paramString, int paramInt)
    throws IOException
  {
    return a((SSLSocket)this.a.createSocket(paramString, paramInt));
  }
  
  public final Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
    throws IOException
  {
    return a((SSLSocket)this.a.createSocket(paramString, paramInt1, paramInetAddress, paramInt2));
  }
  
  public final Socket createSocket(InetAddress paramInetAddress, int paramInt)
    throws IOException
  {
    return a((SSLSocket)this.a.createSocket(paramInetAddress, paramInt));
  }
  
  public final Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
    throws IOException
  {
    return a((SSLSocket)this.a.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2));
  }
  
  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
    throws IOException
  {
    return a((SSLSocket)this.a.createSocket(paramSocket, paramString, paramInt, paramBoolean));
  }
  
  public final String[] getDefaultCipherSuites()
  {
    return this.a.getDefaultCipherSuites();
  }
  
  public final String[] getSupportedCipherSuites()
  {
    return this.a.getSupportedCipherSuites();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/ic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */