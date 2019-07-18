import android.content.Context;

public class aba<T>
  extends _aa<T>
{
  private T b;
  
  public aba()
  {
    this(null);
  }
  
  public aba(bba<T> parambba)
  {
    super(parambba);
  }
  
  protected T a(Context paramContext)
  {
    return (T)this.b;
  }
  
  protected void a(Context paramContext, T paramT)
  {
    this.b = paramT;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/aba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */