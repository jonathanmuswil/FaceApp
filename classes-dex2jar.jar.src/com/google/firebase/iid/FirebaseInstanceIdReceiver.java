package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.support.v4.content.n;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.m;

public final class FirebaseInstanceIdReceiver
  extends n
{
  private static K c;
  private static K d;
  
  @SuppressLint({"InlinedApi"})
  public static int a(BroadcastReceiver paramBroadcastReceiver, Context paramContext, String paramString, Intent paramIntent)
  {
    boolean bool = m.k();
    int i = 1;
    if ((bool) && (paramContext.getApplicationInfo().targetSdkVersion >= 26)) {
      j = 1;
    } else {
      j = 0;
    }
    if ((paramIntent.getFlags() & 0x10000000) == 0) {
      i = 0;
    }
    if ((j != 0) && (i == 0)) {
      return b(paramBroadcastReceiver, paramContext, paramString, paramIntent);
    }
    int j = y.a().a(paramContext, paramString, paramIntent);
    if ((m.k()) && (j == 402))
    {
      b(paramBroadcastReceiver, paramContext, paramString, paramIntent);
      return 403;
    }
    return j;
  }
  
  private static K a(Context paramContext, String paramString)
  {
    try
    {
      K localK;
      if ("com.google.firebase.MESSAGING_EVENT".equals(paramString))
      {
        if (d == null)
        {
          localK = new com/google/firebase/iid/K;
          localK.<init>(paramContext, paramString);
          d = localK;
        }
        paramContext = d;
        return paramContext;
      }
      if (c == null)
      {
        localK = new com/google/firebase/iid/K;
        localK.<init>(paramContext, paramString);
        c = localK;
      }
      paramContext = c;
      return paramContext;
    }
    finally {}
  }
  
  private final void a(Context paramContext, Intent paramIntent, String paramString)
  {
    Object localObject = null;
    paramIntent.setComponent(null);
    paramIntent.setPackage(paramContext.getPackageName());
    if (Build.VERSION.SDK_INT <= 18) {
      paramIntent.removeCategory(paramContext.getPackageName());
    }
    String str = paramIntent.getStringExtra("gcm.rawData64");
    if (str != null)
    {
      paramIntent.putExtra("rawData", Base64.decode(str, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    if ((!"google.com/iid".equals(paramIntent.getStringExtra("from"))) && (!"com.google.firebase.INSTANCE_ID_EVENT".equals(paramString)))
    {
      if ((!"com.google.android.c2dm.intent.RECEIVE".equals(paramString)) && (!"com.google.firebase.MESSAGING_EVENT".equals(paramString)))
      {
        Log.d("FirebaseInstanceId", "Unexpected intent");
        paramString = (String)localObject;
      }
      else
      {
        paramString = "com.google.firebase.MESSAGING_EVENT";
      }
    }
    else {
      paramString = "com.google.firebase.INSTANCE_ID_EVENT";
    }
    int i = -1;
    if (paramString != null) {
      i = a(this, paramContext, paramString, paramIntent);
    }
    if (isOrderedBroadcast()) {
      setResultCode(i);
    }
  }
  
  private static int b(BroadcastReceiver paramBroadcastReceiver, Context paramContext, String paramString, Intent paramIntent)
  {
    if (Log.isLoggable("FirebaseInstanceId", 3))
    {
      String str = String.valueOf(paramString);
      if (str.length() != 0) {
        str = "Binding to service: ".concat(str);
      } else {
        str = new String("Binding to service: ");
      }
      Log.d("FirebaseInstanceId", str);
    }
    if (paramBroadcastReceiver.isOrderedBroadcast()) {
      paramBroadcastReceiver.setResultCode(-1);
    }
    a(paramContext, paramString).a(paramIntent, paramBroadcastReceiver.goAsync());
    return -1;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Object localObject = paramIntent.getParcelableExtra("wrapped_intent");
    if ((localObject instanceof Intent)) {
      localObject = (Intent)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      a(paramContext, (Intent)localObject, paramIntent.getAction());
      return;
    }
    a(paramContext, paramIntent, paramIntent.getAction());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/FirebaseInstanceIdReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */