package android.support.v7.widget;

import android.view.View;

class ta
  implements Runnable
{
  ta(va paramva) {}
  
  public void run()
  {
    View localView = this.a.b();
    if ((localView != null) && (localView.getWindowToken() != null)) {
      this.a.K();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */