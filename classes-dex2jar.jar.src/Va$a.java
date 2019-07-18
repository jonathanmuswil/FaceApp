import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

class Va$a
  extends InputStream
  implements DataInput
{
  private static final ByteOrder a = ByteOrder.LITTLE_ENDIAN;
  private static final ByteOrder b = ByteOrder.BIG_ENDIAN;
  private DataInputStream c;
  private ByteOrder d = ByteOrder.BIG_ENDIAN;
  final int e;
  int f;
  
  public Va$a(InputStream paramInputStream)
    throws IOException
  {
    this.c = new DataInputStream(paramInputStream);
    this.e = this.c.available();
    this.f = 0;
    this.c.mark(this.e);
  }
  
  public Va$a(byte[] paramArrayOfByte)
    throws IOException
  {
    this(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public int a()
  {
    return this.f;
  }
  
  public void a(ByteOrder paramByteOrder)
  {
    this.d = paramByteOrder;
  }
  
  public int available()
    throws IOException
  {
    return this.c.available();
  }
  
  public long b()
    throws IOException
  {
    return readInt() & 0xFFFFFFFF;
  }
  
  public void i(long paramLong)
    throws IOException
  {
    int i = this.f;
    if (i > paramLong)
    {
      this.f = 0;
      this.c.reset();
      this.c.mark(this.e);
    }
    else
    {
      paramLong -= i;
    }
    i = (int)paramLong;
    if (skipBytes(i) == i) {
      return;
    }
    throw new IOException("Couldn't seek up to the byteCount");
  }
  
  public int read()
    throws IOException
  {
    this.f += 1;
    return this.c.read();
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    paramInt1 = this.c.read(paramArrayOfByte, paramInt1, paramInt2);
    this.f += paramInt1;
    return paramInt1;
  }
  
  public boolean readBoolean()
    throws IOException
  {
    this.f += 1;
    return this.c.readBoolean();
  }
  
  public byte readByte()
    throws IOException
  {
    this.f += 1;
    if (this.f <= this.e)
    {
      int i = this.c.read();
      if (i >= 0) {
        return (byte)i;
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public char readChar()
    throws IOException
  {
    this.f += 2;
    return this.c.readChar();
  }
  
  public double readDouble()
    throws IOException
  {
    return Double.longBitsToDouble(readLong());
  }
  
  public float readFloat()
    throws IOException
  {
    return Float.intBitsToFloat(readInt());
  }
  
  public void readFully(byte[] paramArrayOfByte)
    throws IOException
  {
    this.f += paramArrayOfByte.length;
    if (this.f <= this.e)
    {
      if (this.c.read(paramArrayOfByte, 0, paramArrayOfByte.length) == paramArrayOfByte.length) {
        return;
      }
      throw new IOException("Couldn't read up to the length of buffer");
    }
    throw new EOFException();
  }
  
  public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    this.f += paramInt2;
    if (this.f <= this.e)
    {
      if (this.c.read(paramArrayOfByte, paramInt1, paramInt2) == paramInt2) {
        return;
      }
      throw new IOException("Couldn't read up to the length of buffer");
    }
    throw new EOFException();
  }
  
  public int readInt()
    throws IOException
  {
    this.f += 4;
    if (this.f <= this.e)
    {
      int i = this.c.read();
      int j = this.c.read();
      int k = this.c.read();
      int m = this.c.read();
      if ((i | j | k | m) >= 0)
      {
        Object localObject = this.d;
        if (localObject == a) {
          return (m << 24) + (k << 16) + (j << 8) + i;
        }
        if (localObject == b) {
          return (i << 24) + (j << 16) + (k << 8) + m;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(this.d);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public String readLine()
    throws IOException
  {
    Log.d("ExifInterface", "Currently unsupported");
    return null;
  }
  
  public long readLong()
    throws IOException
  {
    this.f += 8;
    if (this.f <= this.e)
    {
      int i = this.c.read();
      int j = this.c.read();
      int k = this.c.read();
      int m = this.c.read();
      int n = this.c.read();
      int i1 = this.c.read();
      int i2 = this.c.read();
      int i3 = this.c.read();
      if ((i | j | k | m | n | i1 | i2 | i3) >= 0)
      {
        Object localObject = this.d;
        if (localObject == a) {
          return (i3 << 56) + (i2 << 48) + (i1 << 40) + (n << 32) + (m << 24) + (k << 16) + (j << 8) + i;
        }
        if (localObject == b) {
          return (i << 56) + (j << 48) + (k << 40) + (m << 32) + (n << 24) + (i1 << 16) + (i2 << 8) + i3;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(this.d);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public short readShort()
    throws IOException
  {
    this.f += 2;
    if (this.f <= this.e)
    {
      int i = this.c.read();
      int j = this.c.read();
      if ((i | j) >= 0)
      {
        Object localObject = this.d;
        if (localObject == a) {
          return (short)((j << 8) + i);
        }
        if (localObject == b) {
          return (short)((i << 8) + j);
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(this.d);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public String readUTF()
    throws IOException
  {
    this.f += 2;
    return this.c.readUTF();
  }
  
  public int readUnsignedByte()
    throws IOException
  {
    this.f += 1;
    return this.c.readUnsignedByte();
  }
  
  public int readUnsignedShort()
    throws IOException
  {
    this.f += 2;
    if (this.f <= this.e)
    {
      int i = this.c.read();
      int j = this.c.read();
      if ((i | j) >= 0)
      {
        Object localObject = this.d;
        if (localObject == a) {
          return (j << 8) + i;
        }
        if (localObject == b) {
          return (i << 8) + j;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Invalid byte order: ");
        ((StringBuilder)localObject).append(this.d);
        throw new IOException(((StringBuilder)localObject).toString());
      }
      throw new EOFException();
    }
    throw new EOFException();
  }
  
  public int skipBytes(int paramInt)
    throws IOException
  {
    int i = Math.min(paramInt, this.e - this.f);
    paramInt = 0;
    while (paramInt < i) {
      paramInt += this.c.skipBytes(i - paramInt);
    }
    this.f += paramInt;
    return paramInt;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Va$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */