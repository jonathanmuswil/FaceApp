package com.google.android.gms.common.api.internal;

import QO;
import UO;
import aP;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import cP;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.v;
import fP;
import java.util.Set;

public final class ra
  extends UO
  implements f.b, f.c
{
  private static a.a<? extends fP, QO> a = cP.c;
  private final Context b;
  private final Handler c;
  private final a.a<? extends fP, QO> d;
  private Set<Scope> e;
  private d f;
  private fP g;
  private ua h;
  
  public ra(Context paramContext, Handler paramHandler, d paramd)
  {
    this(paramContext, paramHandler, paramd, a);
  }
  
  public ra(Context paramContext, Handler paramHandler, d paramd, a.a<? extends fP, QO> parama)
  {
    this.b = paramContext;
    this.c = paramHandler;
    t.a(paramd, "ClientSettings must not be null");
    this.f = ((d)paramd);
    this.e = paramd.i();
    this.d = parama;
  }
  
  private final void b(aP paramaP)
  {
    Object localObject = paramaP.y();
    if (((b)localObject).C())
    {
      localObject = paramaP.z();
      paramaP = ((v)localObject).z();
      if (!paramaP.C())
      {
        String str = String.valueOf(paramaP);
        localObject = new StringBuilder(String.valueOf(str).length() + 48);
        ((StringBuilder)localObject).append("Sign-in succeeded with resolve account failure: ");
        ((StringBuilder)localObject).append(str);
        Log.wtf("SignInCoordinator", ((StringBuilder)localObject).toString(), new Exception());
        this.h.b(paramaP);
        this.g.a();
        return;
      }
      this.h.a(((v)localObject).y(), this.e);
    }
    else
    {
      this.h.b((b)localObject);
    }
    this.g.a();
  }
  
  public final fP a()
  {
    return this.g;
  }
  
  public final void a(aP paramaP)
  {
    this.c.post(new ta(this, paramaP));
  }
  
  public final void a(ua paramua)
  {
    Object localObject = this.g;
    if (localObject != null) {
      ((a.f)localObject).a();
    }
    this.f.a(Integer.valueOf(System.identityHashCode(this)));
    a.a locala = this.d;
    Context localContext = this.b;
    Looper localLooper = this.c.getLooper();
    localObject = this.f;
    this.g = ((fP)locala.a(localContext, localLooper, (d)localObject, ((d)localObject).j(), this, this));
    this.h = paramua;
    paramua = this.e;
    if ((paramua != null) && (!paramua.isEmpty()))
    {
      this.g.connect();
      return;
    }
    this.c.post(new sa(this));
  }
  
  public final void b()
  {
    fP localfP = this.g;
    if (localfP != null) {
      localfP.a();
    }
  }
  
  public final void onConnected(Bundle paramBundle)
  {
    this.g.a(this);
  }
  
  public final void onConnectionFailed(b paramb)
  {
    this.h.b(paramb);
  }
  
  public final void onConnectionSuspended(int paramInt)
  {
    this.g.a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */