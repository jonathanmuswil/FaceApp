public final class sZa$b
{
  final oZa a;
  final AZa b;
  
  private sZa$b(oZa paramoZa, AZa paramAZa)
  {
    this.a = paramoZa;
    this.b = paramAZa;
  }
  
  public static b a(oZa paramoZa, AZa paramAZa)
  {
    if (paramAZa != null)
    {
      if ((paramoZa != null) && (paramoZa.b("Content-Type") != null)) {
        throw new IllegalArgumentException("Unexpected header: Content-Type");
      }
      if ((paramoZa != null) && (paramoZa.b("Content-Length") != null)) {
        throw new IllegalArgumentException("Unexpected header: Content-Length");
      }
      return new b(paramoZa, paramAZa);
    }
    throw new NullPointerException("body == null");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sZa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */