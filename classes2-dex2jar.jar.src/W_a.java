import java.io.IOException;

class w_a
  extends KZa
{
  w_a(C_a paramC_a, String paramString, Object[] paramArrayOfObject, int paramInt, s_a paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void b()
  {
    try
    {
      this.d.b(this.b, this.c);
    }
    catch (IOException localIOException)
    {
      C_a.a(this.d, localIOException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/w_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */