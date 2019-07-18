import java.io.IOException;

class x_a
  extends KZa
{
  x_a(C_a paramC_a, String paramString, Object[] paramArrayOfObject, int paramInt, long paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void b()
  {
    try
    {
      this.d.s.a(this.b, this.c);
    }
    catch (IOException localIOException)
    {
      C_a.a(this.d, localIOException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/x_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */