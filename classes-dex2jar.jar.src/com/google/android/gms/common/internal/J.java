package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public abstract class j
{
  private static final Object a = new Object();
  private static j b;
  
  public static j a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null)
      {
        K localK = new com/google/android/gms/common/internal/K;
        localK.<init>(paramContext.getApplicationContext());
        b = localK;
      }
      return b;
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3)
  {
    b(new a(paramString1, paramString2, paramInt), paramServiceConnection, paramString3);
  }
  
  protected abstract boolean a(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  protected abstract void b(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  protected static final class a
  {
    private final String a;
    private final String b;
    private final ComponentName c;
    private final int d;
    
    public a(String paramString1, String paramString2, int paramInt)
    {
      t.b(paramString1);
      this.a = paramString1;
      t.b(paramString2);
      this.b = paramString2;
      this.c = null;
      this.d = paramInt;
    }
    
    public final ComponentName a()
    {
      return this.c;
    }
    
    public final Intent a(Context paramContext)
    {
      paramContext = this.a;
      if (paramContext != null) {
        paramContext = new Intent(paramContext).setPackage(this.b);
      } else {
        paramContext = new Intent().setComponent(this.c);
      }
      return paramContext;
    }
    
    public final String b()
    {
      return this.b;
    }
    
    public final int c()
    {
      return this.d;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      return (r.a(this.a, ((a)paramObject).a)) && (r.a(this.b, ((a)paramObject).b)) && (r.a(this.c, ((a)paramObject).c)) && (this.d == ((a)paramObject).d);
    }
    
    public final int hashCode()
    {
      return r.a(new Object[] { this.a, this.b, this.c, Integer.valueOf(this.d) });
    }
    
    public final String toString()
    {
      String str1 = this.a;
      String str2 = str1;
      if (str1 == null) {
        str2 = this.c.flattenToString();
      }
      return str2;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */