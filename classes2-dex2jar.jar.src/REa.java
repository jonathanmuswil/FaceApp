import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class rEa
  extends pXa
  implements cXa<Throwable, cWa>
{
  rEa(fEa paramfEa, fEa.b paramb, Eda paramEda)
  {
    super(1);
  }
  
  public final void a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "it");
    fEa localfEa = this.b;
    int i = 0;
    gla.a(localfEa, paramThrowable, new Rfa.f[0], null, false, null, 28, null);
    this.c.a();
    paramThrowable = fEa.c(this.b);
    int j;
    if (((paramThrowable instanceof Collection)) && (paramThrowable.isEmpty()))
    {
      j = i;
    }
    else
    {
      paramThrowable = paramThrowable.iterator();
      do
      {
        j = i;
        if (!paramThrowable.hasNext()) {
          break;
        }
        if (((fEa.b)paramThrowable.next()).c() == this.d) {
          j = 1;
        } else {
          j = 0;
        }
      } while (j == 0);
      j = 1;
    }
    if ((j == 0) && (this.d != this.b.h())) {
      fEa.d(this.b).remove(this.d);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */