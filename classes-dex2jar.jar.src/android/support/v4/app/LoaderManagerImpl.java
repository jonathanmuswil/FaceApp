package android.support.v4.app;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.f;
import android.arch.lifecycle.m;
import android.arch.lifecycle.n;
import android.arch.lifecycle.q;
import android.arch.lifecycle.r;
import android.arch.lifecycle.r.a;
import android.arch.lifecycle.s;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.e;
import android.support.v4.content.e.c;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import kd;
import vd;

class LoaderManagerImpl
  extends Y
{
  static boolean a = false;
  private final f b;
  private final LoaderViewModel c;
  
  LoaderManagerImpl(f paramf, s params)
  {
    this.b = paramf;
    this.c = LoaderViewModel.a(params);
  }
  
  private <D> e<D> a(int paramInt, Bundle paramBundle, Y.a<D> parama, e<D> parame)
  {
    try
    {
      this.c.e();
      e locale = parama.onCreateLoader(paramInt, paramBundle);
      if (locale != null)
      {
        if ((locale.getClass().isMemberClass()) && (!Modifier.isStatic(locale.getClass().getModifiers())))
        {
          parama = new java/lang/IllegalArgumentException;
          paramBundle = new java/lang/StringBuilder;
          paramBundle.<init>();
          paramBundle.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
          paramBundle.append(locale);
          parama.<init>(paramBundle.toString());
          throw parama;
        }
        a locala = new android/support/v4/app/LoaderManagerImpl$a;
        locala.<init>(paramInt, paramBundle, locale, parame);
        if (a)
        {
          paramBundle = new java/lang/StringBuilder;
          paramBundle.<init>();
          paramBundle.append("  Created new loader ");
          paramBundle.append(locala);
          Log.v("LoaderManager", paramBundle.toString());
        }
        this.c.a(paramInt, locala);
        return locala.a(this.b, parama);
      }
      paramBundle = new java/lang/IllegalArgumentException;
      paramBundle.<init>("Object returned from onCreateLoader must not be null");
      throw paramBundle;
    }
    finally
    {
      this.c.b();
    }
  }
  
  public <D> e<D> a(int paramInt, Bundle paramBundle, Y.a<D> parama)
  {
    if (!this.c.c())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        a locala = this.c.a(paramInt);
        if (a)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("initLoader in ");
          localStringBuilder.append(this);
          localStringBuilder.append(": args=");
          localStringBuilder.append(paramBundle);
          Log.v("LoaderManager", localStringBuilder.toString());
        }
        if (locala == null) {
          return a(paramInt, paramBundle, parama, null);
        }
        if (a)
        {
          paramBundle = new StringBuilder();
          paramBundle.append("  Re-using existing loader ");
          paramBundle.append(locala);
          Log.v("LoaderManager", paramBundle.toString());
        }
        return locala.a(this.b, parama);
      }
      throw new IllegalStateException("initLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public void a()
  {
    this.c.d();
  }
  
  public void a(int paramInt)
  {
    if (!this.c.c())
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        if (a)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("destroyLoader in ");
          ((StringBuilder)localObject).append(this);
          ((StringBuilder)localObject).append(" of ");
          ((StringBuilder)localObject).append(paramInt);
          Log.v("LoaderManager", ((StringBuilder)localObject).toString());
        }
        Object localObject = this.c.a(paramInt);
        if (localObject != null)
        {
          ((a)localObject).a(true);
          this.c.b(paramInt);
        }
        return;
      }
      throw new IllegalStateException("destroyLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    this.c.a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    kd.a(this.b, localStringBuilder);
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  static class LoaderViewModel
    extends q
  {
    private static final r.a a = new Z();
    private vd<LoaderManagerImpl.a> b = new vd();
    private boolean c = false;
    
    static LoaderViewModel a(s params)
    {
      return (LoaderViewModel)new r(params, a).a(LoaderViewModel.class);
    }
    
    <D> LoaderManagerImpl.a<D> a(int paramInt)
    {
      return (LoaderManagerImpl.a)this.b.b(paramInt);
    }
    
    protected void a()
    {
      super.a();
      int i = this.b.b();
      for (int j = 0; j < i; j++) {
        ((LoaderManagerImpl.a)this.b.f(j)).a(true);
      }
      this.b.a();
    }
    
    void a(int paramInt, LoaderManagerImpl.a parama)
    {
      this.b.c(paramInt, parama);
    }
    
    public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      if (this.b.b() > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Loaders:");
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("    ");
        localObject = ((StringBuilder)localObject).toString();
        for (int i = 0; i < this.b.b(); i++)
        {
          LoaderManagerImpl.a locala = (LoaderManagerImpl.a)this.b.f(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(this.b.d(i));
          paramPrintWriter.print(": ");
          paramPrintWriter.println(locala.toString());
          locala.a((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
        }
      }
    }
    
    void b()
    {
      this.c = false;
    }
    
    void b(int paramInt)
    {
      this.b.e(paramInt);
    }
    
    boolean c()
    {
      return this.c;
    }
    
    void d()
    {
      int i = this.b.b();
      for (int j = 0; j < i; j++) {
        ((LoaderManagerImpl.a)this.b.f(j)).g();
      }
    }
    
    void e()
    {
      this.c = true;
    }
  }
  
  public static class a<D>
    extends m<D>
    implements e.c<D>
  {
    private final int k;
    private final Bundle l;
    private final e<D> m;
    private f n;
    private LoaderManagerImpl.b<D> o;
    private e<D> p;
    
    a(int paramInt, Bundle paramBundle, e<D> parame1, e<D> parame2)
    {
      this.k = paramInt;
      this.l = paramBundle;
      this.m = parame1;
      this.p = parame2;
      this.m.a(paramInt, this);
    }
    
    e<D> a(f paramf, Y.a<D> parama)
    {
      parama = new LoaderManagerImpl.b(this.m, parama);
      a(paramf, parama);
      LoaderManagerImpl.b localb = this.o;
      if (localb != null) {
        a(localb);
      }
      this.n = paramf;
      this.o = parama;
      return this.m;
    }
    
    e<D> a(boolean paramBoolean)
    {
      if (LoaderManagerImpl.a)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("  Destroying: ");
        ((StringBuilder)localObject).append(this);
        Log.v("LoaderManager", ((StringBuilder)localObject).toString());
      }
      this.m.c();
      this.m.b();
      Object localObject = this.o;
      if (localObject != null)
      {
        a((n)localObject);
        if (paramBoolean) {
          ((LoaderManagerImpl.b)localObject).b();
        }
      }
      this.m.a(this);
      if (((localObject != null) && (!((LoaderManagerImpl.b)localObject).a())) || (paramBoolean))
      {
        this.m.r();
        return this.p;
      }
      return this.m;
    }
    
    public void a(n<? super D> paramn)
    {
      super.a(paramn);
      this.n = null;
      this.o = null;
    }
    
    public void a(e<D> parame, D paramD)
    {
      if (LoaderManagerImpl.a)
      {
        parame = new StringBuilder();
        parame.append("onLoadComplete: ");
        parame.append(this);
        Log.v("LoaderManager", parame.toString());
      }
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        b(paramD);
      }
      else
      {
        if (LoaderManagerImpl.a) {
          Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
        }
        a(paramD);
      }
    }
    
    public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mId=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" mArgs=");
      paramPrintWriter.println(this.l);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mLoader=");
      paramPrintWriter.println(this.m);
      e locale = this.m;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append("  ");
      locale.a(localStringBuilder.toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      if (this.o != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mCallbacks=");
        paramPrintWriter.println(this.o);
        paramArrayOfString = this.o;
        paramFileDescriptor = new StringBuilder();
        paramFileDescriptor.append(paramString);
        paramFileDescriptor.append("  ");
        paramArrayOfString.a(paramFileDescriptor.toString(), paramPrintWriter);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mData=");
      paramPrintWriter.println(f().a(b()));
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.println(c());
    }
    
    public void b(D paramD)
    {
      super.b(paramD);
      paramD = this.p;
      if (paramD != null)
      {
        paramD.r();
        this.p = null;
      }
    }
    
    protected void d()
    {
      if (LoaderManagerImpl.a)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  Starting: ");
        localStringBuilder.append(this);
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      this.m.t();
    }
    
    protected void e()
    {
      if (LoaderManagerImpl.a)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  Stopping: ");
        localStringBuilder.append(this);
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      this.m.u();
    }
    
    e<D> f()
    {
      return this.m;
    }
    
    void g()
    {
      f localf = this.n;
      LoaderManagerImpl.b localb = this.o;
      if ((localf != null) && (localb != null))
      {
        super.a(localb);
        a(localf, localb);
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("LoaderInfo{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" #");
      localStringBuilder.append(this.k);
      localStringBuilder.append(" : ");
      kd.a(this.m, localStringBuilder);
      localStringBuilder.append("}}");
      return localStringBuilder.toString();
    }
  }
  
  static class b<D>
    implements n<D>
  {
    private final e<D> a;
    private final Y.a<D> b;
    private boolean c = false;
    
    b(e<D> parame, Y.a<D> parama)
    {
      this.a = parame;
      this.b = parama;
    }
    
    public void a(D paramD)
    {
      if (LoaderManagerImpl.a)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  onLoadFinished in ");
        localStringBuilder.append(this.a);
        localStringBuilder.append(": ");
        localStringBuilder.append(this.a.a(paramD));
        Log.v("LoaderManager", localStringBuilder.toString());
      }
      this.b.a(this.a, paramD);
      this.c = true;
    }
    
    public void a(String paramString, PrintWriter paramPrintWriter)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mDeliveredData=");
      paramPrintWriter.println(this.c);
    }
    
    boolean a()
    {
      return this.c;
    }
    
    void b()
    {
      if (this.c)
      {
        if (LoaderManagerImpl.a)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("  Resetting: ");
          localStringBuilder.append(this.a);
          Log.v("LoaderManager", localStringBuilder.toString());
        }
        this.b.a(this.a);
      }
    }
    
    public String toString()
    {
      return this.b.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/LoaderManagerImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */