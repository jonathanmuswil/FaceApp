package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class bb
  implements AdapterView.OnItemSelectedListener
{
  bb(SearchView paramSearchView) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.e(paramInt);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */