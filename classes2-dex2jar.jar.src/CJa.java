import io.faceapp.ui.misc.c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class cJa
  extends QIa
{
  private final VQa<qJa.a> g;
  private final VQa<qJa.b> h;
  private final pJa i;
  
  public cJa(VQa<XIa.c> paramVQa, VQa<qJa.a> paramVQa1, VQa<qJa.b> paramVQa2, pJa parampJa)
  {
    super(paramVQa, new YIa(paramVQa1), new ZIa(paramVQa2), new _Ia(paramVQa2));
    this.g = paramVQa1;
    this.h = paramVQa2;
    this.i = parampJa;
  }
  
  public List<jHa> c(c.a parama, bXa<cWa> parambXa)
  {
    oXa.b(parama, "errorViewModel");
    oXa.b(parambXa, "retryAction");
    parambXa = super.b(parama, parambXa);
    parama = new ArrayList(mWa.a(parambXa, 10));
    parambXa = parambXa.iterator();
    while (parambXa.hasNext()) {
      parama.add(jHa.a((jHa)parambXa.next(), 0, null, 0, null, 0, 0.1F, 31, null));
    }
    return parama;
  }
  
  public iHa f()
  {
    Object localObject = this.i;
    int j = aJa.a[localObject.ordinal()];
    if (j != 1)
    {
      if (j == 2) {
        localObject = iHa.a(iHa.a.a(2131230990, 2131689606, 2131689830, new bJa(this)), 0, 0, null, 0, 0.1F, 15, null);
      } else {
        throw new UVa();
      }
    }
    else {
      localObject = iHa.a(iHa.a.a(2131230989, 2131689617), 0, 0, null, 0, 0.1F, 15, null);
    }
    return (iHa)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cJa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */