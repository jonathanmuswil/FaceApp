package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class y
  extends f
{
  y(Intent paramIntent, Activity paramActivity, int paramInt) {}
  
  public final void a()
  {
    Intent localIntent = this.a;
    if (localIntent != null) {
      this.b.startActivityForResult(localIntent, this.c);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */