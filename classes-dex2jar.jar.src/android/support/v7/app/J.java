package android.support.v7.app;

import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class j
  implements AdapterView.OnItemClickListener
{
  j(AlertController.a parama, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.x.onClick(this.a.b, paramInt);
    if (!this.b.H) {
      this.a.b.dismiss();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */