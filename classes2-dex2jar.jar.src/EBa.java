import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

public final class eBa
{
  private final DCa a;
  private final qCa b;
  private final RCa c;
  private final GCa d;
  private final wCa e;
  private final KCa f;
  private final LCa g;
  private final rCa h;
  private final LCa i;
  private final OCa j;
  private final hBa k;
  private final jBa l;
  private final kBa m;
  private final fBa n;
  private final gBa o;
  private final iBa p;
  
  public eBa(Eda paramEda)
  {
    this.a = new DCa(paramEda);
    this.b = new qCa(paramEda);
    this.c = new RCa(paramEda);
    this.d = new GCa(paramEda);
    this.e = new wCa(paramEda);
    this.f = new KCa(paramEda);
    this.g = LCa.a.b(paramEda);
    this.h = new rCa(paramEda);
    this.i = LCa.a.a(paramEda);
    this.j = new OCa(paramEda);
    this.k = new hBa(this, "CONV-MAIN");
    this.l = new jBa(this, "CONV-SAVE");
    this.m = new kBa(this, "CONV-STAT");
    this.n = new fBa(this, "CONV-BACK");
    this.o = new gBa(this, "CONV-CROP");
    this.p = new iBa(this, "CONV-ORIG");
  }
  
  public final eBa.a a()
  {
    return this.n;
  }
  
  public final eBa.a b()
  {
    return this.o;
  }
  
  public final eBa.a c()
  {
    return this.k;
  }
  
  public final eBa.a d()
  {
    return this.p;
  }
  
  public final eBa.a e()
  {
    return this.l;
  }
  
  public final eBa.a f()
  {
    return this.m;
  }
  
  public static abstract class a
  {
    private final GVa<oBa> a;
    private final GVa<pBa> b;
    private final AtomicInteger c;
    private final EQa<qBa> d;
    
    public a(String paramString)
    {
      GVa localGVa = GVa.t();
      oXa.a(localGVa, "PublishSubject.create<ProcessingConfig>()");
      this.a = localGVa;
      localGVa = GVa.t();
      oXa.a(localGVa, "PublishSubject.create<ProcessingProgress>()");
      this.b = localGVa;
      this.c = new AtomicInteger(0);
      paramString = this.a.a(wQa.e).a(nBa.c(), false, 1).c(new dBa(this, paramString));
      oXa.a(paramString, "inputSub\n            .to…ilure(ex) }\n            }");
      this.d = paramString;
    }
    
    public abstract Object a(BPa paramBPa, oBa paramoBa);
    
    public final void a()
    {
      this.c.incrementAndGet();
    }
    
    public final void a(Bundle paramBundle)
    {
      oXa.b(paramBundle, "config");
      this.a.a(new oBa(this.c.get(), oya.b(paramBundle), null, null, null, null, null, 124, null));
    }
    
    protected final AtomicInteger b()
    {
      return this.c;
    }
    
    protected final GVa<pBa> c()
    {
      return this.b;
    }
    
    public final GVa<pBa> d()
    {
      return this.b;
    }
    
    public final QQa<qBa> e()
    {
      QQa localQQa = this.d.h();
      oXa.a(localQQa, "outputSub.toObservable()");
      return localQQa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */