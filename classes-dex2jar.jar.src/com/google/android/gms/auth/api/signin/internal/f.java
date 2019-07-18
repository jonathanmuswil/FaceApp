package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import yq;

public final class f
  implements Runnable
{
  private static final yq a = new yq("RevokeAccessOperation", new String[0]);
  private final String b;
  private final n c;
  
  private f(String paramString)
  {
    t.b(paramString);
    this.b = paramString;
    this.c = new n(null);
  }
  
  public static g<Status> a(String paramString)
  {
    if (paramString == null) {
      return h.a(new Status(4), null);
    }
    paramString = new f(paramString);
    new Thread(paramString).start();
    return paramString.c;
  }
  
  public final void run()
  {
    Status localStatus = Status.c;
    Object localObject3 = localStatus;
    Object localObject4 = localStatus;
    Object localObject2;
    try
    {
      Object localObject5 = new java/net/URL;
      localObject3 = localStatus;
      localObject4 = localStatus;
      Object localObject6 = String.valueOf(this.b);
      localObject3 = localStatus;
      localObject4 = localStatus;
      if (((String)localObject6).length() != 0)
      {
        localObject3 = localStatus;
        localObject4 = localStatus;
        localObject6 = "https://accounts.google.com/o/oauth2/revoke?token=".concat((String)localObject6);
      }
      else
      {
        localObject3 = localStatus;
        localObject4 = localStatus;
        localObject6 = new String("https://accounts.google.com/o/oauth2/revoke?token=");
      }
      localObject3 = localStatus;
      localObject4 = localStatus;
      ((URL)localObject5).<init>((String)localObject6);
      localObject3 = localStatus;
      localObject4 = localStatus;
      localObject6 = (HttpURLConnection)((URL)localObject5).openConnection();
      localObject3 = localStatus;
      localObject4 = localStatus;
      ((HttpURLConnection)localObject6).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      localObject3 = localStatus;
      localObject4 = localStatus;
      int i = ((HttpURLConnection)localObject6).getResponseCode();
      if (i == 200)
      {
        localObject3 = localStatus;
        localObject4 = localStatus;
        localStatus = Status.a;
      }
      else
      {
        localObject3 = localStatus;
        localObject4 = localStatus;
        a.b("Unable to revoke access!", new Object[0]);
      }
      localObject3 = localStatus;
      localObject4 = localStatus;
      localObject6 = a;
      localObject3 = localStatus;
      localObject4 = localStatus;
      localObject5 = new java/lang/StringBuilder;
      localObject3 = localStatus;
      localObject4 = localStatus;
      ((StringBuilder)localObject5).<init>(26);
      localObject3 = localStatus;
      localObject4 = localStatus;
      ((StringBuilder)localObject5).append("Response Code: ");
      localObject3 = localStatus;
      localObject4 = localStatus;
      ((StringBuilder)localObject5).append(i);
      localObject3 = localStatus;
      localObject4 = localStatus;
      ((yq)localObject6).a(((StringBuilder)localObject5).toString(), new Object[0]);
    }
    catch (Exception localException)
    {
      localObject4 = a;
      Object localObject1 = String.valueOf(localException.toString());
      if (((String)localObject1).length() != 0) {
        localObject1 = "Exception when revoking access: ".concat((String)localObject1);
      } else {
        localObject1 = new String("Exception when revoking access: ");
      }
      ((yq)localObject4).b((String)localObject1, new Object[0]);
      localObject1 = localObject3;
    }
    catch (IOException localIOException)
    {
      localObject3 = a;
      localObject2 = String.valueOf(localIOException.toString());
      if (((String)localObject2).length() != 0) {
        localObject2 = "IOException when revoking access: ".concat((String)localObject2);
      } else {
        localObject2 = new String("IOException when revoking access: ");
      }
      ((yq)localObject3).b((String)localObject2, new Object[0]);
      localObject2 = localObject4;
    }
    this.c.a((l)localObject2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */