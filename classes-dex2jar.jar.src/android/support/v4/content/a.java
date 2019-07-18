package android.support.v4.content;

import Kc;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import wd;

public abstract class a<D>
  extends e<D>
{
  private final Executor j;
  volatile a<D>.a k;
  volatile a<D>.a l;
  long m;
  long n = -10000L;
  Handler o;
  
  public a(Context paramContext)
  {
    this(paramContext, l.c);
  }
  
  private a(Context paramContext, Executor paramExecutor)
  {
    super(paramContext);
    this.j = paramExecutor;
  }
  
  protected D A()
  {
    return (D)z();
  }
  
  void a(a<D>.a parama, D paramD)
  {
    c(paramD);
    if (this.l == parama)
    {
      s();
      this.n = SystemClock.uptimeMillis();
      this.l = null;
      e();
      x();
    }
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.k != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.k.l);
    }
    if (this.l != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.l);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.l.l);
    }
    if (this.m != 0L)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      wd.a(this.m, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      wd.a(this.n, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  void b(a<D>.a parama, D paramD)
  {
    if (this.k != parama)
    {
      a(parama, paramD);
    }
    else if (h())
    {
      c(paramD);
    }
    else
    {
      d();
      this.n = SystemClock.uptimeMillis();
      this.k = null;
      b(paramD);
    }
  }
  
  public void c(D paramD) {}
  
  protected boolean l()
  {
    if (this.k != null)
    {
      if (!this.e) {
        this.h = true;
      }
      if (this.l != null)
      {
        if (this.k.l)
        {
          this.k.l = false;
          this.o.removeCallbacks(this.k);
        }
        this.k = null;
        return false;
      }
      if (this.k.l)
      {
        this.k.l = false;
        this.o.removeCallbacks(this.k);
        this.k = null;
        return false;
      }
      boolean bool = this.k.a(false);
      if (bool)
      {
        this.l = this.k;
        w();
      }
      this.k = null;
      return bool;
    }
    return false;
  }
  
  protected void n()
  {
    super.n();
    c();
    this.k = new a();
    x();
  }
  
  public void w() {}
  
  void x()
  {
    if ((this.l == null) && (this.k != null))
    {
      if (this.k.l)
      {
        this.k.l = false;
        this.o.removeCallbacks(this.k);
      }
      if ((this.m > 0L) && (SystemClock.uptimeMillis() < this.n + this.m))
      {
        this.k.l = true;
        this.o.postAtTime(this.k, this.n + this.m);
        return;
      }
      this.k.a(this.j, null);
    }
  }
  
  public boolean y()
  {
    boolean bool;
    if (this.l != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract D z();
  
  final class a
    extends l<Void, Void, D>
    implements Runnable
  {
    private final CountDownLatch k = new CountDownLatch(1);
    boolean l;
    
    a() {}
    
    protected D a(Void... paramVarArgs)
    {
      try
      {
        paramVarArgs = a.this.A();
        return paramVarArgs;
      }
      catch (Kc paramVarArgs)
      {
        if (a()) {
          return null;
        }
        throw paramVarArgs;
      }
    }
    
    protected void b(D paramD)
    {
      try
      {
        a.this.a(this, paramD);
        return;
      }
      finally
      {
        this.k.countDown();
      }
    }
    
    protected void c(D paramD)
    {
      try
      {
        a.this.b(this, paramD);
        return;
      }
      finally
      {
        this.k.countDown();
      }
    }
    
    public void run()
    {
      this.l = false;
      a.this.x();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */