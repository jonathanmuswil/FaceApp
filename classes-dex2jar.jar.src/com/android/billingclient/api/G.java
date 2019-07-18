package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

public abstract class g
{
  public static a a(Context paramContext)
  {
    return new a(paramContext, null);
  }
  
  public abstract D a(Activity paramActivity, B paramB);
  
  public abstract D a(String paramString);
  
  public abstract void a();
  
  public abstract void a(K paramK, L paramL);
  
  public abstract void a(b paramb, c paramc);
  
  public abstract void a(z paramz);
  
  public abstract F.a b(String paramString);
  
  public abstract boolean b();
  
  public static final class a
  {
    private final Context a;
    private int b = 0;
    private int c = 0;
    private boolean d;
    private H e;
    
    private a(Context paramContext)
    {
      this.a = paramContext;
    }
    
    public a a(H paramH)
    {
      this.e = paramH;
      return this;
    }
    
    public g a()
    {
      Context localContext = this.a;
      if (localContext != null)
      {
        H localH = this.e;
        if (localH != null)
        {
          boolean bool = this.d;
          if (bool == true) {
            return new y(localContext, this.b, this.c, bool, localH);
          }
          throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
        }
        throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
      }
      throw new IllegalArgumentException("Please provide a valid Context.");
    }
    
    public a b()
    {
      this.d = true;
      return this;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/android/billingclient/api/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */