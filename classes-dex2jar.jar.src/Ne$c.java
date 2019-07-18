import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class Ne$c
{
  private final String a;
  private final long[] b;
  File[] c;
  File[] d;
  private boolean e;
  private Ne.b f;
  private long g;
  
  private Ne$c(Ne paramNe, String paramString)
  {
    this.a = paramString;
    this.b = new long[Ne.b(paramNe)];
    this.c = new File[Ne.b(paramNe)];
    this.d = new File[Ne.b(paramNe)];
    paramString = new StringBuilder(paramString);
    paramString.append('.');
    int i = paramString.length();
    for (int j = 0; j < Ne.b(paramNe); j++)
    {
      paramString.append(j);
      this.c[j] = new File(Ne.d(paramNe), paramString.toString());
      paramString.append(".tmp");
      this.d[j] = new File(Ne.d(paramNe), paramString.toString());
      paramString.setLength(i);
    }
  }
  
  private IOException a(String[] paramArrayOfString)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("unexpected journal line: ");
    localStringBuilder.append(Arrays.toString(paramArrayOfString));
    throw new IOException(localStringBuilder.toString());
  }
  
  private void b(String[] paramArrayOfString)
    throws IOException
  {
    if (paramArrayOfString.length == Ne.b(this.h))
    {
      int i = 0;
      try
      {
        while (i < paramArrayOfString.length)
        {
          this.b[i] = Long.parseLong(paramArrayOfString[i]);
          i++;
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        a(paramArrayOfString);
        throw null;
      }
    }
    a(paramArrayOfString);
    throw null;
  }
  
  public File a(int paramInt)
  {
    return this.c[paramInt];
  }
  
  public String a()
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (long l : this.b)
    {
      localStringBuilder.append(' ');
      localStringBuilder.append(l);
    }
    return localStringBuilder.toString();
  }
  
  public File b(int paramInt)
  {
    return this.d[paramInt];
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Ne$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */