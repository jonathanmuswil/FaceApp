import java.io.EOFException;
import java.io.IOException;

final class J_a$b
  implements Eab
{
  private final jab a = new jab();
  private final jab b = new jab();
  private final long c;
  private oZa d;
  boolean e;
  boolean f;
  
  J_a$b(J_a paramJ_a, long paramLong)
  {
    this.c = paramLong;
  }
  
  private void d(long paramLong)
  {
    this.g.d.i(paramLong);
  }
  
  void a(lab paramlab, long paramLong)
    throws IOException
  {
    if (paramLong > 0L) {
      synchronized (this.g)
      {
        boolean bool = this.f;
        long l1 = this.b.size();
        long l2 = this.c;
        int i = 1;
        int j;
        if (l1 + paramLong > l2) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          paramlab.skip(paramLong);
          this.g.a(s_a.d);
          return;
        }
        if (bool)
        {
          paramlab.skip(paramLong);
          return;
        }
        l1 = paramlab.b(this.a, paramLong);
        if (l1 != -1L)
        {
          paramLong -= l1;
          synchronized (this.g)
          {
            if (this.b.size() == 0L) {
              j = i;
            } else {
              j = 0;
            }
            this.b.a(this.a);
            if (j != 0) {
              this.g.notifyAll();
            }
          }
        }
        throw new EOFException();
      }
    }
  }
  
  public long b(jab paramjab, long paramLong)
    throws IOException
  {
    if (paramLong >= 0L) {
      for (;;)
      {
        Object localObject = null;
        synchronized (this.g)
        {
          this.g.i.h();
          try
          {
            if (this.g.k != null) {
              if (this.g.l != null) {
                localObject = this.g.l;
              } else {
                localObject = new P_a(this.g.k);
              }
            }
            if (!this.e)
            {
              if (this.b.size() > 0L)
              {
                long l = this.b.b(paramjab, Math.min(paramLong, this.b.size()));
                paramjab = this.g;
                paramjab.a += l;
                paramLong = l;
                if (localObject == null)
                {
                  paramLong = l;
                  if (this.g.a >= this.g.d.o.c() / 2)
                  {
                    this.g.d.a(this.g.c, this.g.a);
                    this.g.a = 0L;
                    paramLong = l;
                  }
                }
              }
              else
              {
                if ((!this.f) && (localObject == null))
                {
                  this.g.j();
                  this.g.i.k();
                  continue;
                }
                paramLong = -1L;
              }
              this.g.i.k();
              if (paramLong != -1L)
              {
                d(paramLong);
                return paramLong;
              }
              if (localObject == null) {
                return -1L;
              }
              throw ((Throwable)localObject);
            }
            else
            {
              paramjab = new java/io/IOException;
              paramjab.<init>("stream closed");
              throw paramjab;
            }
          }
          finally
          {
            this.g.i.k();
          }
        }
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
    synchronized (this.g)
    {
      this.e = true;
      long l = this.b.size();
      this.b.a();
      this.g.notifyAll();
      if (l > 0L) {
        d(l);
      }
      this.g.a();
      return;
    }
  }
  
  public Gab n()
  {
    return this.g.i;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/J_a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */