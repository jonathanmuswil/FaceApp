package com.facebook.accountkit.internal;

import Vm;
import Vm.a;
import Wm;

final class m
{
  private final int a;
  private final int b;
  private final String c;
  private final String d;
  private final String e;
  private final Wm f;
  private final int g;
  
  public m(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, Wm paramWm)
  {
    this.g = paramInt1;
    this.a = paramInt2;
    this.c = paramString1;
    this.d = paramString2;
    this.b = paramInt3;
    this.e = paramString3;
    if (paramWm != null) {
      this.f = new n(this, paramWm);
    } else {
      this.f = new n(this, Vm.a.b, new O(paramInt2, paramString2));
    }
  }
  
  public m(Wm paramWm)
  {
    this(-1, paramWm.a().l(), -1, null, null, null, paramWm);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    String str = this.d;
    if (str != null) {
      return str;
    }
    return this.f.getLocalizedMessage();
  }
  
  public String c()
  {
    return this.c;
  }
  
  public Wm d()
  {
    return this.f;
  }
  
  public int e()
  {
    return this.g;
  }
  
  public int f()
  {
    return this.b;
  }
  
  public String g()
  {
    return this.e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{HttpStatus: ");
    localStringBuilder.append(this.g);
    localStringBuilder.append(", errorCode: ");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", errorType: ");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", errorMessage: ");
    localStringBuilder.append(b());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */