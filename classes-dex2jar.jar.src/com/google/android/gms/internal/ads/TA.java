package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.k;
import java.util.regex.Pattern;

@yh
public final class ta
{
  public static boolean a(String paramString)
  {
    ga localga = ra.ge;
    return a((String)Kea.e().a(localga), paramString);
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      try
      {
        boolean bool = Pattern.matches(paramString1, paramString2);
        return bool;
      }
      catch (RuntimeException paramString1)
      {
        k.g().a(paramString1, "NonagonUtil.isPatternMatched");
      }
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */