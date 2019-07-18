import java.util.ArrayList;

final class sva
  extends pXa
  implements cXa<Oja.a, cWa>
{
  sva(Vua paramVua)
  {
    super(1);
  }
  
  public final void a(Oja.a parama)
  {
    if (parama.c())
    {
      wva localwva = (wva)this.b.c();
      if (localwva != null)
      {
        Object localObject;
        if (Vua.b(this.b).isEmpty()) {
          localObject = wva.c.b.a;
        } else {
          localObject = new wva.c.a(null, 1, null);
        }
        localwva.a((wva.c)localObject);
      }
      Vua.a(this.b, true);
    }
    if (parama.b())
    {
      parama = (wva)this.b.c();
      if (parama != null) {
        Vua.a(this.b, parama);
      }
    }
    else
    {
      Vua.b(this.b).addAll(parama.a());
      parama = (wva)this.b.c();
      if (parama != null) {
        parama.a(new wva.c.a(Vua.b(this.b)));
      }
      Vua.b(this.b, false);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */