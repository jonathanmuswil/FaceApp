import android.content.Context;
import android.content.Intent;

final class tsa<T>
  implements _Qa<T>
{
  tsa(boolean paramBoolean, nsa.b paramb, nsa.a parama, Context paramContext) {}
  
  public final void a(YQa<WVa<nsa.a, nsa.c>> paramYQa)
  {
    oXa.b(paramYQa, "subscriber");
    if ((this.a) && (!WOa.e.a(this.b.m())))
    {
      paramYQa.b(new WVa(this.c, nsa.c.c));
      return;
    }
    Object localObject = nsa.a(nsa.b, this.d, this.b, this.c);
    if (localObject != null)
    {
      this.d.startActivity((Intent)localObject);
      paramYQa.b(new WVa(this.c, nsa.c.b));
    }
    else
    {
      localObject = nsa.b;
      asa localasa = asa.d;
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Incorrectly prepared shareIntent, type: ");
      ((StringBuilder)localObject).append(this.c.name());
      ((StringBuilder)localObject).append(" package: ");
      ((StringBuilder)localObject).append(this.c.a());
      asa.a(localasa, ((StringBuilder)localObject).toString(), null, 2, null);
      paramYQa.b(new WVa(this.c, nsa.c.d));
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */