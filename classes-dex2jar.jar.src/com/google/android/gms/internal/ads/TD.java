package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class td
  implements Uh
{
  @Deprecated
  public final HttpResponse a(Iaa<?> paramIaa, Map<String, String> paramMap)
    throws IOException, a
  {
    paramIaa = b(paramIaa, paramMap);
    paramMap = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), paramIaa.c(), ""));
    Object localObject1 = new ArrayList();
    Iterator localIterator = paramIaa.d().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (FX)localIterator.next();
      ((List)localObject1).add(new BasicHeader(((FX)localObject2).a(), ((FX)localObject2).b()));
    }
    paramMap.setHeaders((Header[])((List)localObject1).toArray(new Header[((List)localObject1).size()]));
    Object localObject2 = paramIaa.a();
    if (localObject2 != null)
    {
      localObject1 = new BasicHttpEntity();
      ((BasicHttpEntity)localObject1).setContent((InputStream)localObject2);
      ((BasicHttpEntity)localObject1).setContentLength(paramIaa.b());
      paramMap.setEntity((HttpEntity)localObject1);
    }
    return paramMap;
  }
  
  public abstract th b(Iaa<?> paramIaa, Map<String, String> paramMap)
    throws IOException, a;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/td.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */