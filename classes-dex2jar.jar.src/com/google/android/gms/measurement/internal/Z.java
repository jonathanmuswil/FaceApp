package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class z
  extends Wb
{
  private final SSLSocketFactory d;
  
  public z(Xb paramXb)
  {
    super(paramXb);
    if (Build.VERSION.SDK_INT < 19) {
      paramXb = new ic();
    } else {
      paramXb = null;
    }
    this.d = paramXb;
  }
  
  private static byte[] a(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localObject = arrayOfByte;
      localByteArrayOutputStream.<init>();
      localObject = arrayOfByte;
      paramHttpURLConnection = paramHttpURLConnection.getInputStream();
      localObject = paramHttpURLConnection;
      arrayOfByte = new byte['Ѐ'];
      for (;;)
      {
        localObject = paramHttpURLConnection;
        int i = paramHttpURLConnection.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localObject = paramHttpURLConnection;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      localObject = paramHttpURLConnection;
      arrayOfByte = localByteArrayOutputStream.toByteArray();
      if (paramHttpURLConnection != null) {
        paramHttpURLConnection.close();
      }
      return arrayOfByte;
    }
    finally
    {
      if (localObject != null) {
        ((InputStream)localObject).close();
      }
    }
  }
  
  protected final HttpURLConnection a(URL paramURL)
    throws IOException
  {
    URLConnection localURLConnection = paramURL.openConnection();
    if ((localURLConnection instanceof HttpURLConnection))
    {
      paramURL = this.d;
      if ((paramURL != null) && ((localURLConnection instanceof HttpsURLConnection))) {
        ((HttpsURLConnection)localURLConnection).setSSLSocketFactory(paramURL);
      }
      paramURL = (HttpURLConnection)localURLConnection;
      paramURL.setDefaultUseCaches(false);
      paramURL.setConnectTimeout(60000);
      paramURL.setReadTimeout(61000);
      paramURL.setInstanceFollowRedirects(false);
      paramURL.setDoInput(true);
      return paramURL;
    }
    throw new IOException("Failed to obtain HTTP connection");
  }
  
  protected final boolean t()
  {
    return false;
  }
  
  public final boolean u()
  {
    r();
    Object localObject1 = (ConnectivityManager)getContext().getSystemService("connectivity");
    Object localObject2;
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      localObject2 = null;
    }
    return (localObject2 != null) && (((NetworkInfo)localObject2).isConnected());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */