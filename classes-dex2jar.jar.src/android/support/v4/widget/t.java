package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class t
  extends h
{
  private int i;
  private int j;
  private LayoutInflater k;
  
  @Deprecated
  public t(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean)
  {
    super(paramContext, paramCursor, paramBoolean);
    this.j = paramInt;
    this.i = paramInt;
    this.k = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.k.inflate(this.j, paramViewGroup, false);
  }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.k.inflate(this.i, paramViewGroup, false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/widget/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */