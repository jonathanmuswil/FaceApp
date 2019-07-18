import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public final class qCa
{
  private final File a;
  private final tBa<File> b;
  private final Eda c;
  
  public qCa(Eda paramEda)
  {
    this.c = paramEda;
    this.a = uBa.a("background.jpg");
    this.b = new tBa();
  }
  
  private final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, float paramFloat)
  {
    return xBa.a.a(paramBitmap1, paramBitmap2, paramBitmap3, paramFloat);
  }
  
  private final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, boolean paramBoolean, PointF paramPointF)
  {
    if (!paramBoolean) {
      return paramBitmap3;
    }
    paramBitmap2 = oya.a(paramBitmap2, 0.3F, oya.b(paramPointF) * 20.0F + 1.0F);
    paramPointF = new PointF(-oya.b(paramPointF) * (float)Math.sin(oya.c(paramPointF)) / 10.0F, oya.b(paramPointF) * (float)Math.cos(oya.c(paramPointF)) / 10.0F);
    paramBitmap1 = xBa.a.a(paramBitmap1, paramBitmap2, paramBitmap3, paramPointF);
    paramBitmap2.recycle();
    return paramBitmap1;
  }
  
  private final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, RectF paramRectF1, RectF paramRectF2)
  {
    Bitmap localBitmap = paramBitmap2.copy(Bitmap.Config.ARGB_8888, true);
    Paint localPaint = new Paint();
    localPaint.setFilterBitmap(true);
    Canvas localCanvas = new Canvas(localBitmap);
    RectF localRectF = new RectF(paramRectF2);
    localRectF.left -= paramRectF1.left * paramRectF2.width() / paramRectF1.width();
    localRectF.right += (1.0F - paramRectF1.right) * paramRectF2.width() / paramRectF1.width();
    localRectF.top -= paramRectF1.top * paramRectF2.height() / paramRectF1.height();
    localRectF.bottom += (1.0F - paramRectF1.bottom) * paramRectF2.height() / paramRectF1.height();
    localCanvas.drawBitmap(paramBitmap1, oya.a(paramBitmap1), oya.b(paramBitmap2, localRectF), localPaint);
    localCanvas.drawBitmap(paramBitmap2, 0.0F, 0.0F, localPaint);
    oXa.a(localBitmap, "result");
    return localBitmap;
  }
  
  public final oBa a(BPa paramBPa, AtomicInteger paramAtomicInteger, GVa<pBa> paramGVa, oBa paramoBa)
  {
    oXa.b(paramBPa, "tracer");
    oXa.b(paramAtomicInteger, "inputFlag");
    oXa.b(paramGVa, "progress");
    oXa.b(paramoBa, "cfg");
    nBa.a();
    paramBPa.a("background");
    int i = paramoBa.e();
    Object localObject1 = paramoBa.g();
    boolean bool1 = oya.i(paramoBa.a());
    Object localObject2 = oya.e(oya.a(paramoBa.a()));
    paramBPa = oya.g(oya.a(paramoBa.a()));
    RectF localRectF1 = oya.f(oya.a(paramoBa.a()));
    RectF localRectF2 = oya.k(oya.a(paramoBa.a()));
    boolean bool2 = oya.q(oya.a(paramoBa.a()));
    float f1 = oya.a(oya.a(paramoBa.a()), pya.a.i);
    Object localObject3 = oya.m(oya.a(paramoBa.a()));
    String str = HCa.a("back", new Object[] { paramoBa.f().c(), localObject1, localObject2, paramBPa, localRectF1, localRectF2, Boolean.valueOf(bool2), Float.valueOf(f1), localObject3 });
    Object localObject4 = pBa.c.b;
    if (i != paramAtomicInteger.get()) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    HCa.a(paramGVa, (pBa)localObject4, bool3);
    int j;
    if (((CharSequence)localObject2).length() == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      return paramoBa;
    }
    localObject4 = this.b;
    if ((bool1) && (paramoBa.f().b())) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    localObject4 = (File)((tBa)localObject4).a(bool3).a(str);
    if (localObject4 != null) {
      return oBa.a(paramoBa, 0, null, _Aa.a.a((File)localObject4, str, true), null, null, null, null, 123, null);
    }
    localObject1 = (zha.a)HCa.a(this.c.h((String)localObject1), new pCa(paramGVa, i, paramAtomicInteger));
    if ((((String)localObject2).hashCode() == -1801473548) && (((String)localObject2).equals("android-gallery"))) {
      paramBPa = new WOa.d(paramBPa);
    } else {
      paramBPa = new WOa.b((File)HCa.a(this.c.a(paramBPa), new oCa(paramGVa, i, paramAtomicInteger)));
    }
    localObject2 = pBa.a.b;
    if (i != paramAtomicInteger.get()) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    HCa.a(paramGVa, (pBa)localObject2, bool3);
    paramGVa = paramoBa.f().a();
    localObject2 = HCa.a((zha.a)localObject1);
    paramAtomicInteger = HCa.a(paramBPa);
    localObject4 = oya.a(paramAtomicInteger, 0.03F, 20.0F);
    float f2;
    if (bool2) {
      f2 = 3.0F;
    } else {
      f2 = 1.0F;
    }
    localObject1 = a(paramGVa, (Bitmap)localObject2, (Bitmap)localObject4, f1 / f2);
    paramBPa = paramAtomicInteger;
    localObject3 = a(paramGVa, (Bitmap)localObject2, paramAtomicInteger, bool2, (PointF)localObject3);
    paramGVa.recycle();
    ((Bitmap)localObject2).recycle();
    ((Bitmap)localObject4).recycle();
    boolean bool3 = oXa.a(localObject3, paramBPa);
    paramGVa = null;
    if (!(bool3 ^ true)) {
      paramBPa = null;
    }
    if (paramBPa != null) {
      paramBPa.recycle();
    }
    if (localRectF1 != null)
    {
      if ((bool2 ^ true)) {
        paramBPa = localRectF1;
      } else {
        paramBPa = null;
      }
      if (paramBPa != null)
      {
        paramAtomicInteger = paramBPa;
        break label655;
      }
    }
    paramAtomicInteger = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
    label655:
    if (localRectF2 != null)
    {
      paramBPa = paramGVa;
      if ((true ^ bool2)) {
        paramBPa = localRectF2;
      }
      if (paramBPa != null) {}
    }
    else
    {
      paramBPa = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
    }
    paramBPa = a((Bitmap)localObject3, (Bitmap)localObject1, paramAtomicInteger, paramBPa);
    ((Bitmap)localObject1).recycle();
    ((Bitmap)localObject3).recycle();
    this.b.a(bool1).a(str, new nCa(this, paramBPa));
    return oBa.a(paramoBa, 0, null, _Aa.a.a(paramBPa, str, false), null, null, null, null, 123, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */