package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ua
  implements AdapterView.OnItemSelectedListener
{
  ua(va paramva) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt != -1)
    {
      paramAdapterView = this.a.f;
      if (paramAdapterView != null) {
        paramAdapterView.setListSelectionHidden(false);
      }
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */