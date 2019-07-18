package com.facebook.internal;

import S.a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;

public class m
{
  private Uri a;
  
  public m(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    paramBundle = N.b();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(FacebookSdk.k());
    localStringBuilder.append("/");
    localStringBuilder.append("dialog/");
    localStringBuilder.append(paramString);
    this.a = S.a(paramBundle, localStringBuilder.toString(), localBundle);
  }
  
  public void a(Activity paramActivity, String paramString)
  {
    S localS = new S.a().a();
    localS.a.setPackage(paramString);
    localS.a.addFlags(1073741824);
    localS.a(paramActivity, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */