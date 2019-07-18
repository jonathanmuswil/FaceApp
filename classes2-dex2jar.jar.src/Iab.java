import java.io.InputStream;

class iab
  extends InputStream
{
  iab(jab paramjab) {}
  
  public int available()
  {
    return (int)Math.min(this.a.c, 2147483647L);
  }
  
  public void close() {}
  
  public int read()
  {
    jab localjab = this.a;
    if (localjab.c > 0L) {
      return localjab.readByte() & 0xFF;
    }
    return -1;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return this.a.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(".inputStream()");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */