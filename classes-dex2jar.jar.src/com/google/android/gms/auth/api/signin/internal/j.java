package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.e;
import java.util.Iterator;
import java.util.Set;
import yq;

public final class j
{
  private static yq a = new yq("GoogleSignInCommon", new String[0]);
  
  public static Intent a(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    a.a("getSignInIntent()", new Object[0]);
    SignInConfiguration localSignInConfiguration = new SignInConfiguration(paramContext.getPackageName(), paramGoogleSignInOptions);
    paramGoogleSignInOptions = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    paramGoogleSignInOptions.setPackage(paramContext.getPackageName());
    paramGoogleSignInOptions.setClass(paramContext, SignInHubActivity.class);
    paramContext = new Bundle();
    paramContext.putParcelable("config", localSignInConfiguration);
    paramGoogleSignInOptions.putExtra("config", paramContext);
    return paramGoogleSignInOptions;
  }
  
  public static g<Status> a(com.google.android.gms.common.api.f paramf, Context paramContext, boolean paramBoolean)
  {
    a.a("Revoking access", new Object[0]);
    String str = c.a(paramContext).d();
    a(paramContext);
    if (paramBoolean) {
      return f.a(str);
    }
    return paramf.b(new k(paramf));
  }
  
  private static void a(Context paramContext)
  {
    n.a(paramContext).a();
    paramContext = com.google.android.gms.common.api.f.e().iterator();
    while (paramContext.hasNext()) {
      ((com.google.android.gms.common.api.f)paramContext.next()).h();
    }
    e.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */