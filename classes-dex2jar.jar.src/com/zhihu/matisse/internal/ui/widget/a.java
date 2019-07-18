package com.zhihu.matisse.internal.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;

class a
  implements AdapterView.OnItemClickListener
{
  a(c paramc) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c.a(this.a, paramAdapterView.getContext(), paramInt);
    if (c.a(this.a) != null) {
      c.a(this.a).onItemSelected(paramAdapterView, paramView, paramInt, paramLong);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */