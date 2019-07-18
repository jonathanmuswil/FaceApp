package android.arch.lifecycle;

import c;
import h;
import h.d;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T>
{
  private static final Object a = new Object();
  private final Object b = new Object();
  private h<n<T>, LiveData<T>.a> c = new h();
  private int d = 0;
  private volatile Object e;
  private volatile Object f;
  private int g;
  private boolean h;
  private boolean i;
  private final Runnable j;
  
  public LiveData()
  {
    Object localObject = a;
    this.e = localObject;
    this.f = localObject;
    this.g = -1;
    this.j = new k(this);
  }
  
  private void a(LiveData<T>.a paramLiveData)
  {
    if (!paramLiveData.b) {
      return;
    }
    if (!paramLiveData.b())
    {
      paramLiveData.a(false);
      return;
    }
    int k = paramLiveData.c;
    int m = this.g;
    if (k >= m) {
      return;
    }
    paramLiveData.c = m;
    paramLiveData.a.a(this.e);
  }
  
  private static void a(String paramString)
  {
    if (c.b().a()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cannot invoke ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" on a background");
    localStringBuilder.append(" thread");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  private void b(LiveData<T>.a paramLiveData)
  {
    if (this.h)
    {
      this.i = true;
      return;
    }
    this.h = true;
    LiveData<T>.a localLiveData = paramLiveData;
    do
    {
      this.i = false;
      if (localLiveData != null)
      {
        a(localLiveData);
        paramLiveData = null;
      }
      else
      {
        h.d locald = this.c.n();
        do
        {
          paramLiveData = localLiveData;
          if (!locald.hasNext()) {
            break;
          }
          a((a)((Map.Entry)locald.next()).getValue());
        } while (!this.i);
        paramLiveData = localLiveData;
      }
      localLiveData = paramLiveData;
    } while (this.i);
    this.h = false;
  }
  
  public void a(f paramf, n<T> paramn)
  {
    if (paramf.ka().a() == d.b.a) {
      return;
    }
    LifecycleBoundObserver localLifecycleBoundObserver = new LifecycleBoundObserver(paramf, paramn);
    paramn = (a)this.c.b(paramn, localLifecycleBoundObserver);
    if ((paramn != null) && (!paramn.a(paramf))) {
      throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
    if (paramn != null) {
      return;
    }
    paramf.ka().a(localLifecycleBoundObserver);
  }
  
  public void a(n<T> paramn)
  {
    a("removeObserver");
    paramn = (a)this.c.remove(paramn);
    if (paramn == null) {
      return;
    }
    paramn.a();
    paramn.a(false);
  }
  
  protected void a(T paramT)
  {
    synchronized (this.b)
    {
      int k;
      if (this.f == a) {
        k = 1;
      } else {
        k = 0;
      }
      this.f = paramT;
      if (k == 0) {
        return;
      }
      c.b().b(this.j);
      return;
    }
  }
  
  public T b()
  {
    Object localObject = this.e;
    if (localObject != a) {
      return (T)localObject;
    }
    return null;
  }
  
  protected void b(T paramT)
  {
    a("setValue");
    this.g += 1;
    this.e = paramT;
    b(null);
  }
  
  public boolean c()
  {
    boolean bool;
    if (this.d > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  protected void d() {}
  
  protected void e() {}
  
  class LifecycleBoundObserver
    extends LiveData<T>.a
    implements GenericLifecycleObserver
  {
    final f e;
    
    LifecycleBoundObserver(n<T> paramn)
    {
      super(localn);
      this.e = paramn;
    }
    
    void a()
    {
      this.e.ka().b(this);
    }
    
    public void a(f paramf, d.a parama)
    {
      if (this.e.ka().a() == d.b.a)
      {
        LiveData.this.a(this.a);
        return;
      }
      a(b());
    }
    
    boolean a(f paramf)
    {
      boolean bool;
      if (this.e == paramf) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    boolean b()
    {
      return this.e.ka().a().a(d.b.d);
    }
  }
  
  private abstract class a
  {
    final n<T> a;
    boolean b;
    int c = -1;
    
    a()
    {
      n localn;
      this.a = localn;
    }
    
    void a() {}
    
    void a(boolean paramBoolean)
    {
      if (paramBoolean == this.b) {
        return;
      }
      this.b = paramBoolean;
      int i = LiveData.c(LiveData.this);
      int j = 1;
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      LiveData localLiveData = LiveData.this;
      int k = LiveData.c(localLiveData);
      if (!this.b) {
        j = -1;
      }
      LiveData.a(localLiveData, k + j);
      if ((i != 0) && (this.b)) {
        LiveData.this.d();
      }
      if ((LiveData.c(LiveData.this) == 0) && (!this.b)) {
        LiveData.this.e();
      }
      if (this.b) {
        LiveData.a(LiveData.this, this);
      }
    }
    
    boolean a(f paramf)
    {
      return false;
    }
    
    abstract boolean b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/arch/lifecycle/LiveData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */