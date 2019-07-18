package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.preference.i;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

public class PreferenceImageView
  extends ImageView
{
  private int a = Integer.MAX_VALUE;
  private int b = Integer.MAX_VALUE;
  
  public PreferenceImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PreferenceImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PreferenceImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.PreferenceImageView, paramInt, 0);
    setMaxWidth(paramContext.getDimensionPixelSize(i.PreferenceImageView_maxWidth, Integer.MAX_VALUE));
    setMaxHeight(paramContext.getDimensionPixelSize(i.PreferenceImageView_maxHeight, Integer.MAX_VALUE));
    paramContext.recycle();
  }
  
  public int getMaxHeight()
  {
    return this.b;
  }
  
  public int getMaxWidth()
  {
    return this.a;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j;
    int m;
    if (i != Integer.MIN_VALUE)
    {
      j = paramInt1;
      if (i != 0) {}
    }
    else
    {
      k = View.MeasureSpec.getSize(paramInt1);
      m = getMaxWidth();
      j = paramInt1;
      if (m != Integer.MAX_VALUE) {
        if (m >= k)
        {
          j = paramInt1;
          if (i != 0) {}
        }
        else
        {
          j = View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE);
        }
      }
    }
    int k = View.MeasureSpec.getMode(paramInt2);
    if (k != Integer.MIN_VALUE)
    {
      paramInt1 = paramInt2;
      if (k != 0) {}
    }
    else
    {
      m = View.MeasureSpec.getSize(paramInt2);
      i = getMaxHeight();
      paramInt1 = paramInt2;
      if (i != Integer.MAX_VALUE) {
        if (i >= m)
        {
          paramInt1 = paramInt2;
          if (k != 0) {}
        }
        else
        {
          paramInt1 = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(j, paramInt1);
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.b = paramInt;
    super.setMaxHeight(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.a = paramInt;
    super.setMaxWidth(paramInt);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/internal/widget/PreferenceImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */