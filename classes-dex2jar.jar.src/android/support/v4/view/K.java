package android.support.v4.view;

import android.view.MotionEvent;

public final class k
{
  public static boolean a(MotionEvent paramMotionEvent, int paramInt)
  {
    boolean bool;
    if ((paramMotionEvent.getSource() & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */