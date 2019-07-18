import java.util.concurrent.ThreadFactory;

final class RUa$c
  extends TUa
{
  private long c = 0L;
  
  RUa$c(ThreadFactory paramThreadFactory)
  {
    super(paramThreadFactory);
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public long b()
  {
    return this.c;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/RUa$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */