package com.google.firebase.perf.network;

import Iv;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;
import vv;

public final class f<T>
  implements ResponseHandler<T>
{
  private final ResponseHandler<? extends T> a;
  private final Iv b;
  private final vv c;
  
  public f(ResponseHandler<? extends T> paramResponseHandler, Iv paramIv, vv paramvv)
  {
    this.a = paramResponseHandler;
    this.b = paramIv;
    this.c = paramvv;
  }
  
  public final T handleResponse(HttpResponse paramHttpResponse)
    throws IOException
  {
    this.c.e(this.b.n());
    this.c.b(paramHttpResponse.getStatusLine().getStatusCode());
    Object localObject = h.a(paramHttpResponse);
    if (localObject != null) {
      this.c.f(((Long)localObject).longValue());
    }
    localObject = h.a(paramHttpResponse);
    if (localObject != null) {
      this.c.c((String)localObject);
    }
    this.c.o();
    return (T)this.a.handleResponse(paramHttpResponse);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */