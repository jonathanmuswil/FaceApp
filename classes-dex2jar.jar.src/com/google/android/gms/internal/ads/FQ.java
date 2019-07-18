package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@yh
public final class fq
  extends MutableContextWrapper
{
  private Activity a;
  private Context b;
  private Context c;
  
  public fq(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public final Context a()
  {
    return this.c;
  }
  
  public final Activity b()
  {
    return this.a;
  }
  
  public final Object getSystemService(String paramString)
  {
    return this.c.getSystemService(paramString);
  }
  
  public final void setBaseContext(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    Activity localActivity;
    if ((paramContext instanceof Activity)) {
      localActivity = (Activity)paramContext;
    } else {
      localActivity = null;
    }
    this.a = localActivity;
    this.c = paramContext;
    super.setBaseContext(this.b);
  }
  
  public final void startActivity(Intent paramIntent)
  {
    Activity localActivity = this.a;
    if (localActivity != null)
    {
      localActivity.startActivity(paramIntent);
      return;
    }
    paramIntent.setFlags(268435456);
    this.b.startActivity(paramIntent);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */