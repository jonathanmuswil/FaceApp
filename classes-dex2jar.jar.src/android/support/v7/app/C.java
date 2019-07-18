package android.support.v7.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;

class c
  implements View.OnClickListener
{
  c(AlertController paramAlertController) {}
  
  public void onClick(View paramView)
  {
    Object localObject = this.a;
    if (paramView == ((AlertController)localObject).o)
    {
      localObject = ((AlertController)localObject).q;
      if (localObject != null)
      {
        paramView = Message.obtain((Message)localObject);
        break label92;
      }
    }
    localObject = this.a;
    if (paramView == ((AlertController)localObject).s)
    {
      localObject = ((AlertController)localObject).u;
      if (localObject != null)
      {
        paramView = Message.obtain((Message)localObject);
        break label92;
      }
    }
    localObject = this.a;
    if (paramView == ((AlertController)localObject).w)
    {
      paramView = ((AlertController)localObject).y;
      if (paramView != null)
      {
        paramView = Message.obtain(paramView);
        break label92;
      }
    }
    paramView = null;
    label92:
    if (paramView != null) {
      paramView.sendToTarget();
    }
    paramView = this.a;
    paramView.R.obtainMessage(1, paramView.b).sendToTarget();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */