import java.util.concurrent.Executors;

public final class nBa
{
  private static final WQa a;
  private static final WQa b;
  
  static
  {
    WQa localWQa = EVa.a(Executors.newSingleThreadExecutor(mBa.a));
    oXa.a(localWQa, "Schedulers.from(Executor…eProcessingThreadName) })");
    a = localWQa;
    localWQa = EVa.a(Executors.newSingleThreadExecutor(lBa.a));
    oXa.a(localWQa, "Schedulers.from(Executor…eFileSavingThreadName) })");
    b = localWQa;
  }
  
  public static final void a() {}
  
  public static final WQa b()
  {
    return b;
  }
  
  public static final WQa c()
  {
    return a;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/nBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */