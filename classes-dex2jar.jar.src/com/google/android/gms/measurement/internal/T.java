package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class t
  extends xa
{
  private static final AtomicReference<String[]> c = new AtomicReference();
  private static final AtomicReference<String[]> d = new AtomicReference();
  private static final AtomicReference<String[]> e = new AtomicReference();
  
  t(aa paramaa)
  {
    super(paramaa);
  }
  
  private final String a(h paramh)
  {
    if (paramh == null) {
      return null;
    }
    if (!s()) {
      return paramh.toString();
    }
    return a(paramh.y());
  }
  
  private static String a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, AtomicReference<String[]> paramAtomicReference)
  {
    com.google.android.gms.common.internal.t.a(paramArrayOfString1);
    com.google.android.gms.common.internal.t.a(paramArrayOfString2);
    com.google.android.gms.common.internal.t.a(paramAtomicReference);
    int i = paramArrayOfString1.length;
    int j = paramArrayOfString2.length;
    int k = 0;
    boolean bool;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    }
    com.google.android.gms.common.internal.t.a(bool);
    while (k < paramArrayOfString1.length)
    {
      if (hc.d(paramString, paramArrayOfString1[k])) {
        try
        {
          Object localObject = (String[])paramAtomicReference.get();
          paramString = (String)localObject;
          if (localObject == null)
          {
            paramString = new String[paramArrayOfString2.length];
            paramAtomicReference.set(paramString);
          }
          if (paramString[k] == null)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            ((StringBuilder)localObject).append(paramArrayOfString2[k]);
            ((StringBuilder)localObject).append("(");
            ((StringBuilder)localObject).append(paramArrayOfString1[k]);
            ((StringBuilder)localObject).append(")");
            paramString[k] = ((StringBuilder)localObject).toString();
          }
          paramString = paramString[k];
          return paramString;
        }
        finally {}
      }
      k++;
    }
    return paramString;
  }
  
  private final boolean s()
  {
    a();
    return (this.a.m()) && (this.a.c().a(3));
  }
  
  protected final String a(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    if (!s()) {
      return paramBundle.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (localStringBuilder.length() != 0) {
        localStringBuilder.append(", ");
      } else {
        localStringBuilder.append("Bundle[{");
      }
      localStringBuilder.append(b(str));
      localStringBuilder.append("=");
      localStringBuilder.append(paramBundle.get(str));
    }
    localStringBuilder.append("}]");
    return localStringBuilder.toString();
  }
  
  protected final String a(f paramf)
  {
    if (paramf == null) {
      return null;
    }
    if (!s()) {
      return paramf.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Event{appId='");
    localStringBuilder.append(paramf.a);
    localStringBuilder.append("', name='");
    localStringBuilder.append(a(paramf.b));
    localStringBuilder.append("', params=");
    localStringBuilder.append(a(paramf.f));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  protected final String a(k paramk)
  {
    if (paramk == null) {
      return null;
    }
    if (!s()) {
      return paramk.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("origin=");
    localStringBuilder.append(paramk.c);
    localStringBuilder.append(",name=");
    localStringBuilder.append(a(paramk.a));
    localStringBuilder.append(",params=");
    localStringBuilder.append(a(paramk.b));
    return localStringBuilder.toString();
  }
  
  protected final String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!s()) {
      return paramString;
    }
    return a(paramString, Aa.b, Aa.a, c);
  }
  
  protected final String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!s()) {
      return paramString;
    }
    return a(paramString, Ba.b, Ba.a, d);
  }
  
  protected final String c(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (!s()) {
      return paramString;
    }
    if (paramString.startsWith("_exp_"))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("experiment_id");
      localStringBuilder.append("(");
      localStringBuilder.append(paramString);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
    return a(paramString, Ca.b, Ca.a, e);
  }
  
  protected final boolean q()
  {
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */