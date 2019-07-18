import android.net.Uri;
import java.io.File;
import java.util.HashMap;

final class bxa<T, R>
  implements DRa<T, R>
{
  bxa(Qwa paramQwa) {}
  
  public final Qwa.c a(YVa<Eka, ? extends Object, Boolean> paramYVa)
  {
    oXa.b(paramYVa, "<name for destructuring parameter 0>");
    Eka localEka = (Eka)paramYVa.a();
    Object localObject = paramYVa.b();
    boolean bool1 = ((Boolean)paramYVa.c()).booleanValue();
    if ((localObject instanceof tia))
    {
      paramYVa = new Qwa.c(new lxa.b.b(((tia)localObject).b() * 0.9F + 0.1F), localEka, bool1);
    }
    else
    {
      if (!(localObject instanceof File)) {
        break label195;
      }
      paramYVa = Uri.fromFile((File)localObject);
      localObject = WOa.e;
      oXa.a(paramYVa, "imageUri");
      APa localAPa = ((WOa)localObject).a(new WOa.d(paramYVa), false);
      boolean bool2 = Qwa.a(this.a, localAPa);
      localObject = Qwa.a(this.a, localEka, bool1, bool2);
      boolean bool3;
      if (localEka.e() != null) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      paramYVa = new Qwa.c(new lxa.b.a.a(localEka, (lxa.d)localObject, bool2, paramYVa, localAPa, bool3, (APa)Qwa.e(this.a).get(paramYVa)), localEka, bool1);
    }
    return paramYVa;
    label195:
    throw new IllegalStateException("impossible in fact");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/bxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */