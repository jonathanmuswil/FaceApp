import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class wca$a<V>
  extends wca.d<V>
{
  private final Closeable a;
  private final boolean b;
  
  protected wca$a(Closeable paramCloseable, boolean paramBoolean)
  {
    this.a = paramCloseable;
    this.b = paramBoolean;
  }
  
  protected void a()
    throws IOException
  {
    Closeable localCloseable = this.a;
    if ((localCloseable instanceof Flushable)) {
      ((Flushable)localCloseable).flush();
    }
    if (this.b) {}
    try
    {
      this.a.close();
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
    this.a.close();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wca$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */