import java.io.IOException;

final class pbb$e<T>
  extends pbb<T>
{
  private final oZa a;
  private final Zab<T, AZa> b;
  
  pbb$e(oZa paramoZa, Zab<T, AZa> paramZab)
  {
    this.a = paramoZa;
    this.b = paramZab;
  }
  
  void a(rbb paramrbb, T paramT)
  {
    if (paramT == null) {
      return;
    }
    try
    {
      AZa localAZa = (AZa)this.b.a(paramT);
      paramrbb.a(this.a, localAZa);
      return;
    }
    catch (IOException localIOException)
    {
      paramrbb = new StringBuilder();
      paramrbb.append("Unable to convert ");
      paramrbb.append(paramT);
      paramrbb.append(" to RequestBody");
      throw new RuntimeException(paramrbb.toString(), localIOException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/pbb$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */