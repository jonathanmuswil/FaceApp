package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w;

public abstract class c<R extends l, A extends a.b>
  extends BasePendingResult<R>
  implements d<R>
{
  private final a.c<A> q;
  private final a<?> r;
  
  protected c(a<?> parama, f paramf)
  {
    super((f)paramf);
    t.a(parama, "Api must not be null");
    this.q = parama.a();
    this.r = parama;
  }
  
  private void a(RemoteException paramRemoteException)
  {
    c(new Status(8, paramRemoteException.getLocalizedMessage(), null));
  }
  
  protected abstract void a(A paramA)
    throws RemoteException;
  
  public final void b(A paramA)
    throws DeadObjectException
  {
    Object localObject = paramA;
    if ((paramA instanceof w)) {
      localObject = ((w)paramA).B();
    }
    try
    {
      a((a.b)localObject);
      return;
    }
    catch (RemoteException paramA)
    {
      a(paramA);
      return;
    }
    catch (DeadObjectException paramA)
    {
      a(paramA);
      throw paramA;
    }
  }
  
  public final void c(Status paramStatus)
  {
    t.a(paramStatus.B() ^ true, "Failed result must not be success");
    paramStatus = a(paramStatus);
    a(paramStatus);
    c(paramStatus);
  }
  
  protected void c(R paramR) {}
  
  public final a<?> g()
  {
    return this.r;
  }
  
  public final a.c<A> h()
  {
    return this.q;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */