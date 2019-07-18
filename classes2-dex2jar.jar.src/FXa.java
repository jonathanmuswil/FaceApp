import java.util.List;

final class fxa
  extends pXa
  implements cXa<Eka, cWa>
{
  fxa(Qwa paramQwa)
  {
    super(1);
  }
  
  public final void a(Eka paramEka)
  {
    Object localObject = this.b.j().d();
    int i = ((List)localObject).indexOf(paramEka);
    if (Qwa.c(this.b) == null) {
      localObject = new lxa.c.b((List)localObject, paramEka.c(), i);
    } else {
      localObject = new lxa.c.a(paramEka.c(), i);
    }
    lxa locallxa = (lxa)this.b.c();
    if (locallxa != null) {
      locallxa.a((lxa.c)localObject);
    }
    Qwa.c(this.b, paramEka);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */