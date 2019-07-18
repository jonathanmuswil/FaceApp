class xk
{
  long a;
  private gca b;
  
  public xk(gca paramgca)
  {
    if (paramgca != null)
    {
      this.b = paramgca;
      return;
    }
    throw new NullPointerException("retryState must not be null");
  }
  
  public void a()
  {
    this.a = 0L;
    this.b = this.b.b();
  }
  
  public boolean a(long paramLong)
  {
    long l = this.b.a();
    boolean bool;
    if (paramLong - this.a >= l * 1000000L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b(long paramLong)
  {
    this.a = paramLong;
    this.b = this.b.c();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/xk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */