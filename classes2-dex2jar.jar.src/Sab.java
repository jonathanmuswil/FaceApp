import java.io.IOException;
import java.io.OutputStream;

final class sab
  implements Dab
{
  sab(Gab paramGab, OutputStream paramOutputStream) {}
  
  public void a(jab paramjab, long paramLong)
    throws IOException
  {
    Hab.a(paramjab.c, 0L, paramLong);
    while (paramLong > 0L)
    {
      this.a.e();
      Aab localAab = paramjab.b;
      int i = (int)Math.min(paramLong, localAab.c - localAab.b);
      this.b.write(localAab.a, localAab.b, i);
      localAab.b += i;
      long l1 = i;
      long l2 = paramLong - l1;
      paramjab.c -= l1;
      paramLong = l2;
      if (localAab.b == localAab.c)
      {
        paramjab.b = localAab.b();
        Bab.a(localAab);
        paramLong = l2;
      }
    }
  }
  
  public void close()
    throws IOException
  {
    this.b.close();
  }
  
  public void flush()
    throws IOException
  {
    this.b.flush();
  }
  
  public Gab n()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("sink(");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */