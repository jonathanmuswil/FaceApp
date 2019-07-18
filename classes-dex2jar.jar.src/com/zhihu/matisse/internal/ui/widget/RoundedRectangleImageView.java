package com.zhihu.matisse.internal.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class RoundedRectangleImageView
  extends AppCompatImageView
{
  private float c;
  private Path d;
  private RectF e;
  
  public RoundedRectangleImageView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public RoundedRectangleImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public RoundedRectangleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    this.c = (paramContext.getResources().getDisplayMetrics().density * 2.0F);
    this.d = new Path();
    this.e = new RectF();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.clipPath(this.d);
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.e.set(0.0F, 0.0F, getWidth(), getHeight());
    Path localPath = this.d;
    RectF localRectF = this.e;
    float f = this.c;
    localPath.addRoundRect(localRectF, f, f, Path.Direction.CW);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/internal/ui/widget/RoundedRectangleImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */