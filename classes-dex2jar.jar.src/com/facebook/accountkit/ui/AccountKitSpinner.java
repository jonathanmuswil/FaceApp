package com.facebook.accountkit.ui;

import android.content.Context;
import android.support.v7.widget.C;
import android.util.AttributeSet;
import android.widget.Spinner;

public class AccountKitSpinner
  extends C
{
  private a j;
  private boolean k = false;
  
  public AccountKitSpinner(Context paramContext)
  {
    super(paramContext);
  }
  
  public AccountKitSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AccountKitSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a()
  {
    this.k = false;
    a locala = this.j;
    if (locala != null) {
      locala.a();
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((this.k) && (paramBoolean)) {
      a();
    }
  }
  
  public boolean performClick()
  {
    this.k = true;
    a locala = this.j;
    if (locala != null) {
      locala.b();
    }
    return super.performClick();
  }
  
  void setOnSpinnerEventsListener(a parama)
  {
    this.j = parama;
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/AccountKitSpinner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */