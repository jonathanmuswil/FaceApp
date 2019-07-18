package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class jc
  extends SSLSocket
{
  private final SSLSocket a;
  
  jc(ic paramic, SSLSocket paramSSLSocket)
  {
    this.a = paramSSLSocket;
  }
  
  public final void addHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener)
  {
    this.a.addHandshakeCompletedListener(paramHandshakeCompletedListener);
  }
  
  public final void bind(SocketAddress paramSocketAddress)
    throws IOException
  {
    this.a.bind(paramSocketAddress);
  }
  
  public final void close()
    throws IOException
  {
    try
    {
      this.a.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void connect(SocketAddress paramSocketAddress)
    throws IOException
  {
    this.a.connect(paramSocketAddress);
  }
  
  public final void connect(SocketAddress paramSocketAddress, int paramInt)
    throws IOException
  {
    this.a.connect(paramSocketAddress, paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    return this.a.equals(paramObject);
  }
  
  public final SocketChannel getChannel()
  {
    return this.a.getChannel();
  }
  
  public final boolean getEnableSessionCreation()
  {
    return this.a.getEnableSessionCreation();
  }
  
  public final String[] getEnabledCipherSuites()
  {
    return this.a.getEnabledCipherSuites();
  }
  
  public final String[] getEnabledProtocols()
  {
    return this.a.getEnabledProtocols();
  }
  
  public final InetAddress getInetAddress()
  {
    return this.a.getInetAddress();
  }
  
  public final InputStream getInputStream()
    throws IOException
  {
    return this.a.getInputStream();
  }
  
  public final boolean getKeepAlive()
    throws SocketException
  {
    return this.a.getKeepAlive();
  }
  
  public final InetAddress getLocalAddress()
  {
    return this.a.getLocalAddress();
  }
  
  public final int getLocalPort()
  {
    return this.a.getLocalPort();
  }
  
  public final SocketAddress getLocalSocketAddress()
  {
    return this.a.getLocalSocketAddress();
  }
  
  public final boolean getNeedClientAuth()
  {
    return this.a.getNeedClientAuth();
  }
  
  public final boolean getOOBInline()
    throws SocketException
  {
    return this.a.getOOBInline();
  }
  
  public final OutputStream getOutputStream()
    throws IOException
  {
    return this.a.getOutputStream();
  }
  
  public final int getPort()
  {
    return this.a.getPort();
  }
  
  public final int getReceiveBufferSize()
    throws SocketException
  {
    try
    {
      int i = this.a.getReceiveBufferSize();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final SocketAddress getRemoteSocketAddress()
  {
    return this.a.getRemoteSocketAddress();
  }
  
  public final boolean getReuseAddress()
    throws SocketException
  {
    return this.a.getReuseAddress();
  }
  
  public final int getSendBufferSize()
    throws SocketException
  {
    try
    {
      int i = this.a.getSendBufferSize();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final SSLSession getSession()
  {
    return this.a.getSession();
  }
  
  public final int getSoLinger()
    throws SocketException
  {
    return this.a.getSoLinger();
  }
  
  public final int getSoTimeout()
    throws SocketException
  {
    try
    {
      int i = this.a.getSoTimeout();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String[] getSupportedCipherSuites()
  {
    return this.a.getSupportedCipherSuites();
  }
  
  public final String[] getSupportedProtocols()
  {
    return this.a.getSupportedProtocols();
  }
  
  public final boolean getTcpNoDelay()
    throws SocketException
  {
    return this.a.getTcpNoDelay();
  }
  
  public final int getTrafficClass()
    throws SocketException
  {
    return this.a.getTrafficClass();
  }
  
  public final boolean getUseClientMode()
  {
    return this.a.getUseClientMode();
  }
  
  public final boolean getWantClientAuth()
  {
    return this.a.getWantClientAuth();
  }
  
  public final boolean isBound()
  {
    return this.a.isBound();
  }
  
  public final boolean isClosed()
  {
    return this.a.isClosed();
  }
  
  public final boolean isConnected()
  {
    return this.a.isConnected();
  }
  
  public final boolean isInputShutdown()
  {
    return this.a.isInputShutdown();
  }
  
  public final boolean isOutputShutdown()
  {
    return this.a.isOutputShutdown();
  }
  
  public final void removeHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener)
  {
    this.a.removeHandshakeCompletedListener(paramHandshakeCompletedListener);
  }
  
  public final void sendUrgentData(int paramInt)
    throws IOException
  {
    this.a.sendUrgentData(paramInt);
  }
  
  public final void setEnableSessionCreation(boolean paramBoolean)
  {
    this.a.setEnableSessionCreation(paramBoolean);
  }
  
  public final void setEnabledCipherSuites(String[] paramArrayOfString)
  {
    this.a.setEnabledCipherSuites(paramArrayOfString);
  }
  
  public final void setEnabledProtocols(String[] paramArrayOfString)
  {
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString != null)
    {
      arrayOfString = paramArrayOfString;
      if (Arrays.asList(paramArrayOfString).contains("SSLv3"))
      {
        paramArrayOfString = new ArrayList(Arrays.asList(this.a.getEnabledProtocols()));
        if (paramArrayOfString.size() > 1) {
          paramArrayOfString.remove("SSLv3");
        }
        arrayOfString = (String[])paramArrayOfString.toArray(new String[paramArrayOfString.size()]);
      }
    }
    this.a.setEnabledProtocols(arrayOfString);
  }
  
  public final void setKeepAlive(boolean paramBoolean)
    throws SocketException
  {
    this.a.setKeepAlive(paramBoolean);
  }
  
  public final void setNeedClientAuth(boolean paramBoolean)
  {
    this.a.setNeedClientAuth(paramBoolean);
  }
  
  public final void setOOBInline(boolean paramBoolean)
    throws SocketException
  {
    this.a.setOOBInline(paramBoolean);
  }
  
  public final void setPerformancePreferences(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.setPerformancePreferences(paramInt1, paramInt2, paramInt3);
  }
  
  public final void setReceiveBufferSize(int paramInt)
    throws SocketException
  {
    try
    {
      this.a.setReceiveBufferSize(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void setReuseAddress(boolean paramBoolean)
    throws SocketException
  {
    this.a.setReuseAddress(paramBoolean);
  }
  
  public final void setSendBufferSize(int paramInt)
    throws SocketException
  {
    try
    {
      this.a.setSendBufferSize(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void setSoLinger(boolean paramBoolean, int paramInt)
    throws SocketException
  {
    this.a.setSoLinger(paramBoolean, paramInt);
  }
  
  public final void setSoTimeout(int paramInt)
    throws SocketException
  {
    try
    {
      this.a.setSoTimeout(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void setTcpNoDelay(boolean paramBoolean)
    throws SocketException
  {
    this.a.setTcpNoDelay(paramBoolean);
  }
  
  public final void setTrafficClass(int paramInt)
    throws SocketException
  {
    this.a.setTrafficClass(paramInt);
  }
  
  public final void setUseClientMode(boolean paramBoolean)
  {
    this.a.setUseClientMode(paramBoolean);
  }
  
  public final void setWantClientAuth(boolean paramBoolean)
  {
    this.a.setWantClientAuth(paramBoolean);
  }
  
  public final void shutdownInput()
    throws IOException
  {
    this.a.shutdownInput();
  }
  
  public final void shutdownOutput()
    throws IOException
  {
    this.a.shutdownOutput();
  }
  
  public final void startHandshake()
    throws IOException
  {
    this.a.startHandshake();
  }
  
  public final String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/jc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */