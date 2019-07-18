import android.util.Log;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

final class Rg$c<Data>
  implements Ze<Data>
{
  private final File a;
  private final Rg.d<Data> b;
  private Data c;
  
  Rg$c(File paramFile, Rg.d<Data> paramd)
  {
    this.a = paramFile;
    this.b = paramd;
  }
  
  public Class<Data> a()
  {
    return this.b.a();
  }
  
  public void a(Fe paramFe, Ze.a<? super Data> parama)
  {
    try
    {
      this.c = this.b.a(this.a);
      parama.a(this.c);
      return;
    }
    catch (FileNotFoundException paramFe)
    {
      if (Log.isLoggable("FileLoader", 3)) {
        Log.d("FileLoader", "Failed to open file", paramFe);
      }
      parama.a(paramFe);
    }
  }
  
  public void b()
  {
    Object localObject = this.c;
    if (localObject != null) {}
    try
    {
      this.b.a(localObject);
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public a c()
  {
    return a.a;
  }
  
  public void cancel() {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Rg$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */