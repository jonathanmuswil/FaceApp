package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import org.json.JSONObject;

@yh
public abstract class ga<T>
{
  private final int a;
  private final String b;
  private final T c;
  
  private ga(int paramInt, String paramString, T paramT)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramT;
    Kea.d().a(this);
  }
  
  public static ga<String> a(int paramInt, String paramString)
  {
    paramString = a(paramInt, paramString, null);
    Kea.d().b(paramString);
    return paramString;
  }
  
  public static ga<Float> a(int paramInt, String paramString, float paramFloat)
  {
    return new ka(paramInt, paramString, Float.valueOf(paramFloat));
  }
  
  public static ga<Integer> a(int paramInt1, String paramString, int paramInt2)
  {
    return new ia(paramInt1, paramString, Integer.valueOf(paramInt2));
  }
  
  public static ga<Long> a(int paramInt, String paramString, long paramLong)
  {
    return new ja(paramInt, paramString, Long.valueOf(paramLong));
  }
  
  public static ga<Boolean> a(int paramInt, String paramString, Boolean paramBoolean)
  {
    return new ha(paramInt, paramString, paramBoolean);
  }
  
  public static ga<String> a(int paramInt, String paramString1, String paramString2)
  {
    return new la(paramInt, paramString1, paramString2);
  }
  
  public static ga<String> b(int paramInt, String paramString)
  {
    paramString = a(paramInt, paramString, null);
    Kea.d().c(paramString);
    return paramString;
  }
  
  protected abstract T a(SharedPreferences paramSharedPreferences);
  
  public abstract T a(Bundle paramBundle);
  
  protected abstract T a(JSONObject paramJSONObject);
  
  public final String a()
  {
    return this.b;
  }
  
  public abstract void a(SharedPreferences.Editor paramEditor, T paramT);
  
  public final int b()
  {
    return this.a;
  }
  
  public final T c()
  {
    return (T)this.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */