package android.support.v7.preference;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;

class k
  implements View.OnKeyListener
{
  k(SeekBarPreference paramSeekBarPreference) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() != 0) {
      return false;
    }
    if ((!this.a.N) && ((paramInt == 21) || (paramInt == 22))) {
      return false;
    }
    if ((paramInt != 23) && (paramInt != 66))
    {
      paramView = this.a.L;
      if (paramView == null)
      {
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
      }
      return paramView.onKeyDown(paramInt, paramKeyEvent);
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */