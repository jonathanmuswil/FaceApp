package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;

class x
  extends GradientDrawable
{
  private final Paint a = new Paint(1);
  private final RectF b;
  private int c;
  
  x()
  {
    c();
    this.b = new RectF();
  }
  
  private void a(Canvas paramCanvas)
  {
    if (!a(getCallback())) {
      paramCanvas.restoreToCount(this.c);
    }
  }
  
  private boolean a(Drawable.Callback paramCallback)
  {
    return paramCallback instanceof View;
  }
  
  private void b(Canvas paramCanvas)
  {
    Drawable.Callback localCallback = getCallback();
    if (a(localCallback)) {
      ((View)localCallback).setLayerType(2, null);
    } else {
      c(paramCanvas);
    }
  }
  
  private void c()
  {
    this.a.setStyle(Paint.Style.FILL_AND_STROKE);
    this.a.setColor(-1);
    this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
  }
  
  private void c(Canvas paramCanvas)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      this.c = paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null);
    } else {
      this.c = paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null, 31);
    }
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    RectF localRectF = this.b;
    if ((paramFloat1 != localRectF.left) || (paramFloat2 != localRectF.top) || (paramFloat3 != localRectF.right) || (paramFloat4 != localRectF.bottom))
    {
      this.b.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      invalidateSelf();
    }
  }
  
  void a(RectF paramRectF)
  {
    a(paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.bottom);
  }
  
  boolean a()
  {
    return this.b.isEmpty() ^ true;
  }
  
  void b()
  {
    a(0.0F, 0.0F, 0.0F, 0.0F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    b(paramCanvas);
    super.draw(paramCanvas);
    paramCanvas.drawRect(this.b, this.a);
    a(paramCanvas);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/design/widget/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */