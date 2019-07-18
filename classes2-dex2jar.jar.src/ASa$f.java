import java.util.concurrent.atomic.AtomicLong;

final class ASa$f<T>
  extends ASa.a<T>
{
  ASa$f(Oab<? super T> paramOab)
  {
    super(paramOab);
  }
  
  public void a(T paramT)
  {
    if (c()) {
      return;
    }
    if (paramT != null)
    {
      this.a.a(paramT);
      long l;
      do
      {
        l = get();
      } while ((l != 0L) && (!compareAndSet(l, l - 1L)));
      return;
    }
    a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ASa$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */