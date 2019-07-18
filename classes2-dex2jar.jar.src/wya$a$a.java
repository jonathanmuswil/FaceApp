import android.view.ViewGroup;

public final class wya$a$a
  extends RGa<Gya, Hya>
{
  private final VQa<Fya.c> a;
  
  public wya$a$a(VQa<Fya.c> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Gya;
  }
  
  protected Hya b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new Hya(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wya$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */