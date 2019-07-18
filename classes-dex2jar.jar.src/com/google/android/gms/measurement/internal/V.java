package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.t;

public final class v
  extends xa
{
  private char c = (char)0;
  private long d = -1L;
  private String e;
  private final x f = new x(this, 6, false, false);
  private final x g = new x(this, 6, true, false);
  private final x h = new x(this, 6, false, true);
  private final x i = new x(this, 5, false, false);
  private final x j = new x(this, 5, true, false);
  private final x k = new x(this, 5, false, true);
  private final x l = new x(this, 4, false, false);
  private final x m = new x(this, 3, false, false);
  private final x n = new x(this, 2, false, false);
  
  v(aa paramaa)
  {
    super(paramaa);
  }
  
  private final String C()
  {
    try
    {
      if (this.e == null) {
        if (this.a.q() != null) {
          this.e = this.a.q();
        } else {
          this.e = wc.m();
        }
      }
      String str = this.e;
      return str;
    }
    finally {}
  }
  
  protected static Object a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return new y(paramString);
  }
  
  private static String a(boolean paramBoolean, Object paramObject)
  {
    Object localObject1 = "";
    if (paramObject == null) {
      return "";
    }
    Object localObject2 = paramObject;
    if ((paramObject instanceof Integer)) {
      localObject2 = Long.valueOf(((Integer)paramObject).intValue());
    }
    boolean bool = localObject2 instanceof Long;
    int i1 = 0;
    Long localLong;
    if (bool)
    {
      if (!paramBoolean) {
        return String.valueOf(localObject2);
      }
      localLong = (Long)localObject2;
      if (Math.abs(localLong.longValue()) < 100L) {
        return String.valueOf(localObject2);
      }
      paramObject = localObject1;
      if (String.valueOf(localObject2).charAt(0) == '-') {
        paramObject = "-";
      }
      localObject2 = String.valueOf(Math.abs(localLong.longValue()));
      long l1 = Math.round(Math.pow(10.0D, ((String)localObject2).length() - 1));
      long l2 = Math.round(Math.pow(10.0D, ((String)localObject2).length()) - 1.0D);
      localObject2 = new StringBuilder(((String)paramObject).length() + 43 + ((String)paramObject).length());
      ((StringBuilder)localObject2).append((String)paramObject);
      ((StringBuilder)localObject2).append(l1);
      ((StringBuilder)localObject2).append("...");
      ((StringBuilder)localObject2).append((String)paramObject);
      ((StringBuilder)localObject2).append(l2);
      return ((StringBuilder)localObject2).toString();
    }
    if ((localObject2 instanceof Boolean)) {
      return String.valueOf(localObject2);
    }
    if ((localObject2 instanceof Throwable))
    {
      localObject1 = (Throwable)localObject2;
      if (paramBoolean) {
        paramObject = localObject1.getClass().getName();
      } else {
        paramObject = ((Throwable)localObject1).toString();
      }
      paramObject = new StringBuilder((String)paramObject);
      localObject2 = b(aa.class.getCanonicalName());
      localObject1 = ((Throwable)localObject1).getStackTrace();
      int i2 = localObject1.length;
      while (i1 < i2)
      {
        localLong = localObject1[i1];
        if (!localLong.isNativeMethod())
        {
          String str = localLong.getClassName();
          if ((str != null) && (b(str).equals(localObject2)))
          {
            ((StringBuilder)paramObject).append(": ");
            ((StringBuilder)paramObject).append(localLong);
            break;
          }
        }
        i1++;
      }
      return ((StringBuilder)paramObject).toString();
    }
    if ((localObject2 instanceof y)) {
      return y.a((y)localObject2);
    }
    if (paramBoolean) {
      return "-";
    }
    return String.valueOf(localObject2);
  }
  
  static String a(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = "";
    String str2 = paramString;
    if (paramString == null) {
      str2 = "";
    }
    String str3 = a(paramBoolean, paramObject1);
    paramObject2 = a(paramBoolean, paramObject2);
    paramObject3 = a(paramBoolean, paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = str1;
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(str2);
      paramString = ": ";
    }
    paramObject1 = paramString;
    if (!TextUtils.isEmpty(str3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(str3);
      paramObject1 = ", ";
    }
    paramString = (String)paramObject1;
    if (!TextUtils.isEmpty((CharSequence)paramObject2))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append((String)paramObject2);
      paramString = ", ";
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  private static String b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    int i1 = paramString.lastIndexOf('.');
    if (i1 == -1) {
      return paramString;
    }
    return paramString.substring(0, i1);
  }
  
  public final x A()
  {
    return this.n;
  }
  
  public final String B()
  {
    Object localObject = f().e.a();
    if ((localObject != null) && (localObject != H.c))
    {
      String str1 = String.valueOf(((Pair)localObject).second);
      String str2 = (String)((Pair)localObject).first;
      localObject = new StringBuilder(String.valueOf(str1).length() + 1 + String.valueOf(str2).length());
      ((StringBuilder)localObject).append(str1);
      ((StringBuilder)localObject).append(":");
      ((StringBuilder)localObject).append(str2);
      return ((StringBuilder)localObject).toString();
    }
    return null;
  }
  
  protected final void a(int paramInt, String paramString)
  {
    Log.println(paramInt, C(), paramString);
  }
  
  protected final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if ((!paramBoolean1) && (a(paramInt))) {
      a(paramInt, a(false, paramString, paramObject1, paramObject2, paramObject3));
    }
    if ((!paramBoolean2) && (paramInt >= 5))
    {
      t.a(paramString);
      W localW = this.a.l();
      if (localW == null)
      {
        a(6, "Scheduler not set. Not logging error/warn");
        return;
      }
      if (!localW.l())
      {
        a(6, "Scheduler not initialized. Not logging error/warn");
        return;
      }
      int i1 = paramInt;
      if (paramInt < 0) {
        i1 = 0;
      }
      if (i1 >= 9) {
        i1 = 8;
      }
      localW.a(new w(this, i1, paramString, paramObject1, paramObject2, paramObject3));
    }
  }
  
  protected final boolean a(int paramInt)
  {
    return Log.isLoggable(C(), paramInt);
  }
  
  protected final boolean q()
  {
    return false;
  }
  
  public final x s()
  {
    return this.f;
  }
  
  public final x t()
  {
    return this.g;
  }
  
  public final x u()
  {
    return this.h;
  }
  
  public final x v()
  {
    return this.i;
  }
  
  public final x w()
  {
    return this.j;
  }
  
  public final x x()
  {
    return this.k;
  }
  
  public final x y()
  {
    return this.l;
  }
  
  public final x z()
  {
    return this.m;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */