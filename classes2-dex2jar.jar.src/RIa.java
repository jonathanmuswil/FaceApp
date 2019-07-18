import android.content.Context;
import io.faceapp.ui.misc.e;
import io.faceapp.ui.misc.e.a;
import java.util.List;

public abstract class rIa<V extends sIa>
  extends e<V>
{
  private final Aka i;
  private final boolean j;
  private boolean k;
  private final Eda l;
  
  public rIa(Eda paramEda)
  {
    this.l = paramEda;
    this.i = this.l.c();
    this.j = this.l.i();
    this.k = true;
  }
  
  public XQa<nsa.b> a(Context paramContext, e.a parama)
  {
    oXa.b(paramContext, "context");
    oXa.b(parama, "action");
    paramContext = new StringBuilder();
    paramContext.append("Sharing is not supported for current fragment [tag]: ");
    paramContext.append(b());
    throw new IllegalStateException(paramContext.toString());
  }
  
  public void a(V paramV)
  {
    oXa.b(paramV, "view");
    super.b(paramV);
    if (this.k)
    {
      this.k = false;
      l();
    }
    paramV.i(this.j);
    b(paramV);
  }
  
  public abstract void b(V paramV);
  
  public List<zPa> f()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sharing is not supported for current fragment [tag]: ");
    localStringBuilder.append(b());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public boolean g()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sharing is not supported for current fragment [tag]: ");
    localStringBuilder.append(b());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public boolean h()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sharing is not supported for current fragment [tag]: ");
    localStringBuilder.append(b());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public final boolean i()
  {
    return this.j;
  }
  
  public final Aka j()
  {
    return this.i;
  }
  
  public final Eda k()
  {
    return this.l;
  }
  
  public void l() {}
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rIa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */