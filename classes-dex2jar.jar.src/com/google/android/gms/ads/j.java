package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.E;
import com.google.android.gms.internal.ads.I;

public class j
{
  public static void a(Context paramContext, String paramString)
  {
    a(paramContext, paramString, null);
  }
  
  @Deprecated
  public static void a(Context paramContext, String paramString, a parama)
  {
    E localE = E.a();
    if (parama == null)
    {
      localE.a(paramContext, paramString, null, null);
      return;
    }
    parama.a();
    throw null;
  }
  
  public static final class a
  {
    final I a()
    {
      throw null;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/ads/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */