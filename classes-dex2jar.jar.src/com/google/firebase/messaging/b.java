package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import fQ;

public class b
{
  public static void a(Intent paramIntent)
  {
    a("_nd", paramIntent);
  }
  
  private static void a(String paramString, Intent paramIntent)
  {
    Bundle localBundle = new Bundle();
    String str = paramIntent.getStringExtra("google.c.a.c_id");
    if (str != null) {
      localBundle.putString("_nmid", str);
    }
    str = paramIntent.getStringExtra("google.c.a.c_l");
    if (str != null) {
      localBundle.putString("_nmn", str);
    }
    str = paramIntent.getStringExtra("google.c.a.m_l");
    if (!TextUtils.isEmpty(str)) {
      localBundle.putString("label", str);
    }
    str = paramIntent.getStringExtra("google.c.a.m_c");
    if (!TextUtils.isEmpty(str)) {
      localBundle.putString("message_channel", str);
    }
    str = paramIntent.getStringExtra("from");
    if ((str == null) || (!str.startsWith("/topics/"))) {
      str = null;
    }
    if (str != null) {
      localBundle.putString("_nt", str);
    }
    if (paramIntent.hasExtra("google.c.a.ts")) {
      try
      {
        localBundle.putInt("_nmt", Integer.parseInt(paramIntent.getStringExtra("google.c.a.ts")));
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", localNumberFormatException);
      }
    }
    if (paramIntent.hasExtra("google.c.a.udt")) {
      try
      {
        localBundle.putInt("_ndt", Integer.parseInt(paramIntent.getStringExtra("google.c.a.udt")));
      }
      catch (NumberFormatException paramIntent)
      {
        Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", paramIntent);
      }
    }
    if (Log.isLoggable("FirebaseMessaging", 3))
    {
      paramIntent = String.valueOf(localBundle);
      StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + 22 + String.valueOf(paramIntent).length());
      localStringBuilder.append("Sending event=");
      localStringBuilder.append(paramString);
      localStringBuilder.append(" params=");
      localStringBuilder.append(paramIntent);
      Log.d("FirebaseMessaging", localStringBuilder.toString());
    }
    paramIntent = (fQ)FirebaseApp.getInstance().a(fQ.class);
    if (paramIntent != null)
    {
      paramIntent.a("fcm", paramString, localBundle);
      return;
    }
    Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
  }
  
  public static void b(Intent paramIntent)
  {
    a("_nf", paramIntent);
  }
  
  public static void c(Intent paramIntent)
  {
    if (paramIntent != null) {
      if ("1".equals(paramIntent.getStringExtra("google.c.a.tc")))
      {
        fQ localfQ = (fQ)FirebaseApp.getInstance().a(fQ.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
          Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (localfQ != null)
        {
          String str = paramIntent.getStringExtra("google.c.a.c_id");
          localfQ.a("fcm", "_ln", str);
          Bundle localBundle = new Bundle();
          localBundle.putString("source", "Firebase");
          localBundle.putString("medium", "notification");
          localBundle.putString("campaign", str);
          localfQ.a("fcm", "_cmp", localBundle);
        }
        else
        {
          Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        }
      }
      else if (Log.isLoggable("FirebaseMessaging", 3))
      {
        Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
      }
    }
    a("_no", paramIntent);
  }
  
  public static void d(Intent paramIntent)
  {
    a("_nr", paramIntent);
  }
  
  public static boolean e(Intent paramIntent)
  {
    if (paramIntent == null) {
      return false;
    }
    if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(paramIntent.getAction())) {
      return false;
    }
    return "1".equals(paramIntent.getStringExtra("google.c.a.e"));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/messaging/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */