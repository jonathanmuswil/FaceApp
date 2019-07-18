package com.google.firebase.perf.internal;

import Kv;
import android.content.Context;
import android.util.Log;
import java.net.URI;
import jw;
import jw.c;

final class o
  extends u
{
  private final jw a;
  private final Context b;
  
  o(jw paramjw, Context paramContext)
  {
    this.b = paramContext;
    this.a = paramjw;
  }
  
  private static URI a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = URI.create(paramString);
      return paramString;
    }
    catch (IllegalStateException paramString) {}catch (IllegalArgumentException paramString) {}
    Log.w("FirebasePerformance", "getResultUrl throws exception", paramString);
    return null;
  }
  
  private static boolean a(long paramLong)
  {
    return paramLong >= 0L;
  }
  
  private static boolean b(long paramLong)
  {
    return paramLong >= 0L;
  }
  
  private static boolean b(String paramString)
  {
    if (paramString == null) {
      return true;
    }
    return paramString.trim().isEmpty();
  }
  
  public final boolean a()
  {
    if (b(this.a.j()))
    {
      localObject1 = String.valueOf(this.a.j());
      if (((String)localObject1).length() != 0) {
        localObject1 = "URL is missing:".concat((String)localObject1);
      } else {
        localObject1 = new String("URL is missing:");
      }
      Log.i("FirebasePerformance", (String)localObject1);
      return false;
    }
    Object localObject1 = a(this.a.j());
    if (localObject1 == null)
    {
      Log.i("FirebasePerformance", "URL cannot be parsed");
      return false;
    }
    Object localObject2 = this.b;
    boolean bool;
    if (localObject1 == null) {
      bool = false;
    } else {
      bool = Kv.a((URI)localObject1, (Context)localObject2);
    }
    if (!bool)
    {
      localObject1 = String.valueOf(localObject1);
      localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 26);
      ((StringBuilder)localObject2).append("URL fails whitelist rule: ");
      ((StringBuilder)localObject2).append((String)localObject1);
      Log.i("FirebasePerformance", ((StringBuilder)localObject2).toString());
      return false;
    }
    localObject2 = ((URI)localObject1).getHost();
    if ((localObject2 != null) && (!b((String)localObject2)) && (((String)localObject2).length() <= 255)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      Log.i("FirebasePerformance", "URL host is null or invalid");
      return false;
    }
    localObject2 = ((URI)localObject1).getScheme();
    if ((localObject2 != null) && (("http".equalsIgnoreCase((String)localObject2)) || ("https".equalsIgnoreCase((String)localObject2)))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      Log.i("FirebasePerformance", "URL scheme is null or invalid");
      return false;
    }
    if (((URI)localObject1).getUserInfo() == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      Log.i("FirebasePerformance", "URL user info is null");
      return false;
    }
    int i = ((URI)localObject1).getPort();
    if ((i != -1) && (i <= 0)) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0)
    {
      Log.i("FirebasePerformance", "URL port is less than or equal to 0");
      return false;
    }
    if (this.a.l()) {
      localObject1 = this.a.m();
    } else {
      localObject1 = null;
    }
    if ((localObject1 != null) && (localObject1 != jw.c.a)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      localObject1 = String.valueOf(this.a.m());
      localObject2 = new StringBuilder(String.valueOf(localObject1).length() + 32);
      ((StringBuilder)localObject2).append("HTTP Method is null or invalid: ");
      ((StringBuilder)localObject2).append((String)localObject1);
      Log.i("FirebasePerformance", ((StringBuilder)localObject2).toString());
      return false;
    }
    if (this.a.k())
    {
      if (this.a.r() > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        i = this.a.r();
        localObject1 = new StringBuilder(49);
        ((StringBuilder)localObject1).append("HTTP ResponseCode is a negative value:");
        ((StringBuilder)localObject1).append(i);
        Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
        return false;
      }
    }
    if ((this.a.n()) && (!b(this.a.o())))
    {
      l = this.a.o();
      localObject1 = new StringBuilder(56);
      ((StringBuilder)localObject1).append("Request Payload is a negative value:");
      ((StringBuilder)localObject1).append(l);
      Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
      return false;
    }
    if ((this.a.p()) && (!b(this.a.q())))
    {
      l = this.a.q();
      localObject1 = new StringBuilder(57);
      ((StringBuilder)localObject1).append("Response Payload is a negative value:");
      ((StringBuilder)localObject1).append(l);
      Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
      return false;
    }
    if ((this.a.s()) && (this.a.t() > 0L))
    {
      if ((this.a.u()) && (!a(this.a.v())))
      {
        l = this.a.v();
        localObject1 = new StringBuilder(69);
        ((StringBuilder)localObject1).append("Time to complete the request is a negative value:");
        ((StringBuilder)localObject1).append(l);
        Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
        return false;
      }
      if ((this.a.w()) && (!a(this.a.x())))
      {
        l = this.a.x();
        localObject1 = new StringBuilder(112);
        ((StringBuilder)localObject1).append("Time from the start of the request to the start of the response is null or a negative value:");
        ((StringBuilder)localObject1).append(l);
        Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
        return false;
      }
      if ((this.a.y()) && (this.a.z() > 0L))
      {
        if (!this.a.k())
        {
          Log.i("FirebasePerformance", "Did not receive a HTTP Response Code");
          return false;
        }
        return true;
      }
      l = this.a.z();
      localObject1 = new StringBuilder(108);
      ((StringBuilder)localObject1).append("Time from the start of the request to the end of the response is null, negative or zero:");
      ((StringBuilder)localObject1).append(l);
      Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
      return false;
    }
    long l = this.a.t();
    localObject1 = new StringBuilder(84);
    ((StringBuilder)localObject1).append("Start time of the request is null, or zero, or a negative value:");
    ((StringBuilder)localObject1).append(l);
    Log.i("FirebasePerformance", ((StringBuilder)localObject1).toString());
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */