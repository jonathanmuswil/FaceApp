import android.graphics.Bitmap;
import android.os.Bundle;
import io.faceapp.ui.misc.e.a;
import java.io.File;
import java.util.Map;

public final class Qxa$a
  implements qDa
{
  private final QVa b;
  private final Eda c;
  private final e.a d;
  private final eBa e;
  private final Bundle f;
  private final boolean g;
  private final Bitmap h;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(a.class), "blurred", "getBlurred()Landroid/graphics/Bitmap;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
  }
  
  public Qxa$a(Eda paramEda, e.a parama, eBa parameBa, Bundle paramBundle, boolean paramBoolean, Bitmap paramBitmap)
  {
    this.c = paramEda;
    this.d = parama;
    this.e = parameBa;
    this.f = paramBundle;
    this.g = paramBoolean;
    this.h = paramBitmap;
    this.b = RVa.a(new Lxa(this));
  }
  
  private final XQa<FDa> a(float paramFloat)
  {
    XQa localXQa = XQa.c(new Mxa(this, paramFloat));
    oXa.a(localXQa, "Single.fromCallable { Im…ress(blurred, progress) }");
    return localXQa;
  }
  
  private final XQa<FDa> a(Bitmap paramBitmap)
  {
    paramBitmap = XQa.c(new Pxa(this, paramBitmap));
    oXa.a(paramBitmap, "Single.fromCallable { sa…mageSaverStatus.Failure }");
    return paramBitmap;
  }
  
  private final nsa.b a(Bitmap paramBitmap, boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      WOa.e.a(paramBitmap);
      File localFile = _ra.h.e();
      oya.a(paramBitmap, localFile);
      paramBitmap = new nsa$b;
      paramBitmap.<init>(localFile, "IMAGE_EDITOR");
    }
    catch (Exception paramBitmap)
    {
      paramBitmap = null;
    }
    return paramBitmap;
  }
  
  private final Bitmap d()
  {
    QVa localQVa = this.b;
    XXa localXXa = a[0];
    return (Bitmap)localQVa.getValue();
  }
  
  public void a()
  {
    Object localObject = nya.a(this.d, this.f);
    this.c.a((Faa)localObject);
    localObject = nya.a(this.c, this.f);
    asa.d.a((Map)localObject);
    localObject = new zPa(this.c, mWa.a(oya.s(oya.d(this.f)), null, null, null, 0, null, null, 63, null));
    nsa.b.a((zPa)localObject);
    localObject = oya.b(this.f);
    oya.a((Bundle)localObject, ((Boolean)Uma.qa.ja().get()).booleanValue() ^ true);
    this.e.e().a((Bundle)localObject);
  }
  
  public final Bitmap b()
  {
    return this.h;
  }
  
  public final boolean c()
  {
    return this.g;
  }
  
  public QQa<FDa> w()
  {
    QQa localQQa = QQa.b(this.e.e().d(), this.e.e().e()).a(new Oxa(this));
    oXa.a(localQQa, "Observable.merge(\n      …          }\n            }");
    return localQQa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Qxa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */