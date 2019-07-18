package android.support.v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class l<Params, Progress, Result>
{
  private static final ThreadFactory a = new h();
  private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
  public static final Executor c = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, b, a);
  private static b d;
  private static volatile Executor e = c;
  private final d<Params, Result> f = new i(this);
  private final FutureTask<Result> g = new j(this, this.f);
  private volatile c h = c.a;
  final AtomicBoolean i = new AtomicBoolean();
  final AtomicBoolean j = new AtomicBoolean();
  
  private static Handler d()
  {
    try
    {
      if (d == null)
      {
        localb = new android/support/v4/content/l$b;
        localb.<init>();
        d = localb;
      }
      b localb = d;
      return localb;
    }
    finally {}
  }
  
  public final l<Params, Progress, Result> a(Executor paramExecutor, Params... paramVarArgs)
  {
    if (this.h != c.a)
    {
      int k = k.a[this.h.ordinal()];
      if (k != 1)
      {
        if (k != 2) {
          throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
      }
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    this.h = c.b;
    c();
    this.f.a = paramVarArgs;
    paramExecutor.execute(this.g);
    return this;
  }
  
  protected abstract Result a(Params... paramVarArgs);
  
  void a(Result paramResult)
  {
    if (a()) {
      b(paramResult);
    } else {
      c(paramResult);
    }
    this.h = c.c;
  }
  
  public final boolean a()
  {
    return this.i.get();
  }
  
  public final boolean a(boolean paramBoolean)
  {
    this.i.set(true);
    return this.g.cancel(paramBoolean);
  }
  
  protected void b() {}
  
  protected void b(Result paramResult)
  {
    b();
  }
  
  protected void b(Progress... paramVarArgs) {}
  
  protected void c() {}
  
  protected void c(Result paramResult) {}
  
  Result d(Result paramResult)
  {
    d().obtainMessage(1, new a(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  void e(Result paramResult)
  {
    if (!this.j.get()) {
      d(paramResult);
    }
  }
  
  private static class a<Data>
  {
    final l a;
    final Data[] b;
    
    a(l paraml, Data... paramVarArgs)
    {
      this.a = paraml;
      this.b = paramVarArgs;
    }
  }
  
  private static class b
    extends Handler
  {
    b()
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      l.a locala = (l.a)paramMessage.obj;
      int i = paramMessage.what;
      if (i != 1)
      {
        if (i == 2) {
          locala.a.b(locala.b);
        }
      }
      else {
        locala.a.a(locala.b[0]);
      }
    }
  }
  
  public static enum c
  {
    private c() {}
  }
  
  private static abstract class d<Params, Result>
    implements Callable<Result>
  {
    Params[] a;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */