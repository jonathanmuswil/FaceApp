import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract interface Rg$d<Data>
{
  public abstract Class<Data> a();
  
  public abstract Data a(File paramFile)
    throws FileNotFoundException;
  
  public abstract void a(Data paramData)
    throws IOException;
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Rg$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */