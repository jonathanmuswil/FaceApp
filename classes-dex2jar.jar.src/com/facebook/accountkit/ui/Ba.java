package com.facebook.accountkit.ui;

import android.app.Activity;
import android.content.Intent;

public abstract class ba
  implements aa
{
  protected final g a;
  
  ba(g paramg)
  {
    this.a = paramg;
  }
  
  public void a(Activity paramActivity)
  {
    g();
  }
  
  public void b(Activity paramActivity)
  {
    Ub.a(paramActivity);
  }
  
  public boolean b()
  {
    return true;
  }
  
  protected abstract void g();
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */