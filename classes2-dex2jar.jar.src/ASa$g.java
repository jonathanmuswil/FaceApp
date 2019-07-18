import java.util.concurrent.atomic.AtomicLong;

abstract class ASa$g<T>
  extends ASa.a<T>
{
  ASa$g(Oab<? super T> paramOab)
  {
    super(paramOab);
  }
  
  public final void a(T paramT)
  {
    if (c()) {
      return;
    }
    if (paramT == null)
    {
      a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
      return;
    }
    if (get() != 0L)
    {
      this.a.a(paramT);
      nVa.b(this, 1L);
    }
    else
    {
      f();
    }
  }
  
  abstract void f();
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ASa$g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */