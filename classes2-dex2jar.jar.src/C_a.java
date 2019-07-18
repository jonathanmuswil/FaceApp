import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class c_a
{
  private final uZa a;
  private final YZa b;
  private final YYa c;
  private final lZa d;
  private final fab e = new b_a(this);
  private Object f;
  private xZa g;
  private WZa h;
  public XZa i;
  private VZa j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  
  public c_a(uZa paramuZa, YYa paramYYa)
  {
    this.a = paramuZa;
    this.b = JZa.a.a(paramuZa.e());
    this.c = paramYYa;
    this.d = paramuZa.j().a(paramYYa);
    this.e.a(paramuZa.b(), TimeUnit.MILLISECONDS);
  }
  
  private TYa a(pZa parampZa)
  {
    SSLSocketFactory localSSLSocketFactory;
    Object localObject1;
    Object localObject2;
    if (parampZa.h())
    {
      localSSLSocketFactory = this.a.S();
      localObject1 = this.a.n();
      localObject2 = this.a.c();
    }
    else
    {
      localSSLSocketFactory = null;
      localObject1 = localSSLSocketFactory;
      localObject2 = localObject1;
    }
    return new TYa(parampZa.g(), parampZa.k(), this.a.i(), this.a.R(), localSSLSocketFactory, (HostnameVerifier)localObject1, (_Ya)localObject2, this.a.u(), this.a.t(), this.a.s(), this.a.f(), this.a.v());
  }
  
  private IOException a(IOException paramIOException, boolean paramBoolean)
  {
    YZa localYZa = this.b;
    if (paramBoolean) {}
    try
    {
      if (this.j != null)
      {
        paramIOException = new java/lang/IllegalStateException;
        paramIOException.<init>("cannot release connection while it is in use");
        throw paramIOException;
      }
      XZa localXZa = this.i;
      if ((this.i != null) && (this.j == null) && ((paramBoolean) || (this.o))) {
        localObject = g();
      } else {
        localObject = null;
      }
      if (this.i != null) {
        localXZa = null;
      }
      paramBoolean = this.o;
      int i1 = 1;
      int i2;
      if ((paramBoolean) && (this.j == null)) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      LZa.a((Socket)localObject);
      if (localXZa != null) {
        this.d.b(this.c, localXZa);
      }
      Object localObject = paramIOException;
      if (i2 != 0)
      {
        if (paramIOException != null) {
          i2 = i1;
        } else {
          i2 = 0;
        }
        localObject = b(paramIOException);
        if (i2 != 0) {
          this.d.a(this.c, (IOException)localObject);
        } else {
          this.d.a(this.c);
        }
      }
      return (IOException)localObject;
    }
    finally {}
  }
  
  private IOException b(IOException paramIOException)
  {
    if (this.n) {
      return paramIOException;
    }
    if (!this.e.i()) {
      return paramIOException;
    }
    InterruptedIOException localInterruptedIOException = new InterruptedIOException("timeout");
    if (paramIOException != null) {
      localInterruptedIOException.initCause(paramIOException);
    }
    return localInterruptedIOException;
  }
  
  VZa a(qZa.a arg1, boolean paramBoolean)
  {
    synchronized (this.b)
    {
      if (!this.o)
      {
        if (this.j == null)
        {
          ??? = this.h.a(this.a, ???, paramBoolean);
          ??? = new VZa(this, this.c, this.d, this.h, ???);
          synchronized (this.b)
          {
            this.j = ((VZa)???);
            this.k = false;
            this.l = false;
            return (VZa)???;
          }
        }
        ??? = new java/lang/IllegalStateException;
        ???.<init>("cannot make a new request because the previous response is still open: please call response.close()");
        throw ???;
      }
      ??? = new java/lang/IllegalStateException;
      ???.<init>("released");
      throw ???;
    }
  }
  
  IOException a(VZa paramVZa, boolean paramBoolean1, boolean paramBoolean2, IOException paramIOException)
  {
    synchronized (this.b)
    {
      if (paramVZa != this.j) {
        return paramIOException;
      }
      boolean bool1 = true;
      boolean bool2;
      if (paramBoolean1)
      {
        bool2 = this.k ^ true;
        this.k = true;
      }
      else
      {
        bool2 = false;
      }
      boolean bool3 = bool2;
      if (paramBoolean2)
      {
        if (!this.l) {
          bool2 = true;
        }
        this.l = true;
        bool3 = bool2;
      }
      if ((this.k) && (this.l) && (bool3))
      {
        paramVZa = this.j.b();
        paramVZa.m += 1;
        this.j = null;
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
      }
      paramVZa = paramIOException;
      if (bool2) {
        paramVZa = a(paramIOException, false);
      }
      return paramVZa;
    }
  }
  
  public IOException a(IOException paramIOException)
  {
    synchronized (this.b)
    {
      this.o = true;
      return a(paramIOException, false);
    }
  }
  
  public void a()
  {
    this.f = U_a.a().a("response.body().close()");
    this.d.b(this.c);
  }
  
  void a(XZa paramXZa)
  {
    if (this.i == null)
    {
      this.i = paramXZa;
      paramXZa.p.add(new c_a.a(this, this.f));
      return;
    }
    throw new IllegalStateException();
  }
  
  public void a(xZa paramxZa)
  {
    xZa localxZa = this.g;
    if (localxZa != null)
    {
      if ((LZa.a(localxZa.g(), paramxZa.g())) && (this.h.b())) {
        return;
      }
      if (this.j == null)
      {
        if (this.h != null)
        {
          a(null, true);
          this.h = null;
        }
      }
      else {
        throw new IllegalStateException();
      }
    }
    this.g = paramxZa;
    this.h = new WZa(this, this.b, a(paramxZa.g()), this.c, this.d);
  }
  
  public boolean b()
  {
    boolean bool;
    if ((this.h.c()) && (this.h.b())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c()
  {
    synchronized (this.b)
    {
      this.m = true;
      VZa localVZa = this.j;
      XZa localXZa;
      if ((this.h != null) && (this.h.a() != null)) {
        localXZa = this.h.a();
      } else {
        localXZa = this.i;
      }
      if (localVZa != null) {
        localVZa.a();
      } else if (localXZa != null) {
        localXZa.b();
      }
      return;
    }
  }
  
  public void d()
  {
    synchronized (this.b)
    {
      if (!this.o)
      {
        this.j = null;
        return;
      }
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>();
      throw localIllegalStateException;
    }
  }
  
  public boolean e()
  {
    synchronized (this.b)
    {
      boolean bool;
      if (this.j != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public boolean f()
  {
    synchronized (this.b)
    {
      boolean bool = this.m;
      return bool;
    }
  }
  
  Socket g()
  {
    int i1 = 0;
    int i2 = this.i.p.size();
    while (i1 < i2)
    {
      if (((Reference)this.i.p.get(i1)).get() == this) {
        break label54;
      }
      i1++;
    }
    i1 = -1;
    label54:
    if (i1 != -1)
    {
      XZa localXZa = this.i;
      localXZa.p.remove(i1);
      Object localObject1 = null;
      this.i = null;
      Object localObject2 = localObject1;
      if (localXZa.p.isEmpty())
      {
        localXZa.q = System.nanoTime();
        localObject2 = localObject1;
        if (this.b.a(localXZa)) {
          localObject2 = localXZa.g();
        }
      }
      return (Socket)localObject2;
    }
    throw new IllegalStateException();
  }
  
  public void h()
  {
    if (!this.n)
    {
      this.n = true;
      this.e.i();
      return;
    }
    throw new IllegalStateException();
  }
  
  public void i()
  {
    this.e.h();
  }
  
  static final class a
    extends WeakReference<c_a>
  {
    final Object a;
    
    a(c_a paramc_a, Object paramObject)
    {
      super();
      this.a = paramObject;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/c_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */