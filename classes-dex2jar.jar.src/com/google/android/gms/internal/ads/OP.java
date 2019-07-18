package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class op
  implements DialogInterface.OnClickListener
{
  op(JsPromptResult paramJsPromptResult) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.cancel();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/google/android/gms/internal/ads/op.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */