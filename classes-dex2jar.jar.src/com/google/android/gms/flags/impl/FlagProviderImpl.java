package com.google.android.gms.flags.impl;

import Hq;
import Iq;
import Qq;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
public class FlagProviderImpl
  extends Qq
{
  private boolean a = false;
  private SharedPreferences b;
  
  public boolean getBooleanFlagValue(String paramString, boolean paramBoolean, int paramInt)
  {
    if (!this.a) {
      return paramBoolean;
    }
    return b.a(this.b, paramString, Boolean.valueOf(paramBoolean)).booleanValue();
  }
  
  public int getIntFlagValue(String paramString, int paramInt1, int paramInt2)
  {
    if (!this.a) {
      return paramInt1;
    }
    return d.a(this.b, paramString, Integer.valueOf(paramInt1)).intValue();
  }
  
  public long getLongFlagValue(String paramString, long paramLong, int paramInt)
  {
    if (!this.a) {
      return paramLong;
    }
    return f.a(this.b, paramString, Long.valueOf(paramLong)).longValue();
  }
  
  public String getStringFlagValue(String paramString1, String paramString2, int paramInt)
  {
    if (!this.a) {
      return paramString2;
    }
    return h.a(this.b, paramString1, paramString2);
  }
  
  public void init(Hq paramHq)
  {
    paramHq = (Context)Iq.J(paramHq);
    if (this.a) {
      return;
    }
    try
    {
      this.b = j.a(paramHq.createPackageContext("com.google.android.gms", 0));
      this.a = true;
      return;
    }
    catch (Exception paramHq)
    {
      paramHq = String.valueOf(paramHq.getMessage());
      if (paramHq.length() != 0) {
        paramHq = "Could not retrieve sdk flags, continuing with defaults: ".concat(paramHq);
      } else {
        paramHq = new String("Could not retrieve sdk flags, continuing with defaults: ");
      }
      Log.w("FlagProviderImpl", paramHq);
      return;
    }
    catch (PackageManager.NameNotFoundException paramHq)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/flags/impl/FlagProviderImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */