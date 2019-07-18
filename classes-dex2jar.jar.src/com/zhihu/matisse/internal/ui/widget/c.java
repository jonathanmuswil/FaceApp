package com.zhihu.matisse.internal.ui.widget;

import OY;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.va;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CursorAdapter;
import android.widget.TextView;
import iY;
import uY;

public class c
{
  private CursorAdapter a;
  private TextView b;
  private va c;
  private AdapterView.OnItemSelectedListener d;
  
  public c(Context paramContext)
  {
    this.c = new va(paramContext, null, iY.listPopupWindowStyle);
    this.c.a(true);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.c.b((int)(216.0F * f));
    this.c.e((int)(16.0F * f));
    this.c.i((int)(f * -48.0F));
    this.c.a(new a(this));
  }
  
  private void b(Context paramContext, int paramInt)
  {
    this.c.dismiss();
    Object localObject = this.a.getCursor();
    ((Cursor)localObject).moveToPosition(paramInt);
    localObject = uY.a((Cursor)localObject).a(paramContext);
    if (this.b.getVisibility() == 0)
    {
      this.b.setText((CharSequence)localObject);
    }
    else if (OY.a())
    {
      this.b.setAlpha(0.0F);
      this.b.setVisibility(0);
      this.b.setText((CharSequence)localObject);
      this.b.animate().alpha(1.0F).setDuration(paramContext.getResources().getInteger(17694722)).start();
    }
    else
    {
      this.b.setVisibility(0);
      this.b.setText((CharSequence)localObject);
    }
  }
  
  public void a(Context paramContext, int paramInt)
  {
    this.c.h(paramInt);
    b(paramContext, paramInt);
  }
  
  public void a(View paramView)
  {
    this.c.b(paramView);
  }
  
  public void a(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.d = paramOnItemSelectedListener;
  }
  
  public void a(CursorAdapter paramCursorAdapter)
  {
    this.c.a(paramCursorAdapter);
    this.a = paramCursorAdapter;
  }
  
  public void a(TextView paramTextView)
  {
    this.b = paramTextView;
    paramTextView = this.b.getCompoundDrawablesRelative()[2];
    TypedArray localTypedArray = this.b.getContext().getTheme().obtainStyledAttributes(new int[] { iY.album_element_color });
    int i = localTypedArray.getColor(0, 0);
    localTypedArray.recycle();
    paramTextView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    this.b.setVisibility(8);
    this.b.setOnClickListener(new b(this));
    paramTextView = this.b;
    paramTextView.setOnTouchListener(this.c.a(paramTextView));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */