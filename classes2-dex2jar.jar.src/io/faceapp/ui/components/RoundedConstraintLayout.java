package io.faceapp.ui.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import io.faceapp.l;
import oXa;

public final class RoundedConstraintLayout
  extends ConstraintLayout
{
  private float A;
  private int B;
  private Path u = new Path();
  private Path v = new Path();
  private Path w = new Path();
  private Paint x = new Paint(1);
  private boolean y;
  private float z;
  
  public RoundedConstraintLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramAttributeSet != null) {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, l.RoundedConstraintLayout, 0, 0);
    }
    try
    {
      this.y = paramAttributeSet.getBoolean(1, this.y);
      this.z = paramAttributeSet.getDimension(0, this.z);
      this.A = paramAttributeSet.getDimension(3, this.A);
      this.B = paramAttributeSet.getColor(2, this.B);
      paramAttributeSet.recycle();
    }
    finally
    {
      paramAttributeSet.recycle();
    }
    this.x.setColor(this.B);
    this.x.setStrokeWidth(this.A);
    setWillNotDraw(false);
  }
  
  private final void a(Canvas paramCanvas)
  {
    float f2;
    if (this.y)
    {
      float f1 = getWidth();
      f2 = 2;
      f1 /= f2;
      float f3 = getHeight() / f2;
      paramCanvas.drawCircle(f1, f3, Math.min(f1, f3) - this.A / f2, this.x);
    }
    else
    {
      f2 = this.A / 2;
      RectF localRectF = new RectF(f2, f2, getWidth() - f2, getHeight() - f2);
      f2 = this.z;
      paramCanvas.drawRoundRect(localRectF, f2, f2, this.x);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    paramCanvas.save();
    paramCanvas.clipPath(this.w, Region.Op.DIFFERENCE);
    super.draw(paramCanvas);
    paramCanvas.restore();
    if (this.A > 0) {
      a(paramCanvas);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (isInEditMode()) {
      return;
    }
    float f1 = getWidth();
    float f2 = getHeight();
    float f3 = 0.0F;
    RectF localRectF = new RectF(0.0F, 0.0F, f1, f2);
    this.v.reset();
    this.v.addRect(localRectF, Path.Direction.CW);
    this.v.close();
    f1 = this.A;
    if (f1 > 0) {
      f3 = f1 * 0.25F;
    }
    f2 = getWidth();
    f1 = 2;
    float f4 = f3 * f1;
    localRectF = new RectF(f3, f3, f2 - f4, getHeight() - f4);
    this.u.reset();
    if (this.y)
    {
      f3 = getWidth() / f1;
      f2 = getHeight() / f1;
      f1 = Math.min(localRectF.width() / f1, localRectF.height() / f1);
      this.u.addCircle(f3, f2, f1, Path.Direction.CW);
    }
    else
    {
      Path localPath = this.u;
      f3 = this.z;
      localPath.addRoundRect(localRectF, f3, f3, Path.Direction.CW);
    }
    this.u.close();
    this.w.reset();
    this.w.op(this.u, this.v, Path.Op.REVERSE_DIFFERENCE);
    this.w.close();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/RoundedConstraintLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */