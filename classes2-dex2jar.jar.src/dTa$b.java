final class dTa$b<T>
  implements Runnable
{
  final LQa<? super T> a;
  final NQa<T> b;
  
  dTa$b(LQa<? super T> paramLQa, NQa<T> paramNQa)
  {
    this.a = paramLQa;
    this.b = paramNQa;
  }
  
  public void run()
  {
    this.b.a(this.a);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dTa$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */