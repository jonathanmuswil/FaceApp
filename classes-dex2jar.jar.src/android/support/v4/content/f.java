package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class f
  extends Handler
{
  f(g paramg, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what != 1) {
      super.handleMessage(paramMessage);
    } else {
      this.a.a();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */