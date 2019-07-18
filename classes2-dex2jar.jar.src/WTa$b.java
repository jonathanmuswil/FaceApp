import java.util.concurrent.Callable;

final class WTa$b<T, R>
  extends QQa<R>
{
  final T a;
  final DRa<? super T, ? extends TQa<? extends R>> b;
  
  WTa$b(T paramT, DRa<? super T, ? extends TQa<? extends R>> paramDRa)
  {
    this.a = paramT;
    this.b = paramDRa;
  }
  
  public void b(VQa<? super R> paramVQa)
  {
    try
    {
      Object localObject = this.b.apply(this.a);
      ORa.a(localObject, "The mapper returned a null ObservableSource");
      localObject = (TQa)localObject;
      if ((localObject instanceof Callable)) {
        try
        {
          localObject = ((Callable)localObject).call();
          if (localObject == null)
          {
            JRa.a(paramVQa);
            return;
          }
          localObject = new WTa.a(paramVQa, localObject);
          paramVQa.a((kRa)localObject);
          ((WTa.a)localObject).run();
        }
        catch (Throwable localThrowable1)
        {
          pRa.b(localThrowable1);
          JRa.a(localThrowable1, paramVQa);
          return;
        }
      }
      localThrowable1.a(paramVQa);
      return;
    }
    catch (Throwable localThrowable2)
    {
      JRa.a(localThrowable2, paramVQa);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/WTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */