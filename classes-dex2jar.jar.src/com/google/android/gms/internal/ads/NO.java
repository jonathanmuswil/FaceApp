package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

final class no
  extends SSLSocketFactory
{
  private SSLSocketFactory a = (SSLSocketFactory)SSLSocketFactory.getDefault();
  
  no(mo parammo) {}
  
  private final Socket a(Socket paramSocket)
    throws SocketException
  {
    if (mo.a(this.b) > 0) {
      paramSocket.setReceiveBufferSize(mo.a(this.b));
    }
    mo.a(this.b, paramSocket);
    return paramSocket;
  }
  
  public final Socket createSocket(String paramString, int paramInt)
    throws IOException
  {
    paramString = this.a.createSocket(paramString, paramInt);
    a(paramString);
    return paramString;
  }
  
  public final Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
    throws IOException
  {
    paramString = this.a.createSocket(paramString, paramInt1, paramInetAddress, paramInt2);
    a(paramString);
    return paramString;
  }
  
  public final Socket createSocket(InetAddress paramInetAddress, int paramInt)
    throws IOException
  {
    paramInetAddress = this.a.createSocket(paramInetAddress, paramInt);
    a(paramInetAddress);
    return paramInetAddress;
  }
  
  public final Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
    throws IOException
  {
    paramInetAddress1 = this.a.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
    a(paramInetAddress1);
    return paramInetAddress1;
  }
  
  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
    throws IOException
  {
    paramSocket = this.a.createSocket(paramSocket, paramString, paramInt, paramBoolean);
    a(paramSocket);
    return paramSocket;
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */