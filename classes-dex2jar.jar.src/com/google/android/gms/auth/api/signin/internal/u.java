package com.google.android.gms.auth.api.signin.internal;

import Mp;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.common.api.a.d.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.f.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.i;

public final class u
  extends p
{
  private final Context a;
  
  public u(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private final void a()
  {
    if (i.isGooglePlayServicesUid(this.a, Binder.getCallingUid())) {
      return;
    }
    int i = Binder.getCallingUid();
    StringBuilder localStringBuilder = new StringBuilder(52);
    localStringBuilder.append("Calling UID ");
    localStringBuilder.append(i);
    localStringBuilder.append(" is not Google Play services.");
    throw new SecurityException(localStringBuilder.toString());
  }
  
  public final void ea()
  {
    a();
    Object localObject1 = c.a(this.a);
    GoogleSignInAccount localGoogleSignInAccount = ((c)localObject1).b();
    Object localObject3 = GoogleSignInOptions.f;
    if (localGoogleSignInAccount != null) {
      localObject3 = ((c)localObject1).c();
    }
    localObject1 = new f.a(this.a);
    ((f.a)localObject1).a(Mp.g, (a.d.c)localObject3);
    localObject3 = ((f.a)localObject1).a();
    try
    {
      if (((f)localObject3).a().C()) {
        if (localGoogleSignInAccount != null) {
          Mp.j.a((f)localObject3);
        } else {
          ((f)localObject3).b();
        }
      }
      return;
    }
    finally
    {
      ((f)localObject3).d();
    }
  }
  
  public final void ta()
  {
    a();
    n.a(this.a).a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */