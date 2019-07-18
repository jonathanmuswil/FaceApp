package io.faceapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class t
  implements DialogInterface.OnClickListener
{
  public static final t a = new t();
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */