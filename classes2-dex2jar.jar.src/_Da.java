import android.content.Context;
import java.util.List;

public abstract class _Da<V extends aEa>
  extends gla<V>
{
  private final vka i;
  private final Aka j;
  private boolean k;
  private final Eda l;
  
  public _Da(Eda paramEda)
  {
    this.l = paramEda;
    this.i = this.l.b();
    this.j = this.l.c();
    this.k = true;
  }
  
  public abstract XQa<nsa.b> a(Context paramContext);
  
  public void a(V paramV)
  {
    oXa.b(paramV, "view");
    super.b(paramV);
    if (this.k)
    {
      this.k = false;
      k();
    }
    b(paramV);
  }
  
  public abstract void b(V paramV);
  
  public final vka f()
  {
    return this.i;
  }
  
  public final Aka g()
  {
    return this.j;
  }
  
  public final Eda h()
  {
    return this.l;
  }
  
  public abstract List<zPa> i();
  
  public abstract boolean j();
  
  public void k() {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/_Da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */