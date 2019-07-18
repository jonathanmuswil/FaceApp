package com.facebook.accountkit.ui;

import android.text.Editable;
import android.text.TextWatcher;

class ka
  implements TextWatcher
{
  ka(ja.f paramf) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (ja.f.b(this.a) != null) {
      ja.f.b(this.a).a();
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */