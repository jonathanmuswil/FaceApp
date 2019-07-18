import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

public final class hFa
{
  public static final hFa a = new hFa();
  
  private final void a(Matrix paramMatrix, float paramFloat)
  {
    float f1 = -paramFloat;
    float f2 = 2;
    paramMatrix.postTranslate(f1 / f2, 0.0F);
    paramMatrix.postScale(-1.0F, 1.0F);
    paramMatrix.postTranslate(paramFloat / f2, 0.0F);
  }
  
  private final void b(Matrix paramMatrix, float paramFloat)
  {
    float[] arrayOfFloat = new float[9];
    paramMatrix.getValues(arrayOfFloat);
    arrayOfFloat[0] *= paramFloat;
    arrayOfFloat[2] *= paramFloat;
    arrayOfFloat[4] *= paramFloat;
    arrayOfFloat[5] = (paramFloat * arrayOfFloat[5]);
    paramMatrix.setValues(arrayOfFloat);
  }
  
  public final Bitmap a(Context paramContext, List<? extends Uri> paramList, Matrix paramMatrix, int paramInt)
  {
    oXa.b(paramContext, "context");
    oXa.b(paramList, "uris");
    oXa.b(paramMatrix, "imageMatrix");
    Bitmap localBitmap = Bitmap.createBitmap(1280, 1280, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(2);
    float f1 = 'Ԁ';
    float f2 = f1 / paramInt;
    b(paramMatrix, f2);
    float f3 = paramContext.getResources().getDimensionPixelSize(2131165454) * f2;
    float f4 = (f1 - f3) / 2;
    paramContext = paramList.iterator();
    paramInt = 0;
    while (paramContext.hasNext())
    {
      paramList = paramContext.next();
      if (paramInt >= 0)
      {
        paramList = (Uri)paramList;
        paramList = WOa.a(WOa.e, new WOa.d(paramList), 0, 0, false, 14, null);
        if (paramList != null)
        {
          if (paramInt == 0) {
            f2 = 0.0F;
          } else {
            f2 = f1 - f4;
          }
          if (paramInt > 0) {
            a.a(paramMatrix, f4);
          }
          localCanvas.save();
          localCanvas.translate(f2, 0.0F);
          oXa.a(localBitmap, "bitmap");
          localCanvas.clipRect(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
          localCanvas.drawBitmap(paramList, paramMatrix, localPaint);
          localCanvas.restore();
          paramList.recycle();
          paramInt++;
        }
        else
        {
          oXa.a();
          throw null;
        }
      }
      else
      {
        mWa.c();
        throw null;
      }
    }
    localPaint.setStrokeWidth(f3);
    localPaint.setColor(-1);
    oXa.a(localBitmap, "bitmap");
    f2 = localBitmap.getWidth() / 2.0F;
    localCanvas.drawLine(f2, 0.0F, f2, localBitmap.getHeight(), localPaint);
    return localBitmap;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */