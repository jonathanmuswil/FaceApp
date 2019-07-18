import android.graphics.Bitmap;
import java.io.File;

final class _xa
  extends pXa
  implements cXa<Object, cWa>
{
  _xa(Qxa paramQxa)
  {
    super(1);
  }
  
  public final void a(Object paramObject)
  {
    if ((paramObject instanceof qBa.c))
    {
      Qxa localQxa = this.b;
      paramObject = ((qBa.c)paramObject).b();
      if (paramObject != null)
      {
        Bitmap localBitmap = (Bitmap)paramObject;
        paramObject = _ra.h.d();
        oya.a(localBitmap, (File)paramObject);
        Qxa.a(localQxa, (File)paramObject);
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type android.graphics.Bitmap");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_xa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */