import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import java.util.List;

public final class dFa
{
  public static final dFa a = new dFa();
  
  private final Bitmap a(int paramInt1, int paramInt2, Paint paramPaint)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ALPHA_8);
    Canvas localCanvas = new Canvas(localBitmap);
    paramPaint = new Paint(1);
    paramPaint.setColor(-1);
    float f1 = paramInt1;
    float f2 = paramInt2;
    localCanvas.drawRect(0.0F, 0.0F, f1, f2, paramPaint);
    paramPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    float f3 = 2;
    f1 /= f3;
    f3 = f2 / f3;
    localCanvas.drawCircle(f1, f3, Math.min(f1, f3), paramPaint);
    oXa.a(localBitmap, "mask");
    return localBitmap;
  }
  
  private final Bitmap a(Context paramContext, Uri paramUri, float paramFloat)
  {
    int i = (int)(paramContext.getResources().getDimensionPixelSize(2131165459) * paramFloat);
    Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(3);
    paramUri = WOa.a(WOa.e, new WOa.d(paramUri), 0, 0, false, 14, null);
    if (paramUri != null)
    {
      WOa localWOa = WOa.e;
      APa localAPa = UPa.a(paramUri);
      oXa.a(localBitmap, "bitmap");
      localCanvas.drawBitmap(paramUri, WOa.a(localWOa, localAPa, UPa.a(localBitmap), null, false, 12, null), localPaint);
      paramUri = a(i, i, localPaint);
      localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
      localCanvas.drawBitmap(paramUri, 0.0F, 0.0F, localPaint);
      paramUri.recycle();
      paramFloat = paramContext.getResources().getDimensionPixelSize(2131165460) * paramFloat;
      localPaint.setXfermode(null);
      localPaint.setColor(-1);
      localPaint.setStyle(Paint.Style.STROKE);
      localPaint.setStrokeWidth(paramFloat);
      float f1 = i;
      float f2 = 2;
      f1 /= f2;
      localCanvas.drawCircle(f1, f1, f1 - paramFloat / f2, localPaint);
      return localBitmap;
    }
    oXa.a();
    throw null;
  }
  
  private final void a(Matrix paramMatrix, float paramFloat)
  {
    float[] arrayOfFloat = new float[9];
    paramMatrix.getValues(arrayOfFloat);
    arrayOfFloat[0] *= paramFloat;
    arrayOfFloat[2] *= paramFloat;
    arrayOfFloat[4] *= paramFloat;
    arrayOfFloat[5] = (paramFloat * arrayOfFloat[5]);
    paramMatrix.setValues(arrayOfFloat);
  }
  
  public final Bitmap a(Context paramContext, List<? extends Uri> paramList, Matrix paramMatrix, WVa<Integer, Integer> paramWVa)
  {
    oXa.b(paramContext, "context");
    oXa.b(paramList, "uris");
    oXa.b(paramMatrix, "imageMatrix");
    oXa.b(paramWVa, "partSize");
    Bitmap localBitmap = Bitmap.createBitmap(1280, 1280, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(2);
    float f = 'Ԁ' / ((Number)paramWVa.c()).floatValue();
    a(paramMatrix, f);
    paramWVa = WOa.a(WOa.e, new WOa.d((Uri)paramList.get(1)), 0, 0, false, 14, null);
    if (paramWVa != null)
    {
      localCanvas.drawBitmap(paramWVa, paramMatrix, localPaint);
      paramWVa.recycle();
      paramList = a(paramContext, (Uri)paramList.get(0), f);
      f = paramContext.getResources().getDimensionPixelSize(2131165458) * f;
      localCanvas.drawBitmap(paramList, f, 1280 - paramList.getHeight() - f, localPaint);
      paramList.recycle();
      oXa.a(localBitmap, "bitmap");
      return localBitmap;
    }
    oXa.a();
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dFa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */