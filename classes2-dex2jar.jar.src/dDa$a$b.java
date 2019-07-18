import android.view.ViewGroup;

public final class dDa$a$b
  extends RGa<Dza, Fza<pDa.b>>
{
  private final VQa<pDa.b> a;
  
  public dDa$a$b(VQa<pDa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Dza;
  }
  
  protected Fza<pDa.b> b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new Fza(paramViewGroup, this.a, pDa.b.b.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dDa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */