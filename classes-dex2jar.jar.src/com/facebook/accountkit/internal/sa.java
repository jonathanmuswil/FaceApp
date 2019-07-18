package com.facebook.accountkit.internal;

import Sm;
import Wm;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.g;
import jn;

final class sa
{
  private volatile la a;
  private volatile Activity b;
  private volatile boolean c = false;
  private final P d;
  private final g e;
  
  sa(P paramP, g paramg)
  {
    this.d = paramP;
    this.e = paramg;
  }
  
  private void a(na paramna)
  {
    va.a();
    this.a = new la(this, paramna);
    b(paramna);
  }
  
  private void b(na paramna)
  {
    
    if (this.a == null) {
      return;
    }
    int i = ra.a[paramna.e().ordinal()];
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3) {
          if (i != 4)
          {
            if (i == 5) {
              this.a.a(paramna.b());
            }
          }
          else {
            this.a.b();
          }
        }
      }
      else {
        this.a.c();
      }
    }
  }
  
  private na f()
  {
    if (this.a == null) {
      return null;
    }
    return this.a.a();
  }
  
  na a(jn paramjn, String paramString)
  {
    
    if (Sm.f() == null) {
      return null;
    }
    a();
    paramjn = new na(paramjn);
    la localla = new la(this, paramjn);
    localla.a(paramString);
    this.d.a("ak_update_start", paramjn);
    this.a = localla;
    return paramjn;
  }
  
  void a()
  {
    if (this.a != null) {
      this.a.b();
    }
  }
  
  void a(Activity paramActivity)
  {
    if (this.b != paramActivity) {
      return;
    }
    this.c = false;
    this.b = null;
    this.a = null;
    j.a();
    j.d(null);
  }
  
  void a(Activity paramActivity, Bundle paramBundle)
  {
    this.c = true;
    this.b = paramActivity;
    this.d.a(paramBundle);
    if (paramBundle != null)
    {
      paramActivity = (na)paramBundle.getParcelable("accountkitUpdateModel");
      if (paramActivity != null) {
        a(paramActivity);
      }
    }
  }
  
  void a(String paramString)
  {
    
    if (Sm.f() == null) {
      return;
    }
    na localna = f();
    if (localna == null) {
      return;
    }
    try
    {
      localna.a(paramString);
      b(localna);
      this.d.a("ak_update_verify", localna);
    }
    catch (Wm paramString)
    {
      if (va.g(c.f())) {
        break label64;
      }
    }
    this.d.a("ak_confirmation_code_set", localna);
    return;
    label64:
    throw paramString;
  }
  
  void b()
  {
    this.a = null;
  }
  
  void b(Activity paramActivity, Bundle paramBundle)
  {
    if (this.b != paramActivity) {
      return;
    }
    this.d.b(paramBundle);
    if (this.a != null) {
      paramBundle.putParcelable("accountkitUpdateModel", this.a.a());
    }
  }
  
  g c()
  {
    return this.e;
  }
  
  P d()
  {
    return this.d;
  }
  
  boolean e()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/sa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */