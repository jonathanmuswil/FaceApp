public final class tbb<T>
{
  private final BZa a;
  private final T b;
  private final DZa c;
  
  private tbb(BZa paramBZa, T paramT, DZa paramDZa)
  {
    this.a = paramBZa;
    this.b = paramT;
    this.c = paramDZa;
  }
  
  public static <T> tbb<T> a(int paramInt, DZa paramDZa)
  {
    if (paramInt >= 400)
    {
      BZa.a locala = new BZa.a();
      locala.a(paramInt);
      locala.a("Response.error()");
      locala.a(vZa.b);
      xZa.a locala1 = new xZa.a();
      locala1.b("http://localhost/");
      locala.a(locala1.a());
      return a(paramDZa, locala.a());
    }
    paramDZa = new StringBuilder();
    paramDZa.append("code < 400: ");
    paramDZa.append(paramInt);
    throw new IllegalArgumentException(paramDZa.toString());
  }
  
  public static <T> tbb<T> a(DZa paramDZa, BZa paramBZa)
  {
    xbb.a(paramDZa, "body == null");
    xbb.a(paramBZa, "rawResponse == null");
    if (!paramBZa.f()) {
      return new tbb(paramBZa, null, paramDZa);
    }
    throw new IllegalArgumentException("rawResponse should not be successful response");
  }
  
  public static <T> tbb<T> a(T paramT, BZa paramBZa)
  {
    xbb.a(paramBZa, "rawResponse == null");
    if (paramBZa.f()) {
      return new tbb(paramBZa, paramT, null);
    }
    throw new IllegalArgumentException("rawResponse must be successful response");
  }
  
  public T a()
  {
    return (T)this.b;
  }
  
  public int b()
  {
    return this.a.c();
  }
  
  public oZa c()
  {
    return this.a.e();
  }
  
  public boolean d()
  {
    return this.a.f();
  }
  
  public String e()
  {
    return this.a.g();
  }
  
  public String toString()
  {
    return this.a.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */