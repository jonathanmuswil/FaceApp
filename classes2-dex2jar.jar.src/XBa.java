import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.PointF;
import android.graphics.RectF;

public final class xBa
{
  public static final xBa a = new xBa();
  
  private final void a(Bitmap paramBitmap1, FBa paramFBa, Bitmap paramBitmap2)
  {
    ABa localABa = new ABa(paramFBa);
    HBa localHBa = new HBa(paramBitmap1.getWidth(), paramBitmap1.getHeight());
    localHBa.a(localABa);
    localABa.a(paramBitmap1, false);
    if (paramBitmap2 != null) {
      paramBitmap1 = paramBitmap2;
    }
    localHBa.a(paramBitmap1);
    paramFBa.a();
    localABa.a();
    localHBa.a();
  }
  
  public final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, float paramFloat)
  {
    oXa.b(paramBitmap1, "bitmap");
    oXa.b(paramBitmap2, "trimap");
    oXa.b(paramBitmap3, "target");
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap1.getWidth(), paramBitmap1.getHeight(), Bitmap.Config.ARGB_8888);
      xBa localxBa = a;
      MBa localMBa = new MBa;
      localMBa.<init>();
      localMBa.b(paramBitmap2);
      localMBa.a(paramBitmap3);
      localMBa.a(paramFloat);
      localxBa.a(paramBitmap1, localMBa, localBitmap);
      oXa.a(localBitmap, "Bitmap.createBitmap(bitm…esult = it)\n            }");
      oXa.a(localBitmap, "synchronized(this) {\n   …)\n            }\n        }");
      return localBitmap;
    }
    finally {}
  }
  
  public final Bitmap a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, PointF paramPointF)
  {
    oXa.b(paramBitmap1, "bitmap");
    oXa.b(paramBitmap2, "shadow");
    oXa.b(paramBitmap3, "target");
    oXa.b(paramPointF, "offset");
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramBitmap1.getWidth(), paramBitmap1.getHeight(), Bitmap.Config.ARGB_8888);
      xBa localxBa = a;
      NBa localNBa = new NBa;
      localNBa.<init>();
      localNBa.a(paramPointF);
      localNBa.a(paramBitmap2);
      localNBa.b(paramBitmap3);
      localxBa.a(paramBitmap1, localNBa, localBitmap);
      oXa.a(localBitmap, "Bitmap.createBitmap(bitm…esult = it)\n            }");
      oXa.a(localBitmap, "synchronized(this) {\n   …)\n            }\n        }");
      return localBitmap;
    }
    finally {}
  }
  
  public final void a(Bitmap paramBitmap1, APa paramAPa1, Bitmap paramBitmap2, APa paramAPa2, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    oXa.b(paramBitmap1, "bitmap");
    oXa.b(paramAPa1, "bitmapSize");
    oXa.b(paramBitmap2, "overlay");
    oXa.b(paramAPa2, "overlaySize");
    try
    {
      xBa localxBa = a;
      eCa localeCa = new eCa;
      localeCa.<init>();
      localeCa.a(paramBitmap2);
      localeCa.a(paramAPa2);
      localeCa.b(paramAPa1);
      localeCa.b(paramFloat1);
      localeCa.c(paramFloat2);
      localeCa.a(paramFloat3);
      a(localxBa, paramBitmap1, localeCa, null, 4, null);
      paramBitmap1 = cWa.a;
      return;
    }
    finally
    {
      paramBitmap1 = finally;
      throw paramBitmap1;
    }
  }
  
  public final void a(Bitmap paramBitmap1, Bitmap paramBitmap2, float paramFloat)
  {
    oXa.b(paramBitmap1, "bitmap");
    oXa.b(paramBitmap2, "tatoo");
    try
    {
      xBa localxBa = a;
      kCa localkCa = new kCa;
      localkCa.<init>();
      localkCa.a(paramFloat);
      localkCa.a(paramBitmap2);
      a(localxBa, paramBitmap1, localkCa, null, 4, null);
      paramBitmap1 = cWa.a;
      return;
    }
    finally
    {
      paramBitmap1 = finally;
      throw paramBitmap1;
    }
  }
  
  public final void a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, Bitmap paramBitmap4, float paramFloat)
  {
    oXa.b(paramBitmap1, "bitmap");
    oXa.b(paramBitmap2, "depthmap");
    oXa.b(paramBitmap3, "blur1");
    oXa.b(paramBitmap4, "blur2");
    try
    {
      xBa localxBa = a;
      bCa localbCa = new bCa;
      localbCa.<init>();
      localbCa.c(paramBitmap2);
      localbCa.a(paramFloat);
      localbCa.a(paramBitmap3);
      localbCa.b(paramBitmap4);
      a(localxBa, paramBitmap1, localbCa, null, 4, null);
      paramBitmap1 = cWa.a;
      return;
    }
    finally
    {
      paramBitmap1 = finally;
      throw paramBitmap1;
    }
  }
  
  public final void a(Bitmap paramBitmap1, Bitmap paramBitmap2, Bitmap paramBitmap3, RectF paramRectF, float paramFloat)
  {
    oXa.b(paramBitmap1, "bitmap");
    oXa.b(paramBitmap2, "hairs");
    oXa.b(paramBitmap3, "mask");
    oXa.b(paramRectF, "maskRect");
    try
    {
      xBa localxBa = a;
      YBa localYBa = new YBa;
      localYBa.<init>();
      localYBa.a(paramFloat);
      localYBa.a(paramBitmap2);
      localYBa.b(paramBitmap3);
      localYBa.a(paramRectF);
      a(localxBa, paramBitmap1, localYBa, null, 4, null);
      paramBitmap1 = cWa.a;
      return;
    }
    finally
    {
      paramBitmap1 = finally;
      throw paramBitmap1;
    }
  }
  
  public final void a(Bitmap paramBitmap, vBa paramvBa, KBa paramKBa, JBa paramJBa)
  {
    oXa.b(paramBitmap, "bitmap");
    try
    {
      xBa localxBa = a;
      fCa localfCa = new fCa;
      localfCa.<init>();
      if (paramvBa != null)
      {
        localfCa.b(paramvBa.b());
        localfCa.c(paramvBa.c());
        localfCa.a(paramvBa.a());
        localfCa.d(paramvBa.d());
        localfCa.e(paramvBa.e());
      }
      if (paramKBa != null) {
        localfCa.a(paramKBa.b(), paramKBa.a());
      }
      if (paramJBa != null) {
        localfCa.a(paramJBa.c(), paramJBa.a(), paramJBa.b());
      }
      a(localxBa, paramBitmap, localfCa.a(), null, 4, null);
      paramBitmap = cWa.a;
      return;
    }
    finally {}
  }
  
  public final void a(Bitmap paramBitmap, wBa paramwBa)
  {
    oXa.b(paramBitmap, "bitmap");
    oXa.b(paramwBa, "effect");
    try
    {
      xBa localxBa = a;
      WBa localWBa = new WBa;
      localWBa.<init>();
      localWBa.a(paramwBa.a(), paramwBa.b());
      a(localxBa, paramBitmap, localWBa.a(), null, 4, null);
      paramBitmap = cWa.a;
      return;
    }
    finally
    {
      paramBitmap = finally;
      throw paramBitmap;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/xBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */