import java.util.concurrent.TimeUnit;

final class qTa$a<T>
  implements VQa<T>, kRa
{
  final VQa<? super T> a;
  final long b;
  final TimeUnit c;
  final WQa.c d;
  final boolean e;
  kRa f;
  
  qTa$a(VQa<? super T> paramVQa, long paramLong, TimeUnit paramTimeUnit, WQa.c paramc, boolean paramBoolean)
  {
    this.a = paramVQa;
    this.b = paramLong;
    this.c = paramTimeUnit;
    this.d = paramc;
    this.e = paramBoolean;
  }
  
  public void a()
  {
    this.d.a(new qTa.a.a(), this.b, this.c);
  }
  
  public void a(T paramT)
  {
    this.d.a(new qTa.a.c(paramT), this.b, this.c);
  }
  
  public void a(Throwable paramThrowable)
  {
    WQa.c localc = this.d;
    paramThrowable = new qTa.a.b(paramThrowable);
    long l;
    if (this.e) {
      l = this.b;
    } else {
      l = 0L;
    }
    localc.a(paramThrowable, l, this.c);
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.f, paramkRa))
    {
      this.f = paramkRa;
      this.a.a(this);
    }
  }
  
  public boolean h()
  {
    return this.d.h();
  }
  
  public void i()
  {
    this.f.i();
    this.d.i();
  }
  
  final class a
    implements Runnable
  {
    a() {}
    
    public void run()
    {
      try
      {
        qTa.a.this.a.a();
        return;
      }
      finally
      {
        qTa.a.this.d.i();
      }
    }
  }
  
  final class b
    implements Runnable
  {
    private final Throwable a;
    
    b(Throwable paramThrowable)
    {
      this.a = paramThrowable;
    }
    
    public void run()
    {
      try
      {
        qTa.a.this.a.a(this.a);
        return;
      }
      finally
      {
        qTa.a.this.d.i();
      }
    }
  }
  
  final class c
    implements Runnable
  {
    private final T a;
    
    c()
    {
      Object localObject;
      this.a = localObject;
    }
    
    public void run()
    {
      qTa.a.this.a.a(this.a);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/qTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */