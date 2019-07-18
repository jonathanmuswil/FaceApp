package android.support.v7.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public abstract class TwoStatePreference
  extends Preference
{
  private CharSequence G;
  private CharSequence H;
  protected boolean I;
  private boolean J;
  private boolean K;
  
  public TwoStatePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TwoStatePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public TwoStatePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public boolean A()
  {
    return this.I;
  }
  
  protected Object a(TypedArray paramTypedArray, int paramInt)
  {
    return Boolean.valueOf(paramTypedArray.getBoolean(paramInt, false));
  }
  
  public void a(CharSequence paramCharSequence)
  {
    this.H = paramCharSequence;
    if (!A()) {
      l();
    }
  }
  
  protected void b(View paramView)
  {
    if (!(paramView instanceof TextView)) {
      return;
    }
    TextView localTextView = (TextView)paramView;
    int i = 1;
    if ((this.I) && (!TextUtils.isEmpty(this.G))) {
      localTextView.setText(this.G);
    }
    for (;;)
    {
      j = 0;
      break;
      j = i;
      if (this.I) {
        break;
      }
      j = i;
      if (TextUtils.isEmpty(this.H)) {
        break;
      }
      localTextView.setText(this.H);
    }
    i = j;
    if (j != 0)
    {
      paramView = g();
      i = j;
      if (!TextUtils.isEmpty(paramView))
      {
        localTextView.setText(paramView);
        i = 0;
      }
    }
    int j = 8;
    if (i == 0) {
      j = 0;
    }
    if (j != localTextView.getVisibility()) {
      localTextView.setVisibility(j);
    }
  }
  
  public void b(CharSequence paramCharSequence)
  {
    this.G = paramCharSequence;
    if (A()) {
      l();
    }
  }
  
  public void d(boolean paramBoolean)
  {
    int i;
    if (this.I != paramBoolean) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) || (!this.J))
    {
      this.I = paramBoolean;
      this.J = true;
      c(paramBoolean);
      if (i != 0)
      {
        b(y());
        l();
      }
    }
  }
  
  public void e(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  protected void w()
  {
    super.w();
    boolean bool = A() ^ true;
    if (a(Boolean.valueOf(bool))) {
      d(bool);
    }
  }
  
  public boolean y()
  {
    boolean bool1 = this.K;
    boolean bool2 = true;
    if (bool1) {
      bool1 = this.I;
    } else if (!this.I) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool3 = bool2;
    if (!bool1) {
      if (super.y()) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/TwoStatePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */