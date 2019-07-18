package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public final class t
{
  public static int a(int paramInt)
  {
    if (paramInt != 0) {
      return paramInt;
    }
    throw new IllegalArgumentException("Given Integer is zero");
  }
  
  public static <T> T a(T paramT)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException("null reference");
  }
  
  public static <T> T a(T paramT, Object paramObject)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static String a(String paramString, Object paramObject)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void a()
  {
    c("Must not be called on the main application thread");
  }
  
  public static void a(Handler paramHandler)
  {
    a(paramHandler, "Must be called on the handler thread");
  }
  
  public static void a(Handler paramHandler, String paramString)
  {
    if (Looper.myLooper() == paramHandler.getLooper()) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static void a(String paramString)
  {
    if (com.google.android.gms.common.util.t.a()) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void a(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(String.format(paramString, paramVarArgs));
  }
  
  public static String b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException("Given String is empty or null");
  }
  
  public static void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static void b(boolean paramBoolean, String paramString, Object... paramVarArgs)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.format(paramString, paramVarArgs));
  }
  
  public static void c(String paramString)
  {
    if (!com.google.android.gms.common.util.t.a()) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */