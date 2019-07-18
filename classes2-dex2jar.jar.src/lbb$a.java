import java.io.IOException;

final class lbb$a
  extends DZa
{
  private final DZa b;
  IOException c;
  
  lbb$a(DZa paramDZa)
  {
    this.b = paramDZa;
  }
  
  public long c()
  {
    return this.b.c();
  }
  
  public void close()
  {
    this.b.close();
  }
  
  public rZa d()
  {
    return this.b.d();
  }
  
  public lab e()
  {
    return vab.a(new kbb(this, this.b.e()));
  }
  
  void f()
    throws IOException
  {
    IOException localIOException = this.c;
    if (localIOException == null) {
      return;
    }
    throw localIOException;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lbb$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */