package com.facebook.accountkit.internal;

import Sm;
import android.util.Log;
import bn;
import cn;

final class v
{
  private final bn a;
  private StringBuilder b;
  private final String c;
  
  v(bn parambn, String paramString)
  {
    this.a = parambn;
    parambn = new StringBuilder();
    parambn.append("AccountKitSDK.");
    parambn.append(paramString);
    this.c = parambn.toString();
    this.b = new StringBuilder();
  }
  
  private static void a(bn parambn, int paramInt, String paramString1, String paramString2)
  {
    if (Sm.j().a(parambn))
    {
      Object localObject = paramString1;
      if (!paramString1.startsWith("AccountKitSDK."))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("AccountKitSDK.");
        ((StringBuilder)localObject).append(paramString1);
        localObject = ((StringBuilder)localObject).toString();
      }
      Log.println(paramInt, (String)localObject, paramString2);
      if (parambn == bn.f) {
        new Exception().printStackTrace();
      }
    }
  }
  
  public static void a(bn parambn, String paramString1, String paramString2, Object... paramVarArgs)
  {
    a(parambn, 3, paramString1, String.format(paramString2, paramVarArgs));
  }
  
  private void a(String paramString, Object... paramVarArgs)
  {
    if (b()) {
      this.b.append(String.format(paramString, paramVarArgs));
    }
  }
  
  private boolean b()
  {
    return Sm.j().a(this.a);
  }
  
  public void a()
  {
    a(this.a, 3, this.c, this.b.toString());
    this.b = new StringBuilder();
  }
  
  void a(String paramString)
  {
    if (b())
    {
      StringBuilder localStringBuilder = this.b;
      localStringBuilder.append(paramString);
      localStringBuilder.append("\n");
    }
  }
  
  void a(String paramString, Object paramObject)
  {
    a("  %s:\t%s\n", new Object[] { paramString, paramObject });
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */