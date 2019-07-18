package com.zhihu.matisse.internal.ui.widget;

import android.content.res.Resources;
import android.support.v7.widget.va;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CursorAdapter;
import jY;

class b
  implements View.OnClickListener
{
  b(c paramc) {}
  
  public void onClick(View paramView)
  {
    int i = paramView.getResources().getDimensionPixelSize(jY.album_item_height);
    paramView = c.c(this.a);
    if (c.b(this.a).getCount() > 6) {
      i *= 6;
    } else {
      i *= c.b(this.a).getCount();
    }
    paramView.d(i);
    c.c(this.a).K();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */