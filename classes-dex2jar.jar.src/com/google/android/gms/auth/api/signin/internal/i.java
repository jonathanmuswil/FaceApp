package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f.b;
import com.google.android.gms.common.api.f.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import java.util.Iterator;
import java.util.Set;

public final class i
  extends h<s>
{
  private final GoogleSignInOptions G;
  
  public i(Context paramContext, Looper paramLooper, d paramd, GoogleSignInOptions paramGoogleSignInOptions, f.b paramb, f.c paramc)
  {
    super(paramContext, paramLooper, 91, paramd, paramb, paramc);
    if (paramGoogleSignInOptions == null) {
      paramGoogleSignInOptions = new GoogleSignInOptions.a().a();
    }
    paramContext = paramGoogleSignInOptions;
    if (!paramd.d().isEmpty())
    {
      paramContext = new GoogleSignInOptions.a(paramGoogleSignInOptions);
      paramLooper = paramd.d().iterator();
      while (paramLooper.hasNext()) {
        paramContext.a((Scope)paramLooper.next(), new Scope[0]);
      }
      paramContext = paramContext.a();
    }
    this.G = paramContext;
  }
  
  public final GoogleSignInOptions B()
  {
    return this.G;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final int g()
  {
    return 12451000;
  }
  
  public final Intent i()
  {
    return j.a(r(), this.G);
  }
  
  protected final String w()
  {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  protected final String x()
  {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */