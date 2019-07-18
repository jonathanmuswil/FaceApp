import java.io.IOException;

public final class ls$c
  extends IOException
{
  ls$c(String paramString)
  {
    super(paramString);
  }
  
  ls$c(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  ls$c(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ls$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */