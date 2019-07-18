package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.s;
import com.google.android.gms.common.internal.t;

public class l
  extends h
{
  private Dialog ha = null;
  private DialogInterface.OnCancelListener ia = null;
  
  public static l a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    l locall = new l();
    t.a(paramDialog, "Cannot display null dialog");
    paramDialog = (Dialog)paramDialog;
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    locall.ha = paramDialog;
    if (paramOnCancelListener != null) {
      locall.ia = paramOnCancelListener;
    }
    return locall;
  }
  
  public void a(s params, String paramString)
  {
    super.a(params, paramString);
  }
  
  public Dialog n(Bundle paramBundle)
  {
    if (this.ha == null) {
      B(false);
    }
    return this.ha;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = this.ia;
    if (localOnCancelListener != null) {
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */