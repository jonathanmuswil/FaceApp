import android.view.ViewGroup;

public final class zAa$a$b
  extends RGa<Dza, Fza<KAa.b>>
{
  private final VQa<KAa.b> a;
  
  public zAa$a$b(VQa<KAa.b> paramVQa)
  {
    this.a = paramVQa;
  }
  
  protected boolean a(Object paramObject)
  {
    oXa.b(paramObject, "item");
    return paramObject instanceof Dza;
  }
  
  protected Fza<KAa.b> b(ViewGroup paramViewGroup)
  {
    oXa.b(paramViewGroup, "parent");
    paramViewGroup = paramViewGroup.getContext();
    oXa.a(paramViewGroup, "parent.context");
    return new Fza(paramViewGroup, this.a, KAa.b.c.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zAa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */