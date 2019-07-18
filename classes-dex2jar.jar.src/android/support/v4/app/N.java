package android.support.v4.app;

import android.os.Handler;
import android.os.Message;

class n
  extends Handler
{
  n(o paramo) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what != 2)
    {
      super.handleMessage(paramMessage);
    }
    else
    {
      this.a.g();
      this.a.d.i();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */