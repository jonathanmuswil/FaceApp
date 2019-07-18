import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ej<R>
  implements bj<R>, fj<R>
{
  private static final ej.a a = new ej.a();
  private final int b;
  private final int c;
  private final boolean d;
  private final ej.a e;
  private R f;
  private cj g;
  private boolean h;
  private boolean i;
  private boolean j;
  private Qf k;
  
  public ej(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, true, a);
  }
  
  ej(int paramInt1, int paramInt2, boolean paramBoolean, ej.a parama)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramBoolean;
    this.e = parama;
  }
  
  private R a(Long paramLong)
    throws ExecutionException, InterruptedException, TimeoutException
  {
    try
    {
      if ((this.d) && (!isDone())) {
        Pj.a();
      }
      if (!this.h)
      {
        if (!this.j)
        {
          if (this.i)
          {
            paramLong = this.f;
            return paramLong;
          }
          if (paramLong == null)
          {
            this.e.a(this, 0L);
          }
          else if (paramLong.longValue() > 0L)
          {
            long l1 = System.currentTimeMillis();
            long l2 = paramLong.longValue() + l1;
            while ((!isDone()) && (l1 < l2))
            {
              this.e.a(this, l2 - l1);
              l1 = System.currentTimeMillis();
            }
          }
          if (!Thread.interrupted())
          {
            if (!this.j)
            {
              if (!this.h)
              {
                if (this.i)
                {
                  paramLong = this.f;
                  return paramLong;
                }
                paramLong = new java/util/concurrent/TimeoutException;
                paramLong.<init>();
                throw paramLong;
              }
              paramLong = new java/util/concurrent/CancellationException;
              paramLong.<init>();
              throw paramLong;
            }
            paramLong = new java/util/concurrent/ExecutionException;
            paramLong.<init>(this.k);
            throw paramLong;
          }
          paramLong = new java/lang/InterruptedException;
          paramLong.<init>();
          throw paramLong;
        }
        paramLong = new java/util/concurrent/ExecutionException;
        paramLong.<init>(this.k);
        throw paramLong;
      }
      paramLong = new java/util/concurrent/CancellationException;
      paramLong.<init>();
      throw paramLong;
    }
    finally {}
  }
  
  public void a(Drawable paramDrawable) {}
  
  public void a(cj paramcj)
  {
    try
    {
      this.g = paramcj;
      return;
    }
    finally
    {
      paramcj = finally;
      throw paramcj;
    }
  }
  
  public void a(R paramR, xj<? super R> paramxj) {}
  
  public void a(rj paramrj) {}
  
  public boolean a(Qf paramQf, Object paramObject, sj<R> paramsj, boolean paramBoolean)
  {
    try
    {
      this.j = true;
      this.k = paramQf;
      this.e.a(this);
      return false;
    }
    finally
    {
      paramQf = finally;
      throw paramQf;
    }
  }
  
  public boolean a(R paramR, Object paramObject, sj<R> paramsj, a parama, boolean paramBoolean)
  {
    try
    {
      this.i = true;
      this.f = paramR;
      this.e.a(this);
      return false;
    }
    finally
    {
      paramR = finally;
      throw paramR;
    }
  }
  
  public void b(Drawable paramDrawable) {}
  
  public void b(rj paramrj)
  {
    paramrj.a(this.b, this.c);
  }
  
  public void c(Drawable paramDrawable) {}
  
  public boolean cancel(boolean paramBoolean)
  {
    try
    {
      boolean bool = isDone();
      if (bool) {
        return false;
      }
      this.h = true;
      this.e.a(this);
      if ((paramBoolean) && (this.g != null))
      {
        this.g.clear();
        this.g = null;
      }
      return true;
    }
    finally {}
  }
  
  public R get()
    throws InterruptedException, ExecutionException
  {
    try
    {
      Object localObject = a(null);
      return (R)localObject;
    }
    catch (TimeoutException localTimeoutException)
    {
      throw new AssertionError(localTimeoutException);
    }
  }
  
  public R get(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException, ExecutionException, TimeoutException
  {
    return (R)a(Long.valueOf(paramTimeUnit.toMillis(paramLong)));
  }
  
  public cj getRequest()
  {
    try
    {
      cj localcj = this.g;
      return localcj;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void i() {}
  
  public boolean isCancelled()
  {
    try
    {
      boolean bool = this.h;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isDone()
  {
    try
    {
      if ((!this.h) && (!this.i))
      {
        bool = this.j;
        if (!bool)
        {
          bool = false;
          break label35;
        }
      }
      boolean bool = true;
      label35:
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void j() {}
  
  public void onDestroy() {}
  
  static class a
  {
    void a(Object paramObject)
    {
      paramObject.notifyAll();
    }
    
    void a(Object paramObject, long paramLong)
      throws InterruptedException
    {
      paramObject.wait(paramLong);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */