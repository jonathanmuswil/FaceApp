package com.google.android.gms.common.util;

import java.util.regex.Pattern;

public class q
{
  private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (paramString.trim().isEmpty());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/util/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */