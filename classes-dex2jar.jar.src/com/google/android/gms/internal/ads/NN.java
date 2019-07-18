package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.m;
import java.util.Arrays;
import java.util.List;

@yh
public final class nn
  extends fn
{
  public final en a(Context paramContext, wn paramwn, int paramInt, boolean paramBoolean, Ga paramGa, vn paramvn)
  {
    Object localObject = paramContext.getApplicationInfo();
    boolean bool = m.a();
    int i = 1;
    int j;
    if ((bool) && ((localObject == null) || (((ApplicationInfo)localObject).targetSdkVersion >= 11))) {
      j = 1;
    } else {
      j = 0;
    }
    if (j == 0) {
      return null;
    }
    xn localxn = new xn(paramContext, paramwn.z(), paramwn.F(), paramGa, paramwn.I());
    if ((Build.VERSION.SDK_INT >= 16) && (paramInt == 2)) {
      j = i;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      localObject = Arrays.asList(paramvn.e.split(","));
      if (((List)localObject).contains("3")) {
        return new bo(paramContext, localxn, paramwn, paramBoolean, fn.a(paramwn), paramvn);
      }
      if (((List)localObject).contains("1")) {
        return new Hn(paramContext, localxn, paramwn, paramInt, paramBoolean, fn.a(paramwn), paramvn);
      }
    }
    return new Um(paramContext, paramBoolean, fn.a(paramwn), paramvn, new xn(paramContext, paramwn.z(), paramwn.F(), paramGa, paramwn.I()));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */