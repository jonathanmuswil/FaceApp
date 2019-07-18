import java.io.File;
import java.io.IOException;

public final class Ne$b
{
  private final Ne.c a;
  private final boolean[] b;
  private boolean c;
  
  private Ne$b(Ne paramNe, Ne.c paramc)
  {
    this.a = paramc;
    if (Ne.c.d(paramc)) {
      paramNe = null;
    } else {
      paramNe = new boolean[Ne.b(paramNe)];
    }
    this.b = paramNe;
  }
  
  public File a(int paramInt)
    throws IOException
  {
    synchronized (this.d)
    {
      if (Ne.c.e(this.a) == this)
      {
        if (!Ne.c.d(this.a)) {
          this.b[paramInt] = true;
        }
        localObject1 = this.a.b(paramInt);
        if (!Ne.d(this.d).exists()) {
          Ne.d(this.d).mkdirs();
        }
        return (File)localObject1;
      }
      Object localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
  }
  
  public void a()
    throws IOException
  {
    Ne.a(this.d, this, false);
  }
  
  public void b()
  {
    if (!this.c) {}
    try
    {
      a();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public void c()
    throws IOException
  {
    Ne.a(this.d, this, true);
    this.c = true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ne$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */