package com.facebook.accountkit.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.ba;
import android.util.AttributeSet;
import android.widget.EditText;

public class ClearBackgroundTextInputLayout
  extends ba
{
  public ClearBackgroundTextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void w()
  {
    if (getEditText() != null) {
      getEditText().getBackground().clearColorFilter();
    }
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    w();
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    super.setError(paramCharSequence);
    w();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ClearBackgroundTextInputLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */