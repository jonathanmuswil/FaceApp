package com.facebook.accountkit.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.facebook.accountkit.internal.va;

class la
  implements TextView.OnEditorActionListener
{
  la(ja.f paramf) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 5) && (!va.e(this.a.h())))
    {
      if (ja.f.c(this.a) != null) {
        ja.f.c(this.a).a(paramTextView.getContext(), S.d.name());
      }
      return true;
    }
    return false;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */