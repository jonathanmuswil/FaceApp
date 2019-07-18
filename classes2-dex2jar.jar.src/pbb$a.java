import java.io.IOException;

final class pbb$a<T>
  extends pbb<T>
{
  private final Zab<T, AZa> a;
  
  pbb$a(Zab<T, AZa> paramZab)
  {
    this.a = paramZab;
  }
  
  void a(rbb paramrbb, T paramT)
  {
    if (paramT != null) {
      try
      {
        localObject = (AZa)this.a.a(paramT);
        paramrbb.a((AZa)localObject);
        return;
      }
      catch (IOException paramrbb)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Unable to convert ");
        ((StringBuilder)localObject).append(paramT);
        ((StringBuilder)localObject).append(" to RequestBody");
        throw new RuntimeException(((StringBuilder)localObject).toString(), paramrbb);
      }
    }
    throw new IllegalArgumentException("Body parameter value must not be null.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */