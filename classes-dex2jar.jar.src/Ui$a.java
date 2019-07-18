final class ui$a<Z, R>
{
  private final Class<Z> a;
  private final Class<R> b;
  final ti<Z, R> c;
  
  ui$a(Class<Z> paramClass, Class<R> paramClass1, ti<Z, R> paramti)
  {
    this.a = paramClass;
    this.b = paramClass1;
    this.c = paramti;
  }
  
  public boolean a(Class<?> paramClass1, Class<?> paramClass2)
  {
    boolean bool;
    if ((this.a.isAssignableFrom(paramClass1)) && (paramClass2.isAssignableFrom(this.b))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ui$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */