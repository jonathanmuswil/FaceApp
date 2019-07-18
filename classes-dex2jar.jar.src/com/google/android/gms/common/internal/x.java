package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.k;

public class x
{
  private final Resources a;
  private final String b;
  
  public x(Context paramContext)
  {
    t.a(paramContext);
    this.a = paramContext.getResources();
    this.b = this.a.getResourcePackageName(k.common_google_play_services_unknown_issue);
  }
  
  public String a(String paramString)
  {
    int i = this.a.getIdentifier(paramString, "string", this.b);
    if (i == 0) {
      return null;
    }
    return this.a.getString(i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */