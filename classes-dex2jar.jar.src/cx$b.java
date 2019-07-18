import java.io.IOException;

public final class cx$b
  extends IOException
{
  cx$b(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  cx$b(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cx$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */