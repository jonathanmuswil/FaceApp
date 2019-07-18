package com.facebook.accountkit.internal;

import Sm;
import Vm;
import Vm.a;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import jn;

final class la
{
  private final WeakReference<sa> a;
  private final na b;
  
  la(sa paramsa, na paramna)
  {
    this.a = new WeakReference(paramsa);
    this.b = paramna;
  }
  
  private f a(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    va.a(localBundle, "credentials_type", d());
    va.a(localBundle, "update_request_code", this.b.f());
    localBundle.putAll(paramBundle);
    return new f(Sm.f(), paramString, localBundle, false, L.b);
  }
  
  private void a(Vm.a parama, O paramO)
  {
    b(new Vm(parama, paramO));
  }
  
  private void b(Vm paramVm)
  {
    this.b.a(paramVm);
    this.b.a(ta.e);
  }
  
  private String d()
  {
    return "phone_number";
  }
  
  private sa e()
  {
    sa localsa = (sa)this.a.get();
    if (localsa == null) {
      return null;
    }
    if (!localsa.e()) {
      return null;
    }
    return localsa;
  }
  
  na a()
  {
    return this.b;
  }
  
  public void a(Vm paramVm)
  {
    this.b.a(paramVm);
    this.b.a(ta.e);
    paramVm = e();
    if (paramVm != null) {
      paramVm.b();
    }
  }
  
  void a(String paramString)
  {
    ja localja = new ja(this);
    String str = this.b.d().toString();
    Bundle localBundle = new Bundle();
    va.a(localBundle, "phone_number", str);
    va.a(localBundle, "state", paramString);
    va.a(localBundle, "extras", "terms_of_service,privacy_policy");
    this.b.c(paramString);
    paramString = a("start_update", localBundle);
    j.a();
    j.d(f.a(paramString, localja));
  }
  
  public void b()
  {
    this.b.a(ta.d);
    j.a();
    j.d(null);
    sa localsa = e();
    if (localsa != null) {
      localsa.b();
    }
  }
  
  void c()
  {
    if (va.e(this.b.a())) {
      return;
    }
    ka localka = new ka(this);
    Object localObject = new Bundle();
    va.a((Bundle)localObject, "confirmation_code", this.b.a());
    va.a((Bundle)localObject, "phone_number", this.b.d().toString());
    localObject = a("confirm_update", (Bundle)localObject);
    j.a();
    j.d(f.a((f)localObject, localka));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */