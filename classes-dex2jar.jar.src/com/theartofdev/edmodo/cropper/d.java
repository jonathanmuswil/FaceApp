package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.ImageView;

final class d
  extends Animation
  implements Animation.AnimationListener
{
  private final ImageView a;
  private final CropOverlayView b;
  private final float[] c = new float[8];
  private final float[] d = new float[8];
  private final RectF e = new RectF();
  private final RectF f = new RectF();
  private final float[] g = new float[9];
  private final float[] h = new float[9];
  private final RectF i = new RectF();
  private final float[] j = new float[8];
  private final float[] k = new float[9];
  
  public d(ImageView paramImageView, CropOverlayView paramCropOverlayView)
  {
    this.a = paramImageView;
    this.b = paramCropOverlayView;
    setDuration(300L);
    setFillAfter(true);
    setInterpolator(new AccelerateDecelerateInterpolator());
    setAnimationListener(this);
  }
  
  public void a(float[] paramArrayOfFloat, Matrix paramMatrix)
  {
    System.arraycopy(paramArrayOfFloat, 0, this.d, 0, 8);
    this.f.set(this.b.getCropWindowRect());
    paramMatrix.getValues(this.h);
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    RectF localRectF = this.i;
    paramTransformation = this.e;
    float f1 = paramTransformation.left;
    Object localObject = this.f;
    localRectF.left = (f1 + (((RectF)localObject).left - f1) * paramFloat);
    f1 = paramTransformation.top;
    localRectF.top = (f1 + (((RectF)localObject).top - f1) * paramFloat);
    f1 = paramTransformation.right;
    localRectF.right = (f1 + (((RectF)localObject).right - f1) * paramFloat);
    f1 = paramTransformation.bottom;
    localRectF.bottom = (f1 + (((RectF)localObject).bottom - f1) * paramFloat);
    this.b.setCropWindowRect(localRectF);
    int m = 0;
    for (int n = 0;; n++)
    {
      paramTransformation = this.j;
      if (n >= paramTransformation.length) {
        break;
      }
      localObject = this.c;
      localObject[n] += (this.d[n] - localObject[n]) * paramFloat;
    }
    this.b.a(paramTransformation, this.a.getWidth(), this.a.getHeight());
    for (n = m;; n++)
    {
      localObject = this.k;
      if (n >= localObject.length) {
        break;
      }
      paramTransformation = this.g;
      paramTransformation[n] += (this.h[n] - paramTransformation[n]) * paramFloat;
    }
    paramTransformation = this.a.getImageMatrix();
    paramTransformation.setValues(this.k);
    this.a.setImageMatrix(paramTransformation);
    this.a.invalidate();
    this.b.invalidate();
  }
  
  public void b(float[] paramArrayOfFloat, Matrix paramMatrix)
  {
    reset();
    System.arraycopy(paramArrayOfFloat, 0, this.c, 0, 8);
    this.e.set(this.b.getCropWindowRect());
    paramMatrix.getValues(this.g);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.clearAnimation();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/theartofdev/edmodo/cropper/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */