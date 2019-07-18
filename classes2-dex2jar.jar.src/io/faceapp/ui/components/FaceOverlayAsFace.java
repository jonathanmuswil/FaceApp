package io.faceapp.ui.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.View;
import ita;
import oXa;

public final class FaceOverlayAsFace
  extends View
{
  public static final a a = new a(null);
  private final Paint b = new Paint(1);
  private final Paint c = new Paint(1);
  private final Paint d = new Paint(1);
  private final RectF e = new RectF();
  private final Rect f = new Rect();
  private String g = "";
  private float h;
  private float i;
  private boolean j;
  
  public FaceOverlayAsFace(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (paramContext != null)
    {
      paramContext = paramContext.getResources();
      if (paramContext != null)
      {
        this.b.setColor(paramContext.getColor(2131099769));
        this.c.setColor(paramContext.getColor(2131099767));
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(paramContext.getDimensionPixelSize(2131165405));
        paramAttributeSet = paramContext.getString(2131689499);
        oXa.a(paramAttributeSet, "res.getString(R.string.Camera_FindAFace)");
        this.g = paramAttributeSet;
        this.d.setColor(paramContext.getColor(2131099770));
        this.d.setTextSize(paramContext.getDimensionPixelSize(2131165409));
        this.d.setTypeface(ita.d.a());
        paramAttributeSet = this.d;
        if (paramAttributeSet != null) {
          paramAttributeSet.setShadowLayer(paramContext.getDimension(2131165568), paramContext.getDimension(2131165566), paramContext.getDimension(2131165567), paramContext.getColor(2131099771));
        }
      }
    }
    this.j = true;
  }
  
  private final Path a()
  {
    float f1 = getWidth() / 375.0F;
    Matrix localMatrix = new Matrix();
    localMatrix.setScale(f1, f1);
    Path localPath = new Path();
    localPath.moveTo(182.51F, 59.56F);
    localPath.cubicTo(194.01F, 58.94F, 205.56F, 60.48F, 216.38F, 64.35F);
    localPath.cubicTo(232.42F, 69.92F, 246.65F, 80.49F, 256.81F, 94.11F);
    localPath.cubicTo(267.02F, 107.67F, 273.1F, 124.32F, 273.93F, 141.29F);
    localPath.cubicTo(274.18F, 147.43F, 273.93F, 153.62F, 273.87F, 159.8F);
    localPath.cubicTo(273.46F, 180.28F, 273.0F, 200.75F, 271.3F, 221.12F);
    localPath.cubicTo(270.78F, 227.2F, 270.26F, 233.29F, 269.03F, 239.22F);
    localPath.cubicTo(265.93F, 250.1F, 259.59F, 259.64F, 253.04F, 268.71F);
    localPath.cubicTo(242.47F, 282.69F, 230.1F, 295.63F, 215.56F, 305.53F);
    localPath.cubicTo(208.29F, 310.33F, 200.35F, 314.46F, 191.64F, 315.85F);
    localPath.cubicTo(183.44F, 317.09F, 175.29F, 314.4F, 168.02F, 310.74F);
    localPath.cubicTo(158.22F, 305.74F, 149.61F, 298.73F, 141.67F, 291.15F);
    localPath.cubicTo(131.36F, 281.25F, 122.18F, 270.11F, 114.6F, 257.94F);
    localPath.cubicTo(110.84F, 251.65F, 107.23F, 244.99F, 105.68F, 237.72F);
    localPath.cubicTo(103.67F, 225.6F, 103.11F, 213.33F, 102.44F, 201.06F);
    localPath.cubicTo(101.66F, 184.5F, 101.2F, 167.95F, 101.04F, 151.4F);
    localPath.cubicTo(100.73F, 142.84F, 101.25F, 134.12F, 103.31F, 125.77F);
    localPath.cubicTo(107.44F, 108.29F, 117.29F, 92.25F, 130.85F, 80.49F);
    localPath.cubicTo(145.13F, 68.06F, 163.64F, 60.54F, 182.51F, 59.56F);
    localPath.close();
    localPath.transform(localMatrix);
    return localPath;
  }
  
  private final void b()
  {
    if (this.j)
    {
      this.j = false;
      float f1 = getWidth();
      this.e.set(0.0F, 0.0F, f1, f1);
      Object localObject = this.d;
      String str = this.g;
      ((Paint)localObject).getTextBounds(str, 0, str.length(), this.f);
      localObject = this.e;
      float f2 = ((RectF)localObject).left;
      f1 = ((RectF)localObject).width() / 2;
      float f3 = this.f.width() / 2;
      localObject = this.e;
      float f4 = ((RectF)localObject).top;
      float f5 = ((RectF)localObject).height();
      float f6 = this.f.height();
      localObject = this.f;
      this.h = (f2 + (f1 - f3) - ((Rect)localObject).left);
      this.i = (f4 + (f5 - f6) * 0.45F + ((Rect)localObject).height() - this.f.bottom);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    b();
    paramCanvas.drawText(this.g, this.h, this.i, this.d);
    Path localPath = a();
    paramCanvas.drawPath(localPath, this.c);
    paramCanvas.clipRect(0, 0, getWidth(), getHeight());
    paramCanvas.clipPath(localPath, Region.Op.DIFFERENCE);
    paramCanvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), this.b);
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/FaceOverlayAsFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */