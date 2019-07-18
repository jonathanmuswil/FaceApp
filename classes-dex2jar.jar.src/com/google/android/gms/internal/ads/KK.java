package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import java.io.IOException;

final class kk
  extends hk
{
  private Context d;
  
  kk(Context paramContext)
  {
    this.d = paramContext;
  }
  
  public final void a()
  {
    try
    {
      bool = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.d);
    }
    catch (h localh) {}catch (g localg) {}catch (IllegalStateException localIllegalStateException) {}catch (IOException localIOException) {}
    Tl.b("Fail to get isAdIdFakeForDebugLogging", localIOException);
    boolean bool = false;
    Ll.a(bool);
    StringBuilder localStringBuilder = new StringBuilder(43);
    localStringBuilder.append("Update ad debug logging enablement as ");
    localStringBuilder.append(bool);
    Tl.d(localStringBuilder.toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */