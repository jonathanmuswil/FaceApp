package com.rd;

import android.database.DataSetObserver;

class b
  extends DataSetObserver
{
  b(PageIndicatorView paramPageIndicatorView) {}
  
  public void onChanged()
  {
    PageIndicatorView.a(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/rd/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */