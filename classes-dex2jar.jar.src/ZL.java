import java.util.Date;
import java.util.concurrent.Callable;

class zl
  implements Callable<Void>
{
  zl(Cl paramCl, Date paramDate, Thread paramThread, Throwable paramThrowable, Ol.b paramb, boolean paramBoolean) {}
  
  public Void call()
    throws Exception
  {
    Cl.f(this.f).x();
    Cl.b(this.f, this.a, this.b, this.c);
    bda localbda = this.d.a();
    Xca localXca;
    Object localObject;
    if (localbda != null)
    {
      localXca = localbda.b;
      localObject = localbda.d;
    }
    else
    {
      localXca = null;
      localObject = localXca;
    }
    int i = 0;
    if ((localObject != null) && (!((Uca)localObject).e)) {
      j = 0;
    } else {
      j = 1;
    }
    if ((j != 0) || (this.e)) {
      Cl.a(this.f, this.a.getTime());
    }
    this.f.a(localXca);
    Cl.g(this.f);
    if (localXca != null) {
      this.f.a(localXca.g);
    }
    int j = i;
    if (rba.a(Cl.f(this.f).d()).a())
    {
      j = i;
      if (!Cl.a(this.f, localbda)) {
        j = 1;
      }
    }
    if (j != 0) {
      Cl.b(this.f, localbda);
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */