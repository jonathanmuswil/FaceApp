package android.support.v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

class h
  extends ArrayAdapter<CharSequence>
{
  h(AlertController.a parama, Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence, AlertController.RecycleListView paramRecycleListView)
  {
    super(paramContext, paramInt1, paramInt2, paramArrayOfCharSequence);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramView = super.getView(paramInt, paramView, paramViewGroup);
    paramViewGroup = this.b.F;
    if ((paramViewGroup != null) && (paramViewGroup[paramInt] != 0)) {
      this.a.setItemChecked(paramInt, true);
    }
    return paramView;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */