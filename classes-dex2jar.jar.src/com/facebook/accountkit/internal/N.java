package com.facebook.accountkit.internal;

import Vm.a;
import Wm;

final class n
  extends Wm
{
  private final m b;
  
  public n(m paramm, Vm.a parama, O paramO)
  {
    super(parama, paramO);
    this.b = paramm;
  }
  
  public n(m paramm, Wm paramWm)
  {
    super(paramWm.a());
    this.b = paramm;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{AccountKitServiceException: httpResponseCode: ");
    localStringBuilder.append(this.b.e());
    localStringBuilder.append(", errorCode: ");
    localStringBuilder.append(this.b.a());
    localStringBuilder.append(", errorType: ");
    localStringBuilder.append(this.b.c());
    localStringBuilder.append(", message: ");
    localStringBuilder.append(this.b.b());
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */