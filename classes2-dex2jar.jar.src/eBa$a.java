import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class eBa$a
{
  private final GVa<oBa> a;
  private final GVa<pBa> b;
  private final AtomicInteger c;
  private final EQa<qBa> d;
  
  public eBa$a(String paramString)
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


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/eBa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */