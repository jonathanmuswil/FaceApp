import java.io.IOException;

final class J_a$a
  implements Dab
{
  private final jab a = new jab();
  private oZa b;
  boolean c;
  boolean d;
  
  J_a$a(J_a paramJ_a) {}
  
  private void a(boolean paramBoolean)
    throws IOException
  {
    synchronized (this.e)
    {
      this.e.j.h();
      try
      {
        while ((this.e.b <= 0L) && (!this.d) && (!this.c) && (this.e.k == null)) {
          this.e.j();
        }
        this.e.j.k();
        this.e.b();
        long l = Math.min(this.e.b, this.a.size());
        J_a localJ_a2 = this.e;
        localJ_a2.b -= l;
        this.e.j.h();
        if (paramBoolean) {
          try
          {
            if (l == this.a.size()) {
              paramBoolean = true;
            }
          }
          finally
          {
            break label189;
          }
        }
        paramBoolean = false;
        this.e.d.a(this.e.c, paramBoolean, this.a, l);
        this.e.j.k();
        return;
      }
      finally
      {
        label189:
        this.e.j.k();
      }
      this.e.j.k();
      throw ((Throwable)localObject1);
    }
  }
  
  public void a(jab paramjab, long paramLong)
    throws IOException
  {
    this.a.a(paramjab, paramLong);
    while (this.a.size() >= 16384L) {
      a(false);
    }
  }
  
  public void close()
    throws IOException
  {
    synchronized (this.e)
    {
      if (this.c) {
        return;
      }
      if (!this.e.h.d)
      {
        int i;
        if (this.a.size() > 0L) {
          i = 1;
        } else {
          i = 0;
        }
        int j;
        if (this.b != null) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          while (this.a.size() > 0L) {
            a(false);
          }
          ??? = this.e;
          ???.d.a(???.c, true, LZa.a(this.b));
        }
        else
        {
          if (i != 0) {
            while (this.a.size() > 0L) {
              a(true);
            }
          }
          ??? = this.e;
          ???.d.a(???.c, true, null, 0L);
        }
      }
      synchronized (this.e)
      {
        this.c = true;
        this.e.d.flush();
        this.e.a();
        return;
      }
    }
  }
  
  public void flush()
    throws IOException
  {
    synchronized (this.e)
    {
      this.e.b();
      while (this.a.size() > 0L)
      {
        a(false);
        this.e.d.flush();
      }
      return;
    }
  }
  
  public Gab n()
  {
    return this.e.j;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/J_a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */