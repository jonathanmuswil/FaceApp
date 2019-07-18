package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.t;

public class c
  extends DialogFragment
{
  private Dialog a = null;
  private DialogInterface.OnCancelListener b = null;
  
  public static c a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    c localc = new c();
    t.a(paramDialog, "Cannot display null dialog");
    paramDialog = (Dialog)paramDialog;
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localc.a = paramDialog;
    if (paramOnCancelListener != null) {
      localc.b = paramOnCancelListener;
    }
    return localc;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    DialogInterface.OnCancelListener localOnCancelListener = this.b;
    if (localOnCancelListener != null) {
      localOnCancelListener.onCancel(paramDialogInterface);
    }
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.a == null) {
      setShowsDialog(false);
    }
    return this.a;
  }
  
  public void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/common/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */