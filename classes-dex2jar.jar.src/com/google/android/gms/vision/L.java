package com.google.android.gms.vision;

import android.support.annotation.Keep;
import android.util.Log;

@Keep
public class L
{
  public static boolean isLoggable(int paramInt)
  {
    return 4 <= paramInt;
  }
  
  public static int zza(String paramString, Object... paramVarArgs)
  {
    if (isLoggable(2)) {
      return Log.v("Vision", String.format(paramString, paramVarArgs));
    }
    return 0;
  }
  
  public static int zza(Throwable paramThrowable, String paramString, Object... paramVarArgs)
  {
    if (isLoggable(6))
    {
      if (isLoggable(3)) {
        return Log.e("Vision", String.format(paramString, paramVarArgs), paramThrowable);
      }
      paramString = String.format(paramString, paramVarArgs);
      paramVarArgs = String.valueOf(paramThrowable);
      paramThrowable = new StringBuilder(String.valueOf(paramString).length() + 2 + String.valueOf(paramVarArgs).length());
      paramThrowable.append(paramString);
      paramThrowable.append(": ");
      paramThrowable.append(paramVarArgs);
      return Log.e("Vision", paramThrowable.toString());
    }
    return 0;
  }
  
  public static int zzb(String paramString, Object... paramVarArgs)
  {
    if (isLoggable(3)) {
      return Log.d("Vision", String.format(paramString, paramVarArgs));
    }
    return 0;
  }
  
  public static int zzc(String paramString, Object... paramVarArgs)
  {
    if (isLoggable(6)) {
      return Log.e("Vision", String.format(paramString, paramVarArgs));
    }
    return 0;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/vision/L.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */