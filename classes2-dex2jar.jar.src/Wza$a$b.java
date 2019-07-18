import android.view.ViewGroup;

public final class Wza$a$b
  extends RGa<Dza, Fza<hAa.b>>
{
  private final VQa<hAa.b> a;
  
  public Wza$a$b(VQa<hAa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Dza;
  }
  
  protected Fza<hAa.b> b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new Fza(paramViewGroup, this.a, hAa.b.c.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Wza$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */