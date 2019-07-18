import java.io.OutputStream;

class hab
  extends OutputStream
{
  hab(jab paramjab) {}
  
  public void close() {}
  
  public void flush() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.a);
    localStringBuilder.append(".outputStream()");
    return localStringBuilder.toString();
  }
  
  public void write(int paramInt)
  {
    this.a.writeByte((byte)paramInt);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/hab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */