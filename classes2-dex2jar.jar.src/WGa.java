import android.net.Uri;
import java.io.File;

final class wGa
  extends pXa
  implements cXa<Object, cWa>
{
  wGa(lGa.b paramb)
  {
    super(1);
  }
  
  public final void a(Object paramObject)
  {
    if ((paramObject instanceof tia))
    {
      float f = ((tia)paramObject).b();
      this.b.d().a(new FGa.b.a(f * 0.9F + 0.1F));
    }
    else if ((paramObject instanceof File))
    {
      Uri localUri = Uri.fromFile((File)paramObject);
      paramObject = this.b.d();
      oXa.a(localUri, "imageUri");
      ((FVa)paramObject).a(new FGa.b.c(localUri));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */