import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class zab
  implements lab
{
  public final jab a = new jab();
  public final Eab b;
  boolean c;
  
  zab(Eab paramEab)
  {
    if (paramEab != null)
    {
      this.b = paramEab;
      return;
    }
    throw new NullPointerException("source == null");
  }
  
  public int a(wab paramwab)
    throws IOException
  {
    if (!this.c)
    {
      int i;
      do
      {
        i = this.a.a(paramwab, true);
        if (i == -1) {
          return -1;
        }
        if (i != -2) {
          break;
        }
      } while (this.b.b(this.a, 8192L) != -1L);
      return -1;
      int j = paramwab.a[i].e();
      this.a.skip(j);
      return i;
    }
    throw new IllegalStateException("closed");
  }
  
  public long a(byte paramByte)
    throws IOException
  {
    return a(paramByte, 0L, Long.MAX_VALUE);
  }
  
  public long a(byte paramByte, long paramLong1, long paramLong2)
    throws IOException
  {
    if (!this.c)
    {
      if ((paramLong1 >= 0L) && (paramLong2 >= paramLong1))
      {
        while (paramLong1 < paramLong2)
        {
          long l = this.a.a(paramByte, paramLong1, paramLong2);
          if (l != -1L) {
            return l;
          }
          jab localjab = this.a;
          l = localjab.c;
          if ((l >= paramLong2) || (this.b.b(localjab, 8192L) == -1L)) {
            break;
          }
          paramLong1 = Math.max(paramLong1, l);
        }
        return -1L;
      }
      throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
    }
    throw new IllegalStateException("closed");
  }
  
  public long a(Dab paramDab)
    throws IOException
  {
    if (paramDab != null)
    {
      long l1 = 0L;
      while (this.b.b(this.a, 8192L) != -1L)
      {
        l2 = this.a.b();
        if (l2 > 0L)
        {
          l1 += l2;
          paramDab.a(this.a, l2);
        }
      }
      long l2 = l1;
      if (this.a.size() > 0L)
      {
        l2 = l1 + this.a.size();
        jab localjab = this.a;
        paramDab.a(localjab, localjab.size());
      }
      return l2;
    }
    throw new IllegalArgumentException("sink == null");
  }
  
  public boolean a(long paramLong)
    throws IOException
  {
    if (paramLong >= 0L)
    {
      if (!this.c)
      {
        do
        {
          localObject = this.a;
          if (((jab)localObject).c >= paramLong) {
            break;
          }
        } while (this.b.b((jab)localObject, 8192L) != -1L);
        return false;
        return true;
      }
      throw new IllegalStateException("closed");
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("byteCount < 0: ");
    ((StringBuilder)localObject).append(paramLong);
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    if (paramjab != null)
    {
      if (paramLong >= 0L)
      {
        if (!this.c)
        {
          jab localjab = this.a;
          if ((localjab.c == 0L) && (this.b.b(localjab, 8192L) == -1L)) {
            return -1L;
          }
          paramLong = Math.min(paramLong, this.a.c);
          return this.a.b(paramjab, paramLong);
        }
        throw new IllegalStateException("closed");
      }
      paramjab = new StringBuilder();
      paramjab.append("byteCount < 0: ");
      paramjab.append(paramLong);
      throw new IllegalArgumentException(paramjab.toString());
    }
    throw new IllegalArgumentException("sink == null");
  }
  
  public mab b(long paramLong)
    throws IOException
  {
    f(paramLong);
    return this.a.b(paramLong);
  }
  
  public String c(long paramLong)
    throws IOException
  {
    if (paramLong >= 0L)
    {
      long l1;
      if (paramLong == Long.MAX_VALUE) {
        l1 = Long.MAX_VALUE;
      } else {
        l1 = paramLong + 1L;
      }
      long l2 = a((byte)10, 0L, l1);
      if (l2 != -1L) {
        return this.a.j(l2);
      }
      if ((l1 < Long.MAX_VALUE) && (a(l1)) && (this.a.h(l1 - 1L) == 13) && (a(1L + l1)) && (this.a.h(l1) == 10)) {
        return this.a.j(l1);
      }
      localObject1 = new jab();
      Object localObject2 = this.a;
      ((jab)localObject2).a((jab)localObject1, 0L, Math.min(32L, ((jab)localObject2).size()));
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("\\n not found: limit=");
      ((StringBuilder)localObject2).append(Math.min(this.a.size(), paramLong));
      ((StringBuilder)localObject2).append(" content=");
      ((StringBuilder)localObject2).append(((jab)localObject1).d().b());
      ((StringBuilder)localObject2).append('…');
      throw new EOFException(((StringBuilder)localObject2).toString());
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("limit < 0: ");
    ((StringBuilder)localObject1).append(paramLong);
    throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
  }
  
  public void close()
    throws IOException
  {
    if (this.c) {
      return;
    }
    this.c = true;
    this.b.close();
    this.a.a();
  }
  
  public byte[] e(long paramLong)
    throws IOException
  {
    f(paramLong);
    return this.a.e(paramLong);
  }
  
  public void f(long paramLong)
    throws IOException
  {
    if (a(paramLong)) {
      return;
    }
    throw new EOFException();
  }
  
  public jab getBuffer()
  {
    return this.a;
  }
  
  public boolean isOpen()
  {
    return this.c ^ true;
  }
  
  public jab m()
  {
    return this.a;
  }
  
  public Gab n()
  {
    return this.b.n();
  }
  
  public byte[] o()
    throws IOException
  {
    this.a.a(this.b);
    return this.a.o();
  }
  
  public boolean p()
    throws IOException
  {
    if (!this.c)
    {
      boolean bool;
      if ((this.a.p()) && (this.b.b(this.a, 8192L) == -1L)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    throw new IllegalStateException("closed");
  }
  
  public String r()
    throws IOException
  {
    return c(Long.MAX_VALUE);
  }
  
  public int read(ByteBuffer paramByteBuffer)
    throws IOException
  {
    jab localjab = this.a;
    if ((localjab.c == 0L) && (this.b.b(localjab, 8192L) == -1L)) {
      return -1;
    }
    return this.a.read(paramByteBuffer);
  }
  
  public byte readByte()
    throws IOException
  {
    f(1L);
    return this.a.readByte();
  }
  
  public void readFully(byte[] paramArrayOfByte)
    throws IOException
  {
    try
    {
      f(paramArrayOfByte.length);
      this.a.readFully(paramArrayOfByte);
      return;
    }
    catch (EOFException localEOFException)
    {
      int i = 0;
      for (;;)
      {
        jab localjab = this.a;
        long l = localjab.c;
        if (l <= 0L) {
          break label73;
        }
        int j = localjab.a(paramArrayOfByte, i, (int)l);
        if (j == -1) {
          break;
        }
        i += j;
      }
      throw new AssertionError();
      label73:
      throw localEOFException;
    }
  }
  
  public int readInt()
    throws IOException
  {
    f(4L);
    return this.a.readInt();
  }
  
  public short readShort()
    throws IOException
  {
    f(2L);
    return this.a.readShort();
  }
  
  public int s()
    throws IOException
  {
    f(4L);
    return this.a.s();
  }
  
  public void skip(long paramLong)
    throws IOException
  {
    if (!this.c)
    {
      while (paramLong > 0L)
      {
        jab localjab = this.a;
        if ((localjab.c == 0L) && (this.b.b(localjab, 8192L) == -1L)) {
          throw new EOFException();
        }
        long l = Math.min(paramLong, this.a.size());
        this.a.skip(l);
        paramLong -= l;
      }
      return;
    }
    throw new IllegalStateException("closed");
  }
  
  public short t()
    throws IOException
  {
    f(2L);
    return this.a.t();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("buffer(");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public long u()
    throws IOException
  {
    f(1L);
    int j;
    byte b1;
    for (int i = 0;; i = j)
    {
      j = i + 1;
      if (!a(j)) {
        break label106;
      }
      b1 = this.a.h(i);
      if (((b1 < 48) || (b1 > 57)) && ((b1 < 97) || (b1 > 102)) && ((b1 < 65) || (b1 > 70))) {
        break;
      }
    }
    if (i == 0) {
      throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[] { Byte.valueOf(b1) }));
    }
    label106:
    return this.a.u();
  }
  
  public InputStream v()
  {
    return new yab(this);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */