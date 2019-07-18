package com.zhihu.matisse.ui;

import AY;
import DY;
import android.database.Cursor;
import com.zhihu.matisse.internal.ui.widget.c;
import uY;

class b
  implements Runnable
{
  b(MatisseActivity paramMatisseActivity, Cursor paramCursor) {}
  
  public void run()
  {
    this.a.moveToPosition(MatisseActivity.a(this.b).a());
    Object localObject = MatisseActivity.b(this.b);
    MatisseActivity localMatisseActivity = this.b;
    ((c)localObject).a(localMatisseActivity, MatisseActivity.a(localMatisseActivity).a());
    localObject = uY.a(this.a);
    if ((((uY)localObject).p()) && (AY.b().k)) {
      ((uY)localObject).l();
    }
    MatisseActivity.a(this.b, (uY)localObject);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */