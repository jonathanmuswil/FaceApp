package com.google.firebase.perf.network;

import Iv;
import Lv;
import android.support.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import vv;

public class FirebasePerfUrlConnection
{
  private static InputStream a(Lv paramLv, com.google.firebase.perf.internal.h paramh, Iv paramIv)
    throws IOException
  {
    paramIv.l();
    long l = paramIv.m();
    paramh = vv.a(paramh);
    try
    {
      Object localObject1 = paramLv.a();
      Object localObject2;
      if ((localObject1 instanceof HttpsURLConnection))
      {
        localObject2 = new com/google/firebase/perf/network/d;
        ((d)localObject2).<init>((HttpsURLConnection)localObject1, paramIv, paramh);
        return ((d)localObject2).getInputStream();
      }
      if ((localObject1 instanceof HttpURLConnection))
      {
        localObject2 = new com/google/firebase/perf/network/c;
        ((c)localObject2).<init>((HttpURLConnection)localObject1, paramIv, paramh);
        return ((c)localObject2).getInputStream();
      }
      localObject1 = ((URLConnection)localObject1).getInputStream();
      return (InputStream)localObject1;
    }
    catch (IOException localIOException)
    {
      paramh.b(l);
      paramh.e(paramIv.n());
      paramh.a(paramLv.toString());
      h.a(paramh);
      throw localIOException;
    }
  }
  
  private static Object a(Lv paramLv, Class[] paramArrayOfClass, com.google.firebase.perf.internal.h paramh, Iv paramIv)
    throws IOException
  {
    paramIv.l();
    long l = paramIv.m();
    paramh = vv.a(paramh);
    try
    {
      URLConnection localURLConnection = paramLv.a();
      Object localObject;
      if ((localURLConnection instanceof HttpsURLConnection))
      {
        localObject = new com/google/firebase/perf/network/d;
        ((d)localObject).<init>((HttpsURLConnection)localURLConnection, paramIv, paramh);
        return ((d)localObject).getContent(paramArrayOfClass);
      }
      if ((localURLConnection instanceof HttpURLConnection))
      {
        localObject = new com/google/firebase/perf/network/c;
        ((c)localObject).<init>((HttpURLConnection)localURLConnection, paramIv, paramh);
        return ((c)localObject).getContent(paramArrayOfClass);
      }
      paramArrayOfClass = localURLConnection.getContent(paramArrayOfClass);
      return paramArrayOfClass;
    }
    catch (IOException paramArrayOfClass)
    {
      paramh.b(l);
      paramh.e(paramIv.n());
      paramh.a(paramLv.toString());
      h.a(paramh);
      throw paramArrayOfClass;
    }
  }
  
  private static Object b(Lv paramLv, com.google.firebase.perf.internal.h paramh, Iv paramIv)
    throws IOException
  {
    paramIv.l();
    long l = paramIv.m();
    paramh = vv.a(paramh);
    try
    {
      Object localObject1 = paramLv.a();
      Object localObject2;
      if ((localObject1 instanceof HttpsURLConnection))
      {
        localObject2 = new com/google/firebase/perf/network/d;
        ((d)localObject2).<init>((HttpsURLConnection)localObject1, paramIv, paramh);
        return ((d)localObject2).getContent();
      }
      if ((localObject1 instanceof HttpURLConnection))
      {
        localObject2 = new com/google/firebase/perf/network/c;
        ((c)localObject2).<init>((HttpURLConnection)localObject1, paramIv, paramh);
        return ((c)localObject2).getContent();
      }
      localObject1 = ((URLConnection)localObject1).getContent();
      return localObject1;
    }
    catch (IOException localIOException)
    {
      paramh.b(l);
      paramh.e(paramIv.n());
      paramh.a(paramLv.toString());
      h.a(paramh);
      throw localIOException;
    }
  }
  
  @Keep
  public static Object getContent(URL paramURL)
    throws IOException
  {
    return b(new Lv(paramURL), com.google.firebase.perf.internal.h.a(), new Iv());
  }
  
  @Keep
  public static Object getContent(URL paramURL, Class[] paramArrayOfClass)
    throws IOException
  {
    return a(new Lv(paramURL), paramArrayOfClass, com.google.firebase.perf.internal.h.a(), new Iv());
  }
  
  @Keep
  public static Object instrument(Object paramObject)
    throws IOException
  {
    if ((paramObject instanceof HttpsURLConnection)) {
      return new d((HttpsURLConnection)paramObject, new Iv(), vv.a(com.google.firebase.perf.internal.h.a()));
    }
    if ((paramObject instanceof HttpURLConnection)) {
      return new c((HttpURLConnection)paramObject, new Iv(), vv.a(com.google.firebase.perf.internal.h.a()));
    }
    return paramObject;
  }
  
  @Keep
  public static InputStream openStream(URL paramURL)
    throws IOException
  {
    return a(new Lv(paramURL), com.google.firebase.perf.internal.h.a(), new Iv());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/FirebasePerfUrlConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */