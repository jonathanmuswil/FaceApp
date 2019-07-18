package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;

public final class ui
  extends td
{
  private final kj a = null;
  private final SSLSocketFactory b = null;
  
  public ui()
  {
    this(null);
  }
  
  private ui(kj paramkj)
  {
    this(null, null);
  }
  
  private ui(kj paramkj, SSLSocketFactory paramSSLSocketFactory) {}
  
  private static List<FX> a(Map<String, List<String>> paramMap)
  {
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      paramMap = (Map.Entry)localIterator1.next();
      if (paramMap.getKey() != null)
      {
        Iterator localIterator2 = ((List)paramMap.getValue()).iterator();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          localArrayList.add(new FX((String)paramMap.getKey(), str));
        }
      }
    }
    return localArrayList;
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, Iaa<?> paramIaa)
    throws IOException, a
  {
    byte[] arrayOfByte = paramIaa.h();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      if (!paramHttpURLConnection.getRequestProperties().containsKey("Content-Type"))
      {
        if ("UTF-8".length() != 0) {
          paramIaa = "application/x-www-form-urlencoded; charset=".concat("UTF-8");
        } else {
          paramIaa = new String("application/x-www-form-urlencoded; charset=");
        }
        paramHttpURLConnection.setRequestProperty("Content-Type", paramIaa);
      }
      paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      paramHttpURLConnection.write(arrayOfByte);
      paramHttpURLConnection.close();
    }
  }
  
  private static InputStream b(HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      InputStream localInputStream = paramHttpURLConnection.getInputStream();
      paramHttpURLConnection = localInputStream;
    }
    catch (IOException localIOException)
    {
      paramHttpURLConnection = paramHttpURLConnection.getErrorStream();
    }
    return paramHttpURLConnection;
  }
  
  public final th b(Iaa<?> paramIaa, Map<String, String> paramMap)
    throws IOException, a
  {
    Object localObject = paramIaa.c();
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramMap);
    localHashMap.putAll(paramIaa.a());
    paramMap = this.a;
    String str;
    if (paramMap != null)
    {
      str = paramMap.a((String)localObject);
      paramMap = str;
      if (str == null)
      {
        paramIaa = String.valueOf(localObject);
        if (paramIaa.length() != 0) {
          paramIaa = "URL blocked by rewriter: ".concat(paramIaa);
        } else {
          paramIaa = new String("URL blocked by rewriter: ");
        }
        throw new IOException(paramIaa);
      }
    }
    else
    {
      paramMap = (Map<String, String>)localObject;
    }
    localObject = new URL(paramMap);
    paramMap = (HttpURLConnection)((URL)localObject).openConnection();
    paramMap.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
    int i = paramIaa.j();
    paramMap.setConnectTimeout(i);
    paramMap.setReadTimeout(i);
    int j = 0;
    paramMap.setUseCaches(false);
    paramMap.setDoInput(true);
    "https".equals(((URL)localObject).getProtocol());
    try
    {
      localObject = localHashMap.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        str = (String)((Iterator)localObject).next();
        paramMap.setRequestProperty(str, (String)localHashMap.get(str));
      }
      switch (paramIaa.b())
      {
      default: 
        paramIaa = new java/lang/IllegalStateException;
        break;
      case 7: 
        paramMap.setRequestMethod("PATCH");
        a(paramMap, paramIaa);
        break;
      case 6: 
        paramMap.setRequestMethod("TRACE");
        break;
      case 5: 
        paramMap.setRequestMethod("OPTIONS");
        break;
      case 4: 
        paramMap.setRequestMethod("HEAD");
        break;
      case 3: 
        paramMap.setRequestMethod("DELETE");
        break;
      case 2: 
        paramMap.setRequestMethod("PUT");
        a(paramMap, paramIaa);
        break;
      case 1: 
        paramMap.setRequestMethod("POST");
        a(paramMap, paramIaa);
        break;
      case 0: 
        paramMap.setRequestMethod("GET");
      }
      int k = paramMap.getResponseCode();
      if (k != -1)
      {
        if ((paramIaa.b() != 4) && ((100 > k) || (k >= 200)) && (k != 204) && (k != 304)) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0)
        {
          paramIaa = new th(k, a(paramMap.getHeaderFields()));
          paramMap.disconnect();
          return paramIaa;
        }
        try
        {
          paramIaa = a(paramMap.getHeaderFields());
          i = paramMap.getContentLength();
          localObject = new com/google/android/gms/internal/ads/Ti;
          ((Ti)localObject).<init>(paramMap);
          paramIaa = new th(k, paramIaa, i, (InputStream)localObject);
          return paramIaa;
        }
        finally
        {
          i = 1;
          break label520;
        }
      }
      paramIaa = new java/io/IOException;
      paramIaa.<init>("Could not retrieve response code from HttpUrlConnection.");
      throw paramIaa;
      paramIaa.<init>("Unknown method type.");
      throw paramIaa;
    }
    finally
    {
      i = j;
      label520:
      if (i == 0) {
        paramMap.disconnect();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */