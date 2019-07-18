package com.google.firebase.perf.network;

import android.util.Log;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import vv;

public final class h
{
  public static Long a(HttpMessage paramHttpMessage)
  {
    try
    {
      paramHttpMessage = paramHttpMessage.getFirstHeader("content-length");
      if (paramHttpMessage != null)
      {
        long l = Long.parseLong(paramHttpMessage.getValue());
        return Long.valueOf(l);
      }
    }
    catch (NumberFormatException paramHttpMessage)
    {
      Log.d("FirebasePerformance", "The content-length value is not a valid number");
    }
    return null;
  }
  
  public static String a(HttpResponse paramHttpResponse)
  {
    paramHttpResponse = paramHttpResponse.getFirstHeader("content-type");
    if (paramHttpResponse != null)
    {
      paramHttpResponse = paramHttpResponse.getValue();
      if (paramHttpResponse != null) {
        return paramHttpResponse;
      }
    }
    return null;
  }
  
  public static void a(vv paramvv)
  {
    if (!paramvv.l()) {
      paramvv.n();
    }
    paramvv.o();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */