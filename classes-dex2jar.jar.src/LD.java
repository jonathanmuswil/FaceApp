import android.util.Log;
import java.io.Writer;

public class ld
  extends Writer
{
  private final String a;
  private StringBuilder b = new StringBuilder(128);
  
  public ld(String paramString)
  {
    this.a = paramString;
  }
  
  private void a()
  {
    if (this.b.length() > 0)
    {
      Log.d(this.a, this.b.toString());
      StringBuilder localStringBuilder = this.b;
      localStringBuilder.delete(0, localStringBuilder.length());
    }
  }
  
  public void close()
  {
    a();
  }
  
  public void flush()
  {
    a();
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        a();
      } else {
        this.b.append(c);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ld.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */