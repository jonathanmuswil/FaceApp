package android.support.v7.preference;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class a
  implements AdapterView.OnItemSelectedListener
{
  a(DropDownPreference paramDropDownPreference) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt >= 0)
    {
      paramAdapterView = this.a.C()[paramInt].toString();
      if ((!paramAdapterView.equals(this.a.D())) && (this.a.a(paramAdapterView))) {
        this.a.d(paramAdapterView);
      }
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */