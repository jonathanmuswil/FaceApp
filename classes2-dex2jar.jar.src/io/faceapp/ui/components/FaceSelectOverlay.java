package io.faceapp.ui.components;

import APa;
import KOa;
import QQa;
import aW;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import eY;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mWa;
import oXa;
import vka;

public final class FaceSelectOverlay
  extends View
{
  private final Paint a;
  private final Paint b;
  private final RectF c;
  private Bitmap d;
  private Canvas e;
  private List<? extends RectF> f;
  private boolean g;
  private Matrix h;
  
  public FaceSelectOverlay(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setWillNotDraw(false);
    paramContext = aW.c(this);
    oXa.a(paramContext, "RxView.layoutChangeEvents(this)");
    eY.a(paramContext, this).c(new m(this));
    paramContext = new Paint();
    paramContext.setColor((int)4294967295L);
    paramContext.setStyle(Paint.Style.STROKE);
    paramContext.setStrokeWidth(KOa.b.a(2.0F));
    this.a = paramContext;
    paramContext = new Paint();
    paramContext.setColor((int)4278190080L);
    paramContext.setStyle(Paint.Style.FILL);
    paramContext.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    this.b = paramContext;
    this.c = new RectF();
    this.g = true;
    this.h = new Matrix();
  }
  
  public final void a(List<vka> paramList, APa paramAPa)
  {
    oXa.b(paramList, "faces");
    oXa.b(paramAPa, "imageSize");
    ArrayList localArrayList = new ArrayList(mWa.a(paramList, 10));
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((vka)paramList.next()).a(paramAPa));
    }
    this.f = mWa.f(localArrayList);
    invalidate();
  }
  
  public final Bitmap getBitmap()
  {
    return this.d;
  }
  
  public final Matrix getImageMatrix()
  {
    return this.h;
  }
  
  public final boolean getOverlayEnabled()
  {
    return this.g;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    oXa.b(paramCanvas, "canvas");
    Bitmap localBitmap = this.d;
    if (localBitmap != null)
    {
      localBitmap.eraseColor(0);
      if (this.g)
      {
        Object localObject1 = this.f;
        if ((localObject1 != null) && (localObject1 != null))
        {
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            Object localObject2 = (RectF)((Iterator)localObject1).next();
            this.c.set((RectF)localObject2);
            this.h.mapRect(this.c);
            localObject2 = this.e;
            if (localObject2 != null) {
              ((Canvas)localObject2).drawRect(this.c, this.a);
            }
            localObject2 = this.e;
            if (localObject2 != null) {
              ((Canvas)localObject2).drawRect(this.c, this.b);
            }
          }
        }
      }
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, null);
    }
  }
  
  public final void setBitmap(Bitmap paramBitmap)
  {
    this.d = paramBitmap;
    this.e = new Canvas(this.d);
  }
  
  public final void setImageMatrix(Matrix paramMatrix)
  {
    oXa.b(paramMatrix, "value");
    this.h.set(paramMatrix);
    invalidate();
  }
  
  public final void setOverlayEnabled(boolean paramBoolean)
  {
    this.g = paramBoolean;
    invalidate();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/FaceSelectOverlay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */