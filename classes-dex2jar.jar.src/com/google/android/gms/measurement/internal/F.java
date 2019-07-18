package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class f
{
  final String a;
  final String b;
  private final String c;
  final long d;
  final long e;
  final h f;
  
  f(aa paramaa, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, Bundle paramBundle)
  {
    com.google.android.gms.common.internal.t.b(paramString2);
    com.google.android.gms.common.internal.t.b(paramString3);
    this.a = paramString2;
    this.b = paramString3;
    paramString3 = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      paramString3 = null;
    }
    this.c = paramString3;
    this.d = paramLong1;
    this.e = paramLong2;
    paramLong1 = this.e;
    if ((paramLong1 != 0L) && (paramLong1 > this.d)) {
      paramaa.c().v().a("Event created with reverse previous/current timestamps. appId", v.a(paramString2));
    }
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      paramString1 = new Bundle(paramBundle);
      paramString3 = paramString1.keySet().iterator();
      while (paramString3.hasNext())
      {
        paramString2 = (String)paramString3.next();
        if (paramString2 == null)
        {
          paramaa.c().s().a("Param name can't be null");
          paramString3.remove();
        }
        else
        {
          paramBundle = paramaa.g().a(paramString2, paramString1.get(paramString2));
          if (paramBundle == null)
          {
            paramaa.c().v().a("Param value can't be null", paramaa.f().b(paramString2));
            paramString3.remove();
          }
          else
          {
            paramaa.g().a(paramString1, paramString2, paramBundle);
          }
        }
      }
      paramaa = new h(paramString1);
    }
    else
    {
      paramaa = new h(new Bundle());
    }
    this.f = paramaa;
  }
  
  private f(aa paramaa, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, h paramh)
  {
    com.google.android.gms.common.internal.t.b(paramString2);
    com.google.android.gms.common.internal.t.b(paramString3);
    com.google.android.gms.common.internal.t.a(paramh);
    this.a = paramString2;
    this.b = paramString3;
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = null;
    }
    this.c = str;
    this.d = paramLong1;
    this.e = paramLong2;
    paramLong1 = this.e;
    if ((paramLong1 != 0L) && (paramLong1 > this.d)) {
      paramaa.c().v().a("Event created with reverse previous/current timestamps. appId, name", v.a(paramString2), v.a(paramString3));
    }
    this.f = paramh;
  }
  
  final f a(aa paramaa, long paramLong)
  {
    return new f(paramaa, this.c, this.a, this.b, this.d, paramLong, this.f);
  }
  
  public final String toString()
  {
    String str1 = this.a;
    String str2 = this.b;
    String str3 = String.valueOf(this.f);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str1).length() + 33 + String.valueOf(str2).length() + String.valueOf(str3).length());
    localStringBuilder.append("Event{appId='");
    localStringBuilder.append(str1);
    localStringBuilder.append("', name='");
    localStringBuilder.append(str2);
    localStringBuilder.append("', params=");
    localStringBuilder.append(str3);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */