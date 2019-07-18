import io.faceapp.ui.misc.c.a;
import io.faceapp.ui.misc.c.a.h;
import io.faceapp.ui.misc.c.a.l;
import io.faceapp.ui.misc.c.a.m;
import java.util.List;

public final class rJa
  extends QIa
{
  public rJa(VQa<XIa.c> paramVQa)
  {
    super(paramVQa, null, null, null, 14, null);
  }
  
  public List<jHa> c(c.a parama, bXa<cWa> parambXa)
  {
    oXa.b(parama, "errorViewModel");
    oXa.b(parambXa, "retryAction");
    if (oXa.a(parama, c.a.h.a)) {
      parama = jHa.e.a();
    } else if (oXa.a(parama, c.a.m.a)) {
      parama = jHa.e.a(parambXa);
    } else if (oXa.a(parama, c.a.l.a)) {
      parama = jHa.e.a(2131689616);
    } else {
      parama = jHa.e.c();
    }
    return mWa.a(parama);
  }
  
  public iHa f()
  {
    throw new IllegalStateException("Impossible state for SinglePoll screen");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */