package io.faceapp.ui.misc;

import _Va;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build;
import eg;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import nYa;
import oXa;
import yh;
import zYa;

public class b
  extends yh
{
  private float a;
  private final Paint b;
  private Context c;
  private final boolean d;
  private final boolean e;
  
  public b(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.c = paramContext;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.a = this.c.getResources().getDimension(2131165336);
    this.b = new Paint(1);
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setStrokeWidth(this.c.getResources().getDimension(2131165403));
    this.b.setColor(-1);
    a();
  }
  
  private final Bitmap a(eg parameg, Bitmap paramBitmap)
  {
    int i = Math.min(paramBitmap.getWidth(), paramBitmap.getHeight());
    paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - i) / 2, (paramBitmap.getHeight() - i) / 2, i, i);
    Bitmap localBitmap = parameg.a(i, i, Bitmap.Config.ARGB_8888);
    oXa.a(localBitmap, "pool.get(size, size, Bitmap.Config.ARGB_8888)");
    Canvas localCanvas = new Canvas(localBitmap);
    float f1 = i;
    RectF localRectF = new RectF(0.0F, 0.0F, f1, f1);
    parameg = new Paint(1);
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    parameg.setShader(new BitmapShader(paramBitmap, localTileMode, localTileMode));
    float f2 = this.a;
    boolean bool1 = this.e;
    boolean bool2 = this.d;
    localCanvas.drawPath(a(localRectF, f2, f2, bool1, bool2, bool2, bool1), parameg);
    f2 = this.b.getStrokeWidth() / 2;
    f1 -= f2;
    localRectF.set(f2, f2, f1, f1);
    f2 = this.a;
    bool2 = this.e;
    bool1 = this.d;
    localCanvas.drawPath(a(localRectF, f2, f2, bool2, bool1, bool1, bool2), this.b);
    paramBitmap.recycle();
    return localBitmap;
  }
  
  private final Path a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    Path localPath = new Path();
    float f1 = 0;
    float f2 = paramFloat5;
    if (paramFloat5 < f1) {
      f2 = 0.0F;
    }
    paramFloat5 = paramFloat6;
    if (paramFloat6 < f1) {
      paramFloat5 = 0.0F;
    }
    f1 = paramFloat3 - paramFloat1;
    float f3 = paramFloat4 - paramFloat2;
    float f4 = 2;
    paramFloat4 = f1 / f4;
    paramFloat1 = f2;
    if (f2 > paramFloat4) {
      paramFloat1 = paramFloat4;
    }
    paramFloat6 = f3 / f4;
    paramFloat4 = paramFloat5;
    if (paramFloat5 > paramFloat6) {
      paramFloat4 = paramFloat6;
    }
    paramFloat5 = f1 - f4 * paramFloat1;
    paramFloat6 = f3 - f4 * paramFloat4;
    localPath.moveTo(paramFloat3, paramFloat2 + paramFloat4);
    if (paramBoolean2)
    {
      paramFloat2 = -paramFloat4;
      localPath.rQuadTo(0.0F, paramFloat2, -paramFloat1, paramFloat2);
    }
    else
    {
      localPath.rLineTo(0.0F, -paramFloat4);
      localPath.rLineTo(-paramFloat1, 0.0F);
    }
    localPath.rLineTo(-paramFloat5, 0.0F);
    if (paramBoolean1)
    {
      paramFloat2 = -paramFloat1;
      localPath.rQuadTo(paramFloat2, 0.0F, paramFloat2, paramFloat4);
    }
    else
    {
      localPath.rLineTo(-paramFloat1, 0.0F);
      localPath.rLineTo(0.0F, paramFloat4);
    }
    localPath.rLineTo(0.0F, paramFloat6);
    if (paramBoolean4)
    {
      localPath.rQuadTo(0.0F, paramFloat4, paramFloat1, paramFloat4);
    }
    else
    {
      localPath.rLineTo(0.0F, paramFloat4);
      localPath.rLineTo(paramFloat1, 0.0F);
    }
    localPath.rLineTo(paramFloat5, 0.0F);
    if (paramBoolean3)
    {
      localPath.rQuadTo(paramFloat1, 0.0F, paramFloat1, -paramFloat4);
    }
    else
    {
      localPath.rLineTo(paramFloat1, 0.0F);
      localPath.rLineTo(0.0F, -paramFloat4);
    }
    localPath.rLineTo(0.0F, -paramFloat6);
    localPath.close();
    return localPath;
  }
  
  private final Path a(RectF paramRectF, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    return a(paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.bottom, paramFloat1, paramFloat2, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  private final void a()
  {
    String str = Build.MANUFACTURER;
    oXa.a(str, "Build.MANUFACTURER");
    if (str != null)
    {
      str = str.toLowerCase();
      oXa.a(str, "(this as java.lang.String).toLowerCase()");
      if (!oXa.a(str, "samsung"))
      {
        str = Build.MODEL;
        oXa.a(str, "Build.MODEL");
        if (str != null)
        {
          str = str.toLowerCase();
          oXa.a(str, "(this as java.lang.String).toLowerCase()");
          if (!zYa.b(str, "samsung", false, 2, null)) {
            break label95;
          }
        }
        else
        {
          throw new _Va("null cannot be cast to non-null type java.lang.String");
        }
      }
      this.a *= 0.7F;
      label95:
      return;
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
  
  protected Bitmap a(eg parameg, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    oXa.b(parameg, "pool");
    oXa.b(paramBitmap, "toTransform");
    return a(parameg, paramBitmap);
  }
  
  public void a(MessageDigest paramMessageDigest)
  {
    oXa.b(paramMessageDigest, "messageDigest");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("GlideStylePhotoTransform_");
    ((StringBuilder)localObject).append(this.d);
    ((StringBuilder)localObject).append('#');
    ((StringBuilder)localObject).append(this.e);
    String str = ((StringBuilder)localObject).toString();
    localObject = nYa.a;
    if (str != null)
    {
      localObject = str.getBytes((Charset)localObject);
      oXa.a(localObject, "(this as java.lang.String).getBytes(charset)");
      paramMessageDigest.update((byte[])localObject);
      return;
    }
    throw new _Va("null cannot be cast to non-null type java.lang.String");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */