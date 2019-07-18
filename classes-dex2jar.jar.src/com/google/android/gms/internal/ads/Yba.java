package com.google.android.gms.internal.ads;

public final class yba
{
  public static boolean a(String paramString)
  {
    return "audio".equals(c(paramString));
  }
  
  public static boolean b(String paramString)
  {
    return "video".equals(c(paramString));
  }
  
  private static String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('/');
    if (i == -1)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Invalid mime type: ".concat(paramString);
      } else {
        paramString = new String("Invalid mime type: ");
      }
      throw new IllegalArgumentException(paramString);
    }
    return paramString.substring(0, i);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */