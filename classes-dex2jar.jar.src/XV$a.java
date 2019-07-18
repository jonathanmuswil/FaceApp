import java.util.concurrent.Callable;

final class XV$a
  implements Callable<Boolean>, FRa<Object>
{
  private final Boolean a;
  
  XV$a(Boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public Boolean call()
  {
    return this.a;
  }
  
  public boolean test(Object paramObject)
  {
    return this.a.booleanValue();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/XV$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */