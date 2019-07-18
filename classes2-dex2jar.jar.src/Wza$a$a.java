import android.view.ViewGroup;

public final class Wza$a$a
  extends RGa<iAa, lAa>
{
  private final VQa<hAa.b> a;
  
  public Wza$a$a(VQa<hAa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof iAa;
  }
  
  protected lAa b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new lAa(paramViewGroup, this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Wza$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */