import android.view.ViewGroup;

final class gya$a
{
  public static final class a
    extends RGa<qxa, txa>
  {
    private final VQa<fya.b> a;
    
    public a(VQa<fya.b> paramVQa)
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
  
  public static final class b
    extends RGa<hya, jya>
  {
    private final VQa<fya.b> a;
    
    public b(VQa<fya.b> paramVQa)
    {
      this.a = paramVQa;
    }
    
    protected boolean a(Object paramObject)
    {
      oXa.b(paramObject, "item");
      return paramObject instanceof hya;
    }
    
    protected jya b(ViewGroup paramViewGroup)
    {
      oXa.b(paramViewGroup, "parent");
      paramViewGroup = paramViewGroup.getContext();
      oXa.a(paramViewGroup, "parent.context");
      return new jya(paramViewGroup, this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gya$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */