import android.net.Uri;
import java.io.File;

final class qEa
  extends pXa
  implements cXa<Object, cWa>
{
  qEa(float paramFloat, fEa.b paramb)
  {
    super(1);
  }
  
  public final void a(Object paramObject)
  {
    if ((paramObject instanceof tia))
    {
      float f1 = this.b;
      float f2 = 1;
      float f3 = ((tia)paramObject).b();
      this.c.e().a(new AEa.c.a(f1 + (f2 - f1) * f3));
    }
    else if ((paramObject instanceof File))
    {
      paramObject = Uri.fromFile((File)paramObject);
      FVa localFVa = this.c.e();
      oXa.a(paramObject, "imageUri");
      localFVa.a(new AEa.c.c((Uri)paramObject));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */