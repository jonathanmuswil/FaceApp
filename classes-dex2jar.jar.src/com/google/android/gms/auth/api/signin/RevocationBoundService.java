package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.u;

public final class RevocationBoundService
  extends Service
{
  public final IBinder onBind(Intent paramIntent)
  {
    if ((!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(paramIntent.getAction())) && (!"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(paramIntent.getAction())))
    {
      paramIntent = String.valueOf(paramIntent.getAction());
      if (paramIntent.length() != 0) {
        paramIntent = "Unknown action sent to RevocationBoundService: ".concat(paramIntent);
      } else {
        paramIntent = new String("Unknown action sent to RevocationBoundService: ");
      }
      Log.w("RevocationService", paramIntent);
      return null;
    }
    if (Log.isLoggable("RevocationService", 2))
    {
      paramIntent = String.valueOf(paramIntent.getAction());
      if (paramIntent.length() != 0) {
        paramIntent = "RevocationBoundService handling ".concat(paramIntent);
      } else {
        paramIntent = new String("RevocationBoundService handling ");
      }
      Log.v("RevocationService", paramIntent);
    }
    return new u(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/RevocationBoundService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */