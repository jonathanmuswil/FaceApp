import java.io.IOException;

public final class SH$c
  extends IOException
{
  SH$c(String paramString)
  {
    super(paramString);
  }
  
  SH$c(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  SH$c(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/SH$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */