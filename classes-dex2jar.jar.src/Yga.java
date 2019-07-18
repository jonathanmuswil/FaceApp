import java.io.File;
import java.util.concurrent.TimeUnit;

final class yga<T, R>
  implements DRa<T, TQa<? extends R>>
{
  yga(vga paramvga) {}
  
  public final QQa<uia> a(String paramString)
  {
    oXa.b(paramString, "it");
    if (HPa.a(Uma.qa.I())) {
      return QQa.f(2L, TimeUnit.SECONDS).c(wga.a);
    }
    boolean bool = vga.a(this.a);
    vka localvka = this.a.i().b();
    File localFile = _ra.a(_ra.h, this.a.i().f(), localvka.n(), this.a.j(), null, 8, null);
    if ((vga.c(this.a)) && (bool)) {
      paramString = "1";
    } else {
      paramString = "0";
    }
    String str;
    if ((vga.b(this.a)) && (bool)) {
      str = "1";
    } else {
      str = "0";
    }
    paramString = this.a.i().g().a(this.a.i().f(), this.a.j(), localvka.n(), paramString, str).c(new xga(localFile));
    oXa.a(paramString, "photoOp.photoService\n   …eToFile(it.image, file) }");
    return QQa.a(vga.d(this.a), paramString);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */