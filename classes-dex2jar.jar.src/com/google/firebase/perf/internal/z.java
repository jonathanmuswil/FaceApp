package com.google.firebase.perf.internal;

import Aw;
import Mv;
import android.content.Context;
import android.provider.Settings.Secure;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import jw;
import pw;
import rw;
import wv;
import xw;
import yv;

public final class z
{
  private final long a;
  private boolean b = false;
  private B c = null;
  private B d = null;
  private final RemoteConfigManager e;
  
  private z(long paramLong1, long paramLong2, wv paramwv, long paramLong3, RemoteConfigManager paramRemoteConfigManager)
  {
    this.a = paramLong3;
    this.e = paramRemoteConfigManager;
    this.c = new B(100L, 500L, paramwv, paramRemoteConfigManager, A.b, this.b);
    this.d = new B(100L, 500L, paramwv, paramRemoteConfigManager, A.a, this.b);
  }
  
  public z(Context paramContext, long paramLong1, long paramLong2)
  {
    this(100L, 500L, new wv(), a(Settings.Secure.getString(paramContext.getContentResolver(), "android_id")), RemoteConfigManager.zzbz());
  }
  
  private static long a(String paramString)
  {
    int i;
    try
    {
      i = Mv.a(MessageDigest.getInstance("SHA-1").digest(paramString.getBytes()));
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      i = Mv.a(paramString.getBytes());
    }
    return (i % 100000000L + 100000000L) % 100000000L + 1L;
  }
  
  private static boolean a(List<rw> paramList)
  {
    return (paramList.size() > 0) && (((rw)paramList.get(0)).j() > 0) && (((rw)paramList.get(0)).b(0) == xw.b);
  }
  
  final void a(boolean paramBoolean)
  {
    this.c.a(paramBoolean);
    this.d.a(paramBoolean);
  }
  
  final boolean a(pw parampw)
  {
    long l;
    int i;
    if (parampw.l())
    {
      l = (this.e.zza("trace_sampling_rate", 100.0F) * 1000000.0F);
      if (this.a <= l) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i == 0) && (!a(parampw.m().m()))) {
        return false;
      }
    }
    if (parampw.n())
    {
      l = (this.e.zza("network_sampling_rate", 100.0F) * 1000000.0F);
      if (this.a <= l) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i == 0) && (!a(parampw.o().A()))) {
        return false;
      }
    }
    if (((parampw.l()) && ((parampw.m().k().equals(yv.e.toString())) || (parampw.m().k().equals(yv.f.toString()))) && (parampw.m().n() > 0)) || (parampw.p())) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0) {
      return true;
    }
    if (parampw.n()) {
      return this.d.a(parampw);
    }
    if (parampw.l()) {
      return this.c.a(parampw);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/perf/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */