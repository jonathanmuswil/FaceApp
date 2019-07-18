import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

public final class wCa
{
  private final File a;
  private final tBa<File> b;
  private final Eda c;
  
  public wCa(Eda paramEda)
  {
    this.c = paramEda;
    this.a = uBa.a("effect.jpg");
    this.b = new tBa();
  }
  
  public final oBa a(BPa paramBPa, AtomicInteger paramAtomicInteger, GVa<pBa> paramGVa, oBa paramoBa)
  {
    oXa.b(paramBPa, "tracer");
    oXa.b(paramAtomicInteger, "inputFlag");
    oXa.b(paramGVa, "progress");
    oXa.b(paramoBa, "cfg");
    nBa.a();
    paramBPa.a("effect");
    int i = paramoBa.e();
    boolean bool1 = oya.i(paramoBa.a());
    String str = oya.j(oya.c(paramoBa.a()));
    float f = oya.a(oya.c(paramoBa.a()), pya.g.i);
    paramBPa = paramoBa.f().c();
    boolean bool2 = true;
    paramBPa = HCa.a("effectOp", new Object[] { paramBPa, str, Float.valueOf(f) });
    Object localObject = pBa.f.b;
    boolean bool3;
    if (i != paramAtomicInteger.get()) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    HCa.a(paramGVa, (pBa)localObject, bool3);
    int j;
    if (str.length() == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((j == 0) && (f >= 0.05F))
    {
      localObject = this.b;
      if ((bool1) && (paramoBa.f().b())) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      localObject = (File)((tBa)localObject).a(bool3).a(paramBPa);
      if (localObject != null) {
        return oBa.a(paramoBa, 0, null, _Aa.a.a((File)localObject, paramBPa, true), null, null, null, null, 123, null);
      }
      localObject = pBa.e.b;
      if (i != paramAtomicInteger.get()) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      HCa.a(paramGVa, (pBa)localObject, bool3);
      paramAtomicInteger = paramoBa.f().a();
      paramGVa = new wBa(f, str);
      xBa.a.a(paramAtomicInteger, paramGVa);
      this.b.a(bool1).a(paramBPa, new vCa(this, paramAtomicInteger));
      return oBa.a(paramoBa, 0, null, _Aa.a.a(paramAtomicInteger, paramBPa, false), null, null, null, null, 123, null);
    }
    return paramoBa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/wCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */