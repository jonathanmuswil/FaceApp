package io.faceapp.ui.image_editor.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.z;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.faceapp.l;
import oXa;

public final class CustomSeekBar
  extends z
{
  private final Rect b = new Rect();
  private final Paint c = new Paint();
  private int d = -16776961;
  private int e = -7829368;
  private float f = 10.0F;
  private int g;
  private boolean h;
  
  public CustomSeekBar(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public CustomSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public CustomSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private final void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    Context localContext = null;
    try
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, l.CustomSeekBar);
      if (paramContext != null)
      {
        localContext = paramContext;
        this.d = paramContext.getColor(2, -16776961);
        localContext = paramContext;
        this.e = paramContext.getColor(0, -7829368);
        localContext = paramContext;
        this.f = paramContext.getDimension(1, 10.0F);
        localContext = paramContext;
        this.h = getResources().getBoolean(2131034116);
      }
      return;
    }
    finally
    {
      if (localContext != null) {
        localContext.recycle();
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      oXa.b(paramCanvas, "canvas");
      this.b.set(getThumbOffset() + 0, (int)((getHeight() - this.f) / 2.0F), getWidth() - getThumbOffset(), (int)((getHeight() + this.f) / 2.0F));
      this.c.setColor(this.e);
      paramCanvas.drawRect(this.b, this.c);
      if (this.h) {
        i = -1;
      } else {
        i = 1;
      }
      if (this.h) {
        f1 = 1.0F;
      } else {
        f1 = 0.0F;
      }
      int j = getWidth();
      int k = getThumbOffset();
      float f2 = this.g * i / getMax() + f1;
      float f1 = (getProgress() - this.g) / getMax();
      int m = getThumbOffset();
      float f3 = j - k * 2;
      m += (int)(f3 * f2);
      int i = getThumbOffset() + (int)(f3 * (f2 + i * f1));
      this.b.set(Math.min(m, i), (int)((getHeight() - this.f) / 2.0F), Math.max(m, i), (int)((getHeight() + this.f) / 2.0F));
      this.c.setColor(this.d);
      paramCanvas.drawRect(this.b, this.c);
      super.onDraw(paramCanvas);
      return;
    }
    finally {}
  }
  
  public final void setZeroPoint(int paramInt)
  {
    this.g = paramInt;
    invalidate();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/CustomSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */