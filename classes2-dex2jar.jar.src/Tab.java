import java.io.IOException;
import java.io.InputStream;

final class tab
  implements Eab
{
  tab(Gab paramGab, InputStream paramInputStream) {}
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    boolean bool = paramLong < 0L;
    if (!bool)
    {
      if (!bool) {
        return 0L;
      }
      try
      {
        this.a.e();
        Aab localAab = paramjab.b(1);
        int i = (int)Math.min(paramLong, 8192 - localAab.c);
        i = this.b.read(localAab.a, localAab.c, i);
        if (i == -1) {
          return -1L;
        }
        localAab.c += i;
        long l = paramjab.c;
        paramLong = i;
        paramjab.c = (l + paramLong);
        return paramLong;
      }
      catch (AssertionError paramjab)
      {
        if (vab.a(paramjab)) {
          throw new IOException(paramjab);
        }
        throw paramjab;
      }
    }
    paramjab = new StringBuilder();
    paramjab.append("byteCount < 0: ");
    paramjab.append(paramLong);
    throw new IllegalArgumentException(paramjab.toString());
  }
  
  public void close()
    throws IOException
  {
    this.b.close();
  }
  
  public Gab n()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("source(");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/tab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */