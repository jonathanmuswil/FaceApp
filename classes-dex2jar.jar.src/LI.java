import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

class li
{
  private final Re a;
  private final Handler b;
  private final List<li.b> c = new ArrayList();
  final Ke d;
  private final eg e;
  private boolean f;
  private boolean g;
  private boolean h;
  private Ie<Bitmap> i;
  private li.a j;
  private boolean k;
  private li.a l;
  private Bitmap m;
  private m<Bitmap> n;
  private li.a o;
  private li.d p;
  
  li(Ae paramAe, Re paramRe, int paramInt1, int paramInt2, m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this(paramAe.c(), Ae.b(paramAe.e()), paramRe, null, a(Ae.b(paramAe.e()), paramInt1, paramInt2), paramm, paramBitmap);
  }
  
  li(eg parameg, Ke paramKe, Re paramRe, Handler paramHandler, Ie<Bitmap> paramIe, m<Bitmap> paramm, Bitmap paramBitmap)
  {
    this.d = paramKe;
    paramKe = paramHandler;
    if (paramHandler == null) {
      paramKe = new Handler(Looper.getMainLooper(), new li.c());
    }
    this.e = parameg;
    this.b = paramKe;
    this.i = paramIe;
    this.a = paramRe;
    a(paramm, paramBitmap);
  }
  
  private static Ie<Bitmap> a(Ke paramKe, int paramInt1, int paramInt2)
  {
    return paramKe.a().a(((gj)((gj)gj.b(Hf.b).b(true)).a(true)).a(paramInt1, paramInt2));
  }
  
  private static g j()
  {
    return new Bj(Double.valueOf(Math.random()));
  }
  
  private int k()
  {
    return Pj.a(c().getWidth(), c().getHeight(), c().getConfig());
  }
  
  private void l()
  {
    if ((this.f) && (!this.g))
    {
      if (this.h)
      {
        boolean bool;
        if (this.o == null) {
          bool = true;
        } else {
          bool = false;
        }
        Nj.a(bool, "Pending target must be null when starting from the first frame");
        this.a.d();
        this.h = false;
      }
      li.a locala = this.o;
      if (locala != null)
      {
        this.o = null;
        a(locala);
        return;
      }
      this.g = true;
      int i1 = this.a.c();
      long l1 = SystemClock.uptimeMillis();
      long l2 = i1;
      this.a.advance();
      this.l = new li.a(this.b, this.a.e(), l1 + l2);
      this.i.a(gj.b(j())).a(this.a).a(this.l);
    }
  }
  
  private void m()
  {
    Bitmap localBitmap = this.m;
    if (localBitmap != null)
    {
      this.e.a(localBitmap);
      this.m = null;
    }
  }
  
  private void n()
  {
    if (this.f) {
      return;
    }
    this.f = true;
    this.k = false;
    l();
  }
  
  private void o()
  {
    this.f = false;
  }
  
  void a()
  {
    this.c.clear();
    m();
    o();
    li.a locala = this.j;
    if (locala != null)
    {
      this.d.a(locala);
      this.j = null;
    }
    locala = this.l;
    if (locala != null)
    {
      this.d.a(locala);
      this.l = null;
    }
    locala = this.o;
    if (locala != null)
    {
      this.d.a(locala);
      this.o = null;
    }
    this.a.clear();
    this.k = true;
  }
  
  void a(m<Bitmap> paramm, Bitmap paramBitmap)
  {
    Nj.a(paramm);
    this.n = ((m)paramm);
    Nj.a(paramBitmap);
    this.m = ((Bitmap)paramBitmap);
    this.i = this.i.a(new gj().a(paramm));
  }
  
  void a(li.a parama)
  {
    Object localObject = this.p;
    if (localObject != null) {
      ((li.d)localObject).a();
    }
    this.g = false;
    if (this.k)
    {
      this.b.obtainMessage(2, parama).sendToTarget();
      return;
    }
    if (!this.f)
    {
      this.o = parama;
      return;
    }
    if (parama.b() != null)
    {
      m();
      localObject = this.j;
      this.j = parama;
      for (int i1 = this.c.size() - 1; i1 >= 0; i1--) {
        ((li.b)this.c.get(i1)).a();
      }
      if (localObject != null) {
        this.b.obtainMessage(2, localObject).sendToTarget();
      }
    }
    l();
  }
  
  void a(li.b paramb)
  {
    if (!this.k)
    {
      if (!this.c.contains(paramb))
      {
        boolean bool = this.c.isEmpty();
        this.c.add(paramb);
        if (bool) {
          n();
        }
        return;
      }
      throw new IllegalStateException("Cannot subscribe twice in a row");
    }
    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
  }
  
  ByteBuffer b()
  {
    return this.a.getData().asReadOnlyBuffer();
  }
  
  void b(li.b paramb)
  {
    this.c.remove(paramb);
    if (this.c.isEmpty()) {
      o();
    }
  }
  
  Bitmap c()
  {
    Object localObject = this.j;
    if (localObject != null) {
      localObject = ((li.a)localObject).b();
    } else {
      localObject = this.m;
    }
    return (Bitmap)localObject;
  }
  
  int d()
  {
    li.a locala = this.j;
    int i1;
    if (locala != null) {
      i1 = locala.e;
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  Bitmap e()
  {
    return this.m;
  }
  
  int f()
  {
    return this.a.b();
  }
  
  int g()
  {
    return c().getHeight();
  }
  
  int h()
  {
    return this.a.f() + k();
  }
  
  int i()
  {
    return c().getWidth();
  }
  
  static class a
    extends qj<Bitmap>
  {
    private final Handler d;
    final int e;
    private final long f;
    private Bitmap g;
    
    a(Handler paramHandler, int paramInt, long paramLong)
    {
      this.d = paramHandler;
      this.e = paramInt;
      this.f = paramLong;
    }
    
    public void a(Bitmap paramBitmap, xj<? super Bitmap> paramxj)
    {
      this.g = paramBitmap;
      paramBitmap = this.d.obtainMessage(1, this);
      this.d.sendMessageAtTime(paramBitmap, this.f);
    }
    
    Bitmap b()
    {
      return this.g;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
  }
  
  private class c
    implements Handler.Callback
  {
    c() {}
    
    public boolean handleMessage(Message paramMessage)
    {
      int i = paramMessage.what;
      if (i == 1)
      {
        paramMessage = (li.a)paramMessage.obj;
        li.this.a(paramMessage);
        return true;
      }
      if (i == 2)
      {
        paramMessage = (li.a)paramMessage.obj;
        li.this.d.a(paramMessage);
      }
      return false;
    }
  }
  
  static abstract interface d
  {
    public abstract void a();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */