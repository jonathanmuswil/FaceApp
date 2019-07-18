import java.io.File;
import java.util.Random;

public final class eha
  extends Iha<tia, File>
{
  private final String i;
  private final String j;
  
  public eha(String paramString)
  {
    this.j = paramString;
    paramString = new StringBuilder();
    paramString.append(super.c());
    paramString.append(".OpRetrieveUrl");
    this.i = paramString.toString();
  }
  
  private final QQa<tia> a(tbb<DZa> paramtbb, File paramFile)
  {
    paramtbb = QQa.a(new dha(paramtbb, paramFile));
    oXa.a(paramtbb, "Observable.create { subs…)\n            }\n        }");
    return paramtbb;
  }
  
  protected kRa a()
  {
    Object localObject1 = _ra.h;
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(System.currentTimeMillis());
    ((StringBuilder)localObject2).append(new Random().nextInt(1000));
    localObject2 = ((_ra)localObject1).d(((StringBuilder)localObject2).toString());
    localObject1 = sia.f.a().a(this.j).d(new Yga(this)).c(new Zga(this, (File)localObject2));
    oXa.a(localObject1, "FAServiceFactory.createD…, file)\n                }");
    localObject1 = RPa.a((QQa)localObject1, new Rfa.f[0]).b(EVa.b()).a(new _ga(this, (File)localObject2), new aha(this));
    oXa.a(localObject1, "FAServiceFactory.createD…r(it) }\n                )");
    return (kRa)localObject1;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/eha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */