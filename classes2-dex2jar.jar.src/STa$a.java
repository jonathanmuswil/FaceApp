import java.util.concurrent.atomic.AtomicInteger;

final class sTa$a<T>
  extends bSa<T>
  implements VQa<T>
{
  final VQa<? super T> a;
  final uRa b;
  kRa c;
  VRa<T> d;
  boolean e;
  
  sTa$a(VQa<? super T> paramVQa, uRa paramuRa)
  {
    this.a = paramVQa;
    this.b = paramuRa;
  }
  
  public int a(int paramInt)
  {
    VRa localVRa = this.d;
    if ((localVRa != null) && ((paramInt & 0x4) == 0))
    {
      paramInt = localVRa.a(paramInt);
      if (paramInt != 0)
      {
        boolean bool = true;
        if (paramInt != 1) {
          bool = false;
        }
        this.e = bool;
      }
      return paramInt;
    }
    return 0;
  }
  
  public void a()
  {
    this.a.a();
    b();
  }
  
  public void a(T paramT)
  {
    this.a.a(paramT);
  }
  
  public void a(Throwable paramThrowable)
  {
    this.a.a(paramThrowable);
    b();
  }
  
  public void a(kRa paramkRa)
  {
    if (IRa.a(this.c, paramkRa))
    {
      this.c = paramkRa;
      if ((paramkRa instanceof VRa)) {
        this.d = ((VRa)paramkRa);
      }
      this.a.a(this);
    }
  }
  
  void b()
  {
    if (compareAndSet(0, 1)) {
      try
      {
        this.b.run();
      }
      catch (Throwable localThrowable)
      {
        pRa.b(localThrowable);
        zVa.b(localThrowable);
      }
    }
  }
  
  public void clear()
  {
    this.d.clear();
  }
  
  public boolean h()
  {
    return this.c.h();
  }
  
  public void i()
  {
    this.c.i();
    b();
  }
  
  public boolean isEmpty()
  {
    return this.d.isEmpty();
  }
  
  public T poll()
    throws Exception
  {
    Object localObject = this.d.poll();
    if ((localObject == null) && (this.e)) {
      b();
    }
    return (T)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sTa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */