final class qTa$a$b
  implements Runnable
{
  private final Throwable a;
  
  qTa$a$b(qTa.a parama, Throwable paramThrowable)
  {
    this.a = paramThrowable;
  }
  
  public void run()
  {
    try
    {
      this.b.a.a(this.a);
      return;
    }
    finally
    {
      this.b.d.i();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qTa$a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */