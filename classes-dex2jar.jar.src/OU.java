import java.io.IOException;

public class ou<M extends ou<M>>
  extends tu
{
  protected qu b;
  
  public void a(mu parammu)
    throws IOException
  {
    if (this.b == null) {
      return;
    }
    for (int i = 0; i < this.b.b(); i++) {
      this.b.a(i).a(parammu);
    }
  }
  
  protected int b()
  {
    if (this.b != null) {
      for (int i = 0; i < this.b.b(); i++) {
        this.b.a(i).a();
      }
    }
    return 0;
  }
  
  public M d()
    throws CloneNotSupportedException
  {
    ou localou = (ou)super.c();
    su.a(this, localou);
    return localou;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */