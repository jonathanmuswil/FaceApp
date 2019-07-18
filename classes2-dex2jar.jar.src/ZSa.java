import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;

final class zsa
  implements AQa
{
  zsa(Rja paramRja, String paramString, bfa parambfa) {}
  
  public final void a(yQa paramyQa)
  {
    oXa.b(paramyQa, "emitter");
    Object localObject = this.a;
    if ((localObject instanceof Zja)) {
      localObject = "n/a";
    } else {
      localObject = vsa.a(vsa.a, new WOa.d(((Rja)localObject).c()));
    }
    if (localObject == null)
    {
      paramyQa.b(new IllegalStateException("Can't calculate image MD5"));
      return;
    }
    FaceApplication.d.b().a(this.a.c(), (String)localObject, this.b, this.c.getHost(), this.c.getPort());
    paramyQa.a();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */