package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

class i
  extends CursorAdapter
{
  private final int a;
  private final int b;
  
  i(AlertController.a parama, Context paramContext, Cursor paramCursor, boolean paramBoolean, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController)
  {
    super(paramContext, paramCursor, paramBoolean);
    parama = getCursor();
    this.a = parama.getColumnIndexOrThrow(this.e.L);
    this.b = parama.getColumnIndexOrThrow(this.e.M);
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    ((CheckedTextView)paramView.findViewById(16908308)).setText(paramCursor.getString(this.a));
    paramView = this.c;
    int i = paramCursor.getPosition();
    int j = paramCursor.getInt(this.b);
    boolean bool = true;
    if (j != 1) {
      bool = false;
    }
    paramView.setItemChecked(i, bool);
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.e.b.inflate(this.d.M, paramViewGroup, false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */