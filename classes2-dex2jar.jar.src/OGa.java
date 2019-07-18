import android.net.Uri;
import java.util.List;

final class oGa<T1, T2, T3, R>
  implements BRa<Uri, Uri, List<? extends List<? extends String>>, Rva.a>
{
  oGa(pGa parampGa) {}
  
  public final Rva.a a(Uri paramUri1, Uri paramUri2, List<? extends List<String>> paramList)
  {
    oXa.b(paramUri1, "imageUri");
    oXa.b(paramUri2, "blurredUri");
    oXa.b(paramList, "filterIds");
    float f = this.a.a.h().b().p();
    return new Rva.a(paramUri1, paramUri2, this.a.a.h().f(), f, paramList);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/oGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */