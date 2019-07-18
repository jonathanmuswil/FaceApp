import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;

final class gxa<T>
  implements _Qa<T>
{
  gxa(Qwa paramQwa, Lka paramLka) {}
  
  public final void a(YQa<NOa<Bitmap>> paramYQa)
  {
    oXa.b(paramYQa, "emitter");
    Bitmap localBitmap1 = WOa.a(WOa.e, new WOa.d(this.a.k().d().b()), 0, 0, false, 14, null);
    if (localBitmap1 == null)
    {
      paramYQa.b(NOa.a.a());
      return;
    }
    Bitmap localBitmap2 = Bitmap.createBitmap(BXa.a(this.b.b().width() * localBitmap1.getWidth()), BXa.a(this.b.b().height() * localBitmap1.getHeight()), localBitmap1.getConfig());
    Canvas localCanvas = new Canvas(localBitmap2);
    localCanvas.drawColor(this.b.c());
    float f1 = (float)(this.b.a() * 180.0F / 3.141592653589793D);
    float f2 = this.b.d().x;
    float f3 = localBitmap1.getWidth();
    float f4 = this.b.d().y;
    float f5 = localBitmap1.getHeight();
    float f6 = -this.b.b().left;
    float f7 = localBitmap1.getWidth();
    float f8 = -this.b.b().top;
    float f9 = localBitmap1.getHeight();
    Matrix localMatrix = new Matrix();
    localMatrix.setRotate(360.0F - f1, f2 * f3, f4 * f5);
    localMatrix.postTranslate(f6 * f7, f8 * f9);
    localCanvas.drawBitmap(localBitmap1, localMatrix, new Paint(2));
    paramYQa.b(new NOa(localBitmap2));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */