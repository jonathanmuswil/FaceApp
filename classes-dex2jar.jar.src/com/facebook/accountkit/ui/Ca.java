package com.facebook.accountkit.ui;

import android.app.Activity;
import android.app.Fragment;
import com.google.android.gms.common.api.f;

abstract class ca
  extends Ha
{
  protected Ga c()
  {
    Activity localActivity = getActivity();
    if ((localActivity != null) && ((localActivity instanceof AccountKitActivity))) {
      return ((AccountKitActivity)localActivity).p();
    }
    return null;
  }
  
  protected f d()
  {
    Activity localActivity = getActivity();
    if ((localActivity != null) && ((localActivity instanceof AccountKitActivity))) {
      return ((AccountKitActivity)localActivity).q();
    }
    return null;
  }
  
  abstract Ga e();
  
  abstract boolean f();
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */