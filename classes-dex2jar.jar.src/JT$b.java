import java.io.IOException;

public class JT$b
  extends IOException
{
  JT$b(String paramString, Throwable paramThrowable)
  {
    super(localStringBuilder.toString(), paramThrowable);
  }
  
  JT$b(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/JT$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */