package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.os.Handler;
import android.widget.Button;
import java.util.concurrent.TimeUnit;
import rn;

class mb
  implements Runnable
{
  mb(nb.a parama, long paramLong, Button paramButton) {}
  
  public void run()
  {
    if (!this.c.isAdded()) {
      return;
    }
    long l = TimeUnit.MILLISECONDS.toSeconds(this.a - System.currentTimeMillis());
    if (l > 0L)
    {
      this.b.setText(this.c.getString(rn.com_accountkit_button_resend_code_in, new Object[] { Long.valueOf(l) }));
      nb.a.b(this.c).postDelayed(this, nb.a.g());
      this.b.setEnabled(false);
    }
    else
    {
      this.b.setText(rn.com_accountkit_button_resend_sms);
      this.b.setEnabled(true);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */