package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.V;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.k;

@Deprecated
public final class f
{
  private static final Object a = new Object();
  private static f b;
  private final String c;
  private final Status d;
  private final boolean e;
  private final boolean f;
  
  f(Context paramContext)
  {
    Object localObject = paramContext.getResources();
    int i = ((Resources)localObject).getIdentifier("google_app_measurement_enable", "integer", ((Resources)localObject).getResourcePackageName(k.common_google_play_services_unknown_issue));
    boolean bool1 = true;
    boolean bool2 = true;
    if (i != 0)
    {
      if (((Resources)localObject).getInteger(i) == 0) {
        bool2 = false;
      }
      this.f = (bool2 ^ true);
    }
    else
    {
      this.f = false;
      bool2 = bool1;
    }
    this.e = bool2;
    String str = V.a(paramContext);
    localObject = str;
    if (str == null) {
      localObject = new x(paramContext).a("google_app_id");
    }
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
      this.c = null;
      return;
    }
    this.c = ((String)localObject);
    this.d = Status.a;
  }
  
  public static Status a(Context paramContext)
  {
    t.a(paramContext, "Context must not be null.");
    synchronized (a)
    {
      if (b == null)
      {
        f localf = new com/google/android/gms/common/api/internal/f;
        localf.<init>(paramContext);
        b = localf;
      }
      paramContext = b.d;
      return paramContext;
    }
  }
  
  private static f a(String paramString)
  {
    synchronized (a)
    {
      if (b != null)
      {
        paramString = b;
        return paramString;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      int i = String.valueOf(paramString).length();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(i + 34);
      localStringBuilder.append("Initialize must be called before ");
      localStringBuilder.append(paramString);
      localStringBuilder.append(".");
      localIllegalStateException.<init>(localStringBuilder.toString());
      throw localIllegalStateException;
    }
  }
  
  public static String a()
  {
    return a("getGoogleAppId").c;
  }
  
  public static boolean b()
  {
    return a("isMeasurementExplicitlyDisabled").f;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/api/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */