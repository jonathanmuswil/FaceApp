package com.facebook.accountkit.internal;

import android.os.Bundle;

class y
  implements Runnable
{
  y(A paramA, C paramC, f.a parama, String paramString) {}
  
  private boolean a()
  {
    W localW = this.d.d();
    boolean bool;
    if ((localW != null) && (this.c.equals(localW.h())) && (localW.m())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void run()
  {
    
    if (!a()) {
      return;
    }
    Object localObject = new Bundle();
    va.a((Bundle)localObject, "email", this.a.m());
    localObject = this.d.a("poll_login", (Bundle)localObject);
    j.a();
    j.d(f.a((f)localObject, new x(this)));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */