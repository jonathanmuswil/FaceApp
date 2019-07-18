import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class qab
  implements Eab
{
  private int a = 0;
  private final lab b;
  private final Inflater c;
  private final rab d;
  private final CRC32 e = new CRC32();
  
  public qab(Eab paramEab)
  {
    if (paramEab != null)
    {
      this.c = new Inflater(true);
      this.b = vab.a(paramEab);
      this.d = new rab(this.b, this.c);
      return;
    }
    throw new IllegalArgumentException("source == null");
  }
  
  private void a()
    throws IOException
  {
    this.b.f(10L);
    int i = this.b.m().h(3L);
    int j;
    if ((i >> 1 & 0x1) == 1) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      a(this.b.m(), 0L, 10L);
    }
    a("ID1ID2", 8075, this.b.readShort());
    this.b.skip(8L);
    long l;
    if ((i >> 2 & 0x1) == 1)
    {
      this.b.f(2L);
      if (j != 0) {
        a(this.b.m(), 0L, 2L);
      }
      int k = this.b.m().t();
      lab locallab = this.b;
      l = k;
      locallab.f(l);
      if (j != 0) {
        a(this.b.m(), 0L, l);
      }
      this.b.skip(l);
    }
    if ((i >> 3 & 0x1) == 1)
    {
      l = this.b.a((byte)0);
      if (l != -1L)
      {
        if (j != 0) {
          a(this.b.m(), 0L, l + 1L);
        }
        this.b.skip(l + 1L);
      }
      else
      {
        throw new EOFException();
      }
    }
    if ((i >> 4 & 0x1) == 1)
    {
      l = this.b.a((byte)0);
      if (l != -1L)
      {
        if (j != 0) {
          a(this.b.m(), 0L, l + 1L);
        }
        this.b.skip(l + 1L);
      }
      else
      {
        throw new EOFException();
      }
    }
    if (j != 0)
    {
      a("FHCRC", this.b.t(), (short)(int)this.e.getValue());
      this.e.reset();
    }
  }
  
  private void a(jab paramjab, long paramLong1, long paramLong2)
  {
    int i;
    int j;
    for (paramjab = paramjab.b;; paramjab = paramjab.f)
    {
      i = paramjab.c;
      j = paramjab.b;
      if (paramLong1 < i - j) {
        break;
      }
      paramLong1 -= i - j;
    }
    while (paramLong2 > 0L)
    {
      j = (int)(paramjab.b + paramLong1);
      i = (int)Math.min(paramjab.c - j, paramLong2);
      this.e.update(paramjab.a, j, i);
      paramLong2 -= i;
      paramjab = paramjab.f;
      paramLong1 = 0L;
    }
  }
  
  private void a(String paramString, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 == paramInt1) {
      return;
    }
    throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) }));
  }
  
  private void b()
    throws IOException
  {
    a("CRC", this.b.s(), (int)this.e.getValue());
    a("ISIZE", this.b.s(), (int)this.c.getBytesWritten());
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    boolean bool = paramLong < 0L;
    if (!bool)
    {
      if (!bool) {
        return 0L;
      }
      if (this.a == 0)
      {
        a();
        this.a = 1;
      }
      if (this.a == 1)
      {
        long l = paramjab.c;
        paramLong = this.d.b(paramjab, paramLong);
        if (paramLong != -1L)
        {
          a(paramjab, l, paramLong);
          return paramLong;
        }
        this.a = 2;
      }
      if (this.a == 2)
      {
        b();
        this.a = 3;
        if (!this.b.p()) {
          throw new IOException("gzip finished without exhausting source");
        }
      }
      return -1L;
    }
    paramjab = new StringBuilder();
    paramjab.append("byteCount < 0: ");
    paramjab.append(paramLong);
    throw new IllegalArgumentException(paramjab.toString());
  }
  
  public void close()
    throws IOException
  {
    this.d.close();
  }
  
  public Gab n()
  {
    return this.b.n();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */