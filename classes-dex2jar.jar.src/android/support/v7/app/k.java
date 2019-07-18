package android.support.v7.app;

import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

class k
  implements AdapterView.OnItemClickListener
{
  k(AlertController.a parama, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.c.F;
    if (paramAdapterView != null) {
      paramAdapterView[paramInt] = this.a.isItemChecked(paramInt);
    }
    this.c.J.onClick(this.b.b, paramInt, this.a.isItemChecked(paramInt));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */