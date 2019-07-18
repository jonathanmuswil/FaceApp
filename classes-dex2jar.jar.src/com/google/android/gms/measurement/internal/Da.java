package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.i;
import com.google.android.gms.common.j;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class da
  extends o
{
  private final Xb a;
  private Boolean b;
  private String c;
  
  public da(Xb paramXb)
  {
    this(paramXb, null);
  }
  
  private da(Xb paramXb, String paramString)
  {
    com.google.android.gms.common.internal.t.a(paramXb);
    this.a = paramXb;
    this.c = null;
  }
  
  private final void a(Runnable paramRunnable)
  {
    com.google.android.gms.common.internal.t.a(paramRunnable);
    if ((((Boolean)m.ha.a(null)).booleanValue()) && (this.a.n().s()))
    {
      paramRunnable.run();
      return;
    }
    this.a.n().a(paramRunnable);
  }
  
  private final void a(String paramString, boolean paramBoolean)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      if (paramBoolean) {}
      try
      {
        if (this.b == null)
        {
          if ((!"com.google.android.gms".equals(this.c)) && (!r.a(this.a.getContext(), Binder.getCallingUid())) && (!j.a(this.a.getContext()).a(Binder.getCallingUid()))) {
            paramBoolean = false;
          } else {
            paramBoolean = true;
          }
          this.b = Boolean.valueOf(paramBoolean);
        }
        if (!this.b.booleanValue())
        {
          if ((this.c == null) && (i.uidHasPackageName(this.a.getContext(), Binder.getCallingUid(), paramString))) {
            this.c = paramString;
          }
          if (!paramString.equals(this.c)) {}
        }
        else
        {
          return;
        }
        SecurityException localSecurityException1 = new java/lang/SecurityException;
        localSecurityException1.<init>(String.format("Unknown calling package name '%s'.", new Object[] { paramString }));
        throw localSecurityException1;
      }
      catch (SecurityException localSecurityException2)
      {
        this.a.c().s().a("Measurement Service called with invalid calling package. appId", v.a(paramString));
        throw localSecurityException2;
      }
    }
    this.a.c().s().a("Measurement Service called without app package");
    throw new SecurityException("Measurement Service called without app package");
  }
  
  private final void b(pc parampc, boolean paramBoolean)
  {
    com.google.android.gms.common.internal.t.a(parampc);
    a(parampc.a, false);
    this.a.f().c(parampc.b, parampc.r);
  }
  
  public final List<ec> a(pc parampc, boolean paramBoolean)
  {
    b(parampc, false);
    Object localObject1 = this.a.n().a(new ta(this, parampc));
    try
    {
      Object localObject2 = (List)((Future)localObject1).get();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(((List)localObject2).size());
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        gc localgc = (gc)((Iterator)localObject2).next();
        if ((paramBoolean) || (!hc.e(localgc.c)))
        {
          ec localec = new com/google/android/gms/measurement/internal/ec;
          localec.<init>(localgc);
          ((List)localObject1).add(localec);
        }
      }
      return (List<ec>)localObject1;
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    this.a.c().s().a("Failed to get user attributes. appId", v.a(parampc.a), localInterruptedException);
    return null;
  }
  
  public final List<uc> a(String paramString1, String paramString2, pc parampc)
  {
    b(parampc, false);
    paramString1 = this.a.n().a(new la(this, parampc, paramString1, paramString2));
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    this.a.c().s().a("Failed to get conditional user properties", paramString1);
    return Collections.emptyList();
  }
  
  public final List<uc> a(String paramString1, String paramString2, String paramString3)
  {
    a(paramString1, true);
    paramString1 = this.a.n().a(new ma(this, paramString1, paramString2, paramString3));
    try
    {
      paramString1 = (List)paramString1.get();
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    this.a.c().s().a("Failed to get conditional user properties", paramString1);
    return Collections.emptyList();
  }
  
  public final List<ec> a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    a(paramString1, true);
    paramString2 = this.a.n().a(new ka(this, paramString1, paramString2, paramString3));
    try
    {
      paramString3 = (List)paramString2.get();
      paramString2 = new java/util/ArrayList;
      paramString2.<init>(paramString3.size());
      paramString3 = paramString3.iterator();
      while (paramString3.hasNext())
      {
        gc localgc = (gc)paramString3.next();
        if ((paramBoolean) || (!hc.e(localgc.c)))
        {
          ec localec = new com/google/android/gms/measurement/internal/ec;
          localec.<init>(localgc);
          paramString2.add(localec);
        }
      }
      return paramString2;
    }
    catch (ExecutionException paramString2) {}catch (InterruptedException paramString2) {}
    this.a.c().s().a("Failed to get user attributes. appId", v.a(paramString1), paramString2);
    return Collections.emptyList();
  }
  
  public final List<ec> a(String paramString1, String paramString2, boolean paramBoolean, pc parampc)
  {
    b(parampc, false);
    paramString1 = this.a.n().a(new ja(this, parampc, paramString1, paramString2));
    try
    {
      paramString2 = (List)paramString1.get();
      paramString1 = new java/util/ArrayList;
      paramString1.<init>(paramString2.size());
      paramString2 = paramString2.iterator();
      while (paramString2.hasNext())
      {
        gc localgc = (gc)paramString2.next();
        if ((paramBoolean) || (!hc.e(localgc.c)))
        {
          ec localec = new com/google/android/gms/measurement/internal/ec;
          localec.<init>(localgc);
          paramString1.add(localec);
        }
      }
      return paramString1;
    }
    catch (ExecutionException paramString1) {}catch (InterruptedException paramString1) {}
    this.a.c().s().a("Failed to get user attributes. appId", v.a(parampc.a), paramString1);
    return Collections.emptyList();
  }
  
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    a(new va(this, paramString2, paramString3, paramString1, paramLong));
  }
  
  public final void a(ec paramec, pc parampc)
  {
    com.google.android.gms.common.internal.t.a(paramec);
    b(parampc, false);
    if (paramec.y() == null)
    {
      a(new ra(this, paramec, parampc));
      return;
    }
    a(new sa(this, paramec, parampc));
  }
  
  public final void a(k paramk, pc parampc)
  {
    com.google.android.gms.common.internal.t.a(paramk);
    b(parampc, false);
    a(new oa(this, paramk, parampc));
  }
  
  public final void a(k paramk, String paramString1, String paramString2)
  {
    com.google.android.gms.common.internal.t.a(paramk);
    com.google.android.gms.common.internal.t.b(paramString1);
    a(paramString1, true);
    a(new pa(this, paramk, paramString1));
  }
  
  public final void a(pc parampc)
  {
    a(parampc.a, false);
    a(new na(this, parampc));
  }
  
  public final void a(uc paramuc)
  {
    com.google.android.gms.common.internal.t.a(paramuc);
    com.google.android.gms.common.internal.t.a(paramuc.c);
    a(paramuc.a, true);
    uc localuc = new uc(paramuc);
    if (paramuc.c.y() == null)
    {
      a(new ha(this, localuc));
      return;
    }
    a(new ia(this, localuc));
  }
  
  public final void a(uc paramuc, pc parampc)
  {
    com.google.android.gms.common.internal.t.a(paramuc);
    com.google.android.gms.common.internal.t.a(paramuc.c);
    b(parampc, false);
    uc localuc = new uc(paramuc);
    localuc.a = parampc.a;
    if (paramuc.c.y() == null)
    {
      a(new fa(this, localuc, parampc));
      return;
    }
    a(new ga(this, localuc, parampc));
  }
  
  public final byte[] a(k paramk, String paramString)
  {
    com.google.android.gms.common.internal.t.b(paramString);
    com.google.android.gms.common.internal.t.a(paramk);
    a(paramString, true);
    this.a.c().z().a("Log and bundle. event", this.a.e().a(paramk.a));
    long l1 = this.a.b().c() / 1000000L;
    Object localObject = this.a.n().b(new qa(this, paramk, paramString));
    try
    {
      byte[] arrayOfByte = (byte[])((Future)localObject).get();
      localObject = arrayOfByte;
      if (arrayOfByte == null)
      {
        this.a.c().s().a("Log and bundle returned null. appId", v.a(paramString));
        localObject = new byte[0];
      }
      long l2 = this.a.b().c() / 1000000L;
      this.a.c().z().a("Log and bundle processed. event, size, time_ms", this.a.e().a(paramk.a), Integer.valueOf(localObject.length), Long.valueOf(l2 - l1));
      return (byte[])localObject;
    }
    catch (ExecutionException localExecutionException) {}catch (InterruptedException localInterruptedException) {}
    this.a.c().s().a("Failed to log and bundle. appId, event, error", v.a(paramString), this.a.e().a(paramk.a), localInterruptedException);
    return null;
  }
  
  final k b(k paramk, pc parampc)
  {
    boolean bool = "_cmp".equals(paramk.a);
    int i = 0;
    int j = i;
    if (bool)
    {
      Object localObject = paramk.b;
      j = i;
      if (localObject != null) {
        if (((h)localObject).size() == 0)
        {
          j = i;
        }
        else
        {
          localObject = paramk.b.d("_cis");
          j = i;
          if (!TextUtils.isEmpty((CharSequence)localObject)) {
            if (!"referrer broadcast".equals(localObject))
            {
              j = i;
              if (!"referrer API".equals(localObject)) {}
            }
            else
            {
              j = i;
              if (this.a.g().r(parampc.a)) {
                j = 1;
              }
            }
          }
        }
      }
    }
    if (j != 0)
    {
      this.a.c().y().a("Event has been filtered ", paramk.toString());
      return new k("_cmpx", paramk.b, paramk.c, paramk.d);
    }
    return paramk;
  }
  
  public final void b(pc parampc)
  {
    b(parampc, false);
    a(new ea(this, parampc));
  }
  
  public final String c(pc parampc)
  {
    b(parampc, false);
    return this.a.d(parampc);
  }
  
  public final void d(pc parampc)
  {
    b(parampc, false);
    a(new ua(this, parampc));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */