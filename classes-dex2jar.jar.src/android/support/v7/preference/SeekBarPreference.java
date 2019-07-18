package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.OnKeyListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class SeekBarPreference
  extends Preference
{
  int G;
  int H;
  private int I;
  private int J;
  boolean K;
  SeekBar L;
  private TextView M;
  boolean N;
  private boolean O;
  private SeekBar.OnSeekBarChangeListener P = new j(this);
  private View.OnKeyListener Q = new k(this);
  
  public SeekBarPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, f.seekBarPreferenceStyle);
  }
  
  public SeekBarPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public SeekBarPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.SeekBarPreference, paramInt1, paramInt2);
    this.H = paramContext.getInt(i.SeekBarPreference_min, 0);
    c(paramContext.getInt(i.SeekBarPreference_android_max, 100));
    d(paramContext.getInt(i.SeekBarPreference_seekBarIncrement, 0));
    this.N = paramContext.getBoolean(i.SeekBarPreference_adjustable, true);
    this.O = paramContext.getBoolean(i.SeekBarPreference_showSeekBarValue, true);
    paramContext.recycle();
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    int i = this.H;
    int j = paramInt;
    if (paramInt < i) {
      j = i;
    }
    i = this.I;
    paramInt = j;
    if (j > i) {
      paramInt = i;
    }
    if (paramInt != this.G)
    {
      this.G = paramInt;
      TextView localTextView = this.M;
      if (localTextView != null) {
        localTextView.setText(String.valueOf(this.G));
      }
      b(paramInt);
      if (paramBoolean) {
        l();
      }
    }
  }
  
  protected Object a(TypedArray paramTypedArray, int paramInt)
  {
    return Integer.valueOf(paramTypedArray.getInt(paramInt, 0));
  }
  
  void a(SeekBar paramSeekBar)
  {
    int i = this.H + paramSeekBar.getProgress();
    if (i != this.G) {
      if (a(Integer.valueOf(i))) {
        a(i, false);
      } else {
        paramSeekBar.setProgress(this.G - this.H);
      }
    }
  }
  
  public final void c(int paramInt)
  {
    int i = this.H;
    int j = paramInt;
    if (paramInt < i) {
      j = i;
    }
    if (j != this.I)
    {
      this.I = j;
      l();
    }
  }
  
  public final void d(int paramInt)
  {
    if (paramInt != this.J)
    {
      this.J = Math.min(this.I - this.H, Math.abs(paramInt));
      l();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/SeekBarPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */