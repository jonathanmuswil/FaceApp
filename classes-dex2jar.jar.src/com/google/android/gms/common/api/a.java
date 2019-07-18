package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.c.c;
import com.google.android.gms.common.internal.c.e;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class a<O extends d>
{
  private final a<?, O> a;
  private final i<?, O> b;
  private final g<?> c;
  private final j<?> d;
  private final String e;
  
  public <C extends f> a(String paramString, a<C, O> parama, g<C> paramg)
  {
    t.a(parama, "Cannot construct an Api with a null ClientBuilder");
    t.a(paramg, "Cannot construct an Api with a null ClientKey");
    this.e = paramString;
    this.a = parama;
    this.b = null;
    this.c = paramg;
    this.d = null;
  }
  
  public final c<?> a()
  {
    g localg = this.c;
    if (localg != null) {
      return localg;
    }
    throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
  }
  
  public final String b()
  {
    return this.e;
  }
  
  public final e<?, O> c()
  {
    return this.a;
  }
  
  public final a<?, O> d()
  {
    boolean bool;
    if (this.a != null) {
      bool = true;
    } else {
      bool = false;
    }
    t.b(bool, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
    return this.a;
  }
  
  public static abstract class a<T extends a.f, O>
    extends a.e<T, O>
  {
    public abstract T a(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.d paramd, O paramO, f.b paramb, f.c paramc);
  }
  
  public static abstract interface b {}
  
  public static class c<C extends a.b> {}
  
  public static abstract interface d
  {
    public static abstract interface a
      extends a.d.c, a.d.d
    {
      public abstract Account B();
    }
    
    public static abstract interface b
      extends a.d.c
    {
      public abstract GoogleSignInAccount a();
    }
    
    public static abstract interface c
      extends a.d
    {}
    
    public static abstract interface d
      extends a.d
    {}
    
    public static abstract interface e
      extends a.d.c, a.d.d
    {}
  }
  
  public static class e<T extends a.b, O>
  {
    public int a()
    {
      return Integer.MAX_VALUE;
    }
    
    public List<Scope> a(O paramO)
    {
      return Collections.emptyList();
    }
  }
  
  public static abstract interface f
    extends a.b
  {
    public abstract void a();
    
    public abstract void a(c.c paramc);
    
    public abstract void a(c.e parame);
    
    public abstract void a(m paramm, Set<Scope> paramSet);
    
    public abstract void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
    
    public abstract boolean b();
    
    public abstract boolean c();
    
    public abstract String d();
    
    public abstract boolean f();
    
    public abstract int g();
    
    public abstract com.google.android.gms.common.d[] h();
    
    public abstract Intent i();
    
    public abstract boolean isConnected();
    
    public abstract boolean j();
    
    public abstract IBinder k();
  }
  
  public static final class g<C extends a.f>
    extends a.c<C>
  {}
  
  public static abstract interface h<T extends IInterface>
    extends a.b
  {
    public abstract T a(IBinder paramIBinder);
    
    public abstract void a(int paramInt, T paramT);
    
    public abstract String l();
    
    public abstract String m();
  }
  
  public static class i<T extends a.h, O>
    extends a.e<T, O>
  {}
  
  public static final class j<C extends a.h>
    extends a.c<C>
  {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */