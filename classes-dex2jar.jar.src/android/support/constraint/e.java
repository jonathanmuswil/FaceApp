package android.support.constraint;

import B;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;

public class e
  extends View
{
  private int a;
  private View b;
  private int c;
  
  public void a(ConstraintLayout paramConstraintLayout)
  {
    if (this.b == null) {
      return;
    }
    ConstraintLayout.a locala = (ConstraintLayout.a)getLayoutParams();
    paramConstraintLayout = (ConstraintLayout.a)this.b.getLayoutParams();
    paramConstraintLayout.la.n(0);
    locala.la.o(paramConstraintLayout.la.s());
    locala.la.g(paramConstraintLayout.la.i());
    paramConstraintLayout.la.n(8);
  }
  
  public void b(ConstraintLayout paramConstraintLayout)
  {
    if ((this.a == -1) && (!isInEditMode())) {
      setVisibility(this.c);
    }
    this.b = paramConstraintLayout.findViewById(this.a);
    paramConstraintLayout = this.b;
    if (paramConstraintLayout != null)
    {
      ((ConstraintLayout.a)paramConstraintLayout.getLayoutParams()).aa = true;
      this.b.setVisibility(0);
      setVisibility(0);
    }
  }
  
  public View getContent()
  {
    return this.b;
  }
  
  public int getEmptyVisibility()
  {
    return this.c;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (isInEditMode())
    {
      paramCanvas.drawRGB(223, 223, 223);
      Paint localPaint = new Paint();
      localPaint.setARGB(255, 210, 210, 210);
      localPaint.setTextAlign(Paint.Align.CENTER);
      localPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect localRect = new Rect();
      paramCanvas.getClipBounds(localRect);
      localPaint.setTextSize(localRect.height());
      int i = localRect.height();
      int j = localRect.width();
      localPaint.setTextAlign(Paint.Align.LEFT);
      localPaint.getTextBounds("?", 0, 1, localRect);
      paramCanvas.drawText("?", j / 2.0F - localRect.width() / 2.0F - localRect.left, i / 2.0F + localRect.height() / 2.0F - localRect.bottom, localPaint);
    }
  }
  
  public void setContentId(int paramInt)
  {
    if (this.a == paramInt) {
      return;
    }
    View localView = this.b;
    if (localView != null)
    {
      localView.setVisibility(0);
      ((ConstraintLayout.a)this.b.getLayoutParams()).aa = false;
      this.b = null;
    }
    this.a = paramInt;
    if (paramInt != -1)
    {
      localView = ((View)getParent()).findViewById(paramInt);
      if (localView != null) {
        localView.setVisibility(8);
      }
    }
  }
  
  public void setEmptyVisibility(int paramInt)
  {
    this.c = paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */