import java.util.ArrayList;

final class uva
  extends pXa
  implements cXa<Throwable, cWa>
{
  uva(Vua paramVua)
  {
    super(1);
  }
  
  public final void a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "it");
    if (Vua.b(this.b).isEmpty())
    {
      Vua localVua = this.b;
      tva localtva = new tva(this);
      gla.a(localVua, paramThrowable, new Rfa.f[0], localtva, false, null, 24, null);
    }
    else
    {
      gla.a(this.b, paramThrowable, new Rfa.f[0], null, false, null, 20, null);
      Vua.a(this.b, true);
      paramThrowable = (wva)this.b.c();
      if (paramThrowable != null) {
        paramThrowable.a(new wva.c.a(null, 1, null));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */