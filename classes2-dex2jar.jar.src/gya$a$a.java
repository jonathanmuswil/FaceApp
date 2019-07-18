import android.view.ViewGroup;

public final class gya$a$a
  extends RGa<qxa, txa>
{
  private final VQa<fya.b> a;
  
  public gya$a$a(VQa<fya.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof qxa;
  }
  
  protected txa b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new txa(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gya$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */