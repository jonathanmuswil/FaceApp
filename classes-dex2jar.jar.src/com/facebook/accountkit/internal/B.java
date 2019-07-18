package com.facebook.accountkit.internal;

import Rm;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.g;

final class b
{
  private final a a;
  private Rm b;
  private final g c;
  
  b(Context paramContext, g paramg)
  {
    this(new a(paramContext), paramg);
  }
  
  b(a parama, g paramg)
  {
    this.a = parama;
    this.c = paramg;
  }
  
  private void a(Rm paramRm1, Rm paramRm2)
  {
    Intent localIntent = new Intent("com.facebook.accountkit.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
    localIntent.putExtra("com.facebook.accountkit.sdk.EXTRA_OLD_ACCESS_TOKEN", paramRm1);
    localIntent.putExtra("com.facebook.accountkit.sdk.EXTRA_NEW_ACCESS_TOKEN", paramRm2);
    this.c.a(localIntent);
  }
  
  private void a(Rm paramRm, boolean paramBoolean)
  {
    Rm localRm = this.b;
    this.b = paramRm;
    if (paramBoolean) {
      if (paramRm != null) {
        this.a.a(paramRm);
      } else {
        this.a.a();
      }
    }
    if (!va.a(localRm, paramRm)) {
      a(localRm, paramRm);
    }
  }
  
  Rm a()
  {
    return this.b;
  }
  
  void a(Rm paramRm)
  {
    a(paramRm, true);
  }
  
  boolean b()
  {
    Rm localRm = this.a.b();
    if (localRm != null)
    {
      a(localRm, false);
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */