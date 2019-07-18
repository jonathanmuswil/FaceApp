package com.google.firebase.perf.network;

import AZa;
import BZa;
import DZa;
import Iv;
import YYa;
import ZYa;
import android.support.annotation.Keep;
import java.io.IOException;
import java.net.URL;
import pZa;
import rZa;
import vv;
import xZa;

public class FirebasePerfOkHttpClient
{
  static void a(BZa paramBZa, vv paramvv, long paramLong1, long paramLong2)
    throws IOException
  {
    Object localObject = paramBZa.k();
    if (localObject == null) {
      return;
    }
    paramvv.a(((xZa)localObject).g().p().toString());
    paramvv.b(((xZa)localObject).e());
    long l;
    if (((xZa)localObject).a() != null)
    {
      l = ((xZa)localObject).a().a();
      if (l != -1L) {
        paramvv.a(l);
      }
    }
    localObject = paramBZa.a();
    if (localObject != null)
    {
      l = ((DZa)localObject).c();
      if (l != -1L) {
        paramvv.f(l);
      }
      localObject = ((DZa)localObject).d();
      if (localObject != null) {
        paramvv.c(((rZa)localObject).toString());
      }
    }
    paramvv.b(paramBZa.c());
    paramvv.b(paramLong1);
    paramvv.e(paramLong2);
    paramvv.o();
  }
  
  @Keep
  public static void enqueue(YYa paramYYa, ZYa paramZYa)
  {
    Iv localIv = new Iv();
    long l = localIv.m();
    paramYYa.a(new g(paramZYa, com.google.firebase.perf.internal.h.a(), localIv, l));
  }
  
  @Keep
  public static BZa execute(YYa paramYYa)
    throws IOException
  {
    vv localvv = vv.a(com.google.firebase.perf.internal.h.a());
    Iv localIv = new Iv();
    long l = localIv.m();
    try
    {
      BZa localBZa = paramYYa.execute();
      a(localBZa, localvv, l, localIv.n());
      return localBZa;
    }
    catch (IOException localIOException)
    {
      xZa localxZa = paramYYa.N();
      if (localxZa != null)
      {
        paramYYa = localxZa.g();
        if (paramYYa != null) {
          localvv.a(paramYYa.p().toString());
        }
        if (localxZa.e() != null) {
          localvv.b(localxZa.e());
        }
      }
      localvv.b(l);
      localvv.e(localIv.n());
      h.a(localvv);
      throw localIOException;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/network/FirebasePerfOkHttpClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */