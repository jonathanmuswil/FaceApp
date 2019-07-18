package io.faceapp.ui.components;

import FVa;
import QQa;
import WVa;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import eY;
import oXa;

public class ImageDisplay
  extends FrameLayout
{
  private ScrollZoomImageView a;
  private final QQa<WVa<Float, Float>> b;
  private final QQa<Matrix> c;
  private final QQa<WVa<Integer, Integer>> d;
  private final QQa<WVa<Integer, Integer>> e;
  private boolean f;
  private boolean g;
  private boolean h;
  private final FVa<Boolean> i;
  
  public ImageDisplay(Context paramContext)
  {
    super(paramContext);
    paramContext = getContext();
    oXa.a(paramContext, "context");
    this.a = new ScrollZoomImageView(paramContext, null);
    paramContext = this.a.getClick().i();
    oXa.a(paramContext, "imageView.click.hide()");
    this.b = paramContext;
    paramContext = this.a.getMatrixChangedByUser().i();
    oXa.a(paramContext, "imageView.matrixChangedByUser.hide()");
    this.c = paramContext;
    paramContext = this.a.getImageSize().i();
    oXa.a(paramContext, "imageView.imageSize.hide()");
    this.d = paramContext;
    paramContext = this.a.getViewSize().i();
    oXa.a(paramContext, "imageView.viewSize.hide()");
    this.e = paramContext;
    this.g = true;
    paramContext = FVa.f(Boolean.valueOf(false));
    oXa.a(paramContext, "BehaviorSubject.createDefault(false)");
    this.i = paramContext;
    a();
  }
  
  public ImageDisplay(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = getContext();
    oXa.a(paramContext, "context");
    this.a = new ScrollZoomImageView(paramContext, null);
    paramContext = this.a.getClick().i();
    oXa.a(paramContext, "imageView.click.hide()");
    this.b = paramContext;
    paramContext = this.a.getMatrixChangedByUser().i();
    oXa.a(paramContext, "imageView.matrixChangedByUser.hide()");
    this.c = paramContext;
    paramContext = this.a.getImageSize().i();
    oXa.a(paramContext, "imageView.imageSize.hide()");
    this.d = paramContext;
    paramContext = this.a.getViewSize().i();
    oXa.a(paramContext, "imageView.viewSize.hide()");
    this.e = paramContext;
    this.g = true;
    paramContext = FVa.f(Boolean.valueOf(false));
    oXa.a(paramContext, "BehaviorSubject.createDefault(false)");
    this.i = paramContext;
    a();
  }
  
  public ImageDisplay(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    oXa.a(paramContext, "context");
    this.a = new ScrollZoomImageView(paramContext, null);
    paramContext = this.a.getClick().i();
    oXa.a(paramContext, "imageView.click.hide()");
    this.b = paramContext;
    paramContext = this.a.getMatrixChangedByUser().i();
    oXa.a(paramContext, "imageView.matrixChangedByUser.hide()");
    this.c = paramContext;
    paramContext = this.a.getImageSize().i();
    oXa.a(paramContext, "imageView.imageSize.hide()");
    this.d = paramContext;
    paramContext = this.a.getViewSize().i();
    oXa.a(paramContext, "imageView.viewSize.hide()");
    this.e = paramContext;
    this.g = true;
    paramContext = FVa.f(Boolean.valueOf(false));
    oXa.a(paramContext, "BehaviorSubject.createDefault(false)");
    this.i = paramContext;
    a();
  }
  
  public final void a()
  {
    addView(this.a, new FrameLayout.LayoutParams(-1, -1));
    eY.a(this.a.getLongPress(), this.a).c(new p(this));
    this.a.setTAG("ImageDisplay");
    this.a.setZoomEnabled(true);
  }
  
  public final void b()
  {
    this.a.a();
  }
  
  public final QQa<WVa<Float, Float>> getClick()
  {
    return this.b;
  }
  
  public final Drawable getImageDrawable()
  {
    return this.a.getDrawable();
  }
  
  public final Matrix getImageMatrix()
  {
    Matrix localMatrix = this.a.getImageMatrix();
    oXa.a(localMatrix, "imageView.imageMatrix");
    return localMatrix;
  }
  
  public final boolean getImageSet()
  {
    return this.f;
  }
  
  public final QQa<WVa<Integer, Integer>> getImageSize()
  {
    return this.d;
  }
  
  public final QQa<Matrix> getMatrixChanged()
  {
    return this.c;
  }
  
  public final FVa<Boolean> getOriginalWanted()
  {
    return this.i;
  }
  
  public final boolean getScrollEnabled()
  {
    return this.g;
  }
  
  public final float getScrollPercentage()
  {
    Object localObject = new float[9];
    this.a.getImageMatrix().getValues((float[])localObject);
    float f1 = Math.max(localObject[0], localObject[4]);
    float f2 = localObject[2];
    float f3 = 0.0F;
    float f4;
    int j;
    if (f2 != 0.0F)
    {
      f4 = -localObject[2];
      localObject = this.a.getDrawable();
      f2 = f4;
      if (localObject != null) {
        j = ((Drawable)localObject).getIntrinsicWidth();
      }
    }
    for (f2 = f4;; f2 = f4)
    {
      f3 = j;
      do
      {
        return f2 / (f3 * f1);
        f4 = -localObject[5];
        localObject = this.a.getDrawable();
        f2 = f4;
      } while (localObject == null);
      j = ((Drawable)localObject).getIntrinsicHeight();
    }
  }
  
  public final boolean getShowingOriginal()
  {
    return this.h;
  }
  
  public final QQa<WVa<Integer, Integer>> getViewSize()
  {
    return this.e;
  }
  
  public final void setImage(Bitmap paramBitmap)
  {
    oXa.b(paramBitmap, "image");
    this.a.setImageBitmap(paramBitmap);
  }
  
  public final void setImage(Uri paramUri)
  {
    oXa.b(paramUri, "image");
    this.a.setImageURI(paramUri);
  }
  
  public final void setImageMatrix(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "matrix");
    this.a.setImageMatrix(paramMatrix);
  }
  
  public final void setImageSet(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public final void setScrollEnabled(boolean paramBoolean)
  {
    this.a.setTouchEnabled(paramBoolean);
    this.g = paramBoolean;
  }
  
  public final void setShowingOriginal(boolean paramBoolean)
  {
    if (this.h != paramBoolean) {
      this.i.a(Boolean.valueOf(paramBoolean));
    }
    this.h = paramBoolean;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/ImageDisplay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */