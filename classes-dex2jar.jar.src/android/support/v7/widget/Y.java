package android.support.v7.widget;

import Gd;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public class y
  extends RatingBar
{
  private final w a = new w(this);
  
  public y(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.ratingBarStyle);
  }
  
  public y(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a.a(paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap localBitmap = this.a.a();
      if (localBitmap != null) {
        setMeasuredDimension(View.resolveSizeAndState(localBitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */