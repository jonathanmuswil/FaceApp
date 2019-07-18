package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.Ga;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.ia;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.ra;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.d.a;
import com.google.android.gms.common.internal.t;
import java.util.Collection;
import java.util.Collections;
import nP;
import oP;

public class e<O extends a.d>
{
  private final Context a;
  private final a<O> b;
  private final O c;
  private final Ga<O> d;
  private final Looper e;
  private final int f;
  private final f g;
  private final m h;
  protected final com.google.android.gms.common.api.internal.e i;
  
  protected e(Context paramContext, a<O> parama, Looper paramLooper)
  {
    t.a(paramContext, "Null context is not permitted.");
    t.a(parama, "Api must not be null.");
    t.a(paramLooper, "Looper must not be null.");
    this.a = paramContext.getApplicationContext();
    this.b = parama;
    this.c = null;
    this.e = paramLooper;
    this.d = Ga.a(parama);
    this.g = new ia(this);
    this.i = com.google.android.gms.common.api.internal.e.a(this.a);
    this.f = this.i.d();
    this.h = new com.google.android.gms.common.api.internal.a();
  }
  
  public e(Context paramContext, a<O> parama, O paramO, a parama1)
  {
    t.a(paramContext, "Null context is not permitted.");
    t.a(parama, "Api must not be null.");
    t.a(parama1, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
    this.a = paramContext.getApplicationContext();
    this.b = parama;
    this.c = paramO;
    this.e = parama1.c;
    this.d = Ga.a(this.b, this.c);
    this.g = new ia(this);
    this.i = com.google.android.gms.common.api.internal.e.a(this.a);
    this.f = this.i.d();
    this.h = parama1.b;
    this.i.a(this);
  }
  
  @Deprecated
  public e(Context paramContext, a<O> parama, O paramO, m paramm)
  {
    this(paramContext, parama, paramO, locala.a());
  }
  
  private final <A extends a.b, T extends c<? extends l, A>> T a(int paramInt, T paramT)
  {
    paramT.f();
    this.i.a(this, paramInt, paramT);
    return paramT;
  }
  
  private final <TResult, A extends a.b> nP<TResult> a(int paramInt, o<A, TResult> paramo)
  {
    oP localoP = new oP();
    this.i.a(this, paramInt, paramo, localoP, this.h);
    return localoP.a();
  }
  
  public a.f a(Looper paramLooper, com.google.android.gms.common.api.internal.e.a<O> parama)
  {
    d locald = b().a();
    return this.b.d().a(this.a, paramLooper, locald, this.c, parama, parama);
  }
  
  public f a()
  {
    return this.g;
  }
  
  public <A extends a.b, T extends c<? extends l, A>> T a(T paramT)
  {
    a(2, paramT);
    return paramT;
  }
  
  public ra a(Context paramContext, Handler paramHandler)
  {
    return new ra(paramContext, paramHandler, b().a());
  }
  
  public <TResult, A extends a.b> nP<TResult> a(o<A, TResult> paramo)
  {
    return a(1, paramo);
  }
  
  public <A extends a.b, T extends c<? extends l, A>> T b(T paramT)
  {
    a(0, paramT);
    return paramT;
  }
  
  protected d.a b()
  {
    d.a locala = new d.a();
    Object localObject = this.c;
    if ((localObject instanceof a.d.b))
    {
      localObject = ((a.d.b)localObject).a();
      if (localObject != null)
      {
        localObject = ((GoogleSignInAccount)localObject).y();
        break label69;
      }
    }
    localObject = this.c;
    if ((localObject instanceof a.d.a)) {
      localObject = ((a.d.a)localObject).B();
    } else {
      localObject = null;
    }
    label69:
    locala.a((Account)localObject);
    localObject = this.c;
    if ((localObject instanceof a.d.b))
    {
      localObject = ((a.d.b)localObject).a();
      if (localObject != null)
      {
        localObject = ((GoogleSignInAccount)localObject).G();
        break label113;
      }
    }
    localObject = Collections.emptySet();
    label113:
    locala.a((Collection)localObject);
    locala.a(this.a.getClass().getName());
    locala.b(this.a.getPackageName());
    return locala;
  }
  
  public final a<O> c()
  {
    return this.b;
  }
  
  public <A extends a.b, T extends c<? extends l, A>> T c(T paramT)
  {
    a(1, paramT);
    return paramT;
  }
  
  public Context d()
  {
    return this.a;
  }
  
  public final int e()
  {
    return this.f;
  }
  
  public Looper f()
  {
    return this.e;
  }
  
  public final Ga<O> g()
  {
    return this.d;
  }
  
  public static class a
  {
    public static final a a = new a().a();
    public final m b;
    public final Looper c;
    
    private a(m paramm, Account paramAccount, Looper paramLooper)
    {
      this.b = paramm;
      this.c = paramLooper;
    }
    
    public static class a
    {
      private m a;
      private Looper b;
      
      public a a(m paramm)
      {
        t.a(paramm, "StatusExceptionMapper must not be null.");
        this.a = paramm;
        return this;
      }
      
      public e.a a()
      {
        if (this.a == null) {
          this.a = new com.google.android.gms.common.api.internal.a();
        }
        if (this.b == null) {
          this.b = Looper.getMainLooper();
        }
        return new e.a(this.a, null, this.b, null);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */