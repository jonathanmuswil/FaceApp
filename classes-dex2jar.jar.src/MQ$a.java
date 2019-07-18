import java.io.IOException;

class MQ$a<T>
  extends eR<T>
{
  private eR<T> a;
  
  public T a(cT paramcT)
    throws IOException
  {
    eR localeR = this.a;
    if (localeR != null) {
      return (T)localeR.a(paramcT);
    }
    throw new IllegalStateException();
  }
  
  public void a(eR<T> parameR)
  {
    if (this.a == null)
    {
      this.a = parameR;
      return;
    }
    throw new AssertionError();
  }
  
  public void a(eT parameT, T paramT)
    throws IOException
  {
    eR localeR = this.a;
    if (localeR != null)
    {
      localeR.a(parameT, paramT);
      return;
    }
    throw new IllegalStateException();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/MQ$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */