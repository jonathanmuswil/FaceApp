import java.io.IOException;

public final class XL$c
  extends IOException
{
  XL$c(String paramString)
  {
    super(paramString);
  }
  
  XL$c(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  XL$c(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/XL$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */