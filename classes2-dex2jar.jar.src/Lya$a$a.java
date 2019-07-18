import android.view.ViewGroup;

public final class Lya$a$a
  extends RGa<nza, qza>
{
  private final VQa<mza.b> a;
  
  public Lya$a$a(VQa<mza.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof nza;
  }
  
  protected qza b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new qza(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Lya$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */