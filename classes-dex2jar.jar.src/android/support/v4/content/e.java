package android.support.v4.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kd;

public class e<D>
{
  int a;
  c<D> b;
  b<D> c;
  Context d;
  boolean e = false;
  boolean f = false;
  boolean g = true;
  boolean h = false;
  boolean i = false;
  
  public e(Context paramContext)
  {
    this.d = paramContext.getApplicationContext();
  }
  
  public String a(D paramD)
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    kd.a(paramD, localStringBuilder);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void a(int paramInt, c<D> paramc)
  {
    if (this.b == null)
    {
      this.b = paramc;
      this.a = paramInt;
      return;
    }
    throw new IllegalStateException("There is already a listener registered");
  }
  
  public void a(c<D> paramc)
  {
    c localc = this.b;
    if (localc != null)
    {
      if (localc == paramc)
      {
        this.b = null;
        return;
      }
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    throw new IllegalStateException("No listener register");
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.a);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.b);
    if ((this.e) || (this.h) || (this.i))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.e);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.h);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.i);
    }
    if ((this.f) || (this.g))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.f);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.g);
    }
  }
  
  public void b()
  {
    this.f = true;
    k();
  }
  
  public void b(D paramD)
  {
    c localc = this.b;
    if (localc != null) {
      localc.a(this, paramD);
    }
  }
  
  public boolean c()
  {
    return l();
  }
  
  public void d()
  {
    this.i = false;
  }
  
  public void e()
  {
    b localb = this.c;
    if (localb != null) {
      localb.a(this);
    }
  }
  
  public void f()
  {
    n();
  }
  
  public Context g()
  {
    return this.d;
  }
  
  public boolean h()
  {
    return this.f;
  }
  
  public boolean i()
  {
    return this.g;
  }
  
  public boolean j()
  {
    return this.e;
  }
  
  protected void k() {}
  
  protected boolean l()
  {
    throw null;
  }
  
  public void m()
  {
    if (this.e) {
      f();
    } else {
      this.h = true;
    }
  }
  
  protected void n() {}
  
  protected void o() {}
  
  protected void p()
  {
    throw null;
  }
  
  protected void q() {}
  
  public void r()
  {
    o();
    this.g = true;
    this.e = false;
    this.f = false;
    this.h = false;
    this.i = false;
  }
  
  public void s()
  {
    if (this.i) {
      m();
    }
  }
  
  public final void t()
  {
    this.e = true;
    this.g = false;
    this.f = false;
    p();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    kd.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void u()
  {
    this.e = false;
    q();
  }
  
  public boolean v()
  {
    boolean bool = this.h;
    this.h = false;
    this.i |= bool;
    return bool;
  }
  
  public final class a
    extends ContentObserver
  {
    public a()
    {
      super();
    }
    
    public boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public void onChange(boolean paramBoolean)
    {
      e.this.m();
    }
  }
  
  public static abstract interface b<D>
  {
    public abstract void a(e<D> parame);
  }
  
  public static abstract interface c<D>
  {
    public abstract void a(e<D> parame, D paramD);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/content/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */