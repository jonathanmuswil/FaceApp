import java.io.IOException;
import java.io.InputStream;

class yab
  extends InputStream
{
  yab(zab paramzab) {}
  
  public int available()
    throws IOException
  {
    zab localzab = this.a;
    if (!localzab.c) {
      return (int)Math.min(localzab.a.c, 2147483647L);
    }
    throw new IOException("closed");
  }
  
  public void close()
    throws IOException
  {
    this.a.close();
  }
  
  public int read()
    throws IOException
  {
    zab localzab = this.a;
    if (!localzab.c)
    {
      jab localjab = localzab.a;
      if ((localjab.c == 0L) && (localzab.b.b(localjab, 8192L) == -1L)) {
        return -1;
      }
      return this.a.a.readByte() & 0xFF;
    }
    throw new IOException("closed");
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (!this.a.c)
    {
      Hab.a(paramArrayOfByte.length, paramInt1, paramInt2);
      zab localzab = this.a;
      jab localjab = localzab.a;
      if ((localjab.c == 0L) && (localzab.b.b(localjab, 8192L) == -1L)) {
        return -1;
      }
      return this.a.a.a(paramArrayOfByte, paramInt1, paramInt2);
    }
    throw new IOException("closed");
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(".inputStream()");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */