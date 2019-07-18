package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class pp
  implements DialogInterface.OnClickListener
{
  pp(JsPromptResult paramJsPromptResult, EditText paramEditText) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.confirm(this.b.getText().toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */