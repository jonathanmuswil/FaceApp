package io.faceapp.ui.image_editor.common.view;

import GVa;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import pya;

public final class p
  implements SeekBar.OnSeekBarChangeListener
{
  private int a;
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    this.a = paramInt;
    paramSeekBar = ValueRangeView.d(this.b);
    if ((paramSeekBar != null) && (paramBoolean) && (!paramSeekBar.a())) {
      ValueRangeView.b(this.b).a(Integer.valueOf(paramInt));
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    paramSeekBar = ValueRangeView.d(this.b);
    if ((paramSeekBar != null) && (paramSeekBar.a())) {
      ValueRangeView.a(this.b).a(Integer.valueOf(this.a));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */