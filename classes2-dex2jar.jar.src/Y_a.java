import java.io.IOException;
import java.util.List;
import java.util.Set;

class y_a
  extends KZa
{
  y_a(C_a paramC_a, String paramString, Object[] paramArrayOfObject, int paramInt, List paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void b()
  {
    if (this.d.k.a(this.b, this.c)) {}
    try
    {
      this.d.s.a(this.b, s_a.f);
      synchronized (this.d)
      {
        this.d.u.remove(Integer.valueOf(this.b));
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/y_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */