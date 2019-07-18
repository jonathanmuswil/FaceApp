import android.view.ViewGroup;

public final class Lya$a$c
  extends RGa<Dza, Fza<mza.b>>
{
  private final VQa<mza.b> a;
  
  public Lya$a$c(VQa<mza.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Dza;
  }
  
  protected Fza<mza.b> b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new Fza(paramViewGroup, this.a, mza.b.f.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Lya$a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */