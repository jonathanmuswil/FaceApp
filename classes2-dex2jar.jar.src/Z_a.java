import java.io.IOException;
import java.util.List;
import java.util.Set;

class z_a
  extends KZa
{
  z_a(C_a paramC_a, String paramString, Object[] paramArrayOfObject, int paramInt, List paramList, boolean paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void b()
  {
    boolean bool = this.e.k.a(this.b, this.c, this.d);
    if (bool) {}
    try
    {
      this.e.s.a(this.b, s_a.f);
      if ((bool) || (this.d)) {
        synchronized (this.e)
        {
          this.e.u.remove(Integer.valueOf(this.b));
        }
      }
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/z_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */