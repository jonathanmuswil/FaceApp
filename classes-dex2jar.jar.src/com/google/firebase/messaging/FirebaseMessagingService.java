package com.google.firebase.messaging;

import Fz;
import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.iid.D;
import com.google.firebase.iid.y;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nP;
import qP;

public class FirebaseMessagingService
  extends D
{
  private static final Queue<String> f = new ArrayDeque(10);
  
  protected final Intent a(Intent paramIntent)
  {
    return y.a().b();
  }
  
  public void a() {}
  
  public void a(c paramc) {}
  
  public void a(String paramString) {}
  
  public void a(String paramString, Exception paramException) {}
  
  public void b(String paramString) {}
  
  public final boolean b(Intent paramIntent)
  {
    if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(paramIntent.getAction()))
    {
      PendingIntent localPendingIntent = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
      if (localPendingIntent != null) {
        try
        {
          localPendingIntent.send();
        }
        catch (PendingIntent.CanceledException localCanceledException)
        {
          Log.e("FirebaseMessaging", "Notification pending intent canceled");
        }
      }
      if (b.e(paramIntent)) {
        b.c(paramIntent);
      }
      return true;
    }
    return false;
  }
  
  public final void c(Intent paramIntent)
  {
    Object localObject1 = paramIntent.getAction();
    if ((!"com.google.android.c2dm.intent.RECEIVE".equals(localObject1)) && (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(localObject1)))
    {
      if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(localObject1))
      {
        if (b.e(paramIntent)) {
          b.a(paramIntent);
        }
      }
      else
      {
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(localObject1))
        {
          b(paramIntent.getStringExtra("token"));
          return;
        }
        paramIntent = String.valueOf(paramIntent.getAction());
        if (paramIntent.length() != 0) {
          paramIntent = "Unknown intent action: ".concat(paramIntent);
        } else {
          paramIntent = new String("Unknown intent action: ");
        }
        Log.d("FirebaseMessaging", paramIntent);
      }
      return;
    }
    Object localObject2 = paramIntent.getStringExtra("google.message_id");
    if (TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject1 = qP.a(null);
    }
    else
    {
      localObject1 = new Bundle();
      ((Bundle)localObject1).putString("google.message_id", (String)localObject2);
      localObject1 = com.google.firebase.iid.e.a(this).a(2, (Bundle)localObject1);
    }
    boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
    int i = 0;
    if (bool) {}
    int j;
    for (;;)
    {
      j = 0;
      break;
      if (f.contains(localObject2))
      {
        if (Log.isLoggable("FirebaseMessaging", 3))
        {
          localObject2 = String.valueOf(localObject2);
          if (((String)localObject2).length() != 0) {
            localObject2 = "Received duplicate message: ".concat((String)localObject2);
          } else {
            localObject2 = new String("Received duplicate message: ");
          }
          Log.d("FirebaseMessaging", (String)localObject2);
        }
        j = 1;
        break;
      }
      if (f.size() >= 10) {
        f.remove();
      }
      f.add(localObject2);
    }
    if (j == 0)
    {
      Object localObject3 = paramIntent.getStringExtra("message_type");
      localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = "gcm";
      }
      switch (((String)localObject2).hashCode())
      {
      default: 
        break;
      case 814800675: 
        if (((String)localObject2).equals("send_event")) {
          j = 2;
        }
        break;
      case 814694033: 
        if (((String)localObject2).equals("send_error")) {
          j = 3;
        }
        break;
      case 102161: 
        if (((String)localObject2).equals("gcm")) {
          j = i;
        }
        break;
      case -2062414158: 
        if (((String)localObject2).equals("deleted_messages")) {
          j = 1;
        }
        break;
      }
      j = -1;
      if (j != 0)
      {
        if (j != 1)
        {
          if (j != 2)
          {
            if (j != 3)
            {
              paramIntent = String.valueOf(localObject2);
              if (paramIntent.length() != 0) {
                paramIntent = "Received message with unknown type: ".concat(paramIntent);
              } else {
                paramIntent = new String("Received message with unknown type: ");
              }
              Log.w("FirebaseMessaging", paramIntent);
            }
            else
            {
              localObject3 = paramIntent.getStringExtra("google.message_id");
              localObject2 = localObject3;
              if (localObject3 == null) {
                localObject2 = paramIntent.getStringExtra("message_id");
              }
              a((String)localObject2, new d(paramIntent.getStringExtra("error")));
            }
          }
          else {
            a(paramIntent.getStringExtra("google.message_id"));
          }
        }
        else {
          a();
        }
      }
      else
      {
        if (b.e(paramIntent)) {
          b.d(paramIntent);
        }
        localObject3 = paramIntent.getExtras();
        localObject2 = localObject3;
        if (localObject3 == null) {
          localObject2 = new Bundle();
        }
        ((Bundle)localObject2).remove("android.support.content.wakelockid");
        if (Fz.a((Bundle)localObject2))
        {
          if (new e(this, (Bundle)localObject2).a()) {
            break label628;
          }
          if (b.e(paramIntent)) {
            b.b(paramIntent);
          }
        }
        a(new c((Bundle)localObject2));
      }
    }
    try
    {
      label628:
      qP.a((nP)localObject1, 1L, TimeUnit.SECONDS);
      return;
    }
    catch (TimeoutException paramIntent) {}catch (InterruptedException paramIntent) {}catch (ExecutionException paramIntent) {}
    localObject1 = String.valueOf(paramIntent);
    paramIntent = new StringBuilder(String.valueOf(localObject1).length() + 20);
    paramIntent.append("Message ack failed: ");
    paramIntent.append((String)localObject1);
    Log.w("FirebaseMessaging", paramIntent.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/messaging/FirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */