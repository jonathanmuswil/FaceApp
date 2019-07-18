public final class kPa$a
{
  public final <T> kPa<T> a()
  {
    return new kPa(null, null);
  }
  
  public final <T> kPa<T> a(T paramT)
  {
    oXa.b(paramT, "value");
    return new kPa(paramT, null);
  }
  
  public final <T> kPa<T> a(Throwable paramThrowable)
  {
    oXa.b(paramThrowable, "ex");
    return new kPa(null, paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/kPa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */