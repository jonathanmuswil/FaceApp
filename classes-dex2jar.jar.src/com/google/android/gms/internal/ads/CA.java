package com.google.android.gms.internal.ads;

import Fq;
import Gq;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.common.internal.t;
import java.util.List;

@yh
public final class ca
{
  private final Context a;
  
  public ca(Context paramContext)
  {
    t.a(paramContext, "Context can not be null");
    this.a = paramContext;
  }
  
  private final boolean a(Intent paramIntent)
  {
    t.a(paramIntent, "Intent can not be null");
    return !this.a.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty();
  }
  
  public final boolean a()
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:"));
    return a(localIntent);
  }
  
  public final boolean b()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("sms:"));
    return a(localIntent);
  }
  
  public final boolean c()
  {
    return (((Boolean)zl.a(this.a, new da())).booleanValue()) && (Gq.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
  
  @TargetApi(14)
  public final boolean d()
  {
    return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */