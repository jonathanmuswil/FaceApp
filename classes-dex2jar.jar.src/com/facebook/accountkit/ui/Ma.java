package com.facebook.accountkit.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;

class ma
  implements AdapterView.OnItemClickListener
{
  ma(ja.f paramf) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.a;
    paramAdapterView.c(ja.f.d(paramAdapterView).getText().toString());
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ma.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */