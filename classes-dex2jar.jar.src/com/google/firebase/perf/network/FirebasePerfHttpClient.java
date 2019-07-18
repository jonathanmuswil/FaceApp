package com.google.firebase.perf.network;

import Iv;
import android.support.annotation.Keep;
import java.io.IOException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import vv;

public class FirebasePerfHttpClient
{
  private static <T> T a(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    vv localvv = vv.a(paramh);
    try
    {
      paramh = String.valueOf(paramHttpHost.toURI());
      String str = String.valueOf(paramHttpRequest.getRequestLine().getUri());
      if (str.length() != 0) {
        paramh = paramh.concat(str);
      } else {
        paramh = new String(paramh);
      }
      localvv.a(paramh);
      localvv.b(paramHttpRequest.getRequestLine().getMethod());
      paramh = h.a(paramHttpRequest);
      if (paramh != null) {
        localvv.a(paramh.longValue());
      }
      paramIv.l();
      localvv.b(paramIv.m());
      paramh = new com/google/firebase/perf/network/f;
      paramh.<init>(paramResponseHandler, paramIv, localvv);
      paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest, paramh);
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      localvv.e(paramIv.n());
      h.a(localvv);
      throw paramHttpClient;
    }
  }
  
  private static <T> T a(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler, HttpContext paramHttpContext, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    vv localvv = vv.a(paramh);
    try
    {
      paramh = String.valueOf(paramHttpHost.toURI());
      String str = String.valueOf(paramHttpRequest.getRequestLine().getUri());
      if (str.length() != 0) {
        paramh = paramh.concat(str);
      } else {
        paramh = new String(paramh);
      }
      localvv.a(paramh);
      localvv.b(paramHttpRequest.getRequestLine().getMethod());
      paramh = h.a(paramHttpRequest);
      if (paramh != null) {
        localvv.a(paramh.longValue());
      }
      paramIv.l();
      localvv.b(paramIv.m());
      paramh = new com/google/firebase/perf/network/f;
      paramh.<init>(paramResponseHandler, paramIv, localvv);
      paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest, paramh, paramHttpContext);
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      localvv.e(paramIv.n());
      h.a(localvv);
      throw paramHttpClient;
    }
  }
  
  private static <T> T a(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler<T> paramResponseHandler, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    paramh = vv.a(paramh);
    try
    {
      paramh.a(paramHttpUriRequest.getURI().toString());
      paramh.b(paramHttpUriRequest.getMethod());
      Object localObject = h.a(paramHttpUriRequest);
      if (localObject != null) {
        paramh.a(((Long)localObject).longValue());
      }
      paramIv.l();
      paramh.b(paramIv.m());
      localObject = new com/google/firebase/perf/network/f;
      ((f)localObject).<init>(paramResponseHandler, paramIv, paramh);
      paramHttpClient = paramHttpClient.execute(paramHttpUriRequest, (ResponseHandler)localObject);
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      paramh.e(paramIv.n());
      h.a(paramh);
      throw paramHttpClient;
    }
  }
  
  private static <T> T a(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler<T> paramResponseHandler, HttpContext paramHttpContext, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    paramh = vv.a(paramh);
    try
    {
      paramh.a(paramHttpUriRequest.getURI().toString());
      paramh.b(paramHttpUriRequest.getMethod());
      Object localObject = h.a(paramHttpUriRequest);
      if (localObject != null) {
        paramh.a(((Long)localObject).longValue());
      }
      paramIv.l();
      paramh.b(paramIv.m());
      localObject = new com/google/firebase/perf/network/f;
      ((f)localObject).<init>(paramResponseHandler, paramIv, paramh);
      paramHttpClient = paramHttpClient.execute(paramHttpUriRequest, (ResponseHandler)localObject, paramHttpContext);
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      paramh.e(paramIv.n());
      h.a(paramh);
      throw paramHttpClient;
    }
  }
  
  private static HttpResponse a(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    vv localvv = vv.a(paramh);
    try
    {
      paramh = String.valueOf(paramHttpHost.toURI());
      String str = String.valueOf(paramHttpRequest.getRequestLine().getUri());
      if (str.length() != 0) {
        paramh = paramh.concat(str);
      } else {
        paramh = new String(paramh);
      }
      localvv.a(paramh);
      localvv.b(paramHttpRequest.getRequestLine().getMethod());
      paramh = h.a(paramHttpRequest);
      if (paramh != null) {
        localvv.a(paramh.longValue());
      }
      paramIv.l();
      localvv.b(paramIv.m());
      paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest);
      localvv.e(paramIv.n());
      localvv.b(paramHttpClient.getStatusLine().getStatusCode());
      paramHttpHost = h.a(paramHttpClient);
      if (paramHttpHost != null) {
        localvv.f(paramHttpHost.longValue());
      }
      paramHttpHost = h.a(paramHttpClient);
      if (paramHttpHost != null) {
        localvv.c(paramHttpHost);
      }
      localvv.o();
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      localvv.e(paramIv.n());
      h.a(localvv);
      throw paramHttpClient;
    }
  }
  
  private static HttpResponse a(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    vv localvv = vv.a(paramh);
    try
    {
      paramh = String.valueOf(paramHttpHost.toURI());
      String str = String.valueOf(paramHttpRequest.getRequestLine().getUri());
      if (str.length() != 0) {
        paramh = paramh.concat(str);
      } else {
        paramh = new String(paramh);
      }
      localvv.a(paramh);
      localvv.b(paramHttpRequest.getRequestLine().getMethod());
      paramh = h.a(paramHttpRequest);
      if (paramh != null) {
        localvv.a(paramh.longValue());
      }
      paramIv.l();
      localvv.b(paramIv.m());
      paramHttpClient = paramHttpClient.execute(paramHttpHost, paramHttpRequest, paramHttpContext);
      localvv.e(paramIv.n());
      localvv.b(paramHttpClient.getStatusLine().getStatusCode());
      paramHttpHost = h.a(paramHttpClient);
      if (paramHttpHost != null) {
        localvv.f(paramHttpHost.longValue());
      }
      paramHttpHost = h.a(paramHttpClient);
      if (paramHttpHost != null) {
        localvv.c(paramHttpHost);
      }
      localvv.o();
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      localvv.e(paramIv.n());
      h.a(localvv);
      throw paramHttpClient;
    }
  }
  
  private static HttpResponse a(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    paramh = vv.a(paramh);
    try
    {
      paramh.a(paramHttpUriRequest.getURI().toString());
      paramh.b(paramHttpUriRequest.getMethod());
      Long localLong = h.a(paramHttpUriRequest);
      if (localLong != null) {
        paramh.a(localLong.longValue());
      }
      paramIv.l();
      paramh.b(paramIv.m());
      paramHttpClient = paramHttpClient.execute(paramHttpUriRequest);
      paramh.e(paramIv.n());
      paramh.b(paramHttpClient.getStatusLine().getStatusCode());
      paramHttpUriRequest = h.a(paramHttpClient);
      if (paramHttpUriRequest != null) {
        paramh.f(paramHttpUriRequest.longValue());
      }
      paramHttpUriRequest = h.a(paramHttpClient);
      if (paramHttpUriRequest != null) {
        paramh.c(paramHttpUriRequest);
      }
      paramh.o();
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      paramh.e(paramIv.n());
      h.a(paramh);
      throw paramHttpClient;
    }
  }
  
  private static HttpResponse a(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext, Iv paramIv, com.google.firebase.perf.internal.h paramh)
    throws IOException
  {
    paramh = vv.a(paramh);
    try
    {
      paramh.a(paramHttpUriRequest.getURI().toString());
      paramh.b(paramHttpUriRequest.getMethod());
      Long localLong = h.a(paramHttpUriRequest);
      if (localLong != null) {
        paramh.a(localLong.longValue());
      }
      paramIv.l();
      paramh.b(paramIv.m());
      paramHttpClient = paramHttpClient.execute(paramHttpUriRequest, paramHttpContext);
      paramh.e(paramIv.n());
      paramh.b(paramHttpClient.getStatusLine().getStatusCode());
      paramHttpUriRequest = h.a(paramHttpClient);
      if (paramHttpUriRequest != null) {
        paramh.f(paramHttpUriRequest.longValue());
      }
      paramHttpUriRequest = h.a(paramHttpClient);
      if (paramHttpUriRequest != null) {
        paramh.c(paramHttpUriRequest);
      }
      paramh.o();
      return paramHttpClient;
    }
    catch (IOException paramHttpClient)
    {
      paramh.e(paramIv.n());
      h.a(paramh);
      throw paramHttpClient;
    }
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler)
    throws IOException
  {
    return (T)a(paramHttpClient, paramHttpHost, paramHttpRequest, paramResponseHandler, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler<? extends T> paramResponseHandler, HttpContext paramHttpContext)
    throws IOException
  {
    return (T)a(paramHttpClient, paramHttpHost, paramHttpRequest, paramResponseHandler, paramHttpContext, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler<T> paramResponseHandler)
    throws IOException
  {
    return (T)a(paramHttpClient, paramHttpUriRequest, paramResponseHandler, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static <T> T execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, ResponseHandler<T> paramResponseHandler, HttpContext paramHttpContext)
    throws IOException
  {
    return (T)a(paramHttpClient, paramHttpUriRequest, paramResponseHandler, paramHttpContext, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest)
    throws IOException
  {
    return a(paramHttpClient, paramHttpHost, paramHttpRequest, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext)
    throws IOException
  {
    return a(paramHttpClient, paramHttpHost, paramHttpRequest, paramHttpContext, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest)
    throws IOException
  {
    return a(paramHttpClient, paramHttpUriRequest, new Iv(), com.google.firebase.perf.internal.h.a());
  }
  
  @Keep
  public static HttpResponse execute(HttpClient paramHttpClient, HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext)
    throws IOException
  {
    return a(paramHttpClient, paramHttpUriRequest, paramHttpContext, new Iv(), com.google.firebase.perf.internal.h.a());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/FirebasePerfHttpClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */