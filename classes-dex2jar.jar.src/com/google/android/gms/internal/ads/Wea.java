package com.google.android.gms.internal.ads;

import Kp;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@yh
public final class wea
{
  public static final wea a = new wea();
  
  public static sea a(Context paramContext, y paramy)
  {
    Object localObject1 = paramy.a();
    long l;
    if (localObject1 != null) {
      l = ((Date)localObject1).getTime();
    } else {
      l = -1L;
    }
    String str1 = paramy.b();
    int i = paramy.d();
    localObject1 = paramy.e();
    if (!((Set)localObject1).isEmpty()) {
      localObject1 = Collections.unmodifiableList(new ArrayList((Collection)localObject1));
    } else {
      localObject1 = null;
    }
    boolean bool1 = paramy.a(paramContext);
    int j = paramy.o();
    Location localLocation = paramy.f();
    Bundle localBundle = paramy.a(AdMobAdapter.class);
    boolean bool2 = paramy.g();
    String str2 = paramy.i();
    Object localObject2 = paramy.l();
    if (localObject2 == null)
    {
      paramContext = paramContext.getApplicationContext();
      if (paramContext != null)
      {
        paramContext = paramContext.getPackageName();
        Kea.a();
        paramContext = Hl.a(Thread.currentThread().getStackTrace(), paramContext);
      }
      else
      {
        paramContext = null;
      }
      boolean bool3 = paramy.j();
      int k = paramy.q();
      localObject2 = paramy.h();
      return new sea(8, l, localBundle, i, (List)localObject1, bool1, j, bool2, str2, null, localLocation, str1, paramy.n(), paramy.c(), Collections.unmodifiableList(new ArrayList(paramy.p())), paramy.k(), paramContext, bool3, null, k, (String)localObject2);
    }
    new W((Kp)localObject2);
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */