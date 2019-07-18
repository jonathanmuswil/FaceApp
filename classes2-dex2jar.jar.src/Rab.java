import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class rab
  implements Eab
{
  private final lab a;
  private final Inflater b;
  private int c;
  private boolean d;
  
  rab(lab paramlab, Inflater paramInflater)
  {
    if (paramlab != null)
    {
      if (paramInflater != null)
      {
        this.a = paramlab;
        this.b = paramInflater;
        return;
      }
      throw new IllegalArgumentException("inflater == null");
    }
    throw new IllegalArgumentException("source == null");
  }
  
  private void b()
    throws IOException
  {
    int i = this.c;
    if (i == 0) {
      return;
    }
    i -= this.b.getRemaining();
    this.c -= i;
    this.a.skip(i);
  }
  
  public final boolean a()
    throws IOException
  {
    if (!this.b.needsInput()) {
      return false;
    }
    b();
    if (this.b.getRemaining() == 0)
    {
      if (this.a.p()) {
        return true;
      }
      Aab localAab = this.a.m().b;
      int i = localAab.c;
      int j = localAab.b;
      this.c = (i - j);
      this.b.setInput(localAab.a, j, this.c);
      return false;
    }
    throw new IllegalStateException("?");
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    boolean bool1 = paramLong < 0L;
    if (!bool1)
    {
      if (!this.d)
      {
        if (!bool1) {
          return 0L;
        }
        for (;;)
        {
          boolean bool2 = a();
          try
          {
            Aab localAab = paramjab.b(1);
            int i = (int)Math.min(paramLong, 8192 - localAab.c);
            i = this.b.inflate(localAab.a, localAab.c, i);
            if (i > 0)
            {
              localAab.c += i;
              long l = paramjab.c;
              paramLong = i;
              paramjab.c = (l + paramLong);
              return paramLong;
            }
            if ((!this.b.finished()) && (!this.b.needsDictionary()))
            {
              if (bool2)
              {
                paramjab = new java/io/EOFException;
                paramjab.<init>("source exhausted prematurely");
                throw paramjab;
              }
            }
            else
            {
              b();
              if (localAab.b == localAab.c)
              {
                paramjab.b = localAab.b();
                Bab.a(localAab);
              }
              return -1L;
            }
          }
          catch (DataFormatException paramjab)
          {
            throw new IOException(paramjab);
          }
        }
      }
      throw new IllegalStateException("closed");
    }
    paramjab = new StringBuilder();
    paramjab.append("byteCount < 0: ");
    paramjab.append(paramLong);
    throw new IllegalArgumentException(paramjab.toString());
  }
  
  public void close()
    throws IOException
  {
    if (this.d) {
      return;
    }
    this.b.end();
    this.d = true;
    this.a.close();
  }
  
  public Gab n()
  {
    return this.a.n();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/rab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */