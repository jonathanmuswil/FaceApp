package com.google.android.gms.auth.api.signin.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Y;
import android.support.v4.app.Y.a;
import android.support.v4.app.o;
import android.support.v4.content.e;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

@KeepName
public class SignInHubActivity
  extends o
{
  private static boolean n = false;
  private boolean o = false;
  private SignInConfiguration p;
  private boolean q;
  private int r;
  private Intent s;
  
  private final void c(int paramInt)
  {
    Status localStatus = new Status(paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("googleSignInStatus", localStatus);
    setResult(0, localIntent);
    finish();
    n = false;
  }
  
  private final void k()
  {
    f().a(0, null, new a(null));
    n = false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.o) {
      return;
    }
    setResult(0);
    if (paramInt1 == 40962)
    {
      if (paramIntent != null)
      {
        Object localObject = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
        if ((localObject != null) && (((SignInAccount)localObject).y() != null))
        {
          localObject = ((SignInAccount)localObject).y();
          n.a(this).a(this.p.y(), (GoogleSignInAccount)localObject);
          paramIntent.removeExtra("signInAccount");
          paramIntent.putExtra("googleSignInAccount", (Parcelable)localObject);
          this.q = true;
          this.r = paramInt2;
          this.s = paramIntent;
          k();
          return;
        }
        if (paramIntent.hasExtra("errorCode"))
        {
          paramInt2 = paramIntent.getIntExtra("errorCode", 8);
          paramInt1 = paramInt2;
          if (paramInt2 == 13) {
            paramInt1 = 12501;
          }
          c(paramInt1);
          return;
        }
      }
      c(8);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    String str = localIntent.getAction();
    if ("com.google.android.gms.auth.NO_IMPL".equals(str))
    {
      c(12500);
      return;
    }
    if ((!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) && (!str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")))
    {
      paramBundle = String.valueOf(localIntent.getAction());
      if (paramBundle.length() != 0) {
        paramBundle = "Unknown action: ".concat(paramBundle);
      } else {
        paramBundle = new String("Unknown action: ");
      }
      Log.e("AuthSignInClient", paramBundle);
      finish();
      return;
    }
    this.p = ((SignInConfiguration)localIntent.getBundleExtra("config").getParcelable("config"));
    if (this.p == null)
    {
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
      return;
    }
    int i;
    if (paramBundle == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (n)
      {
        setResult(0);
        c(12502);
        return;
      }
      n = true;
      paramBundle = new Intent(str);
      if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
        paramBundle.setPackage("com.google.android.gms");
      } else {
        paramBundle.setPackage(getPackageName());
      }
      paramBundle.putExtra("config", this.p);
      try
      {
        startActivityForResult(paramBundle, 40962);
        return;
      }
      catch (ActivityNotFoundException paramBundle)
      {
        this.o = true;
        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
        c(17);
        return;
      }
    }
    this.q = paramBundle.getBoolean("signingInGoogleApiClients");
    if (this.q)
    {
      this.r = paramBundle.getInt("signInResultCode");
      this.s = ((Intent)paramBundle.getParcelable("signInResultData"));
      k();
    }
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", this.q);
    if (this.q)
    {
      paramBundle.putInt("signInResultCode", this.r);
      paramBundle.putParcelable("signInResultData", this.s);
    }
  }
  
  private final class a
    implements Y.a<Void>
  {
    private a() {}
    
    public final void a(e<Void> parame) {}
    
    public final e<Void> onCreateLoader(int paramInt, Bundle paramBundle)
    {
      return new g(SignInHubActivity.this, f.e());
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/SignInHubActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */