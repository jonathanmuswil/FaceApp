package com.facebook.accountkit.ui;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

final class ea
  extends LinkMovementMethod
{
  private final a a;
  
  public ea(a parama)
  {
    this.a = parama;
  }
  
  public boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
    {
      int i = (int)paramMotionEvent.getX();
      int j = paramTextView.getTotalPaddingLeft();
      int k = paramTextView.getScrollX();
      int m = (int)paramMotionEvent.getY();
      int n = paramTextView.getTotalPaddingTop();
      int i1 = paramTextView.getScrollY();
      Object localObject = paramTextView.getLayout();
      i = ((Layout)localObject).getOffsetForHorizontal(((Layout)localObject).getLineForVertical(m - n + i1), i - j + k);
      localObject = (URLSpan[])paramSpannable.getSpans(i, i, URLSpan.class);
      if (localObject.length != 0)
      {
        localObject = localObject[0].getURL();
        this.a.a((String)localObject);
      }
    }
    return super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
  }
  
  static abstract interface a
  {
    public abstract void a(String paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/facebook/accountkit/ui/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */