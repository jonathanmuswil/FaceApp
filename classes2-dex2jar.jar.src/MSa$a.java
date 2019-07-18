import java.util.concurrent.atomic.AtomicBoolean;

final class mSa$a
  extends AtomicBoolean
  implements kRa
{
  final zQa a;
  
  mSa$a(mSa parammSa, zQa paramzQa)
  {
    this.a = paramzQa;
  }
  
  public boolean h()
  {
    return get();
  }
  
  public void i()
  {
    if (compareAndSet(false, true)) {
      this.b.b(this);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mSa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */