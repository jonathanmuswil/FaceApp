package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.content.n;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import ud;

public final class y
{
  private static y a;
  private final ud<String, String> b = new ud();
  private Boolean c = null;
  private Boolean d = null;
  final Queue<Intent> e = new ArrayDeque();
  private final Queue<Intent> f = new ArrayDeque();
  
  public static y a()
  {
    try
    {
      if (a == null)
      {
        localy = new com/google/firebase/iid/y;
        localy.<init>();
        a = localy;
      }
      y localy = a;
      return localy;
    }
    finally {}
  }
  
  public static void a(Context paramContext, Intent paramIntent)
  {
    paramContext.sendBroadcast(b(paramContext, "com.google.firebase.INSTANCE_ID_EVENT", paramIntent));
  }
  
  private static Intent b(Context paramContext, String paramString, Intent paramIntent)
  {
    paramContext = new Intent(paramContext, FirebaseInstanceIdReceiver.class);
    paramContext.setAction(paramString);
    paramContext.putExtra("wrapped_intent", paramIntent);
    return paramContext;
  }
  
  public static void b(Context paramContext, Intent paramIntent)
  {
    paramContext.sendBroadcast(b(paramContext, "com.google.firebase.MESSAGING_EVENT", paramIntent));
  }
  
  private final int c(Context paramContext, Intent paramIntent)
  {
    synchronized (this.b)
    {
      ??? = (String)this.b.get(paramIntent.getAction());
      ??? = ???;
      if (??? == null)
      {
        ??? = paramContext.getPackageManager().resolveService(paramIntent, 0);
        if (??? != null)
        {
          ??? = ((ResolveInfo)???).serviceInfo;
          if (??? != null)
          {
            if ((paramContext.getPackageName().equals(((ServiceInfo)???).packageName)) && (((ServiceInfo)???).name != null))
            {
              ??? = ((ServiceInfo)???).name;
              ??? = ???;
              if (((String)???).startsWith("."))
              {
                ??? = String.valueOf(paramContext.getPackageName());
                ??? = String.valueOf(???);
                if (((String)???).length() != 0) {
                  ??? = ((String)???).concat((String)???);
                } else {
                  ??? = new String((String)???);
                }
              }
              synchronized (this.b)
              {
                this.b.put(paramIntent.getAction(), ???);
              }
            }
            ??? = ((ServiceInfo)???).packageName;
            String str = ((ServiceInfo)???).name;
            ??? = new StringBuilder(String.valueOf(???).length() + 94 + String.valueOf(str).length());
            ((StringBuilder)???).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            ((StringBuilder)???).append((String)???);
            ((StringBuilder)???).append("/");
            ((StringBuilder)???).append(str);
            Log.e("FirebaseInstanceId", ((StringBuilder)???).toString());
            break label344;
          }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
      }
      else
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          ??? = String.valueOf(???);
          if (((String)???).length() != 0) {
            ??? = "Restricting intent to a specific service: ".concat((String)???);
          } else {
            ??? = new String("Restricting intent to a specific service: ");
          }
          Log.d("FirebaseInstanceId", (String)???);
        }
        paramIntent.setClassName(paramContext.getPackageName(), (String)???);
      }
      try
      {
        label344:
        if (a(paramContext))
        {
          paramContext = n.b(paramContext, paramIntent);
        }
        else
        {
          paramContext = paramContext.startService(paramIntent);
          Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
        }
        if (paramContext == null)
        {
          Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
          return 404;
        }
        return -1;
      }
      catch (IllegalStateException paramContext)
      {
        paramContext = String.valueOf(paramContext);
        paramIntent = new StringBuilder(String.valueOf(paramContext).length() + 45);
        paramIntent.append("Failed to start service while in background: ");
        paramIntent.append(paramContext);
        Log.e("FirebaseInstanceId", paramIntent.toString());
        return 402;
      }
      catch (SecurityException paramContext)
      {
        Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", paramContext);
        return 401;
      }
    }
  }
  
  public final int a(Context paramContext, String paramString, Intent paramIntent)
  {
    if (Log.isLoggable("FirebaseInstanceId", 3))
    {
      String str = String.valueOf(paramString);
      if (str.length() != 0) {
        str = "Starting service: ".concat(str);
      } else {
        str = new String("Starting service: ");
      }
      Log.d("FirebaseInstanceId", str);
    }
    int i = -1;
    int j = paramString.hashCode();
    if (j != -842411455)
    {
      if ((j == 41532704) && (paramString.equals("com.google.firebase.MESSAGING_EVENT"))) {
        i = 1;
      }
    }
    else if (paramString.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
      i = 0;
    }
    if (i != 0)
    {
      if (i != 1)
      {
        paramContext = String.valueOf(paramString);
        if (paramContext.length() != 0) {
          paramContext = "Unknown service action: ".concat(paramContext);
        } else {
          paramContext = new String("Unknown service action: ");
        }
        Log.w("FirebaseInstanceId", paramContext);
        return 500;
      }
      this.f.offer(paramIntent);
    }
    else
    {
      this.e.offer(paramIntent);
    }
    paramString = new Intent(paramString);
    paramString.setPackage(paramContext.getPackageName());
    return c(paramContext, paramString);
  }
  
  final boolean a(Context paramContext)
  {
    if (this.c == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.c = Boolean.valueOf(bool);
    }
    if ((!this.c.booleanValue()) && (Log.isLoggable("FirebaseInstanceId", 3))) {
      Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return this.c.booleanValue();
  }
  
  public final Intent b()
  {
    return (Intent)this.f.poll();
  }
  
  final boolean b(Context paramContext)
  {
    if (this.d == null)
    {
      boolean bool;
      if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
        bool = true;
      } else {
        bool = false;
      }
      this.d = Boolean.valueOf(bool);
    }
    if ((!this.c.booleanValue()) && (Log.isLoggable("FirebaseInstanceId", 3))) {
      Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }
    return this.d.booleanValue();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */