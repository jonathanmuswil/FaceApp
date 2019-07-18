import java.io.IOException;

class jbb
  implements ZYa
{
  jbb(lbb paramlbb, Tab paramTab) {}
  
  private void a(Throwable paramThrowable)
  {
    try
    {
      this.a.a(this.b, paramThrowable);
    }
    catch (Throwable paramThrowable)
    {
      paramThrowable.printStackTrace();
    }
  }
  
  public void a(YYa paramYYa, BZa paramBZa)
  {
    try
    {
      paramYYa = this.b.a(paramBZa);
      try
      {
        this.a.a(this.b, paramYYa);
      }
      catch (Throwable paramYYa)
      {
        paramYYa.printStackTrace();
      }
      return;
    }
    catch (Throwable paramYYa)
    {
      xbb.a(paramYYa);
      a(paramYYa);
    }
  }
  
  public void a(YYa paramYYa, IOException paramIOException)
  {
    a(paramIOException);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */