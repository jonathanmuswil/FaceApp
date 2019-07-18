package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import java.util.Queue;

@Deprecated
public class FirebaseInstanceIdService
  extends D
{
  protected final Intent a(Intent paramIntent)
  {
    return (Intent)y.a().e.poll();
  }
  
  @Deprecated
  public void a() {}
  
  public final void c(Intent paramIntent)
  {
    if ("com.google.firebase.iid.TOKEN_REFRESH".equals(paramIntent.getAction()))
    {
      a();
      return;
    }
    String str = paramIntent.getStringExtra("CMD");
    if (str != null)
    {
      if (Log.isLoggable("FirebaseInstanceId", 3))
      {
        paramIntent = String.valueOf(paramIntent.getExtras());
        StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(paramIntent).length());
        localStringBuilder.append("Received command: ");
        localStringBuilder.append(str);
        localStringBuilder.append(" - ");
        localStringBuilder.append(paramIntent);
        Log.d("FirebaseInstanceId", localStringBuilder.toString());
      }
      if ((!"RST".equals(str)) && (!"RST_FULL".equals(str)))
      {
        if ("SYNC".equals(str)) {
          FirebaseInstanceId.b().j();
        }
      }
      else {
        FirebaseInstanceId.b().h();
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/firebase/iid/FirebaseInstanceIdService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */