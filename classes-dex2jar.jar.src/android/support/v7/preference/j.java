package android.support.v7.preference;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class j
  implements SeekBar.OnSeekBarChangeListener
{
  j(SeekBarPreference paramSeekBarPreference) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SeekBarPreference localSeekBarPreference = this.a;
      if (!localSeekBarPreference.K) {
        localSeekBarPreference.a(paramSeekBar);
      }
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.a.K = true;
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    this.a.K = false;
    int i = paramSeekBar.getProgress();
    SeekBarPreference localSeekBarPreference = this.a;
    if (i + localSeekBarPreference.H != localSeekBarPreference.G) {
      localSeekBarPreference.a(paramSeekBar);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */